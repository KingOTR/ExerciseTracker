package com.example.rungps.analytics;

import androidx.compose.material3.MenuKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.ble.moyoung.MoyoungHrParser;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

/* compiled from: SoccerHrZones.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/analytics/SoccerHrZones;", "", "<init>", "()V", "fromHrSeries", "Lcom/example/rungps/analytics/SoccerHrZones$ZoneMinutes;", "series", "", "Lcom/example/rungps/ble/moyoung/MoyoungHrParser$HrPoint;", "sampleStepSec", "", "parseJson", "json", "", "ZoneMinutes", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerHrZones {
    public static final int $stable = 0;
    public static final SoccerHrZones INSTANCE = new SoccerHrZones();

    /* compiled from: SoccerHrZones.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/analytics/SoccerHrZones$ZoneMinutes;", "", "z1", "", "z2", "z3", "z4", "z5", "<init>", "(IIIII)V", "getZ1", "()I", "getZ2", "getZ3", "getZ4", "getZ5", "toJson", "", "label", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ZoneMinutes {
        public static final int $stable = 0;
        private final int z1;
        private final int z2;
        private final int z3;
        private final int z4;
        private final int z5;

        public ZoneMinutes() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ ZoneMinutes copy$default(ZoneMinutes zoneMinutes, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = zoneMinutes.z1;
            }
            if ((i6 & 2) != 0) {
                i2 = zoneMinutes.z2;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = zoneMinutes.z3;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = zoneMinutes.z4;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = zoneMinutes.z5;
            }
            return zoneMinutes.copy(i, i7, i8, i9, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getZ1() {
            return this.z1;
        }

        /* renamed from: component2, reason: from getter */
        public final int getZ2() {
            return this.z2;
        }

        /* renamed from: component3, reason: from getter */
        public final int getZ3() {
            return this.z3;
        }

        /* renamed from: component4, reason: from getter */
        public final int getZ4() {
            return this.z4;
        }

        /* renamed from: component5, reason: from getter */
        public final int getZ5() {
            return this.z5;
        }

        public final ZoneMinutes copy(int z1, int z2, int z3, int z4, int z5) {
            return new ZoneMinutes(z1, z2, z3, z4, z5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZoneMinutes)) {
                return false;
            }
            ZoneMinutes zoneMinutes = (ZoneMinutes) other;
            return this.z1 == zoneMinutes.z1 && this.z2 == zoneMinutes.z2 && this.z3 == zoneMinutes.z3 && this.z4 == zoneMinutes.z4 && this.z5 == zoneMinutes.z5;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.z1) * 31) + Integer.hashCode(this.z2)) * 31) + Integer.hashCode(this.z3)) * 31) + Integer.hashCode(this.z4)) * 31) + Integer.hashCode(this.z5);
        }

        public String toString() {
            return "ZoneMinutes(z1=" + this.z1 + ", z2=" + this.z2 + ", z3=" + this.z3 + ", z4=" + this.z4 + ", z5=" + this.z5 + ")";
        }

        public ZoneMinutes(int i, int i2, int i3, int i4, int i5) {
            this.z1 = i;
            this.z2 = i2;
            this.z3 = i3;
            this.z4 = i4;
            this.z5 = i5;
        }

        public /* synthetic */ ZoneMinutes(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
        }

        public final int getZ1() {
            return this.z1;
        }

        public final int getZ2() {
            return this.z2;
        }

        public final int getZ3() {
            return this.z3;
        }

        public final int getZ4() {
            return this.z4;
        }

        public final int getZ5() {
            return this.z5;
        }

        public final String toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("z1", this.z1);
            jSONObject.put("z2", this.z2);
            jSONObject.put("z3", this.z3);
            jSONObject.put("z4", this.z4);
            jSONObject.put("z5", this.z5);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final String label() {
            StringBuilder sb = new StringBuilder();
            int i = this.z5;
            if (i > 0) {
                sb.append("Z5 " + i + "m · ");
            }
            int i2 = this.z4;
            if (i2 > 0) {
                sb.append("Z4 " + i2 + "m · ");
            }
            int i3 = this.z3;
            if (i3 > 0) {
                sb.append("Z3 " + i3 + "m · ");
            }
            int i4 = this.z2;
            if (i4 > 0) {
                sb.append("Z2 " + i4 + "m · ");
            }
            int i5 = this.z1;
            if (i5 > 0) {
                sb.append("Z1 " + i5 + "m");
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return StringsKt.trimEnd(StringsKt.trim((CharSequence) sb2).toString(), Typography.middleDot, ' ');
        }
    }

    private SoccerHrZones() {
    }

    public static /* synthetic */ ZoneMinutes fromHrSeries$default(SoccerHrZones soccerHrZones, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        return soccerHrZones.fromHrSeries(list, i);
    }

    public final ZoneMinutes fromHrSeries(List<MoyoungHrParser.HrPoint> series, int sampleStepSec) {
        Intrinsics.checkNotNullParameter(series, "series");
        if (series.size() < 2) {
            return new ZoneMinutes(0, 0, 0, 0, 0, 31, null);
        }
        Iterator<T> it = series.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int bpm = ((MoyoungHrParser.HrPoint) it.next()).getBpm();
        while (it.hasNext()) {
            int bpm2 = ((MoyoungHrParser.HrPoint) it.next()).getBpm();
            if (bpm < bpm2) {
                bpm = bpm2;
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(bpm, MenuKt.InTransitionDuration);
        int i = 0;
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(1, 0), TuplesKt.to(2, 0), TuplesKt.to(3, 0), TuplesKt.to(4, 0), TuplesKt.to(5, 0));
        int size = series.size();
        while (i < size) {
            float bpm3 = series.get(i).getBpm() / coerceAtLeast;
            int i2 = bpm3 < 0.6f ? 1 : bpm3 < 0.7f ? 2 : bpm3 < 0.8f ? 3 : bpm3 < 0.9f ? 4 : 5;
            int i3 = i + 1;
            mutableMapOf.put(Integer.valueOf(i2), Integer.valueOf(((Number) MapsKt.getValue(mutableMapOf, Integer.valueOf(i2))).intValue() + RangesKt.coerceAtLeast(MathKt.roundToInt(RangesKt.coerceAtLeast((((MoyoungHrParser.HrPoint) CollectionsKt.getOrNull(series, i3)) != null ? r13.getOffsetSec() : series.get(i).getOffsetSec() + sampleStepSec) - series.get(i).getOffsetSec(), sampleStepSec / 2) / 60.0f), 1)));
            i = i3;
        }
        return new ZoneMinutes(((Number) MapsKt.getValue(mutableMapOf, 1)).intValue(), ((Number) MapsKt.getValue(mutableMapOf, 2)).intValue(), ((Number) MapsKt.getValue(mutableMapOf, 3)).intValue(), ((Number) MapsKt.getValue(mutableMapOf, 4)).intValue(), ((Number) MapsKt.getValue(mutableMapOf, 5)).intValue());
    }

    public final ZoneMinutes parseJson(String json) {
        Object m7905constructorimpl;
        String str = json;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SoccerHrZones soccerHrZones = this;
            JSONObject jSONObject = new JSONObject(json);
            m7905constructorimpl = Result.m7905constructorimpl(new ZoneMinutes(jSONObject.optInt("z1"), jSONObject.optInt("z2"), jSONObject.optInt("z3"), jSONObject.optInt("z4"), jSONObject.optInt("z5")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (ZoneMinutes) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }
}
