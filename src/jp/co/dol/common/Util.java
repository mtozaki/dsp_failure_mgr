package jp.co.dol.common;

import javax.servlet.http.HttpServletRequest;

public class Util {

    public static String getParameter(HttpServletRequest req, String key) {
        
        String value = req.getParameter(key);
        
        return nullToBlank(value);
    }
    
    
    public static String nullToBlank(String value) {
        
        // null�̏ꍇ
        if ( isNull(value) == true ) {
            return "";
        }
        
        return value;
    }
    
    
    public static boolean isNull(String value) {
        
        if ( value == null ) {
            return true;
        }
        return false;
    }
}
