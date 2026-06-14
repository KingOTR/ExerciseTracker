package com.example.rungps.sync;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymShareSnapshotBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ.\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u0012H\u0002¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/sync/GymShareSnapshotBuilder;", "", "<init>", "()V", "build", "Lcom/example/rungps/sync/GymShareSnapshotBuilder$GymShareExtras;", "repo", "Lcom/example/rungps/data/Repository;", "sessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "weekAgoMs", "", "(Lcom/example/rungps/data/Repository;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastSessionLine", "", "session", "setsMap", "", "Lcom/example/rungps/data/GymSetEntity;", "GymShareExtras", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymShareSnapshotBuilder {
    public static final int $stable = 0;
    public static final GymShareSnapshotBuilder INSTANCE = new GymShareSnapshotBuilder();

    private GymShareSnapshotBuilder() {
    }

    /* compiled from: GymShareSnapshotBuilder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\tHÆ\u0003J\u001b\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003Ju\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006&"}, d2 = {"Lcom/example/rungps/sync/GymShareSnapshotBuilder$GymShareExtras;", "", "sessions7d", "", "sets7d", "attendanceLabel", "", "attendancePct", "muscleTop", "", "", "weeklyBars", "lastSessionSummary", "<init>", "(IILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getSessions7d", "()I", "getSets7d", "getAttendanceLabel", "()Ljava/lang/String;", "getAttendancePct", "getMuscleTop", "()Ljava/util/List;", "getWeeklyBars", "getLastSessionSummary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GymShareExtras {
        public static final int $stable = 8;
        private final String attendanceLabel;
        private final int attendancePct;
        private final String lastSessionSummary;
        private final List<Map<String, Object>> muscleTop;
        private final int sessions7d;
        private final int sets7d;
        private final List<Map<String, Object>> weeklyBars;

        public static /* synthetic */ GymShareExtras copy$default(GymShareExtras gymShareExtras, int i, int i2, String str, int i3, List list, List list2, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = gymShareExtras.sessions7d;
            }
            if ((i4 & 2) != 0) {
                i2 = gymShareExtras.sets7d;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                str = gymShareExtras.attendanceLabel;
            }
            String str3 = str;
            if ((i4 & 8) != 0) {
                i3 = gymShareExtras.attendancePct;
            }
            int i6 = i3;
            if ((i4 & 16) != 0) {
                list = gymShareExtras.muscleTop;
            }
            List list3 = list;
            if ((i4 & 32) != 0) {
                list2 = gymShareExtras.weeklyBars;
            }
            List list4 = list2;
            if ((i4 & 64) != 0) {
                str2 = gymShareExtras.lastSessionSummary;
            }
            return gymShareExtras.copy(i, i5, str3, i6, list3, list4, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSessions7d() {
            return this.sessions7d;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSets7d() {
            return this.sets7d;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAttendanceLabel() {
            return this.attendanceLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAttendancePct() {
            return this.attendancePct;
        }

        public final List<Map<String, Object>> component5() {
            return this.muscleTop;
        }

        public final List<Map<String, Object>> component6() {
            return this.weeklyBars;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLastSessionSummary() {
            return this.lastSessionSummary;
        }

        public final GymShareExtras copy(int sessions7d, int sets7d, String attendanceLabel, int attendancePct, List<? extends Map<String, ? extends Object>> muscleTop, List<? extends Map<String, ? extends Object>> weeklyBars, String lastSessionSummary) {
            Intrinsics.checkNotNullParameter(attendanceLabel, "attendanceLabel");
            Intrinsics.checkNotNullParameter(muscleTop, "muscleTop");
            Intrinsics.checkNotNullParameter(weeklyBars, "weeklyBars");
            return new GymShareExtras(sessions7d, sets7d, attendanceLabel, attendancePct, muscleTop, weeklyBars, lastSessionSummary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GymShareExtras)) {
                return false;
            }
            GymShareExtras gymShareExtras = (GymShareExtras) other;
            return this.sessions7d == gymShareExtras.sessions7d && this.sets7d == gymShareExtras.sets7d && Intrinsics.areEqual(this.attendanceLabel, gymShareExtras.attendanceLabel) && this.attendancePct == gymShareExtras.attendancePct && Intrinsics.areEqual(this.muscleTop, gymShareExtras.muscleTop) && Intrinsics.areEqual(this.weeklyBars, gymShareExtras.weeklyBars) && Intrinsics.areEqual(this.lastSessionSummary, gymShareExtras.lastSessionSummary);
        }

        public int hashCode() {
            int hashCode = ((((((((((Integer.hashCode(this.sessions7d) * 31) + Integer.hashCode(this.sets7d)) * 31) + this.attendanceLabel.hashCode()) * 31) + Integer.hashCode(this.attendancePct)) * 31) + this.muscleTop.hashCode()) * 31) + this.weeklyBars.hashCode()) * 31;
            String str = this.lastSessionSummary;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GymShareExtras(sessions7d=" + this.sessions7d + ", sets7d=" + this.sets7d + ", attendanceLabel=" + this.attendanceLabel + ", attendancePct=" + this.attendancePct + ", muscleTop=" + this.muscleTop + ", weeklyBars=" + this.weeklyBars + ", lastSessionSummary=" + this.lastSessionSummary + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GymShareExtras(int i, int i2, String attendanceLabel, int i3, List<? extends Map<String, ? extends Object>> muscleTop, List<? extends Map<String, ? extends Object>> weeklyBars, String str) {
            Intrinsics.checkNotNullParameter(attendanceLabel, "attendanceLabel");
            Intrinsics.checkNotNullParameter(muscleTop, "muscleTop");
            Intrinsics.checkNotNullParameter(weeklyBars, "weeklyBars");
            this.sessions7d = i;
            this.sets7d = i2;
            this.attendanceLabel = attendanceLabel;
            this.attendancePct = i3;
            this.muscleTop = muscleTop;
            this.weeklyBars = weeklyBars;
            this.lastSessionSummary = str;
        }

        public final int getSessions7d() {
            return this.sessions7d;
        }

        public final int getSets7d() {
            return this.sets7d;
        }

        public final String getAttendanceLabel() {
            return this.attendanceLabel;
        }

        public final int getAttendancePct() {
            return this.attendancePct;
        }

        public final List<Map<String, Object>> getMuscleTop() {
            return this.muscleTop;
        }

        public final List<Map<String, Object>> getWeeklyBars() {
            return this.weeklyBars;
        }

        public final String getLastSessionSummary() {
            return this.lastSessionSummary;
        }
    }

    public final Object build(Repository repository, List<GymSessionEntity> list, long j, Continuation<? super GymShareExtras> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymShareSnapshotBuilder$build$2(list, repository, j, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String lastSessionLine(GymSessionEntity session, Map<Long, ? extends List<GymSetEntity>> setsMap) {
        Long endedAtMs;
        Object next;
        if (session == null || (endedAtMs = session.getEndedAtMs()) == null) {
            return null;
        }
        long longValue = endedAtMs.longValue();
        List<GymSetEntity> list = setsMap.get(Long.valueOf(session.getId()));
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return null;
        }
        List<GymSetEntity> list2 = list;
        Iterator<T> it = list2.iterator();
        double d = 0.0d;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GymSetEntity gymSetEntity = (GymSetEntity) it.next();
            d += gymSetEntity.getWeightKg() * RangesKt.coerceAtLeast(gymSetEntity.getReps() != null ? r4.intValue() : 1, 1);
        }
        int roundToInt = MathKt.roundToInt(d);
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                double weightKg = ((GymSetEntity) next).getWeightKg();
                do {
                    Object next2 = it2.next();
                    double weightKg2 = ((GymSetEntity) next2).getWeightKg();
                    if (Double.compare(weightKg, weightKg2) < 0) {
                        next = next2;
                        weightKg = weightKg2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        GymSetEntity gymSetEntity2 = (GymSetEntity) next;
        if (gymSetEntity2 == null) {
            return null;
        }
        String format = Instant.ofEpochMilli(longValue).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("d MMM", Locale.getDefault()));
        String take = StringsKt.take(StringsKt.trim((CharSequence) gymSetEntity2.getExerciseName()).toString(), 28);
        Integer reps = gymSetEntity2.getReps();
        return format + " · " + roundToInt + " kg · top " + take + " " + ((int) gymSetEntity2.getWeightKg()) + "×" + (reps != null ? reps.intValue() : 1);
    }
}
