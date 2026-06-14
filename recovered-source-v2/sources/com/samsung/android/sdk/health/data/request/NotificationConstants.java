package com.samsung.android.sdk.health.data.request;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/NotificationConstants;", "", "", "ACTION_DATA_CHANGED", "Ljava/lang/String;", "EXTRA_KEY_DATA_TYPE", "EXTRA_KEY_CHALLENGE", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class NotificationConstants {
    public static final String ACTION_DATA_CHANGED = "com.samsung.health.action.DATA_CHANGED";
    public static final String EXTRA_KEY_CHALLENGE = "com.samsung.health.intent.extra.challenge";
    public static final String EXTRA_KEY_DATA_TYPE = "com.samsung.health.intent.extra.data_type";
    public static final NotificationConstants INSTANCE = new NotificationConstants();

    private NotificationConstants() {
    }
}
