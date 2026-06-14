package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzadr {
    public static Object zza(String str, Type type) throws zzabg {
        if (type == String.class) {
            try {
                zzafj zzafjVar = (zzafj) new zzafj().zza(str);
                if (zzafjVar.zzb()) {
                    return zzafjVar.zza();
                }
                throw new zzabg("No error message: " + str);
            } catch (Exception e) {
                throw new zzabg("Json conversion failed! " + e.getMessage(), e);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzadt) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e2) {
                throw new zzabg("Json conversion failed! " + e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            throw new zzabg("Instantiation of JsonResponse failed! " + String.valueOf(type), e3);
        }
    }

    private zzadr() {
    }
}
