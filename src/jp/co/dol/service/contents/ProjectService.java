package jp.co.dol.service.contents;

import java.util.ArrayList;
import java.util.List;

import jp.co.dol.meta.contents.ProjectMeta;
import jp.co.dol.model.contents.Failure;
import jp.co.dol.model.contents.Project;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;


public class ProjectService {

    public List<Project> getProjectAll() {
        ProjectMeta m = ProjectMeta.get();
        return Datastore.query(m).sort(m.pjNo.asc).asList();
    }
    
    public Project getProject(Key projectKey) {
        return Datastore.getOrNull(ProjectMeta.get(), projectKey);
    }
    
    public void insertProject(Project project) throws Exception {
        
        project.setKey(Datastore.allocateId(ProjectMeta.get()));
        
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.put(tx, project);
        //  Datastore.commit(tx);
            tx.commit();
        }
        catch (Exception e) {
            if (tx.isActive()) {
            //  Datastore.rollback(tx);
                tx.rollback();
            }
            throw e;
        }
    }
    
    public void updateProject(Project project) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.get(tx, ProjectMeta.get(), project.getKey(), project.getVersion());
            Datastore.put(tx, project);
        //  Datastore.commit(tx);
            tx.commit();
        }
        catch (Exception e) {
            if (tx.isActive()) {
            //  Datastore.rollback(tx);
                tx.rollback();
            }
            throw e;
        }
    }

    public void deleteProject(Key projectKey) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            List<Key> deleteKeys = new ArrayList<Key>();
            deleteKeys.add(projectKey);
            
            Project project = Datastore.get(tx, ProjectMeta.get(), projectKey);
            List<Failure> failureList = project.getFailureRef().getModelList();
            
            for (Failure failure : failureList) {
                deleteKeys.add(failure.getKey());
            }
            Datastore.delete(tx, deleteKeys);
        //  Datastore.commit(tx);
            tx.commit();
        }
        catch (Exception e) {
            if (tx.isActive()) {
            //  Datastore.rollback(tx);
                tx.rollback();
            }
            throw e;
        }
    }
}
