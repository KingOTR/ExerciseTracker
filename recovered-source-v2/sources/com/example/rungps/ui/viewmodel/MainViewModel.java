package com.example.rungps.ui.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.rungps.ExerciseTrackerUseCaseProvider;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.core.domain.usecase.ObserveGymVolumeRegionsUseCase;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.feature.gym.GymViewModel;
import com.example.rungps.feature.home.HomeViewModel;
import com.example.rungps.feature.run.RunsViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R#\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0&¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*¨\u00060"}, d2 = {"Lcom/example/rungps/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "useCasesLazy", "Lkotlin/Lazy;", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "useCasesResult", "Lkotlin/Result;", "useCasesResult-d1pmJ48", "()Ljava/lang/Object;", "useCases", "getUseCases", "()Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "repository", "Lcom/example/rungps/data/Repository;", "getRepository", "()Lcom/example/rungps/data/Repository;", "repository$delegate", "Lkotlin/Lazy;", "runs", "Lcom/example/rungps/feature/run/RunsViewModel;", "getRuns", "()Lcom/example/rungps/feature/run/RunsViewModel;", "runs$delegate", "home", "Lcom/example/rungps/feature/home/HomeViewModel;", "getHome", "()Lcom/example/rungps/feature/home/HomeViewModel;", "home$delegate", "gym", "Lcom/example/rungps/feature/gym/GymViewModel;", "getGym", "()Lcom/example/rungps/feature/gym/GymViewModel;", "gym$delegate", "gymSessions", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/rungps/data/GymSessionEntity;", "getGymSessions", "()Lkotlinx/coroutines/flow/StateFlow;", "gymLoadRegions", "", "", "", "getGymLoadRegions", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    /* renamed from: gym$delegate, reason: from kotlin metadata */
    private final Lazy gym;
    private final StateFlow<Map<String, Float>> gymLoadRegions;
    private final StateFlow<List<GymSessionEntity>> gymSessions;

    /* renamed from: home$delegate, reason: from kotlin metadata */
    private final Lazy home;

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final Lazy repository;

    /* renamed from: runs$delegate, reason: from kotlin metadata */
    private final Lazy runs;
    private final Lazy<ExerciseTrackerUseCases> useCasesLazy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(final Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.useCasesLazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.example.rungps.ui.viewmodel.MainViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExerciseTrackerUseCases useCasesLazy$lambda$0;
                useCasesLazy$lambda$0 = MainViewModel.useCasesLazy$lambda$0(app);
                return useCasesLazy$lambda$0;
            }
        });
        this.repository = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.example.rungps.ui.viewmodel.MainViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Repository repository_delegate$lambda$2;
                repository_delegate$lambda$2 = MainViewModel.repository_delegate$lambda$2(app);
                return repository_delegate$lambda$2;
            }
        });
        this.runs = LazyKt.lazy(new Function0() { // from class: com.example.rungps.ui.viewmodel.MainViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RunsViewModel runs_delegate$lambda$3;
                runs_delegate$lambda$3 = MainViewModel.runs_delegate$lambda$3(MainViewModel.this);
                return runs_delegate$lambda$3;
            }
        });
        this.home = LazyKt.lazy(new Function0() { // from class: com.example.rungps.ui.viewmodel.MainViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeViewModel home_delegate$lambda$4;
                home_delegate$lambda$4 = MainViewModel.home_delegate$lambda$4(MainViewModel.this);
                return home_delegate$lambda$4;
            }
        });
        this.gym = LazyKt.lazy(new Function0() { // from class: com.example.rungps.ui.viewmodel.MainViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GymViewModel gym_delegate$lambda$5;
                gym_delegate$lambda$5 = MainViewModel.gym_delegate$lambda$5(MainViewModel.this);
                return gym_delegate$lambda$5;
            }
        });
        MainViewModel mainViewModel = this;
        this.gymSessions = FlowKt.stateIn(getUseCases().getObserveGymSessions().invoke(), ViewModelKt.getViewModelScope(mainViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.gymLoadRegions = FlowKt.stateIn(ObserveGymVolumeRegionsUseCase.invoke$default(getUseCases().getObserveGymVolumeRegions(), 0, 1, null), ViewModelKt.getViewModelScope(mainViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), MapsKt.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExerciseTrackerUseCases useCasesLazy$lambda$0(Application application) {
        return ExerciseTrackerUseCaseProvider.INSTANCE.get(application);
    }

    /* renamed from: useCasesResult-d1pmJ48, reason: not valid java name */
    public final Object m7662useCasesResultd1pmJ48() {
        try {
            Result.Companion companion = Result.INSTANCE;
            MainViewModel mainViewModel = this;
            return Result.m7905constructorimpl(this.useCasesLazy.getValue());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final ExerciseTrackerUseCases getUseCases() {
        return this.useCasesLazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Repository repository_delegate$lambda$2(Application application) {
        return Repository.INSTANCE.get(application);
    }

    public final Repository getRepository() {
        return (Repository) this.repository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RunsViewModel runs_delegate$lambda$3(MainViewModel mainViewModel) {
        return new RunsViewModel(mainViewModel.getUseCases(), ViewModelKt.getViewModelScope(mainViewModel));
    }

    public final RunsViewModel getRuns() {
        return (RunsViewModel) this.runs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeViewModel home_delegate$lambda$4(MainViewModel mainViewModel) {
        return new HomeViewModel(mainViewModel.getUseCases(), ViewModelKt.getViewModelScope(mainViewModel));
    }

    public final HomeViewModel getHome() {
        return (HomeViewModel) this.home.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymViewModel gym_delegate$lambda$5(MainViewModel mainViewModel) {
        return new GymViewModel(mainViewModel.getUseCases(), ViewModelKt.getViewModelScope(mainViewModel));
    }

    public final GymViewModel getGym() {
        return (GymViewModel) this.gym.getValue();
    }

    public final StateFlow<List<GymSessionEntity>> getGymSessions() {
        return this.gymSessions;
    }

    public final StateFlow<Map<String, Float>> getGymLoadRegions() {
        return this.gymLoadRegions;
    }
}
