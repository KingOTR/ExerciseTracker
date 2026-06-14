package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.LiveGymSessionLoad;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$5$1", f = "RecoveryTab.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3}, l = {409, 412, 413, 414}, m = "invokeSuspend", n = {"sess", "sess", "dayName", "sess", "dayName", "lookup", "sess", "dayName", "lookup", "sec"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ MutableState<Map<String, Float>> $muscleHeat$delegate;
    final /* synthetic */ Long $openSessionId;
    final /* synthetic */ State<List<GymSetEntity>> $openSets$delegate;
    final /* synthetic */ Repository $repo;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecoveryTabKt$RecoveryTab$6$5$1(Long l, State<? extends List<GymSessionEntity>> state, Repository repository, State<? extends List<GymSetEntity>> state2, MutableState<Map<String, Float>> mutableState, Continuation<? super RecoveryTabKt$RecoveryTab$6$5$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$gymSessions$delegate = state;
        this.$repo = repository;
        this.$openSets$delegate = state2;
        this.$muscleHeat$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$6$5$1(this.$openSessionId, this.$gymSessions$delegate, this.$repo, this.$openSets$delegate, this.$muscleHeat$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$6$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List RecoveryTab$lambda$2;
        Object obj2;
        GymSessionEntity gymSessionEntity;
        String str;
        GymSessionEntity gymSessionEntity2;
        Object withContext;
        Map<String, String> map;
        String str2;
        Object withContext2;
        Map<String, String> map2;
        Map<String, String> map3;
        String str3;
        GymSessionEntity gymSessionEntity3;
        List<GymSetEntity> RecoveryTab$lambda$55$lambda$51;
        Map<String, Float> recoveryRegionsFromSets;
        Map RecoveryTab$lambda$55$lambda$41;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$openSessionId == null) {
                return Unit.INSTANCE;
            }
            RecoveryTab$lambda$2 = RecoveryTabKt.RecoveryTab$lambda$2(this.$gymSessions$delegate);
            Long l = this.$openSessionId;
            Iterator it = RecoveryTab$lambda$2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                long id = ((GymSessionEntity) obj2).getId();
                if (l != null && id == l.longValue()) {
                    break;
                }
            }
            GymSessionEntity gymSessionEntity4 = (GymSessionEntity) obj2;
            if (gymSessionEntity4 == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = gymSessionEntity4;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$dayName$1(gymSessionEntity4, this.$repo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            gymSessionEntity = gymSessionEntity4;
        } else if (i == 1) {
            gymSessionEntity = (GymSessionEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    map = (Map) this.L$2;
                    str2 = (String) this.L$1;
                    gymSessionEntity2 = (GymSessionEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Map<String, String> map4 = (Map) obj;
                    this.L$0 = gymSessionEntity2;
                    this.L$1 = str2;
                    this.L$2 = map;
                    this.L$3 = map4;
                    this.label = 4;
                    withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$ter$1(this.$repo, null), this);
                    if (withContext2 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map4;
                    map3 = map;
                    obj = withContext2;
                    GymSessionEntity gymSessionEntity5 = gymSessionEntity2;
                    str3 = str2;
                    gymSessionEntity3 = gymSessionEntity5;
                    LiveGymSessionLoad liveGymSessionLoad = LiveGymSessionLoad.INSTANCE;
                    RecoveryTab$lambda$55$lambda$51 = RecoveryTabKt.RecoveryTab$lambda$55$lambda$51(this.$openSets$delegate);
                    recoveryRegionsFromSets = liveGymSessionLoad.recoveryRegionsFromSets(RecoveryTab$lambda$55$lambda$51, gymSessionEntity3.getStartedAtMs(), str3, map3, map2, (Map) obj);
                    if (!recoveryRegionsFromSets.isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map<String, String> map5 = (Map) this.L$3;
                Map<String, String> map6 = (Map) this.L$2;
                String str4 = (String) this.L$1;
                gymSessionEntity3 = (GymSessionEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
                map2 = map5;
                map3 = map6;
                str3 = str4;
                LiveGymSessionLoad liveGymSessionLoad2 = LiveGymSessionLoad.INSTANCE;
                RecoveryTab$lambda$55$lambda$51 = RecoveryTabKt.RecoveryTab$lambda$55$lambda$51(this.$openSets$delegate);
                recoveryRegionsFromSets = liveGymSessionLoad2.recoveryRegionsFromSets(RecoveryTab$lambda$55$lambda$51, gymSessionEntity3.getStartedAtMs(), str3, map3, map2, (Map) obj);
                if (!recoveryRegionsFromSets.isEmpty()) {
                    MutableState<Map<String, Float>> mutableState = this.$muscleHeat$delegate;
                    RecoveryTab$lambda$55$lambda$41 = RecoveryTabKt.RecoveryTab$lambda$55$lambda$41(mutableState);
                    Map mutableMap = MapsKt.toMutableMap(RecoveryTab$lambda$55$lambda$41);
                    for (Map.Entry<String, Float> entry : recoveryRegionsFromSets.entrySet()) {
                        String key = entry.getKey();
                        float floatValue = entry.getValue().floatValue();
                        Float f = (Float) mutableMap.get(key);
                        mutableMap.put(key, Boxing.boxFloat((f != null ? f.floatValue() : 0.0f) + floatValue));
                    }
                    mutableState.setValue(mutableMap);
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            gymSessionEntity2 = (GymSessionEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            Map<String, String> map7 = (Map) obj;
            this.L$0 = gymSessionEntity2;
            this.L$1 = str;
            this.L$2 = map7;
            this.label = 3;
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$sec$1(this.$repo, null), this);
            if (withContext != coroutine_suspended) {
                return coroutine_suspended;
            }
            String str5 = str;
            map = map7;
            obj = withContext;
            str2 = str5;
            Map<String, String> map42 = (Map) obj;
            this.L$0 = gymSessionEntity2;
            this.L$1 = str2;
            this.L$2 = map;
            this.L$3 = map42;
            this.label = 4;
            withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$ter$1(this.$repo, null), this);
            if (withContext2 != coroutine_suspended) {
            }
        }
        String str6 = (String) obj;
        this.L$0 = gymSessionEntity;
        this.L$1 = str6;
        this.label = 2;
        Object withContext3 = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$lookup$1(this.$repo, null), this);
        if (withContext3 == coroutine_suspended) {
            return coroutine_suspended;
        }
        GymSessionEntity gymSessionEntity6 = gymSessionEntity;
        str = str6;
        obj = withContext3;
        gymSessionEntity2 = gymSessionEntity6;
        Map<String, String> map72 = (Map) obj;
        this.L$0 = gymSessionEntity2;
        this.L$1 = str;
        this.L$2 = map72;
        this.label = 3;
        withContext = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$6$5$1$sec$1(this.$repo, null), this);
        if (withContext != coroutine_suspended) {
        }
    }
}
