package com.example.rungps.notify;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.example.rungps.gym.AmbientSessionTagger;
import com.example.rungps.nfc.GymNfcGuard;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymNfcNotifier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ<\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010J \u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010J \u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/notify/GymNfcNotifier;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIF_ID", "", "ensureChannel", "", "context", "Landroid/content/Context;", "show", "title", "body", "openGymTab", "", "onlyWhenBackground", "isBackground", "notifyTagResult", "kind", "notifyNoOpenSession", "notifyUnrecognizedTag", "notifyScanTooSoon", "notifyRegistering", "notifyNoCardRegistered", "notifyGenericTag", "detail", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcNotifier {
    public static final int $stable = 0;
    public static final String CHANNEL_ID = "gym_nfc";
    public static final GymNfcNotifier INSTANCE = new GymNfcNotifier();
    public static final int NOTIF_ID = 4402;

    private GymNfcNotifier() {
    }

    public final void ensureChannel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel("gym_nfc") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("gym_nfc", "Gym NFC", 4);
        notificationChannel.setDescription("Gym card taps and session prompts");
        notificationChannel.setShowBadge(true);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static /* synthetic */ void show$default(GymNfcNotifier gymNfcNotifier, Context context, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        gymNfcNotifier.show(context, str, str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3);
    }

    public final void show(Context context, String title, String body, boolean openGymTab, boolean onlyWhenBackground, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        if (!onlyWhenBackground || isBackground) {
            ensureChannel(context);
            if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                String eventKey = AppNotifications.INSTANCE.eventKey("gym_nfc", title + AmbientSessionTagger.CHIP_SEP + body);
                if (AppNotifications.INSTANCE.shouldPost(context, eventKey)) {
                    String str = body;
                    NotificationCompat.Builder category = new NotificationCompat.Builder(context, "gym_nfc").setSmallIcon(R.drawable.ic_dialog_info).setContentTitle(title).setContentText(str).setStyle(new NotificationCompat.BigTextStyle().bigText(str)).setPriority(1).setCategory(NotificationCompat.CATEGORY_EVENT);
                    Intrinsics.checkNotNullExpressionValue(category, "setCategory(...)");
                    AppNotifications.INSTANCE.applyOpenAndDismiss(context, category, 4402, eventKey, 4402, (r17 & 32) != 0 ? null : openGymTab ? "gym" : null, (r17 & 64) != 0 ? MapsKt.emptyMap() : null);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        GymNfcNotifier gymNfcNotifier = this;
                        NotificationManagerCompat.from(context).notify(4402, category.build());
                        Result.m7905constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void notifyTagResult$default(GymNfcNotifier gymNfcNotifier, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyTagResult(context, str, z);
    }

    public final void notifyTagResult(Context context, String kind, boolean isBackground) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean isAtGym = GymNfcGuard.INSTANCE.isAtGym(context);
        String nearestGymName = GymNfcGuard.INSTANCE.nearestGymName(context);
        if (isAtGym && nearestGymName != null) {
            str = " at " + nearestGymName;
        } else if (nearestGymName != null) {
            str = " (near " + nearestGymName + ")";
        } else if (!isAtGym) {
            str = " (away from saved gym)";
        } else {
            str = "";
        }
        int hashCode = kind.hashCode();
        if (hashCode != -1274442605) {
            if (hashCode != -690213213) {
                if (hashCode == 109757538 && kind.equals("start")) {
                    show$default(this, context, "Gym card scanned", "Tap to start a gym session" + str, false, false, isBackground, 24, null);
                    return;
                }
            } else if (kind.equals("register")) {
                show$default(this, context, "Gym card registered", "Your membership tag is ready" + str, false, false, isBackground, 24, null);
                return;
            }
        } else if (kind.equals("finish")) {
            show$default(this, context, "Gym card scanned", "Tap to finish your open gym session" + str, false, false, isBackground, 24, null);
            return;
        }
        show$default(this, context, "Gym tag scanned", "Open the app to continue" + str, false, false, isBackground, 24, null);
    }

    public static /* synthetic */ void notifyNoOpenSession$default(GymNfcNotifier gymNfcNotifier, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyNoOpenSession(context, z);
    }

    public final void notifyNoOpenSession(Context context, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, "Gym card — finish", "No open gym session to finish. Start training in the Gym tab first.", false, false, isBackground, 24, null);
    }

    public static /* synthetic */ void notifyUnrecognizedTag$default(GymNfcNotifier gymNfcNotifier, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyUnrecognizedTag(context, z);
    }

    public final void notifyUnrecognizedTag(Context context, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, "Unrecognized gym card", "This NFC tag is not your registered gym card. Re-register in Gym → More if needed.", true, false, isBackground, 16, null);
    }

    public static /* synthetic */ void notifyScanTooSoon$default(GymNfcNotifier gymNfcNotifier, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyScanTooSoon(context, z);
    }

    public final void notifyScanTooSoon(Context context, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, "Gym card scanned", "Wait a moment and tap again.", false, false, isBackground, 16, null);
    }

    public static /* synthetic */ void notifyRegistering$default(GymNfcNotifier gymNfcNotifier, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyRegistering(context, z);
    }

    public final void notifyRegistering(Context context, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, "Register gym card", "Hold your membership NFC card on the back of the phone.", true, false, isBackground, 16, null);
    }

    public static /* synthetic */ void notifyNoCardRegistered$default(GymNfcNotifier gymNfcNotifier, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyNoCardRegistered(context, z);
    }

    public final void notifyNoCardRegistered(Context context, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, "NFC tag detected", "No gym card registered yet. Open Gym → More → Add gym card, then scan again.", true, false, isBackground, 16, null);
    }

    public static /* synthetic */ void notifyGenericTag$default(GymNfcNotifier gymNfcNotifier, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        gymNfcNotifier.notifyGenericTag(context, str, z);
    }

    public final void notifyGenericTag(Context context, String detail, boolean isBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detail, "detail");
        show$default(this, context, "NFC tag scanned", detail, true, false, isBackground, 16, null);
    }
}
