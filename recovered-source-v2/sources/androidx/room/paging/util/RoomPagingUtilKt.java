package androidx.room.paging.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: RoomPagingUtil.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0001\u001a$\u0010\u000b\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001ah\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u000f0\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u00190\u0017\u001a\u0016\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a'\u0010\u001b\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u000f0\u001c¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"INITIAL_ITEM_COUNT", "", "INVALID", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "", "getINVALID", "()Landroidx/paging/PagingSource$LoadResult$Invalid;", "getLimit", "params", "Landroidx/paging/PagingSource$LoadParams;", DatabaseFileArchive.COLUMN_KEY, "getOffset", "itemCount", "queryDatabase", "Landroidx/paging/PagingSource$LoadResult;", "Value", "sourceQuery", "Landroidx/room/RoomSQLiteQuery;", "db", "Landroidx/room/RoomDatabase;", "cancellationSignal", "Landroid/os/CancellationSignal;", "convertRows", "Lkotlin/Function1;", "Landroid/database/Cursor;", "", "queryItemCount", "getClippedRefreshKey", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "room-paging_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomPagingUtilKt {
    public static final int INITIAL_ITEM_COUNT = -1;
    private static final PagingSource.LoadResult.Invalid<Object, Object> INVALID = new PagingSource.LoadResult.Invalid<>();

    public static final PagingSource.LoadResult.Invalid<Object, Object> getINVALID() {
        return INVALID;
    }

    public static final int getLimit(PagingSource.LoadParams<Integer> params, int i) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            return i < params.getLoadSize() ? i : params.getLoadSize();
        }
        return params.getLoadSize();
    }

    public static final int getOffset(PagingSource.LoadParams<Integer> params, int i, int i2) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            if (i < params.getLoadSize()) {
                return 0;
            }
            return i - params.getLoadSize();
        }
        if (params instanceof PagingSource.LoadParams.Append) {
            return i;
        }
        if (params instanceof PagingSource.LoadParams.Refresh) {
            return i >= i2 ? Math.max(0, i2 - params.getLoadSize()) : i;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ PagingSource.LoadResult queryDatabase$default(PagingSource.LoadParams loadParams, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, int i, CancellationSignal cancellationSignal, Function1 function1, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            cancellationSignal = null;
        }
        return queryDatabase(loadParams, roomSQLiteQuery, roomDatabase, i, cancellationSignal, function1);
    }

    public static final <Value> PagingSource.LoadResult<Integer, Value> queryDatabase(PagingSource.LoadParams<Integer> params, RoomSQLiteQuery sourceQuery, RoomDatabase db, int i, CancellationSignal cancellationSignal, Function1<? super Cursor, ? extends List<? extends Value>> convertRows) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(convertRows, "convertRows");
        Integer key = params.getKey();
        int intValue = key != null ? key.intValue() : 0;
        int limit = getLimit(params, intValue);
        int offset = getOffset(params, intValue, i);
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM ( " + sourceQuery.getQuery() + " ) LIMIT " + limit + " OFFSET " + offset, sourceQuery.getArgCount());
        acquire.copyArgumentsFrom(sourceQuery);
        Cursor query = db.query(acquire, cancellationSignal);
        try {
            List<? extends Value> invoke = convertRows.invoke(query);
            query.close();
            acquire.release();
            int size = invoke.size() + offset;
            Integer num = null;
            Integer valueOf = (invoke.isEmpty() || invoke.size() < limit || size >= i) ? null : Integer.valueOf(size);
            if (offset > 0 && !invoke.isEmpty()) {
                num = Integer.valueOf(offset);
            }
            return new PagingSource.LoadResult.Page(invoke, num, valueOf, offset, Math.max(0, i - size));
        } catch (Throwable th) {
            query.close();
            acquire.release();
            throw th;
        }
    }

    public static final int queryItemCount(RoomSQLiteQuery sourceQuery, RoomDatabase db) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT COUNT(*) FROM ( " + sourceQuery.getQuery() + " )", sourceQuery.getArgCount());
        acquire.copyArgumentsFrom(sourceQuery);
        Cursor query$default = RoomDatabase.query$default(db, acquire, null, 2, null);
        try {
            if (query$default.moveToFirst()) {
                return query$default.getInt(0);
            }
            return 0;
        } finally {
            query$default.close();
            acquire.release();
        }
    }

    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "<this>");
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (pagingState.getConfig().initialLoadSize / 2)));
        }
        return null;
    }
}
