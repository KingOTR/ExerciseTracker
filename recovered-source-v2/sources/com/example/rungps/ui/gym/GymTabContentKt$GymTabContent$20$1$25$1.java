package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.LiveGymSessionLoad;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$25$1", f = "GymTabContent.kt", i = {1, 2, 2}, l = {982, 983, 984}, m = "invokeSuspend", n = {"sec", "sec", "ter"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$25$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Map<String, Float>> $liveRecoveryRegions$delegate;
    final /* synthetic */ MutableState<Map<String, Float>> $liveVolumeRegions$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $muscleLookup$delegate;
    final /* synthetic */ GymSessionEntity $openGymSession;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ String $sessionDayName;
    final /* synthetic */ State<List<GymSetEntity>> $sessionSets$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$20$1$25$1(String str, GymSessionEntity gymSessionEntity, Repository repository, State<? extends List<GymSetEntity>> state, MutableState<Map<String, String>> mutableState, MutableState<Map<String, Float>> mutableState2, MutableState<Map<String, Float>> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$20$1$25$1> continuation) {
        super(2, continuation);
        this.$sessionDayName = str;
        this.$openGymSession = gymSessionEntity;
        this.$repo = repository;
        this.$sessionSets$delegate = state;
        this.$muscleLookup$delegate = mutableState;
        this.$liveVolumeRegions$delegate = mutableState2;
        this.$liveRecoveryRegions$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$25$1(this.$sessionDayName, this.$openGymSession, this.$repo, this.$sessionSets$delegate, this.$muscleLookup$delegate, this.$liveVolumeRegions$delegate, this.$liveRecoveryRegions$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$25$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        Object withContext;
        Map<String, String> map2;
        Map<String, String> map3;
        List<GymSetEntity> invoke$lambda$264$lambda$92;
        Map<String, String> GymTabContent$lambda$109;
        List<GymSetEntity> invoke$lambda$264$lambda$922;
        Map<String, String> GymTabContent$lambda$1092;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$20$1$25$1$sec$1(this.$repo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map<String, String> map4 = (Map) this.L$1;
                    Map<String, String> map5 = (Map) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    map2 = map4;
                    map3 = map5;
                    Map<String, Boolean> map6 = (Map) obj;
                    MutableState<Map<String, Float>> mutableState = this.$liveVolumeRegions$delegate;
                    LiveGymSessionLoad liveGymSessionLoad = LiveGymSessionLoad.INSTANCE;
                    invoke$lambda$264$lambda$92 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(this.$sessionSets$delegate);
                    String str = this.$sessionDayName;
                    GymTabContent$lambda$109 = GymTabContentKt.GymTabContent$lambda$109(this.$muscleLookup$delegate);
                    mutableState.setValue(liveGymSessionLoad.volumeFromSets(invoke$lambda$264$lambda$92, str, GymTabContent$lambda$109, map3, map2, map6).getByRegion());
                    MutableState<Map<String, Float>> mutableState2 = this.$liveRecoveryRegions$delegate;
                    LiveGymSessionLoad liveGymSessionLoad2 = LiveGymSessionLoad.INSTANCE;
                    invoke$lambda$264$lambda$922 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(this.$sessionSets$delegate);
                    GymSessionEntity gymSessionEntity = this.$openGymSession;
                    long startedAtMs = gymSessionEntity == null ? gymSessionEntity.getStartedAtMs() : System.currentTimeMillis();
                    String str2 = this.$sessionDayName;
                    GymTabContent$lambda$1092 = GymTabContentKt.GymTabContent$lambda$109(this.$muscleLookup$delegate);
                    mutableState2.setValue(liveGymSessionLoad2.recoveryRegionsFromSets(invoke$lambda$264$lambda$922, startedAtMs, str2, GymTabContent$lambda$1092, map3, map2));
                    return Unit.INSTANCE;
                }
                map = (Map) this.L$0;
                ResultKt.throwOnFailure(obj);
                Map<String, String> map7 = (Map) obj;
                this.L$0 = map;
                this.L$1 = map7;
                this.label = 3;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$20$1$25$1$uni$1(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                map2 = map7;
                map3 = map;
                obj = withContext;
                Map<String, Boolean> map62 = (Map) obj;
                MutableState<Map<String, Float>> mutableState3 = this.$liveVolumeRegions$delegate;
                LiveGymSessionLoad liveGymSessionLoad3 = LiveGymSessionLoad.INSTANCE;
                invoke$lambda$264$lambda$92 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(this.$sessionSets$delegate);
                String str3 = this.$sessionDayName;
                GymTabContent$lambda$109 = GymTabContentKt.GymTabContent$lambda$109(this.$muscleLookup$delegate);
                mutableState3.setValue(liveGymSessionLoad3.volumeFromSets(invoke$lambda$264$lambda$92, str3, GymTabContent$lambda$109, map3, map2, map62).getByRegion());
                MutableState<Map<String, Float>> mutableState22 = this.$liveRecoveryRegions$delegate;
                LiveGymSessionLoad liveGymSessionLoad22 = LiveGymSessionLoad.INSTANCE;
                invoke$lambda$264$lambda$922 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(this.$sessionSets$delegate);
                GymSessionEntity gymSessionEntity2 = this.$openGymSession;
                if (gymSessionEntity2 == null) {
                }
                String str22 = this.$sessionDayName;
                GymTabContent$lambda$1092 = GymTabContentKt.GymTabContent$lambda$109(this.$muscleLookup$delegate);
                mutableState22.setValue(liveGymSessionLoad22.recoveryRegionsFromSets(invoke$lambda$264$lambda$922, startedAtMs, str22, GymTabContent$lambda$1092, map3, map2));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Map<String, String> map8 = (Map) obj;
        this.L$0 = map8;
        this.label = 2;
        Object withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$20$1$25$1$ter$1(this.$repo, null), this);
        if (withContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        map = map8;
        obj = withContext2;
        Map<String, String> map72 = (Map) obj;
        this.L$0 = map;
        this.L$1 = map72;
        this.label = 3;
        withContext = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$20$1$25$1$uni$1(this.$repo, null), this);
        if (withContext != coroutine_suspended) {
        }
    }
}
