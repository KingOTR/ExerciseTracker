package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002By\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u000bJ\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0086@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010.J\u001e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0082@¢\u0006\u0002\u00105J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u00101\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u00109J5\u0010:\u001a\u00020;2\u0006\u00101\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00018\u00002\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010>H\u0002¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u000bH\u0002J \u0010A\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\b\u0010*\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020D0\n2\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u0010EJ7\u0010F\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020DH\u0002¢\u0006\u0002\u0010JJ.\u0010K\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010L\u001a\u00020MH\u0082@¢\u0006\u0002\u0010NJ&\u0010O\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u0010PJ\f\u0010Q\u001a\u00020\u000b*\u00020RH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "Key", "", "Value", "initialKey", "pagingSource", "Landroidx/paging/PagingSource;", "config", "Landroidx/paging/PagingConfig;", "retryFlow", "Lkotlinx/coroutines/flow/Flow;", "", "remoteMediatorConnection", "Landroidx/paging/RemoteMediatorConnection;", "previousPagingState", "Landroidx/paging/PagingState;", "jumpCallback", "Lkotlin/Function0;", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "hintHandler", "Landroidx/paging/HintHandler;", "getInitialKey$paging_common_release", "()Ljava/lang/Object;", "Ljava/lang/Object;", "pageEventCh", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageEvent;", "pageEventChCollected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "pageEventChannelFlowJob", "Lkotlinx/coroutines/CompletableJob;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "getPagingSource$paging_common_release", "()Landroidx/paging/PagingSource;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "stateHolder", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "accessHint", "viewportHint", "Landroidx/paging/ViewportHint;", "close", "currentPagingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doInitialLoad", "doLoad", "loadType", "Landroidx/paging/LoadType;", "generationalHint", "Landroidx/paging/GenerationalViewportHint;", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadParams", "Landroidx/paging/PagingSource$LoadParams;", DatabaseFileArchive.COLUMN_KEY, "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "loadResultLog", "", "loadKey", "result", "Landroidx/paging/PagingSource$LoadResult;", "(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;", "onInvalidLoad", "retryLoadError", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectAsGenerationalViewportHints", "", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextLoadKeyOrNull", "Landroidx/paging/PageFetcherSnapshotState;", "generationId", "presentedItemsBeyondAnchor", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "setError", "error", "Landroidx/paging/LoadState$Error;", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLoading", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumingHints", "Lkotlinx/coroutines/CoroutineScope;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingConfig config;
    private final HintHandler hintHandler;
    private final Key initialKey;
    private final Function0<Unit> jumpCallback;
    private final Channel<PageEvent<Value>> pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final CompletableJob pageEventChannelFlowJob;
    private final Flow<PageEvent<Value>> pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    private final PagingState<Key, Value> previousPagingState;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final Flow<Unit> retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource, PagingConfig config, Flow<Unit> retryFlow, RemoteMediatorConnection<Key, Value> remoteMediatorConnection, PagingState<Key, Value> pagingState, Function0<Unit> jumpCallback) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.previousPagingState = pagingState;
        this.jumpCallback = jumpCallback;
        if (config.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.hintHandler = new HintHandler();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.pageEventChannelFlowJob = Job$default;
        this.pageEventFlow = FlowKt.onStart(CancelableChannelFlowKt.cancelableChannelFlow(Job$default, new PageFetcherSnapshot$pageEventFlow$1(this, null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    public final Key getInitialKey$paging_common_release() {
        return this.initialKey;
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common_release() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, Flow flow, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, pagingSource, pagingConfig, flow, (i & 16) != 0 ? null : remoteMediatorConnection, (i & 32) != 0 ? null : pagingState, (i & 64) != 0 ? new Function0<Unit>() { // from class: androidx.paging.PageFetcherSnapshot.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final Flow<PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object doInitialLoad = doInitialLoad(continuation);
            return doInitialLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doInitialLoad : Unit.INSTANCE;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        this.hintHandler.forceSetHint(loadType, viewportHint);
        return Unit.INSTANCE;
    }

    public final void accessHint(ViewportHint viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public final void close() {
        Job.DefaultImpls.cancel$default((Job) this.pageEventChannelFlowJob, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object currentPagingState(Continuation<? super PagingState<Key, Value>> continuation) {
        PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        int i;
        Mutex mutex;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        try {
            if (continuation instanceof PageFetcherSnapshot$currentPagingState$1) {
                pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState$1) continuation;
                if ((pageFetcherSnapshot$currentPagingState$1.label & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$currentPagingState$1.label -= Integer.MIN_VALUE;
                    Object obj = pageFetcherSnapshot$currentPagingState$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageFetcherSnapshot$currentPagingState$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        PageFetcherSnapshotState.Holder<Key, Value> holder2 = this.stateHolder;
                        mutex = ((PageFetcherSnapshotState.Holder) holder2).lock;
                        pageFetcherSnapshot$currentPagingState$1.L$0 = this;
                        pageFetcherSnapshot$currentPagingState$1.L$1 = holder2;
                        pageFetcherSnapshot$currentPagingState$1.L$2 = mutex;
                        pageFetcherSnapshot$currentPagingState$1.label = 1;
                        if (mutex.lock(null, pageFetcherSnapshot$currentPagingState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        holder = holder2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) pageFetcherSnapshot$currentPagingState$1.L$2;
                        holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$currentPagingState$1.L$1;
                        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$currentPagingState$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        this = pageFetcherSnapshot;
                    }
                    return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common_release(this.hintHandler.getLastAccessHint());
                }
            }
            return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common_release(this.hintHandler.getLastAccessHint());
        } finally {
            mutex.unlock(null);
        }
        pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, continuation);
        Object obj2 = pageFetcherSnapshot$currentPagingState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pageFetcherSnapshot$currentPagingState$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(CoroutineScope coroutineScope) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$1(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$3(this, null), 3, null);
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.INSTANCE.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b A[Catch: all -> 0x028c, TryCatch #5 {all -> 0x028c, blocks: (B:59:0x0163, B:61:0x018b, B:62:0x019c, B:64:0x01a5), top: B:58:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5 A[Catch: all -> 0x028c, TRY_LEAVE, TryCatch #5 {all -> 0x028c, blocks: (B:59:0x0163, B:61:0x018b, B:62:0x019c, B:64:0x01a5), top: B:58:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.paging.PageFetcherSnapshot, androidx.paging.PageFetcherSnapshot<Key, Value>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v52, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInitialLoad(Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        Mutex mutex;
        ?? r12;
        Throwable th;
        Mutex mutex2;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        LoadType loadType;
        PageFetcherSnapshot pageFetcherSnapshot;
        PagingLogger pagingLogger;
        PageFetcherSnapshot pageFetcherSnapshot2;
        PagingSource.LoadResult<Key, Value> loadResult;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        PageFetcherSnapshot pageFetcherSnapshot3;
        Mutex mutex3;
        PagingSource.LoadResult<Key, Value> loadResult2;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        PageFetcherSnapshot pageFetcherSnapshot4;
        Mutex mutex4;
        PagingSource.LoadResult<Key, Value> loadResult3;
        boolean insert;
        PagingSource.LoadResult<Key, Value> loadResult4;
        PageFetcherSnapshot pageFetcherSnapshot5;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        PagingSource.LoadResult<Key, Value> loadResult5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        Mutex mutex5;
        Channel<PageEvent<Value>> channel;
        PageEvent<Value> pageEvent$paging_common_release;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        Mutex mutex6;
        PageFetcherSnapshot pageFetcherSnapshot7;
        PagingSource.LoadResult.Page page;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        LoadState.Error error;
        LoadType loadType2;
        try {
            try {
                if (continuation instanceof PageFetcherSnapshot$doInitialLoad$1) {
                    pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) continuation;
                    if ((pageFetcherSnapshot$doInitialLoad$1.label & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$doInitialLoad$1.label -= Integer.MIN_VALUE;
                        Object obj = pageFetcherSnapshot$doInitialLoad$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (pageFetcherSnapshot$doInitialLoad$1.label) {
                            case 0:
                                ResultKt.throwOnFailure(obj);
                                holder = this.stateHolder;
                                mutex = ((PageFetcherSnapshotState.Holder) holder).lock;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = this;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = holder;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex;
                                pageFetcherSnapshot$doInitialLoad$1.label = 1;
                                this = this;
                                if (mutex.lock(null, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                try {
                                    pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                                    loadType = LoadType.REFRESH;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = r12;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = mutex;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 2;
                                    if (r12.setLoading(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot = r12;
                                    mutex2 = mutex;
                                    Unit unit = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    PagingSource.LoadParams<Key> loadParams = pageFetcherSnapshot.loadParams(LoadType.REFRESH, pageFetcherSnapshot.initialKey);
                                    pagingLogger = PagingLogger.INSTANCE;
                                    if (pagingLogger.isLoggable(3)) {
                                        pagingLogger.log(3, "Start REFRESH with loadKey " + pageFetcherSnapshot.initialKey + " on " + pageFetcherSnapshot.pagingSource, null);
                                    }
                                    PagingSource<Key, Value> pagingSource = pageFetcherSnapshot.pagingSource;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 3;
                                    obj = pagingSource.load(loadParams, pageFetcherSnapshot$doInitialLoad$1);
                                    if (obj != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot2 = pageFetcherSnapshot;
                                    loadResult = (PagingSource.LoadResult) obj;
                                    if (!(loadResult instanceof PagingSource.LoadResult.Page)) {
                                        holder3 = pageFetcherSnapshot2.stateHolder;
                                        Mutex mutex7 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult;
                                        pageFetcherSnapshot$doInitialLoad$1.L$2 = holder3;
                                        pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex7;
                                        pageFetcherSnapshot$doInitialLoad$1.label = 4;
                                        if (mutex7.lock(null, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        pageFetcherSnapshot4 = pageFetcherSnapshot2;
                                        mutex4 = mutex7;
                                        loadResult3 = loadResult;
                                        try {
                                            PageFetcherSnapshotState pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder3).state;
                                            insert = pageFetcherSnapshotState3.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult3);
                                            pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.REFRESH, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                            if (((PagingSource.LoadResult.Page) loadResult3).getPrevKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.PREPEND, LoadState.NotLoading.INSTANCE.getComplete$paging_common_release());
                                            }
                                            if (((PagingSource.LoadResult.Page) loadResult3).getNextKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.APPEND, LoadState.NotLoading.INSTANCE.getComplete$paging_common_release());
                                            }
                                            if (!insert) {
                                                PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                if (pagingLogger2.isLoggable(3)) {
                                                    pagingLogger2.log(3, pageFetcherSnapshot4.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot4.initialKey, loadResult3), null);
                                                }
                                                holder4 = pageFetcherSnapshot4.stateHolder;
                                                Mutex mutex8 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot4;
                                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult3;
                                                pageFetcherSnapshot$doInitialLoad$1.L$2 = holder4;
                                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex8;
                                                pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                                if (mutex8.lock(null, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadResult5 = loadResult3;
                                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                                mutex5 = mutex8;
                                                PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                channel = pageFetcherSnapshot6.pageEventCh;
                                                pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult5, LoadType.REFRESH);
                                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot6;
                                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult5;
                                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex5;
                                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                                if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadResult4 = loadResult5;
                                                pageFetcherSnapshot5 = pageFetcherSnapshot6;
                                                this = mutex5;
                                                Unit unit2 = Unit.INSTANCE;
                                                if (pageFetcherSnapshot5.remoteMediatorConnection != null) {
                                                    PagingSource.LoadResult.Page page2 = (PagingSource.LoadResult.Page) loadResult4;
                                                    if (page2.getPrevKey() == null || page2.getNextKey() == null) {
                                                        PageFetcherSnapshotState.Holder<Key, Value> holder6 = pageFetcherSnapshot5.stateHolder;
                                                        Mutex mutex9 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot5;
                                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult4;
                                                        pageFetcherSnapshot$doInitialLoad$1.L$2 = holder6;
                                                        pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex9;
                                                        pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                                        if (mutex9.lock(null, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        holder5 = holder6;
                                                        mutex6 = mutex9;
                                                        pageFetcherSnapshot7 = pageFetcherSnapshot5;
                                                        try {
                                                            PagingState<Key, Value> currentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot7.hintHandler.getLastAccessHint());
                                                            mutex6.unlock(null);
                                                            page = (PagingSource.LoadResult.Page) loadResult4;
                                                            if (page.getPrevKey() == null) {
                                                                pageFetcherSnapshot7.remoteMediatorConnection.requestLoad(LoadType.PREPEND, currentPagingState$paging_common_release);
                                                            }
                                                            if (page.getNextKey() == null) {
                                                                pageFetcherSnapshot7.remoteMediatorConnection.requestLoad(LoadType.APPEND, currentPagingState$paging_common_release);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                            if (pagingLogger3.isLoggable(2)) {
                                                pagingLogger3.log(2, pageFetcherSnapshot4.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot4.initialKey, null), null);
                                            }
                                            loadResult4 = loadResult3;
                                            pageFetcherSnapshot5 = pageFetcherSnapshot4;
                                            if (pageFetcherSnapshot5.remoteMediatorConnection != null) {
                                            }
                                            return Unit.INSTANCE;
                                        } finally {
                                        }
                                    }
                                    if (!(loadResult instanceof PagingSource.LoadResult.Error)) {
                                        if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                                            PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                            if (pagingLogger4.isLoggable(2)) {
                                                pagingLogger4.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult), null);
                                            }
                                            pageFetcherSnapshot2.onInvalidLoad();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                    if (pagingLogger5.isLoggable(2)) {
                                        pagingLogger5.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult), null);
                                    }
                                    holder2 = pageFetcherSnapshot2.stateHolder;
                                    Mutex mutex10 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot2;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = holder2;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = mutex10;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 8;
                                    if (mutex10.lock(null, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                    mutex3 = mutex10;
                                    loadResult2 = loadResult;
                                    pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                    error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                                    loadType2 = LoadType.REFRESH;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex3;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                    this = mutex3;
                                    if (pageFetcherSnapshot3.setError(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                    ((Mutex) this).unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    Mutex mutex11 = mutex;
                                    th = th2;
                                    mutex2 = mutex11;
                                    throw th;
                                }
                            case 1:
                                Mutex mutex12 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                PageFetcherSnapshot pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutex = mutex12;
                                r12 = (PageFetcherSnapshot<Key, Value>) pageFetcherSnapshot8;
                                pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                                loadType = LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = r12;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = mutex;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 2;
                                if (r12.setLoading(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                }
                                break;
                            case 2:
                                mutex2 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Unit unit4 = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    PagingSource.LoadParams<Key> loadParams2 = pageFetcherSnapshot.loadParams(LoadType.REFRESH, pageFetcherSnapshot.initialKey);
                                    pagingLogger = PagingLogger.INSTANCE;
                                    if (pagingLogger.isLoggable(3)) {
                                    }
                                    PagingSource<Key, Value> pagingSource2 = pageFetcherSnapshot.pagingSource;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 3;
                                    obj = pagingSource2.load(loadParams2, pageFetcherSnapshot$doInitialLoad$1);
                                    if (obj != coroutine_suspended) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                                break;
                            case 3:
                                pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                loadResult = (PagingSource.LoadResult) obj;
                                if (!(loadResult instanceof PagingSource.LoadResult.Page)) {
                                }
                                break;
                            case 4:
                                mutex4 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                PageFetcherSnapshotState pageFetcherSnapshotState32 = ((PageFetcherSnapshotState.Holder) holder3).state;
                                insert = pageFetcherSnapshotState32.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult3);
                                pageFetcherSnapshotState32.getSourceLoadStates().set(LoadType.REFRESH, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                if (((PagingSource.LoadResult.Page) loadResult3).getPrevKey() == null) {
                                }
                                if (((PagingSource.LoadResult.Page) loadResult3).getNextKey() == null) {
                                }
                                if (!insert) {
                                }
                                break;
                            case 5:
                                Mutex mutex13 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult5 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutex5 = mutex13;
                                PageFetcherSnapshotState pageFetcherSnapshotState42 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                channel = pageFetcherSnapshot6.pageEventCh;
                                pageEvent$paging_common_release = pageFetcherSnapshotState42.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult5, LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = pageFetcherSnapshot6;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = loadResult5;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutex5;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                }
                                break;
                            case 6:
                                boolean z = (PageFetcherSnapshot<Key, Value>) ((Mutex) pageFetcherSnapshot$doInitialLoad$1.L$2);
                                loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                this = z;
                                Unit unit22 = Unit.INSTANCE;
                                if (pageFetcherSnapshot5.remoteMediatorConnection != null) {
                                }
                                return Unit.INSTANCE;
                            case 7:
                                mutex6 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                PagingState<Key, Value> currentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot7.hintHandler.getLastAccessHint());
                                mutex6.unlock(null);
                                page = (PagingSource.LoadResult.Page) loadResult4;
                                if (page.getPrevKey() == null) {
                                }
                                if (page.getNextKey() == null) {
                                }
                                return Unit.INSTANCE;
                            case 8:
                                Mutex mutex14 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$3;
                                holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$2;
                                loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$1;
                                pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                mutex3 = mutex14;
                                pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                                loadType2 = LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex3;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                this = mutex3;
                                if (pageFetcherSnapshot3.setError(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                }
                                Unit unit32 = Unit.INSTANCE;
                                ((Mutex) this).unlock(null);
                                return Unit.INSTANCE;
                            case 9:
                                boolean z2 = (PageFetcherSnapshot<Key, Value>) ((Mutex) pageFetcherSnapshot$doInitialLoad$1.L$0);
                                ResultKt.throwOnFailure(obj);
                                this = z2;
                                Unit unit322 = Unit.INSTANCE;
                                ((Mutex) this).unlock(null);
                                return Unit.INSTANCE;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (pageFetcherSnapshot$doInitialLoad$1.label) {
                }
            } finally {
            }
        } finally {
        }
        pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuation);
        Object obj2 = pageFetcherSnapshot$doInitialLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x06cf, code lost:
    
        r0 = r7;
        r7 = r8;
        r8 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x051c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0324 A[Catch: all -> 0x06e8, TRY_LEAVE, TryCatch #6 {all -> 0x06e8, blocks: (B:204:0x030b, B:206:0x0324), top: B:203:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06f0 A[Catch: all -> 0x06f6, TRY_ENTER, TryCatch #5 {all -> 0x06f6, blocks: (B:217:0x022f, B:224:0x02d9, B:229:0x0245, B:231:0x0255, B:232:0x0261, B:234:0x026b, B:236:0x0284, B:238:0x0287, B:240:0x029f, B:243:0x02bd, B:245:0x02d6, B:247:0x06f0, B:248:0x06f5), top: B:216:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0590 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05a8 A[Catch: all -> 0x06dd, TRY_LEAVE, TryCatch #8 {all -> 0x06dd, blocks: (B:76:0x059a, B:78:0x05a8, B:84:0x05dc, B:86:0x05f5, B:88:0x0601, B:90:0x0609, B:91:0x0616, B:92:0x0610, B:93:0x061b), top: B:75:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05f5 A[Catch: all -> 0x06dd, TryCatch #8 {all -> 0x06dd, blocks: (B:76:0x059a, B:78:0x05a8, B:84:0x05dc, B:86:0x05f5, B:88:0x0601, B:90:0x0609, B:91:0x0616, B:92:0x0610, B:93:0x061b), top: B:75:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0609 A[Catch: all -> 0x06dd, TryCatch #8 {all -> 0x06dd, blocks: (B:76:0x059a, B:78:0x05a8, B:84:0x05dc, B:86:0x05f5, B:88:0x0601, B:90:0x0609, B:91:0x0616, B:92:0x0610, B:93:0x061b), top: B:75:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0610 A[Catch: all -> 0x06dd, TryCatch #8 {all -> 0x06dd, blocks: (B:76:0x059a, B:78:0x05a8, B:84:0x05dc, B:86:0x05f5, B:88:0x0601, B:90:0x0609, B:91:0x0616, B:92:0x0610, B:93:0x061b), top: B:75:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0645 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v41, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r14v18, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [T] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v30, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v47, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x06a6 -> B:13:0x06aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doLoad(LoadType loadType, GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$1;
        Ref.IntRef intRef;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        Mutex mutex;
        GenerationalViewportHint generationalViewportHint2;
        LoadType loadType2;
        Ref.IntRef intRef2;
        int i;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        PageFetcherSnapshot pageFetcherSnapshot;
        LoadType loadType3;
        Ref.ObjectRef objectRef;
        Mutex mutex2;
        GenerationalViewportHint generationalViewportHint3;
        Ref.ObjectRef objectRef2;
        Mutex mutex3;
        Object nextLoadKeyOrNull;
        ?? r2;
        Object obj;
        PageFetcherSnapshot pageFetcherSnapshot2;
        Ref.BooleanRef booleanRef;
        PageFetcherSnapshot pageFetcherSnapshot3;
        GenerationalViewportHint generationalViewportHint4;
        LoadType loadType4;
        ?? r8;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef3;
        PagingSource.LoadParams<Key> loadParams;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        PagingSource.LoadResult loadResult;
        Ref.BooleanRef booleanRef2;
        Mutex mutex4;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        Mutex mutex5;
        PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$12;
        LoadType loadType5;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        Mutex mutex6;
        GenerationalViewportHint generationalViewportHint5;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        LoadType loadType6;
        PagingSource.LoadResult loadResult2;
        PagingSource.LoadParams<Key> loadParams2;
        Mutex mutex7;
        Ref.IntRef intRef4;
        GenerationalViewportHint generationalViewportHint6;
        LoadType loadType7;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        PagingSource.LoadResult loadResult3;
        PagingSource.LoadParams<Key> loadParams3;
        Ref.BooleanRef booleanRef3;
        Mutex mutex8;
        PagingSource.LoadResult loadResult4;
        PagingSource.LoadParams<Key> loadParams4;
        Ref.BooleanRef booleanRef4;
        Ref.ObjectRef objectRef4;
        PageFetcherSnapshot pageFetcherSnapshot5;
        Throwable th;
        PageFetcherSnapshot pageFetcherSnapshot6;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState3;
        LoadState.Error error;
        int i2;
        int i3;
        Mutex mutex9;
        Ref.BooleanRef booleanRef5;
        PageFetcherSnapshotState.Holder<Key, Value> holder6;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState4;
        PageEvent<Value> pageEvent$paging_common_release;
        Channel<PageEvent<Value>> channel;
        PageEvent.Drop<Value> dropEventOrNull;
        PageFetcherSnapshot pageFetcherSnapshot7;
        LoadType loadType8;
        Mutex mutex10;
        ?? r14;
        Throwable th2;
        Object prevKey;
        ?? r12;
        Object obj2;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot8 = this;
        ?? r1 = loadType;
        try {
            if (continuation instanceof PageFetcherSnapshot$doLoad$1) {
                pageFetcherSnapshot$doLoad$1 = (PageFetcherSnapshot$doLoad$1) continuation;
                if ((pageFetcherSnapshot$doLoad$1.label & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$doLoad$1.label -= Integer.MIN_VALUE;
                    Object obj3 = pageFetcherSnapshot$doLoad$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    boolean z = true;
                    z = true;
                    z = true;
                    switch (pageFetcherSnapshot$doLoad$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj3);
                            if (r1 == LoadType.REFRESH) {
                                throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH".toString());
                            }
                            Ref.IntRef intRef5 = new Ref.IntRef();
                            PageFetcherSnapshotState.Holder<Key, Value> holder7 = pageFetcherSnapshot8.stateHolder;
                            Mutex mutex11 = ((PageFetcherSnapshotState.Holder) holder7).lock;
                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot8;
                            pageFetcherSnapshot$doLoad$1.L$1 = r1;
                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint;
                            pageFetcherSnapshot$doLoad$1.L$3 = intRef5;
                            pageFetcherSnapshot$doLoad$1.L$4 = holder7;
                            pageFetcherSnapshot$doLoad$1.L$5 = mutex11;
                            pageFetcherSnapshot$doLoad$1.label = 1;
                            if (mutex11.lock(null, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            intRef = intRef5;
                            holder = holder7;
                            mutex = mutex11;
                            generationalViewportHint2 = generationalViewportHint;
                            loadType2 = r1;
                            intRef2 = intRef;
                            try {
                                PageFetcherSnapshotState pageFetcherSnapshotState5 = ((PageFetcherSnapshotState.Holder) holder).state;
                                i = WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()];
                                if (i != 1) {
                                    throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                }
                                if (i == 2) {
                                    int initialPageIndex = (pageFetcherSnapshotState5.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetFirst()) - 1;
                                    if (initialPageIndex > CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common_release())) {
                                        intRef2.element += pageFetcherSnapshot8.config.pageSize * (initialPageIndex - CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common_release()));
                                        initialPageIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common_release());
                                    }
                                    if (initialPageIndex >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            intRef2.element += pageFetcherSnapshotState5.getPages$paging_common_release().get(i4).getData().size();
                                            if (i4 != initialPageIndex) {
                                                i4++;
                                            }
                                        }
                                    }
                                } else if (i == 3) {
                                    int initialPageIndex2 = pageFetcherSnapshotState5.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetLast() + 1;
                                    if (initialPageIndex2 < 0) {
                                        intRef2.element += pageFetcherSnapshot8.config.pageSize * (-initialPageIndex2);
                                        initialPageIndex2 = 0;
                                    }
                                    int lastIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common_release());
                                    if (initialPageIndex2 <= lastIndex) {
                                        while (true) {
                                            intRef2.element += pageFetcherSnapshotState5.getPages$paging_common_release().get(initialPageIndex2).getData().size();
                                            if (initialPageIndex2 != lastIndex) {
                                                initialPageIndex2++;
                                            }
                                        }
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                holder2 = pageFetcherSnapshot8.stateHolder;
                                Mutex mutex12 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                                pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot8;
                                pageFetcherSnapshot$doLoad$1.L$1 = loadType2;
                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint2;
                                pageFetcherSnapshot$doLoad$1.L$3 = intRef2;
                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef5;
                                pageFetcherSnapshot$doLoad$1.L$5 = holder2;
                                pageFetcherSnapshot$doLoad$1.L$6 = mutex12;
                                pageFetcherSnapshot$doLoad$1.L$7 = objectRef5;
                                pageFetcherSnapshot$doLoad$1.label = 2;
                                if (mutex12.lock(null, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot = pageFetcherSnapshot8;
                                loadType3 = loadType2;
                                objectRef = objectRef5;
                                mutex2 = mutex12;
                                generationalViewportHint3 = generationalViewportHint2;
                                objectRef2 = objectRef;
                                try {
                                    PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState6 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                    nextLoadKeyOrNull = pageFetcherSnapshot.nextLoadKeyOrNull(pageFetcherSnapshotState6, loadType3, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType3) + intRef2.element);
                                    if (nextLoadKeyOrNull == null) {
                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot;
                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef2;
                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef2;
                                        pageFetcherSnapshot$doLoad$1.L$5 = mutex2;
                                        pageFetcherSnapshot$doLoad$1.L$6 = nextLoadKeyOrNull;
                                        pageFetcherSnapshot$doLoad$1.L$7 = objectRef;
                                        pageFetcherSnapshot$doLoad$1.label = 3;
                                        if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState6, loadType3, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex3 = mutex2;
                                        obj = nextLoadKeyOrNull;
                                        pageFetcherSnapshot3 = pageFetcherSnapshot;
                                        r2 = obj;
                                        mutex2 = mutex3;
                                        pageFetcherSnapshot2 = pageFetcherSnapshot3;
                                        mutex2.unlock(null);
                                        objectRef.element = r2;
                                        booleanRef = new Ref.BooleanRef();
                                        r12 = pageFetcherSnapshot2;
                                        if (objectRef2.element != null) {
                                            PagingSource.LoadParams<Key> loadParams5 = r12.loadParams(loadType3, objectRef2.element);
                                            PagingLogger pagingLogger = PagingLogger.INSTANCE;
                                            if (pagingLogger.isLoggable(3)) {
                                                obj2 = null;
                                                pagingLogger.log(3, "Start " + loadType3 + " with loadKey " + objectRef2.element + " on " + r12.pagingSource, null);
                                            } else {
                                                obj2 = null;
                                            }
                                            PagingSource<Key, Value> pagingSource = r12.pagingSource;
                                            pageFetcherSnapshot$doLoad$1.L$0 = r12;
                                            pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                            pageFetcherSnapshot$doLoad$1.L$3 = intRef2;
                                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef2;
                                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams5;
                                            pageFetcherSnapshot$doLoad$1.L$7 = obj2;
                                            pageFetcherSnapshot$doLoad$1.L$8 = obj2;
                                            pageFetcherSnapshot$doLoad$1.label = 4;
                                            obj3 = pagingSource.load(loadParams5, pageFetcherSnapshot$doLoad$1);
                                            if (obj3 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType4 = loadType3;
                                            intRef3 = intRef2;
                                            r8 = r12;
                                            generationalViewportHint4 = generationalViewportHint3;
                                            objectRef3 = objectRef2;
                                            loadParams = loadParams5;
                                            loadResult = (PagingSource.LoadResult) obj3;
                                            if (loadResult instanceof PagingSource.LoadResult.Page) {
                                                int i5 = WhenMappings.$EnumSwitchMapping$0[loadType4.ordinal()];
                                                if (i5 == 2) {
                                                    prevKey = ((PagingSource.LoadResult.Page) loadResult).getPrevKey();
                                                } else if (i5 == 3) {
                                                    prevKey = ((PagingSource.LoadResult.Page) loadResult).getNextKey();
                                                } else {
                                                    throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                                                }
                                                if (!r8.pagingSource.getKeyReuseSupported() && Intrinsics.areEqual(prevKey, objectRef3.element)) {
                                                    throw new IllegalStateException(StringsKt.trimMargin$default("The same value, " + objectRef3.element + ", was passed as the " + (loadType4 == LoadType.PREPEND ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", null, z ? 1 : 0, null).toString());
                                                }
                                                holder3 = r8.stateHolder;
                                                mutex4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                                                pageFetcherSnapshot$doLoad$1.L$0 = r8;
                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType4;
                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                pageFetcherSnapshot$doLoad$1.L$8 = holder3;
                                                pageFetcherSnapshot$doLoad$1.L$9 = mutex4;
                                                pageFetcherSnapshot$doLoad$1.label = 5;
                                                if (mutex4.lock(null, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                r14 = r8;
                                                booleanRef2 = booleanRef;
                                                try {
                                                    if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType4, (PagingSource.LoadResult.Page) loadResult)) {
                                                        PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                        if (pagingLogger2.isLoggable(2)) {
                                                            pagingLogger2.log(2, r14.loadResultLog(loadType4, objectRef3.element, th2), th2);
                                                        }
                                                    } else {
                                                        PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                                        if (pagingLogger3.isLoggable(3)) {
                                                            pagingLogger3.log(3, r14.loadResultLog(loadType4, objectRef3.element, loadResult), th2);
                                                        }
                                                        PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) loadResult;
                                                        intRef3.element += page.getData().size();
                                                        if ((loadType4 == LoadType.PREPEND && page.getPrevKey() == null) || (loadType4 == LoadType.APPEND && page.getNextKey() == null)) {
                                                            booleanRef2.element = z;
                                                        }
                                                        booleanRef = booleanRef2;
                                                        pageFetcherSnapshot7 = r14;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType4.ordinal()] != 2) {
                                                        }
                                                        PageFetcherSnapshotState.Holder<Key, Value> holder8 = pageFetcherSnapshot7.stateHolder;
                                                        mutex10 = ((PageFetcherSnapshotState.Holder) holder8).lock;
                                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot7;
                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType4;
                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                        pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                        pageFetcherSnapshot$doLoad$1.L$8 = loadType8;
                                                        pageFetcherSnapshot$doLoad$1.L$9 = holder8;
                                                        pageFetcherSnapshot$doLoad$1.L$10 = mutex10;
                                                        pageFetcherSnapshot$doLoad$1.label = 8;
                                                        if (mutex10.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                        }
                                                    }
                                                } finally {
                                                }
                                            } else if (!(loadResult instanceof PagingSource.LoadResult.Error)) {
                                                pageFetcherSnapshot7 = r8;
                                                if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                                                    PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                                    if (pagingLogger4.isLoggable(2)) {
                                                        pagingLogger4.log(2, r8.loadResultLog(loadType4, objectRef3.element, loadResult), null);
                                                    }
                                                    r8.onInvalidLoad();
                                                    return Unit.INSTANCE;
                                                }
                                                if (WhenMappings.$EnumSwitchMapping$0[loadType4.ordinal()] != 2) {
                                                    loadType8 = LoadType.APPEND;
                                                } else {
                                                    loadType8 = LoadType.PREPEND;
                                                }
                                                PageFetcherSnapshotState.Holder<Key, Value> holder82 = pageFetcherSnapshot7.stateHolder;
                                                mutex10 = ((PageFetcherSnapshotState.Holder) holder82).lock;
                                                pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot7;
                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType4;
                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                pageFetcherSnapshot$doLoad$1.L$3 = intRef3;
                                                pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                pageFetcherSnapshot$doLoad$1.L$6 = loadParams;
                                                pageFetcherSnapshot$doLoad$1.L$7 = loadResult;
                                                pageFetcherSnapshot$doLoad$1.L$8 = loadType8;
                                                pageFetcherSnapshot$doLoad$1.L$9 = holder82;
                                                pageFetcherSnapshot$doLoad$1.L$10 = mutex10;
                                                pageFetcherSnapshot$doLoad$1.label = 8;
                                                if (mutex10.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                pageFetcherSnapshot4 = pageFetcherSnapshot7;
                                                loadParams2 = loadParams;
                                                loadResult2 = loadResult;
                                                loadType6 = loadType8;
                                                mutex7 = mutex10;
                                                holder5 = holder82;
                                                loadType7 = loadType4;
                                                generationalViewportHint6 = generationalViewportHint4;
                                                intRef4 = intRef3;
                                                try {
                                                    pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                                    dropEventOrNull = pageFetcherSnapshotState4.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                                                    if (dropEventOrNull == null) {
                                                        pageFetcherSnapshotState4.drop(dropEventOrNull);
                                                        Channel<PageEvent<Value>> channel2 = pageFetcherSnapshot4.pageEventCh;
                                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType7;
                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadParams2;
                                                        pageFetcherSnapshot$doLoad$1.L$7 = loadResult2;
                                                        pageFetcherSnapshot$doLoad$1.L$8 = mutex7;
                                                        pageFetcherSnapshot$doLoad$1.L$9 = pageFetcherSnapshotState4;
                                                        pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                        pageFetcherSnapshot$doLoad$1.label = 9;
                                                        if (channel2.send(dropEventOrNull, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadResult3 = loadResult2;
                                                        loadParams3 = loadParams2;
                                                        booleanRef3 = booleanRef;
                                                        pageFetcherSnapshotState2 = pageFetcherSnapshotState4;
                                                        r1 = mutex7;
                                                        Unit unit2 = Unit.INSTANCE;
                                                        mutex7 = r1;
                                                        pageFetcherSnapshotState4 = pageFetcherSnapshotState2;
                                                        booleanRef = booleanRef3;
                                                        objectRef3.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState4, loadType7, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType7) + intRef4.element);
                                                        if (objectRef3.element == null && !(pageFetcherSnapshotState4.getSourceLoadStates().get(loadType7) instanceof LoadState.Error)) {
                                                            pageFetcherSnapshotState4.getSourceLoadStates().set(loadType7, !booleanRef.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                        }
                                                        pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult3, loadType7);
                                                        channel = pageFetcherSnapshot4.pageEventCh;
                                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType7;
                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadParams3;
                                                        pageFetcherSnapshot$doLoad$1.L$7 = loadResult3;
                                                        pageFetcherSnapshot$doLoad$1.L$8 = mutex7;
                                                        pageFetcherSnapshot$doLoad$1.L$9 = null;
                                                        pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                        pageFetcherSnapshot$doLoad$1.label = 10;
                                                        if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        mutex8 = mutex7;
                                                        objectRef4 = objectRef3;
                                                        generationalViewportHint3 = generationalViewportHint6;
                                                        loadType3 = loadType7;
                                                        pageFetcherSnapshot5 = pageFetcherSnapshot4;
                                                        PagingSource.LoadParams<Key> loadParams6 = loadParams3;
                                                        booleanRef4 = booleanRef;
                                                        loadResult4 = loadResult3;
                                                        loadParams4 = loadParams6;
                                                        Unit unit3 = Unit.INSTANCE;
                                                        mutex8.unlock(null);
                                                        i2 = ((loadParams4 instanceof PagingSource.LoadParams.Prepend) || ((PagingSource.LoadResult.Page) loadResult4).getPrevKey() != null) ? 0 : 1;
                                                        i3 = ((loadParams4 instanceof PagingSource.LoadParams.Append) || ((PagingSource.LoadResult.Page) loadResult4).getNextKey() != null) ? 0 : 1;
                                                        if (pageFetcherSnapshot5.remoteMediatorConnection != null || (i2 == 0 && i3 == 0)) {
                                                            booleanRef = booleanRef4;
                                                            objectRef2 = objectRef4;
                                                            intRef2 = intRef4;
                                                            r12 = pageFetcherSnapshot5;
                                                            z = true;
                                                            if (objectRef2.element != null) {
                                                            }
                                                        } else {
                                                            PageFetcherSnapshotState.Holder<Key, Value> holder9 = pageFetcherSnapshot5.stateHolder;
                                                            mutex9 = ((PageFetcherSnapshotState.Holder) holder9).lock;
                                                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot5;
                                                            pageFetcherSnapshot$doLoad$1.L$1 = loadType3;
                                                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint3;
                                                            pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef4;
                                                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef4;
                                                            pageFetcherSnapshot$doLoad$1.L$6 = holder9;
                                                            pageFetcherSnapshot$doLoad$1.L$7 = mutex9;
                                                            pageFetcherSnapshot$doLoad$1.L$8 = null;
                                                            pageFetcherSnapshot$doLoad$1.I$0 = i2;
                                                            pageFetcherSnapshot$doLoad$1.I$1 = i3;
                                                            pageFetcherSnapshot$doLoad$1.label = 11;
                                                            if (mutex9.lock(null, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            booleanRef5 = booleanRef4;
                                                            objectRef2 = objectRef4;
                                                            intRef2 = intRef4;
                                                            holder6 = holder9;
                                                            try {
                                                                PagingState<Key, Value> currentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(pageFetcherSnapshot5.hintHandler.getLastAccessHint());
                                                                if (i2 != 0) {
                                                                    pageFetcherSnapshot5.remoteMediatorConnection.requestLoad(LoadType.PREPEND, currentPagingState$paging_common_release);
                                                                }
                                                                if (i3 != 0) {
                                                                    pageFetcherSnapshot5.remoteMediatorConnection.requestLoad(LoadType.APPEND, currentPagingState$paging_common_release);
                                                                }
                                                                booleanRef = booleanRef5;
                                                                r12 = pageFetcherSnapshot5;
                                                                z = true;
                                                                if (objectRef2.element != null) {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        loadResult3 = loadResult2;
                                                        loadParams3 = loadParams2;
                                                        objectRef3.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState4, loadType7, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType7) + intRef4.element);
                                                        if (objectRef3.element == null) {
                                                            pageFetcherSnapshotState4.getSourceLoadStates().set(loadType7, !booleanRef.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                        }
                                                        pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult3, loadType7);
                                                        channel = pageFetcherSnapshot4.pageEventCh;
                                                        pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                                                        pageFetcherSnapshot$doLoad$1.L$1 = loadType7;
                                                        pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                                                        pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                                                        pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                                                        pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadParams3;
                                                        pageFetcherSnapshot$doLoad$1.L$7 = loadResult3;
                                                        pageFetcherSnapshot$doLoad$1.L$8 = mutex7;
                                                        pageFetcherSnapshot$doLoad$1.L$9 = null;
                                                        pageFetcherSnapshot$doLoad$1.L$10 = null;
                                                        pageFetcherSnapshot$doLoad$1.label = 10;
                                                        if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r1 = mutex7;
                                                    r1.unlock(null);
                                                    throw th;
                                                }
                                            } else {
                                                PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                                if (pagingLogger5.isLoggable(2)) {
                                                    pagingLogger5.log(2, r8.loadResultLog(loadType4, objectRef3.element, loadResult), null);
                                                }
                                                PageFetcherSnapshotState.Holder<Key, Value> holder10 = r8.stateHolder;
                                                mutex5 = ((PageFetcherSnapshotState.Holder) holder10).lock;
                                                pageFetcherSnapshot$doLoad$1.L$0 = r8;
                                                pageFetcherSnapshot$doLoad$1.L$1 = loadType4;
                                                pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint4;
                                                pageFetcherSnapshot$doLoad$1.L$3 = loadResult;
                                                pageFetcherSnapshot$doLoad$1.L$4 = holder10;
                                                pageFetcherSnapshot$doLoad$1.L$5 = mutex5;
                                                pageFetcherSnapshot$doLoad$1.L$6 = null;
                                                pageFetcherSnapshot$doLoad$1.label = 6;
                                                if (mutex5.lock(null, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                holder4 = holder10;
                                                pageFetcherSnapshot$doLoad$12 = pageFetcherSnapshot$doLoad$1;
                                                loadType5 = loadType4;
                                                pageFetcherSnapshot6 = r8;
                                                try {
                                                    pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                    error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                                                    pageFetcherSnapshot$doLoad$12.L$0 = loadType5;
                                                    pageFetcherSnapshot$doLoad$12.L$1 = generationalViewportHint4;
                                                    pageFetcherSnapshot$doLoad$12.L$2 = mutex5;
                                                    pageFetcherSnapshot$doLoad$12.L$3 = pageFetcherSnapshotState3;
                                                    pageFetcherSnapshot$doLoad$12.L$4 = null;
                                                    pageFetcherSnapshot$doLoad$12.L$5 = null;
                                                    pageFetcherSnapshot$doLoad$12.label = 7;
                                                    if (pageFetcherSnapshot6.setError(pageFetcherSnapshotState3, loadType5, error, pageFetcherSnapshot$doLoad$12) != coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    pageFetcherSnapshotState = pageFetcherSnapshotState3;
                                                    mutex6 = mutex5;
                                                    generationalViewportHint5 = generationalViewportHint4;
                                                    pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType5, generationalViewportHint5.getHint());
                                                    Unit unit4 = Unit.INSTANCE;
                                                    mutex6.unlock(null);
                                                    return Unit.INSTANCE;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    mutex6 = mutex5;
                                                    mutex6.unlock(null);
                                                    throw th;
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    r2 = 0;
                                    pageFetcherSnapshot2 = pageFetcherSnapshot;
                                    mutex2.unlock(null);
                                    objectRef.element = r2;
                                    booleanRef = new Ref.BooleanRef();
                                    r12 = pageFetcherSnapshot2;
                                    if (objectRef2.element != null) {
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th5) {
                                    th = th5;
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            } finally {
                            }
                        case 1:
                            Mutex mutex13 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            PageFetcherSnapshotState.Holder<Key, Value> holder11 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef6 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint2 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType9 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot<Key, Value> pageFetcherSnapshot9 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex = mutex13;
                            pageFetcherSnapshot8 = pageFetcherSnapshot9;
                            intRef = intRef6;
                            holder = holder11;
                            loadType2 = loadType9;
                            intRef2 = intRef;
                            PageFetcherSnapshotState pageFetcherSnapshotState52 = ((PageFetcherSnapshotState.Holder) holder).state;
                            i = WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()];
                            if (i != 1) {
                            }
                            break;
                        case 2:
                            objectRef = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$7;
                            mutex2 = (Mutex) pageFetcherSnapshot$doLoad$1.L$6;
                            holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef2 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef2 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint3 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType3 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot10 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            pageFetcherSnapshot = pageFetcherSnapshot10;
                            PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState62 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            nextLoadKeyOrNull = pageFetcherSnapshot.nextLoadKeyOrNull(pageFetcherSnapshotState62, loadType3, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType3) + intRef2.element);
                            if (nextLoadKeyOrNull == null) {
                            }
                            break;
                        case 3:
                            objectRef = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$7;
                            obj = pageFetcherSnapshot$doLoad$1.L$6;
                            mutex3 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef2 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef2 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint3 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType3 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot11 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                pageFetcherSnapshot3 = pageFetcherSnapshot11;
                                r2 = obj;
                                mutex2 = mutex3;
                                pageFetcherSnapshot2 = pageFetcherSnapshot3;
                                mutex2.unlock(null);
                                objectRef.element = r2;
                                booleanRef = new Ref.BooleanRef();
                                r12 = pageFetcherSnapshot2;
                                if (objectRef2.element != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                mutex3.unlock(null);
                                throw th;
                            }
                        case 4:
                            PagingSource.LoadParams<Key> loadParams7 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            Ref.BooleanRef booleanRef6 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef7 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint7 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType10 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot12 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            generationalViewportHint4 = generationalViewportHint7;
                            loadType4 = loadType10;
                            r8 = pageFetcherSnapshot12;
                            objectRef3 = objectRef6;
                            intRef3 = intRef7;
                            loadParams = loadParams7;
                            booleanRef = booleanRef6;
                            loadResult = (PagingSource.LoadResult) obj3;
                            if (loadResult instanceof PagingSource.LoadResult.Page) {
                            }
                            break;
                        case 5:
                            Mutex mutex14 = (Mutex) pageFetcherSnapshot$doLoad$1.L$9;
                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef2 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef3 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef3 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint4 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType4 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot13 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex4 = mutex14;
                            r14 = pageFetcherSnapshot13;
                            if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType4, (PagingSource.LoadResult.Page) loadResult)) {
                            }
                            break;
                        case 6:
                            Mutex mutex15 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$4;
                            loadResult = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint8 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType11 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot14 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex5 = mutex15;
                            pageFetcherSnapshot$doLoad$12 = pageFetcherSnapshot$doLoad$1;
                            generationalViewportHint4 = generationalViewportHint8;
                            loadType5 = loadType11;
                            pageFetcherSnapshot6 = pageFetcherSnapshot14;
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                            pageFetcherSnapshot$doLoad$12.L$0 = loadType5;
                            pageFetcherSnapshot$doLoad$12.L$1 = generationalViewportHint4;
                            pageFetcherSnapshot$doLoad$12.L$2 = mutex5;
                            pageFetcherSnapshot$doLoad$12.L$3 = pageFetcherSnapshotState3;
                            pageFetcherSnapshot$doLoad$12.L$4 = null;
                            pageFetcherSnapshot$doLoad$12.L$5 = null;
                            pageFetcherSnapshot$doLoad$12.label = 7;
                            if (pageFetcherSnapshot6.setError(pageFetcherSnapshotState3, loadType5, error, pageFetcherSnapshot$doLoad$12) != coroutine_suspended) {
                            }
                            break;
                        case 7:
                            pageFetcherSnapshotState = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$3;
                            mutex6 = (Mutex) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint5 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$1;
                            loadType5 = (LoadType) pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType5, generationalViewportHint5.getHint());
                                Unit unit42 = Unit.INSTANCE;
                                mutex6.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th7) {
                                th = th7;
                                mutex6.unlock(null);
                                throw th;
                            }
                        case 8:
                            Mutex mutex16 = (Mutex) pageFetcherSnapshot$doLoad$1.L$10;
                            holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$9;
                            loadType6 = (LoadType) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams2 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef8 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint9 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType12 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot15 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            mutex7 = mutex16;
                            booleanRef = booleanRef7;
                            objectRef3 = objectRef7;
                            intRef4 = intRef8;
                            generationalViewportHint6 = generationalViewportHint9;
                            loadType7 = loadType12;
                            pageFetcherSnapshot4 = pageFetcherSnapshot15;
                            pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            dropEventOrNull = pageFetcherSnapshotState4.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                            if (dropEventOrNull == null) {
                            }
                            break;
                        case 9:
                            pageFetcherSnapshotState2 = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$9;
                            Mutex mutex17 = (Mutex) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams3 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef3 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef3 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            intRef4 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            generationalViewportHint6 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            loadType7 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            r1 = mutex17;
                            Unit unit22 = Unit.INSTANCE;
                            mutex7 = r1;
                            pageFetcherSnapshotState4 = pageFetcherSnapshotState2;
                            booleanRef = booleanRef3;
                            objectRef3.element = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState4, loadType7, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType7) + intRef4.element);
                            if (objectRef3.element == null) {
                            }
                            pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult3, loadType7);
                            channel = pageFetcherSnapshot4.pageEventCh;
                            pageFetcherSnapshot$doLoad$1.L$0 = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doLoad$1.L$1 = loadType7;
                            pageFetcherSnapshot$doLoad$1.L$2 = generationalViewportHint6;
                            pageFetcherSnapshot$doLoad$1.L$3 = intRef4;
                            pageFetcherSnapshot$doLoad$1.L$4 = objectRef3;
                            pageFetcherSnapshot$doLoad$1.L$5 = booleanRef;
                            pageFetcherSnapshot$doLoad$1.L$6 = loadParams3;
                            pageFetcherSnapshot$doLoad$1.L$7 = loadResult3;
                            pageFetcherSnapshot$doLoad$1.L$8 = mutex7;
                            pageFetcherSnapshot$doLoad$1.L$9 = null;
                            pageFetcherSnapshot$doLoad$1.L$10 = null;
                            pageFetcherSnapshot$doLoad$1.label = 10;
                            if (channel.send(pageEvent$paging_common_release, pageFetcherSnapshot$doLoad$1) == coroutine_suspended) {
                            }
                            break;
                        case 10:
                            mutex8 = (Mutex) pageFetcherSnapshot$doLoad$1.L$8;
                            loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$7;
                            loadParams4 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef4 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            objectRef4 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef9 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint10 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType13 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            loadType3 = loadType13;
                            intRef4 = intRef9;
                            generationalViewportHint3 = generationalViewportHint10;
                            Unit unit32 = Unit.INSTANCE;
                            mutex8.unlock(null);
                            if (loadParams4 instanceof PagingSource.LoadParams.Prepend) {
                                break;
                            }
                            if (loadParams4 instanceof PagingSource.LoadParams.Append) {
                                break;
                            }
                            if (pageFetcherSnapshot5.remoteMediatorConnection != null) {
                            }
                            booleanRef = booleanRef4;
                            objectRef2 = objectRef4;
                            intRef2 = intRef4;
                            r12 = pageFetcherSnapshot5;
                            z = true;
                            if (objectRef2.element != null) {
                            }
                            return Unit.INSTANCE;
                        case 11:
                            i3 = pageFetcherSnapshot$doLoad$1.I$1;
                            i2 = pageFetcherSnapshot$doLoad$1.I$0;
                            mutex9 = (Mutex) pageFetcherSnapshot$doLoad$1.L$7;
                            holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$6;
                            booleanRef5 = (Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref.IntRef intRef10 = (Ref.IntRef) pageFetcherSnapshot$doLoad$1.L$3;
                            GenerationalViewportHint generationalViewportHint11 = (GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.L$2;
                            LoadType loadType14 = (LoadType) pageFetcherSnapshot$doLoad$1.L$1;
                            PageFetcherSnapshot pageFetcherSnapshot16 = (PageFetcherSnapshot) pageFetcherSnapshot$doLoad$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            loadType3 = loadType14;
                            intRef2 = intRef10;
                            generationalViewportHint3 = generationalViewportHint11;
                            objectRef2 = objectRef8;
                            pageFetcherSnapshot5 = pageFetcherSnapshot16;
                            PagingState<Key, Value> currentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(pageFetcherSnapshot5.hintHandler.getLastAccessHint());
                            if (i2 != 0) {
                            }
                            if (i3 != 0) {
                            }
                            booleanRef = booleanRef5;
                            r12 = pageFetcherSnapshot5;
                            z = true;
                            if (objectRef2.element != null) {
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (pageFetcherSnapshot$doLoad$1.label) {
            }
        } catch (Throwable th8) {
            th = th8;
        }
        pageFetcherSnapshot$doLoad$1 = new PageFetcherSnapshot$doLoad$1(pageFetcherSnapshot8, continuation);
        Object obj32 = pageFetcherSnapshot$doLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = true;
        z2 = true;
        z2 = true;
    }

    private final String loadResultLog(LoadType loadType, Key loadKey, PagingSource.LoadResult<Key, Value> result) {
        if (result == null) {
            return "End " + loadType + " with loadkey " + loadKey + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + loadKey + ". Returned " + result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), LoadState.Loading.INSTANCE)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, LoadState.Loading.INSTANCE);
            Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), error)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, error);
            Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.generationId$paging_common_release(loadType) || (pageFetcherSnapshotState.getSourceLoadStates().get(loadType) instanceof LoadState.Error) || i2 >= this.config.prefetchDistance) {
            return null;
        }
        if (loadType == LoadType.PREPEND) {
            return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.first((List) pageFetcherSnapshotState.getPages$paging_common_release())).getPrevKey();
        }
        return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.last((List) pageFetcherSnapshotState.getPages$paging_common_release())).getNextKey();
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(Flow<Integer> flow, final LoadType loadType, Continuation<? super Unit> continuation) {
        Object collect = FlowKt.conflate(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null))).collect(new FlowCollector(this) { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$4
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((GenerationalViewportHint) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation2) {
                Object doLoad;
                doLoad = this.this$0.doLoad(loadType, generationalViewportHint, continuation2);
                return doLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doLoad : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
