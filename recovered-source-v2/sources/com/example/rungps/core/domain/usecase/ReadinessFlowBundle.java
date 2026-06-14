package com.example.rungps.core.domain.usecase;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003Jf\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ReadinessFlowBundle;", "", "recovery", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "gym", "Lcom/example/rungps/data/GymSessionEntity;", "sleep", "Lcom/example/rungps/data/SleepEntryEntity;", "soccer", "Lcom/example/rungps/data/SoccerSessionEntity;", "steps", "", "load", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;)V", "getRecovery", "()Ljava/util/List;", "getGym", "getSleep", "getSoccer", "getSteps", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoad", "()Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;)Lcom/example/rungps/core/domain/usecase/ReadinessFlowBundle;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class ReadinessFlowBundle {
    private final List<GymSessionEntity> gym;
    private final CombinedLoadSnapshot load;
    private final List<RecoveryEventEntity> recovery;
    private final List<SleepEntryEntity> sleep;
    private final List<SoccerSessionEntity> soccer;
    private final Long steps;

    public static /* synthetic */ ReadinessFlowBundle copy$default(ReadinessFlowBundle readinessFlowBundle, List list, List list2, List list3, List list4, Long l, CombinedLoadSnapshot combinedLoadSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            list = readinessFlowBundle.recovery;
        }
        if ((i & 2) != 0) {
            list2 = readinessFlowBundle.gym;
        }
        List list5 = list2;
        if ((i & 4) != 0) {
            list3 = readinessFlowBundle.sleep;
        }
        List list6 = list3;
        if ((i & 8) != 0) {
            list4 = readinessFlowBundle.soccer;
        }
        List list7 = list4;
        if ((i & 16) != 0) {
            l = readinessFlowBundle.steps;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            combinedLoadSnapshot = readinessFlowBundle.load;
        }
        return readinessFlowBundle.copy(list, list5, list6, list7, l2, combinedLoadSnapshot);
    }

    public final List<RecoveryEventEntity> component1() {
        return this.recovery;
    }

    public final List<GymSessionEntity> component2() {
        return this.gym;
    }

    public final List<SleepEntryEntity> component3() {
        return this.sleep;
    }

    public final List<SoccerSessionEntity> component4() {
        return this.soccer;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getSteps() {
        return this.steps;
    }

    /* renamed from: component6, reason: from getter */
    public final CombinedLoadSnapshot getLoad() {
        return this.load;
    }

    public final ReadinessFlowBundle copy(List<RecoveryEventEntity> recovery, List<GymSessionEntity> gym, List<SleepEntryEntity> sleep, List<SoccerSessionEntity> soccer, Long steps, CombinedLoadSnapshot load) {
        Intrinsics.checkNotNullParameter(recovery, "recovery");
        Intrinsics.checkNotNullParameter(gym, "gym");
        Intrinsics.checkNotNullParameter(sleep, "sleep");
        Intrinsics.checkNotNullParameter(soccer, "soccer");
        return new ReadinessFlowBundle(recovery, gym, sleep, soccer, steps, load);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadinessFlowBundle)) {
            return false;
        }
        ReadinessFlowBundle readinessFlowBundle = (ReadinessFlowBundle) other;
        return Intrinsics.areEqual(this.recovery, readinessFlowBundle.recovery) && Intrinsics.areEqual(this.gym, readinessFlowBundle.gym) && Intrinsics.areEqual(this.sleep, readinessFlowBundle.sleep) && Intrinsics.areEqual(this.soccer, readinessFlowBundle.soccer) && Intrinsics.areEqual(this.steps, readinessFlowBundle.steps) && Intrinsics.areEqual(this.load, readinessFlowBundle.load);
    }

    public int hashCode() {
        int hashCode = ((((((this.recovery.hashCode() * 31) + this.gym.hashCode()) * 31) + this.sleep.hashCode()) * 31) + this.soccer.hashCode()) * 31;
        Long l = this.steps;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        CombinedLoadSnapshot combinedLoadSnapshot = this.load;
        return hashCode2 + (combinedLoadSnapshot != null ? combinedLoadSnapshot.hashCode() : 0);
    }

    public String toString() {
        return "ReadinessFlowBundle(recovery=" + this.recovery + ", gym=" + this.gym + ", sleep=" + this.sleep + ", soccer=" + this.soccer + ", steps=" + this.steps + ", load=" + this.load + ")";
    }

    public ReadinessFlowBundle(List<RecoveryEventEntity> recovery, List<GymSessionEntity> gym, List<SleepEntryEntity> sleep, List<SoccerSessionEntity> soccer, Long l, CombinedLoadSnapshot combinedLoadSnapshot) {
        Intrinsics.checkNotNullParameter(recovery, "recovery");
        Intrinsics.checkNotNullParameter(gym, "gym");
        Intrinsics.checkNotNullParameter(sleep, "sleep");
        Intrinsics.checkNotNullParameter(soccer, "soccer");
        this.recovery = recovery;
        this.gym = gym;
        this.sleep = sleep;
        this.soccer = soccer;
        this.steps = l;
        this.load = combinedLoadSnapshot;
    }

    public final List<RecoveryEventEntity> getRecovery() {
        return this.recovery;
    }

    public final List<GymSessionEntity> getGym() {
        return this.gym;
    }

    public final List<SleepEntryEntity> getSleep() {
        return this.sleep;
    }

    public final List<SoccerSessionEntity> getSoccer() {
        return this.soccer;
    }

    public final Long getSteps() {
        return this.steps;
    }

    public final CombinedLoadSnapshot getLoad() {
        return this.load;
    }
}
