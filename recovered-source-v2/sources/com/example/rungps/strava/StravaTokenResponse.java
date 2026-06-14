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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: StravaOAuth.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001d\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00065"}, d2 = {"Lcom/example/rungps/strava/StravaTokenResponse;", "", "accessToken", "", "refreshToken", "expiresAt", "", "expiresIn", "", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccessToken$annotations", "()V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken$annotations", "getRefreshToken", "getExpiresAt$annotations", "getExpiresAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpiresIn$annotations", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScope", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/strava/StravaTokenResponse;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class StravaTokenResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final Long expiresAt;
    private final Integer expiresIn;
    private final String refreshToken;
    private final String scope;

    public static /* synthetic */ StravaTokenResponse copy$default(StravaTokenResponse stravaTokenResponse, String str, String str2, Long l, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stravaTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = stravaTokenResponse.refreshToken;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            l = stravaTokenResponse.expiresAt;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num = stravaTokenResponse.expiresIn;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = stravaTokenResponse.scope;
        }
        return stravaTokenResponse.copy(str, str4, l2, num2, str3);
    }

    @SerialName("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @SerialName("expires_at")
    public static /* synthetic */ void getExpiresAt$annotations() {
    }

    @SerialName("expires_in")
    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    @SerialName("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final StravaTokenResponse copy(String accessToken, String refreshToken, Long expiresAt, Integer expiresIn, String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new StravaTokenResponse(accessToken, refreshToken, expiresAt, expiresIn, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaTokenResponse)) {
            return false;
        }
        StravaTokenResponse stravaTokenResponse = (StravaTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, stravaTokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, stravaTokenResponse.refreshToken) && Intrinsics.areEqual(this.expiresAt, stravaTokenResponse.expiresAt) && Intrinsics.areEqual(this.expiresIn, stravaTokenResponse.expiresIn) && Intrinsics.areEqual(this.scope, stravaTokenResponse.scope);
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        String str = this.refreshToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.expiresAt;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.expiresIn;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.scope;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StravaTokenResponse(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", expiresAt=" + this.expiresAt + ", expiresIn=" + this.expiresIn + ", scope=" + this.scope + ")";
    }

    /* compiled from: StravaOAuth.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/strava/StravaTokenResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/strava/StravaTokenResponse;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StravaTokenResponse> serializer() {
            return StravaTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StravaTokenResponse(int i, String str, String str2, Long l, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StravaTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.accessToken = str;
        if ((i & 2) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str2;
        }
        if ((i & 4) == 0) {
            this.expiresAt = null;
        } else {
            this.expiresAt = l;
        }
        if ((i & 8) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = num;
        }
        if ((i & 16) == 0) {
            this.scope = null;
        } else {
            this.scope = str3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(StravaTokenResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.accessToken);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.refreshToken != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.refreshToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.expiresAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.expiresAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiresIn != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.expiresIn);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.scope == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.scope);
    }

    public StravaTokenResponse(String accessToken, String str, Long l, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.refreshToken = str;
        this.expiresAt = l;
        this.expiresIn = num;
        this.scope = str2;
    }

    public /* synthetic */ StravaTokenResponse(String str, String str2, Long l, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final String getScope() {
        return this.scope;
    }
}
