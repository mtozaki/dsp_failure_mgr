package jp.co.dol.controller.ment.emp;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Emp;
import jp.co.dol.service.contents.EmpService;

import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;

public class UpdController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            EmpService empService = new EmpService();
            Emp emp = empService.getEmp(key);
            
            if (!isPost()) {
                requestScope("empNo", emp.getEmpNo());
                requestScope("empName", emp.getEmpName());
                
                return forward("upd.jsp");
            }
            
            BeanUtil.copy(request, emp);
            empService.updateEmp(emp);
            
            sessionScope("err", "�X�V���܂����B");
            return forward("/ment/emp");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/ment/emp");
        }
    }
}
