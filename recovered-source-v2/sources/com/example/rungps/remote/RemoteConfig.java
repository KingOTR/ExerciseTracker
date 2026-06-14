package com.example.rungps.remote;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/example/rungps/remote/RemoteConfig;", "", "appTitleOverride", "", "enableDevLabels", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAppTitleOverride", "()Ljava/lang/String;", "getEnableDevLabels", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/example/rungps/remote/RemoteConfig;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RemoteConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String appTitleOverride;
    private final Boolean enableDevLabels;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfig() {
        this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RemoteConfig copy$default(RemoteConfig remoteConfig, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteConfig.appTitleOverride;
        }
        if ((i & 2) != 0) {
            bool = remoteConfig.enableDevLabels;
        }
        return remoteConfig.copy(str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppTitleOverride() {
        return this.appTitleOverride;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getEnableDevLabels() {
        return this.enableDevLabels;
    }

    public final RemoteConfig copy(String appTitleOverride, Boolean enableDevLabels) {
        return new RemoteConfig(appTitleOverride, enableDevLabels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) other;
        return Intrinsics.areEqual(this.appTitleOverride, remoteConfig.appTitleOverride) && Intrinsics.areEqual(this.enableDevLabels, remoteConfig.enableDevLabels);
    }

    public int hashCode() {
        String str = this.appTitleOverride;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enableDevLabels;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "RemoteConfig(appTitleOverride=" + this.appTitleOverride + ", enableDevLabels=" + this.enableDevLabels + ")";
    }

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/remote/RemoteConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/remote/RemoteConfig;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RemoteConfig> serializer() {
            return RemoteConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RemoteConfig(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appTitleOverride = null;
        } else {
            this.appTitleOverride = str;
        }
        if ((i & 2) == 0) {
            this.enableDevLabels = null;
        } else {
            this.enableDevLabels = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(RemoteConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.appTitleOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.appTitleOverride);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.enableDevLabels == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.enableDevLabels);
    }

    public RemoteConfig(String str, Boolean bool) {
        this.appTitleOverride = str;
        this.enableDevLabels = bool;
    }

    public /* synthetic */ RemoteConfig(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }

    public final String getAppTitleOverride() {
        return this.appTitleOverride;
    }

    public final Boolean getEnableDevLabels() {
        return this.enableDevLabels;
    }
}
