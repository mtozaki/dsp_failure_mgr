package jp.co.dol.common;

import jp.co.dol.model.contents.Emp;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.EmpService;
import jp.co.dol.service.contents.ProjectService;

import com.google.appengine.api.datastore.Key;

public class ConstDB {

    public static Project getProject(Key key) {
        
        ProjectService projectService = new ProjectService();
        Project project = projectService.getProject(key);
        
        return project;
    }
    
    public static String getProjectName(Key key) {
        
        Project project = getProject(key);
        
        return project.getPjName();
    }
    
    public static Emp getEmp(Key key) {
        
        EmpService empService = new EmpService();
        Emp emp = empService.getEmp(key);
        
        return emp;
    }
    
    public static String getEmpName(Key key) {
        
        Emp emp = getEmp(key);
        
        return emp.getEmpName();
    }
}
