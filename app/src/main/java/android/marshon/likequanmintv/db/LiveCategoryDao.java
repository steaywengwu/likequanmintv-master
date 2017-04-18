package android.marshon.likequanmintv.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import android.marshon.likequanmintv.bean.LiveCategory;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LIVE_CATEGORY".
*/
public class LiveCategoryDao extends AbstractDao<LiveCategory, Long> {

    public static final String TABLENAME = "LIVE_CATEGORY";

    /**
     * Properties of entity LiveCategory.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Is_default = new Property(2, int.class, "is_default", false, "IS_DEFAULT");
        public final static Property Slug = new Property(3, String.class, "slug", false, "SLUG");
        public final static Property Type = new Property(4, int.class, "type", false, "TYPE");
        public final static Property Screen = new Property(5, int.class, "screen", false, "SCREEN");
    }

    private DaoSession daoSession;


    public LiveCategoryDao(DaoConfig config) {
        super(config);
    }
    
    public LiveCategoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LIVE_CATEGORY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"IS_DEFAULT\" INTEGER NOT NULL ," + // 2: is_default
                "\"SLUG\" TEXT," + // 3: slug
                "\"TYPE\" INTEGER NOT NULL ," + // 4: type
                "\"SCREEN\" INTEGER NOT NULL );"); // 5: screen
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LIVE_CATEGORY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LiveCategory entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getIs_default());
 
        String slug = entity.getSlug();
        if (slug != null) {
            stmt.bindString(4, slug);
        }
        stmt.bindLong(5, entity.getType());
        stmt.bindLong(6, entity.getScreen());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LiveCategory entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getIs_default());
 
        String slug = entity.getSlug();
        if (slug != null) {
            stmt.bindString(4, slug);
        }
        stmt.bindLong(5, entity.getType());
        stmt.bindLong(6, entity.getScreen());
    }

    @Override
    protected final void attachEntity(LiveCategory entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LiveCategory readEntity(Cursor cursor, int offset) {
        LiveCategory entity = new LiveCategory( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // is_default
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // slug
            cursor.getInt(offset + 4), // type
            cursor.getInt(offset + 5) // screen
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LiveCategory entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIs_default(cursor.getInt(offset + 2));
        entity.setSlug(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.getInt(offset + 4));
        entity.setScreen(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LiveCategory entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LiveCategory entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LiveCategory entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
