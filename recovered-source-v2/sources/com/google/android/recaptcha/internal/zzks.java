package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznc zzc = zznc.zzc();

    protected static zzkz zzA(zzkz zzkzVar) {
        int size = zzkzVar.size();
        return zzkzVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzC(zzlx zzlxVar, String str, Object[] objArr) {
        return new zzmi(zzlxVar, str, objArr);
    }

    protected static void zzF(Class cls, zzks zzksVar) {
        zzksVar.zzE();
        zzb.put(cls, zzksVar);
    }

    protected static final boolean zzH(zzks zzksVar, boolean z) {
        byte byteValue = ((Byte) zzksVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzmg.zza().zzb(zzksVar.getClass()).zzl(zzksVar);
        if (z) {
            zzksVar.zzh(2, true != zzl ? null : zzksVar, null);
        }
        return zzl;
    }

    private final int zzf(zzmk zzmkVar) {
        return zzmg.zza().zzb(getClass()).zza(this);
    }

    private static zzks zzg(zzks zzksVar) throws zzlc {
        if (zzksVar == null || zzksVar.zzo()) {
            return zzksVar;
        }
        throw new zzna(zzksVar).zza();
    }

    private static zzks zzi(zzks zzksVar, byte[] bArr, int i, int i2, zzkd zzkdVar) throws zzlc {
        if (i2 == 0) {
            return zzksVar;
        }
        zzks zzt = zzksVar.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzi(zzt, bArr, 0, i2, new zzik(zzkdVar));
            zzb2.zzf(zzt);
            return zzt;
        } catch (zzlc e) {
            if (e.zzk()) {
                throw new zzlc(e);
            }
            throw e;
        } catch (zzna e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzlc) {
                throw ((zzlc) e3.getCause());
            }
            throw new zzlc(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlc.zzi();
        }
    }

    public static zzkq zzr(zzlx zzlxVar, Object obj, zzlx zzlxVar2, zzkv zzkvVar, int i, zznm zznmVar, Class cls) {
        return new zzkq(zzlxVar, "", null, new zzkp(null, i, zznmVar, false, false), cls);
    }

    static zzks zzs(Class cls) {
        Map map = zzb;
        zzks zzksVar = (zzks) map.get(cls);
        if (zzksVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzksVar = (zzks) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzksVar == null) {
            zzksVar = (zzks) ((zzks) zzni.zze(cls)).zzh(6, null, null);
            if (zzksVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzksVar);
        }
        return zzksVar;
    }

    protected static zzks zzu(zzks zzksVar, InputStream inputStream) throws zzlc {
        zzjb zzizVar;
        int i = zzjb.zzd;
        if (inputStream == null) {
            byte[] bArr = zzla.zzb;
            int length = bArr.length;
            zzizVar = zzjb.zzH(bArr, 0, 0, false);
        } else {
            zzizVar = new zziz(inputStream, 4096, null);
        }
        zzkd zzkdVar = zzkd.zza;
        zzks zzt = zzksVar.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzh(zzt, zzjc.zzq(zzizVar), zzkdVar);
            zzb2.zzf(zzt);
            zzg(zzt);
            return zzt;
        } catch (zzlc e) {
            if (e.zzk()) {
                throw new zzlc(e);
            }
            throw e;
        } catch (zzna e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzlc) {
                throw ((zzlc) e3.getCause());
            }
            throw new zzlc(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzlc) {
                throw ((zzlc) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzks zzv(zzks zzksVar, byte[] bArr) throws zzlc {
        zzks zzi = zzi(zzksVar, bArr, 0, bArr.length, zzkd.zza);
        zzg(zzi);
        return zzi;
    }

    protected static zzkx zzw() {
        return zzkt.zzf();
    }

    protected static zzkx zzx(zzkx zzkxVar) {
        int size = zzkxVar.size();
        return zzkxVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzky zzy() {
        return zzlm.zzf();
    }

    protected static zzkz zzz() {
        return zzmh.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmg.zza().zzb(getClass()).zzk(this, (zzks) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzm();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzlz.zza(this, super.toString());
    }

    protected final void zzD() {
        zzmg.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    final void zzE() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzG(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzig
    final int zza(zzmk zzmkVar) {
        if (zzI()) {
            int zza = zzmkVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzmkVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzaa() {
        return (zzkm) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final /* synthetic */ zzlw zzab() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final /* synthetic */ zzlx zzac() {
        return (zzks) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final void zze(zzjg zzjgVar) throws IOException {
        zzmg.zza().zzb(getClass()).zzj(this, zzjh.zza(zzjgVar));
    }

    protected abstract Object zzh(int i, Object obj, Object obj2);

    final int zzm() {
        return zzmg.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final boolean zzo() {
        return zzH(this, Boolean.TRUE.booleanValue());
    }

    protected final zzkm zzp() {
        return (zzkm) zzh(5, null, null);
    }

    public final zzkm zzq() {
        zzkm zzkmVar = (zzkm) zzh(5, null, null);
        zzkmVar.zzg(this);
        return zzkmVar;
    }

    final zzks zzt() {
        return (zzks) zzh(4, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final int zzn() {
        if (zzI()) {
            int zzf = zzf(null);
            if (zzf >= 0) {
                return zzf;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzf);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            i = zzf(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
        }
        return i;
    }
}
