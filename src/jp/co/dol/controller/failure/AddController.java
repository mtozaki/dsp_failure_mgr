package jp.co.dol.controller.failure;

import java.util.List;

import jp.co.dol.common.ConstMaster;
import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Emp;
import jp.co.dol.model.contents.Failure;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.EmpService;
import jp.co.dol.service.contents.FailureService;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;
import org.slim3.util.BeanUtil;

public class AddController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        if (!isPost() || !validate()) {
            
            // 対応可否リスト
            requestScope("SupportKbnList", ConstMaster.SupportKbn);
            
            // 優先順位リスト
            requestScope("PriorityLvList", ConstMaster.PriorityLv);
            
            // 重要度リスト
            requestScope("ImportantLvList", ConstMaster.ImportantLv);
            
            // ブラウザーリスト
            requestScope("BrowserList", ConstMaster.Browser);
            
            // 社員リスト
            EmpService empService = new EmpService();
            List<Emp> empList = empService.getEmpAll();
            requestScope("empList", empList);
            
            // 案件リスト
            ProjectService projectService = new ProjectService();
            List<Project> projectList = projectService.getProjectAll();
            requestScope("projectList", projectList);
            
            return forward("add.jsp");
        }
        
        Failure failure = new Failure();
        
        BeanUtil.copy(request, failure);
        
        FailureService failureService = new FailureService();
        failureService.insertFailure(failure);
        
        return forward("/failure");
    }
    
    private boolean validate() {
        Validators v = new Validators(request);
        v.add("no", v.required(), v.maxlength(10));
    //    v.add("title", v.required(), v.maxlength(50));
        
        return v.validate();
    }
}
