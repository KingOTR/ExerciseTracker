package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MuscleVolumeHeatmap.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "", "byRegion", "", "", "", "byUserTag", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getByRegion", "()Ljava/util/Map;", "getByUserTag", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MuscleVolumeHeatmap {
    public static final int $stable = 8;
    private final Map<String, Float> byRegion;
    private final Map<String, Float> byUserTag;

    /* JADX WARN: Multi-variable type inference failed */
    public MuscleVolumeHeatmap() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MuscleVolumeHeatmap copy$default(MuscleVolumeHeatmap muscleVolumeHeatmap, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = muscleVolumeHeatmap.byRegion;
        }
        if ((i & 2) != 0) {
            map2 = muscleVolumeHeatmap.byUserTag;
        }
        return muscleVolumeHeatmap.copy(map, map2);
    }

    public final Map<String, Float> component1() {
        return this.byRegion;
    }

    public final Map<String, Float> component2() {
        return this.byUserTag;
    }

    public final MuscleVolumeHeatmap copy(Map<String, Float> byRegion, Map<String, Float> byUserTag) {
        Intrinsics.checkNotNullParameter(byRegion, "byRegion");
        Intrinsics.checkNotNullParameter(byUserTag, "byUserTag");
        return new MuscleVolumeHeatmap(byRegion, byUserTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuscleVolumeHeatmap)) {
            return false;
        }
        MuscleVolumeHeatmap muscleVolumeHeatmap = (MuscleVolumeHeatmap) other;
        return Intrinsics.areEqual(this.byRegion, muscleVolumeHeatmap.byRegion) && Intrinsics.areEqual(this.byUserTag, muscleVolumeHeatmap.byUserTag);
    }

    public int hashCode() {
        return (this.byRegion.hashCode() * 31) + this.byUserTag.hashCode();
    }

    public String toString() {
        return "MuscleVolumeHeatmap(byRegion=" + this.byRegion + ", byUserTag=" + this.byUserTag + ")";
    }

    public MuscleVolumeHeatmap(Map<String, Float> byRegion, Map<String, Float> byUserTag) {
        Intrinsics.checkNotNullParameter(byRegion, "byRegion");
        Intrinsics.checkNotNullParameter(byUserTag, "byUserTag");
        this.byRegion = byRegion;
        this.byUserTag = byUserTag;
    }

    public /* synthetic */ MuscleVolumeHeatmap(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final Map<String, Float> getByRegion() {
        return this.byRegion;
    }

    public final Map<String, Float> getByUserTag() {
        return this.byUserTag;
    }
}
