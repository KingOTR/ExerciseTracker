package com.example.rungps.sleep;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepAudioQualityClassifier;
import com.example.rungps.sleep.SleepBreathingDisruptionAnalyzer;
import com.example.rungps.sleep.SleepSnoreMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: SleepAnalyticsCompact.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/example/rungps/sleep/SleepAnalyticsCompact;", "", "snore", "Lcom/example/rungps/sleep/SleepSnoreMetrics$NightMetrics;", "breathing", "Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$NightMetrics;", "quality", "Lcom/example/rungps/sleep/SleepAudioQualityClassifier$NightSummary;", "osaTier", "", "<init>", "(Lcom/example/rungps/sleep/SleepSnoreMetrics$NightMetrics;Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$NightMetrics;Lcom/example/rungps/sleep/SleepAudioQualityClassifier$NightSummary;Ljava/lang/String;)V", "getSnore", "()Lcom/example/rungps/sleep/SleepSnoreMetrics$NightMetrics;", "getBreathing", "()Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$NightMetrics;", "getQuality", "()Lcom/example/rungps/sleep/SleepAudioQualityClassifier$NightSummary;", "getOsaTier", "()Ljava/lang/String;", "toJson", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepAnalyticsCompact {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SleepBreathingDisruptionAnalyzer.NightMetrics breathing;
    private final String osaTier;
    private final SleepAudioQualityClassifier.NightSummary quality;
    private final SleepSnoreMetrics.NightMetrics snore;

    public SleepAnalyticsCompact() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SleepAnalyticsCompact copy$default(SleepAnalyticsCompact sleepAnalyticsCompact, SleepSnoreMetrics.NightMetrics nightMetrics, SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2, SleepAudioQualityClassifier.NightSummary nightSummary, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nightMetrics = sleepAnalyticsCompact.snore;
        }
        if ((i & 2) != 0) {
            nightMetrics2 = sleepAnalyticsCompact.breathing;
        }
        if ((i & 4) != 0) {
            nightSummary = sleepAnalyticsCompact.quality;
        }
        if ((i & 8) != 0) {
            str = sleepAnalyticsCompact.osaTier;
        }
        return sleepAnalyticsCompact.copy(nightMetrics, nightMetrics2, nightSummary, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SleepSnoreMetrics.NightMetrics getSnore() {
        return this.snore;
    }

    /* renamed from: component2, reason: from getter */
    public final SleepBreathingDisruptionAnalyzer.NightMetrics getBreathing() {
        return this.breathing;
    }

    /* renamed from: component3, reason: from getter */
    public final SleepAudioQualityClassifier.NightSummary getQuality() {
        return this.quality;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOsaTier() {
        return this.osaTier;
    }

    public final SleepAnalyticsCompact copy(SleepSnoreMetrics.NightMetrics snore, SleepBreathingDisruptionAnalyzer.NightMetrics breathing, SleepAudioQualityClassifier.NightSummary quality, String osaTier) {
        return new SleepAnalyticsCompact(snore, breathing, quality, osaTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAnalyticsCompact)) {
            return false;
        }
        SleepAnalyticsCompact sleepAnalyticsCompact = (SleepAnalyticsCompact) other;
        return Intrinsics.areEqual(this.snore, sleepAnalyticsCompact.snore) && Intrinsics.areEqual(this.breathing, sleepAnalyticsCompact.breathing) && Intrinsics.areEqual(this.quality, sleepAnalyticsCompact.quality) && Intrinsics.areEqual(this.osaTier, sleepAnalyticsCompact.osaTier);
    }

    public int hashCode() {
        SleepSnoreMetrics.NightMetrics nightMetrics = this.snore;
        int hashCode = (nightMetrics == null ? 0 : nightMetrics.hashCode()) * 31;
        SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2 = this.breathing;
        int hashCode2 = (hashCode + (nightMetrics2 == null ? 0 : nightMetrics2.hashCode())) * 31;
        SleepAudioQualityClassifier.NightSummary nightSummary = this.quality;
        int hashCode3 = (hashCode2 + (nightSummary == null ? 0 : nightSummary.hashCode())) * 31;
        String str = this.osaTier;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SleepAnalyticsCompact(snore=" + this.snore + ", breathing=" + this.breathing + ", quality=" + this.quality + ", osaTier=" + this.osaTier + ")";
    }

    public SleepAnalyticsCompact(SleepSnoreMetrics.NightMetrics nightMetrics, SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2, SleepAudioQualityClassifier.NightSummary nightSummary, String str) {
        this.snore = nightMetrics;
        this.breathing = nightMetrics2;
        this.quality = nightSummary;
        this.osaTier = str;
    }

    public /* synthetic */ SleepAnalyticsCompact(SleepSnoreMetrics.NightMetrics nightMetrics, SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2, SleepAudioQualityClassifier.NightSummary nightSummary, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nightMetrics, (i & 2) != 0 ? null : nightMetrics2, (i & 4) != 0 ? null : nightSummary, (i & 8) != 0 ? null : str);
    }

    public final SleepSnoreMetrics.NightMetrics getSnore() {
        return this.snore;
    }

    public final SleepBreathingDisruptionAnalyzer.NightMetrics getBreathing() {
        return this.breathing;
    }

    public final SleepAudioQualityClassifier.NightSummary getQuality() {
        return this.quality;
    }

    public final String getOsaTier() {
        return this.osaTier;
    }

    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        SleepSnoreMetrics.NightMetrics nightMetrics = this.snore;
        if (nightMetrics != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("iph", nightMetrics.getSnoresPerHour());
            jSONObject2.put("pct", nightMetrics.getPercentNightSnoring());
            jSONObject2.put(CervicalMucusRecord.Sensation.LIGHT, nightMetrics.getLightMinutes());
            jSONObject2.put("loud", nightMetrics.getLoudMinutes());
            jSONObject2.put("epic", nightMetrics.getEpicMinutes());
            jSONObject2.put("score", nightMetrics.getSnoreScore());
            jSONObject.put("snore", jSONObject2);
        }
        SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2 = this.breathing;
        if (nightMetrics2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("iph", nightMetrics2.getDisruptionsPerHour());
            jSONObject3.put("clusters", nightMetrics2.getClusterCount());
            jSONObject3.put("longest", nightMetrics2.getLongestPauseSec());
            jSONObject3.put("recovery", nightMetrics2.getRecoveryBreaths());
            jSONObject3.put("pauseMin", nightMetrics2.getBreathPauseMinutes());
            jSONObject.put("breath", jSONObject3);
        }
        SleepAudioQualityClassifier.NightSummary nightSummary = this.quality;
        if (nightSummary != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("pass", nightSummary.getPassRatio());
            jSONObject4.put("reliable", nightSummary.getReliable());
            String dominantNoise = nightSummary.getDominantNoise();
            if (dominantNoise != null) {
                jSONObject4.put("noise", dominantNoise);
            }
            jSONObject.put("quality", jSONObject4);
        }
        String str = this.osaTier;
        if (str != null) {
            jSONObject.put("osaTier", str);
        }
        String jSONObject5 = jSONObject.toString();
        if (jSONObject5 == null) {
            jSONObject5 = "";
        }
        String str2 = jSONObject5;
        if (StringsKt.isBlank(str2)) {
            str2 = "{}";
        }
        return str2;
    }

    /* compiled from: SleepAnalyticsCompact.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J(\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepAnalyticsCompact$Companion;", "", "<init>", "()V", "parse", "Lcom/example/rungps/sleep/SleepAnalyticsCompact;", "json", "", "fromSamples", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "trackedMinutes", "", "osaTier", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SleepAnalyticsCompact parse(String json) {
            Object m7905constructorimpl;
            SleepAudioQualityClassifier.NightSummary nightSummary;
            String str = json;
            if (str == null || StringsKt.isBlank(str)) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                JSONObject jSONObject = new JSONObject(json);
                JSONObject optJSONObject = jSONObject.optJSONObject("snore");
                SleepSnoreMetrics.NightMetrics nightMetrics = optJSONObject != null ? new SleepSnoreMetrics.NightMetrics((float) optJSONObject.optDouble("iph", 0.0d), (float) optJSONObject.optDouble("pct", 0.0d), optJSONObject.optInt(CervicalMucusRecord.Sensation.LIGHT, 0), optJSONObject.optInt("loud", 0), optJSONObject.optInt("epic", 0), optJSONObject.optInt("score", 0)) : null;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("breath");
                SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics2 = optJSONObject2 != null ? new SleepBreathingDisruptionAnalyzer.NightMetrics((float) optJSONObject2.optDouble("iph", 0.0d), optJSONObject2.optInt("clusters", 0), optJSONObject2.optInt("longest", 0), optJSONObject2.optInt("recovery", 0), optJSONObject2.optInt("pauseMin", 0)) : null;
                JSONObject optJSONObject3 = jSONObject.optJSONObject("quality");
                if (optJSONObject3 != null) {
                    float optDouble = (float) optJSONObject3.optDouble("pass", 0.0d);
                    boolean optBoolean = optJSONObject3.optBoolean("reliable", false);
                    String optString = optJSONObject3.optString("noise", "");
                    Intrinsics.checkNotNull(optString);
                    if (StringsKt.isBlank(optString)) {
                        optString = null;
                    }
                    nightSummary = new SleepAudioQualityClassifier.NightSummary(optDouble, optBoolean, optString);
                } else {
                    nightSummary = null;
                }
                String optString2 = jSONObject.optString("osaTier", "");
                Intrinsics.checkNotNull(optString2);
                if (StringsKt.isBlank(optString2)) {
                    optString2 = null;
                }
                m7905constructorimpl = Result.m7905constructorimpl(new SleepAnalyticsCompact(nightMetrics, nightMetrics2, nightSummary, optString2));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            return (SleepAnalyticsCompact) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
        }

        public static /* synthetic */ SleepAnalyticsCompact fromSamples$default(Companion companion, List list, int i, String str, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            return companion.fromSamples(list, i, str);
        }

        public final SleepAnalyticsCompact fromSamples(List<SleepTrackSample> samples, int trackedMinutes, String osaTier) {
            Intrinsics.checkNotNullParameter(samples, "samples");
            return new SleepAnalyticsCompact(SleepSnoreMetrics.INSTANCE.analyze(samples, trackedMinutes), SleepBreathingDisruptionAnalyzer.INSTANCE.analyze(samples, trackedMinutes), SleepAudioQualityClassifier.INSTANCE.summarize(samples), osaTier);
        }
    }
}
