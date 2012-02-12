package jp.co.dol.controller.failure;

import jp.co.dol.service.contents.FailureService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DelController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            FailureService failureService = new FailureService();
            failureService.deleteFailure(key);
            
            sessionScope("err", "�폜���܂����B");
            return forward("/failure");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/failure");
        }
    }
}
