package com.example.rungps.sleep;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SleepSpotifyPicker.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\t¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepSpotifyPicker;", "", "<init>", "()V", "openBrowse", "", "context", "Landroid/content/Context;", SearchIntents.EXTRA_QUERY, "", "readClipboardSpotifyUri", "applyClipboardToAlarm", "", "handleShareText", "text", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSpotifyPicker {
    public static final int $stable = 0;
    public static final SleepSpotifyPicker INSTANCE = new SleepSpotifyPicker();

    private SleepSpotifyPicker() {
    }

    public static /* synthetic */ void openBrowse$default(SleepSpotifyPicker sleepSpotifyPicker, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "wake up gentle";
        }
        sleepSpotifyPicker.openBrowse(context, str);
    }

    public final void openBrowse(Context context, String query) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(query, "query");
        String obj = StringsKt.trim((CharSequence) query).toString();
        if (obj.length() == 0) {
            obj = "wake up";
        }
        String encode = Uri.encode(obj);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("spotify:search:" + encode));
        intent.setPackage("com.spotify.music");
        intent.addFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SleepSpotifyPicker sleepSpotifyPicker = this;
                context.startActivity(intent);
                Result.m7905constructorimpl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://open.spotify.com/search/" + encode));
        intent2.addFlags(268435456);
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SleepSpotifyPicker sleepSpotifyPicker2 = this;
            context.startActivity(intent2);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final String readClipboardSpotifyUri(Context context) {
        ClipData primaryClip;
        CharSequence text;
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(context, "context");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null || (obj = text.toString()) == null || (obj2 = StringsKt.trim((CharSequence) obj).toString()) == null) {
            return null;
        }
        return SleepAlarmSpotify.INSTANCE.parseUri(obj2);
    }

    public final boolean applyClipboardToAlarm(Context context) {
        ClipData primaryClip;
        CharSequence text;
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(context, "context");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null || (obj = text.toString()) == null || (obj2 = StringsKt.trim((CharSequence) obj).toString()) == null || SleepAlarmSpotify.INSTANCE.parseUri(obj2) == null) {
            return false;
        }
        SleepAlarmPreferences.INSTANCE.setSpotifyInput(context, obj2);
        SleepAlarmPreferences.INSTANCE.setSoundMode(context, SleepAlarmPreferences.SOUND_SPOTIFY);
        return true;
    }

    public final boolean handleShareText(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        String obj = text != null ? StringsKt.trim((CharSequence) text).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (SleepAlarmSpotify.INSTANCE.parseUri(obj) == null) {
            return false;
        }
        SleepAlarmPreferences.INSTANCE.setSpotifyInput(context, obj);
        SleepAlarmPreferences.INSTANCE.setSoundMode(context, SleepAlarmPreferences.SOUND_SPOTIFY);
        return true;
    }
}
