package jp.co.dol.controller.ment.project;

import jp.co.dol.controller.BaseController;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DelController extends BaseController {

    @Override
    public Navigation run() throws Exception {

        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            ProjectService projectService = new ProjectService();
            projectService.deleteProject(key);
            
            sessionScope("err", "�폜���܂����B");
            return forward("/ment/project");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/ment/emp");
        }
    }
}
