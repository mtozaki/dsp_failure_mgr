package jp.co.dol.controller.ment.emp;

import java.util.List;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Emp;
import jp.co.dol.service.contents.EmpService;

import org.slim3.controller.Navigation;

public class IndexController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        EmpService empService = new EmpService();
        List<Emp> empList = empService.getEmpAll();
        requestScope("empList", empList);
        
        return forward("index.jsp");
    }
}
