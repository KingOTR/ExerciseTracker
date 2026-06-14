package com.example.rungps.training;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RunGymPeriodization.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J6\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/training/RunGymPeriodization;", "", "<init>", "()V", "suggest", "Lcom/example/rungps/training/RunGymPeriodization$WorkoutSuggestion;", "lastGym", "Lcom/example/rungps/data/GymSessionEntity;", "lastGymSets", "", "Lcom/example/rungps/data/GymSetEntity;", "lastRun", "Lcom/example/rungps/data/RunEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "muscleGroupForExercise", "Lkotlin/Function1;", "", "nowMs", "", "zone", "Ljava/time/ZoneId;", "gymSessionsLast48h", "", "isLowerHeavy", "", "session", "sets", "inferGroupFromNameForPeriodization", HintConstants.AUTOFILL_HINT_NAME, "WorkoutSuggestion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunGymPeriodization {
    public static final int $stable = 0;
    public static final RunGymPeriodization INSTANCE = new RunGymPeriodization();

    private RunGymPeriodization() {
    }

    /* compiled from: RunGymPeriodization.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/training/RunGymPeriodization$WorkoutSuggestion;", "", "headline", "", "detail", "preferredRunType", "preferredGymFocus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeadline", "()Ljava/lang/String;", "getDetail", "getPreferredRunType", "getPreferredGymFocus", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkoutSuggestion {
        public static final int $stable = 0;
        private final String detail;
        private final String headline;
        private final String preferredGymFocus;
        private final String preferredRunType;

        public static /* synthetic */ WorkoutSuggestion copy$default(WorkoutSuggestion workoutSuggestion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = workoutSuggestion.headline;
            }
            if ((i & 2) != 0) {
                str2 = workoutSuggestion.detail;
            }
            if ((i & 4) != 0) {
                str3 = workoutSuggestion.preferredRunType;
            }
            if ((i & 8) != 0) {
                str4 = workoutSuggestion.preferredGymFocus;
            }
            return workoutSuggestion.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPreferredRunType() {
            return this.preferredRunType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPreferredGymFocus() {
            return this.preferredGymFocus;
        }

        public final WorkoutSuggestion copy(String headline, String detail, String preferredRunType, String preferredGymFocus) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new WorkoutSuggestion(headline, detail, preferredRunType, preferredGymFocus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkoutSuggestion)) {
                return false;
            }
            WorkoutSuggestion workoutSuggestion = (WorkoutSuggestion) other;
            return Intrinsics.areEqual(this.headline, workoutSuggestion.headline) && Intrinsics.areEqual(this.detail, workoutSuggestion.detail) && Intrinsics.areEqual(this.preferredRunType, workoutSuggestion.preferredRunType) && Intrinsics.areEqual(this.preferredGymFocus, workoutSuggestion.preferredGymFocus);
        }

        public int hashCode() {
            int hashCode = ((this.headline.hashCode() * 31) + this.detail.hashCode()) * 31;
            String str = this.preferredRunType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.preferredGymFocus;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WorkoutSuggestion(headline=" + this.headline + ", detail=" + this.detail + ", preferredRunType=" + this.preferredRunType + ", preferredGymFocus=" + this.preferredGymFocus + ")";
        }

        public WorkoutSuggestion(String headline, String detail, String str, String str2) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.headline = headline;
            this.detail = detail;
            this.preferredRunType = str;
            this.preferredGymFocus = str2;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getPreferredRunType() {
            return this.preferredRunType;
        }

        public final String getPreferredGymFocus() {
            return this.preferredGymFocus;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if ((r22 != null ? r22.getTotalDistanceM() : 0.0d) >= 10000.0d) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WorkoutSuggestion suggest(GymSessionEntity lastGym, List<GymSetEntity> lastGymSets, RunEntity lastRun, List<RecoveryEventEntity> recoveryEvents, Function1<? super String, String> muscleGroupForExercise, long nowMs, ZoneId zone, int gymSessionsLast48h) {
        boolean z;
        Long valueOf;
        Long valueOf2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(lastGymSets, "lastGymSets");
        Intrinsics.checkNotNullParameter(recoveryEvents, "recoveryEvents");
        Intrinsics.checkNotNullParameter(muscleGroupForExercise, "muscleGroupForExercise");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        for (Object obj : recoveryEvents) {
            if (((RecoveryEventEntity) obj).getEndsAtMs() > nowMs) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        boolean z2 = true;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((RecoveryEventEntity) it.next()).getLoadScore() > 55.0d) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (lastGym == null || (valueOf = lastGym.getEndedAtMs()) == null) {
            valueOf = lastGym != null ? Long.valueOf(lastGym.getStartedAtMs()) : null;
        }
        if (lastRun == null || (valueOf2 = lastRun.getEndedAtMs()) == null) {
            valueOf2 = lastRun != null ? Long.valueOf(lastRun.getStartedAtMs()) : null;
        }
        boolean z3 = valueOf != null && nowMs - valueOf.longValue() < 172800000;
        boolean z4 = valueOf2 != null && nowMs - valueOf2.longValue() < 172800000;
        LocalDate now = LocalDate.now(zone);
        LocalDate localDate = valueOf != null ? Instant.ofEpochMilli(valueOf.longValue()).atZone(zone).toLocalDate() : null;
        if (!Intrinsics.areEqual(localDate, now)) {
            str = Intrinsics.areEqual(localDate, now.minusDays(1L)) ? "Gym yesterday" : "Recent gym";
        } else if (gymSessionsLast48h > 1) {
            str = "Gym again today";
        } else {
            str = "Gym today";
        }
        boolean z5 = z3 && isLowerHeavy(lastGym, lastGymSets, muscleGroupForExercise);
        if (z4) {
        }
        z2 = false;
        if (z && z5) {
            return new WorkoutSuggestion("Legs still recovering", "Recent leg session + active recovery timers — skip intervals. Walk, mobility, or upper-only gym.", "Easy 20–35 min or rest", "Upper / core only");
        }
        if (z5) {
            return new WorkoutSuggestion("After leg day", "Give quads/glutes 24–48h. If you run, keep Z1 easy; no hills or strides today.", "Easy Z1 · flat", "Push, pull, or core");
        }
        if (z2) {
            return new WorkoutSuggestion("After a long run", "Your last run was long (10 km+). Legs need recovery — skip hard leg gym and heavy intervals today.", "Rest, or 20 min very easy jog", "Upper body; light legs only");
        }
        if (z4 && !z2) {
            return new WorkoutSuggestion("Recent run on the legs", "Moderate run load — gym is fine if you avoid max-effort leg compounds.", "Optional easy day", "Normal split · sub-max legs OK");
        }
        if (z3) {
            if (Intrinsics.areEqual(localDate, now)) {
                str2 = "You trained today — keep runs easy if legs are loaded.";
            } else {
                str2 = Intrinsics.areEqual(localDate, now.minusDays(1L)) ? "Match run intensity to muscle groups hit yesterday." : "Match run intensity to recent gym work.";
            }
            return new WorkoutSuggestion(str, str2, z5 ? "Easy run or rest" : "Steady or intervals OK", Intrinsics.areEqual(localDate, now) ? "Recovery / tomorrow's split" : null);
        }
        return new WorkoutSuggestion("Flexible day", "No conflicting leg run + leg gym in the last 48h. Follow your plan or coach goal.", null, null);
    }

    private final boolean isLowerHeavy(GymSessionEntity session, List<GymSetEntity> sets, Function1<? super String, String> muscleGroupForExercise) {
        int i;
        int i2;
        if (sets.isEmpty()) {
            return false;
        }
        List<GymSetEntity> list = sets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (GymSetEntity gymSetEntity : list) {
            String invoke = muscleGroupForExercise.invoke(gymSetEntity.getExerciseName());
            if (invoke == null) {
                invoke = INSTANCE.inferGroupFromNameForPeriodization(gymSetEntity.getExerciseName());
            }
            arrayList.add(invoke);
        }
        Set of = SetsKt.setOf((Object[]) new String[]{MuscleHeatmapRegions.LEGS, MuscleHeatmapRegions.GLUTES, MuscleHeatmapRegions.HAMSTRINGS, MuscleHeatmapRegions.QUADS, MuscleHeatmapRegions.CALVES, "lower"});
        ArrayList<String> arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (String str : arrayList2) {
                Set set = of;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                            i++;
                            if (i < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                }
            }
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                String exerciseName = ((GymSetEntity) it2.next()).getExerciseName();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = exerciseName.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String str2 = lowerCase;
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "deadlift", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "leg press", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "lunge", false, 2, (Object) null)) {
                    i2++;
                    if (i2 < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return i >= 2 || i2 >= 2;
    }

    private final String inferGroupFromNameForPeriodization(String name) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "squat", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "leg", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "lunge", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "rdl", false, 2, (Object) null)) {
            return "Legs";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "deadlift", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "hip thrust", false, 2, (Object) null)) {
            return "Glutes";
        }
        return "Other";
    }
}
