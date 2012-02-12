package jp.co.dol.model.contents;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

@Model(schemaVersion = 1)
public class Failure implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Failure other = (Failure) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
    
    // Project�ւ̑���1�̊֘A 
    private ModelRef<Project> projectRef = new ModelRef<Project>(Project.class);
    
    /**
     * @return the projectRef
     */
    public ModelRef<Project> getProjectRef() {
        return projectRef;
    }
    
    // �`�@�A�N�Z�b�T�@�`
    
    // �Č�No.
    private String pjNo;
    public String getPjNo() { return pjNo; }
    public void setPjNo(String pjNo) { this.pjNo = pjNo; }
    
    // No.
    private String no;
    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }
    
    // ������
    private String postDate;
    public String getPostDate() { return postDate; }
    public void setPostDate(String postDate) { this.postDate = postDate; }
    
    // �T�v
    private String title;
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    // �Ή���
    private String supportKbn;
    public String getSupportKbn() { return supportKbn; }
    public void setSupportKbn(String supportKbn) { this.supportKbn = supportKbn; }
    
    // �D��x
    private String priorityLv;
    public String getPriorityLv() { return priorityLv; }
    public void setPriorityLv(String priorityLv) { this.priorityLv = priorityLv; }
    
    // �d�v�x
    private String importantLv;
    public String getImportantLv() { return importantLv; }
    public void setImportantLv(String importantLv) { this.importantLv = importantLv; }
    
    // �Ή��J�n��
    private String startDate;
    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    
    // �Ή��I����
    private String endDate;
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    
    // �����[�X��
    private String releaseDate;
    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    // �w�E�S��
    private String discoveryEmp;
    public String getDiscoveryEmp() { return discoveryEmp; }
    public void setDiscoveryEmp(String discoveryEmp) { this.discoveryEmp = discoveryEmp; }
    
    // �Ή��S��
    private String supportEmp;
    public String getSupportEmp() { return supportEmp; }
    public void setSupportEmp(String supportEmp) { this.supportEmp = supportEmp; }

    // ��Q�����ӏ�
    private String troubleSpots;
    public String getTroubleSpots() { return troubleSpots; }
    public void setTroubleSpots(String troubleSpots){ this.troubleSpots = troubleSpots; }
    
    // ���e
    private String failureBody;
    public String getFailureBody() { return failureBody; }
    public void setFailureBody(String failureBody){ this.failureBody = failureBody; }
    
    // ��Q����
    private String troubleCause;
    public String getTroubleCause() { return troubleCause; }
    public void setTroubleCause(String troubleCause){ this.troubleCause = troubleCause; }
    
    // ��Q�����敪
    private String troubleCauseKbn;
    public String getTroubleCauseKbn() { return troubleCauseKbn; }
    public void setTroubleCauseKbn(String troubleCauseKbn){ this.troubleCauseKbn = troubleCauseKbn; }

    // �C�����e
    private String repairBody;
    public String getRepairBody() { return repairBody; }
    public void setRepairBody(String repairBody){ this.repairBody = repairBody; }

    // �Ή�����
    private String results;
    public String getResults() { return results; }
    public void setResults(String results){ this.results = results; }
    
    // �C�����Y
    private String repairSrc;
    public String getRepairSrc() { return repairSrc; }
    public void setRepairSrc(String repairSrc){ this.repairSrc = repairSrc; }
    
    // ���l
    private String remarks;
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks){ this.remarks = remarks; }
    
    // �u���E�U
    private String browser;
    public String getBrowser() { return browser; }
    public void setBrowser(String browser){ this.browser = browser; }
}
