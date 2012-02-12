package jp.co.dol.controller.ment.project;

import jp.co.dol.controller.BaseController;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DelController extends BaseController {

    @Override
    public Navigation run() throws Exception {

        try {
            // 指定されたkeyから記事を取得
            Key key = asKey("key");
            
            ProjectService projectService = new ProjectService();
            projectService.deleteProject(key);
            
            sessionScope("err", "削除しました。");
            return forward("/ment/project");
            
        } catch (Exception e) {
            // keyが不正な場合
            sessionScope("err", e.getMessage());
            return forward("/ment/emp");
        }
    }
}
