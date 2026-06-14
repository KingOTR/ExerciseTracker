package com.samsung.android.sdk.health.data.helper;

import com.samsung.android.sdk.health.data.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/helper/SdkVersion;", "", "", "getVersionCode", "()I", "", "getVersionName", "()Ljava/lang/String;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SdkVersion {
    public static final SdkVersion INSTANCE = new SdkVersion();

    private SdkVersion() {
    }

    @JvmStatic
    public static final int getVersionCode() {
        return BuildConfig.SDK_VERSION_CODE;
    }

    @JvmStatic
    public static final String getVersionName() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
