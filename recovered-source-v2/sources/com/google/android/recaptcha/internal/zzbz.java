package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzbz {
    public static final /* synthetic */ int zza = 0;
    private static final GoogleApiAvailabilityLight zzb = GoogleApiAvailabilityLight.getInstance();

    public static final int zza(Context context) {
        int isGooglePlayServicesAvailable = zzb.isGooglePlayServicesAvailable(context);
        return (isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9) ? 4 : 3;
    }
}
