package com.example.rungps;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExerciseTrackerApplication.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/CrashLog;", "", "<init>", "()V", "PREFS", "", "KEY_TS", "KEY_THREAD", "KEY_STACK", "KEY_BREADCRUMB", "install", "", "context", "Landroid/content/Context;", "note", "message", CrashLog.KEY_BREADCRUMB, "read", "Lcom/example/rungps/CrashLog$CrashEntry;", CervicalMucusRecord.Appearance.CLEAR, "CrashEntry", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrashLog {
    public static final int $stable = 0;
    public static final CrashLog INSTANCE = new CrashLog();
    private static final String KEY_BREADCRUMB = "lastBreadcrumb";
    private static final String KEY_STACK = "lastCrashStack";
    private static final String KEY_THREAD = "lastCrashThread";
    private static final String KEY_TS = "lastCrashAtMs";
    private static final String PREFS = "crash_log";

    private CrashLog() {
    }

    public final void install(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.example.rungps.CrashLog$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                CrashLog.install$lambda$1(defaultUncaughtExceptionHandler, context, thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context, Thread thread, Throwable th) {
        try {
            Result.Companion companion = Result.INSTANCE;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            context.getSharedPreferences(PREFS, 0).edit().putLong(KEY_TS, System.currentTimeMillis()).putString(KEY_THREAD, thread.getName()).putString(KEY_STACK, stringWriter.toString()).apply();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final void note(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_BREADCRUMB, System.currentTimeMillis() + ": " + StringsKt.take(message, 200)).apply();
    }

    public final String lastBreadcrumb(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_BREADCRUMB, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final CrashEntry read(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        long j = sharedPreferences.getLong(KEY_TS, 0L);
        String string = sharedPreferences.getString(KEY_STACK, null);
        if (string == null) {
            return null;
        }
        String string2 = sharedPreferences.getString(KEY_THREAD, "unknown");
        String str = string2 != null ? string2 : "unknown";
        if (j <= 0) {
            return null;
        }
        return new CrashEntry(j, str, string);
    }

    public final void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().clear().apply();
    }

    /* compiled from: ExerciseTrackerApplication.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/CrashLog$CrashEntry;", "", "atMs", "", "thread", "", "stacktrace", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getAtMs", "()J", "getThread", "()Ljava/lang/String;", "getStacktrace", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CrashEntry {
        public static final int $stable = 0;
        private final long atMs;
        private final String stacktrace;
        private final String thread;

        public static /* synthetic */ CrashEntry copy$default(CrashEntry crashEntry, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = crashEntry.atMs;
            }
            if ((i & 2) != 0) {
                str = crashEntry.thread;
            }
            if ((i & 4) != 0) {
                str2 = crashEntry.stacktrace;
            }
            return crashEntry.copy(j, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAtMs() {
            return this.atMs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getThread() {
            return this.thread;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final CrashEntry copy(long atMs, String thread, String stacktrace) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            return new CrashEntry(atMs, thread, stacktrace);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrashEntry)) {
                return false;
            }
            CrashEntry crashEntry = (CrashEntry) other;
            return this.atMs == crashEntry.atMs && Intrinsics.areEqual(this.thread, crashEntry.thread) && Intrinsics.areEqual(this.stacktrace, crashEntry.stacktrace);
        }

        public int hashCode() {
            return (((Long.hashCode(this.atMs) * 31) + this.thread.hashCode()) * 31) + this.stacktrace.hashCode();
        }

        public String toString() {
            return "CrashEntry(atMs=" + this.atMs + ", thread=" + this.thread + ", stacktrace=" + this.stacktrace + ")";
        }

        public CrashEntry(long j, String thread, String stacktrace) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            this.atMs = j;
            this.thread = thread;
            this.stacktrace = stacktrace;
        }

        public final long getAtMs() {
            return this.atMs;
        }

        public final String getThread() {
            return this.thread;
        }

        public final String getStacktrace() {
            return this.stacktrace;
        }
    }
}
