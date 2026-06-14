package com.example.rungps.data;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDbMigrationsTestSupport.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/example/rungps/data/AppDbMigrationsTestSupport$migrate32To33Obj$1", "Landroidx/room/migration/Migration;", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppDbMigrationsTestSupport$migrate32To33Obj$1 extends Migration {
    AppDbMigrationsTestSupport$migrate32To33Obj$1() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        boolean tableHasColumn;
        Intrinsics.checkNotNullParameter(db, "db");
        tableHasColumn = AppDbMigrationsTestSupport.INSTANCE.tableHasColumn(db, "exercise_muscle_tags", "setupNote");
        if (tableHasColumn) {
            return;
        }
        db.execSQL("ALTER TABLE exercise_muscle_tags ADD COLUMN setupNote TEXT");
    }
}
