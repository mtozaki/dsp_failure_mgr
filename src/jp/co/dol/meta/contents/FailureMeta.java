package jp.co.dol.meta.contents;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-02-09 09:28:58")
/** */
public final class FailureMeta extends org.slim3.datastore.ModelMeta<jp.co.dol.model.contents.Failure> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> browser = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "browser", "browser");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> discoveryEmp = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "discoveryEmp", "discoveryEmp");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> endDate = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "endDate", "endDate");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> failureBody = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "failureBody", "failureBody");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> importantLv = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "importantLv", "importantLv");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Failure, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Failure, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> no = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "no", "no");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> pjNo = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "pjNo", "pjNo");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> postDate = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "postDate", "postDate");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> priorityLv = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "priorityLv", "priorityLv");

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.co.dol.model.contents.Failure, org.slim3.datastore.ModelRef<jp.co.dol.model.contents.Project>, jp.co.dol.model.contents.Project> projectRef = new org.slim3.datastore.ModelRefAttributeMeta<jp.co.dol.model.contents.Failure, org.slim3.datastore.ModelRef<jp.co.dol.model.contents.Project>, jp.co.dol.model.contents.Project>(this, "projectRef", "projectRef", org.slim3.datastore.ModelRef.class, jp.co.dol.model.contents.Project.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> releaseDate = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "releaseDate", "releaseDate");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> remarks = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "remarks", "remarks");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> repairBody = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "repairBody", "repairBody");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> repairSrc = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "repairSrc", "repairSrc");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> results = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "results", "results");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> startDate = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "startDate", "startDate");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> supportEmp = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "supportEmp", "supportEmp");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> supportKbn = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "supportKbn", "supportKbn");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> title = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "title", "title");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> troubleCause = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "troubleCause", "troubleCause");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> troubleCauseKbn = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "troubleCauseKbn", "troubleCauseKbn");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure> troubleSpots = new org.slim3.datastore.StringAttributeMeta<jp.co.dol.model.contents.Failure>(this, "troubleSpots", "troubleSpots");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Failure, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.co.dol.model.contents.Failure, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final FailureMeta slim3_singleton = new FailureMeta();

    /**
     * @return the singleton
     */
    public static FailureMeta get() {
       return slim3_singleton;
    }

    /** */
    public FailureMeta() {
        super("Failure", jp.co.dol.model.contents.Failure.class);
    }

    @Override
    public jp.co.dol.model.contents.Failure entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.co.dol.model.contents.Failure model = new jp.co.dol.model.contents.Failure();
        model.setBrowser((java.lang.String) entity.getProperty("browser"));
        model.setDiscoveryEmp((java.lang.String) entity.getProperty("discoveryEmp"));
        model.setEndDate((java.lang.String) entity.getProperty("endDate"));
        model.setFailureBody((java.lang.String) entity.getProperty("failureBody"));
        model.setImportantLv((java.lang.String) entity.getProperty("importantLv"));
        model.setKey(entity.getKey());
        model.setNo((java.lang.String) entity.getProperty("no"));
        model.setPjNo((java.lang.String) entity.getProperty("pjNo"));
        model.setPostDate((java.lang.String) entity.getProperty("postDate"));
        model.setPriorityLv((java.lang.String) entity.getProperty("priorityLv"));
        if (model.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) is null.");
        }
        model.getProjectRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("projectRef"));
        model.setReleaseDate((java.lang.String) entity.getProperty("releaseDate"));
        model.setRemarks((java.lang.String) entity.getProperty("remarks"));
        model.setRepairBody((java.lang.String) entity.getProperty("repairBody"));
        model.setRepairSrc((java.lang.String) entity.getProperty("repairSrc"));
        model.setResults((java.lang.String) entity.getProperty("results"));
        model.setStartDate((java.lang.String) entity.getProperty("startDate"));
        model.setSupportEmp((java.lang.String) entity.getProperty("supportEmp"));
        model.setSupportKbn((java.lang.String) entity.getProperty("supportKbn"));
        model.setTitle((java.lang.String) entity.getProperty("title"));
        model.setTroubleCause((java.lang.String) entity.getProperty("troubleCause"));
        model.setTroubleCauseKbn((java.lang.String) entity.getProperty("troubleCauseKbn"));
        model.setTroubleSpots((java.lang.String) entity.getProperty("troubleSpots"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("browser", m.getBrowser());
        entity.setProperty("discoveryEmp", m.getDiscoveryEmp());
        entity.setProperty("endDate", m.getEndDate());
        entity.setProperty("failureBody", m.getFailureBody());
        entity.setProperty("importantLv", m.getImportantLv());
        entity.setProperty("no", m.getNo());
        entity.setProperty("pjNo", m.getPjNo());
        entity.setProperty("postDate", m.getPostDate());
        entity.setProperty("priorityLv", m.getPriorityLv());
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        entity.setProperty("projectRef", m.getProjectRef().getKey());
        entity.setProperty("releaseDate", m.getReleaseDate());
        entity.setProperty("remarks", m.getRemarks());
        entity.setProperty("repairBody", m.getRepairBody());
        entity.setProperty("repairSrc", m.getRepairSrc());
        entity.setProperty("results", m.getResults());
        entity.setProperty("startDate", m.getStartDate());
        entity.setProperty("supportEmp", m.getSupportEmp());
        entity.setProperty("supportKbn", m.getSupportKbn());
        entity.setProperty("title", m.getTitle());
        entity.setProperty("troubleCause", m.getTroubleCause());
        entity.setProperty("troubleCauseKbn", m.getTroubleCauseKbn());
        entity.setProperty("troubleSpots", m.getTroubleSpots());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        m.getProjectRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
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
        jp.co.dol.model.contents.Failure m = (jp.co.dol.model.contents.Failure) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getBrowser() != null){
            writer.setNextPropertyName("browser");
            encoder0.encode(writer, m.getBrowser());
        }
        if(m.getDiscoveryEmp() != null){
            writer.setNextPropertyName("discoveryEmp");
            encoder0.encode(writer, m.getDiscoveryEmp());
        }
        if(m.getEndDate() != null){
            writer.setNextPropertyName("endDate");
            encoder0.encode(writer, m.getEndDate());
        }
        if(m.getFailureBody() != null){
            writer.setNextPropertyName("failureBody");
            encoder0.encode(writer, m.getFailureBody());
        }
        if(m.getImportantLv() != null){
            writer.setNextPropertyName("importantLv");
            encoder0.encode(writer, m.getImportantLv());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getNo() != null){
            writer.setNextPropertyName("no");
            encoder0.encode(writer, m.getNo());
        }
        if(m.getPjNo() != null){
            writer.setNextPropertyName("pjNo");
            encoder0.encode(writer, m.getPjNo());
        }
        if(m.getPostDate() != null){
            writer.setNextPropertyName("postDate");
            encoder0.encode(writer, m.getPostDate());
        }
        if(m.getPriorityLv() != null){
            writer.setNextPropertyName("priorityLv");
            encoder0.encode(writer, m.getPriorityLv());
        }
        if(m.getProjectRef() != null && m.getProjectRef().getKey() != null){
            writer.setNextPropertyName("projectRef");
            encoder0.encode(writer, m.getProjectRef(), maxDepth, currentDepth);
        }
        if(m.getReleaseDate() != null){
            writer.setNextPropertyName("releaseDate");
            encoder0.encode(writer, m.getReleaseDate());
        }
        if(m.getRemarks() != null){
            writer.setNextPropertyName("remarks");
            encoder0.encode(writer, m.getRemarks());
        }
        if(m.getRepairBody() != null){
            writer.setNextPropertyName("repairBody");
            encoder0.encode(writer, m.getRepairBody());
        }
        if(m.getRepairSrc() != null){
            writer.setNextPropertyName("repairSrc");
            encoder0.encode(writer, m.getRepairSrc());
        }
        if(m.getResults() != null){
            writer.setNextPropertyName("results");
            encoder0.encode(writer, m.getResults());
        }
        if(m.getStartDate() != null){
            writer.setNextPropertyName("startDate");
            encoder0.encode(writer, m.getStartDate());
        }
        if(m.getSupportEmp() != null){
            writer.setNextPropertyName("supportEmp");
            encoder0.encode(writer, m.getSupportEmp());
        }
        if(m.getSupportKbn() != null){
            writer.setNextPropertyName("supportKbn");
            encoder0.encode(writer, m.getSupportKbn());
        }
        if(m.getTitle() != null){
            writer.setNextPropertyName("title");
            encoder0.encode(writer, m.getTitle());
        }
        if(m.getTroubleCause() != null){
            writer.setNextPropertyName("troubleCause");
            encoder0.encode(writer, m.getTroubleCause());
        }
        if(m.getTroubleCauseKbn() != null){
            writer.setNextPropertyName("troubleCauseKbn");
            encoder0.encode(writer, m.getTroubleCauseKbn());
        }
        if(m.getTroubleSpots() != null){
            writer.setNextPropertyName("troubleSpots");
            encoder0.encode(writer, m.getTroubleSpots());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.co.dol.model.contents.Failure jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.co.dol.model.contents.Failure m = new jp.co.dol.model.contents.Failure();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("browser");
        m.setBrowser(decoder0.decode(reader, m.getBrowser()));
        reader = rootReader.newObjectReader("discoveryEmp");
        m.setDiscoveryEmp(decoder0.decode(reader, m.getDiscoveryEmp()));
        reader = rootReader.newObjectReader("endDate");
        m.setEndDate(decoder0.decode(reader, m.getEndDate()));
        reader = rootReader.newObjectReader("failureBody");
        m.setFailureBody(decoder0.decode(reader, m.getFailureBody()));
        reader = rootReader.newObjectReader("importantLv");
        m.setImportantLv(decoder0.decode(reader, m.getImportantLv()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("no");
        m.setNo(decoder0.decode(reader, m.getNo()));
        reader = rootReader.newObjectReader("pjNo");
        m.setPjNo(decoder0.decode(reader, m.getPjNo()));
        reader = rootReader.newObjectReader("postDate");
        m.setPostDate(decoder0.decode(reader, m.getPostDate()));
        reader = rootReader.newObjectReader("priorityLv");
        m.setPriorityLv(decoder0.decode(reader, m.getPriorityLv()));
        reader = rootReader.newObjectReader("projectRef");
        decoder0.decode(reader, m.getProjectRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("releaseDate");
        m.setReleaseDate(decoder0.decode(reader, m.getReleaseDate()));
        reader = rootReader.newObjectReader("remarks");
        m.setRemarks(decoder0.decode(reader, m.getRemarks()));
        reader = rootReader.newObjectReader("repairBody");
        m.setRepairBody(decoder0.decode(reader, m.getRepairBody()));
        reader = rootReader.newObjectReader("repairSrc");
        m.setRepairSrc(decoder0.decode(reader, m.getRepairSrc()));
        reader = rootReader.newObjectReader("results");
        m.setResults(decoder0.decode(reader, m.getResults()));
        reader = rootReader.newObjectReader("startDate");
        m.setStartDate(decoder0.decode(reader, m.getStartDate()));
        reader = rootReader.newObjectReader("supportEmp");
        m.setSupportEmp(decoder0.decode(reader, m.getSupportEmp()));
        reader = rootReader.newObjectReader("supportKbn");
        m.setSupportKbn(decoder0.decode(reader, m.getSupportKbn()));
        reader = rootReader.newObjectReader("title");
        m.setTitle(decoder0.decode(reader, m.getTitle()));
        reader = rootReader.newObjectReader("troubleCause");
        m.setTroubleCause(decoder0.decode(reader, m.getTroubleCause()));
        reader = rootReader.newObjectReader("troubleCauseKbn");
        m.setTroubleCauseKbn(decoder0.decode(reader, m.getTroubleCauseKbn()));
        reader = rootReader.newObjectReader("troubleSpots");
        m.setTroubleSpots(decoder0.decode(reader, m.getTroubleSpots()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}