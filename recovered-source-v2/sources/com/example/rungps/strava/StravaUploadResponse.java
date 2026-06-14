package com.example.rungps.strava;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StravaGpxUpload.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, d2 = {"Lcom/example/rungps/strava/StravaUploadResponse;", "", "activityId", "", "id", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActivityId$annotations", "()V", "getActivityId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/example/rungps/strava/StravaUploadResponse;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
final /* data */ class StravaUploadResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long activityId;
    private final Long id;

    /* JADX WARN: Multi-variable type inference failed */
    public StravaUploadResponse() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ StravaUploadResponse copy$default(StravaUploadResponse stravaUploadResponse, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = stravaUploadResponse.activityId;
        }
        if ((i & 2) != 0) {
            l2 = stravaUploadResponse.id;
        }
        return stravaUploadResponse.copy(l, l2);
    }

    @SerialName("activity_id")
    public static /* synthetic */ void getActivityId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    public final StravaUploadResponse copy(Long activityId, Long id) {
        return new StravaUploadResponse(activityId, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaUploadResponse)) {
            return false;
        }
        StravaUploadResponse stravaUploadResponse = (StravaUploadResponse) other;
        return Intrinsics.areEqual(this.activityId, stravaUploadResponse.activityId) && Intrinsics.areEqual(this.id, stravaUploadResponse.id);
    }

    public int hashCode() {
        Long l = this.activityId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.id;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "StravaUploadResponse(activityId=" + this.activityId + ", id=" + this.id + ")";
    }

    /* compiled from: StravaGpxUpload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/strava/StravaUploadResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/strava/StravaUploadResponse;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StravaUploadResponse> serializer() {
            return StravaUploadResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StravaUploadResponse(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activityId = null;
        } else {
            this.activityId = l;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = l2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(StravaUploadResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.activityId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.activityId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.id == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.id);
    }

    public StravaUploadResponse(Long l, Long l2) {
        this.activityId = l;
        this.id = l2;
    }

    public /* synthetic */ StravaUploadResponse(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }

    public final Long getActivityId() {
        return this.activityId;
    }

    public final Long getId() {
        return this.id;
    }
}
