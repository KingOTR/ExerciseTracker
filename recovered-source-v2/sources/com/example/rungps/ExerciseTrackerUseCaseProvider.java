package com.example.rungps;

import android.content.Context;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RepositoryExerciseTrackerGateway;
import com.example.rungps.domain.HomeAnalyticsPortImpl;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseTrackerUseCaseProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/example/rungps/ExerciseTrackerUseCaseProvider;", "", "<init>", "()V", "cached", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "get", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerUseCaseProvider {
    private static volatile ExerciseTrackerUseCases cached;
    public static final ExerciseTrackerUseCaseProvider INSTANCE = new ExerciseTrackerUseCaseProvider();
    public static final int $stable = 8;

    private ExerciseTrackerUseCaseProvider() {
    }

    public final ExerciseTrackerUseCases get(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExerciseTrackerUseCases exerciseTrackerUseCases = cached;
        if (exerciseTrackerUseCases != null) {
            return exerciseTrackerUseCases;
        }
        synchronized (this) {
            ExerciseTrackerUseCases exerciseTrackerUseCases2 = cached;
            if (exerciseTrackerUseCases2 != null) {
                return exerciseTrackerUseCases2;
            }
            final Context applicationContext = context.getApplicationContext();
            Repository.Companion companion = Repository.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            ExerciseTrackerUseCases exerciseTrackerUseCases3 = new ExerciseTrackerUseCases(new RepositoryExerciseTrackerGateway(companion.get(applicationContext)), new HomeAnalyticsPortImpl(), new Function0() { // from class: com.example.rungps.ExerciseTrackerUseCaseProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    str = ExerciseTrackerUseCaseProvider.get$lambda$3$lambda$2(applicationContext);
                    return str;
                }
            });
            cached = exerciseTrackerUseCases3;
            return exerciseTrackerUseCases3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String get$lambda$3$lambda$2(Context context) {
        SportTrackingPrefs sportTrackingPrefs = SportTrackingPrefs.INSTANCE;
        Intrinsics.checkNotNull(context);
        return sportTrackingPrefs.displayName(context);
    }
}
