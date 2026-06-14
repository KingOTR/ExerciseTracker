package com.example.rungps.ui.onboarding;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.example.rungps.health.HealthConnectManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingPermissions.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/ui/onboarding/OnboardingPermissions;", "", "<init>", "()V", "runtimePermissions", "", "", "()[Ljava/lang/String;", "hasAllRuntimePermissions", "", "context", "Landroid/content/Context;", "runtimeStatusLine", "healthConnectStatusLine", "granted", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingPermissions {
    public static final int $stable = 0;
    public static final OnboardingPermissions INSTANCE = new OnboardingPermissions();

    private OnboardingPermissions() {
    }

    public final String[] runtimePermissions() {
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add("android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT >= 33) {
            createListBuilder.add("android.permission.POST_NOTIFICATIONS");
        }
        createListBuilder.add("android.permission.ACTIVITY_RECOGNITION");
        if (Build.VERSION.SDK_INT >= 31) {
            createListBuilder.add("android.permission.BLUETOOTH_SCAN");
            createListBuilder.add("android.permission.BLUETOOTH_CONNECT");
        }
        return (String[]) CollectionsKt.build(createListBuilder).toArray(new String[0]);
    }

    public final boolean hasAllRuntimePermissions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (String str : runtimePermissions()) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public final String runtimeStatusLine(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] runtimePermissions = runtimePermissions();
        ArrayList arrayList = new ArrayList();
        for (String str : runtimePermissions) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return "Phone permissions: granted";
        }
        return "Phone permissions: " + arrayList2.size() + " still needed (tap Grant below)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String healthConnectStatusLine$default(OnboardingPermissions onboardingPermissions, Context context, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return onboardingPermissions.healthConnectStatusLine(context, set);
    }

    public final String healthConnectStatusLine(Context context, Set<String> granted) {
        Intrinsics.checkNotNullParameter(context, "context");
        HealthConnectManager healthConnectManager = new HealthConnectManager(context);
        if (!healthConnectManager.isReady()) {
            return "Health Connect: " + healthConnectManager.statusMessage();
        }
        if (granted == null) {
            return "Health Connect: tap Grant to allow steps, sleep, and heart rate";
        }
        if (granted.containsAll(healthConnectManager.getAllRequestedPermissions())) {
            return "Health Connect: all access granted";
        }
        if (!granted.containsAll(healthConnectManager.getStepsReadPermissions())) {
            return "Health Connect: tap Grant to allow steps, sleep, and heart rate";
        }
        return "Health Connect: steps OK — grant sleep & heart rate for full recovery";
    }
}
