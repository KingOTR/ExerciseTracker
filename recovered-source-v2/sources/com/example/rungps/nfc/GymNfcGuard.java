package com.example.rungps.nfc;

import android.app.KeyguardManager;
import android.content.Context;
import android.location.Location;
import android.os.PowerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymNfcGuard.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/nfc/GymNfcGuard;", "", "<init>", "()V", "isUnlockedAndAwake", "", "context", "Landroid/content/Context;", "distanceMeters", "", "lat1", "", "lon1", "lat2", "lon2", "isAtGym", "nearestGymName", "", "mayStartFromGymTag", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcGuard {
    public static final int $stable = 0;
    public static final GymNfcGuard INSTANCE = new GymNfcGuard();

    private GymNfcGuard() {
    }

    public final boolean isUnlockedAndAwake(Context context) {
        PowerManager powerManager;
        Intrinsics.checkNotNullParameter(context, "context");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        return (keyguardManager == null || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null || keyguardManager.isKeyguardLocked() || !powerManager.isInteractive()) ? false : true;
    }

    public final float distanceMeters(double lat1, double lon1, double lat2, double lon2) {
        float[] fArr = new float[1];
        Location.distanceBetween(lat1, lon1, lat2, lon2, fArr);
        return fArr[0];
    }

    public final boolean isAtGym(Context context) {
        Pair<Double, Double> lastLocation;
        Intrinsics.checkNotNullParameter(context, "context");
        List<GymLocation> all = GymLocationStore.INSTANCE.all(context);
        if (all.isEmpty() || (lastLocation = GymNfcConfig.INSTANCE.lastLocation(context)) == null) {
            return false;
        }
        double doubleValue = lastLocation.component1().doubleValue();
        double doubleValue2 = lastLocation.component2().doubleValue();
        List<GymLocation> list = all;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (GymLocation gymLocation : list) {
            if (INSTANCE.distanceMeters(doubleValue, doubleValue2, gymLocation.getLat(), gymLocation.getLon()) <= gymLocation.getRadiusM()) {
                return true;
            }
        }
        return false;
    }

    public final String nearestGymName(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        List<GymLocation> all = GymLocationStore.INSTANCE.all(context);
        Pair<Double, Double> lastLocation = GymNfcConfig.INSTANCE.lastLocation(context);
        if (lastLocation == null) {
            return null;
        }
        double doubleValue = lastLocation.component1().doubleValue();
        double doubleValue2 = lastLocation.component2().doubleValue();
        Iterator<T> it = all.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                GymLocation gymLocation = (GymLocation) next;
                float distanceMeters = INSTANCE.distanceMeters(doubleValue, doubleValue2, gymLocation.getLat(), gymLocation.getLon());
                do {
                    Object next2 = it.next();
                    GymLocation gymLocation2 = (GymLocation) next2;
                    float distanceMeters2 = INSTANCE.distanceMeters(doubleValue, doubleValue2, gymLocation2.getLat(), gymLocation2.getLon());
                    if (Float.compare(distanceMeters, distanceMeters2) > 0) {
                        distanceMeters = distanceMeters2;
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        GymLocation gymLocation3 = (GymLocation) next;
        if (gymLocation3 != null) {
            return gymLocation3.getName();
        }
        return null;
    }

    public final boolean mayStartFromGymTag(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isUnlockedAndAwake(context) && isAtGym(context);
    }
}
