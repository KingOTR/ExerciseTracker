package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzajy.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzajy<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaif<MessageType, BuilderType> {
    private static Map<Class<?>, zzajy<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamn zzb = zzamn.zzc();

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajy<MessageType, BuilderType> implements zzale {
        protected zzajr<zze> zzc = zzajr.zzb();

        final zzajr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    protected static class zzc<T extends zzajy<T, ?>> extends zzaig<T> {
        public zzc(T t) {
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static class zzd<ContainingType extends zzalc, Type> extends zzajl<ContainingType, Type> {
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    static final class zze implements zzajt<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzalf zza(zzalf zzalfVar, zzalc zzalcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzall zza(zzall zzallVar, zzall zzallVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzamw zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final zzand zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    private final int zza() {
        return zzalr.zza().zza((zzalr) this).zzb(this);
    }

    protected abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static abstract class zza<MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaie<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        /* renamed from: zzb */
        public final /* synthetic */ zzaie clone() {
            return (zza) clone();
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (zzajy.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzaml(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final /* synthetic */ zzalc zzg() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaie
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzf();
            return zzaVar;
        }

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        protected final void zzh() {
            if (this.zza.zzu()) {
                return;
            }
            zzi();
        }

        protected void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalr.zza().zza((zzalr) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
        public final boolean zzj() {
            return zzajy.zza(this.zza, false);
        }
    }

    private final int zzb(zzalv<?> zzalvVar) {
        if (zzalvVar == null) {
            return zzalr.zza().zza((zzalr) this).zza(this);
        }
        return zzalvVar.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final int zzi() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final int zzl() {
        return zza((zzalv) null);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final int zza(zzalv zzalvVar) {
        if (zzu()) {
            int zzb2 = zzb((zzalv<?>) zzalvVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int zzb3 = zzb((zzalv<?>) zzalvVar);
        zzb(zzb3);
        return zzb3;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    protected final <MessageType extends zzajy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    private static <T extends zzajy<T, ?>> T zza(T t) throws zzakf {
        if (t == null || zza((zzajy) t, true)) {
            return t;
        }
        zzakf zza2 = new zzaml(t).zza();
        zza2.getClass();
        throw zza2;
    }

    static <T extends zzajy<?, ?>> T zza(Class<T> cls) {
        zzajy<?, ?> zzajyVar = zzc.get(cls);
        if (zzajyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajyVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzajyVar == null) {
            zzajyVar = (T) ((zzajy) zzamp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzajyVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzajyVar);
        }
        return (T) zzajyVar;
    }

    final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    protected static <T extends zzajy<T, ?>> T zza(T t, zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (T) zza(zzb(t, zzaipVar, zzajkVar));
    }

    protected static <T extends zzajy<T, ?>> T zza(T t, InputStream inputStream, zzajk zzajkVar) throws zzakf {
        zzajb zzajdVar;
        if (inputStream == null) {
            byte[] bArr = zzakb.zzb;
            zzajdVar = zzajb.zza(bArr, 0, bArr.length, false);
        } else {
            zzajdVar = new zzajd(inputStream);
        }
        return (T) zza(zza(t, zzajdVar, zzajkVar));
    }

    protected static <T extends zzajy<T, ?>> T zza(T t, byte[] bArr, zzajk zzajkVar) throws zzakf {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzajkVar));
    }

    private static <T extends zzajy<T, ?>> T zzb(T t, zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        zzajb zzc2 = zzaipVar.zzc();
        T t2 = (T) zza(t, zzc2, zzajkVar);
        zzc2.zzb(0);
        return t2;
    }

    private static <T extends zzajy<T, ?>> T zza(T t, zzajb zzajbVar, zzajk zzajkVar) throws zzakf {
        T t2 = (T) t.zzo();
        try {
            zzalv zza2 = zzalr.zza().zza((zzalr) t2);
            zza2.zza(t2, zzajf.zza(zzajbVar), zzajkVar);
            zza2.zzd(t2);
            return t2;
        } catch (zzakf e) {
            if (e.zzl()) {
                throw new zzakf(e);
            }
            throw e;
        } catch (zzaml e2) {
            zzakf zza3 = e2.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzakf) {
                throw ((zzakf) e3.getCause());
            }
            throw new zzakf(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzakf) {
                throw ((zzakf) e4.getCause());
            }
            throw e4;
        }
    }

    private static <T extends zzajy<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzajk zzajkVar) throws zzakf {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzo();
        try {
            zzalv zza2 = zzalr.zza().zza((zzalr) t2);
            zza2.zza(t2, bArr, 0, i2, new zzaik(zzajkVar));
            zza2.zzd(t2);
            return t2;
        } catch (zzakf e) {
            if (e.zzl()) {
                throw new zzakf(e);
            }
            throw e;
        } catch (zzaml e2) {
            zzakf zza3 = e2.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzakf) {
                throw ((zzakf) e3.getCause());
            }
            throw new zzakf(e3);
        } catch (IndexOutOfBoundsException unused) {
            zzakf zzj = zzakf.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    protected static <E> zzakc<E> zzp() {
        return zzalq.zzd();
    }

    protected static <E> zzakc<E> zza(zzakc<E> zzakcVar) {
        return zzakcVar.zza(zzakcVar.size() << 1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final /* synthetic */ zzalc zzg() {
        return (zzajy) zza(zzf.zzf, (Object) null, (Object) null);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static Object zza(zzalc zzalcVar, String str, Object[] objArr) {
        return new zzalt(zzalcVar, str, objArr);
    }

    public String toString() {
        return zzalh.zza(this, super.toString());
    }

    protected final void zzs() {
        zzalr.zza().zza((zzalr) this).zzd(this);
        zzt();
    }

    final void zzt() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected static <T extends zzajy<?, ?>> void zza(Class<T> cls, T t) {
        t.zzt();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaif
    final void zzb(int i) {
        if (i < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zza(zzajg zzajgVar) throws IOException {
        zzalr.zza().zza((zzalr) this).zza((zzalv) this, (zzanf) zzajj.zza(zzajgVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalr.zza().zza((zzalr) this).zzb(this, (zzajy) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzale
    public final boolean zzj() {
        return zza(this, true);
    }

    protected static final <T extends zzajy<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzalr.zza().zza((zzalr) t).zze(t);
        if (z) {
            t.zza(zzf.zzb, zze2 ? t : null, null);
        }
        return zze2;
    }

    final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
