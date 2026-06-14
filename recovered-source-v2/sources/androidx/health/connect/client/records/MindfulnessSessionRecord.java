package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MindfulnessSessionRecord.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, d2 = {"Landroidx/health/connect/client/records/MindfulnessSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "mindfulnessSessionType", "", "title", "", "notes", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILjava/lang/String;Ljava/lang/String;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getEndTime", "()Ljava/time/Instant;", "getEndZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getMindfulnessSessionType$annotations", "()V", "getMindfulnessSessionType", "()I", "getNotes", "()Ljava/lang/String;", "getStartTime", "getStartZoneOffset", "getTitle", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "toString", "Companion", "MindfulnessSessionTypes", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MindfulnessSessionRecord implements IntervalRecord {
    public static final AggregateMetric<Duration> MINDFULNESS_DURATION_TOTAL = AggregateMetric.INSTANCE.durationMetric$connect_client_release("MindfulnessSession");
    public static final int MINDFULNESS_SESSION_TYPE_BREATHING = 3;
    public static final Map<Integer, String> MINDFULNESS_SESSION_TYPE_INT_TO_STRING_MAP;
    public static final int MINDFULNESS_SESSION_TYPE_MEDITATION = 1;
    public static final int MINDFULNESS_SESSION_TYPE_MOVEMENT = 5;
    public static final int MINDFULNESS_SESSION_TYPE_MUSIC = 4;
    public static final int MINDFULNESS_SESSION_TYPE_OTHER = 2;
    public static final Map<String, Integer> MINDFULNESS_SESSION_TYPE_STRING_TO_INT_MAP;
    public static final int MINDFULNESS_SESSION_TYPE_UNGUIDED = 6;
    public static final int MINDFULNESS_SESSION_TYPE_UNKNOWN = 0;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int mindfulnessSessionType;
    private final String notes;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    /* compiled from: MindfulnessSessionRecord.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/MindfulnessSessionRecord$MindfulnessSessionTypes;", "", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MindfulnessSessionTypes {
    }

    public static /* synthetic */ void getMindfulnessSessionType$annotations() {
    }

    public MindfulnessSessionRecord(Instant startTime, ZoneOffset zoneOffset, Instant endTime, ZoneOffset zoneOffset2, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.startTime = startTime;
        this.startZoneOffset = zoneOffset;
        this.endTime = endTime;
        this.endZoneOffset = zoneOffset2;
        this.mindfulnessSessionType = i;
        this.title = str;
        this.notes = str2;
        this.metadata = metadata;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
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

    public final int getMindfulnessSessionType() {
        return this.mindfulnessSessionType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public /* synthetic */ MindfulnessSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, int i, String str, String str2, androidx.health.connect.client.records.metadata.Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, zoneOffset, instant2, zoneOffset2, i, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? androidx.health.connect.client.records.metadata.Metadata.EMPTY : metadata);
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MindfulnessSessionRecord)) {
            return false;
        }
        MindfulnessSessionRecord mindfulnessSessionRecord = (MindfulnessSessionRecord) other;
        return Intrinsics.areEqual(this.title, mindfulnessSessionRecord.title) && Intrinsics.areEqual(this.notes, mindfulnessSessionRecord.notes) && Intrinsics.areEqual(getStartTime(), mindfulnessSessionRecord.getStartTime()) && Intrinsics.areEqual(getStartZoneOffset(), mindfulnessSessionRecord.getStartZoneOffset()) && Intrinsics.areEqual(getEndTime(), mindfulnessSessionRecord.getEndTime()) && Intrinsics.areEqual(getEndZoneOffset(), mindfulnessSessionRecord.getEndZoneOffset()) && Intrinsics.areEqual(getMetadata(), mindfulnessSessionRecord.getMetadata());
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.mindfulnessSessionType) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.notes;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int hashCode4 = (((hashCode3 + (startZoneOffset != null ? startZoneOffset.hashCode() : 0)) * 31) + getEndTime().hashCode()) * 31;
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return ((hashCode4 + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "MindfulnessSessionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", mindfulnessSessionType=" + this.mindfulnessSessionType + ", title=" + this.title + ", notes=" + this.notes + ", metadata=" + getMetadata() + ')';
    }

    static {
        Map<String, Integer> mapOf = MapsKt.mapOf(TuplesKt.to("breathing", 3), TuplesKt.to("meditation", 1), TuplesKt.to("movement", 5), TuplesKt.to("music", 4), TuplesKt.to(Vo2MaxRecord.MeasurementMethod.OTHER, 2), TuplesKt.to("unguided", 6), TuplesKt.to("unknown", 0));
        MINDFULNESS_SESSION_TYPE_STRING_TO_INT_MAP = mapOf;
        MINDFULNESS_SESSION_TYPE_INT_TO_STRING_MAP = UtilsKt.reverse(mapOf);
    }
}
