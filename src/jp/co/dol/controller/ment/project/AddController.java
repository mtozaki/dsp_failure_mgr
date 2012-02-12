package jp.co.dol.controller.ment.project;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;
import org.slim3.util.BeanUtil;

public class AddController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        if (!isPost() || !validate()) {
            return forward("add.jsp");
        }
        
        Project project = new Project();
        
        BeanUtil.copy(request, project);
        
        ProjectService projectService = new ProjectService();
        projectService.insertProject(project);
        
        sessionScope("err", "ìoò^ÇµÇ‹ÇµÇΩÅB");
        return forward("/ment/project");
    }
    
    private boolean validate() {
        Validators v = new Validators(request);
        v.add("pjNo", v.required(), v.maxlength(6));
        v.add("pjName", v.required(), v.maxlength(10));
        
        return v.validate();
    }
}
