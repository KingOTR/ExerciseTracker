package com.samsung.android.sdk.health.data.error;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.samsung.android.sdk.health.data.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/error/ResolvablePlatformException;", "Lcom/samsung/android/sdk/health/data/error/HealthDataException;", "Landroid/app/Activity;", "activity", "", "resolve", "(Landroid/app/Activity;)V", "", "c", "Z", "getHasResolution", "()Z", "hasResolution", "", "errorCode", "", "errorMessage", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Z)V", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ResolvablePlatformException extends HealthDataException {

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean hasResolution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolvablePlatformException(Integer num, String errorMessage, boolean z) {
        super(num, errorMessage, null, 4, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.hasResolution = z;
    }

    public final boolean getHasResolution() {
        return this.hasResolution;
    }

    public final void resolve(Activity activity) {
        String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        z1.a((Object) activity);
        z1.a(activity);
        Integer errorCode = getErrorCode();
        if ((errorCode != null && errorCode.intValue() == 3000) || (errorCode != null && errorCode.intValue() == 3001)) {
            if (this.hasResolution) {
                Context baseContext = activity.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "activity.baseContext");
                if (baseContext.getPackageManager().getPackageInfo("com.sec.android.app.samsungapps", 0).applicationInfo.enabled) {
                    str = "samsungapps://ProductDetail/com.sec.android.app.shealth";
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                }
                str = "market://details?id=com.sec.android.app.shealth";
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            }
            return;
        }
        if (errorCode != null && errorCode.intValue() == 3002) {
            activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.sec.android.app.shealth")));
            return;
        }
        if (errorCode != null && errorCode.intValue() == 3003) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage("com.sec.android.app.shealth");
            intent.addCategory("android.intent.category.LAUNCHER");
            activity.startActivity(intent);
        }
    }
}
