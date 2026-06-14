package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.ReadinessInputs;
import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.ui.components.ReadyToTrainBadgeKt;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.navigation.MainTab;
import com.example.rungps.ui.sleep.SleepFormattersKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeRecoveryHub.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HomeRecoveryHubKt$HomeRecoveryHub$4$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ DeloadAdvice $deloadAdvice;
    final /* synthetic */ Function1<String, Unit> $goTab;
    final /* synthetic */ ReadinessInputs.LastNight $lastNight;
    final /* synthetic */ ReadyToTrainAssessment $readyAssessment;
    final /* synthetic */ State<List<SleepEntryEntity>> $sleepRecent$delegate;
    final /* synthetic */ State<DailyStepsEntity> $todaySteps$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HomeRecoveryHubKt$HomeRecoveryHub$4$1(ReadyToTrainAssessment readyToTrainAssessment, DeloadAdvice deloadAdvice, Function1<? super String, Unit> function1, ReadinessInputs.LastNight lastNight, State<? extends List<SleepEntryEntity>> state, State<DailyStepsEntity> state2) {
        this.$readyAssessment = readyToTrainAssessment;
        this.$deloadAdvice = deloadAdvice;
        this.$goTab = function1;
        this.$lastNight = lastNight;
        this.$sleepRecent$delegate = state;
        this.$todaySteps$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        DailyStepsEntity HomeRecoveryHub$lambda$7;
        String str;
        List HomeRecoveryHub$lambda$8;
        Object next;
        int resolveQuality;
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456183142, i, -1, "com.example.rungps.ui.main.HomeRecoveryHub.<anonymous>.<anonymous> (HomeRecoveryHub.kt:131)");
        }
        ReadyToTrainBadgeKt.ReadyToTrainBadge(this.$readyAssessment, null, composer, 0, 2);
        composer.startReplaceGroup(-1670991241);
        if (this.$deloadAdvice.getRecommended()) {
            TextKt.m2376Text4IGK_g("Deload suggested", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 196614, 0, 65498);
        }
        composer.endReplaceGroup();
        ReadinessInputs.LastNight lastNight = this.$lastNight;
        State<List<SleepEntryEntity>> state = this.$sleepRecent$delegate;
        State<DailyStepsEntity> state2 = this.$todaySteps$delegate;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (lastNight.getTotalSleepMin() != null) {
            Integer quality = lastNight.getQuality();
            if (quality == null) {
                HomeRecoveryHub$lambda$8 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$8(state);
                Iterator it = HomeRecoveryHub$lambda$8.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long endTimeMs = ((SleepEntryEntity) next).getEndTimeMs();
                        do {
                            Object next2 = it.next();
                            long endTimeMs2 = ((SleepEntryEntity) next2).getEndTimeMs();
                            if (endTimeMs < endTimeMs2) {
                                next = next2;
                                endTimeMs = endTimeMs2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) next;
                if (sleepEntryEntity != null) {
                    resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity.getSource(), sleepEntryEntity.getTotalSleepMin(), (r18 & 4) != 0 ? null : sleepEntryEntity.getDeepSleepMin(), (r18 & 8) != 0 ? null : sleepEntryEntity.getLightSleepMin(), (r18 & 16) != 0 ? null : sleepEntryEntity.getSleepEfficiency(), (r18 & 32) != 0 ? null : Integer.valueOf((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000)), (r18 & 64) != 0 ? null : null);
                    quality = Integer.valueOf(resolveQuality);
                } else {
                    quality = null;
                }
            }
            Integer totalSleepMin = lastNight.getTotalSleepMin();
            Intrinsics.checkNotNull(totalSleepMin);
            String formatDurationMinutes = SleepFormattersKt.formatDurationMinutes(totalSleepMin.intValue());
            if (quality == null || (str = quality.toString()) == null) {
                str = "—";
            }
            createListBuilder.add(new Triple("Sleep", formatDurationMinutes, str));
        }
        HomeRecoveryHub$lambda$7 = HomeRecoveryHubKt.HomeRecoveryHub$lambda$7(state2);
        if (HomeRecoveryHub$lambda$7 != null) {
            createListBuilder.add(new Triple("Steps", String.valueOf(HomeRecoveryHub$lambda$7.getSteps()), "today"));
        }
        List build = CollectionsKt.build(createListBuilder);
        composer.startReplaceGroup(-1670950814);
        if (!build.isEmpty()) {
            TabUiKt.MetricRow(null, build, composer, 0, 1);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1670946841);
        boolean changed = composer.changed(this.$goTab);
        final Function1<String, Unit> function1 = this.$goTab;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = HomeRecoveryHubKt$HomeRecoveryHub$4$1.invoke$lambda$5$lambda$4(Function1.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$HomeRecoveryHubKt.INSTANCE.m7208getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(MainTab.Recovery.getRoute());
        return Unit.INSTANCE;
    }
}
