package jp.co.dol.controller.ment.emp;

import jp.co.dol.controller.BaseController;
import jp.co.dol.service.contents.EmpService;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DelController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            EmpService empService = new EmpService();
            empService.deleteEmp(key);
            
            sessionScope("err", "�폜���܂����B");
            return forward("/ment/emp");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/ment/emp");
        }
    }
}
