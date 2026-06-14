package com.example.rungps.ui.sleep;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.core.domain.usecase.AddSleepEntryUseCase;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.health.SleepScoring;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1", f = "SleepTabScreenBody.kt", i = {1}, l = {530, 531, 563, 567}, m = "invokeSuspend", n = {"imported"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$18$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $didAutoImport$delegate;
    final /* synthetic */ HealthConnectManager $hc;
    final /* synthetic */ MutableState<Boolean> $hcHasSleepPerms$delegate;
    final /* synthetic */ MutableState<Boolean> $importing$delegate;
    final /* synthetic */ ExerciseTrackerUseCases $useCases;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$18$1(HealthConnectManager healthConnectManager, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, ExerciseTrackerUseCases exerciseTrackerUseCases, Context context, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$18$1> continuation) {
        super(2, continuation);
        this.$hc = healthConnectManager;
        this.$didAutoImport$delegate = mutableState;
        this.$hcHasSleepPerms$delegate = mutableState2;
        this.$importing$delegate = mutableState3;
        this.$useCases = exerciseTrackerUseCases;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$18$1(this.$hc, this.$didAutoImport$delegate, this.$hcHasSleepPerms$delegate, this.$importing$delegate, this.$useCases, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$18$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean SleepTabScreenBody$lambda$11;
        boolean SleepTabScreenBody$lambda$4;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Exception e) {
                this.L$0 = null;
                this.label = 4;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$ctx, e, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepTabScreenBody$lambda$11 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$11(this.$didAutoImport$delegate);
                if (SleepTabScreenBody$lambda$11) {
                    return Unit.INSTANCE;
                }
                if (this.$hc.isAvailable()) {
                    SleepTabScreenBody$lambda$4 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$4(this.$hcHasSleepPerms$delegate);
                    if (SleepTabScreenBody$lambda$4) {
                        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$12(this.$didAutoImport$delegate, true);
                        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$8(this.$importing$delegate, true);
                        this.label = 1;
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new SleepTabScreenBodyKt$SleepTabScreenBody$18$1$imported$1(this.$hc, null), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i == 2) {
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$ctx, list, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            list = (List) obj;
            this.L$0 = list;
            this.label = 2;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(list, this.$useCases, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$ctx, list, null), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } finally {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$8(this.$importing$delegate, false);
        }
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {548}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HealthConnectManager.SleepWindow> $imported;
        final /* synthetic */ ExerciseTrackerUseCases $useCases;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<HealthConnectManager.SleepWindow> list, ExerciseTrackerUseCases exerciseTrackerUseCases, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$imported = list;
            this.$useCases = exerciseTrackerUseCases;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$imported, this.$useCases, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ExerciseTrackerUseCases exerciseTrackerUseCases;
            Iterator it;
            int resolveQuality;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List take = CollectionsKt.take(this.$imported, 80);
                exerciseTrackerUseCases = this.$useCases;
                it = take.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                exerciseTrackerUseCases = (ExerciseTrackerUseCases) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                HealthConnectManager.SleepWindow sleepWindow = (HealthConnectManager.SleepWindow) it.next();
                Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(sleepWindow.getEfficiencyPercent(), sleepWindow.getAsleepMin(), sleepWindow.getInBedMin(), sleepWindow.getDeepMin(), sleepWindow.getLightMin());
                resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepWindow.getSource(), sleepWindow.getAsleepMin(), (r18 & 4) != 0 ? null : sleepWindow.getDeepMin(), (r18 & 8) != 0 ? null : sleepWindow.getLightMin(), (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Boxing.boxInt(sleepWindow.getInBedMin()), (r18 & 64) != 0 ? null : null);
                AddSleepEntryUseCase addSleepEntry = exerciseTrackerUseCases.getAddSleepEntry();
                long epochMilli = sleepWindow.getStartTime().toEpochMilli();
                long epochMilli2 = sleepWindow.getEndTime().toEpochMilli();
                int asleepMin = sleepWindow.getAsleepMin();
                Integer deepMin = sleepWindow.getDeepMin();
                Integer lightMin = sleepWindow.getLightMin();
                Integer remMin = sleepWindow.getRemMin();
                SleepEntryEntity sleepEntryEntity = new SleepEntryEntity(0L, epochMilli, epochMilli2, asleepMin, deepMin, lightMin, resolveEfficiency, Boxing.boxInt(resolveQuality), sleepWindow.getSource(), null, null, null, null, null, remMin, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073724929, null);
                this.L$0 = exerciseTrackerUseCases;
                this.L$1 = it;
                this.label = 1;
                if (addSleepEntry.invoke(sleepEntryEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$2", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ List<HealthConnectManager.SleepWindow> $imported;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, List<HealthConnectManager.SleepWindow> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$imported = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$ctx, this.$imported, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$ctx, "Imported " + this.$imported.size() + " nights from Health Connect", 0).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$3", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$18$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Exception $e;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, Exception exc, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$ctx, this.$e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.$ctx;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            Toast.makeText(context, "Sleep import failed: " + message, 0).show();
            return Unit.INSTANCE;
        }
    }
}
