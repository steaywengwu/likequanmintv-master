package android.marshon.likequanmintv.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import android.marshon.likequanmintv.bean.ItemColumn;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ITEM_COLUMN".
*/
public class ItemColumnDao extends AbstractDao<ItemColumn, Long> {

    public static final String TABLENAME = "ITEM_COLUMN";

    /**
     * Properties of entity ItemColumn.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property First_letter = new Property(0, String.class, "first_letter", false, "FIRST_LETTER");
        public final static Property Id = new Property(1, Long.class, "id", true, "_id");
        public final static Property Image = new Property(2, String.class, "image", false, "IMAGE");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Priority = new Property(4, int.class, "priority", false, "PRIORITY");
        public final static Property Prompt = new Property(5, int.class, "prompt", false, "PROMPT");
        public final static Property Screen = new Property(6, int.class, "screen", false, "SCREEN");
        public final static Property Slug = new Property(7, String.class, "slug", false, "SLUG");
        public final static Property Status = new Property(8, int.class, "status", false, "STATUS");
        public final static Property Thumb = new Property(9, String.class, "thumb", false, "THUMB");
    }


    public ItemColumnDao(DaoConfig config) {
        super(config);
    }
    
    public ItemColumnDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ITEM_COLUMN\" (" + //
                "\"FIRST_LETTER\" TEXT," + // 0: first_letter
                "\"_id\" INTEGER PRIMARY KEY ," + // 1: id
                "\"IMAGE\" TEXT," + // 2: image
                "\"NAME\" TEXT," + // 3: name
                "\"PRIORITY\" INTEGER NOT NULL ," + // 4: priority
                "\"PROMPT\" INTEGER NOT NULL ," + // 5: prompt
                "\"SCREEN\" INTEGER NOT NULL ," + // 6: screen
                "\"SLUG\" TEXT," + // 7: slug
                "\"STATUS\" INTEGER NOT NULL ," + // 8: status
                "\"THUMB\" TEXT);"); // 9: thumb
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ITEM_COLUMN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ItemColumn entity) {
        stmt.clearBindings();
 
        String first_letter = entity.getFirst_letter();
        if (first_letter != null) {
            stmt.bindString(1, first_letter);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(3, image);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
        stmt.bindLong(5, entity.getPriority());
        stmt.bindLong(6, entity.getPrompt());
        stmt.bindLong(7, entity.getScreen());
 
        String slug = entity.getSlug();
        if (slug != null) {
            stmt.bindString(8, slug);
        }
        stmt.bindLong(9, entity.getStatus());
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(10, thumb);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ItemColumn entity) {
        stmt.clearBindings();
 
        String first_letter = entity.getFirst_letter();
        if (first_letter != null) {
            stmt.bindString(1, first_letter);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(3, image);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
        stmt.bindLong(5, entity.getPriority());
        stmt.bindLong(6, entity.getPrompt());
        stmt.bindLong(7, entity.getScreen());
 
        String slug = entity.getSlug();
        if (slug != null) {
            stmt.bindString(8, slug);
        }
        stmt.bindLong(9, entity.getStatus());
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(10, thumb);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1);
    }    

    @Override
    public ItemColumn readEntity(Cursor cursor, int offset) {
        ItemColumn entity = new ItemColumn( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // first_letter
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // image
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.getInt(offset + 4), // priority
            cursor.getInt(offset + 5), // prompt
            cursor.getInt(offset + 6), // screen
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // slug
            cursor.getInt(offset + 8), // status
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // thumb
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ItemColumn entity, int offset) {
        entity.setFirst_letter(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setImage(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPriority(cursor.getInt(offset + 4));
        entity.setPrompt(cursor.getInt(offset + 5));
        entity.setScreen(cursor.getInt(offset + 6));
        entity.setSlug(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStatus(cursor.getInt(offset + 8));
        entity.setThumb(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ItemColumn entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ItemColumn entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ItemColumn entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
