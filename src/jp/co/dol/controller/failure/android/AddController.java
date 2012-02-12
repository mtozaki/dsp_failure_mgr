package jp.co.dol.controller.failure.android;

import java.io.PrintWriter;

import jp.co.dol.model.contents.Failure;
import jp.co.dol.service.contents.FailureService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;
import org.slim3.util.BeanUtil;

public class AddController extends Controller {

    @Override
    protected Navigation run() throws Exception {
        
        String res = "“o˜^‚Å‚«‚Ü‚¹‚ñ‚Å‚µ‚½";
        
        if (!isPost() || !validate()) {
            writeMsg(res);
            return null;
        }
        
        // “o˜^
        Failure failure = new Failure();
        BeanUtil.copy(request, failure);
        FailureService failureService = new FailureService();
        failureService.insertFailure(failure);
        
        res = "“o˜^‚µ‚Ü‚µ‚½";
        writeMsg(res);
        
        return null;
    }
    
    private void writeMsg(String msg) throws Exception {
        
        // –ß‚è
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        
        PrintWriter out = response.getWriter();
        out.print(msg);
        out.flush();
    }
    
    private boolean validate() {
        Validators v = new Validators(request);
        v.add("no", v.required(), v.maxlength(10));
    //    v.add("title", v.required(), v.maxlength(50));
        
        return v.validate();
    }
}
