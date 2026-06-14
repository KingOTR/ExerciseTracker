package com.example.rungps.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: CapacityBudget.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/analytics/CapacityBudget;", "", "<init>", "()V", "PREFS", "", "KEY_WEEK", "KEY_RUN", "KEY_GYM", "KEY_SOCCER", "currentWeekKey", "loadBudget", "Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;", "context", "Landroid/content/Context;", "saveBudget", "", "run", "", "gym", "soccer", "compute", "Lcom/example/rungps/analytics/CapacityBudget$Snapshot;", "load", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "budget", "normalize", "b", "WeekBudget", "WeekSpent", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CapacityBudget {
    public static final int $stable = 0;
    public static final CapacityBudget INSTANCE = new CapacityBudget();
    private static final String KEY_GYM = "gym_cap";
    private static final String KEY_RUN = "run_cap";
    private static final String KEY_SOCCER = "soccer_cap";
    private static final String KEY_WEEK = "week_key";
    private static final String PREFS = "capacity_budget";

    private CapacityBudget() {
    }

    /* compiled from: CapacityBudget.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;", "", "runCap", "", "gymCap", "soccerCap", "<init>", "(III)V", "getRunCap", "()I", "getGymCap", "getSoccerCap", "totalCap", "getTotalCap", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeekBudget {
        public static final int $stable = 0;
        private final int gymCap;
        private final int runCap;
        private final int soccerCap;

        public static /* synthetic */ WeekBudget copy$default(WeekBudget weekBudget, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = weekBudget.runCap;
            }
            if ((i4 & 2) != 0) {
                i2 = weekBudget.gymCap;
            }
            if ((i4 & 4) != 0) {
                i3 = weekBudget.soccerCap;
            }
            return weekBudget.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRunCap() {
            return this.runCap;
        }

        /* renamed from: component2, reason: from getter */
        public final int getGymCap() {
            return this.gymCap;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSoccerCap() {
            return this.soccerCap;
        }

        public final WeekBudget copy(int runCap, int gymCap, int soccerCap) {
            return new WeekBudget(runCap, gymCap, soccerCap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeekBudget)) {
                return false;
            }
            WeekBudget weekBudget = (WeekBudget) other;
            return this.runCap == weekBudget.runCap && this.gymCap == weekBudget.gymCap && this.soccerCap == weekBudget.soccerCap;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.runCap) * 31) + Integer.hashCode(this.gymCap)) * 31) + Integer.hashCode(this.soccerCap);
        }

        public String toString() {
            return "WeekBudget(runCap=" + this.runCap + ", gymCap=" + this.gymCap + ", soccerCap=" + this.soccerCap + ")";
        }

        public WeekBudget(int i, int i2, int i3) {
            this.runCap = i;
            this.gymCap = i2;
            this.soccerCap = i3;
        }

        public final int getRunCap() {
            return this.runCap;
        }

        public final int getGymCap() {
            return this.gymCap;
        }

        public final int getSoccerCap() {
            return this.soccerCap;
        }

        public final int getTotalCap() {
            return this.runCap + this.gymCap + this.soccerCap;
        }
    }

    /* compiled from: CapacityBudget.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/analytics/CapacityBudget$WeekSpent;", "", "run", "", "gym", "soccer", "<init>", "(III)V", "getRun", "()I", "getGym", "getSoccer", "total", "getTotal", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeekSpent {
        public static final int $stable = 0;
        private final int gym;
        private final int run;
        private final int soccer;

        public static /* synthetic */ WeekSpent copy$default(WeekSpent weekSpent, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = weekSpent.run;
            }
            if ((i4 & 2) != 0) {
                i2 = weekSpent.gym;
            }
            if ((i4 & 4) != 0) {
                i3 = weekSpent.soccer;
            }
            return weekSpent.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRun() {
            return this.run;
        }

        /* renamed from: component2, reason: from getter */
        public final int getGym() {
            return this.gym;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSoccer() {
            return this.soccer;
        }

        public final WeekSpent copy(int run, int gym, int soccer) {
            return new WeekSpent(run, gym, soccer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeekSpent)) {
                return false;
            }
            WeekSpent weekSpent = (WeekSpent) other;
            return this.run == weekSpent.run && this.gym == weekSpent.gym && this.soccer == weekSpent.soccer;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.run) * 31) + Integer.hashCode(this.gym)) * 31) + Integer.hashCode(this.soccer);
        }

        public String toString() {
            return "WeekSpent(run=" + this.run + ", gym=" + this.gym + ", soccer=" + this.soccer + ")";
        }

        public WeekSpent(int i, int i2, int i3) {
            this.run = i;
            this.gym = i2;
            this.soccer = i3;
        }

        public final int getRun() {
            return this.run;
        }

        public final int getGym() {
            return this.gym;
        }

        public final int getSoccer() {
            return this.soccer;
        }

        public final int getTotal() {
            return this.run + this.gym + this.soccer;
        }
    }

    /* compiled from: CapacityBudget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006$"}, d2 = {"Lcom/example/rungps/analytics/CapacityBudget$Snapshot;", "", "budget", "Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;", "spent", "Lcom/example/rungps/analytics/CapacityBudget$WeekSpent;", "weekLabel", "", "overBudget", "", "headline", "detail", "<init>", "(Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;Lcom/example/rungps/analytics/CapacityBudget$WeekSpent;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getBudget", "()Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;", "getSpent", "()Lcom/example/rungps/analytics/CapacityBudget$WeekSpent;", "getWeekLabel", "()Ljava/lang/String;", "getOverBudget", "()Z", "getHeadline", "getDetail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final WeekBudget budget;
        private final String detail;
        private final String headline;
        private final boolean overBudget;
        private final WeekSpent spent;
        private final String weekLabel;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, WeekBudget weekBudget, WeekSpent weekSpent, String str, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                weekBudget = snapshot.budget;
            }
            if ((i & 2) != 0) {
                weekSpent = snapshot.spent;
            }
            WeekSpent weekSpent2 = weekSpent;
            if ((i & 4) != 0) {
                str = snapshot.weekLabel;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                z = snapshot.overBudget;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                str2 = snapshot.headline;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                str3 = snapshot.detail;
            }
            return snapshot.copy(weekBudget, weekSpent2, str4, z2, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final WeekBudget getBudget() {
            return this.budget;
        }

        /* renamed from: component2, reason: from getter */
        public final WeekSpent getSpent() {
            return this.spent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getWeekLabel() {
            return this.weekLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getOverBudget() {
            return this.overBudget;
        }

        /* renamed from: component5, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Snapshot copy(WeekBudget budget, WeekSpent spent, String weekLabel, boolean overBudget, String headline, String detail) {
            Intrinsics.checkNotNullParameter(budget, "budget");
            Intrinsics.checkNotNullParameter(spent, "spent");
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Snapshot(budget, spent, weekLabel, overBudget, headline, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Intrinsics.areEqual(this.budget, snapshot.budget) && Intrinsics.areEqual(this.spent, snapshot.spent) && Intrinsics.areEqual(this.weekLabel, snapshot.weekLabel) && this.overBudget == snapshot.overBudget && Intrinsics.areEqual(this.headline, snapshot.headline) && Intrinsics.areEqual(this.detail, snapshot.detail);
        }

        public int hashCode() {
            return (((((((((this.budget.hashCode() * 31) + this.spent.hashCode()) * 31) + this.weekLabel.hashCode()) * 31) + Boolean.hashCode(this.overBudget)) * 31) + this.headline.hashCode()) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Snapshot(budget=" + this.budget + ", spent=" + this.spent + ", weekLabel=" + this.weekLabel + ", overBudget=" + this.overBudget + ", headline=" + this.headline + ", detail=" + this.detail + ")";
        }

        public Snapshot(WeekBudget budget, WeekSpent spent, String weekLabel, boolean z, String headline, String detail) {
            Intrinsics.checkNotNullParameter(budget, "budget");
            Intrinsics.checkNotNullParameter(spent, "spent");
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.budget = budget;
            this.spent = spent;
            this.weekLabel = weekLabel;
            this.overBudget = z;
            this.headline = headline;
            this.detail = detail;
        }

        public final WeekBudget getBudget() {
            return this.budget;
        }

        public final WeekSpent getSpent() {
            return this.spent;
        }

        public final String getWeekLabel() {
            return this.weekLabel;
        }

        public final boolean getOverBudget() {
            return this.overBudget;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    public final String currentWeekKey() {
        String localDate = LocalDate.now().with((TemporalAdjuster) DayOfWeek.MONDAY).toString();
        Intrinsics.checkNotNullExpressionValue(localDate, "toString(...)");
        return localDate;
    }

    public final WeekBudget loadBudget(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        String currentWeekKey = currentWeekKey();
        if (!Intrinsics.areEqual(sharedPreferences.getString(KEY_WEEK, null), currentWeekKey)) {
            sharedPreferences.edit().putString(KEY_WEEK, currentWeekKey).putInt(KEY_RUN, 40).putInt(KEY_GYM, 40).putInt(KEY_SOCCER, 20).apply();
        }
        return INSTANCE.normalize(new WeekBudget(RangesKt.coerceIn(sharedPreferences.getInt(KEY_RUN, 40), 5, 90), RangesKt.coerceIn(sharedPreferences.getInt(KEY_GYM, 40), 5, 90), RangesKt.coerceIn(sharedPreferences.getInt(KEY_SOCCER, 20), 5, 90)));
    }

    public final void saveBudget(Context context, int run, int gym, int soccer) {
        Intrinsics.checkNotNullParameter(context, "context");
        WeekBudget normalize = normalize(new WeekBudget(run, gym, soccer));
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_WEEK, currentWeekKey()).putInt(KEY_RUN, normalize.getRunCap()).putInt(KEY_GYM, normalize.getGymCap()).putInt(KEY_SOCCER, normalize.getSoccerCap()).apply();
    }

    public final Snapshot compute(com.example.rungps.core.domain.analytics.CombinedLoadSnapshot load, WeekBudget budget) {
        String str;
        Intrinsics.checkNotNullParameter(load, "load");
        Intrinsics.checkNotNullParameter(budget, "budget");
        WeekSpent weekSpent = new WeekSpent(RangesKt.coerceIn(MathKt.roundToInt(((RangesKt.coerceAtMost(load.getRunKm7d() * 8.0d, 120.0d) + RangesKt.coerceAtMost(load.getRideKm7d() * 6.0d, 80.0d)) / 120.0d) * budget.getRunCap()), 0, budget.getRunCap()), RangesKt.coerceIn(MathKt.roundToInt((RangesKt.coerceAtMost(load.getGymTonnage7d() / 250.0d, 120.0d) / 120.0d) * budget.getGymCap()), 0, budget.getGymCap()), RangesKt.coerceIn(MathKt.roundToInt((RangesKt.coerceAtMost(load.getSoccerMin7d() / 15.0d, 60.0d) / 60.0d) * budget.getSoccerCap()), 0, budget.getSoccerCap()));
        boolean z = weekSpent.getTotal() > budget.getTotalCap();
        if (z) {
            str = "Over weekly capacity";
        } else if (weekSpent.getTotal() >= budget.getTotalCap() * 0.85d) {
            str = "Near capacity";
        } else {
            str = ((double) weekSpent.getTotal()) >= ((double) budget.getTotalCap()) * 0.45d ? "On track" : "Room to grow";
        }
        return new Snapshot(budget, weekSpent, currentWeekKey(), z, str, "Run " + weekSpent.getRun() + DomExceptionUtils.SEPARATOR + budget.getRunCap() + " · Gym " + weekSpent.getGym() + DomExceptionUtils.SEPARATOR + budget.getGymCap() + " · Sport " + weekSpent.getSoccer() + DomExceptionUtils.SEPARATOR + budget.getSoccerCap());
    }

    private final WeekBudget normalize(WeekBudget b) {
        double coerceAtLeast = RangesKt.coerceAtLeast(b.getRunCap() + b.getGymCap() + b.getSoccerCap(), 1);
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt((b.getRunCap() * 100.0d) / coerceAtLeast), 5, 90);
        int coerceIn2 = RangesKt.coerceIn(MathKt.roundToInt((b.getGymCap() * 100.0d) / coerceAtLeast), 5, 90);
        return new WeekBudget(coerceIn, coerceIn2, RangesKt.coerceIn((100 - coerceIn) - coerceIn2, 5, 90));
    }
}
