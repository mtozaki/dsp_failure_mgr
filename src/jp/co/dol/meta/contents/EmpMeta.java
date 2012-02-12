package jp.co.dol.meta.contents;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-02-09 09:28:58")
/** */
public final class EmpMeta extends org.slim3.datastore.ModelMeta<jp.co.dol.model.contents.Emp> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Emp> empName = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Emp>(this, "empName", "empName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Emp> empNo = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Emp>(this, "empNo", "empNo");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Emp, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Emp, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Emp, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Emp, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final EmpMeta slim3_singleton = new EmpMeta();

    /**
     * @return the singleton
     */
    public static EmpMeta get() {
       return slim3_singleton;
    }

    /** */
    public EmpMeta() {
        super("Emp", jp.co.dol.model.contents.Emp.class);
    }

    @Override
    public jp.co.dol.model.contents.Emp entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.co.dol.model.contents.Emp model = new jp.co.dol.model.contents.Emp();
        model.setEmpName((java.lang.String) entity.getProperty("empName"));
        model.setEmpNo((java.lang.String) entity.getProperty("empNo"));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("empName", m.getEmpName());
        entity.setProperty("empNo", m.getEmpNo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.co.dol.model.contents.Emp m = (jp.co.dol.model.contents.Emp) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEmpName() != null){
            writer.setNextPropertyName("empName");
            encoder0.encode(writer, m.getEmpName());
        }
        if(m.getEmpNo() != null){
            writer.setNextPropertyName("empNo");
            encoder0.encode(writer, m.getEmpNo());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.co.dol.model.contents.Emp jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.co.dol.model.contents.Emp m = new jp.co.dol.model.contents.Emp();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("empName");
        m.setEmpName(decoder0.decode(reader, m.getEmpName()));
        reader = rootReader.newObjectReader("empNo");
        m.setEmpNo(decoder0.decode(reader, m.getEmpNo()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}