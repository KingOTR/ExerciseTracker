package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepAudioQualityClassifier;
import com.example.rungps.sleep.SleepHealthFusion;
import com.example.rungps.sleep.SleepNapDetector;
import com.example.rungps.sleep.SleepOsaRiskScorer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepSessionFinisher.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0010JR\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/sleep/SleepSessionFinisher;", "", "<init>", "()V", "SOURCE_OVERNIGHT", "", "finishAndSave", "Lcom/example/rungps/data/SleepEntryEntity;", "context", "Landroid/content/Context;", "wakeMood", "", "smartAlarmUsed", "", "endTimeMs", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildNotes", "analysis", "Lcom/example/rungps/sleep/OvernightAnalysis;", "smartAlarm", "fusionNote", "breathNote", "fused", "Lcom/example/rungps/sleep/SleepHealthFusion$FusedNight;", "napHint", "Lcom/example/rungps/sleep/SleepNapDetector$NapHint;", "osaTier", "Lcom/example/rungps/sleep/SleepOsaRiskScorer$Result;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSessionFinisher {
    public static final int $stable = 0;
    public static final SleepSessionFinisher INSTANCE = new SleepSessionFinisher();
    public static final String SOURCE_OVERNIGHT = "rungps_overnight";

    private SleepSessionFinisher() {
    }

    public final Object finishAndSave(Context context, Integer num, Boolean bool, Long l, Continuation<? super SleepEntryEntity> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SleepSessionFinisher$finishAndSave$2(context, bool, l, num, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildNotes(OvernightAnalysis analysis, boolean smartAlarm, String fusionNote, String breathNote, SleepHealthFusion.FusedNight fused, SleepNapDetector.NapHint napHint, SleepOsaRiskScorer.Result osaTier) {
        String reason;
        String sleepAnalyticsJson;
        SleepAnalyticsCompact parse;
        SleepAudioQualityClassifier.NightSummary quality;
        String osaRiskHint;
        Float micCoverageRatio;
        Float stageConfidenceMean;
        ArrayList arrayList = new ArrayList();
        if (smartAlarm) {
            arrayList.add("Smart alarm");
        }
        String str = fusionNote;
        if (str != null && !StringsKt.isBlank(str)) {
            arrayList.add(fusionNote);
        }
        String str2 = breathNote;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            arrayList.add(breathNote);
        }
        if (fused != null && (stageConfidenceMean = fused.getStageConfidenceMean()) != null) {
            arrayList.add("Stage confidence " + ((int) (stageConfidenceMean.floatValue() * 100)) + "%");
        }
        if (fused != null && (micCoverageRatio = fused.getMicCoverageRatio()) != null) {
            arrayList.add("Mic coverage " + ((int) (micCoverageRatio.floatValue() * 100)) + "%");
        }
        if (fused != null && (osaRiskHint = fused.getOsaRiskHint()) != null) {
            if (!Intrinsics.areEqual(osaRiskHint, "elevated")) {
                osaRiskHint = null;
            }
            if (osaRiskHint != null) {
                arrayList.add("Breathing disturbance hint elevated (not a diagnosis)");
            }
        }
        if (osaTier != null) {
            SleepOsaRiskScorer.Result result = osaTier.getTier() != SleepOsaRiskScorer.Tier.INSUFFICIENT_DATA ? osaTier : null;
            if (result != null) {
                arrayList.add("Multi-night wellness tier: " + result.getTier().name());
            }
        }
        if (fused != null && (sleepAnalyticsJson = fused.getSleepAnalyticsJson()) != null && (parse = SleepAnalyticsCompact.INSTANCE.parse(sleepAnalyticsJson)) != null && (quality = parse.getQuality()) != null && !quality.getReliable()) {
            arrayList.add("Respiratory rate unreliable — reposition phone");
        }
        if (napHint != null) {
            SleepNapDetector.NapHint napHint2 = napHint.isLikelyNap() ? napHint : null;
            if (napHint2 != null && (reason = napHint2.getReason()) != null) {
                arrayList.add(reason);
            }
        }
        if (!StringsKt.isBlank(analysis.getQualityHint())) {
            arrayList.add(analysis.getQualityHint());
        }
        if (analysis.getSleepCycles() > 0) {
            arrayList.add("~" + analysis.getSleepCycles() + " sleep cycles (est.)");
        }
        if (analysis.getSnoreEvents() > 0) {
            arrayList.add("Snore/noise events: " + analysis.getSnoreEvents());
        }
        arrayList.add("Restlessness " + analysis.getRestlessnessIndex() + "/100");
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
