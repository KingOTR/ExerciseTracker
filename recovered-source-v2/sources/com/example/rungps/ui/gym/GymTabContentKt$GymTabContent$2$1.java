package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.MuscleVolumeHeatmap;
import com.example.rungps.data.ExercisePr;
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
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1", f = "GymTabContent.kt", i = {}, l = {143, 144, 145, 146, 147, 148}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $heatmapDays$delegate;
    final /* synthetic */ MutableState<Map<String, Double>> $muscleKgByGroup$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $muscleLookup$delegate;
    final /* synthetic */ MutableState<MuscleVolumeHeatmap> $progressHeatmap$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<List<ExercisePr>> $topPrs$delegate;
    final /* synthetic */ MutableState<Map<String, Boolean>> $unilateralLookup$delegate;
    final /* synthetic */ MutableState<List<String>> $untaggedExercises$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$2$1(Repository repository, MutableState<List<ExercisePr>> mutableState, MutableIntState mutableIntState, MutableState<Map<String, Double>> mutableState2, MutableState<MuscleVolumeHeatmap> mutableState3, MutableState<List<String>> mutableState4, MutableState<Map<String, String>> mutableState5, MutableState<Map<String, Boolean>> mutableState6, Continuation<? super GymTabContentKt$GymTabContent$2$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$topPrs$delegate = mutableState;
        this.$heatmapDays$delegate = mutableIntState;
        this.$muscleKgByGroup$delegate = mutableState2;
        this.$progressHeatmap$delegate = mutableState3;
        this.$untaggedExercises$delegate = mutableState4;
        this.$muscleLookup$delegate = mutableState5;
        this.$unilateralLookup$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$2$1(this.$repo, this.$topPrs$delegate, this.$heatmapDays$delegate, this.$muscleKgByGroup$delegate, this.$progressHeatmap$delegate, this.$untaggedExercises$delegate, this.$muscleLookup$delegate, this.$unilateralLookup$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/ExercisePr;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$1", f = "GymTabContent.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ExercisePr>>, Object> {
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ExercisePr>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ExercisePr>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ExercisePr>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.allPrsHeaviestPerExercise(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState<List<ExercisePr>> mutableState;
        MutableState<Map<String, Double>> mutableState2;
        MutableState<MuscleVolumeHeatmap> mutableState3;
        MutableState<List<String>> mutableState4;
        MutableState<Map<String, String>> mutableState5;
        Object withContext;
        MutableState<Map<String, Boolean>> mutableState6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                mutableState = this.$topPrs$delegate;
                this.L$0 = mutableState;
                this.label = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState.setValue((List) obj);
                mutableState2 = this.$muscleKgByGroup$delegate;
                this.L$0 = mutableState2;
                this.label = 2;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, this.$heatmapDays$delegate, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState2.setValue((Map) obj);
                mutableState3 = this.$progressHeatmap$delegate;
                this.L$0 = mutableState3;
                this.label = 3;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(this.$repo, this.$heatmapDays$delegate, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState3.setValue((MuscleVolumeHeatmap) obj);
                mutableState4 = this.$untaggedExercises$delegate;
                this.L$0 = mutableState4;
                this.label = 4;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState4.setValue((List) obj);
                mutableState5 = this.$muscleLookup$delegate;
                this.L$0 = mutableState5;
                this.label = 5;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState7 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState7;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = withContext;
                mutableState6 = mutableState7;
                mutableState6.setValue((Map) obj);
                return Unit.INSTANCE;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState.setValue((List) obj);
                mutableState2 = this.$muscleKgByGroup$delegate;
                this.L$0 = mutableState2;
                this.label = 2;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, this.$heatmapDays$delegate, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState2.setValue((Map) obj);
                mutableState3 = this.$progressHeatmap$delegate;
                this.L$0 = mutableState3;
                this.label = 3;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(this.$repo, this.$heatmapDays$delegate, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState3.setValue((MuscleVolumeHeatmap) obj);
                mutableState4 = this.$untaggedExercises$delegate;
                this.L$0 = mutableState4;
                this.label = 4;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState4.setValue((List) obj);
                mutableState5 = this.$muscleLookup$delegate;
                this.L$0 = mutableState5;
                this.label = 5;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState72 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState72;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                }
                break;
            case 2:
                mutableState2 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue((Map) obj);
                mutableState3 = this.$progressHeatmap$delegate;
                this.L$0 = mutableState3;
                this.label = 3;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(this.$repo, this.$heatmapDays$delegate, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState3.setValue((MuscleVolumeHeatmap) obj);
                mutableState4 = this.$untaggedExercises$delegate;
                this.L$0 = mutableState4;
                this.label = 4;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState4.setValue((List) obj);
                mutableState5 = this.$muscleLookup$delegate;
                this.L$0 = mutableState5;
                this.label = 5;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState722 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState722;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                }
                break;
            case 3:
                mutableState3 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState3.setValue((MuscleVolumeHeatmap) obj);
                mutableState4 = this.$untaggedExercises$delegate;
                this.L$0 = mutableState4;
                this.label = 4;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState4.setValue((List) obj);
                mutableState5 = this.$muscleLookup$delegate;
                this.L$0 = mutableState5;
                this.label = 5;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState7222 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState7222;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                }
                break;
            case 4:
                mutableState4 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState4.setValue((List) obj);
                mutableState5 = this.$muscleLookup$delegate;
                this.L$0 = mutableState5;
                this.label = 5;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.$repo, null), this);
                if (obj == coroutine_suspended) {
                }
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState72222 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState72222;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                }
                break;
            case 5:
                mutableState5 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState5.setValue((Map) obj);
                MutableState<Map<String, Boolean>> mutableState722222 = this.$unilateralLookup$delegate;
                this.L$0 = mutableState722222;
                this.label = 6;
                withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.$repo, null), this);
                if (withContext != coroutine_suspended) {
                }
                break;
            case 6:
                mutableState6 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState6.setValue((Map) obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$2", f = "GymTabContent.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Double>>, Object> {
        final /* synthetic */ MutableIntState $heatmapDays$delegate;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, MutableIntState mutableIntState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$heatmapDays$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$heatmapDays$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Double>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, Double>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, Double>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int GymTabContent$lambda$76;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Repository repository = this.$repo;
                GymTabContent$lambda$76 = GymTabContentKt.GymTabContent$lambda$76(this.$heatmapDays$delegate);
                this.label = 1;
                obj = repository.muscleLoadKgByGroup(GymTabContent$lambda$76, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$3", f = "GymTabContent.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MuscleVolumeHeatmap>, Object> {
        final /* synthetic */ MutableIntState $heatmapDays$delegate;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Repository repository, MutableIntState mutableIntState, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$heatmapDays$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$repo, this.$heatmapDays$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MuscleVolumeHeatmap> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int GymTabContent$lambda$76;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Repository repository = this.$repo;
                GymTabContent$lambda$76 = GymTabContentKt.GymTabContent$lambda$76(this.$heatmapDays$delegate);
                this.label = 1;
                obj = repository.gymVolumeHeatmap(GymTabContent$lambda$76, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$4", f = "GymTabContent.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Repository repository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.untaggedExerciseNames(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$5", f = "GymTabContent.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Repository repository, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.muscleGroupLookup(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$6", f = "GymTabContent.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$2$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Boolean>>, Object> {
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Repository repository, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Boolean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, Boolean>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, Boolean>> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.unilateralLookup(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
