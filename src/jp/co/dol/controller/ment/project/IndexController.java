package jp.co.dol.controller.ment.project;

import java.util.List;

import jp.co.dol.controller.BaseController;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Navigation;

public class IndexController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        
        ProjectService projectService = new ProjectService();
        List<Project> projectList = projectService.getProjectAll();
        requestScope("projectList", projectList);
        
        return forward("index.jsp");
    }
}
