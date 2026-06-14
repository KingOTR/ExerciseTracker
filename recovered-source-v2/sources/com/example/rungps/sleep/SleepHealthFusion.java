package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.gym.GymSessionTiming;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.sleep.SleepAnalyticsCompact;
import com.example.rungps.sleep.SleepAudioQualityClassifier;
import com.example.rungps.sleep.SleepBreathingDisruptionAnalyzer;
import com.example.rungps.sleep.SleepMicCoverage;
import com.example.rungps.sleep.SleepStageInference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepHealthFusion.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J/\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/SleepHealthFusion;", "", "<init>", "()V", "finishMicNight", "Lcom/example/rungps/sleep/SleepHealthFusion$FusedNight;", "context", "Landroid/content/Context;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "startedMs", "", "endedMs", "smartAlarmUsed", "", "(Landroid/content/Context;Ljava/util/List;JJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackedMinutesFromSamples", "", "estimateOsaHint", "", "breathMean", "", "analytics", "Lcom/example/rungps/sleep/SleepAnalyticsCompact;", "(Ljava/util/List;Ljava/lang/Float;Lcom/example/rungps/sleep/SleepAnalyticsCompact;)Ljava/lang/String;", "FusedNight", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepHealthFusion {
    public static final int $stable = 0;
    public static final SleepHealthFusion INSTANCE = new SleepHealthFusion();

    private SleepHealthFusion() {
    }

    /* compiled from: SleepHealthFusion.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008c\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00065"}, d2 = {"Lcom/example/rungps/sleep/SleepHealthFusion$FusedNight;", "", "analysis", "Lcom/example/rungps/sleep/OvernightAnalysis;", "hypnogramCompact", "", "eventMarkersCompact", "fusionNote", "fusedWithHc", "", "stageConfidenceMean", "", "micCoverageRatio", "fusionSource", "breathRateMean", "osaRiskHint", "sleepAnalyticsJson", "<init>", "(Lcom/example/rungps/sleep/OvernightAnalysis;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getAnalysis", "()Lcom/example/rungps/sleep/OvernightAnalysis;", "getHypnogramCompact", "()Ljava/lang/String;", "getEventMarkersCompact", "getFusionNote", "getFusedWithHc", "()Z", "getStageConfidenceMean", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMicCoverageRatio", "getFusionSource", "getBreathRateMean", "getOsaRiskHint", "getSleepAnalyticsJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/example/rungps/sleep/OvernightAnalysis;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/example/rungps/sleep/SleepHealthFusion$FusedNight;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FusedNight {
        public static final int $stable = 0;
        private final OvernightAnalysis analysis;
        private final Float breathRateMean;
        private final String eventMarkersCompact;
        private final boolean fusedWithHc;
        private final String fusionNote;
        private final String fusionSource;
        private final String hypnogramCompact;
        private final Float micCoverageRatio;
        private final String osaRiskHint;
        private final String sleepAnalyticsJson;
        private final Float stageConfidenceMean;

        /* renamed from: component1, reason: from getter */
        public final OvernightAnalysis getAnalysis() {
            return this.analysis;
        }

        /* renamed from: component10, reason: from getter */
        public final String getOsaRiskHint() {
            return this.osaRiskHint;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSleepAnalyticsJson() {
            return this.sleepAnalyticsJson;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHypnogramCompact() {
            return this.hypnogramCompact;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEventMarkersCompact() {
            return this.eventMarkersCompact;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFusionNote() {
            return this.fusionNote;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getFusedWithHc() {
            return this.fusedWithHc;
        }

        /* renamed from: component6, reason: from getter */
        public final Float getStageConfidenceMean() {
            return this.stageConfidenceMean;
        }

        /* renamed from: component7, reason: from getter */
        public final Float getMicCoverageRatio() {
            return this.micCoverageRatio;
        }

        /* renamed from: component8, reason: from getter */
        public final String getFusionSource() {
            return this.fusionSource;
        }

        /* renamed from: component9, reason: from getter */
        public final Float getBreathRateMean() {
            return this.breathRateMean;
        }

        public final FusedNight copy(OvernightAnalysis analysis, String hypnogramCompact, String eventMarkersCompact, String fusionNote, boolean fusedWithHc, Float stageConfidenceMean, Float micCoverageRatio, String fusionSource, Float breathRateMean, String osaRiskHint, String sleepAnalyticsJson) {
            Intrinsics.checkNotNullParameter(analysis, "analysis");
            Intrinsics.checkNotNullParameter(fusionSource, "fusionSource");
            return new FusedNight(analysis, hypnogramCompact, eventMarkersCompact, fusionNote, fusedWithHc, stageConfidenceMean, micCoverageRatio, fusionSource, breathRateMean, osaRiskHint, sleepAnalyticsJson);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FusedNight)) {
                return false;
            }
            FusedNight fusedNight = (FusedNight) other;
            return Intrinsics.areEqual(this.analysis, fusedNight.analysis) && Intrinsics.areEqual(this.hypnogramCompact, fusedNight.hypnogramCompact) && Intrinsics.areEqual(this.eventMarkersCompact, fusedNight.eventMarkersCompact) && Intrinsics.areEqual(this.fusionNote, fusedNight.fusionNote) && this.fusedWithHc == fusedNight.fusedWithHc && Intrinsics.areEqual((Object) this.stageConfidenceMean, (Object) fusedNight.stageConfidenceMean) && Intrinsics.areEqual((Object) this.micCoverageRatio, (Object) fusedNight.micCoverageRatio) && Intrinsics.areEqual(this.fusionSource, fusedNight.fusionSource) && Intrinsics.areEqual((Object) this.breathRateMean, (Object) fusedNight.breathRateMean) && Intrinsics.areEqual(this.osaRiskHint, fusedNight.osaRiskHint) && Intrinsics.areEqual(this.sleepAnalyticsJson, fusedNight.sleepAnalyticsJson);
        }

        public int hashCode() {
            int hashCode = this.analysis.hashCode() * 31;
            String str = this.hypnogramCompact;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.eventMarkersCompact;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fusionNote;
            int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.fusedWithHc)) * 31;
            Float f = this.stageConfidenceMean;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.micCoverageRatio;
            int hashCode6 = (((hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31) + this.fusionSource.hashCode()) * 31;
            Float f3 = this.breathRateMean;
            int hashCode7 = (hashCode6 + (f3 == null ? 0 : f3.hashCode())) * 31;
            String str4 = this.osaRiskHint;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sleepAnalyticsJson;
            return hashCode8 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "FusedNight(analysis=" + this.analysis + ", hypnogramCompact=" + this.hypnogramCompact + ", eventMarkersCompact=" + this.eventMarkersCompact + ", fusionNote=" + this.fusionNote + ", fusedWithHc=" + this.fusedWithHc + ", stageConfidenceMean=" + this.stageConfidenceMean + ", micCoverageRatio=" + this.micCoverageRatio + ", fusionSource=" + this.fusionSource + ", breathRateMean=" + this.breathRateMean + ", osaRiskHint=" + this.osaRiskHint + ", sleepAnalyticsJson=" + this.sleepAnalyticsJson + ")";
        }

        public FusedNight(OvernightAnalysis analysis, String str, String str2, String str3, boolean z, Float f, Float f2, String fusionSource, Float f3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(analysis, "analysis");
            Intrinsics.checkNotNullParameter(fusionSource, "fusionSource");
            this.analysis = analysis;
            this.hypnogramCompact = str;
            this.eventMarkersCompact = str2;
            this.fusionNote = str3;
            this.fusedWithHc = z;
            this.stageConfidenceMean = f;
            this.micCoverageRatio = f2;
            this.fusionSource = fusionSource;
            this.breathRateMean = f3;
            this.osaRiskHint = str4;
            this.sleepAnalyticsJson = str5;
        }

        public final OvernightAnalysis getAnalysis() {
            return this.analysis;
        }

        public final String getHypnogramCompact() {
            return this.hypnogramCompact;
        }

        public final String getEventMarkersCompact() {
            return this.eventMarkersCompact;
        }

        public final String getFusionNote() {
            return this.fusionNote;
        }

        public final boolean getFusedWithHc() {
            return this.fusedWithHc;
        }

        public final Float getStageConfidenceMean() {
            return this.stageConfidenceMean;
        }

        public final Float getMicCoverageRatio() {
            return this.micCoverageRatio;
        }

        public /* synthetic */ FusedNight(OvernightAnalysis overnightAnalysis, String str, String str2, String str3, boolean z, Float f, Float f2, String str4, Float f3, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(overnightAnalysis, str, str2, str3, z, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? "mic_only" : str4, (i & 256) != 0 ? null : f3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6);
        }

        public final String getFusionSource() {
            return this.fusionSource;
        }

        public final Float getBreathRateMean() {
            return this.breathRateMean;
        }

        public final String getOsaRiskHint() {
            return this.osaRiskHint;
        }

        public final String getSleepAnalyticsJson() {
            return this.sleepAnalyticsJson;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x040c, code lost:
    
        if (r0.getCoverageRatio() < 0.35f) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0297 A[LOOP:3: B:46:0x0291->B:48:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04c9  */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object[], java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishMicNight(Context context, List<SleepTrackSample> list, long j, long j2, boolean z, Continuation<? super FusedNight> continuation) {
        SleepHealthFusion$finishMicNight$1 sleepHealthFusion$finishMicNight$1;
        int i;
        ArrayList arrayList;
        String encodeFromSamples;
        int i2;
        boolean z2;
        Float f;
        ?? r21;
        SleepHealthFusion sleepHealthFusion;
        Context context2;
        OvernightAnalysis overnightAnalysis;
        SleepStageInference.NightStageResult nightStageResult;
        HealthConnectManager.SleepWindow sleepWindow;
        String str;
        boolean z3;
        OvernightAnalysis overnightAnalysis2;
        List<SleepTrackSample> list2;
        int i3;
        String str2;
        SleepMicCoverage.Snapshot fromSamples;
        Iterator it;
        boolean isEmpty;
        SleepAudioQualityClassifier.NightSummary summarize;
        Iterator it2;
        Float f2;
        boolean z4;
        String str3;
        Object obj;
        ?? r6;
        OvernightAnalysis copy;
        Iterator it3;
        int i4;
        HealthConnectManager.SleepWindow sleepWindow2;
        Iterator it4;
        long j3 = j;
        long j4 = j2;
        if (continuation instanceof SleepHealthFusion$finishMicNight$1) {
            sleepHealthFusion$finishMicNight$1 = (SleepHealthFusion$finishMicNight$1) continuation;
            if ((sleepHealthFusion$finishMicNight$1.label & Integer.MIN_VALUE) != 0) {
                sleepHealthFusion$finishMicNight$1.label -= Integer.MIN_VALUE;
                SleepHealthFusion$finishMicNight$1 sleepHealthFusion$finishMicNight$12 = sleepHealthFusion$finishMicNight$1;
                Object obj2 = sleepHealthFusion$finishMicNight$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepHealthFusion$finishMicNight$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    List<SleepTrackSample> list3 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(SleepUserCalibration.INSTANCE.applyToSample(context, (SleepTrackSample) it5.next()));
                    }
                    arrayList = arrayList2;
                    SleepUserCalibration.INSTANCE.recordNight(context, arrayList);
                    int coerceAtLeast = RangesKt.coerceAtLeast((int) ((j4 - j3) / 60000), 1);
                    SleepStageInference.NightStageResult analyzeNight = SleepStageInference.INSTANCE.analyzeNight(arrayList, coerceAtLeast, context);
                    String encode$default = SleepHypnogramEncoder.encode$default(SleepHypnogramEncoder.INSTANCE, analyzeNight.getHypnogramLabels(), 0, 2, null);
                    encodeFromSamples = SleepEventMarkersEncoder.INSTANCE.encodeFromSamples(arrayList, RangesKt.coerceAtLeast(SleepHypnogramEncoder.INSTANCE.decode(encode$default).size(), coerceAtLeast), SleepHistoryPersonalization.INSTANCE.load(context).getSnoreAudioThreshold());
                    SleepStageInference.StageBreakdown breakdown = analyzeNight.getBreakdown();
                    OvernightAnalysis overnightAnalysis3 = new OvernightAnalysis(breakdown.getTotalSleepMin(), breakdown.getDeepSleepMin(), breakdown.getLightSleepMin(), breakdown.getRemSleepMin(), breakdown.getAwakeSleepMin(), breakdown.getSnoreEvents(), breakdown.getRestlessnessIndex(), breakdown.getTimeToFallAsleepMin(), breakdown.getEfficiency(), breakdown.getSleepCycles(), breakdown.getQualityHint());
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    HealthConnectManager healthConnectManager = new HealthConnectManager(applicationContext);
                    if (healthConnectManager.isAvailable()) {
                        sleepHealthFusion$finishMicNight$12.L$0 = this;
                        sleepHealthFusion$finishMicNight$12.L$1 = context;
                        sleepHealthFusion$finishMicNight$12.L$2 = arrayList;
                        sleepHealthFusion$finishMicNight$12.L$3 = analyzeNight;
                        sleepHealthFusion$finishMicNight$12.L$4 = encode$default;
                        sleepHealthFusion$finishMicNight$12.L$5 = encodeFromSamples;
                        sleepHealthFusion$finishMicNight$12.L$6 = overnightAnalysis3;
                        sleepHealthFusion$finishMicNight$12.J$0 = j3;
                        sleepHealthFusion$finishMicNight$12.J$1 = j4;
                        sleepHealthFusion$finishMicNight$12.I$0 = coerceAtLeast;
                        sleepHealthFusion$finishMicNight$12.label = 1;
                        f = null;
                        z2 = false;
                        z3 = true;
                        overnightAnalysis2 = overnightAnalysis3;
                        Object readSleepSessions$default = HealthConnectManager.readSleepSessions$default(healthConnectManager, 3, null, sleepHealthFusion$finishMicNight$12, 2, null);
                        if (readSleepSessions$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sleepHealthFusion = this;
                        context2 = context;
                        list2 = arrayList;
                        obj2 = readSleepSessions$default;
                        nightStageResult = analyzeNight;
                        i3 = coerceAtLeast;
                        str2 = encode$default;
                    } else {
                        i2 = coerceAtLeast;
                        z2 = false;
                        f = null;
                        r21 = 1;
                        sleepHealthFusion = this;
                        context2 = context;
                        overnightAnalysis = overnightAnalysis3;
                        nightStageResult = analyzeNight;
                        sleepWindow = null;
                        str = encode$default;
                        Pair<Long, Integer> detectGaps = SleepMicCoverage.INSTANCE.detectGaps(arrayList);
                        fromSamples = SleepMicCoverage.INSTANCE.fromSamples(arrayList, i2, detectGaps.component1().longValue() + SleepOvernightStore.INSTANCE.micGapMs(context2), detectGaps.component2().intValue() + SleepOvernightStore.INSTANCE.micGapCount(context2));
                        List<SleepTrackSample> list4 = arrayList;
                        ArrayList arrayList3 = new ArrayList();
                        it = list4.iterator();
                        while (it.hasNext()) {
                            Float stageConfidence = ((SleepTrackSample) it.next()).getStageConfidence();
                            if (stageConfidence != null) {
                                arrayList3.add(stageConfidence);
                            }
                        }
                        ArrayList arrayList4 = arrayList3;
                        isEmpty = arrayList4.isEmpty();
                        Object obj3 = arrayList4;
                        if (isEmpty) {
                            obj3 = f;
                        }
                        Float boxFloat = obj3 != null ? Boxing.boxFloat((float) CollectionsKt.averageOfFloat((Iterable) obj3)) : f;
                        summarize = SleepAudioQualityClassifier.INSTANCE.summarize(arrayList);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : list4) {
                            if (!Intrinsics.areEqual(((SleepTrackSample) obj4).getAudioQualityOk(), Boxing.boxBoolean(z2))) {
                                arrayList5.add(obj4);
                            }
                        }
                        ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                        it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(Boxing.boxFloat(((SleepTrackSample) it2.next()).getBreathRateBpm()));
                        }
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj5 : arrayList7) {
                            float floatValue = ((Number) obj5).floatValue();
                            if (8.0f <= floatValue && floatValue <= 28.0f) {
                                arrayList8.add(obj5);
                            }
                        }
                        ArrayList arrayList9 = arrayList8;
                        if (summarize.getReliable()) {
                            boolean isEmpty2 = arrayList9.isEmpty();
                            Object obj6 = arrayList9;
                            if (isEmpty2) {
                                obj6 = f;
                            }
                            if (obj6 != null) {
                                f2 = Boxing.boxFloat((float) CollectionsKt.averageOfFloat((Iterable) obj6));
                                SleepAnalyticsCompact fromSamples$default = SleepAnalyticsCompact.Companion.fromSamples$default(SleepAnalyticsCompact.INSTANCE, arrayList, RangesKt.coerceAtLeast(nightStageResult.getBreakdown().getTrackedMin(), sleepHealthFusion.trackedMinutesFromSamples(arrayList)), null, 4, null);
                                String estimateOsaHint = sleepHealthFusion.estimateOsaHint(arrayList, f2, fromSamples$default);
                                if (sleepWindow == null) {
                                    boolean z5 = z2;
                                    int coerceAtLeast2 = RangesKt.coerceAtLeast(sleepWindow.getAsleepMin(), z5 ? 1 : 0);
                                    z4 = z5;
                                    if (coerceAtLeast2 > 0) {
                                        Integer deepMin = sleepWindow.getDeepMin();
                                        float f3 = fromSamples.getCoverageRatio() < 0.35f ? 0.15f : (boxFloat == null || boxFloat.floatValue() >= 0.45f) ? 0.4f : 0.25f;
                                        float f4 = 1.0f - f3;
                                        str3 = "hc_primary";
                                        if (deepMin != null) {
                                            Integer remMin = sleepWindow.getRemMin();
                                            int intValue = remMin != null ? remMin.intValue() : z5 ? 1 : 0;
                                            Integer lightMin = sleepWindow.getLightMin();
                                            int intValue2 = lightMin != null ? lightMin.intValue() : z5 ? 1 : 0;
                                            int roundToInt = MathKt.roundToInt((overnightAnalysis.getDeepSleepMin() * f3) + (deepMin.intValue() * f4));
                                            int roundToInt2 = MathKt.roundToInt((overnightAnalysis.getRemSleepMin() * f3) + (intValue * f4));
                                            int coerceAtLeast3 = RangesKt.coerceAtLeast(coerceAtLeast2, roundToInt + roundToInt2 + MathKt.roundToInt((overnightAnalysis.getLightSleepMin() * f3) + (intValue2 * f4)));
                                            Integer efficiencyPercent = sleepWindow.getEfficiencyPercent();
                                            overnightAnalysis = overnightAnalysis.copy((r24 & 1) != 0 ? overnightAnalysis.totalSleepMin : coerceAtLeast3, (r24 & 2) != 0 ? overnightAnalysis.deepSleepMin : roundToInt, (r24 & 4) != 0 ? overnightAnalysis.lightSleepMin : RangesKt.coerceAtLeast((coerceAtLeast3 - roundToInt) - roundToInt2, z5 ? 1 : 0), (r24 & 8) != 0 ? overnightAnalysis.remSleepMin : roundToInt2, (r24 & 16) != 0 ? overnightAnalysis.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis.efficiency : efficiencyPercent != null ? efficiencyPercent.intValue() : overnightAnalysis.getEfficiency(), (r24 & 512) != 0 ? overnightAnalysis.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis.qualityHint : overnightAnalysis.getQualityHint() + " · fused with Health Connect");
                                            str3 = fromSamples.getCoverageRatio() >= 0.35f ? "hc_blend" : "hc_primary";
                                            obj = "Stages blended with Health Connect (watch/band)";
                                            r6 = z5;
                                        } else {
                                            if (coerceAtLeast2 <= overnightAnalysis.getTotalSleepMin()) {
                                                z4 = z5;
                                            }
                                            Integer efficiencyPercent2 = sleepWindow.getEfficiencyPercent();
                                            overnightAnalysis = overnightAnalysis.copy((r24 & 1) != 0 ? overnightAnalysis.totalSleepMin : coerceAtLeast2, (r24 & 2) != 0 ? overnightAnalysis.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis.efficiency : efficiencyPercent2 != null ? efficiencyPercent2.intValue() : overnightAnalysis.getEfficiency(), (r24 & 512) != 0 ? overnightAnalysis.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis.qualityHint : overnightAnalysis.getQualityHint() + " · asleep time from Health Connect");
                                            obj = "Total asleep from Health Connect (watch/band)";
                                            r6 = z5;
                                        }
                                        OvernightAnalysis overnightAnalysis4 = overnightAnalysis;
                                        Object label = fromSamples.getCoverageRatio() < 0.85f ? fromSamples.getLabel() : f;
                                        ?? r8 = new String[2];
                                        r8[r6] = overnightAnalysis4.getQualityHint();
                                        r8[r21] = label;
                                        copy = overnightAnalysis4.copy((r24 & 1) != 0 ? overnightAnalysis4.totalSleepMin : 0, (r24 & 2) != 0 ? overnightAnalysis4.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis4.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis4.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis4.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis4.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis4.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis4.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis4.efficiency : 0, (r24 & 512) != 0 ? overnightAnalysis4.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis4.qualityHint : CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) r8), " · ", null, null, 0, null, null, 62, null));
                                        return new FusedNight(copy, str, !StringsKt.isBlank(encodeFromSamples) ? encodeFromSamples : f, obj, sleepWindow != null ? r21 : r6, boxFloat, Boxing.boxFloat(fromSamples.getCoverageRatio()), str3, f2, estimateOsaHint, fromSamples$default.toJson());
                                    }
                                } else {
                                    z4 = z2;
                                }
                                str3 = "mic_only";
                                obj = f;
                                r6 = z4;
                                OvernightAnalysis overnightAnalysis42 = overnightAnalysis;
                                if (fromSamples.getCoverageRatio() < 0.85f) {
                                }
                                ?? r82 = new String[2];
                                r82[r6] = overnightAnalysis42.getQualityHint();
                                r82[r21] = label;
                                copy = overnightAnalysis42.copy((r24 & 1) != 0 ? overnightAnalysis42.totalSleepMin : 0, (r24 & 2) != 0 ? overnightAnalysis42.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis42.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis42.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis42.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis42.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis42.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis42.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis42.efficiency : 0, (r24 & 512) != 0 ? overnightAnalysis42.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis42.qualityHint : CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) r82), " · ", null, null, 0, null, null, 62, null));
                                return new FusedNight(copy, str, !StringsKt.isBlank(encodeFromSamples) ? encodeFromSamples : f, obj, sleepWindow != null ? r21 : r6, boxFloat, Boxing.boxFloat(fromSamples.getCoverageRatio()), str3, f2, estimateOsaHint, fromSamples$default.toJson());
                            }
                        }
                        f2 = f;
                        SleepAnalyticsCompact fromSamples$default2 = SleepAnalyticsCompact.Companion.fromSamples$default(SleepAnalyticsCompact.INSTANCE, arrayList, RangesKt.coerceAtLeast(nightStageResult.getBreakdown().getTrackedMin(), sleepHealthFusion.trackedMinutesFromSamples(arrayList)), null, 4, null);
                        String estimateOsaHint2 = sleepHealthFusion.estimateOsaHint(arrayList, f2, fromSamples$default2);
                        if (sleepWindow == null) {
                        }
                        str3 = "mic_only";
                        obj = f;
                        r6 = z4;
                        OvernightAnalysis overnightAnalysis422 = overnightAnalysis;
                        if (fromSamples.getCoverageRatio() < 0.85f) {
                        }
                        ?? r822 = new String[2];
                        r822[r6] = overnightAnalysis422.getQualityHint();
                        r822[r21] = label;
                        copy = overnightAnalysis422.copy((r24 & 1) != 0 ? overnightAnalysis422.totalSleepMin : 0, (r24 & 2) != 0 ? overnightAnalysis422.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis422.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis422.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis422.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis422.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis422.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis422.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis422.efficiency : 0, (r24 & 512) != 0 ? overnightAnalysis422.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis422.qualityHint : CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) r822), " · ", null, null, 0, null, null, 62, null));
                        return new FusedNight(copy, str, !StringsKt.isBlank(encodeFromSamples) ? encodeFromSamples : f, obj, sleepWindow != null ? r21 : r6, boxFloat, Boxing.boxFloat(fromSamples.getCoverageRatio()), str3, f2, estimateOsaHint2, fromSamples$default2.toJson());
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = sleepHealthFusion$finishMicNight$12.I$0;
                    long j5 = sleepHealthFusion$finishMicNight$12.J$1;
                    long j6 = sleepHealthFusion$finishMicNight$12.J$0;
                    OvernightAnalysis overnightAnalysis5 = (OvernightAnalysis) sleepHealthFusion$finishMicNight$12.L$6;
                    String str4 = (String) sleepHealthFusion$finishMicNight$12.L$5;
                    str2 = (String) sleepHealthFusion$finishMicNight$12.L$4;
                    nightStageResult = (SleepStageInference.NightStageResult) sleepHealthFusion$finishMicNight$12.L$3;
                    list2 = (List) sleepHealthFusion$finishMicNight$12.L$2;
                    context2 = (Context) sleepHealthFusion$finishMicNight$12.L$1;
                    sleepHealthFusion = (SleepHealthFusion) sleepHealthFusion$finishMicNight$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    encodeFromSamples = str4;
                    z3 = true;
                    z2 = false;
                    f = null;
                    overnightAnalysis2 = overnightAnalysis5;
                    j3 = j6;
                    j4 = j5;
                }
                it3 = ((Iterable) obj2).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        i4 = i3;
                        sleepWindow2 = f;
                        break;
                    }
                    sleepWindow2 = it3.next();
                    HealthConnectManager.SleepWindow sleepWindow3 = (HealthConnectManager.SleepWindow) sleepWindow2;
                    i4 = i3;
                    it4 = it3;
                    if (Math.min(j4, sleepWindow3.getEndTime().toEpochMilli()) - Math.max(j3, sleepWindow3.getStartTime().toEpochMilli()) >= GymSessionTiming.MAX_END_AFTER_LAST_SET_MS) {
                        break;
                    }
                    i3 = i4;
                    it3 = it4;
                }
                HealthConnectManager.SleepWindow sleepWindow4 = sleepWindow2;
                i2 = i4;
                overnightAnalysis = overnightAnalysis2;
                str = str2;
                arrayList = list2;
                sleepWindow = sleepWindow4;
                r21 = z3;
                Pair<Long, Integer> detectGaps2 = SleepMicCoverage.INSTANCE.detectGaps(arrayList);
                fromSamples = SleepMicCoverage.INSTANCE.fromSamples(arrayList, i2, detectGaps2.component1().longValue() + SleepOvernightStore.INSTANCE.micGapMs(context2), detectGaps2.component2().intValue() + SleepOvernightStore.INSTANCE.micGapCount(context2));
                List<SleepTrackSample> list42 = arrayList;
                ArrayList arrayList32 = new ArrayList();
                it = list42.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList42 = arrayList32;
                isEmpty = arrayList42.isEmpty();
                Object obj32 = arrayList42;
                if (isEmpty) {
                }
                if (obj32 != null) {
                }
                summarize = SleepAudioQualityClassifier.INSTANCE.summarize(arrayList);
                ArrayList arrayList52 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList62 = arrayList52;
                ArrayList arrayList72 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList62, 10));
                it2 = arrayList62.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList82 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList92 = arrayList82;
                if (summarize.getReliable()) {
                }
                f2 = f;
                SleepAnalyticsCompact fromSamples$default22 = SleepAnalyticsCompact.Companion.fromSamples$default(SleepAnalyticsCompact.INSTANCE, arrayList, RangesKt.coerceAtLeast(nightStageResult.getBreakdown().getTrackedMin(), sleepHealthFusion.trackedMinutesFromSamples(arrayList)), null, 4, null);
                String estimateOsaHint22 = sleepHealthFusion.estimateOsaHint(arrayList, f2, fromSamples$default22);
                if (sleepWindow == null) {
                }
                str3 = "mic_only";
                obj = f;
                r6 = z4;
                OvernightAnalysis overnightAnalysis4222 = overnightAnalysis;
                if (fromSamples.getCoverageRatio() < 0.85f) {
                }
                ?? r8222 = new String[2];
                r8222[r6] = overnightAnalysis4222.getQualityHint();
                r8222[r21] = label;
                copy = overnightAnalysis4222.copy((r24 & 1) != 0 ? overnightAnalysis4222.totalSleepMin : 0, (r24 & 2) != 0 ? overnightAnalysis4222.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis4222.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis4222.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis4222.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis4222.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis4222.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis4222.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis4222.efficiency : 0, (r24 & 512) != 0 ? overnightAnalysis4222.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis4222.qualityHint : CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) r8222), " · ", null, null, 0, null, null, 62, null));
                return new FusedNight(copy, str, !StringsKt.isBlank(encodeFromSamples) ? encodeFromSamples : f, obj, sleepWindow != null ? r21 : r6, boxFloat, Boxing.boxFloat(fromSamples.getCoverageRatio()), str3, f2, estimateOsaHint22, fromSamples$default22.toJson());
            }
        }
        sleepHealthFusion$finishMicNight$1 = new SleepHealthFusion$finishMicNight$1(this, continuation);
        SleepHealthFusion$finishMicNight$1 sleepHealthFusion$finishMicNight$122 = sleepHealthFusion$finishMicNight$1;
        Object obj22 = sleepHealthFusion$finishMicNight$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepHealthFusion$finishMicNight$122.label;
        if (i != 0) {
        }
        it3 = ((Iterable) obj22).iterator();
        while (true) {
            if (it3.hasNext()) {
            }
            i3 = i4;
            it3 = it4;
        }
        HealthConnectManager.SleepWindow sleepWindow42 = sleepWindow2;
        i2 = i4;
        overnightAnalysis = overnightAnalysis2;
        str = str2;
        arrayList = list2;
        sleepWindow = sleepWindow42;
        r21 = z3;
        Pair<Long, Integer> detectGaps22 = SleepMicCoverage.INSTANCE.detectGaps(arrayList);
        fromSamples = SleepMicCoverage.INSTANCE.fromSamples(arrayList, i2, detectGaps22.component1().longValue() + SleepOvernightStore.INSTANCE.micGapMs(context2), detectGaps22.component2().intValue() + SleepOvernightStore.INSTANCE.micGapCount(context2));
        List<SleepTrackSample> list422 = arrayList;
        ArrayList arrayList322 = new ArrayList();
        it = list422.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList422 = arrayList322;
        isEmpty = arrayList422.isEmpty();
        Object obj322 = arrayList422;
        if (isEmpty) {
        }
        if (obj322 != null) {
        }
        summarize = SleepAudioQualityClassifier.INSTANCE.summarize(arrayList);
        ArrayList arrayList522 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList622 = arrayList522;
        ArrayList arrayList722 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList622, 10));
        it2 = arrayList622.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList822 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList922 = arrayList822;
        if (summarize.getReliable()) {
        }
        f2 = f;
        SleepAnalyticsCompact fromSamples$default222 = SleepAnalyticsCompact.Companion.fromSamples$default(SleepAnalyticsCompact.INSTANCE, arrayList, RangesKt.coerceAtLeast(nightStageResult.getBreakdown().getTrackedMin(), sleepHealthFusion.trackedMinutesFromSamples(arrayList)), null, 4, null);
        String estimateOsaHint222 = sleepHealthFusion.estimateOsaHint(arrayList, f2, fromSamples$default222);
        if (sleepWindow == null) {
        }
        str3 = "mic_only";
        obj = f;
        r6 = z4;
        OvernightAnalysis overnightAnalysis42222 = overnightAnalysis;
        if (fromSamples.getCoverageRatio() < 0.85f) {
        }
        ?? r82222 = new String[2];
        r82222[r6] = overnightAnalysis42222.getQualityHint();
        r82222[r21] = label;
        copy = overnightAnalysis42222.copy((r24 & 1) != 0 ? overnightAnalysis42222.totalSleepMin : 0, (r24 & 2) != 0 ? overnightAnalysis42222.deepSleepMin : 0, (r24 & 4) != 0 ? overnightAnalysis42222.lightSleepMin : 0, (r24 & 8) != 0 ? overnightAnalysis42222.remSleepMin : 0, (r24 & 16) != 0 ? overnightAnalysis42222.awakeSleepMin : 0, (r24 & 32) != 0 ? overnightAnalysis42222.snoreEvents : 0, (r24 & 64) != 0 ? overnightAnalysis42222.restlessnessIndex : 0, (r24 & 128) != 0 ? overnightAnalysis42222.timeToFallAsleepMin : 0, (r24 & 256) != 0 ? overnightAnalysis42222.efficiency : 0, (r24 & 512) != 0 ? overnightAnalysis42222.sleepCycles : 0, (r24 & 1024) != 0 ? overnightAnalysis42222.qualityHint : CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) r82222), " · ", null, null, 0, null, null, 62, null));
        return new FusedNight(copy, str, !StringsKt.isBlank(encodeFromSamples) ? encodeFromSamples : f, obj, sleepWindow != null ? r21 : r6, boxFloat, Boxing.boxFloat(fromSamples.getCoverageRatio()), str3, f2, estimateOsaHint222, fromSamples$default222.toJson());
    }

    private final int trackedMinutesFromSamples(List<SleepTrackSample> samples) {
        if (samples.isEmpty()) {
            return 0;
        }
        return RangesKt.coerceAtLeast((int) ((((SleepTrackSample) CollectionsKt.last((List) samples)).getElapsedMs() - ((SleepTrackSample) CollectionsKt.first((List) samples)).getElapsedMs()) / 60000), 1);
    }

    private final String estimateOsaHint(List<SleepTrackSample> samples, Float breathMean, SleepAnalyticsCompact analytics) {
        int i;
        float f;
        List<SleepTrackSample> list = samples;
        int i2 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (SleepTrackSample sleepTrackSample : list) {
                if (sleepTrackSample.getSnoreLikelihood() >= 0.35f || Intrinsics.areEqual(sleepTrackSample.getEventTag(), "snore")) {
                    i++;
                    if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepTrackSample) it.next()).getBreathRegularity()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            f = 0.0f;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) next).floatValue() > 0.0f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = arrayList3;
            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).floatValue() < 0.35f && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            f = i2 / arrayList3.size();
        }
        SleepBreathingDisruptionAnalyzer.NightMetrics breathing = analytics.getBreathing();
        if (breathing != null && breathing.getDisruptionsPerHour() >= 4.0f) {
            return "elevated";
        }
        if ((i >= samples.size() / 8 && f > 0.4f) || i >= samples.size() / 12) {
            return "elevated";
        }
        if (breathMean != null && breathMean.floatValue() > 22.0f && i > 3) {
            return "elevated";
        }
        return "low";
    }
}
