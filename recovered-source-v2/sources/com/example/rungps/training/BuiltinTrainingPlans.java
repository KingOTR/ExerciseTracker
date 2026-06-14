package com.example.rungps.training;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuiltinTrainingPlans.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/training/BuiltinTrainingPlans;", "", "<init>", "()V", "beginner5kEightWeeks", "Lcom/example/rungps/training/BuiltinTrainingPlans$PlanDefinition;", "getBeginner5kEightWeeks", "()Lcom/example/rungps/training/BuiltinTrainingPlans$PlanDefinition;", "baseMaintenanceSixWeeks", "getBaseMaintenanceSixWeeks", "allPlans", "", "getAllPlans", "()Ljava/util/List;", "plan", "slug", "", "context", "Landroid/content/Context;", "Workout", "PlanDefinition", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuiltinTrainingPlans {
    public static final int $stable;
    public static final BuiltinTrainingPlans INSTANCE = new BuiltinTrainingPlans();
    private static final List<PlanDefinition> allPlans;
    private static final PlanDefinition baseMaintenanceSixWeeks;
    private static final PlanDefinition beginner5kEightWeeks;

    private BuiltinTrainingPlans() {
    }

    /* compiled from: BuiltinTrainingPlans.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/training/BuiltinTrainingPlans$Workout;", "", "index", "", "weekLabel", "", "title", "detail", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIndex", "()I", "getWeekLabel", "()Ljava/lang/String;", "getTitle", "getDetail", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Workout {
        public static final int $stable = 0;
        private final String detail;
        private final int index;
        private final String title;
        private final String weekLabel;

        public static /* synthetic */ Workout copy$default(Workout workout, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = workout.index;
            }
            if ((i2 & 2) != 0) {
                str = workout.weekLabel;
            }
            if ((i2 & 4) != 0) {
                str2 = workout.title;
            }
            if ((i2 & 8) != 0) {
                str3 = workout.detail;
            }
            return workout.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWeekLabel() {
            return this.weekLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Workout copy(int index, String weekLabel, String title, String detail) {
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Workout(index, weekLabel, title, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Workout)) {
                return false;
            }
            Workout workout = (Workout) other;
            return this.index == workout.index && Intrinsics.areEqual(this.weekLabel, workout.weekLabel) && Intrinsics.areEqual(this.title, workout.title) && Intrinsics.areEqual(this.detail, workout.detail);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.index) * 31) + this.weekLabel.hashCode()) * 31) + this.title.hashCode()) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Workout(index=" + this.index + ", weekLabel=" + this.weekLabel + ", title=" + this.title + ", detail=" + this.detail + ")";
        }

        public Workout(int i, String weekLabel, String title, String detail) {
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.index = i;
            this.weekLabel = weekLabel;
            this.title = title;
            this.detail = detail;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getWeekLabel() {
            return this.weekLabel;
        }
    }

    /* compiled from: BuiltinTrainingPlans.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/training/BuiltinTrainingPlans$PlanDefinition;", "", "slug", "", "title", "description", "workouts", "", "Lcom/example/rungps/training/BuiltinTrainingPlans$Workout;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "getDescription", "getWorkouts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlanDefinition {
        public static final int $stable = 8;
        private final String description;
        private final String slug;
        private final String title;
        private final List<Workout> workouts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlanDefinition copy$default(PlanDefinition planDefinition, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = planDefinition.slug;
            }
            if ((i & 2) != 0) {
                str2 = planDefinition.title;
            }
            if ((i & 4) != 0) {
                str3 = planDefinition.description;
            }
            if ((i & 8) != 0) {
                list = planDefinition.workouts;
            }
            return planDefinition.copy(str, str2, str3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<Workout> component4() {
            return this.workouts;
        }

        public final PlanDefinition copy(String slug, String title, String description, List<Workout> workouts) {
            Intrinsics.checkNotNullParameter(slug, "slug");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(workouts, "workouts");
            return new PlanDefinition(slug, title, description, workouts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlanDefinition)) {
                return false;
            }
            PlanDefinition planDefinition = (PlanDefinition) other;
            return Intrinsics.areEqual(this.slug, planDefinition.slug) && Intrinsics.areEqual(this.title, planDefinition.title) && Intrinsics.areEqual(this.description, planDefinition.description) && Intrinsics.areEqual(this.workouts, planDefinition.workouts);
        }

        public int hashCode() {
            return (((((this.slug.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.workouts.hashCode();
        }

        public String toString() {
            return "PlanDefinition(slug=" + this.slug + ", title=" + this.title + ", description=" + this.description + ", workouts=" + this.workouts + ")";
        }

        public PlanDefinition(String slug, String title, String description, List<Workout> workouts) {
            Intrinsics.checkNotNullParameter(slug, "slug");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(workouts, "workouts");
            this.slug = slug;
            this.title = title;
            this.description = description;
            this.workouts = workouts;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<Workout> getWorkouts() {
            return this.workouts;
        }
    }

    public final PlanDefinition getBeginner5kEightWeeks() {
        return beginner5kEightWeeks;
    }

    static {
        List createListBuilder = CollectionsKt.createListBuilder();
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 0, "Week 1", "Easy initiation", "20 min total · 1 min brisk walk · 2 min jog, repeat softly");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 1, "Week 1", "Rest or walk day", "30 min walk optional — keep legs loose");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 2, "Week 1", "Controlled intervals", "25 min · alternate 90s jog / 90s walk");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 3, "Week 2", "Repetitions", "25 min · 2 min jog / 2 min walk");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 4, "Week 2", "Shakeout", "20 min steady walk‑jog blend");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 5, "Week 2", "Short tempo taste", "6 × 45s noticeably quicker with full recovery jog");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 6, "Week 3", "Durability", "28–30 min · 3 min jog / 90s walk × 6");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 7, "Week 3", "Recovery strides", "20 min easy + 4 strides of ~80 m");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 8, "Week 3", "Hills optional", "25–30 min with a few gentle inclines");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 9, "Week 4", "Continuous block", "2 × 10 min jog with 3 min walk between");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 10, "Week 4", "Cross / walk", "40 min brisk walk");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 11, "Week 4", "Aerobic endurance", "30 min jog with 4 × 90s pickups");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 12, "Week 5", "Straight run", "20 continuous easy");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 13, "Week 5", "Active recovery", "25 min jog/walk relaxed");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 14, "Week 5", "Longer aerobic", "25–35 min mostly easy finish strong last 6 min");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 15, "Week 6", "Steady", "25 min continuous");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 16, "Week 6", "Fartlek light", "30 min mixing 45s brisk / 2 min cruise");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 17, "Week 6", "Long day", "35 min easy conversational");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 18, "Week 7", "Dress rehearsal", "3 × 12 min jog with 2 min walk jog");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 19, "Week 7", "Easy", "22 min easy shakeout");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 20, "Week 7", "Leg speed", "8 × 20s strides after 15 min easy");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 21, "Week 8", "Light stimulus", "4 × 3 min moderately quick on easy jog float");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 22, "Week 8", "Short & smooth", "15 min jog + drills + easy strides");
        beginner5kEightWeeks$lambda$0$w(createListBuilder, 23, "Week 8", "Goal jog", "Approx. 30 min steady — practise your target 5k rhythm");
        Unit unit = Unit.INSTANCE;
        beginner5kEightWeeks = new PlanDefinition("beginner_5k_8w", "Beginner 5K · 8 weeks", "3 shorter sessions each week — mostly easy with light structure. Increase only if joints and energy feel steady.", CollectionsKt.build(createListBuilder));
        List createListBuilder2 = CollectionsKt.createListBuilder();
        int i = 0;
        int i2 = 0;
        while (i < 6) {
            int i3 = i + 1;
            String str = "Week " + i3;
            baseMaintenanceSixWeeks$lambda$3$w$1(createListBuilder2, i2, str, "Aerobic", "40–55 min conversational");
            baseMaintenanceSixWeeks$lambda$3$w$1(createListBuilder2, i2 + 1, str, "Leg turnover", "10 min easy · 12 × (30 s steady / 60 s jog) · 10 min easy");
            int i4 = i2 + 3;
            baseMaintenanceSixWeeks$lambda$3$w$1(createListBuilder2, i2 + 2, str, "Long easy", ((i * 5) + 45) + "–" + ((i * 6) + 55) + " min very easy incl. fuel practice");
            i2 += 4;
            baseMaintenanceSixWeeks$lambda$3$w$1(createListBuilder2, i4, str, "Strength / XT", "Gym lift or brisk walk cycling — complementary only");
            i = i3;
        }
        Unit unit2 = Unit.INSTANCE;
        PlanDefinition planDefinition = new PlanDefinition("base_6w", "Base maintenance · 6 weeks", "For athletes who already run regularly but want predictable structure while life is busy.", CollectionsKt.build(createListBuilder2));
        baseMaintenanceSixWeeks = planDefinition;
        allPlans = CollectionsKt.listOf((Object[]) new PlanDefinition[]{beginner5kEightWeeks, planDefinition});
        $stable = 8;
    }

    private static final boolean beginner5kEightWeeks$lambda$0$w(List<Workout> list, int i, String str, String str2, String str3) {
        return list.add(new Workout(i, str, str2, str3));
    }

    public final PlanDefinition getBaseMaintenanceSixWeeks() {
        return baseMaintenanceSixWeeks;
    }

    private static final boolean baseMaintenanceSixWeeks$lambda$3$w$1(List<Workout> list, int i, String str, String str2, String str3) {
        return list.add(new Workout(i, str, str2, str3));
    }

    public final List<PlanDefinition> getAllPlans() {
        return allPlans;
    }

    public static /* synthetic */ PlanDefinition plan$default(BuiltinTrainingPlans builtinTrainingPlans, String str, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        return builtinTrainingPlans.plan(str, context);
    }

    public final PlanDefinition plan(String slug, Context context) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Object obj = null;
        if (Intrinsics.areEqual(slug, SavedCoachPlanStore.SLUG) && context != null) {
            PlanDefinition load = SavedCoachPlanStore.INSTANCE.load(context);
            if (load == null) {
                return null;
            }
            return load;
        }
        Iterator<T> it = allPlans.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((PlanDefinition) next).getSlug(), slug)) {
                obj = next;
                break;
            }
        }
        return (PlanDefinition) obj;
    }
}
