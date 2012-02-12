package jp.co.dol.model.contents;

import java.io.Serializable;

import jp.co.dol.meta.contents.FailureMeta;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Project implements Serializable {

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
        Project other = (Project) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
    
    // Failure(障害内容)への1対多の関連 
    @Attribute(persistent=false)
    private InverseModelListRef<Failure, Project> failureRef =
        new InverseModelListRef<Failure, Project>(Failure.class, FailureMeta.get().projectRef, this);
    
    /**
     * @return the failureRef
     */
    public InverseModelListRef<Failure, Project> getFailureRef() {
        return failureRef;
    }
    
    // ～　アクセッサ　～
    // プロジェクト番号
    private String pjNo;
    public String getPjNo() { return pjNo; }
    public void setPjNo(String pjNo) { this.pjNo = pjNo; }

    // プロジェクト名
    private String pjName;
    public String getPjName() { return pjName; }
    public void setPjName(String pjName) { this.pjName = pjName; }
}
