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
    
    // Projectへの多対1の関連 
    private ModelRef<Project> projectRef = new ModelRef<Project>(Project.class);
    
    /**
     * @return the projectRef
     */
    public ModelRef<Project> getProjectRef() {
        return projectRef;
    }
    
    // ～　アクセッサ　～
    
    // 案件No.
    private String pjNo;
    public String getPjNo() { return pjNo; }
    public void setPjNo(String pjNo) { this.pjNo = pjNo; }
    
    // No.
    private String no;
    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }
    
    // 発生日
    private String postDate;
    public String getPostDate() { return postDate; }
    public void setPostDate(String postDate) { this.postDate = postDate; }
    
    // 概要
    private String title;
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    // 対応可否
    private String supportKbn;
    public String getSupportKbn() { return supportKbn; }
    public void setSupportKbn(String supportKbn) { this.supportKbn = supportKbn; }
    
    // 優先度
    private String priorityLv;
    public String getPriorityLv() { return priorityLv; }
    public void setPriorityLv(String priorityLv) { this.priorityLv = priorityLv; }
    
    // 重要度
    private String importantLv;
    public String getImportantLv() { return importantLv; }
    public void setImportantLv(String importantLv) { this.importantLv = importantLv; }
    
    // 対応開始日
    private String startDate;
    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    
    // 対応終了日
    private String endDate;
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    
    // リリース日
    private String releaseDate;
    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    // 指摘担当
    private String discoveryEmp;
    public String getDiscoveryEmp() { return discoveryEmp; }
    public void setDiscoveryEmp(String discoveryEmp) { this.discoveryEmp = discoveryEmp; }
    
    // 対応担当
    private String supportEmp;
    public String getSupportEmp() { return supportEmp; }
    public void setSupportEmp(String supportEmp) { this.supportEmp = supportEmp; }

    // 障害発生箇所
    private String troubleSpots;
    public String getTroubleSpots() { return troubleSpots; }
    public void setTroubleSpots(String troubleSpots){ this.troubleSpots = troubleSpots; }
    
    // 内容
    private String failureBody;
    public String getFailureBody() { return failureBody; }
    public void setFailureBody(String failureBody){ this.failureBody = failureBody; }
    
    // 障害原因
    private String troubleCause;
    public String getTroubleCause() { return troubleCause; }
    public void setTroubleCause(String troubleCause){ this.troubleCause = troubleCause; }
    
    // 障害原因区分
    private String troubleCauseKbn;
    public String getTroubleCauseKbn() { return troubleCauseKbn; }
    public void setTroubleCauseKbn(String troubleCauseKbn){ this.troubleCauseKbn = troubleCauseKbn; }

    // 修正内容
    private String repairBody;
    public String getRepairBody() { return repairBody; }
    public void setRepairBody(String repairBody){ this.repairBody = repairBody; }

    // 対応結果
    private String results;
    public String getResults() { return results; }
    public void setResults(String results){ this.results = results; }
    
    // 修正資産
    private String repairSrc;
    public String getRepairSrc() { return repairSrc; }
    public void setRepairSrc(String repairSrc){ this.repairSrc = repairSrc; }
    
    // 備考
    private String remarks;
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks){ this.remarks = remarks; }
    
    // ブラウザ
    private String browser;
    public String getBrowser() { return browser; }
    public void setBrowser(String browser){ this.browser = browser; }
}
