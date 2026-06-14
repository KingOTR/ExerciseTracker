package androidx.room.paging;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.util.RoomPagingUtilKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: LimitOffsetPagingSource.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class LimitOffsetPagingSource$initialLoad$2<Value> extends SuspendLambda implements Function1<Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
    final /* synthetic */ PagingSource.LoadParams<Integer> $params;
    int label;
    final /* synthetic */ LimitOffsetPagingSource<Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LimitOffsetPagingSource$initialLoad$2(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, Continuation<? super LimitOffsetPagingSource$initialLoad$2> continuation) {
        super(1, continuation);
        this.this$0 = limitOffsetPagingSource;
        this.$params = loadParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LimitOffsetPagingSource$initialLoad$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return ((LimitOffsetPagingSource$initialLoad$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomDatabase roomDatabase;
        RoomSQLiteQuery roomSQLiteQuery2;
        RoomDatabase roomDatabase2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            roomSQLiteQuery = ((LimitOffsetPagingSource) this.this$0).sourceQuery;
            roomDatabase = ((LimitOffsetPagingSource) this.this$0).db;
            int queryItemCount = RoomPagingUtilKt.queryItemCount(roomSQLiteQuery, roomDatabase);
            this.this$0.getItemCount().set(queryItemCount);
            PagingSource.LoadParams<Integer> loadParams = this.$params;
            roomSQLiteQuery2 = ((LimitOffsetPagingSource) this.this$0).sourceQuery;
            roomDatabase2 = ((LimitOffsetPagingSource) this.this$0).db;
            return RoomPagingUtilKt.queryDatabase$default(loadParams, roomSQLiteQuery2, roomDatabase2, queryItemCount, null, new AnonymousClass1(this.this$0), 16, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.paging.LimitOffsetPagingSource$initialLoad$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Cursor, List<? extends Value>> {
        AnonymousClass1(Object obj) {
            super(1, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<Value> invoke(Cursor p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((LimitOffsetPagingSource) this.receiver).convertRows(p0);
        }
    }
}
