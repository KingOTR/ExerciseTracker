package com.example.rungps.ui.gear;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GearManagementScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$1$1", f = "GearManagementScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GearManagementScreenKt$GearManagementScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<GearEntity>> $allGear$delegate;
    final /* synthetic */ MutableState<Map<Long, Double>> $kmById$delegate;
    final /* synthetic */ Repository $repo;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GearManagementScreenKt$GearManagementScreen$1$1(State<? extends List<GearEntity>> state, Repository repository, MutableState<Map<Long, Double>> mutableState, Continuation<? super GearManagementScreenKt$GearManagementScreen$1$1> continuation) {
        super(2, continuation);
        this.$allGear$delegate = state;
        this.$repo = repository;
        this.$kmById$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GearManagementScreenKt$GearManagementScreen$1$1(this.$allGear$delegate, this.$repo, this.$kmById$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GearManagementScreenKt$GearManagementScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GearManagementScreen.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$1$1$1", f = "GearManagementScreen.kt", i = {0}, l = {57}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
    /* renamed from: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Long, ? extends Double>>, Object> {
        final /* synthetic */ State<List<GearEntity>> $allGear$delegate;
        final /* synthetic */ Repository $repo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(State<? extends List<GearEntity>> state, Repository repository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$allGear$delegate = state;
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$allGear$delegate, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Long, ? extends Double>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<Long, Double>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<Long, Double>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0081 -> B:5:0x0082). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List GearManagementScreen$lambda$1;
            Repository repository;
            Map linkedHashMap;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GearManagementScreen$lambda$1 = GearManagementScreenKt.GearManagementScreen$lambda$1(this.$allGear$delegate);
                List list = GearManagementScreen$lambda$1;
                Repository repository2 = this.$repo;
                repository = repository2;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                it = list.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Long boxLong = (Long) this.L$4;
                linkedHashMap = (Map) this.L$3;
                it = (Iterator) this.L$2;
                Map map = (Map) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                Pair pair = TuplesKt.to(boxLong, obj);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                linkedHashMap = map;
                if (it.hasNext()) {
                    GearEntity gearEntity = (GearEntity) it.next();
                    boxLong = Boxing.boxLong(gearEntity.getId());
                    long id = gearEntity.getId();
                    this.L$0 = repository;
                    this.L$1 = linkedHashMap;
                    this.L$2 = it;
                    this.L$3 = linkedHashMap;
                    this.L$4 = boxLong;
                    this.label = 1;
                    obj = repository.gearTotalKm(id, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap;
                    Pair pair2 = TuplesKt.to(boxLong, obj);
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                    linkedHashMap = map;
                    if (it.hasNext()) {
                        return linkedHashMap;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<Map<Long, Double>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<Map<Long, Double>> mutableState2 = this.$kmById$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$allGear$delegate, this.$repo, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((Map) obj);
        return Unit.INSTANCE;
    }
}
