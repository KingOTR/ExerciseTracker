package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.DistancePbLookup;
import com.example.rungps.analytics.RaceTrendCalculator;
import com.example.rungps.training.GoalPromptParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RunningGoalCoach.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u000201B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002JL\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002JL\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002JJ\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002JB\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002JJ\u0010%\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002JD\u0010&\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J0\u0010'\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002JD\u0010(\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0002J\u0019\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020,H\u0002¨\u00062"}, d2 = {"Lcom/example/rungps/training/RunningGoalCoach;", "", "<init>", "()V", "parseGoal", "Lcom/example/rungps/training/RunningGoalCoach$GoalKind;", "raw", "", "parsed", "Lcom/example/rungps/training/GoalPromptParser$ParsedGoal;", "build", "Lcom/example/rungps/training/RunningGoalCoach$CoachPlan;", "goalText", "snap", "Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;", "distancePbsKm", "", "", "", "buildParsedSummary", "buildPbLine", "pb", "Lcom/example/rungps/analytics/DistancePbLookup$TimeAtDistance;", "timeframeLabel", "default", "planFirst5k", "goal", "easy", "steady", "plan5k", "weeklyKm", "lowBase", "", "tempo", "plan10k", "planHalf", "planMarathon", "planCustomDistance", "planSpeed", "planDistance", "planGeneral", "simplifyTrend", "s", "paceSecPerKm", "", "(Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;)Ljava/lang/Integer;", "formatPace", "secPerKm", "GoalKind", "CoachPlan", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunningGoalCoach {
    public static final int $stable = 0;
    public static final RunningGoalCoach INSTANCE = new RunningGoalCoach();

    /* compiled from: RunningGoalCoach.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalKind.values().length];
            try {
                iArr[GoalKind.FIRST_5K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoalKind.FIVE_K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoalKind.TEN_K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoalKind.HALF_MARATHON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GoalKind.MARATHON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GoalKind.CUSTOM_DISTANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GoalKind.BUILD_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GoalKind.BUILD_DISTANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GoalKind.GENERAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RunningGoalCoach() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RunningGoalCoach.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/example/rungps/training/RunningGoalCoach$GoalKind;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_5K", "FIVE_K", "TEN_K", "HALF_MARATHON", "MARATHON", "CUSTOM_DISTANCE", "BUILD_DISTANCE", "BUILD_SPEED", "GENERAL", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoalKind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GoalKind[] $VALUES;
        public static final GoalKind FIRST_5K = new GoalKind("FIRST_5K", 0);
        public static final GoalKind FIVE_K = new GoalKind("FIVE_K", 1);
        public static final GoalKind TEN_K = new GoalKind("TEN_K", 2);
        public static final GoalKind HALF_MARATHON = new GoalKind("HALF_MARATHON", 3);
        public static final GoalKind MARATHON = new GoalKind("MARATHON", 4);
        public static final GoalKind CUSTOM_DISTANCE = new GoalKind("CUSTOM_DISTANCE", 5);
        public static final GoalKind BUILD_DISTANCE = new GoalKind("BUILD_DISTANCE", 6);
        public static final GoalKind BUILD_SPEED = new GoalKind("BUILD_SPEED", 7);
        public static final GoalKind GENERAL = new GoalKind("GENERAL", 8);

        private static final /* synthetic */ GoalKind[] $values() {
            return new GoalKind[]{FIRST_5K, FIVE_K, TEN_K, HALF_MARATHON, MARATHON, CUSTOM_DISTANCE, BUILD_DISTANCE, BUILD_SPEED, GENERAL};
        }

        public static EnumEntries<GoalKind> getEntries() {
            return $ENTRIES;
        }

        private GoalKind(String str, int i) {
        }

        static {
            GoalKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static GoalKind valueOf(String str) {
            return (GoalKind) Enum.valueOf(GoalKind.class, str);
        }

        public static GoalKind[] values() {
            return (GoalKind[]) $VALUES.clone();
        }
    }

    /* compiled from: RunningGoalCoach.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0099\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00068"}, d2 = {"Lcom/example/rungps/training/RunningGoalCoach$CoachPlan;", "", "goalKind", "Lcom/example/rungps/training/RunningGoalCoach$GoalKind;", "goalTitle", "", "headline", "timeframeLabel", "sessionsPerWeek", "weeklyDistance", "pacesBlock", "intensityBlock", "recoveryBlock", "weeklyOutline", "", "milestones", "parsedSummary", "pbLine", "<init>", "(Lcom/example/rungps/training/RunningGoalCoach$GoalKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getGoalKind", "()Lcom/example/rungps/training/RunningGoalCoach$GoalKind;", "getGoalTitle", "()Ljava/lang/String;", "getHeadline", "getTimeframeLabel", "getSessionsPerWeek", "getWeeklyDistance", "getPacesBlock", "getIntensityBlock", "getRecoveryBlock", "getWeeklyOutline", "()Ljava/util/List;", "getMilestones", "getParsedSummary", "getPbLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CoachPlan {
        public static final int $stable = 8;
        private final GoalKind goalKind;
        private final String goalTitle;
        private final String headline;
        private final String intensityBlock;
        private final List<String> milestones;
        private final String pacesBlock;
        private final String parsedSummary;
        private final String pbLine;
        private final String recoveryBlock;
        private final String sessionsPerWeek;
        private final String timeframeLabel;
        private final String weeklyDistance;
        private final List<String> weeklyOutline;

        public static /* synthetic */ CoachPlan copy$default(CoachPlan coachPlan, GoalKind goalKind, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, String str10, int i, Object obj) {
            return coachPlan.copy((i & 1) != 0 ? coachPlan.goalKind : goalKind, (i & 2) != 0 ? coachPlan.goalTitle : str, (i & 4) != 0 ? coachPlan.headline : str2, (i & 8) != 0 ? coachPlan.timeframeLabel : str3, (i & 16) != 0 ? coachPlan.sessionsPerWeek : str4, (i & 32) != 0 ? coachPlan.weeklyDistance : str5, (i & 64) != 0 ? coachPlan.pacesBlock : str6, (i & 128) != 0 ? coachPlan.intensityBlock : str7, (i & 256) != 0 ? coachPlan.recoveryBlock : str8, (i & 512) != 0 ? coachPlan.weeklyOutline : list, (i & 1024) != 0 ? coachPlan.milestones : list2, (i & 2048) != 0 ? coachPlan.parsedSummary : str9, (i & 4096) != 0 ? coachPlan.pbLine : str10);
        }

        /* renamed from: component1, reason: from getter */
        public final GoalKind getGoalKind() {
            return this.goalKind;
        }

        public final List<String> component10() {
            return this.weeklyOutline;
        }

        public final List<String> component11() {
            return this.milestones;
        }

        /* renamed from: component12, reason: from getter */
        public final String getParsedSummary() {
            return this.parsedSummary;
        }

        /* renamed from: component13, reason: from getter */
        public final String getPbLine() {
            return this.pbLine;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGoalTitle() {
            return this.goalTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTimeframeLabel() {
            return this.timeframeLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSessionsPerWeek() {
            return this.sessionsPerWeek;
        }

        /* renamed from: component6, reason: from getter */
        public final String getWeeklyDistance() {
            return this.weeklyDistance;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPacesBlock() {
            return this.pacesBlock;
        }

        /* renamed from: component8, reason: from getter */
        public final String getIntensityBlock() {
            return this.intensityBlock;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRecoveryBlock() {
            return this.recoveryBlock;
        }

        public final CoachPlan copy(GoalKind goalKind, String goalTitle, String headline, String timeframeLabel, String sessionsPerWeek, String weeklyDistance, String pacesBlock, String intensityBlock, String recoveryBlock, List<String> weeklyOutline, List<String> milestones, String parsedSummary, String pbLine) {
            Intrinsics.checkNotNullParameter(goalKind, "goalKind");
            Intrinsics.checkNotNullParameter(goalTitle, "goalTitle");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(timeframeLabel, "timeframeLabel");
            Intrinsics.checkNotNullParameter(sessionsPerWeek, "sessionsPerWeek");
            Intrinsics.checkNotNullParameter(weeklyDistance, "weeklyDistance");
            Intrinsics.checkNotNullParameter(pacesBlock, "pacesBlock");
            Intrinsics.checkNotNullParameter(intensityBlock, "intensityBlock");
            Intrinsics.checkNotNullParameter(recoveryBlock, "recoveryBlock");
            Intrinsics.checkNotNullParameter(weeklyOutline, "weeklyOutline");
            Intrinsics.checkNotNullParameter(milestones, "milestones");
            Intrinsics.checkNotNullParameter(parsedSummary, "parsedSummary");
            return new CoachPlan(goalKind, goalTitle, headline, timeframeLabel, sessionsPerWeek, weeklyDistance, pacesBlock, intensityBlock, recoveryBlock, weeklyOutline, milestones, parsedSummary, pbLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CoachPlan)) {
                return false;
            }
            CoachPlan coachPlan = (CoachPlan) other;
            return this.goalKind == coachPlan.goalKind && Intrinsics.areEqual(this.goalTitle, coachPlan.goalTitle) && Intrinsics.areEqual(this.headline, coachPlan.headline) && Intrinsics.areEqual(this.timeframeLabel, coachPlan.timeframeLabel) && Intrinsics.areEqual(this.sessionsPerWeek, coachPlan.sessionsPerWeek) && Intrinsics.areEqual(this.weeklyDistance, coachPlan.weeklyDistance) && Intrinsics.areEqual(this.pacesBlock, coachPlan.pacesBlock) && Intrinsics.areEqual(this.intensityBlock, coachPlan.intensityBlock) && Intrinsics.areEqual(this.recoveryBlock, coachPlan.recoveryBlock) && Intrinsics.areEqual(this.weeklyOutline, coachPlan.weeklyOutline) && Intrinsics.areEqual(this.milestones, coachPlan.milestones) && Intrinsics.areEqual(this.parsedSummary, coachPlan.parsedSummary) && Intrinsics.areEqual(this.pbLine, coachPlan.pbLine);
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((((((this.goalKind.hashCode() * 31) + this.goalTitle.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.timeframeLabel.hashCode()) * 31) + this.sessionsPerWeek.hashCode()) * 31) + this.weeklyDistance.hashCode()) * 31) + this.pacesBlock.hashCode()) * 31) + this.intensityBlock.hashCode()) * 31) + this.recoveryBlock.hashCode()) * 31) + this.weeklyOutline.hashCode()) * 31) + this.milestones.hashCode()) * 31) + this.parsedSummary.hashCode()) * 31;
            String str = this.pbLine;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CoachPlan(goalKind=" + this.goalKind + ", goalTitle=" + this.goalTitle + ", headline=" + this.headline + ", timeframeLabel=" + this.timeframeLabel + ", sessionsPerWeek=" + this.sessionsPerWeek + ", weeklyDistance=" + this.weeklyDistance + ", pacesBlock=" + this.pacesBlock + ", intensityBlock=" + this.intensityBlock + ", recoveryBlock=" + this.recoveryBlock + ", weeklyOutline=" + this.weeklyOutline + ", milestones=" + this.milestones + ", parsedSummary=" + this.parsedSummary + ", pbLine=" + this.pbLine + ")";
        }

        public CoachPlan(GoalKind goalKind, String goalTitle, String headline, String timeframeLabel, String sessionsPerWeek, String weeklyDistance, String pacesBlock, String intensityBlock, String recoveryBlock, List<String> weeklyOutline, List<String> milestones, String parsedSummary, String str) {
            Intrinsics.checkNotNullParameter(goalKind, "goalKind");
            Intrinsics.checkNotNullParameter(goalTitle, "goalTitle");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(timeframeLabel, "timeframeLabel");
            Intrinsics.checkNotNullParameter(sessionsPerWeek, "sessionsPerWeek");
            Intrinsics.checkNotNullParameter(weeklyDistance, "weeklyDistance");
            Intrinsics.checkNotNullParameter(pacesBlock, "pacesBlock");
            Intrinsics.checkNotNullParameter(intensityBlock, "intensityBlock");
            Intrinsics.checkNotNullParameter(recoveryBlock, "recoveryBlock");
            Intrinsics.checkNotNullParameter(weeklyOutline, "weeklyOutline");
            Intrinsics.checkNotNullParameter(milestones, "milestones");
            Intrinsics.checkNotNullParameter(parsedSummary, "parsedSummary");
            this.goalKind = goalKind;
            this.goalTitle = goalTitle;
            this.headline = headline;
            this.timeframeLabel = timeframeLabel;
            this.sessionsPerWeek = sessionsPerWeek;
            this.weeklyDistance = weeklyDistance;
            this.pacesBlock = pacesBlock;
            this.intensityBlock = intensityBlock;
            this.recoveryBlock = recoveryBlock;
            this.weeklyOutline = weeklyOutline;
            this.milestones = milestones;
            this.parsedSummary = parsedSummary;
            this.pbLine = str;
        }

        public final GoalKind getGoalKind() {
            return this.goalKind;
        }

        public final String getGoalTitle() {
            return this.goalTitle;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getTimeframeLabel() {
            return this.timeframeLabel;
        }

        public final String getSessionsPerWeek() {
            return this.sessionsPerWeek;
        }

        public final String getWeeklyDistance() {
            return this.weeklyDistance;
        }

        public final String getPacesBlock() {
            return this.pacesBlock;
        }

        public final String getIntensityBlock() {
            return this.intensityBlock;
        }

        public final String getRecoveryBlock() {
            return this.recoveryBlock;
        }

        public final List<String> getWeeklyOutline() {
            return this.weeklyOutline;
        }

        public final List<String> getMilestones() {
            return this.milestones;
        }

        public /* synthetic */ CoachPlan(GoalKind goalKind, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(goalKind, str, str2, str3, str4, str5, str6, str7, str8, list, list2, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? null : str10);
        }

        public final String getParsedSummary() {
            return this.parsedSummary;
        }

        public final String getPbLine() {
            return this.pbLine;
        }
    }

    public final GoalKind parseGoal(String raw, GoalPromptParser.ParsedGoal parsed) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(parsed, "parsed");
        String lowerCase = raw.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String obj = StringsKt.trim((CharSequence) lowerCase).toString();
        if (StringsKt.isBlank(obj)) {
            return GoalKind.GENERAL;
        }
        Double targetDistanceKm = parsed.getTargetDistanceKm();
        if (targetDistanceKm != null) {
            double doubleValue = targetDistanceKm.doubleValue();
            if (4.5d <= doubleValue && doubleValue <= 5.5d && (StringsKt.contains$default((CharSequence) obj, (CharSequence) "first", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "couch", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "never run", false, 2, (Object) null))) {
                return GoalKind.FIRST_5K;
            }
            if (4.5d <= doubleValue && doubleValue <= 5.5d) {
                return GoalKind.FIVE_K;
            }
            if (9.0d <= doubleValue && doubleValue <= 11.0d) {
                return GoalKind.TEN_K;
            }
            if (20.0d <= doubleValue && doubleValue <= 22.5d) {
                return GoalKind.HALF_MARATHON;
            }
            if (doubleValue >= 40.0d) {
                return GoalKind.MARATHON;
            }
            return GoalKind.CUSTOM_DISTANCE;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "couch", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "never run", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "start running", false, 2, (Object) null) || (StringsKt.contains$default((CharSequence) obj, (CharSequence) "beginner", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) obj, (CharSequence) "5", false, 2, (Object) null))) {
            return GoalKind.FIRST_5K;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "marathon", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) obj, (CharSequence) "half", false, 2, (Object) null)) {
            return GoalKind.MARATHON;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "half", false, 2, (Object) null)) {
            return GoalKind.HALF_MARATHON;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "10k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "10 km", false, 2, (Object) null)) {
            return GoalKind.TEN_K;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "5k", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "parkrun", false, 2, (Object) null)) {
            return GoalKind.FIVE_K;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "faster", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "speed", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "pb", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "pr", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "sub ", false, 2, (Object) null)) {
            return GoalKind.BUILD_SPEED;
        }
        if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "more", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "mileage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj, (CharSequence) "volume", false, 2, (Object) null)) {
            return GoalKind.BUILD_DISTANCE;
        }
        return GoalKind.GENERAL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoachPlan build$default(RunningGoalCoach runningGoalCoach, String str, RaceTrendCalculator.Snapshot snapshot, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return runningGoalCoach.build(str, snapshot, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r9 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoachPlan build(String goalText, RaceTrendCalculator.Snapshot snap, Map<Double, Long> distancePbsKm) {
        String str;
        String str2;
        String str3;
        List<RaceTrendCalculator.Projection> projections;
        Object obj;
        CoachPlan planFirst5k;
        Double avgKmLatest4Weeks;
        Intrinsics.checkNotNullParameter(goalText, "goalText");
        Intrinsics.checkNotNullParameter(distancePbsKm, "distancePbsKm");
        GoalPromptParser.ParsedGoal parse = GoalPromptParser.INSTANCE.parse(goalText);
        GoalKind parseGoal = parseGoal(goalText, parse);
        double doubleValue = (snap == null || (avgKmLatest4Weeks = snap.getAvgKmLatest4Weeks()) == null) ? 0.0d : avgKmLatest4Weeks.doubleValue();
        Integer paceSecPerKm = paceSecPerKm(snap);
        if (paceSecPerKm != null) {
            str = INSTANCE.formatPace(paceSecPerKm.intValue() + 50);
        }
        str = "6:30–7:30/km (conversational)";
        if (paceSecPerKm != null) {
            str2 = INSTANCE.formatPace(paceSecPerKm.intValue() + 15);
        }
        str2 = "5:45–6:30/km";
        if (paceSecPerKm != null) {
            str3 = INSTANCE.formatPace(RangesKt.coerceAtLeast(paceSecPerKm.intValue() - 15, 240));
        }
        if (snap != null && (projections = snap.getProjections()) != null) {
            Iterator it = projections.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Iterator it2 = it;
                if (StringsKt.contains$default((CharSequence) ((RaceTrendCalculator.Projection) obj).getLabel(), (CharSequence) "10", false, 2, (Object) null)) {
                    break;
                }
                it = it2;
            }
            RaceTrendCalculator.Projection projection = (RaceTrendCalculator.Projection) obj;
            if (projection != null) {
                str3 = projection.getFormattedPacePerKm();
                if (str3 == null) {
                    str3 = "5:15–5:45/km";
                }
                boolean z = doubleValue < 12.0d;
                Double targetDistanceKm = parse.getTargetDistanceKm();
                DistancePbLookup.TimeAtDistance bestTimeAt = targetDistanceKm != null ? DistancePbLookup.INSTANCE.bestTimeAt(targetDistanceKm.doubleValue(), distancePbsKm) : null;
                String buildParsedSummary = buildParsedSummary(parse);
                String buildPbLine = buildPbLine(parse, bestTimeAt);
                switch (WhenMappings.$EnumSwitchMapping$0[parseGoal.ordinal()]) {
                    case 1:
                        planFirst5k = planFirst5k(goalText, parse, str, str2);
                        break;
                    case 2:
                        planFirst5k = plan5k(goalText, parse, doubleValue, z, str, str3, snap, bestTimeAt);
                        break;
                    case 3:
                        planFirst5k = plan10k(goalText, parse, doubleValue, z, str, str3, snap, bestTimeAt);
                        break;
                    case 4:
                        planFirst5k = planHalf(goalText, parse, doubleValue, z, str, str3, str2, bestTimeAt);
                        break;
                    case 5:
                        planFirst5k = planMarathon(goalText, parse, doubleValue, z, str, str2, bestTimeAt);
                        break;
                    case 6:
                        planFirst5k = planCustomDistance(goalText, parse, doubleValue, z, str, str3, str2, bestTimeAt);
                        break;
                    case 7:
                        planFirst5k = planSpeed(goalText, parse, doubleValue, str, str3, snap, bestTimeAt);
                        break;
                    case 8:
                        planFirst5k = planDistance(goalText, parse, doubleValue, str, str2);
                        break;
                    case 9:
                        planFirst5k = planGeneral(goalText, parse, doubleValue, str, str2, snap, bestTimeAt);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return CoachPlan.copy$default(planFirst5k, null, null, null, null, null, null, null, null, null, null, null, buildParsedSummary, buildPbLine, 2047, null);
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (doubleValue < 12.0d) {
        }
        Double targetDistanceKm2 = parse.getTargetDistanceKm();
        if (targetDistanceKm2 != null) {
        }
        String buildParsedSummary2 = buildParsedSummary(parse);
        String buildPbLine2 = buildPbLine(parse, bestTimeAt);
        switch (WhenMappings.$EnumSwitchMapping$0[parseGoal.ordinal()]) {
        }
        return CoachPlan.copy$default(planFirst5k, null, null, null, null, null, null, null, null, null, null, null, buildParsedSummary2, buildPbLine2, 2047, null);
    }

    private final String buildParsedSummary(GoalPromptParser.ParsedGoal parsed) {
        if (StringsKt.isBlank(parsed.getRawText())) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        String distanceLabel = parsed.getDistanceLabel();
        if (distanceLabel != null) {
            arrayList.add("Distance: " + distanceLabel);
        }
        Long targetTimeMs = parsed.getTargetTimeMs();
        if (targetTimeMs != null) {
            arrayList.add("Target time: " + RaceTrendCalculator.INSTANCE.formatRaceTime(targetTimeMs.longValue()));
        }
        Integer targetPaceSecPerKm = parsed.getTargetPaceSecPerKm();
        if (targetPaceSecPerKm != null) {
            arrayList.add("Target pace: " + INSTANCE.formatPace(targetPaceSecPerKm.intValue()));
        }
        String timeframeLabel = parsed.getTimeframeLabel();
        if (timeframeLabel != null) {
            arrayList.add("Timeframe: " + timeframeLabel);
        }
        return arrayList.isEmpty() ? "Goal noted — add distance or time for sharper pacing." : CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }

    private final String buildPbLine(GoalPromptParser.ParsedGoal parsed, DistancePbLookup.TimeAtDistance pb) {
        String str;
        String str2;
        Double targetDistanceKm = parsed.getTargetDistanceKm();
        if (targetDistanceKm == null) {
            return null;
        }
        double doubleValue = targetDistanceKm.doubleValue();
        if (pb == null) {
            String distanceLabel = parsed.getDistanceLabel();
            if (distanceLabel == null) {
                distanceLabel = GoalPromptParser.INSTANCE.formatDistanceLabel(doubleValue);
            }
            return "No recorded PB at " + distanceLabel + " yet — projections use recent training.";
        }
        String formatRaceTime = RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs());
        if (pb.getInterpolated()) {
            str = "Est. best at " + GoalPromptParser.INSTANCE.formatDistanceLabel(doubleValue) + ": " + formatRaceTime + " (" + pb.getAnchorLabel() + ")";
        } else {
            str = "Your " + GoalPromptParser.INSTANCE.formatDistanceLabel(doubleValue) + " PB: " + formatRaceTime;
        }
        Long targetTimeMs = parsed.getTargetTimeMs();
        if (targetTimeMs == null) {
            return str;
        }
        String formatRaceTime2 = RaceTrendCalculator.INSTANCE.formatRaceTime(targetTimeMs.longValue());
        double timeMs = ((r0 - pb.getTimeMs()) / pb.getTimeMs()) * 100.0d;
        if (timeMs < -3.0d) {
            str2 = "Target " + formatRaceTime2 + " is faster than current shape — allow extra weeks or adjust goal.";
        } else if (timeMs < 5.0d) {
            str2 = "Target " + formatRaceTime2 + " is realistic with consistent training.";
        } else {
            str2 = "Target " + formatRaceTime2 + " is conservative vs current fitness — you can aim sharper if recovery is good.";
        }
        return str + " · " + str2;
    }

    private final String timeframeLabel(GoalPromptParser.ParsedGoal parsed, String r2) {
        String timeframeLabel = parsed.getTimeframeLabel();
        return timeframeLabel == null ? r2 : timeframeLabel;
    }

    private final CoachPlan planFirst5k(String goal, GoalPromptParser.ParsedGoal parsed, String easy, String steady) {
        GoalKind goalKind = GoalKind.FIRST_5K;
        String str = goal;
        if (StringsKt.isBlank(str)) {
            str = "Run my first 5K";
        }
        return new CoachPlan(goalKind, str, "Walk–run build-up: finish a continuous 5K without rushing.", timeframeLabel(parsed, "8–10 weeks"), "3 days (Mon / Wed / Sat or similar)", "Week 1 ~6–8 km total → week 8 ~18–22 km (mostly easy)", "Easy days " + easy + " · Steady intervals " + steady + " · Walk breaks OK early on", "80% easy · 15% brisk walk/jog intervals · 5% optional strides in last 2 weeks", "Rest or gentle walk on off days. Sleep 7–8 h. If shins or knees ache, repeat the week instead of adding distance.", CollectionsKt.listOf((Object[]) new String[]{"Weeks 1–2: 1 min jog / 2 min walk × 8–10", "Weeks 3–4: 2 min jog / 1 min walk, build to 20 min moving", "Weeks 5–6: 5 min jog blocks, one 25–28 min easy run", "Weeks 7–8: 30 min easy continuous, then 5K attempt"}), CollectionsKt.listOf((Object[]) new String[]{"Week 4: 20+ min without stopping", "Week 8: 5 km continuous or timed parkrun"}), null, null, 6144, null);
    }

    private final CoachPlan plan5k(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, boolean lowBase, String easy, String tempo, RaceTrendCalculator.Snapshot snap, DistancePbLookup.TimeAtDistance pb) {
        String str;
        RaceTrendCalculator.Projection projection;
        String str2;
        String formatPace;
        List<RaceTrendCalculator.Projection> projections;
        Object obj;
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        if (timeframeWeeks == null || (str = timeframeWeeks.intValue() + " weeks") == null) {
            if (lowBase) {
                str = "10–12 weeks";
            } else if (weeklyKm < 20.0d) {
                str = "8–10 weeks";
            } else {
                str = "6–8 weeks";
            }
        }
        String str3 = str;
        Integer targetPaceSecPerKm = parsed.getTargetPaceSecPerKm();
        String formatPace2 = targetPaceSecPerKm != null ? INSTANCE.formatPace(targetPaceSecPerKm.intValue()) : null;
        if (snap == null || (projections = snap.getProjections()) == null) {
            projection = null;
        } else {
            Iterator<T> it = projections.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((RaceTrendCalculator.Projection) obj).getLabel(), "5 km")) {
                    break;
                }
            }
            projection = (RaceTrendCalculator.Projection) obj;
        }
        if (parsed.getTargetTimeMs() != null) {
            Integer targetPaceSecPerKm2 = parsed.getTargetPaceSecPerKm();
            if (targetPaceSecPerKm2 == null || (formatPace = INSTANCE.formatPace(targetPaceSecPerKm2.intValue())) == null) {
                formatPace = formatPace(MathKt.roundToInt((parsed.getTargetTimeMs().longValue() / 1000.0d) / 5.0d));
            }
            str2 = "Race target " + RaceTrendCalculator.INSTANCE.formatRaceTime(parsed.getTargetTimeMs().longValue()) + " (~" + formatPace + ").";
        } else if (formatPace2 != null) {
            str2 = "Race target pace ~" + formatPace2 + ".";
        } else {
            if ((projection != null ? projection.getPredictedMillis() : null) != null) {
                String formatRaceTime = RaceTrendCalculator.INSTANCE.formatRaceTime(projection.getPredictedMillis().longValue());
                String formattedPacePerKm = projection.getFormattedPacePerKm();
                if (formattedPacePerKm == null) {
                    formattedPacePerKm = tempo;
                }
                str2 = "Projected fitness ~" + formatRaceTime + " (" + formattedPacePerKm + ").";
            } else {
                str2 = pb != null ? "Current shape ~" + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + " at 5 km." : "Target race pace near " + tempo + " on fresh legs.";
            }
        }
        GoalKind goalKind = GoalKind.FIVE_K;
        String str4 = goal;
        if (StringsKt.isBlank(str4) && (str4 = parsed.getDistanceLabel()) == null) {
            str4 = "5K goal";
        }
        return new CoachPlan(goalKind, str4, "Sharpen speed while keeping most running easy.", str3, lowBase ? "3–4 runs" : "4 runs", lowBase ? "Build 15 → 28 km/week max (+10% per week)" : "Hold 25–35 km/week; peak week ~10% above usual", "Easy " + easy + " · Tempo / intervals " + tempo + " · " + str2, "2 easy · 1 quality (tempo or 400s) · 1 optional steady · long run 8–10 km easy", "Easy day after every hard session. One full rest day. Drop a quality session if sleep under 6 h two nights in a row.", CollectionsKt.listOf((Object[]) new String[]{"Easy run 30–40 min", "Tempo: 10 min warm-up · 3×5 min @ tempo · 2 min jog · cool down", "Easy 30 min or rest", "Long easy 8–10 km (or 60 min cap)"}), CollectionsKt.listOf((Object[]) new String[]{"Week 4: 5 km time trial or parkrun", "Week 6–8: taper 20% volume, race"}), null, null, 6144, null);
    }

    private final CoachPlan plan10k(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, boolean lowBase, String easy, String tempo, RaceTrendCalculator.Snapshot snap, DistancePbLookup.TimeAtDistance pb) {
        String str;
        RaceTrendCalculator.Projection projection;
        String formatRaceTime;
        Long predictedMillis;
        String str2;
        List<RaceTrendCalculator.Projection> projections;
        Object obj;
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        if (timeframeWeeks == null || (str = timeframeWeeks.intValue() + " weeks") == null) {
            if (lowBase) {
                str = "14–16 weeks";
            } else if (weeklyKm < 25.0d) {
                str = "12–14 weeks";
            } else {
                str = "10–12 weeks";
            }
        }
        String str3 = str;
        if (snap == null || (projections = snap.getProjections()) == null) {
            projection = null;
        } else {
            Iterator<T> it = projections.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((RaceTrendCalculator.Projection) obj).getLabel(), "10 km")) {
                    break;
                }
            }
            projection = (RaceTrendCalculator.Projection) obj;
        }
        Long targetTimeMs = parsed.getTargetTimeMs();
        if (targetTimeMs == null || (formatRaceTime = RaceTrendCalculator.INSTANCE.formatRaceTime(targetTimeMs.longValue())) == null) {
            if (projection == null || (predictedMillis = projection.getPredictedMillis()) == null) {
                formatRaceTime = pb != null ? RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) : null;
            } else {
                formatRaceTime = RaceTrendCalculator.INSTANCE.formatRaceTime(predictedMillis.longValue());
            }
        }
        GoalKind goalKind = GoalKind.TEN_K;
        String str4 = goal;
        if (StringsKt.isBlank(str4) && (str4 = parsed.getDistanceLabel()) == null) {
            str4 = "10K goal";
        }
        String str5 = str4;
        if (lowBase) {
            str2 = "16 → 40 km/week peak (+8–10% weekly)";
        } else {
            str2 = "35–50 km/week; long run up to 14–16 km";
        }
        String str6 = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Easy " + easy + " · Tempo / threshold " + tempo);
        Integer targetPaceSecPerKm = parsed.getTargetPaceSecPerKm();
        if (targetPaceSecPerKm != null) {
            sb.append(" · Goal pace " + INSTANCE.formatPace(targetPaceSecPerKm.intValue()));
        }
        Unit unit = Unit.INSTANCE;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"Easy 40–50 min", "Tempo 20–30 min continuous or 2×15 min", "Easy 35 min + strides", "Long 12–16 km easy", "Optional easy 30 min or cross-train"});
        String[] strArr = new String[3];
        strArr[0] = "Week 6: 10 km easy (slow)";
        strArr[1] = formatRaceTime != null ? "Race target: ~" + formatRaceTime : null;
        strArr[2] = "Taper final 10 days";
        return new CoachPlan(goalKind, str5, "Aerobic base first, then race-specific tempo.", str3, "4–5 runs", str6, sb2, "3 easy · 1 tempo or progression · 1 long (90 min max early on)", "Every 3rd week cut volume ~20%. Foam roll / walk on rest days. Fuel runs over 75 min.", listOf, CollectionsKt.listOfNotNull((Object[]) strArr), null, null, 6144, null);
    }

    private final CoachPlan planHalf(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, boolean lowBase, String easy, String tempo, String steady, DistancePbLookup.TimeAtDistance pb) {
        String str;
        String str2;
        String str3;
        GoalKind goalKind = GoalKind.HALF_MARATHON;
        String str4 = goal;
        if (StringsKt.isBlank(str4) && (str4 = parsed.getDistanceLabel()) == null) {
            str4 = "Half marathon";
        }
        String str5 = str4;
        StringBuilder sb = new StringBuilder("Gradual mileage with one weekly long run and controlled tempo.");
        if (pb != null) {
            sb.append(" Current half shape ~" + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + ".");
        }
        Unit unit = Unit.INSTANCE;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        if (timeframeWeeks == null || (str = timeframeWeeks.intValue() + " weeks") == null) {
            if (lowBase) {
                str = "16–20 weeks";
            } else if (weeklyKm < 30.0d) {
                str = "14–16 weeks";
            } else {
                str = "12–14 weeks";
            }
        }
        String str6 = str;
        if (lowBase) {
            str2 = "20 → 55 km/week peak (never +15% two weeks in a row)";
        } else {
            str2 = "45–65 km/week; long run 18–21 km";
        }
        String str7 = str2;
        Integer targetPaceSecPerKm = parsed.getTargetPaceSecPerKm();
        if (targetPaceSecPerKm == null || (str3 = " · Goal " + INSTANCE.formatPace(targetPaceSecPerKm.intValue())) == null) {
            str3 = "";
        }
        return new CoachPlan(goalKind, str5, sb2, str6, "4–5 runs", str7, "Easy " + easy + " · Marathon-pace blocks " + steady + " · Half-pace work " + tempo + str3, "2–3 easy · 1 tempo/progression · 1 long · optional recovery jog", "Rest day before long run. After 16+ km longs, easy week next cycle. Listen for persistent joint pain — cut volume 30%.", CollectionsKt.listOf((Object[]) new String[]{"Easy 45–60 min", "Tempo 25–40 min or 2×20 min @ half effort", "Easy 40 min", "Long 16–21 km building every 2 weeks", "Recovery 30 min optional"}), CollectionsKt.listOf((Object[]) new String[]{"Week 8: 16 km long run comfortable", "Week 12–14: race week taper 25–40%"}), null, null, 6144, null);
    }

    private final CoachPlan planMarathon(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, boolean lowBase, String easy, String steady, DistancePbLookup.TimeAtDistance pb) {
        String str;
        String str2;
        GoalKind goalKind = GoalKind.MARATHON;
        String str3 = goal;
        if (StringsKt.isBlank(str3) && (str3 = parsed.getDistanceLabel()) == null) {
            str3 = "Marathon";
        }
        String str4 = str3;
        StringBuilder sb = new StringBuilder("Slow build to a peak long run, then taper — patience beats hero weeks.");
        if (pb != null) {
            sb.append(" Est. marathon shape ~" + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + ".");
        }
        Unit unit = Unit.INSTANCE;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        if (timeframeWeeks == null || (str = timeframeWeeks.intValue() + " weeks") == null) {
            if (lowBase) {
                str = "20–24 weeks";
            } else if (weeklyKm < 35.0d) {
                str = "18–20 weeks";
            } else {
                str = "16–18 weeks";
            }
        }
        String str5 = str;
        if (lowBase) {
            str2 = "25 → 70 km/week peak";
        } else {
            str2 = "55–80 km/week; long run up to 32–35 km";
        }
        return new CoachPlan(goalKind, str4, sb2, str5, "4–6 runs (quality only when recovered)", str2, "Easy " + easy + " · Long runs same pace · MP blocks " + steady + " in last 8 weeks", "Mostly easy. MP segments 2×20 min or 1×60 min in final block. No new speed work in last 4 weeks.", "Sleep is training. Carbs on long runs. Cut a run if illness — resume at 70% volume, not 100%.", CollectionsKt.listOf((Object[]) new String[]{"Easy 50–70 min", "Easy 40 min or light tempo", "Easy 40–50 min", "Long 24–35 km (step-back every 3rd week)", "Optional recovery jog"}), CollectionsKt.listOf((Object[]) new String[]{"Week 12: 28–30 km long", "Week 16–18: marathon + 2-week taper"}), null, null, 6144, null);
    }

    private final CoachPlan planCustomDistance(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, boolean lowBase, String easy, String tempo, String steady, DistancePbLookup.TimeAtDistance pb) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Double targetDistanceKm = parsed.getTargetDistanceKm();
        double doubleValue = targetDistanceKm != null ? targetDistanceKm.doubleValue() : 8.0d;
        String distanceLabel = parsed.getDistanceLabel();
        if (distanceLabel == null) {
            distanceLabel = GoalPromptParser.INSTANCE.formatDistanceLabel(doubleValue);
        }
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        if (timeframeWeeks == null || (str = timeframeWeeks.intValue() + " weeks") == null) {
            if (doubleValue <= 6.0d) {
                str = "6–8 weeks";
            } else if (doubleValue <= 12.0d) {
                str = "10–12 weeks";
            } else if (doubleValue <= 22.0d) {
                str = "12–16 weeks";
            } else {
                str = "16–20 weeks";
            }
        }
        String str7 = str;
        double coerceIn = RangesKt.coerceIn(doubleValue * 0.85d, 5.0d, 35.0d);
        Long targetTimeMs = parsed.getTargetTimeMs();
        if (targetTimeMs == null || (str2 = "Race target " + RaceTrendCalculator.INSTANCE.formatRaceTime(targetTimeMs.longValue()) + " at " + distanceLabel + ".") == null) {
            str2 = pb != null ? "Current best estimate " + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + " (" + pb.getAnchorLabel() + ")." : "Build aerobic support, then race-specific work.";
        }
        GoalKind goalKind = GoalKind.CUSTOM_DISTANCE;
        String str8 = goal;
        if (StringsKt.isBlank(str8)) {
            str8 = distanceLabel;
        }
        String str9 = str8;
        String str10 = "Plan tuned for " + distanceLabel + " using your PBs and recent volume.";
        String str11 = lowBase ? "3–4 runs" : "4–5 runs";
        if (lowBase) {
            str4 = str11;
            str3 = str7;
            str6 = "Start " + RangesKt.coerceAtLeast(MathKt.roundToInt(weeklyKm), 12) + " km/week → peak " + RangesKt.coerceAtLeast(MathKt.roundToInt(3.5d * doubleValue), 25) + " km";
            str5 = str10;
        } else {
            str3 = str7;
            str4 = str11;
            str5 = str10;
            str6 = "Maintain " + MathKt.roundToInt(weeklyKm) + "–" + MathKt.roundToInt(1.15d * weeklyKm) + " km/week; long run up to " + MathKt.roundToInt(coerceIn) + " km";
        }
        return new CoachPlan(goalKind, str9, str5, str3, str4, str6, "Easy " + easy + " · Steady " + steady + " · Quality " + tempo + " · " + str2, "2–3 easy · 1 tempo or intervals · 1 long · optional recovery day", "Step back every 3rd week (~20% less). Never stack hard days without easy between.", CollectionsKt.listOf((Object[]) new String[]{"Easy 40–50 min", "Tempo or intervals scaled to " + distanceLabel + " (" + RangesKt.coerceAtLeast(MathKt.roundToInt(0.4d * doubleValue), 2) + "–" + MathKt.roundToInt(0.6d * doubleValue) + " km of quality)", "Easy 35–45 min", "Long " + MathKt.roundToInt(coerceIn) + " km easy (build 1–2 km every 2 weeks)", "Optional easy 30 min"}), CollectionsKt.listOf((Object[]) new String[]{"Mid-plan: " + MathKt.roundToInt(doubleValue * 0.7d) + " km continuous easy", "Race week: " + distanceLabel + " attempt"}), null, null, 6144, null);
    }

    private final CoachPlan planSpeed(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, String easy, String tempo, RaceTrendCalculator.Snapshot snap, DistancePbLookup.TimeAtDistance pb) {
        List listOf;
        List<RaceTrendCalculator.Projection> projections;
        List take;
        GoalKind goalKind = GoalKind.BUILD_SPEED;
        String str = goal;
        if (StringsKt.isBlank(str)) {
            str = "Run faster";
        }
        String str2 = str;
        StringBuilder sb = new StringBuilder("Keep volume steady; add structured speed without skipping recovery.");
        if (pb != null) {
            sb.append(" Reference: " + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + " at " + GoalPromptParser.INSTANCE.formatDistanceLabel(pb.getDistanceKm()) + ".");
        }
        Unit unit = Unit.INSTANCE;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String timeframeLabel = timeframeLabel(parsed, "6–10 weeks");
        String str3 = "Maintain " + RangesKt.coerceAtLeast(MathKt.roundToInt(weeklyKm), 15) + "–" + RangesKt.coerceAtLeast(MathKt.roundToInt(1.05d * weeklyKm), 20) + " km/week — don't chase mileage and speed together";
        String str4 = "Easy " + easy + " · Rep pace ~" + tempo + " or slightly faster · Jog recoveries fully";
        List listOf2 = CollectionsKt.listOf((Object[]) new String[]{"Easy 40 min + strides", "Intervals: 6×3 min @ tempo, 90 s jog", "Easy 35 min", "Long easy 10–14 km"});
        if (snap == null || (projections = snap.getProjections()) == null || (take = CollectionsKt.take(projections, 2)) == null) {
            listOf = CollectionsKt.listOf((Object[]) new String[]{"Week 4: 3 km time trial", "Week 8: target race or 5K test"});
        } else {
            List<RaceTrendCalculator.Projection> list = take;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (RaceTrendCalculator.Projection projection : list) {
                String label = projection.getLabel();
                String formattedPacePerKm = projection.getFormattedPacePerKm();
                if (formattedPacePerKm == null) {
                    formattedPacePerKm = "—";
                }
                arrayList.add(label + ": " + formattedPacePerKm);
            }
            listOf = arrayList;
        }
        return new CoachPlan(goalKind, str2, sb2, timeframeLabel, "4 runs (max 1–2 hard)", str3, str4, "2 easy · 1 intervals/tempo · 1 long easy · strides 4×20 s after easy runs", "48 h between hard days. If HR stays high on easy runs, you're overreaching — easy week.", listOf2, listOf, null, null, 6144, null);
    }

    private final CoachPlan planDistance(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, String easy, String steady) {
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(1.25d * weeklyKm), MathKt.roundToInt(weeklyKm) + 5, 80);
        GoalKind goalKind = GoalKind.BUILD_DISTANCE;
        String str = goal;
        if (StringsKt.isBlank(str)) {
            str = "Run more";
        }
        return new CoachPlan(goalKind, str, "Grow weekly distance slowly — almost all of it easy.", timeframeLabel(parsed, "8–12 weeks"), "4–5 easy-focused runs", "From " + MathKt.roundToInt(weeklyKm) + " km/week toward ~" + coerceIn + " km/week (+5–10% per week, step-back every 4th week)", "Stay at " + easy + " · Optional steady " + steady + " on one mid-week run", "90% easy · 10% steady — no hard intervals until base feels solid", "One rest day minimum. After a big week, next week −20% volume. Pair with sleep and hydration.", CollectionsKt.listOf((Object[]) new String[]{"Easy 40 min", "Easy 50 min or steady 35 min", "Easy 40 min", "Long run +2–3 km vs last week (cap +10%)", "Optional easy 30 min"}), CollectionsKt.listOf((Object[]) new String[]{"Week 4: hit new weekly km total", "Week 8–12: hold target volume comfortably"}), null, null, 6144, null);
    }

    private final CoachPlan planGeneral(String goal, GoalPromptParser.ParsedGoal parsed, double weeklyKm, String easy, String steady, RaceTrendCalculator.Snapshot snap, DistancePbLookup.TimeAtDistance pb) {
        String trendSentence;
        String simplifyTrend = (snap == null || (trendSentence = snap.getTrendSentence()) == null) ? null : INSTANCE.simplifyTrend(trendSentence);
        GoalKind goalKind = GoalKind.GENERAL;
        String str = goal;
        if (StringsKt.isBlank(str)) {
            str = "General fitness";
        }
        String str2 = str;
        if (simplifyTrend == null) {
            simplifyTrend = "Balanced week: mostly easy running with one slightly stronger day.";
        }
        String str3 = simplifyTrend;
        String timeframeLabel = timeframeLabel(parsed, "Ongoing (review every 4 weeks)");
        String str4 = weeklyKm > 0.0d ? "~" + MathKt.roundToInt(weeklyKm) + " km/week (hold or +5%)" : "Start 12–18 km/week across 3 runs";
        String str5 = "Easy " + easy + " · Steady " + steady;
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"Easy 30–45 min", "Steady 25–35 min or gentle fartlek", "Easy 30 min", "Long 8–12 km when ready"});
        String[] strArr = new String[2];
        strArr[0] = pb != null ? "Best recent: " + RaceTrendCalculator.INSTANCE.formatRaceTime(pb.getTimeMs()) + " at " + GoalPromptParser.INSTANCE.formatDistanceLabel(pb.getDistanceKm()) : null;
        strArr[1] = "Add a race distance in your goal for a tailored block";
        return new CoachPlan(goalKind, str2, str3, timeframeLabel, "3–4 runs", str4, str5, "2–3 easy · 1 steady or fartlek · optional long 60–75 min", "One full rest day. Stretch calves/hips. If sore 48 h after hard effort, repeat easy week.", listOf, CollectionsKt.listOfNotNull((Object[]) strArr), null, null, 6144, null);
    }

    private final String simplifyTrend(String s) {
        String str = s;
        return StringsKt.contains((CharSequence) str, (CharSequence) "up sharply", true) ? "Your recent mileage jumped — consider a lighter week to absorb it." : StringsKt.contains((CharSequence) str, (CharSequence) "down", true) ? "Volume dipped lately — add one easy run if you feel fresh." : StringsKt.contains((CharSequence) str, (CharSequence) "similar", true) ? "Your mileage is steady — good time to add a small quality session." : "Keep logging runs so pace and volume advice stay personal.";
    }

    private final Integer paceSecPerKm(RaceTrendCalculator.Snapshot snap) {
        if (snap == null || snap.getAnchorDistanceKm() <= 0.0d || snap.getAnchorTimeMs() <= 0) {
            return null;
        }
        return Integer.valueOf(MathKt.roundToInt((snap.getAnchorTimeMs() / 1000.0d) / snap.getAnchorDistanceKm()));
    }

    private final String formatPace(int secPerKm) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d/km", Arrays.copyOf(new Object[]{Integer.valueOf(secPerKm / 60), Integer.valueOf(secPerKm % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
