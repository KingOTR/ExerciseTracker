package com.example.rungps.sleep;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.CalendarContract;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepCalendarObserver.kt */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005*\u0001\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarObserver;", "", "context", "Landroid/content/Context;", "onChange", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "app", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "observer", "com/example/rungps/sleep/SleepCalendarObserver$observer$1", "Lcom/example/rungps/sleep/SleepCalendarObserver$observer$1;", "start", "stop", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCalendarObserver {
    public static final int $stable = 8;
    private final Context app;
    private final Handler handler;
    private final SleepCalendarObserver$observer$1 observer;
    private final Function0<Unit> onChange;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.example.rungps.sleep.SleepCalendarObserver$observer$1] */
    public SleepCalendarObserver(Context context, Function0<Unit> onChange) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        this.onChange = onChange;
        this.app = context.getApplicationContext();
        final Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.observer = new ContentObserver(handler) { // from class: com.example.rungps.sleep.SleepCalendarObserver$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                Function0 function0;
                function0 = SleepCalendarObserver.this.onChange;
                function0.invoke();
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                Function0 function0;
                function0 = SleepCalendarObserver.this.onChange;
                function0.invoke();
            }
        };
    }

    public final void start() {
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepCalendarObserver sleepCalendarObserver = this;
            this.app.getContentResolver().registerContentObserver(CalendarContract.Events.CONTENT_URI, true, this.observer);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void stop() {
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepCalendarObserver sleepCalendarObserver = this;
            this.app.getContentResolver().unregisterContentObserver(this.observer);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }
}
