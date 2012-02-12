package jp.co.dol.controller.failure;

import jp.co.dol.service.contents.FailureService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DelController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        try {
            // 指定されたkeyから記事を取得
            Key key = asKey("key");
            
            FailureService failureService = new FailureService();
            failureService.deleteFailure(key);
            
            sessionScope("err", "削除しました。");
            return forward("/failure");
            
        } catch (Exception e) {
            // keyが不正な場合
            sessionScope("err", e.getMessage());
            return forward("/failure");
        }
    }
}
