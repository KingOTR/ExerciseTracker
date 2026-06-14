package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Collection;
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

/* compiled from: RunTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$28$1", f = "RunTabContent.kt", i = {0, 1}, l = {733, 735}, m = "invokeSuspend", n = {"repo", "gear"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class RunTabContentKt$RunTabContent$7$1$28$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ boolean $homeIsBikePick;
    final /* synthetic */ MutableState<List<GearEntity>> $preStartGear$delegate;
    final /* synthetic */ MutableState<Long> $preStartGearId$delegate;
    final /* synthetic */ MutableState<Map<Long, Double>> $preStartKm$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunTabContentKt$RunTabContent$7$1$28$1(Context context, boolean z, MutableState<List<GearEntity>> mutableState, MutableState<Map<Long, Double>> mutableState2, MutableState<Long> mutableState3, Continuation<? super RunTabContentKt$RunTabContent$7$1$28$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$homeIsBikePick = z;
        this.$preStartGear$delegate = mutableState;
        this.$preStartKm$delegate = mutableState2;
        this.$preStartGearId$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunTabContentKt$RunTabContent$7$1$28$1(this.$ctx, this.$homeIsBikePick, this.$preStartGear$delegate, this.$preStartKm$delegate, this.$preStartGearId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunTabContentKt$RunTabContent$7$1$28$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Repository repository;
        String str;
        MutableState<Map<Long, Double>> mutableState;
        List list;
        Long invoke$lambda$173$lambda$141;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        Long l = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            repository = Repository.INSTANCE.get(this.$ctx);
            if (this.$homeIsBikePick) {
                str = ActivityTypes.BIKE;
            } else {
                str = "RUN";
            }
            this.L$0 = repository;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new RunTabContentKt$RunTabContent$7$1$28$1$gear$1(repository, str, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState.setValue((Map) obj);
                MutableState<Long> mutableState2 = this.$preStartGearId$delegate;
                invoke$lambda$173$lambda$141 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$141(mutableState2);
                if (invoke$lambda$173$lambda$141 != null) {
                    long longValue = invoke$lambda$173$lambda$141.longValue();
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((GearEntity) it.next()).getId() == longValue) {
                                l = invoke$lambda$173$lambda$141;
                                break;
                            }
                        }
                    }
                }
                mutableState2.setValue(l);
                return Unit.INSTANCE;
            }
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List list3 = (List) obj;
        this.$preStartGear$delegate.setValue(list3);
        MutableState<Map<Long, Double>> mutableState3 = this.$preStartKm$delegate;
        this.L$0 = list3;
        this.L$1 = mutableState3;
        this.label = 2;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(list3, repository, null), this);
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableState = mutableState3;
        list = list3;
        obj = withContext;
        mutableState.setValue((Map) obj);
        MutableState<Long> mutableState22 = this.$preStartGearId$delegate;
        invoke$lambda$173$lambda$141 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$141(mutableState22);
        if (invoke$lambda$173$lambda$141 != null) {
        }
        mutableState22.setValue(l);
        return Unit.INSTANCE;
    }

    /* compiled from: RunTabContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$28$1$1", f = "RunTabContent.kt", i = {0}, l = {736}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
    /* renamed from: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$28$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Long, ? extends Double>>, Object> {
        final /* synthetic */ List<GearEntity> $gear;
        final /* synthetic */ Repository $repo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<GearEntity> list, Repository repository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$gear = list;
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$gear, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Long, ? extends Double>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<Long, Double>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<Long, Double>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007d -> B:5:0x007e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Repository repository;
            Map linkedHashMap;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<GearEntity> list = this.$gear;
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
}
