package androidx.room.paging;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.CoroutinesRoomKt;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.util.RoomPagingUtilKt;
import androidx.room.paging.util.ThreadSafeInvalidationObserver;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: LimitOffsetPagingSource.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH%J#\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0002\u0010!J+\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J+\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J3\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%2\u0006\u0010)\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010*R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/room/paging/LimitOffsetPagingSource;", "Value", "", "Landroidx/paging/PagingSource;", "", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "db", "Landroidx/room/RoomDatabase;", "tables", "", "", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "sourceQuery", "Landroidx/room/RoomSQLiteQuery;", "(Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "itemCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "getItemCount$room_paging_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "jumpingSupported", "", "getJumpingSupported", "()Z", "observer", "Landroidx/room/paging/util/ThreadSafeInvalidationObserver;", "convertRows", "", "cursor", "Landroid/database/Cursor;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "initialLoad", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "nonInitialLoad", "tempCount", "(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-paging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {
    private final RoomDatabase db;
    private final AtomicInteger itemCount;
    private final ThreadSafeInvalidationObserver observer;
    private final RoomSQLiteQuery sourceQuery;

    protected abstract List<Value> convertRows(Cursor cursor);

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return true;
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return load$suspendImpl(this, loadParams, continuation);
    }

    public LimitOffsetPagingSource(RoomSQLiteQuery sourceQuery, RoomDatabase db, String... tables) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.sourceQuery = sourceQuery;
        this.db = db;
        this.itemCount = new AtomicInteger(-1);
        this.observer = new ThreadSafeInvalidationObserver(tables, new LimitOffsetPagingSource$observer$1(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(SupportSQLiteQuery supportSQLiteQuery, RoomDatabase db, String... tables) {
        this(RoomSQLiteQuery.INSTANCE.copyFrom(supportSQLiteQuery), db, (String[]) Arrays.copyOf(tables, tables.length));
        Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
    }

    /* renamed from: getItemCount$room_paging_release, reason: from getter */
    public final AtomicInteger getItemCount() {
        return this.itemCount;
    }

    static /* synthetic */ <Value> Object load$suspendImpl(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return BuildersKt.withContext(CoroutinesRoomKt.getQueryDispatcher(((LimitOffsetPagingSource) limitOffsetPagingSource).db), new LimitOffsetPagingSource$load$2(limitOffsetPagingSource, loadParams, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initialLoad(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return RoomDatabaseKt.withTransaction(this.db, new LimitOffsetPagingSource$initialLoad$2(this, loadParams, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nonInitialLoad(PagingSource.LoadParams<Integer> loadParams, int i, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        PagingSource.LoadResult queryDatabase$default = RoomPagingUtilKt.queryDatabase$default(loadParams, this.sourceQuery, this.db, i, null, new LimitOffsetPagingSource$nonInitialLoad$loadResult$1(this), 16, null);
        this.db.getInvalidationTracker().refreshVersionsSync();
        if (!getInvalid()) {
            return queryDatabase$default;
        }
        PagingSource.LoadResult.Invalid<Object, Object> invalid = RoomPagingUtilKt.getINVALID();
        Intrinsics.checkNotNull(invalid, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.LimitOffsetPagingSource>");
        return invalid;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Integer getRefreshKey(PagingState<Integer, Value> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return RoomPagingUtilKt.getClippedRefreshKey(state);
    }
}
