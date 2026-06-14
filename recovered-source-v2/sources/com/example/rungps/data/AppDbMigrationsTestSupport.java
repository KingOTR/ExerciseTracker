package com.example.rungps.data;

import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDbMigrationsTestSupport.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0004\f\u000f\u0012\u0019\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/data/AppDbMigrationsTestSupport;", "", "<init>", "()V", "tableHasColumn", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "table", "", "column", "migrate24To25Obj", "com/example/rungps/data/AppDbMigrationsTestSupport$migrate24To25Obj$1", "Lcom/example/rungps/data/AppDbMigrationsTestSupport$migrate24To25Obj$1;", "migrate25To26Obj", "com/example/rungps/data/AppDbMigrationsTestSupport$migrate25To26Obj$1", "Lcom/example/rungps/data/AppDbMigrationsTestSupport$migrate25To26Obj$1;", "migrate26To27Obj", "com/example/rungps/data/AppDbMigrationsTestSupport$migrate26To27Obj$1", "Lcom/example/rungps/data/AppDbMigrationsTestSupport$migrate26To27Obj$1;", "migrate24To25", "", "migrate25To26", "migrate26To27", "migrate32To33Obj", "com/example/rungps/data/AppDbMigrationsTestSupport$migrate32To33Obj$1", "Lcom/example/rungps/data/AppDbMigrationsTestSupport$migrate32To33Obj$1;", "migrate32To33", "hasColumn", "tableExists", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppDbMigrationsTestSupport {
    public static final int $stable = 0;
    public static final AppDbMigrationsTestSupport INSTANCE = new AppDbMigrationsTestSupport();
    private static final AppDbMigrationsTestSupport$migrate24To25Obj$1 migrate24To25Obj = new AppDbMigrationsTestSupport$migrate24To25Obj$1();
    private static final AppDbMigrationsTestSupport$migrate25To26Obj$1 migrate25To26Obj = new AppDbMigrationsTestSupport$migrate25To26Obj$1();
    private static final AppDbMigrationsTestSupport$migrate26To27Obj$1 migrate26To27Obj = new AppDbMigrationsTestSupport$migrate26To27Obj$1();
    private static final AppDbMigrationsTestSupport$migrate32To33Obj$1 migrate32To33Obj = new AppDbMigrationsTestSupport$migrate32To33Obj$1();

    private AppDbMigrationsTestSupport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tableHasColumn(SupportSQLiteDatabase db, String table, String column) {
        Cursor query = db.query("PRAGMA table_info(`" + table + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex(HintConstants.AUTOFILL_HINT_NAME);
            if (columnIndex < 0) {
                CloseableKt.closeFinally(query, null);
                return false;
            }
            while (cursor.moveToNext()) {
                if (Intrinsics.areEqual(cursor.getString(columnIndex), column)) {
                    CloseableKt.closeFinally(query, null);
                    return true;
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query, null);
            return false;
        } finally {
        }
    }

    public final void migrate24To25(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        migrate24To25Obj.migrate(db);
    }

    public final void migrate25To26(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        migrate25To26Obj.migrate(db);
    }

    public final void migrate26To27(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        migrate26To27Obj.migrate(db);
    }

    public final void migrate32To33(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        migrate32To33Obj.migrate(db);
    }

    public final boolean hasColumn(SupportSQLiteDatabase db, String table, String column) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(column, "column");
        return tableHasColumn(db, table, column);
    }

    public final boolean tableExists(SupportSQLiteDatabase db, String table) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(table, "table");
        Cursor query = db.query("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{table});
        try {
            boolean moveToFirst = query.moveToFirst();
            CloseableKt.closeFinally(query, null);
            return moveToFirst;
        } finally {
        }
    }
}
