package jp.co.dol.controller.failure;

import java.util.List;

import jp.co.dol.common.ConstMaster;
import jp.co.dol.model.contents.Emp;
import jp.co.dol.model.contents.Failure;
import jp.co.dol.model.contents.Project;
import jp.co.dol.service.contents.EmpService;
import jp.co.dol.service.contents.FailureService;
import jp.co.dol.service.contents.ProjectService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;

public class UpdController extends Controller {

    @Override
    public Navigation run() throws Exception {

        try {
            // �w�肳�ꂽkey����L�����擾
            Key key = asKey("key");
            
            FailureService failureService = new FailureService();
            Failure failure = failureService.getFailure(key);
            
            if (!isPost()) {
                // �Ή��ۃ��X�g
                requestScope("SupportKbnList", ConstMaster.SupportKbn);
                
                // �D�揇�ʃ��X�g
                requestScope("PriorityLvList", ConstMaster.PriorityLv);
                
                // �d�v�x���X�g
                requestScope("ImportantLvList", ConstMaster.ImportantLv);
                
                // �u���E�U�[���X�g
                requestScope("BrowserList", ConstMaster.Browser);
                
                // �Ј����X�g
                EmpService empService = new EmpService();
                List<Emp> empList = empService.getEmpAll();
                requestScope("empList", empList);
                
                // �Č����X�g
                ProjectService projectService = new ProjectService();
                List<Project> projectList = projectService.getProjectAll();
                requestScope("projectList", projectList);
                
                // �w�b�_
                requestScope("pjNo", failure.getPjNo());
                requestScope("no", failure.getNo());
                requestScope("postDate", failure.getPostDate());
                requestScope("title", failure.getTitle());
                requestScope("supportKbn", failure.getSupportKbn());
                requestScope("priorityLv", failure.getPriorityLv());
                requestScope("importantLv", failure.getImportantLv());
                requestScope("releaseDate", failure.getReleaseDate());
                requestScope("discoveryEmp", failure.getDiscoveryEmp());
                requestScope("supportEmp", failure.getSupportEmp());
                requestScope("remarks", failure.getRemarks());
                
                // ����
                requestScope("startDate", failure.getStartDate());
                requestScope("endDate", failure.getEndDate());
                requestScope("troubleSpots", failure.getTroubleSpots());
                requestScope("failureBody", failure.getFailureBody());
                requestScope("troubleCause", failure.getTroubleCause());
                requestScope("repairBody", failure.getRepairBody());
                requestScope("results", failure.getResults());
                requestScope("repairSrc", failure.getRepairSrc());
                
                return forward("upd.jsp");
            }
            
            BeanUtil.copy(request, failure);
            failureService.updateFailure(failure);
            
            sessionScope("err", "�X�V���܂����B");
            return forward("/failure");
            
        } catch (Exception e) {
            // key���s���ȏꍇ
            sessionScope("err", e.getMessage());
            return forward("/failure");
        }
    }
}
