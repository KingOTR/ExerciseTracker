package com.example.rungps.ui;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ExerciseTrackerLocals.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalExerciseTrackerUseCases", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "getLocalExerciseTrackerUseCases", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerLocalsKt {
    private static final ProvidableCompositionLocal<ExerciseTrackerUseCases> LocalExerciseTrackerUseCases = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.example.rungps.ui.ExerciseTrackerLocalsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExerciseTrackerUseCases LocalExerciseTrackerUseCases$lambda$0;
            LocalExerciseTrackerUseCases$lambda$0 = ExerciseTrackerLocalsKt.LocalExerciseTrackerUseCases$lambda$0();
            return LocalExerciseTrackerUseCases$lambda$0;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<ExerciseTrackerUseCases> getLocalExerciseTrackerUseCases() {
        return LocalExerciseTrackerUseCases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExerciseTrackerUseCases LocalExerciseTrackerUseCases$lambda$0() {
        throw new IllegalStateException("ExerciseTrackerUseCases not provided — wrap UI in LocalExerciseTrackerUseCases".toString());
    }
}
