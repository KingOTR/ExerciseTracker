package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$3$1$1", f = "GymTabContent.kt", i = {}, l = {397, 404, 405, 406}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$3$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $exName;
    final /* synthetic */ MutableIntState $heatmapDays$delegate;
    final /* synthetic */ MutableState<Map<String, Double>> $muscleKgByGroup$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $muscleLookup$delegate;
    final /* synthetic */ List<String> $muscles;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ boolean $uni;
    final /* synthetic */ MutableState<List<String>> $untaggedExercises$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$3$3$1$1(List<String> list, Repository repository, String str, boolean z, MutableState<Map<String, String>> mutableState, MutableState<List<String>> mutableState2, MutableIntState mutableIntState, MutableState<Map<String, Double>> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$20$1$3$3$1$1> continuation) {
        super(2, continuation);
        this.$muscles = list;
        this.$repo = repository;
        this.$exName = str;
        this.$uni = z;
        this.$muscleLookup$delegate = mutableState;
        this.$untaggedExercises$delegate = mutableState2;
        this.$heatmapDays$delegate = mutableIntState;
        this.$muscleKgByGroup$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$3$3$1$1(this.$muscles, this.$repo, this.$exName, this.$uni, this.$muscleLookup$delegate, this.$untaggedExercises$delegate, this.$heatmapDays$delegate, this.$muscleKgByGroup$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$3$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState<Map<String, String>> mutableState;
        MutableState<List<String>> mutableState2;
        int GymTabContent$lambda$76;
        Object muscleLoadKgByGroup;
        MutableState<Map<String, Double>> mutableState3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) CollectionsKt.getOrNull(this.$muscles, 0);
            if (str == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (this.$repo.setExerciseMuscleGroups(this.$exName, str, (String) CollectionsKt.getOrNull(this.$muscles, 1), (String) CollectionsKt.getOrNull(this.$muscles, 2), this.$uni, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState3 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState3.setValue((Map) obj);
                    return Unit.INSTANCE;
                }
                mutableState2 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue((List) obj);
                MutableState<Map<String, Double>> mutableState4 = this.$muscleKgByGroup$delegate;
                Repository repository = this.$repo;
                GymTabContent$lambda$76 = GymTabContentKt.GymTabContent$lambda$76(this.$heatmapDays$delegate);
                this.L$0 = mutableState4;
                this.label = 4;
                muscleLoadKgByGroup = repository.muscleLoadKgByGroup(GymTabContent$lambda$76, this);
                if (muscleLoadKgByGroup == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = muscleLoadKgByGroup;
                mutableState3 = mutableState4;
                mutableState3.setValue((Map) obj);
                return Unit.INSTANCE;
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableState.setValue((Map) obj);
            mutableState2 = this.$untaggedExercises$delegate;
            this.L$0 = mutableState2;
            this.label = 3;
            obj = this.$repo.untaggedExerciseNames(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState2.setValue((List) obj);
            MutableState<Map<String, Double>> mutableState42 = this.$muscleKgByGroup$delegate;
            Repository repository2 = this.$repo;
            GymTabContent$lambda$76 = GymTabContentKt.GymTabContent$lambda$76(this.$heatmapDays$delegate);
            this.L$0 = mutableState42;
            this.label = 4;
            muscleLoadKgByGroup = repository2.muscleLoadKgByGroup(GymTabContent$lambda$76, this);
            if (muscleLoadKgByGroup == coroutine_suspended) {
            }
        }
        mutableState = this.$muscleLookup$delegate;
        this.L$0 = mutableState;
        this.label = 2;
        obj = this.$repo.muscleGroupLookup(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableState.setValue((Map) obj);
        mutableState2 = this.$untaggedExercises$delegate;
        this.L$0 = mutableState2;
        this.label = 3;
        obj = this.$repo.untaggedExerciseNames(this);
        if (obj == coroutine_suspended) {
        }
        mutableState2.setValue((List) obj);
        MutableState<Map<String, Double>> mutableState422 = this.$muscleKgByGroup$delegate;
        Repository repository22 = this.$repo;
        GymTabContent$lambda$76 = GymTabContentKt.GymTabContent$lambda$76(this.$heatmapDays$delegate);
        this.L$0 = mutableState422;
        this.label = 4;
        muscleLoadKgByGroup = repository22.muscleLoadKgByGroup(GymTabContent$lambda$76, this);
        if (muscleLoadKgByGroup == coroutine_suspended) {
        }
    }
}
