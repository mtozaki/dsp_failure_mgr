package jp.co.dol.controller;

import javax.servlet.http.HttpSession;

import jp.co.dol.common.ConstMaster;
import jp.co.dol.session.SessionBean;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public abstract class BaseController extends Controller {

    @Override
    public Navigation setUp() {
        
        String ip = this.request.getRemoteAddr();
        String host = this.request.getRemoteHost();
        
        boolean allow = isAllowHost(ip, host);
        
        if ( allow == false ) {
            requestScope("error", "アクセス制限中:" + ip + ":" + host);
            return forward("../error.jsp");
        }
        
        HttpSession session = this.request.getSession(false);
        if ( session == null ) {
            session = this.request.getSession(true);
            session.setAttribute(ConstMaster.SESSION_ID, new SessionBean());
        }
        
        return null;
    }
    
    protected boolean isAllowHost(String chkIp, String chkHostName) {
        
        String[] allow = ConstMaster.AllowHost;
        
        for ( int i=0; i<allow.length; i++ ) {
            String allowIp = allow[i].replace("*", "");
            
            if ( chkIp.indexOf(allowIp) != -1 ) {
                return true;
            }
        }
        
        return false;
    }
}