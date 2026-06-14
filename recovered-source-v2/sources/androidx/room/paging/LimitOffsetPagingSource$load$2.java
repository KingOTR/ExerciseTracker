package androidx.room.paging;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.paging.util.ThreadSafeInvalidationObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: LimitOffsetPagingSource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$load$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {76, ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class LimitOffsetPagingSource$load$2<Value> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
    final /* synthetic */ PagingSource.LoadParams<Integer> $params;
    int label;
    final /* synthetic */ LimitOffsetPagingSource<Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LimitOffsetPagingSource$load$2(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, Continuation<? super LimitOffsetPagingSource$load$2> continuation) {
        super(2, continuation);
        this.this$0 = limitOffsetPagingSource;
        this.$params = loadParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOffsetPagingSource$load$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return ((LimitOffsetPagingSource$load$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThreadSafeInvalidationObserver threadSafeInvalidationObserver;
        RoomDatabase roomDatabase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (PagingSource.LoadResult) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (PagingSource.LoadResult) obj;
            }
            ResultKt.throwOnFailure(obj);
            threadSafeInvalidationObserver = ((LimitOffsetPagingSource) this.this$0).observer;
            roomDatabase = ((LimitOffsetPagingSource) this.this$0).db;
            threadSafeInvalidationObserver.registerIfNecessary(roomDatabase);
            int i2 = this.this$0.getItemCount().get();
            if (i2 == -1) {
                this.label = 1;
                obj = this.this$0.initialLoad(this.$params, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (PagingSource.LoadResult) obj;
            }
            this.label = 2;
            obj = this.this$0.nonInitialLoad(this.$params, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (PagingSource.LoadResult) obj;
        } catch (Exception e) {
            return new PagingSource.LoadResult.Error(e);
        }
    }
}
