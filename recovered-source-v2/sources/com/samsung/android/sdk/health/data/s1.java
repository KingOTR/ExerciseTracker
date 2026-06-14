package com.samsung.android.sdk.health.data;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.error.ResolvablePlatformException;
import com.samsung.android.sdk.health.data.internal.ConnectionResponse;
import com.samsung.android.sdk.health.data.internal.SingleCallback;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class s1 {
    public static volatile s1 h;
    public final Context a;
    public int b;
    public final String c;
    public final r1 d;
    public int e;
    public final AtomicLong f;
    public final ExecutorService g;

    public s1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        this.c = packageName;
        this.d = new r1(context, new Runnable() { // from class: com.samsung.android.sdk.health.data.s1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s1.a(s1.this);
            }
        });
        this.e = 1;
        this.f = new AtomicLong(0L);
        this.g = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.samsung.android.sdk.health.data.s1$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return s1.a(s1.this, runnable);
            }
        });
    }

    public final void a(int i, int i2) {
        if (i2 / 1000 <= i / 1000) {
            return;
        }
        Log.e("[SHD]RemoteTaskExecutor", "Samsung Health is an old version");
        throw new ResolvablePlatformException(3001, "Samsung Health is an old version so does not support this operation", a.b(this.a));
    }

    public final IHealthDataStore a() {
        IHealthDataStore iHealthDataStore;
        if (this.e == 1) {
            a2.b(this.a);
            try {
                try {
                    synchronized (this) {
                        if (this.e == 1 && this.d.a() && (iHealthDataStore = this.d.c) != null) {
                            a(iHealthDataStore);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (RemoteException e) {
                    Log.e("[SHD]RemoteTaskExecutor", "Remote error during connection");
                    throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_CONNECTION_FAIL), "Remote error during connection", e);
                } catch (InterruptedException e2) {
                    Log.e("[SHD]RemoteTaskExecutor", "Interrupted during connection");
                    throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERRUPTED), "Interrupted during connection", e2);
                } catch (TimeoutException e3) {
                    Log.e("[SHD]RemoteTaskExecutor", "Connection time out");
                    throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_CONNECTION_TIMEOUT), "Connection time out", e3);
                }
            } finally {
                if (this.e == 1) {
                    this.d.b();
                    a2.a(this.a);
                }
            }
        }
        return this.d.c;
    }

    public final void a(IHealthDataStore iHealthDataStore) {
        c cVar = new c("connectInternal");
        String str = this.c;
        SingleCallback<ConnectionResponse> a = com.samsung.android.sdk.health.data.internal.m.a(cVar, null);
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type com.samsung.android.sdk.health.data.internal.SingleCallback<com.samsung.android.sdk.health.data.internal.ConnectionResponse>");
        iHealthDataStore.connectInternal(str, a);
        this.b = ((ConnectionResponse) cVar.get(60L, TimeUnit.SECONDS)).getServiceVersion();
        this.e = 2;
    }

    public static final Thread a(s1 this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "phd-task-%d", Arrays.copyOf(new Object[]{Long.valueOf(this$0.f.getAndIncrement())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        newThread.setName(format);
        return newThread;
    }

    public final void a(final int i, final Function1 remoteTask, final Consumer errorHandler) {
        Intrinsics.checkNotNullParameter(remoteTask, "remoteTask");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.g.execute(new Runnable() { // from class: com.samsung.android.sdk.health.data.s1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                s1.a(s1.this, i, remoteTask, errorHandler);
            }
        });
    }

    public static final void a(s1 this$0, int i, Function1 remoteTask, Consumer errorHandler) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(remoteTask, "$remoteTask");
        Intrinsics.checkNotNullParameter(errorHandler, "$errorHandler");
        try {
            IHealthDataStore a = this$0.a();
            if (a != null) {
                this$0.a(this$0.b, i);
                remoteTask.invoke(a);
                return;
            }
            throw new RemoteException("Stub is null");
        } catch (RemoteException e) {
            errorHandler.accept(new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_CONNECTION_FAIL), "Remote exception occurs", e));
        } catch (Throwable th) {
            errorHandler.accept(th);
        }
    }

    public static final void a(s1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e = 1;
    }
}
