package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageFetcherSnapshotState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {646, 168, 657}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$pageEventFlow$1<Value> extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot$pageEventFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, continuation);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SimpleProducerScope simpleProducerScope;
        AtomicBoolean atomicBoolean;
        RemoteMediatorConnection remoteMediatorConnection;
        PagingState pagingState;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        PageFetcherSnapshotState.Holder holder2;
        Object doInitialLoad;
        SimpleProducerScope simpleProducerScope2;
        Mutex mutex2;
        PageFetcherSnapshotState.Holder holder3;
        Mutex mutex3;
        SimpleProducerScope simpleProducerScope3;
        PageFetcherSnapshotState.Holder holder4;
        LoadState loadState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                simpleProducerScope = (SimpleProducerScope) this.L$0;
                atomicBoolean = ((PageFetcherSnapshot) this.this$0).pageEventChCollected;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
                }
                SimpleProducerScope simpleProducerScope4 = simpleProducerScope;
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new AnonymousClass2(this.this$0, simpleProducerScope, null), 3, null);
                Channel Channel$default = ChannelKt.Channel$default(0, null, null, 6, null);
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new AnonymousClass3(this.this$0, Channel$default, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new AnonymousClass4(Channel$default, this.this$0, null), 3, null);
                remoteMediatorConnection = this.this$0.getRemoteMediatorConnection();
                if (remoteMediatorConnection != null) {
                    PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.this$0;
                    pagingState = ((PageFetcherSnapshot) pageFetcherSnapshot).previousPagingState;
                    if (pagingState == null) {
                        holder = ((PageFetcherSnapshot) pageFetcherSnapshot).stateHolder;
                        mutex = holder.lock;
                        this.L$0 = simpleProducerScope;
                        this.L$1 = remoteMediatorConnection;
                        this.L$2 = holder;
                        this.L$3 = mutex;
                        this.label = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        holder2 = holder;
                    }
                    remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
                }
                this.L$0 = simpleProducerScope;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                doInitialLoad = this.this$0.doInitialLoad(this);
                if (doInitialLoad != coroutine_suspended) {
                    return coroutine_suspended;
                }
                simpleProducerScope2 = simpleProducerScope;
                holder3 = ((PageFetcherSnapshot) this.this$0).stateHolder;
                mutex3 = holder3.lock;
                this.L$0 = simpleProducerScope2;
                this.L$1 = holder3;
                this.L$2 = mutex3;
                this.label = 3;
                if (mutex3.lock(null, this) != coroutine_suspended) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.L$2;
                        holder4 = (PageFetcherSnapshotState.Holder) this.L$1;
                        simpleProducerScope3 = (SimpleProducerScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        try {
                            loadState = holder4.state.getSourceLoadStates().get(LoadType.REFRESH);
                            mutex2.unlock(null);
                            if (!(loadState instanceof LoadState.Error)) {
                                this.this$0.startConsumingHints(simpleProducerScope3);
                            }
                            return Unit.INSTANCE;
                        } finally {
                        }
                    }
                    simpleProducerScope2 = (SimpleProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    holder3 = ((PageFetcherSnapshot) this.this$0).stateHolder;
                    mutex3 = holder3.lock;
                    this.L$0 = simpleProducerScope2;
                    this.L$1 = holder3;
                    this.L$2 = mutex3;
                    this.label = 3;
                    if (mutex3.lock(null, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    simpleProducerScope3 = simpleProducerScope2;
                    mutex2 = mutex3;
                    holder4 = holder3;
                    loadState = holder4.state.getSourceLoadStates().get(LoadType.REFRESH);
                    mutex2.unlock(null);
                    if (!(loadState instanceof LoadState.Error)) {
                    }
                    return Unit.INSTANCE;
                }
                mutex = (Mutex) this.L$3;
                holder2 = (PageFetcherSnapshotState.Holder) this.L$2;
                remoteMediatorConnection = (RemoteMediatorConnection) this.L$1;
                simpleProducerScope = (SimpleProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PagingState currentPagingState$paging_common_release = holder2.state.currentPagingState$paging_common_release(null);
            mutex2.unlock(null);
            pagingState = currentPagingState$paging_common_release;
            remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
            this.L$0 = simpleProducerScope;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            doInitialLoad = this.this$0.doInitialLoad(this);
            if (doInitialLoad != coroutine_suspended) {
            }
        } finally {
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, SimpleProducerScope<PageEvent<Value>> simpleProducerScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$$this$cancelableChannelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PageFetcherSnapshot.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;", "emit", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;

            AnonymousClass1(SimpleProducerScope<PageEvent<Value>> simpleProducerScope) {
                this.$$this$cancelableChannelFlow = simpleProducerScope;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(PageEvent<Value> pageEvent, Continuation<? super Unit> continuation) {
                PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1;
                int i;
                if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) continuation;
                    if ((pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label -= Integer.MIN_VALUE;
                        Object obj = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            SimpleProducerScope<PageEvent<Value>> simpleProducerScope = this.$$this$cancelableChannelFlow;
                            pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label = 1;
                            if (simpleProducerScope.send(pageEvent, pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
                pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, continuation);
                Object obj2 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PageEvent) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Channel channel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                channel = ((PageFetcherSnapshot) this.this$0).pageEventCh;
                this.label = 1;
                if (FlowKt.consumeAsFlow(channel).collect(new AnonymousClass1(this.$$this$cancelableChannelFlow), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Channel<Unit> channel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$retryChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow flow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flow = ((PageFetcherSnapshot) this.this$0).retryFlow;
                final Channel<Unit> channel = this.$retryChannel;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        channel.mo6673trySendJP2dKIU(unit);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Channel<Unit> channel, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$retryChannel = channel;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$retryChannel, this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (FlowKt.consumeAsFlow(this.$retryChannel).collect(new AnonymousClass1(this.this$0, coroutineScope), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PageFetcherSnapshot.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            /* compiled from: PageFetcherSnapshot.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, CoroutineScope coroutineScope) {
                this.this$0 = pageFetcherSnapshot;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Unit) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:104:0x03b3  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x03b7  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0394 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0395  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0336  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0352  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0305  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0169  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x02fc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:148:0x02fd  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x02a5  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x0286 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0287  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0245  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x054d  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x051a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0512 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0513  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x04bd  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x04a0 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x04a1  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0447  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0463  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0415  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x040c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x040d  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1<T>, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v102 */
            /* JADX WARN: Type inference failed for: r12v103 */
            /* JADX WARN: Type inference failed for: r12v105 */
            /* JADX WARN: Type inference failed for: r12v106 */
            /* JADX WARN: Type inference failed for: r12v108 */
            /* JADX WARN: Type inference failed for: r12v109 */
            /* JADX WARN: Type inference failed for: r12v16, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v43, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r12v74, types: [kotlinx.coroutines.sync.Mutex] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
                PageFetcherSnapshotState.Holder holder;
                PageFetcherSnapshot pageFetcherSnapshot;
                AnonymousClass1 anonymousClass1;
                Mutex mutex;
                HintHandler hintHandler;
                LoadStates loadStates;
                RemoteMediatorConnection remoteMediatorConnection;
                PageFetcherSnapshot pageFetcherSnapshot2;
                CoroutineScope coroutineScope;
                LoadType loadType;
                LoadStates loadStates2;
                PageFetcherSnapshot pageFetcherSnapshot3;
                CoroutineScope coroutineScope2;
                LoadType loadType2;
                PageFetcherSnapshotState.Holder holder2;
                LoadStates loadStates3;
                Mutex mutex2;
                CoroutineScope coroutineScope3;
                PageFetcherSnapshotState.Holder holder3;
                Object loading;
                CoroutineScope coroutineScope4;
                PageFetcherSnapshot pageFetcherSnapshot4;
                PageFetcherSnapshotState.Holder holder4;
                Mutex mutex3;
                PageFetcherSnapshot pageFetcherSnapshot5;
                LoadType loadType3;
                PageFetcherSnapshot pageFetcherSnapshot6;
                LoadType loadType4;
                ViewportHint viewportHint;
                Object retryLoadError;
                PageFetcherSnapshot pageFetcherSnapshot7;
                LoadType loadType5;
                CoroutineScope coroutineScope5;
                LoadStates loadStates4;
                PageFetcherSnapshotState.Holder holder5;
                Mutex mutex4;
                LoadType loadType6;
                LoadStates loadStates5;
                PageFetcherSnapshot pageFetcherSnapshot8;
                CoroutineScope coroutineScope6;
                LoadType loadType7;
                PageFetcherSnapshotState.Holder holder6;
                LoadStates loadStates6;
                Mutex mutex5;
                CoroutineScope coroutineScope7;
                PageFetcherSnapshotState.Holder holder7;
                LoadState loadState;
                Object loading2;
                CoroutineScope coroutineScope8;
                PageFetcherSnapshot pageFetcherSnapshot9;
                PageFetcherSnapshotState.Holder holder8;
                Mutex mutex6;
                PageFetcherSnapshot pageFetcherSnapshot10;
                LoadType loadType8;
                PageFetcherSnapshot pageFetcherSnapshot11;
                LoadType loadType9;
                ViewportHint viewportHint2;
                Object retryLoadError2;
                PageFetcherSnapshot pageFetcherSnapshot12;
                LoadType loadType10;
                CoroutineScope coroutineScope9;
                LoadStates loadStates7;
                PageFetcherSnapshotState.Holder holder9;
                Mutex mutex7;
                LoadType loadType11;
                PageFetcherSnapshot pageFetcherSnapshot13;
                CoroutineScope coroutineScope10;
                LoadType loadType12;
                PageFetcherSnapshotState.Holder holder10;
                PageFetcherSnapshotState.Holder holder11;
                Mutex mutex8;
                CoroutineScope coroutineScope11;
                LoadState loadState2;
                Object loading3;
                CoroutineScope coroutineScope12;
                PageFetcherSnapshot pageFetcherSnapshot14;
                PageFetcherSnapshotState.Holder holder12;
                Mutex mutex9;
                PageFetcherSnapshot pageFetcherSnapshot15;
                LoadType loadType13;
                PageFetcherSnapshot pageFetcherSnapshot16;
                LoadType loadType14;
                ViewportHint viewportHint3;
                Object retryLoadError3;
                PageFetcherSnapshot pageFetcherSnapshot17;
                LoadType loadType15;
                CoroutineScope coroutineScope13;
                PageFetcherSnapshotState.Holder holder13;
                PageFetcherSnapshotState.Holder holder14;
                Mutex mutex10;
                PageFetcherSnapshot pageFetcherSnapshot18;
                LoadState loadState3;
                try {
                    try {
                        try {
                            if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) continuation;
                                if ((pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label -= Integer.MIN_VALUE;
                                    Object obj = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label) {
                                        case 0:
                                            ResultKt.throwOnFailure(obj);
                                            holder = this.this$0.stateHolder;
                                            pageFetcherSnapshot = this.this$0;
                                            Mutex mutex11 = holder.lock;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = this;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = holder;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = pageFetcherSnapshot;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutex11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 1;
                                            if (mutex11.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            anonymousClass1 = this;
                                            mutex = mutex11;
                                            try {
                                                PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
                                                LoadStates snapshot = pageFetcherSnapshotState.getSourceLoadStates().snapshot();
                                                hintHandler = pageFetcherSnapshot.hintHandler;
                                                Pair pair = TuplesKt.to(snapshot, pageFetcherSnapshotState.currentPagingState$paging_common_release(hintHandler.getLastAccessHint()));
                                                mutex.unlock(null);
                                                loadStates = (LoadStates) pair.component1();
                                                PagingState pagingState = (PagingState) pair.component2();
                                                remoteMediatorConnection = anonymousClass1.this$0.getRemoteMediatorConnection();
                                                if (remoteMediatorConnection != null) {
                                                    remoteMediatorConnection.retryFailed(pagingState);
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                                pageFetcherSnapshot2 = anonymousClass1.this$0;
                                                coroutineScope = anonymousClass1.$$this$launch;
                                                loadType = LoadType.REFRESH;
                                                if (loadStates.getRefresh() instanceof LoadState.Error) {
                                                    if (loadType != LoadType.REFRESH) {
                                                        holder2 = pageFetcherSnapshot2.stateHolder;
                                                        Mutex mutex12 = holder2.lock;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex12;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 2;
                                                        if (mutex12.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadStates3 = loadStates;
                                                        mutex2 = mutex12;
                                                        coroutineScope3 = coroutineScope;
                                                        holder3 = holder2;
                                                        PageFetcherSnapshotState pageFetcherSnapshotState2 = holder3.state;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope3;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 3;
                                                        loading = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState2, loadType, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                        if (loading != coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadType2 = loadType;
                                                        coroutineScope4 = coroutineScope3;
                                                        pageFetcherSnapshot4 = pageFetcherSnapshot2;
                                                        this = mutex2;
                                                        Unit unit3 = Unit.INSTANCE;
                                                        ((Mutex) this).unlock(null);
                                                        coroutineScope2 = coroutineScope4;
                                                        pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                                        loadStates2 = loadStates3;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                                            pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                                            loadType4 = loadType2;
                                                            viewportHint = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                                            retryLoadError = pageFetcherSnapshot6.retryLoadError(loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (retryLoadError == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot7 = pageFetcherSnapshot3;
                                                            loadType5 = loadType2;
                                                            coroutineScope5 = coroutineScope2;
                                                            loadStates4 = loadStates2;
                                                            if (loadType5 == LoadType.REFRESH) {
                                                                holder5 = pageFetcherSnapshot7.stateHolder;
                                                                mutex4 = holder5.lock;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates4;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot7;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex4;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                                                if (mutex4.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                try {
                                                                    loadState = holder5.state.getSourceLoadStates().get(LoadType.REFRESH);
                                                                    mutex4.unlock(null);
                                                                    if (!(loadState instanceof LoadState.Error)) {
                                                                        pageFetcherSnapshot7.startConsumingHints(coroutineScope5);
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                            coroutineScope = coroutineScope5;
                                                            pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                                            loadStates = loadStates4;
                                                        } else {
                                                            holder4 = pageFetcherSnapshot3.stateHolder;
                                                            mutex3 = holder4.lock;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder4;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = pageFetcherSnapshot3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                                            if (mutex3.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                                            loadType3 = loadType2;
                                                            try {
                                                                ViewportHint viewportHint4 = holder4.state.getFailedHintsByLoadType$paging_common_release().get(loadType3);
                                                                mutex3.unlock(null);
                                                                viewportHint = viewportHint4;
                                                                loadType4 = loadType2;
                                                                loadType2 = loadType3;
                                                                pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                                                pageFetcherSnapshot3 = pageFetcherSnapshot5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType2;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                                                retryLoadError = pageFetcherSnapshot6.retryLoadError(loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                                if (retryLoadError == coroutine_suspended) {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        loadStates2 = loadStates;
                                                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                        coroutineScope2 = coroutineScope;
                                                        loadType2 = loadType;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                                        }
                                                    }
                                                }
                                                loadType6 = LoadType.PREPEND;
                                                if (loadStates.getPrepend() instanceof LoadState.Error) {
                                                    if (loadType6 != LoadType.REFRESH) {
                                                        holder6 = pageFetcherSnapshot2.stateHolder;
                                                        Mutex mutex13 = holder6.lock;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex13;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                                        if (mutex13.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadStates6 = loadStates;
                                                        mutex5 = mutex13;
                                                        coroutineScope7 = coroutineScope;
                                                        holder7 = holder6;
                                                        PageFetcherSnapshotState pageFetcherSnapshotState3 = holder7.state;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope7;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex5;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                                        loading2 = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState3, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                        if (loading2 != coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadType7 = loadType6;
                                                        coroutineScope8 = coroutineScope7;
                                                        pageFetcherSnapshot9 = pageFetcherSnapshot2;
                                                        this = mutex5;
                                                        Unit unit4 = Unit.INSTANCE;
                                                        ((Mutex) this).unlock(null);
                                                        coroutineScope6 = coroutineScope8;
                                                        pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                                        loadStates5 = loadStates6;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                            pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                                            loadType9 = loadType7;
                                                            viewportHint2 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates5;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope6;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType7;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                                            retryLoadError2 = pageFetcherSnapshot11.retryLoadError(loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (retryLoadError2 == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot12 = pageFetcherSnapshot8;
                                                            loadType10 = loadType7;
                                                            coroutineScope9 = coroutineScope6;
                                                            loadStates7 = loadStates5;
                                                            if (loadType10 == LoadType.REFRESH) {
                                                                holder9 = pageFetcherSnapshot12.stateHolder;
                                                                mutex7 = holder9.lock;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates7;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot12;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope9;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder9;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex7;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                                                if (mutex7.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                try {
                                                                    loadState2 = holder9.state.getSourceLoadStates().get(LoadType.REFRESH);
                                                                    mutex7.unlock(null);
                                                                    if (!(loadState2 instanceof LoadState.Error)) {
                                                                        pageFetcherSnapshot12.startConsumingHints(coroutineScope9);
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                            coroutineScope = coroutineScope9;
                                                            pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                                            loadStates = loadStates7;
                                                        } else {
                                                            holder8 = pageFetcherSnapshot8.stateHolder;
                                                            mutex6 = holder8.lock;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates5;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope6;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType7;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = holder8;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutex6;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType7;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = pageFetcherSnapshot8;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                                            if (mutex6.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot10 = pageFetcherSnapshot8;
                                                            loadType8 = loadType7;
                                                            try {
                                                                ViewportHint viewportHint5 = holder8.state.getFailedHintsByLoadType$paging_common_release().get(loadType8);
                                                                mutex6.unlock(null);
                                                                viewportHint2 = viewportHint5;
                                                                loadType9 = loadType7;
                                                                loadType7 = loadType8;
                                                                pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                                                pageFetcherSnapshot8 = pageFetcherSnapshot10;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates5;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope6;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType7;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                                                retryLoadError2 = pageFetcherSnapshot11.retryLoadError(loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                                if (retryLoadError2 == coroutine_suspended) {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        loadStates5 = loadStates;
                                                        pageFetcherSnapshot8 = pageFetcherSnapshot2;
                                                        coroutineScope6 = coroutineScope;
                                                        loadType7 = loadType6;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                        }
                                                    }
                                                }
                                                loadType11 = LoadType.APPEND;
                                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                                    if (loadType11 != LoadType.REFRESH) {
                                                        holder10 = pageFetcherSnapshot2.stateHolder;
                                                        Mutex mutex14 = holder10.lock;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType11;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder10;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex14;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                                        if (mutex14.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        CoroutineScope coroutineScope14 = coroutineScope;
                                                        holder11 = holder10;
                                                        mutex8 = mutex14;
                                                        coroutineScope11 = coroutineScope14;
                                                        PageFetcherSnapshotState pageFetcherSnapshotState4 = holder11.state;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope11;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType11;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutex8;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                                        loading3 = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState4, loadType11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                        if (loading3 != coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadType12 = loadType11;
                                                        coroutineScope12 = coroutineScope11;
                                                        pageFetcherSnapshot14 = pageFetcherSnapshot2;
                                                        this = mutex8;
                                                        Unit unit5 = Unit.INSTANCE;
                                                        ((Mutex) this).unlock(null);
                                                        coroutineScope10 = coroutineScope12;
                                                        pageFetcherSnapshot13 = pageFetcherSnapshot14;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                            pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                                            loadType14 = loadType12;
                                                            viewportHint3 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot13;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope10;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType12;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                            retryLoadError3 = pageFetcherSnapshot16.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (retryLoadError3 == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot17 = pageFetcherSnapshot13;
                                                            loadType15 = loadType12;
                                                            coroutineScope13 = coroutineScope10;
                                                            if (loadType15 == LoadType.REFRESH) {
                                                                holder13 = pageFetcherSnapshot17.stateHolder;
                                                                Mutex mutex15 = holder13.lock;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot17;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope13;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = holder13;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutex15;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                                if (mutex15.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                holder14 = holder13;
                                                                mutex10 = mutex15;
                                                                pageFetcherSnapshot18 = pageFetcherSnapshot17;
                                                                try {
                                                                    loadState3 = holder14.state.getSourceLoadStates().get(LoadType.REFRESH);
                                                                    mutex10.unlock(null);
                                                                    if (!(loadState3 instanceof LoadState.Error)) {
                                                                        pageFetcherSnapshot18.startConsumingHints(coroutineScope13);
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        } else {
                                                            holder12 = pageFetcherSnapshot13.stateHolder;
                                                            mutex9 = holder12.lock;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot13;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope10;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType12;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = holder12;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex9;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType12;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = pageFetcherSnapshot13;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                            if (mutex9.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            pageFetcherSnapshot15 = pageFetcherSnapshot13;
                                                            loadType13 = loadType12;
                                                            try {
                                                                ViewportHint viewportHint6 = holder12.state.getFailedHintsByLoadType$paging_common_release().get(loadType13);
                                                                mutex9.unlock(null);
                                                                viewportHint3 = viewportHint6;
                                                                loadType14 = loadType12;
                                                                loadType12 = loadType13;
                                                                pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                                                pageFetcherSnapshot13 = pageFetcherSnapshot15;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot13;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope10;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType12;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                                retryLoadError3 = pageFetcherSnapshot16.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                                if (retryLoadError3 == coroutine_suspended) {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        pageFetcherSnapshot13 = pageFetcherSnapshot2;
                                                        coroutineScope10 = coroutineScope;
                                                        loadType12 = loadType11;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            } finally {
                                            }
                                        case 1:
                                            mutex = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            anonymousClass1 = (AnonymousClass1) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            PageFetcherSnapshotState pageFetcherSnapshotState5 = holder.state;
                                            LoadStates snapshot2 = pageFetcherSnapshotState5.getSourceLoadStates().snapshot();
                                            hintHandler = pageFetcherSnapshot.hintHandler;
                                            Pair pair2 = TuplesKt.to(snapshot2, pageFetcherSnapshotState5.currentPagingState$paging_common_release(hintHandler.getLastAccessHint()));
                                            mutex.unlock(null);
                                            loadStates = (LoadStates) pair2.component1();
                                            PagingState pagingState2 = (PagingState) pair2.component2();
                                            remoteMediatorConnection = anonymousClass1.this$0.getRemoteMediatorConnection();
                                            if (remoteMediatorConnection != null) {
                                            }
                                            pageFetcherSnapshot2 = anonymousClass1.this$0;
                                            coroutineScope = anonymousClass1.$$this$launch;
                                            loadType = LoadType.REFRESH;
                                            if (loadStates.getRefresh() instanceof LoadState.Error) {
                                            }
                                            loadType6 = LoadType.PREPEND;
                                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                            }
                                            loadType11 = LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        case 2:
                                            Mutex mutex16 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            loadType = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope3 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            PageFetcherSnapshot pageFetcherSnapshot19 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            LoadStates loadStates8 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot19;
                                            loadStates3 = loadStates8;
                                            mutex2 = mutex16;
                                            PageFetcherSnapshotState pageFetcherSnapshotState22 = holder3.state;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 3;
                                            loading = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState22, loadType, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (loading != coroutine_suspended) {
                                            }
                                            break;
                                        case 3:
                                            boolean z = (AnonymousClass1<T>) ((Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4);
                                            loadType2 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope4 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates3 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            this = z;
                                            Unit unit32 = Unit.INSTANCE;
                                            ((Mutex) this).unlock(null);
                                            coroutineScope2 = coroutineScope4;
                                            pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                            loadStates2 = loadStates3;
                                            if (WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            }
                                            break;
                                        case 4:
                                            pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                            loadType2 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                            mutex3 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                            holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            loadType3 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope2 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates2 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            ViewportHint viewportHint42 = holder4.state.getFailedHintsByLoadType$paging_common_release().get(loadType3);
                                            mutex3.unlock(null);
                                            viewportHint = viewportHint42;
                                            loadType4 = loadType2;
                                            loadType2 = loadType3;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                            pageFetcherSnapshot3 = pageFetcherSnapshot5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                            retryLoadError = pageFetcherSnapshot6.retryLoadError(loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (retryLoadError == coroutine_suspended) {
                                            }
                                            break;
                                        case 5:
                                            loadType5 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            CoroutineScope coroutineScope15 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            PageFetcherSnapshot pageFetcherSnapshot20 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            LoadStates loadStates9 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            loadStates4 = loadStates9;
                                            pageFetcherSnapshot7 = pageFetcherSnapshot20;
                                            coroutineScope5 = coroutineScope15;
                                            if (loadType5 == LoadType.REFRESH) {
                                            }
                                            coroutineScope = coroutineScope5;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                            loadStates = loadStates4;
                                            loadType6 = LoadType.PREPEND;
                                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                            }
                                            loadType11 = LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        case 6:
                                            mutex4 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope5 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates4 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            loadState = holder5.state.getSourceLoadStates().get(LoadType.REFRESH);
                                            mutex4.unlock(null);
                                            if (!(loadState instanceof LoadState.Error)) {
                                            }
                                            coroutineScope = coroutineScope5;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                            loadStates = loadStates4;
                                            loadType6 = LoadType.PREPEND;
                                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                            }
                                            loadType11 = LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        case 7:
                                            Mutex mutex17 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                            holder7 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            loadType6 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope7 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            PageFetcherSnapshot pageFetcherSnapshot21 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            LoadStates loadStates10 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot21;
                                            loadStates6 = loadStates10;
                                            mutex5 = mutex17;
                                            PageFetcherSnapshotState pageFetcherSnapshotState32 = holder7.state;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutex5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                            loading2 = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState32, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (loading2 != coroutine_suspended) {
                                            }
                                            break;
                                        case 8:
                                            boolean z2 = (AnonymousClass1<T>) ((Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4);
                                            loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope8 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot9 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates6 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            this = z2;
                                            Unit unit42 = Unit.INSTANCE;
                                            ((Mutex) this).unlock(null);
                                            coroutineScope6 = coroutineScope8;
                                            pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                            loadStates5 = loadStates6;
                                            if (WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            }
                                            break;
                                        case 9:
                                            pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                            loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                            mutex6 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                            holder8 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            loadType8 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope6 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot10 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates5 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            ViewportHint viewportHint52 = holder8.state.getFailedHintsByLoadType$paging_common_release().get(loadType8);
                                            mutex6.unlock(null);
                                            viewportHint2 = viewportHint52;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                            pageFetcherSnapshot8 = pageFetcherSnapshot10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = loadStates5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = pageFetcherSnapshot8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = coroutineScope6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                            retryLoadError2 = pageFetcherSnapshot11.retryLoadError(loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (retryLoadError2 == coroutine_suspended) {
                                            }
                                            break;
                                        case 10:
                                            loadType10 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            CoroutineScope coroutineScope16 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            PageFetcherSnapshot pageFetcherSnapshot22 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            LoadStates loadStates11 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            loadStates7 = loadStates11;
                                            pageFetcherSnapshot12 = pageFetcherSnapshot22;
                                            coroutineScope9 = coroutineScope16;
                                            if (loadType10 == LoadType.REFRESH) {
                                            }
                                            coroutineScope = coroutineScope9;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                            loadStates = loadStates7;
                                            loadType11 = LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        case 11:
                                            mutex7 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            holder9 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            coroutineScope9 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            pageFetcherSnapshot12 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            loadStates7 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            loadState2 = holder9.state.getSourceLoadStates().get(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(loadState2 instanceof LoadState.Error)) {
                                            }
                                            coroutineScope = coroutineScope9;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                            loadStates = loadStates7;
                                            loadType11 = LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                            }
                                            return Unit.INSTANCE;
                                        case 12:
                                            Mutex mutex18 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            holder11 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            loadType11 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            coroutineScope11 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            PageFetcherSnapshot pageFetcherSnapshot23 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot23;
                                            mutex8 = mutex18;
                                            PageFetcherSnapshotState pageFetcherSnapshotState42 = holder11.state;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutex8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            loading3 = pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState42, loadType11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (loading3 != coroutine_suspended) {
                                            }
                                            break;
                                        case 13:
                                            boolean z3 = (AnonymousClass1<T>) ((Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3);
                                            loadType12 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            coroutineScope12 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            pageFetcherSnapshot14 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            this = z3;
                                            Unit unit52 = Unit.INSTANCE;
                                            ((Mutex) this).unlock(null);
                                            coroutineScope10 = coroutineScope12;
                                            pageFetcherSnapshot13 = pageFetcherSnapshot14;
                                            if (WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                            }
                                            break;
                                        case 14:
                                            pageFetcherSnapshot13 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                            loadType12 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                            mutex9 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                            holder12 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            loadType13 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            coroutineScope10 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            pageFetcherSnapshot15 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            ViewportHint viewportHint62 = holder12.state.getFailedHintsByLoadType$paging_common_release().get(loadType13);
                                            mutex9.unlock(null);
                                            viewportHint3 = viewportHint62;
                                            loadType14 = loadType12;
                                            loadType12 = loadType13;
                                            pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                            pageFetcherSnapshot13 = pageFetcherSnapshot15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = pageFetcherSnapshot13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = coroutineScope10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType12;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            retryLoadError3 = pageFetcherSnapshot16.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (retryLoadError3 == coroutine_suspended) {
                                            }
                                            break;
                                        case 15:
                                            loadType15 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            coroutineScope13 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            pageFetcherSnapshot17 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            if (loadType15 == LoadType.REFRESH) {
                                            }
                                            return Unit.INSTANCE;
                                        case 16:
                                            mutex10 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                            holder14 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                            coroutineScope13 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                            pageFetcherSnapshot18 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            loadState3 = holder14.state.getSourceLoadStates().get(LoadType.REFRESH);
                                            mutex10.unlock(null);
                                            if (!(loadState3 instanceof LoadState.Error)) {
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                            }
                            switch (pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label) {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, continuation);
                Object obj2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
    }
}
