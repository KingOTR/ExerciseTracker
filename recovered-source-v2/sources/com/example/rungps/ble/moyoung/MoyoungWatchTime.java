package com.example.rungps.ble.moyoung;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;

/* compiled from: MoyoungWatchTime.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungWatchTime;", "", "<init>", "()V", "WATCH_TZ", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "Ljava/util/TimeZone;", "watchEpochSecToLocalMs", "", "watchEpochSec", "", "localNowToWatchEpochSec", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungWatchTime {
    public static final MoyoungWatchTime INSTANCE = new MoyoungWatchTime();
    private static final TimeZone WATCH_TZ = TimeZone.getTimeZone("GMT+8");
    public static final int $stable = 8;

    private MoyoungWatchTime() {
    }

    public final long watchEpochSecToLocalMs(int watchEpochSec) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(WATCH_TZ);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        long j = watchEpochSec * 1000;
        Date parse = simpleDateFormat2.parse(simpleDateFormat.format(new Date(j)));
        return parse != null ? parse.getTime() : j;
    }

    public final int localNowToWatchEpochSec() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        simpleDateFormat2.setTimeZone(WATCH_TZ);
        Date parse = simpleDateFormat2.parse(simpleDateFormat.format(new Date()));
        return (int) ((parse != null ? parse.getTime() : System.currentTimeMillis()) / 1000);
    }
}
