package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: GoalPromptParser.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J!\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J#\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/training/GoalPromptParser;", "", "<init>", "()V", "parse", "Lcom/example/rungps/training/GoalPromptParser$ParsedGoal;", "raw", "", "parseDistance", "Lkotlin/Pair;", "", "g", "parseTimeMs", "", "distanceKm", "(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Long;", "parsePaceSecPerKm", "", "toSecPerKm", "m", "Lkotlin/text/MatchResult;", "inferPaceFromTime", "timeMs", "(Ljava/lang/Double;Ljava/lang/Long;)Ljava/lang/Integer;", "parseTimeframe", "formatDistanceLabel", "km", "ParsedGoal", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoalPromptParser {
    public static final int $stable = 0;
    public static final GoalPromptParser INSTANCE = new GoalPromptParser();

    private GoalPromptParser() {
    }

    /* compiled from: GoalPromptParser.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/example/rungps/training/GoalPromptParser$ParsedGoal;", "", "rawText", "", "targetDistanceKm", "", "distanceLabel", "targetTimeMs", "", TrackingService.EXTRA_TARGET_PACE_SEC_PER_KM, "", "timeframeWeeks", "timeframeLabel", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getRawText", "()Ljava/lang/String;", "getTargetDistanceKm", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDistanceLabel", "getTargetTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTargetPaceSecPerKm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeframeWeeks", "getTimeframeLabel", "hasRaceTarget", "", "getHasRaceTarget", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/training/GoalPromptParser$ParsedGoal;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParsedGoal {
        public static final int $stable = 0;
        private final String distanceLabel;
        private final String rawText;
        private final Double targetDistanceKm;
        private final Integer targetPaceSecPerKm;
        private final Long targetTimeMs;
        private final String timeframeLabel;
        private final Integer timeframeWeeks;

        public static /* synthetic */ ParsedGoal copy$default(ParsedGoal parsedGoal, String str, Double d, String str2, Long l, Integer num, Integer num2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parsedGoal.rawText;
            }
            if ((i & 2) != 0) {
                d = parsedGoal.targetDistanceKm;
            }
            Double d2 = d;
            if ((i & 4) != 0) {
                str2 = parsedGoal.distanceLabel;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                l = parsedGoal.targetTimeMs;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                num = parsedGoal.targetPaceSecPerKm;
            }
            Integer num3 = num;
            if ((i & 32) != 0) {
                num2 = parsedGoal.timeframeWeeks;
            }
            Integer num4 = num2;
            if ((i & 64) != 0) {
                str3 = parsedGoal.timeframeLabel;
            }
            return parsedGoal.copy(str, d2, str4, l2, num3, num4, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRawText() {
            return this.rawText;
        }

        /* renamed from: component2, reason: from getter */
        public final Double getTargetDistanceKm() {
            return this.targetDistanceKm;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDistanceLabel() {
            return this.distanceLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getTargetTimeMs() {
            return this.targetTimeMs;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getTargetPaceSecPerKm() {
            return this.targetPaceSecPerKm;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getTimeframeWeeks() {
            return this.timeframeWeeks;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTimeframeLabel() {
            return this.timeframeLabel;
        }

        public final ParsedGoal copy(String rawText, Double targetDistanceKm, String distanceLabel, Long targetTimeMs, Integer targetPaceSecPerKm, Integer timeframeWeeks, String timeframeLabel) {
            Intrinsics.checkNotNullParameter(rawText, "rawText");
            return new ParsedGoal(rawText, targetDistanceKm, distanceLabel, targetTimeMs, targetPaceSecPerKm, timeframeWeeks, timeframeLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedGoal)) {
                return false;
            }
            ParsedGoal parsedGoal = (ParsedGoal) other;
            return Intrinsics.areEqual(this.rawText, parsedGoal.rawText) && Intrinsics.areEqual((Object) this.targetDistanceKm, (Object) parsedGoal.targetDistanceKm) && Intrinsics.areEqual(this.distanceLabel, parsedGoal.distanceLabel) && Intrinsics.areEqual(this.targetTimeMs, parsedGoal.targetTimeMs) && Intrinsics.areEqual(this.targetPaceSecPerKm, parsedGoal.targetPaceSecPerKm) && Intrinsics.areEqual(this.timeframeWeeks, parsedGoal.timeframeWeeks) && Intrinsics.areEqual(this.timeframeLabel, parsedGoal.timeframeLabel);
        }

        public int hashCode() {
            int hashCode = this.rawText.hashCode() * 31;
            Double d = this.targetDistanceKm;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.distanceLabel;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.targetTimeMs;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.targetPaceSecPerKm;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.timeframeWeeks;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.timeframeLabel;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ParsedGoal(rawText=" + this.rawText + ", targetDistanceKm=" + this.targetDistanceKm + ", distanceLabel=" + this.distanceLabel + ", targetTimeMs=" + this.targetTimeMs + ", targetPaceSecPerKm=" + this.targetPaceSecPerKm + ", timeframeWeeks=" + this.timeframeWeeks + ", timeframeLabel=" + this.timeframeLabel + ")";
        }

        public ParsedGoal(String rawText, Double d, String str, Long l, Integer num, Integer num2, String str2) {
            Intrinsics.checkNotNullParameter(rawText, "rawText");
            this.rawText = rawText;
            this.targetDistanceKm = d;
            this.distanceLabel = str;
            this.targetTimeMs = l;
            this.targetPaceSecPerKm = num;
            this.timeframeWeeks = num2;
            this.timeframeLabel = str2;
        }

        public final String getRawText() {
            return this.rawText;
        }

        public final Double getTargetDistanceKm() {
            return this.targetDistanceKm;
        }

        public final String getDistanceLabel() {
            return this.distanceLabel;
        }

        public final Long getTargetTimeMs() {
            return this.targetTimeMs;
        }

        public final Integer getTargetPaceSecPerKm() {
            return this.targetPaceSecPerKm;
        }

        public final Integer getTimeframeWeeks() {
            return this.timeframeWeeks;
        }

        public final String getTimeframeLabel() {
            return this.timeframeLabel;
        }

        public final boolean getHasRaceTarget() {
            return (this.targetDistanceKm == null || (this.targetTimeMs == null && this.targetPaceSecPerKm == null)) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ParsedGoal parse(String raw) {
        String str;
        String formatDistanceLabel;
        Intrinsics.checkNotNullParameter(raw, "raw");
        String obj = StringsKt.trim((CharSequence) raw).toString();
        String lowerCase = obj.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Pair<Double, String> parseDistance = parseDistance(lowerCase, obj);
        Long parseTimeMs = parseTimeMs(lowerCase, parseDistance != null ? parseDistance.getFirst() : null);
        Integer valueOf = Integer.valueOf(parsePaceSecPerKm(lowerCase));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = inferPaceFromTime(parseDistance != null ? parseDistance.getFirst() : null, parseTimeMs);
        }
        Integer num = valueOf;
        Pair<Integer, String> parseTimeframe = parseTimeframe(lowerCase);
        Integer component1 = parseTimeframe.component1();
        String component2 = parseTimeframe.component2();
        if (parseDistance == null || (formatDistanceLabel = parseDistance.getSecond()) == null) {
            if (parseDistance == null) {
                str = null;
                return new ParsedGoal(obj, parseDistance != null ? parseDistance.getFirst() : null, str, parseTimeMs, num, component1, component2);
            }
            formatDistanceLabel = INSTANCE.formatDistanceLabel(parseDistance.getFirst().doubleValue());
        }
        str = formatDistanceLabel;
        return new ParsedGoal(obj, parseDistance != null ? parseDistance.getFirst() : null, str, parseTimeMs, num, component1, component2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        if (r4 <= 50.0d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ba, code lost:
    
        if (r11 <= 30.0d) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<Double, String> parseDistance(String g, String raw) {
        String str = g;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "marathon", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "half", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(42.195d), "Marathon");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "half marathon", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "half-marathon", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "half marathon", false, 2, (Object) null) || (new Regex("\\bhalf\\b").containsMatchIn(str) && (StringsKt.contains$default((CharSequence) str, (CharSequence) "marathon", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "21", false, 2, (Object) null)))) {
            return TuplesKt.to(Double.valueOf(21.0975d), "Half marathon");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "parkrun", false, 2, (Object) null) || new Regex("\\b5\\s*k\\b").containsMatchIn(str) || StringsKt.contains$default((CharSequence) str, (CharSequence) "5k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "5 km", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "5km", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(5.0d), "5 km");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "10k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "10 km", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "10km", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "6.2 mi", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(10.0d), "10 km");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "15k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "15 km", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(15.0d), "15 km");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "12k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "12 km", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(12.0d), "12 km");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "3k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "3 km", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(3.0d), "3 km");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "1 mile", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "1mi", false, 2, (Object) null)) {
            return TuplesKt.to(Double.valueOf(1.609d), "1 mile");
        }
        String str2 = raw;
        MatchResult find$default = Regex.find$default(new Regex("(\\d+(?:[.,]\\d+)?)\\s*(?:km|kilomet(?:er|re)s?|k)\\b", RegexOption.IGNORE_CASE), str2, 0, 2, null);
        if (find$default != null) {
            Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.replace$default(find$default.getGroupValues().get(1), AbstractJsonLexerKt.COMMA, '.', false, 4, (Object) null));
            if (doubleOrNull != null) {
                double doubleValue = doubleOrNull.doubleValue();
                if (0.8d <= doubleValue) {
                }
            }
            doubleOrNull = null;
            if (doubleOrNull != null) {
                return TuplesKt.to(doubleOrNull, INSTANCE.formatDistanceLabel(doubleOrNull.doubleValue()));
            }
        }
        MatchResult find$default2 = Regex.find$default(new Regex("(\\d+(?:[.,]\\d+)?)\\s*(?:mi|miles?)\\b", RegexOption.IGNORE_CASE), str2, 0, 2, null);
        if (find$default2 != null) {
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(StringsKt.replace$default(find$default2.getGroupValues().get(1), AbstractJsonLexerKt.COMMA, '.', false, 4, (Object) null));
            if (doubleOrNull2 != null) {
                double doubleValue2 = doubleOrNull2.doubleValue();
                if (0.5d <= doubleValue2) {
                }
            }
            doubleOrNull2 = null;
            if (doubleOrNull2 != null) {
                return TuplesKt.to(Double.valueOf(doubleOrNull2.doubleValue() * 1.60934d), doubleOrNull2 + " mi");
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        if (r0 < 301) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
    
        return java.lang.Long.valueOf(r0 * 60000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Long parseTimeMs(String g, Double distanceKm) {
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Integer intOrNull4;
        int intValue;
        Integer intOrNull5;
        Integer intOrNull6;
        long j;
        long j2;
        String str = g;
        MatchResult find$default = Regex.find$default(new Regex("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?"), str, 0, 2, null);
        if (find$default != null && (intOrNull6 = StringsKt.toIntOrNull(find$default.getGroupValues().get(1))) != null) {
            int intValue2 = intOrNull6.intValue();
            Integer intOrNull7 = StringsKt.toIntOrNull(find$default.getGroupValues().get(2));
            if (intOrNull7 != null) {
                int intValue3 = intOrNull7.intValue();
                String str2 = find$default.getGroupValues().get(3);
                if (str2.length() <= 0) {
                    str2 = null;
                }
                String str3 = str2;
                Integer intOrNull8 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
                long j3 = intValue2;
                if (intOrNull8 != null) {
                    j = (j3 * 3600) + (intValue3 * 60);
                    j2 = intOrNull8.intValue();
                } else {
                    j = j3 * 60;
                    j2 = intValue3;
                }
                long j4 = j + j2;
                if (120 <= j4 && j4 < 21601) {
                    return Long.valueOf(j4 * 1000);
                }
            }
        }
        MatchResult find$default2 = Regex.find$default(new Regex("(?:sub|under|below|in)\\s*(\\d{1,2}):(\\d{2})"), str, 0, 2, null);
        if (find$default2 != null && (intOrNull5 = StringsKt.toIntOrNull(find$default2.getGroupValues().get(1))) != null) {
            int intValue4 = intOrNull5.intValue();
            if (StringsKt.toIntOrNull(find$default2.getGroupValues().get(2)) != null) {
                long intValue5 = (intValue4 * 60) + r0.intValue();
                if (120 <= intValue5 && intValue5 < 21601) {
                    return Long.valueOf(intValue5 * 1000);
                }
            }
        }
        MatchResult find$default3 = Regex.find$default(new Regex("(?:sub|under|below|in)\\s*(\\d{2,3})\\s*(?:min|minutes?|m)\\b"), str, 0, 2, null);
        if (find$default3 != null && (intOrNull4 = StringsKt.toIntOrNull(find$default3.getGroupValues().get(1))) != null && 3 <= (intValue = intOrNull4.intValue()) && intValue < 361) {
            return Long.valueOf(intValue * 60000);
        }
        MatchResult find$default4 = Regex.find$default(new Regex("(\\d{2,3})\\s*(?:min|minutes?)\\b"), str, 0, 2, null);
        if (find$default4 != null && (intOrNull3 = StringsKt.toIntOrNull(find$default4.getGroupValues().get(1))) != null) {
            int intValue6 = intOrNull3.intValue();
            if (distanceKm != null) {
                Double d = distanceKm;
                if (!RangesKt.rangeTo(0.0d, 6.0d).contains(d)) {
                }
            } else if (12 <= intValue6) {
            }
        }
        int i = 0;
        MatchResult find$default5 = Regex.find$default(new Regex("(\\d+)\\s*h(?:ours?)?\\s*(\\d{1,2})?\\s*(?:m|min)?"), str, 0, 2, null);
        if (find$default5 == null || (intOrNull = StringsKt.toIntOrNull(find$default5.getGroupValues().get(1))) == null) {
            return null;
        }
        int intValue7 = intOrNull.intValue();
        String str4 = find$default5.getGroupValues().get(2);
        if (str4.length() <= 0) {
            str4 = null;
        }
        String str5 = str4;
        if (str5 != null && (intOrNull2 = StringsKt.toIntOrNull(str5)) != null) {
            i = intOrNull2.intValue();
        }
        if (intValue7 < 0 || intValue7 >= 9) {
            return null;
        }
        return Long.valueOf(((intValue7 * 3600) + (i * 60)) * 1000);
    }

    private final int parsePaceSecPerKm(String g) {
        Integer intOrNull;
        String str = g;
        MatchResult find$default = Regex.find$default(new Regex("(\\d{1,2}):(\\d{2})\\s*/?\\s*km"), str, 0, 2, null);
        if (find$default != null) {
            return INSTANCE.toSecPerKm(find$default);
        }
        MatchResult find$default2 = Regex.find$default(new Regex("(\\d{1,2}):(\\d{2})\\s*(?:per\\s*)?km"), str, 0, 2, null);
        if (find$default2 != null) {
            return INSTANCE.toSecPerKm(find$default2);
        }
        MatchResult find$default3 = Regex.find$default(new Regex("pace\\s*(?:of\\s*)?(\\d{1,2}):(\\d{2})"), str, 0, 2, null);
        if (find$default3 != null) {
            return INSTANCE.toSecPerKm(find$default3);
        }
        MatchResult find$default4 = Regex.find$default(new Regex("(\\d)\\s*min(?:ute)?s?\\s*(?:per|/)\\s*km"), str, 0, 2, null);
        if (find$default4 == null || (intOrNull = StringsKt.toIntOrNull(find$default4.getGroupValues().get(1))) == null) {
            return 0;
        }
        return RangesKt.coerceIn(intOrNull.intValue() * 60, 180, 900);
    }

    private final int toSecPerKm(MatchResult m) {
        Integer intOrNull = StringsKt.toIntOrNull(m.getGroupValues().get(1));
        if (intOrNull != null) {
            int intValue = intOrNull.intValue();
            Integer intOrNull2 = StringsKt.toIntOrNull(m.getGroupValues().get(2));
            if (intOrNull2 != null) {
                return RangesKt.coerceIn((intValue * 60) + intOrNull2.intValue(), 180, 900);
            }
        }
        return 0;
    }

    private final Integer inferPaceFromTime(Double distanceKm, Long timeMs) {
        if (distanceKm == null || timeMs == null || distanceKm.doubleValue() < 0.5d) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceIn(MathKt.roundToInt((timeMs.longValue() / 1000.0d) / distanceKm.doubleValue()), 180, 900));
    }

    private final Pair<Integer, String> parseTimeframe(String g) {
        Integer intOrNull;
        Integer intOrNull2;
        String str = g;
        if (new Regex("\\b(?:in\\s+)?(?:one|a)\\s+week\\b").containsMatchIn(str)) {
            return TuplesKt.to(1, "1 week");
        }
        MatchResult find$default = Regex.find$default(new Regex("(\\d{1,2})\\s*weeks?"), str, 0, 2, null);
        if (find$default != null && (intOrNull2 = StringsKt.toIntOrNull(find$default.getGroupValues().get(1))) != null) {
            int coerceIn = RangesKt.coerceIn(intOrNull2.intValue(), 1, 52);
            return TuplesKt.to(Integer.valueOf(coerceIn), coerceIn != 1 ? coerceIn + " weeks" : "1 week");
        }
        MatchResult find$default2 = Regex.find$default(new Regex("(\\d{1,2})\\s*months?"), str, 0, 2, null);
        if (find$default2 != null && (intOrNull = StringsKt.toIntOrNull(find$default2.getGroupValues().get(1))) != null) {
            int coerceIn2 = RangesKt.coerceIn(intOrNull.intValue(), 1, 18);
            int coerceIn3 = RangesKt.coerceIn(MathKt.roundToInt(coerceIn2 * 4.33d), 4, 52);
            return TuplesKt.to(Integer.valueOf(coerceIn3), coerceIn2 + " months (~" + coerceIn3 + " weeks)");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "this year", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "end of year", false, 2, (Object) null)) {
            return TuplesKt.to(20, "Rest of year (~20 weeks)");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "autumn", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "fall", false, 2, (Object) null)) {
            return TuplesKt.to(14, "About 14 weeks (autumn)");
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "spring", false, 2, (Object) null) ? TuplesKt.to(12, "About 12 weeks (spring)") : StringsKt.contains$default((CharSequence) str, (CharSequence) "summer", false, 2, (Object) null) ? TuplesKt.to(10, "About 10 weeks (summer)") : TuplesKt.to(null, null);
    }

    public final String formatDistanceLabel(double km) {
        if (Math.abs(km - 5.0d) < 0.15d) {
            return "5 km";
        }
        if (Math.abs(km - 10.0d) < 0.15d) {
            return "10 km";
        }
        if (Math.abs(km - 21.0975d) < 0.3d) {
            return "Half marathon";
        }
        if (Math.abs(km - 42.195d) < 0.5d) {
            return "Marathon";
        }
        if (km < 10.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f km", Arrays.copyOf(new Object[]{Double.valueOf(km)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%.0f km", Arrays.copyOf(new Object[]{Double.valueOf(km)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
