package jp.co.dol.service.contents;

import java.util.ArrayList;
import java.util.List;

import jp.co.dol.meta.contents.EmpMeta;
import jp.co.dol.model.contents.Emp;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;


public class EmpService {
    
    public List<Emp> getEmpAll() {
        EmpMeta m = EmpMeta.get();
        return Datastore.query(m).sort(m.empNo.asc).asList();
    }
    
    public Emp getEmp(Key empKey) {
        return Datastore.getOrNull(EmpMeta.get(), empKey);
    }
    
    public void insertEmp(Emp emp) throws Exception {
        
        emp.setKey(Datastore.allocateId(EmpMeta.get()));
        
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.put(tx, emp);
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
    
    public void updateEmp(Emp emp) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.get(tx, EmpMeta.get(), emp.getKey(), emp.getVersion());
            Datastore.put(tx, emp);
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

    public void deleteEmp(Key empKey) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            List<Key> deleteKeys = new ArrayList<Key>();
            deleteKeys.add(empKey);
            
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
