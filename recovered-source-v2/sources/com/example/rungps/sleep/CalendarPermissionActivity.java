package com.example.rungps.sleep;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import com.example.rungps.BuildConfig;
import com.example.rungps.R;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CalendarPermissionActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J+\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/CalendarPermissionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "requested", "", "handler", "Landroid/os/Handler;", "calendarRequest", "Landroidx/activity/result/ActivityResultLauncher;", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requestCalendarNow", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "finishWithResult", "granted", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarPermissionActivity extends ComponentActivity {
    private static final int REQ_LEGACY = 992;
    private boolean requested;
    public static final int $stable = 8;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final ActivityResultLauncher<String> calendarRequest = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.example.rungps.sleep.CalendarPermissionActivity$$ExternalSyntheticLambda1
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CalendarPermissionActivity.this.finishWithResult(((Boolean) obj).booleanValue());
        }
    });

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_permission);
        if (SleepCalendarHelper.INSTANCE.hasPermission(this)) {
            finish();
        } else {
            this.handler.postDelayed(new Runnable() { // from class: com.example.rungps.sleep.CalendarPermissionActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarPermissionActivity.this.requestCalendarNow();
                }
            }, 350L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCalendarNow() {
        Object m7905constructorimpl;
        if (this.requested || SleepCalendarHelper.INSTANCE.hasPermission(this)) {
            if (SleepCalendarHelper.INSTANCE.hasPermission(this)) {
                finish();
                return;
            }
            return;
        }
        this.requested = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            CalendarPermissionActivity calendarPermissionActivity = this;
            this.calendarRequest.launch("android.permission.READ_CALENDAR");
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_CALENDAR"}, REQ_LEGACY);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != REQ_LEGACY) {
            return;
        }
        finishWithResult(!(grantResults.length == 0) && grantResults[0] == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(boolean granted) {
        String str;
        CalendarPermissionActivity calendarPermissionActivity = this;
        SleepCalendarPermissions.INSTANCE.markCalendarRuntimePrompted(calendarPermissionActivity, granted);
        SleepCalendarPermissions.INSTANCE.markCalendarLaunchNudge(calendarPermissionActivity, BuildConfig.VERSION_CODE);
        if (granted) {
            str = "Calendar enabled";
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_CALENDAR") && SleepCalendarPermissions.INSTANCE.wasCalendarRuntimePrompted(calendarPermissionActivity)) {
            str = "Open App info → Permissions — enable Calendar for Exercise Tracker";
        } else {
            str = "Calendar denied — use Manual event on Sleep tab";
        }
        Toast.makeText(calendarPermissionActivity, str, 1).show();
        if (!granted && !ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_CALENDAR")) {
            SleepCalendarPermissions.INSTANCE.openAppSettings(calendarPermissionActivity);
        }
        finish();
    }
}
