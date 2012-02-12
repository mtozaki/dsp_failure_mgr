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
            // 指定されたkeyから記事を取得
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
            
            sessionScope("err", "更新しました。");
            return forward("/ment/project");
            
        } catch (Exception e) {
            // keyが不正な場合
            sessionScope("err", e.getMessage());
            return forward("/ment/project");
        }
    }
}
