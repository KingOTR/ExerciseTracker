package androidx.health.connect.client.records;

import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.platform.client.SdkConfig;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlannedExerciseSessionRecord.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014Bc\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012BO\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0017Bs\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u001bJ\u0013\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\fH\u0016J\b\u00103\u001a\u00020\u000eH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\f¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0013\u0010\u0018\u001a\u00020\u00198\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010(R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001f¨\u00065"}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "blocks", "", "Landroidx/health/connect/client/records/PlannedExerciseBlock;", "exerciseType", "", "title", "", "notes", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Landroidx/health/connect/client/records/metadata/Metadata;)V", "startDate", "Ljava/time/LocalDate;", "duration", "Ljava/time/Duration;", "(Ljava/time/LocalDate;Ljava/time/Duration;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Landroidx/health/connect/client/records/metadata/Metadata;)V", "hasExplicitTime", "", "completedExerciseSessionId", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;ZILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBlocks", "()Ljava/util/List;", "getCompletedExerciseSessionId", "()Ljava/lang/String;", "getEndTime", "()Ljava/time/Instant;", "getEndZoneOffset", "()Ljava/time/ZoneOffset;", "getExerciseType$annotations", "()V", "getExerciseType", "()I", "()Z", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getNotes", "getStartTime", "getStartZoneOffset", "getTitle", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "toString", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlannedExerciseSessionRecord implements IntervalRecord {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<PlannedExerciseBlock> blocks;
    private final String completedExerciseSessionId;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final int exerciseType;
    private final boolean hasExplicitTime;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final String notes;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, List<PlannedExerciseBlock> blocks, int i) {
        this(startTime, zoneOffset, endTime, zoneOffset2, blocks, i, (String) null, (String) null, (androidx.health.connect.client.records.metadata.Metadata) null, 448, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, List<PlannedExerciseBlock> blocks, int i, String str) {
        this(startTime, zoneOffset, endTime, zoneOffset2, blocks, i, str, (String) null, (androidx.health.connect.client.records.metadata.Metadata) null, 384, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, List<PlannedExerciseBlock> blocks, int i, String str, String str2) {
        this(startTime, zoneOffset, endTime, zoneOffset2, blocks, i, str, str2, (androidx.health.connect.client.records.metadata.Metadata) null, 256, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(LocalDate startDate, Duration duration, List<PlannedExerciseBlock> blocks, int i) {
        this(startDate, duration, blocks, i, (String) null, (String) null, (androidx.health.connect.client.records.metadata.Metadata) null, SdkConfig.SDK_VERSION, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(LocalDate startDate, Duration duration, List<PlannedExerciseBlock> blocks, int i, String str) {
        this(startDate, duration, blocks, i, str, (String) null, (androidx.health.connect.client.records.metadata.Metadata) null, 96, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(LocalDate startDate, Duration duration, List<PlannedExerciseBlock> blocks, int i, String str, String str2) {
        this(startDate, duration, blocks, i, str, str2, (androidx.health.connect.client.records.metadata.Metadata) null, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
    }

    public static /* synthetic */ void getExerciseType$annotations() {
    }

    public PlannedExerciseSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, boolean z, int i, String str, List<PlannedExerciseBlock> blocks, String str2, String str3) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.startTime = startTime;
        this.startZoneOffset = zoneOffset;
        this.endTime = endTime;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.hasExplicitTime = z;
        this.exerciseType = i;
        this.completedExerciseSessionId = str;
        this.blocks = blocks;
        this.title = str2;
        this.notes = str3;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, boolean z, int i, String str, List list, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, z, i, str, (List<PlannedExerciseBlock>) list, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3);
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getStartZoneOffset() {
        return this.startZoneOffset;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getEndTime() {
        return this.endTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getEndZoneOffset() {
        return this.endZoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: hasExplicitTime, reason: from getter */
    public final boolean getHasExplicitTime() {
        return this.hasExplicitTime;
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final String getCompletedExerciseSessionId() {
        return this.completedExerciseSessionId;
    }

    public final List<PlannedExerciseBlock> getBlocks() {
        return this.blocks;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public /* synthetic */ PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, instant2, zoneOffset2, (List<PlannedExerciseBlock>) list, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, List<PlannedExerciseBlock> blocks, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata) {
        this(startTime, zoneOffset, endTime, zoneOffset2, metadata, true, i, (String) null, blocks, str, str2);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }

    public /* synthetic */ PlannedExerciseSessionRecord(LocalDate localDate, Duration duration, List list, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDate, duration, (List<PlannedExerciseBlock>) list, i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlannedExerciseSessionRecord(LocalDate startDate, Duration duration, List<PlannedExerciseBlock> blocks, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata) {
        this(r4, r5, r6, r2.getOffset(r0), metadata, false, i, (String) null, blocks, str, str2);
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Companion companion = INSTANCE;
        Instant physicalTimeAtNoon = companion.toPhysicalTimeAtNoon(startDate);
        ZoneOffset offset = companion.getOffset(companion.toPhysicalTimeAtNoon(startDate));
        Duration duration2 = duration;
        Instant plus = companion.toPhysicalTimeAtNoon(startDate).plus((TemporalAmount) duration2);
        Intrinsics.checkNotNullExpressionValue(plus, "startDate.toPhysicalTimeAtNoon().plus(duration)");
        Instant plus2 = companion.toPhysicalTimeAtNoon(startDate).plus((TemporalAmount) duration2);
        Intrinsics.checkNotNullExpressionValue(plus2, "startDate.toPhysicalTimeAtNoon().plus(duration)");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlannedExerciseSessionRecord)) {
            return false;
        }
        PlannedExerciseSessionRecord plannedExerciseSessionRecord = (PlannedExerciseSessionRecord) other;
        return Intrinsics.areEqual(getStartTime(), plannedExerciseSessionRecord.getStartTime()) && Intrinsics.areEqual(getStartZoneOffset(), plannedExerciseSessionRecord.getStartZoneOffset()) && Intrinsics.areEqual(getEndTime(), plannedExerciseSessionRecord.getEndTime()) && Intrinsics.areEqual(getEndZoneOffset(), plannedExerciseSessionRecord.getEndZoneOffset()) && this.hasExplicitTime == plannedExerciseSessionRecord.hasExplicitTime && Intrinsics.areEqual(this.blocks, plannedExerciseSessionRecord.blocks) && Intrinsics.areEqual(this.title, plannedExerciseSessionRecord.title) && Intrinsics.areEqual(this.notes, plannedExerciseSessionRecord.notes) && this.exerciseType == plannedExerciseSessionRecord.exerciseType && Intrinsics.areEqual(getMetadata(), plannedExerciseSessionRecord.getMetadata());
    }

    public int hashCode() {
        int hashCode = getStartTime().hashCode() * 31;
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int hashCode2 = (((hashCode + (startZoneOffset != null ? startZoneOffset.hashCode() : 0)) * 31) + getEndTime().hashCode()) * 31;
        ZoneOffset endZoneOffset = getEndZoneOffset();
        int hashCode3 = (((((hashCode2 + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasExplicitTime)) * 31) + this.blocks.hashCode()) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.notes;
        int hashCode5 = (((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.exerciseType) * 31;
        String str3 = this.completedExerciseSessionId;
        return ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlannedExerciseSessionRecord(startTime=");
        sb.append(getStartTime()).append(", startZoneOffset=").append(getStartZoneOffset()).append(", endTime=").append(getEndTime()).append(", endZoneOffset=").append(getEndZoneOffset()).append(", hasExplicitTime=").append(this.hasExplicitTime).append(", title=").append(this.title).append(", notes=").append(this.notes).append(", exerciseType=").append(this.exerciseType).append(", completedExerciseSessionId=").append(this.completedExerciseSessionId).append(", metadata=").append(getMetadata()).append(", blocks=").append(this.blocks).append(')');
        return sb.toString();
    }

    /* compiled from: PlannedExerciseSessionRecord.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseSessionRecord$Companion;", "", "()V", "getOffset", "Ljava/time/ZoneOffset;", "Ljava/time/Instant;", "toPhysicalTimeAtNoon", "Ljava/time/LocalDate;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.time.ZonedDateTime] */
        public final Instant toPhysicalTimeAtNoon(LocalDate localDate) {
            Instant instant = localDate.atTime(LocalTime.NOON).atZone(ZoneId.systemDefault()).toInstant();
            Intrinsics.checkNotNullExpressionValue(instant, "this.atTime(LocalTime.NO…temDefault()).toInstant()");
            return instant;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ZoneOffset getOffset(Instant instant) {
            ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(instant);
            Intrinsics.checkNotNullExpressionValue(offset, "systemDefault().rules.getOffset(this)");
            return offset;
        }
    }
}
