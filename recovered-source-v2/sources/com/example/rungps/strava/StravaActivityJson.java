package com.example.rungps.strava;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.caverock.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: StravaActivitiesApi.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jk\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0018R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u0018¨\u0006A"}, d2 = {"Lcom/example/rungps/strava/StravaActivityJson;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "distance", "", "movingTime", "", "elapsedTime", SVGParser.XML_STYLESHEET_ATTR_TYPE, "sportType", "startDate", "startDateLocal", "<init>", "(JLjava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDistance", "()D", "getMovingTime$annotations", "()V", "getMovingTime", "()I", "getElapsedTime$annotations", "getElapsedTime", "getType", "getSportType$annotations", "getSportType", "getStartDate$annotations", "getStartDate", "getStartDateLocal$annotations", "getStartDateLocal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class StravaActivityJson {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double distance;
    private final int elapsedTime;
    private final long id;
    private final int movingTime;
    private final String name;
    private final String sportType;
    private final String startDate;
    private final String startDateLocal;
    private final String type;

    @SerialName("elapsed_time")
    public static /* synthetic */ void getElapsedTime$annotations() {
    }

    @SerialName("moving_time")
    public static /* synthetic */ void getMovingTime$annotations() {
    }

    @SerialName("sport_type")
    public static /* synthetic */ void getSportType$annotations() {
    }

    @SerialName("start_date")
    public static /* synthetic */ void getStartDate$annotations() {
    }

    @SerialName("start_date_local")
    public static /* synthetic */ void getStartDateLocal$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMovingTime() {
        return this.movingTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getElapsedTime() {
        return this.elapsedTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSportType() {
        return this.sportType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStartDateLocal() {
        return this.startDateLocal;
    }

    public final StravaActivityJson copy(long id, String name, double distance, int movingTime, int elapsedTime, String type, String sportType, String startDate, String startDateLocal) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StravaActivityJson(id, name, distance, movingTime, elapsedTime, type, sportType, startDate, startDateLocal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaActivityJson)) {
            return false;
        }
        StravaActivityJson stravaActivityJson = (StravaActivityJson) other;
        return this.id == stravaActivityJson.id && Intrinsics.areEqual(this.name, stravaActivityJson.name) && Double.compare(this.distance, stravaActivityJson.distance) == 0 && this.movingTime == stravaActivityJson.movingTime && this.elapsedTime == stravaActivityJson.elapsedTime && Intrinsics.areEqual(this.type, stravaActivityJson.type) && Intrinsics.areEqual(this.sportType, stravaActivityJson.sportType) && Intrinsics.areEqual(this.startDate, stravaActivityJson.startDate) && Intrinsics.areEqual(this.startDateLocal, stravaActivityJson.startDateLocal);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.distance)) * 31) + Integer.hashCode(this.movingTime)) * 31) + Integer.hashCode(this.elapsedTime)) * 31) + this.type.hashCode()) * 31;
        String str2 = this.sportType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDate;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startDateLocal;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "StravaActivityJson(id=" + this.id + ", name=" + this.name + ", distance=" + this.distance + ", movingTime=" + this.movingTime + ", elapsedTime=" + this.elapsedTime + ", type=" + this.type + ", sportType=" + this.sportType + ", startDate=" + this.startDate + ", startDateLocal=" + this.startDateLocal + ")";
    }

    /* compiled from: StravaActivitiesApi.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/strava/StravaActivityJson$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/strava/StravaActivityJson;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StravaActivityJson> serializer() {
            return StravaActivityJson$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StravaActivityJson(int i, long j, String str, double d, int i2, int i3, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StravaActivityJson$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.distance = 0.0d;
        } else {
            this.distance = d;
        }
        if ((i & 8) == 0) {
            this.movingTime = 0;
        } else {
            this.movingTime = i2;
        }
        if ((i & 16) == 0) {
            this.elapsedTime = 0;
        } else {
            this.elapsedTime = i3;
        }
        if ((i & 32) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 64) == 0) {
            this.sportType = null;
        } else {
            this.sportType = str3;
        }
        if ((i & 128) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str4;
        }
        if ((i & 256) == 0) {
            this.startDateLocal = null;
        } else {
            this.startDateLocal = str5;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(StravaActivityJson self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.distance, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.distance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.movingTime != 0) {
            output.encodeIntElement(serialDesc, 3, self.movingTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.elapsedTime != 0) {
            output.encodeIntElement(serialDesc, 4, self.elapsedTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.type, "")) {
            output.encodeStringElement(serialDesc, 5, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sportType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.sportType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.startDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.startDate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.startDateLocal == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.startDateLocal);
    }

    public StravaActivityJson(long j, String str, double d, int i, int i2, String type, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = j;
        this.name = str;
        this.distance = d;
        this.movingTime = i;
        this.elapsedTime = i2;
        this.type = type;
        this.sportType = str2;
        this.startDate = str3;
        this.startDateLocal = str4;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final int getMovingTime() {
        return this.movingTime;
    }

    public final int getElapsedTime() {
        return this.elapsedTime;
    }

    public /* synthetic */ StravaActivityJson(long j, String str, double d, int i, int i2, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : str5);
    }

    public final String getType() {
        return this.type;
    }

    public final String getSportType() {
        return this.sportType;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStartDateLocal() {
        return this.startDateLocal;
    }
}
