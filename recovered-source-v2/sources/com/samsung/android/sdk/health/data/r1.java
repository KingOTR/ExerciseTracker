package com.samsung.android.sdk.health.data;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.data.IHealthDataStore;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 implements ServiceConnection {
    public final Context a;
    public final Runnable b;
    public IHealthDataStore c;
    public IBinder d;
    public boolean e;
    public final IBinder.DeathRecipient f;
    public CountDownLatch g;

    public r1(Context context, Runnable onDisconnected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDisconnected, "onDisconnected");
        this.a = context;
        this.b = onDisconnected;
        this.f = new IBinder.DeathRecipient() { // from class: com.samsung.android.sdk.health.data.r1$$ExternalSyntheticLambda0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                r1.a(r1.this);
            }
        };
    }

    public final void b() {
        try {
            IBinder iBinder = this.d;
            if (iBinder != null) {
                iBinder.unlinkToDeath(this.f, 0);
            }
            this.c = null;
            this.d = null;
            this.a.unbindService(this);
            com.samsung.android.sdk.health.data.internal.m.a();
            com.samsung.android.sdk.health.data.internal.c.a();
            Log.i("[SHD]RemoteTaskExecutor", "Service unbinding");
        } catch (IllegalArgumentException unused) {
            Log.e("[SHD]RemoteTaskExecutor", "Service unbinding failure");
        } catch (NullPointerException unused2) {
            Log.e("[SHD]RemoteTaskExecutor", "Service unbinding failure");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        Log.i("[SHD]RemoteTaskExecutor", "Service connected");
        synchronized (this) {
            this.d = service;
            if (service != null) {
                try {
                    service.linkToDeath(this.f, 0);
                } catch (RemoteException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "death error";
                    }
                    Log.e("[SHD]RemoteTaskExecutor", message);
                }
            }
            this.c = IHealthDataStore.Stub.asInterface(service);
            CountDownLatch countDownLatch = this.g;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.countDown();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Log.i("[SHD]RemoteTaskExecutor", "Service disconnected");
        synchronized (this) {
            if (!this.e) {
                b();
                this.b.run();
            }
            this.e = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean a() {
        Intent intent = new Intent("com.samsung.android.sdk.health.data.BIND");
        intent.setPackage("com.sec.android.app.shealth");
        this.g = new CountDownLatch(1);
        if (this.a.bindService(intent, this, 65)) {
            CountDownLatch countDownLatch = this.g;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.await();
            return true;
        }
        Log.e("[SHD]RemoteTaskExecutor", "Service binding failure");
        b();
        return false;
    }

    public static final void a(r1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            this$0.e = true;
            this$0.b();
            this$0.b.run();
            Unit unit = Unit.INSTANCE;
        }
    }
}
