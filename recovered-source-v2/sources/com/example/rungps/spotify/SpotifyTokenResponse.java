package com.example.rungps.spotify;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyOAuth.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u00063"}, d2 = {"Lcom/example/rungps/spotify/SpotifyTokenResponse;", "", "accessToken", "", "tokenType", "scope", "expiresInSec", "", "refreshToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccessToken$annotations", "()V", "getAccessToken", "()Ljava/lang/String;", "getTokenType$annotations", "getTokenType", "getScope$annotations", "getScope", "getExpiresInSec$annotations", "getExpiresInSec", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRefreshToken$annotations", "getRefreshToken", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/spotify/SpotifyTokenResponse;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class SpotifyTokenResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final Integer expiresInSec;
    private final String refreshToken;
    private final String scope;
    private final String tokenType;

    public static /* synthetic */ SpotifyTokenResponse copy$default(SpotifyTokenResponse spotifyTokenResponse, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = spotifyTokenResponse.tokenType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = spotifyTokenResponse.scope;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = spotifyTokenResponse.expiresInSec;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = spotifyTokenResponse.refreshToken;
        }
        return spotifyTokenResponse.copy(str, str5, str6, num2, str4);
    }

    @SerialName("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @SerialName("expires_in")
    public static /* synthetic */ void getExpiresInSec$annotations() {
    }

    @SerialName("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    @SerialName("scope")
    public static /* synthetic */ void getScope$annotations() {
    }

    @SerialName("token_type")
    public static /* synthetic */ void getTokenType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getExpiresInSec() {
        return this.expiresInSec;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final SpotifyTokenResponse copy(String accessToken, String tokenType, String scope, Integer expiresInSec, String refreshToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new SpotifyTokenResponse(accessToken, tokenType, scope, expiresInSec, refreshToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyTokenResponse)) {
            return false;
        }
        SpotifyTokenResponse spotifyTokenResponse = (SpotifyTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, spotifyTokenResponse.accessToken) && Intrinsics.areEqual(this.tokenType, spotifyTokenResponse.tokenType) && Intrinsics.areEqual(this.scope, spotifyTokenResponse.scope) && Intrinsics.areEqual(this.expiresInSec, spotifyTokenResponse.expiresInSec) && Intrinsics.areEqual(this.refreshToken, spotifyTokenResponse.refreshToken);
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        String str = this.tokenType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scope;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expiresInSec;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.refreshToken;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyTokenResponse(accessToken=" + this.accessToken + ", tokenType=" + this.tokenType + ", scope=" + this.scope + ", expiresInSec=" + this.expiresInSec + ", refreshToken=" + this.refreshToken + ")";
    }

    /* compiled from: SpotifyOAuth.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/spotify/SpotifyTokenResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/spotify/SpotifyTokenResponse;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotifyTokenResponse> serializer() {
            return SpotifyTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotifyTokenResponse(int i, String str, String str2, String str3, Integer num, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SpotifyTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.accessToken = str;
        if ((i & 2) == 0) {
            this.tokenType = null;
        } else {
            this.tokenType = str2;
        }
        if ((i & 4) == 0) {
            this.scope = null;
        } else {
            this.scope = str3;
        }
        if ((i & 8) == 0) {
            this.expiresInSec = null;
        } else {
            this.expiresInSec = num;
        }
        if ((i & 16) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(SpotifyTokenResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.accessToken);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.tokenType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.tokenType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.scope != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.scope);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiresInSec != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.expiresInSec);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.refreshToken == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.refreshToken);
    }

    public SpotifyTokenResponse(String accessToken, String str, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.tokenType = str;
        this.scope = str2;
        this.expiresInSec = num;
        this.refreshToken = str3;
    }

    public /* synthetic */ SpotifyTokenResponse(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getScope() {
        return this.scope;
    }

    public final Integer getExpiresInSec() {
        return this.expiresInSec;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
