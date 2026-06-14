package com.example.rungps.ui.sleep;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.health.SleepScoring;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$20 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $deepMinText$delegate;
    final /* synthetic */ MutableState<String> $endText$delegate;
    final /* synthetic */ MutableState<String> $lightMinText$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showAdd$delegate;
    final /* synthetic */ MutableState<String> $sourceText$delegate;
    final /* synthetic */ MutableState<String> $startText$delegate;
    final /* synthetic */ MutableState<String> $totalMinText$delegate;
    final /* synthetic */ ExerciseTrackerUseCases $useCases;

    SleepTabScreenBodyKt$SleepTabScreenBody$20(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Context context, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, CoroutineScope coroutineScope, ExerciseTrackerUseCases exerciseTrackerUseCases, MutableState<Boolean> mutableState7) {
        this.$startText$delegate = mutableState;
        this.$endText$delegate = mutableState2;
        this.$totalMinText$delegate = mutableState3;
        this.$ctx = context;
        this.$deepMinText$delegate = mutableState4;
        this.$lightMinText$delegate = mutableState5;
        this.$sourceText$delegate = mutableState6;
        this.$scope = coroutineScope;
        this.$useCases = exerciseTrackerUseCases;
        this.$showAdd$delegate = mutableState7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-515204640, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:694)");
        }
        composer.startReplaceGroup(-1961581575);
        boolean changed = composer.changed(this.$startText$delegate) | composer.changed(this.$endText$delegate) | composer.changed(this.$totalMinText$delegate) | composer.changedInstance(this.$ctx) | composer.changed(this.$deepMinText$delegate) | composer.changed(this.$lightMinText$delegate) | composer.changed(this.$sourceText$delegate) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$useCases);
        final Context context = this.$ctx;
        final CoroutineScope coroutineScope = this.$scope;
        final MutableState<String> mutableState = this.$startText$delegate;
        final MutableState<String> mutableState2 = this.$endText$delegate;
        final MutableState<String> mutableState3 = this.$totalMinText$delegate;
        final MutableState<String> mutableState4 = this.$deepMinText$delegate;
        final MutableState<String> mutableState5 = this.$lightMinText$delegate;
        final MutableState<String> mutableState6 = this.$sourceText$delegate;
        final MutableState<Boolean> mutableState7 = this.$showAdd$delegate;
        final ExerciseTrackerUseCases exerciseTrackerUseCases = this.$useCases;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$20$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = SleepTabScreenBodyKt$SleepTabScreenBody$20.invoke$lambda$2$lambda$1(context, coroutineScope, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, exerciseTrackerUseCases);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7535getLambda4$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.time.ZonedDateTime] */
    public static final Unit invoke$lambda$2$lambda$1(Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, ExerciseTrackerUseCases exerciseTrackerUseCases) {
        String SleepTabScreenBody$lambda$24;
        LocalTime SleepTabScreenBody$parseBedWake;
        String SleepTabScreenBody$lambda$28;
        LocalTime SleepTabScreenBody$parseBedWake2;
        String SleepTabScreenBody$lambda$32;
        String SleepTabScreenBody$lambda$36;
        String SleepTabScreenBody$lambda$40;
        String SleepTabScreenBody$lambda$44;
        int resolveQuality;
        SleepTabScreenBody$lambda$24 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$24(mutableState);
        SleepTabScreenBody$parseBedWake = SleepTabScreenBodyKt.SleepTabScreenBody$parseBedWake(SleepTabScreenBody$lambda$24);
        SleepTabScreenBody$lambda$28 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$28(mutableState2);
        SleepTabScreenBody$parseBedWake2 = SleepTabScreenBodyKt.SleepTabScreenBody$parseBedWake(SleepTabScreenBody$lambda$28);
        SleepTabScreenBody$lambda$32 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$32(mutableState3);
        Integer intOrNull = StringsKt.toIntOrNull(SleepTabScreenBody$lambda$32);
        if (SleepTabScreenBody$parseBedWake == null || SleepTabScreenBody$parseBedWake2 == null || intOrNull == null || intOrNull.intValue() <= 0) {
            Toast.makeText(context, "Enter valid bed/wake times and asleep minutes", 1).show();
            return Unit.INSTANCE;
        }
        LocalDate now = LocalDate.now();
        ZoneId systemDefault = ZoneId.systemDefault();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = now.atTime(SleepTabScreenBody$parseBedWake).atZone(systemDefault).toInstant().toEpochMilli();
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = now.atTime(SleepTabScreenBody$parseBedWake2).atZone(systemDefault).toInstant().toEpochMilli();
        if (longRef2.element <= longRef.element) {
            longRef.element = now.minusDays(1L).atTime(SleepTabScreenBody$parseBedWake).atZone(systemDefault).toInstant().toEpochMilli();
            longRef2.element = now.atTime(SleepTabScreenBody$parseBedWake2).atZone(systemDefault).toInstant().toEpochMilli();
        }
        int coerceAtLeast = (int) (RangesKt.coerceAtLeast(longRef2.element - longRef.element, 1L) / 60000);
        SleepTabScreenBody$lambda$36 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$36(mutableState4);
        Integer intOrNull2 = StringsKt.toIntOrNull(SleepTabScreenBody$lambda$36);
        SleepTabScreenBody$lambda$40 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$40(mutableState5);
        Integer intOrNull3 = StringsKt.toIntOrNull(SleepTabScreenBody$lambda$40);
        Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(null, intOrNull.intValue(), coerceAtLeast, intOrNull2, intOrNull3);
        SleepTabScreenBody$lambda$44 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$44(mutableState6);
        String obj = StringsKt.trim((CharSequence) SleepTabScreenBody$lambda$44).toString();
        if (obj.length() == 0) {
            obj = "manual";
        }
        String str = obj;
        resolveQuality = SleepScoring.INSTANCE.resolveQuality(str, intOrNull.intValue(), (r18 & 4) != 0 ? null : intOrNull2, (r18 & 8) != 0 ? null : intOrNull3, (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : null);
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$18(mutableState7, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SleepTabScreenBodyKt$SleepTabScreenBody$20$1$1$1(exerciseTrackerUseCases, longRef, longRef2, intOrNull, intOrNull2, intOrNull3, resolveEfficiency, resolveQuality, str, null), 2, null);
        return Unit.INSTANCE;
    }
}
