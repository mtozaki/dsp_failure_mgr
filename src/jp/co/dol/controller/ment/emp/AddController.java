package jp.co.dol.controller.ment.emp;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Emp;
import jp.co.dol.service.contents.EmpService;

import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;
import org.slim3.util.BeanUtil;

public class AddController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        if (!isPost() || !validate()) {
            return forward("add.jsp");
        }
        
        Emp emp = new Emp();
        
        BeanUtil.copy(request, emp);
        
        EmpService empService = new EmpService();
        empService.insertEmp(emp);
        
        sessionScope("err", "ìoò^ÇµÇ‹ÇµÇΩÅB");
        return forward("/ment/emp");
    }
    
    private boolean validate() {
        Validators v = new Validators(request);
        v.add("empNo", v.required(), v.maxlength(6));
        v.add("empName", v.required(), v.maxlength(10));
        
        return v.validate();
    }
}
