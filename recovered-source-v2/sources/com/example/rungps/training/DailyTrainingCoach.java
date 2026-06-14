package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.CombinedLoadSnapshot;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.health.HealthReadinessSignals;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.ReadyToTrain;
import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.recovery.TrainReadiness;
import com.example.rungps.training.RunGymPeriodization;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: DailyTrainingCoach.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J.\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/training/DailyTrainingCoach;", "", "<init>", "()V", "advise", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "ready", "Lcom/example/rungps/recovery/ReadyToTrainAssessment;", "periodization", "Lcom/example/rungps/training/RunGymPeriodization$WorkoutSuggestion;", "combinedLoad", "Lcom/example/rungps/analytics/CombinedLoadSnapshot;", "week", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "health", "Lcom/example/rungps/health/HealthReadinessSignals;", "deload", "Lcom/example/rungps/recovery/DeloadAdvice;", "buildReadyAssessment", "recoveryRemainingMs", "", "activeLoadCount", "", "soccerActiveCount", "DailyCoachBrief", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DailyTrainingCoach {
    public static final int $stable = 0;
    public static final DailyTrainingCoach INSTANCE = new DailyTrainingCoach();

    /* compiled from: DailyTrainingCoach.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainReadiness.values().length];
            try {
                iArr[TrainReadiness.Rest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrainReadiness.Caution.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrainReadiness.Ready.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DailyTrainingCoach() {
    }

    /* compiled from: DailyTrainingCoach.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, d2 = {"Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "", "readiness", "Lcom/example/rungps/recovery/TrainReadiness;", "headline", "", "detail", "summary", "todayRun", "todayGym", "healthLines", "", "weekLine", "contextLine", "<init>", "(Lcom/example/rungps/recovery/TrainReadiness;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getReadiness", "()Lcom/example/rungps/recovery/TrainReadiness;", "getHeadline", "()Ljava/lang/String;", "getDetail", "getSummary", "getTodayRun", "getTodayGym", "getHealthLines", "()Ljava/util/List;", "getWeekLine", "getContextLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DailyCoachBrief {
        public static final int $stable = 8;
        private final String contextLine;
        private final String detail;
        private final String headline;
        private final List<String> healthLines;
        private final TrainReadiness readiness;
        private final String summary;
        private final String todayGym;
        private final String todayRun;
        private final String weekLine;

        /* renamed from: component1, reason: from getter */
        public final TrainReadiness getReadiness() {
            return this.readiness;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTodayRun() {
            return this.todayRun;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTodayGym() {
            return this.todayGym;
        }

        public final List<String> component7() {
            return this.healthLines;
        }

        /* renamed from: component8, reason: from getter */
        public final String getWeekLine() {
            return this.weekLine;
        }

        /* renamed from: component9, reason: from getter */
        public final String getContextLine() {
            return this.contextLine;
        }

        public final DailyCoachBrief copy(TrainReadiness readiness, String headline, String detail, String summary, String todayRun, String todayGym, List<String> healthLines, String weekLine, String contextLine) {
            Intrinsics.checkNotNullParameter(readiness, "readiness");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(healthLines, "healthLines");
            Intrinsics.checkNotNullParameter(weekLine, "weekLine");
            return new DailyCoachBrief(readiness, headline, detail, summary, todayRun, todayGym, healthLines, weekLine, contextLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyCoachBrief)) {
                return false;
            }
            DailyCoachBrief dailyCoachBrief = (DailyCoachBrief) other;
            return this.readiness == dailyCoachBrief.readiness && Intrinsics.areEqual(this.headline, dailyCoachBrief.headline) && Intrinsics.areEqual(this.detail, dailyCoachBrief.detail) && Intrinsics.areEqual(this.summary, dailyCoachBrief.summary) && Intrinsics.areEqual(this.todayRun, dailyCoachBrief.todayRun) && Intrinsics.areEqual(this.todayGym, dailyCoachBrief.todayGym) && Intrinsics.areEqual(this.healthLines, dailyCoachBrief.healthLines) && Intrinsics.areEqual(this.weekLine, dailyCoachBrief.weekLine) && Intrinsics.areEqual(this.contextLine, dailyCoachBrief.contextLine);
        }

        public int hashCode() {
            int hashCode = ((((((this.readiness.hashCode() * 31) + this.headline.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.summary.hashCode()) * 31;
            String str = this.todayRun;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.todayGym;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.healthLines.hashCode()) * 31) + this.weekLine.hashCode()) * 31;
            String str3 = this.contextLine;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "DailyCoachBrief(readiness=" + this.readiness + ", headline=" + this.headline + ", detail=" + this.detail + ", summary=" + this.summary + ", todayRun=" + this.todayRun + ", todayGym=" + this.todayGym + ", healthLines=" + this.healthLines + ", weekLine=" + this.weekLine + ", contextLine=" + this.contextLine + ")";
        }

        public DailyCoachBrief(TrainReadiness readiness, String headline, String detail, String summary, String str, String str2, List<String> healthLines, String weekLine, String str3) {
            Intrinsics.checkNotNullParameter(readiness, "readiness");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(healthLines, "healthLines");
            Intrinsics.checkNotNullParameter(weekLine, "weekLine");
            this.readiness = readiness;
            this.headline = headline;
            this.detail = detail;
            this.summary = summary;
            this.todayRun = str;
            this.todayGym = str2;
            this.healthLines = healthLines;
            this.weekLine = weekLine;
            this.contextLine = str3;
        }

        public /* synthetic */ DailyCoachBrief(TrainReadiness trainReadiness, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(trainReadiness, str, str2, str3, str4, str5, list, str6, (i & 256) != 0 ? null : str7);
        }

        public final TrainReadiness getReadiness() {
            return this.readiness;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTodayRun() {
            return this.todayRun;
        }

        public final String getTodayGym() {
            return this.todayGym;
        }

        public final List<String> getHealthLines() {
            return this.healthLines;
        }

        public final String getWeekLine() {
            return this.weekLine;
        }

        public final String getContextLine() {
            return this.contextLine;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DailyCoachBrief advise(ReadyToTrainAssessment ready, RunGymPeriodization.WorkoutSuggestion periodization, CombinedLoadSnapshot combinedLoad, TrainingWeekPlanner.TrainingWeekView week, HealthReadinessSignals health, DeloadAdvice deload) {
        String detail;
        String str;
        StringBuilder sb;
        String headline;
        StringBuilder sb2;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(ready, "ready");
        Intrinsics.checkNotNullParameter(periodization, "periodization");
        Intrinsics.checkNotNullParameter(health, "health");
        Intrinsics.checkNotNullParameter(deload, "deload");
        if (week != null) {
            StringBuilder sb3 = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "This week: %.1f km · %.0f kg gym", Arrays.copyOf(new Object[]{Double.valueOf(week.getTotalRunKm()), Double.valueOf(week.getTotalGymKg())}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb3.append(format);
            Double avgSleepHours = week.getAvgSleepHours();
            if (avgSleepHours != null) {
                double doubleValue = avgSleepHours.doubleValue();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format(Locale.US, " · %.1f h sleep/night", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                sb3.append(format2);
            }
            detail = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(detail, "toString(...)");
        }
        detail = combinedLoad != null ? combinedLoad.getDetail() : null;
        if (detail == null) {
            detail = "";
        }
        String str2 = detail;
        String preferredRunType = periodization.getPreferredRunType();
        if (preferredRunType == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[ready.getReadiness().ordinal()];
            if (i == 1) {
                preferredRunType = "Rest or 15 min walk";
            } else if (i == 2) {
                preferredRunType = "Easy Z1 only if you run";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                preferredRunType = "Follow your plan";
            }
        }
        String str3 = preferredRunType;
        String preferredGymFocus = periodization.getPreferredGymFocus();
        if (preferredGymFocus == null) {
            if (deload.getRecommended()) {
                preferredGymFocus = "Deload: −" + deload.getSuggestedReductionPct() + "% volume";
            } else {
                if (ready.getReadiness() != TrainReadiness.Rest) {
                    str = null;
                    sb = new StringBuilder();
                    sb.append(ready.getDetail());
                    if (!StringsKt.isBlank(periodization.getDetail()) && !StringsKt.contains$default((CharSequence) ready.getDetail(), (CharSequence) periodization.getDetail(), false, 2, (Object) null)) {
                        sb.append(" ");
                        sb.append(periodization.getDetail());
                    }
                    if (combinedLoad != null) {
                        sb.append(" Load score " + combinedLoad.getScore() + "/100 (" + combinedLoad.getLabel() + ").");
                    }
                    String sb4 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                    if (deload.getRecommended()) {
                        headline = !Intrinsics.areEqual(periodization.getHeadline(), "Flexible day") ? periodization.getHeadline() : ready.getHeadline();
                    } else {
                        headline = deload.getHeadline();
                    }
                    String detail2 = Intrinsics.areEqual(periodization.getHeadline(), "Flexible day") ? periodization.getDetail() : ready.getDetail();
                    sb2 = new StringBuilder();
                    sb2.append(StringsKt.trim((CharSequence) detail2).toString());
                    String[] strArr = new String[2];
                    strArr[0] = "Run: " + str3;
                    strArr[1] = str != null ? "Gym: " + str : null;
                    listOfNotNull = CollectionsKt.listOfNotNull((Object[]) strArr);
                    if (!listOfNotNull.isEmpty()) {
                        sb2.append("\n\nToday — ");
                        sb2.append(CollectionsKt.joinToString$default(listOfNotNull, " · ", null, null, 0, null, null, 62, null));
                    }
                    if (ready.getReadiness() != TrainReadiness.Ready && !Intrinsics.areEqual(periodization.getHeadline(), "Flexible day")) {
                        sb2.append("\n\nRecovery note: ");
                        sb2.append(StringsKt.trim((CharSequence) StringsKt.take(ready.getDetail(), 160)).toString());
                    }
                    String sb5 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                    return new DailyCoachBrief(ready.getReadiness(), headline, StringsKt.trim((CharSequence) sb4).toString(), StringsKt.trim((CharSequence) sb5).toString(), str3, str, health.getDetailLines(), str2, null, 256, null);
                }
                preferredGymFocus = "Skip or mobility only";
            }
        }
        str = preferredGymFocus;
        sb = new StringBuilder();
        sb.append(ready.getDetail());
        if (!StringsKt.isBlank(periodization.getDetail())) {
            sb.append(" ");
            sb.append(periodization.getDetail());
        }
        if (combinedLoad != null) {
        }
        String sb42 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb42, "toString(...)");
        if (deload.getRecommended()) {
        }
        if (Intrinsics.areEqual(periodization.getHeadline(), "Flexible day")) {
        }
        sb2 = new StringBuilder();
        sb2.append(StringsKt.trim((CharSequence) detail2).toString());
        String[] strArr2 = new String[2];
        strArr2[0] = "Run: " + str3;
        strArr2[1] = str != null ? "Gym: " + str : null;
        listOfNotNull = CollectionsKt.listOfNotNull((Object[]) strArr2);
        if (!listOfNotNull.isEmpty()) {
        }
        if (ready.getReadiness() != TrainReadiness.Ready) {
            sb2.append("\n\nRecovery note: ");
            sb2.append(StringsKt.trim((CharSequence) StringsKt.take(ready.getDetail(), 160)).toString());
        }
        String sb52 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb52, "toString(...)");
        return new DailyCoachBrief(ready.getReadiness(), headline, StringsKt.trim((CharSequence) sb42).toString(), StringsKt.trim((CharSequence) sb52).toString(), str3, str, health.getDetailLines(), str2, null, 256, null);
    }

    public final ReadyToTrainAssessment buildReadyAssessment(long recoveryRemainingMs, int activeLoadCount, int soccerActiveCount, DeloadAdvice deload, HealthReadinessSignals health) {
        Intrinsics.checkNotNullParameter(deload, "deload");
        Intrinsics.checkNotNullParameter(health, "health");
        Double lastNightSleepHours = health.getLastNightSleepHours();
        return ReadyToTrain.INSTANCE.assess(recoveryRemainingMs, activeLoadCount, soccerActiveCount, deload, health.getLastNightSleepQuality(), lastNightSleepHours != null ? Integer.valueOf(MathKt.roundToInt(lastNightSleepHours.doubleValue() * 60)) : null, health.getStepsToday());
    }
}
