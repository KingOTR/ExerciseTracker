package com.example.rungps.sleep;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: SleepAlarmSpotify.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmSpotify;", "", "<init>", "()V", "linkPattern", "Lkotlin/text/Regex;", "parseUri", "", "input", "displayLabel", "spotifyUri", "launch", "", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmSpotify {
    public static final SleepAlarmSpotify INSTANCE = new SleepAlarmSpotify();
    private static final Regex linkPattern = new Regex("https?://open\\.spotify\\.com/(track|album|playlist|episode)/([a-zA-Z0-9]+)(?:\\?.*)?", RegexOption.IGNORE_CASE);
    public static final int $stable = 8;

    private SleepAlarmSpotify() {
    }

    public final String parseUri(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String obj = StringsKt.trim((CharSequence) input).toString();
        String str = obj;
        if (str.length() == 0) {
            return null;
        }
        if (StringsKt.startsWith(obj, "spotify:", true)) {
            return obj;
        }
        MatchResult find$default = Regex.find$default(linkPattern, str, 0, 2, null);
        if (find$default == null) {
            return null;
        }
        String lowerCase = find$default.getGroupValues().get(1).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "spotify:" + lowerCase + ":" + ((Object) find$default.getGroupValues().get(2));
    }

    public final String displayLabel(String spotifyUri) {
        Intrinsics.checkNotNullParameter(spotifyUri, "spotifyUri");
        List split$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(spotifyUri, (CharSequence) "spotify:"), new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() < 2) {
            return spotifyUri;
        }
        return split$default.get(0) + " · " + StringsKt.take((String) split$default.get(1), 8) + "…";
    }

    public final boolean launch(Context context, String spotifyUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spotifyUri, "spotifyUri");
        Uri parse = Uri.parse(spotifyUri);
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setPackage("com.spotify.music");
        intent.addFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SleepAlarmSpotify sleepAlarmSpotify = this;
                context.startActivity(intent);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            return true;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        intent2.addFlags(268435456);
        if (intent2.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SleepAlarmSpotify sleepAlarmSpotify2 = this;
            context.startActivity(intent2);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        return true;
    }
}
