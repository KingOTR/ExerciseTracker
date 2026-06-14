package com.example.rungps;

import android.app.Application;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.gym.GymRestTimerStore;
import com.example.rungps.sleep.BedtimeReminderScheduler;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.widget.WidgetBootstrap;
import com.example.rungps.widget.WidgetRefreshWorker;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.maplibre.android.MapLibre;

/* compiled from: ExerciseTrackerApplication.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/ExerciseTrackerApplication;", "Landroid/app/Application;", "<init>", "()V", "useCases", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "getUseCases", "()Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "useCases$delegate", "Lkotlin/Lazy;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "refreshHomeWidgetsAfterStart", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerApplication extends Application {
    public static final int $stable = 8;

    /* renamed from: useCases$delegate, reason: from kotlin metadata */
    private final Lazy useCases = LazyKt.lazy(new Function0() { // from class: com.example.rungps.ExerciseTrackerApplication$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExerciseTrackerUseCases useCases_delegate$lambda$0;
            useCases_delegate$lambda$0 = ExerciseTrackerApplication.useCases_delegate$lambda$0(ExerciseTrackerApplication.this);
            return useCases_delegate$lambda$0;
        }
    });
    private final CoroutineScope appScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExerciseTrackerUseCases useCases_delegate$lambda$0(ExerciseTrackerApplication exerciseTrackerApplication) {
        return ExerciseTrackerUseCaseProvider.INSTANCE.get(exerciseTrackerApplication);
    }

    public final ExerciseTrackerUseCases getUseCases() {
        return (ExerciseTrackerUseCases) this.useCases.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        try {
            Result.Companion companion = Result.INSTANCE;
            ExerciseTrackerApplication exerciseTrackerApplication = this;
            Result.m7905constructorimpl(MapLibre.getInstance(this));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        ExerciseTrackerApplication exerciseTrackerApplication2 = this;
        AppPreferences.INSTANCE.migrateFromLegacyBlocking(exerciseTrackerApplication2);
        GymRestTimerStore.INSTANCE.pruneStaleIfExpired(exerciseTrackerApplication2);
        WidgetBootstrap.INSTANCE.onApplicationStart(exerciseTrackerApplication2);
        refreshHomeWidgetsAfterStart();
        WidgetRefreshWorker.INSTANCE.enqueuePeriodic(exerciseTrackerApplication2);
        try {
            Result.Companion companion3 = Result.INSTANCE;
            ExerciseTrackerApplication exerciseTrackerApplication3 = this;
            BedtimeReminderScheduler.INSTANCE.scheduleNext(this);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        CrashLog.INSTANCE.install(exerciseTrackerApplication2);
        if (SleepOvernightStore.INSTANCE.isActive(exerciseTrackerApplication2) && !SleepListenService.INSTANCE.isRunningInProcess()) {
            SleepOvernightStore.INSTANCE.recordHealth(exerciseTrackerApplication2, "app_start_session_without_service");
            try {
                Result.Companion companion5 = Result.INSTANCE;
                ExerciseTrackerApplication exerciseTrackerApplication4 = this;
                SleepListenService.INSTANCE.resumeIfSessionActive(this);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
        }
        getUseCases();
    }

    private final void refreshHomeWidgetsAfterStart() {
        BuildersKt__Builders_commonKt.launch$default(this.appScope, null, null, new ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1(this, null), 3, null);
    }
}
