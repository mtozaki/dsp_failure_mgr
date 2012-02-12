package jp.co.dol.service.contents;

import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import jp.co.dol.meta.contents.FailureMeta;
import jp.co.dol.model.contents.Failure;


public class FailureService {

    public List<Failure> getFailureLimit(int from, int toLong) {
        
        ArrayList<Failure> newList = new ArrayList<Failure>(toLong);
        
        List<Failure> list = this.getFailureAll();
        int size = list.size();
        
        for (int i=0; i<size; i++) {
            
            if ( from <= (i+1) && (i+1) <= (from + toLong) ) {
                newList.add(list.get(i));
            }
        }
        
        return newList;
    }
    
    public List<Failure> getFailureAll() {
        FailureMeta m = FailureMeta.get();
        return Datastore.query(m).sort(m.pjNo.desc).asList();
    }
    
    public Failure getFailure(Key failureKey) {
        return Datastore.getOrNull(FailureMeta.get(), failureKey);
    }
    
    public void insertFailure(Failure failure) throws Exception {
        
        failure.setKey(Datastore.allocateId(FailureMeta.get()));
        
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.put(tx, failure);
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
    
    public void updateFailure(Failure failure) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.get(tx, FailureMeta.get(), failure.getKey(), failure.getVersion());
            Datastore.put(tx, failure);
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

    public void deleteFailure(Key failureKey) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            List<Key> deleteKeys = new ArrayList<Key>();
            deleteKeys.add(failureKey);
            
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
