package jp.co.dol.controller.failure;

import java.util.List;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Failure;
import jp.co.dol.service.contents.FailureService;

import org.slim3.controller.Navigation;

public class IndexController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        FailureService failureService = new FailureService();
        List<Failure> failureList = failureService.getFailureLimit(1,10);
        requestScope("failureList", failureList);
        
        return forward("index.jsp");
    }
}
