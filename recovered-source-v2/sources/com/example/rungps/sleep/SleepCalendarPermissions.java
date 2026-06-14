package com.example.rungps.sleep;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepCalendarPermissions.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018J\u000e\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010%\u001a\u0004\u0018\u00010\u001f*\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarPermissions;", "", "<init>", "()V", "PREFS", "", "KEY_CALENDAR_PROMPTED", "KEY_CALENDAR_DENIED", "KEY_CALENDAR_NUDGE_VERSION", "CALENDAR_LAUNCH_PACKAGES", "", "hasReadPermission", "", "context", "Landroid/content/Context;", "wasCalendarRuntimePrompted", "wasCalendarDenied", "markCalendarRuntimePrompted", "", "granted", "resetCalendarPromptState", "shouldPromptReadCalendar", "shouldRequestCalendarOnLaunch", "appVersionCode", "", "markCalendarLaunchNudge", "shouldAutoRequestOnSettingsOpen", "shouldShowCalendarSettingsHint", "launchPermissionRequest", "requestLegacyPermission", "activity", "Landroid/app/Activity;", "requestCode", "openCalendarApp", "openAppSettings", "openAppPermissionsEditor", "isCalendarAppInstalled", "findHostActivity", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCalendarPermissions {
    private static final String KEY_CALENDAR_DENIED = "calendar_runtime_denied_v1";
    private static final String KEY_CALENDAR_NUDGE_VERSION = "calendar_nudge_version_code";
    private static final String KEY_CALENDAR_PROMPTED = "calendar_runtime_prompted_v1";
    private static final String PREFS = "app_permissions";
    public static final SleepCalendarPermissions INSTANCE = new SleepCalendarPermissions();
    private static final List<String> CALENDAR_LAUNCH_PACKAGES = CollectionsKt.listOf((Object[]) new String[]{"com.google.android.calendar", "com.samsung.android.calendar", "com.sec.android.app.calendar", "com.android.calendar"});
    public static final int $stable = 8;

    private SleepCalendarPermissions() {
    }

    public final boolean hasReadPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SleepCalendarHelper.INSTANCE.hasPermission(context);
    }

    public final boolean wasCalendarRuntimePrompted(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_CALENDAR_PROMPTED, false);
    }

    public final boolean wasCalendarDenied(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_CALENDAR_DENIED, false);
    }

    public final void markCalendarRuntimePrompted(Context context, boolean granted) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_CALENDAR_PROMPTED, true).putBoolean(KEY_CALENDAR_DENIED, !granted).apply();
    }

    public final void resetCalendarPromptState(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_CALENDAR_PROMPTED).remove(KEY_CALENDAR_DENIED).apply();
    }

    public final boolean shouldPromptReadCalendar(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (hasReadPermission(context) || wasCalendarRuntimePrompted(context)) ? false : true;
    }

    public final boolean shouldRequestCalendarOnLaunch(Context context, int appVersionCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !hasReadPermission(context) && context.getSharedPreferences(PREFS, 0).getInt(KEY_CALENDAR_NUDGE_VERSION, 0) < appVersionCode;
    }

    public final void markCalendarLaunchNudge(Context context, int appVersionCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putInt(KEY_CALENDAR_NUDGE_VERSION, appVersionCode).apply();
    }

    public final boolean shouldAutoRequestOnSettingsOpen(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !hasReadPermission(context);
    }

    public final boolean shouldShowCalendarSettingsHint(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !hasReadPermission(context) && wasCalendarDenied(context);
    }

    public final void launchPermissionRequest(Context context) {
        Object m7905constructorimpl;
        SleepCalendarPermissions sleepCalendarPermissions;
        Activity findHostActivity;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) CalendarPermissionActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepCalendarPermissions sleepCalendarPermissions2 = this;
            context.startActivity(intent);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) == null || (findHostActivity = (sleepCalendarPermissions = INSTANCE).findHostActivity(context)) == null) {
            return;
        }
        sleepCalendarPermissions.requestLegacyPermission(findHostActivity, 992);
    }

    public final void requestLegacyPermission(Activity activity, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityCompat.requestPermissions(activity, new String[]{"android.permission.READ_CALENDAR"}, requestCode);
    }

    public final boolean openCalendarApp(Context context) {
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        Object m7905constructorimpl3;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Iterator<String> it = CALENDAR_LAUNCH_PACKAGES.iterator();
        while (it.hasNext()) {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(it.next());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    SleepCalendarPermissions sleepCalendarPermissions = this;
                    context.startActivity(launchIntentForPackage);
                    m7905constructorimpl3 = Result.m7905constructorimpl(true);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl3 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl3)) {
                    m7905constructorimpl3 = false;
                }
                if (((Boolean) m7905constructorimpl3).booleanValue()) {
                    return true;
                }
            }
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_CALENDAR");
        intent.addFlags(268435456);
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SleepCalendarPermissions sleepCalendarPermissions2 = this;
            context.startActivity(intent);
            m7905constructorimpl = Result.m7905constructorimpl(true);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = false;
        }
        if (((Boolean) m7905constructorimpl).booleanValue()) {
            return true;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("content://com.android.calendar/time/" + System.currentTimeMillis()));
        intent2.addFlags(268435456);
        Intent createChooser = Intent.createChooser(intent2, "Open calendar");
        createChooser.addFlags(268435456);
        try {
            Result.Companion companion5 = Result.INSTANCE;
            SleepCalendarPermissions sleepCalendarPermissions3 = this;
            context.startActivity(createChooser);
            m7905constructorimpl2 = Result.m7905constructorimpl(true);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
            m7905constructorimpl2 = false;
        }
        return ((Boolean) m7905constructorimpl2).booleanValue();
    }

    public final void openAppSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent addFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepCalendarPermissions sleepCalendarPermissions = this;
            context.startActivity(addFlags);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void openAppPermissionsEditor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        openAppSettings(context);
    }

    public final boolean isCalendarAppInstalled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        List<String> list = CALENDAR_LAUNCH_PACKAGES;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (packageManager.getLaunchIntentForPackage((String) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    private final Activity findHostActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
