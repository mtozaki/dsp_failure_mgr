package jp.co.dol.meta.contents;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-02-09 09:28:58")
/** */
public final class ProjectMeta extends org.slim3.datastore.ModelMeta<jp.co.dol.model.contents.Project> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Project, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Project, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Project> pjName = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Project>(this, "pjName", "pjName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Project> pjNo = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Project>(this, "pjNo", "pjNo");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Project, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Project, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProjectMeta slim3_singleton = new ProjectMeta();

    /**
     * @return the singleton
     */
    public static ProjectMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProjectMeta() {
        super("Project", jp.co.dol.model.contents.Project.class);
    }

    @Override
    public jp.co.dol.model.contents.Project entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.co.dol.model.contents.Project model = new jp.co.dol.model.contents.Project();
        model.setKey(entity.getKey());
        model.setPjName((java.lang.String) entity.getProperty("pjName"));
        model.setPjNo((java.lang.String) entity.getProperty("pjNo"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("pjName", m.getPjName());
        entity.setProperty("pjNo", m.getPjNo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
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
        jp.co.dol.model.contents.Project m = (jp.co.dol.model.contents.Project) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getFailureRef() != null){
            writer.setNextPropertyName("failureRef");
            encoder0.encode(writer, m.getFailureRef());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPjName() != null){
            writer.setNextPropertyName("pjName");
            encoder0.encode(writer, m.getPjName());
        }
        if(m.getPjNo() != null){
            writer.setNextPropertyName("pjNo");
            encoder0.encode(writer, m.getPjNo());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.co.dol.model.contents.Project jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.co.dol.model.contents.Project m = new jp.co.dol.model.contents.Project();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("failureRef");
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("pjName");
        m.setPjName(decoder0.decode(reader, m.getPjName()));
        reader = rootReader.newObjectReader("pjNo");
        m.setPjNo(decoder0.decode(reader, m.getPjNo()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}