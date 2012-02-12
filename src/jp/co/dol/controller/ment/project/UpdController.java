package jp.co.dol.controller.ment.project;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;

public class UpdController extends BaseController {

    @Override
    public Navigation run() throws Exception {

        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            ProjectService projectService = new ProjectService();
            Project project = projectService.getProject(key);
            
            if (!isPost()) {
                requestScope("pjNo", project.getPjNo());
                requestScope("pjName", project.getPjName());
                
                return forward("upd.jsp");
            }
            
            BeanUtil.copy(request, project);
            projectService.updateProject(project);
            
            sessionScope("err", "�X�V���܂����B");
            return forward("/ment/project");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/ment/project");
        }
    }
}
