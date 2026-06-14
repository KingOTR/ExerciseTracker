package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzki {
    private static final zzki zzb = new zzki(true);
    final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    public static int zza(zzkh zzkhVar, Object obj) {
        int zzd;
        int zzx;
        zznm zzd2 = zzkhVar.zzd();
        int zza = zzkhVar.zza();
        zzkhVar.zzg();
        int zzx2 = zzjg.zzx(zza << 3);
        if (zzd2 == zznm.GROUP) {
            zzlx zzlxVar = (zzlx) obj;
            byte[] bArr = zzla.zzb;
            if (zzlxVar instanceof zzih) {
                throw null;
            }
            zzx2 += zzx2;
        }
        zznn zznnVar = zznn.INT;
        int i = 4;
        switch (zzd2) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                i = 8;
                return zzx2 + i;
            case FLOAT:
                ((Float) obj).floatValue();
                return zzx2 + i;
            case INT64:
                i = zzjg.zzy(((Long) obj).longValue());
                return zzx2 + i;
            case UINT64:
                i = zzjg.zzy(((Long) obj).longValue());
                return zzx2 + i;
            case INT32:
                i = zzjg.zzy(((Integer) obj).intValue());
                return zzx2 + i;
            case FIXED64:
                ((Long) obj).longValue();
                i = 8;
                return zzx2 + i;
            case FIXED32:
                ((Integer) obj).intValue();
                return zzx2 + i;
            case BOOL:
                ((Boolean) obj).booleanValue();
                i = 1;
                return zzx2 + i;
            case STRING:
                if (!(obj instanceof zziv)) {
                    i = zzjg.zzw((String) obj);
                    return zzx2 + i;
                }
                zzd = ((zziv) obj).zzd();
                zzx = zzjg.zzx(zzd);
                i = zzx + zzd;
                return zzx2 + i;
            case GROUP:
                i = ((zzlx) obj).zzn();
                return zzx2 + i;
            case MESSAGE:
                if (!(obj instanceof zzlh)) {
                    i = zzjg.zzu((zzlx) obj);
                    return zzx2 + i;
                }
                zzd = ((zzlh) obj).zza();
                zzx = zzjg.zzx(zzd);
                i = zzx + zzd;
                return zzx2 + i;
            case BYTES:
                if (obj instanceof zziv) {
                    zzd = ((zziv) obj).zzd();
                    zzx = zzjg.zzx(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzx = zzjg.zzx(zzd);
                }
                i = zzx + zzd;
                return zzx2 + i;
            case UINT32:
                i = zzjg.zzx(((Integer) obj).intValue());
                return zzx2 + i;
            case ENUM:
                i = obj instanceof zzku ? zzjg.zzy(((zzku) obj).zza()) : zzjg.zzy(((Integer) obj).intValue());
                return zzx2 + i;
            case SFIXED32:
                ((Integer) obj).intValue();
                return zzx2 + i;
            case SFIXED64:
                ((Long) obj).longValue();
                i = 8;
                return zzx2 + i;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                i = zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
                return zzx2 + i;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                i = zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
                return zzx2 + i;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzki zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzmc) {
            return ((zzmc) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzlx zzj;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzlh;
        zzkhVar.zzg();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzkhVar, zzl(value));
            return;
        }
        Object zze = zze(zzkhVar);
        if (zze == null) {
            this.zza.put(zzkhVar, zzl(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (zze instanceof zzmc) {
            zzj = zzkhVar.zzc((zzmc) zze, (zzmc) value);
        } else {
            zzlw zzab = ((zzlx) zze).zzab();
            zzkhVar.zzb(zzab, (zzlx) value);
            zzj = zzab.zzj();
        }
        this.zza.put(zzkhVar, zzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzkh zzkhVar = (zzkh) entry.getKey();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return true;
        }
        zzkhVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzly) {
            return ((zzly) value).zzo();
        }
        if (value instanceof zzlh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int zzx;
        int zzx2;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return zza(zzkhVar, value);
        }
        zzkhVar.zzg();
        zzkhVar.zzf();
        if (value instanceof zzlh) {
            int zza = ((zzkh) entry.getKey()).zza();
            int zzx3 = zzjg.zzx(8);
            i = zzx3 + zzx3;
            zzx = zzjg.zzx(16) + zzjg.zzx(zza);
            int zzx4 = zzjg.zzx(24);
            int zza2 = ((zzlh) value).zza();
            zzx2 = zzx4 + zzjg.zzx(zza2) + zza2;
        } else {
            int zza3 = ((zzkh) entry.getKey()).zza();
            int zzx5 = zzjg.zzx(8);
            i = zzx5 + zzx5;
            zzx = zzjg.zzx(16) + zzjg.zzx(zza3);
            zzx2 = zzjg.zzx(24) + zzjg.zzu((zzlx) value);
        }
        return i + zzx + zzx2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzki) {
            return this.zza.equals(((zzki) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzo(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i += zzo((Map.Entry) it.next());
        }
        return i;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzki clone() {
        zzki zzkiVar = new zzki();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzkiVar.zzi((zzkh) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzkiVar.zzi((zzkh) entry.getKey(), entry.getValue());
        }
        zzkiVar.zzd = this.zzd;
        return zzkiVar;
    }

    public final Object zze(zzkh zzkhVar) {
        Object obj = this.zza.get(zzkhVar);
        if (!(obj instanceof zzlh)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        boolean z = this.zzd;
        zzmu zzmuVar = this.zza;
        return z ? new zzlg(zzmuVar.entrySet().iterator()) : zzmuVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof zzks) {
                ((zzks) zzg.getValue()).zzD();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzki zzkiVar) {
        for (int i = 0; i < zzkiVar.zza.zzb(); i++) {
            zzm(zzkiVar.zza.zzg(i));
        }
        Iterator it = zzkiVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzkh zzkhVar, Object obj) {
        boolean z;
        zzkhVar.zzg();
        zzkhVar.zzd();
        byte[] bArr = zzla.zzb;
        obj.getClass();
        zznm zznmVar = zznm.DOUBLE;
        zznn zznnVar = zznn.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zziv)) {
                    break;
                }
                if (obj instanceof zzlh) {
                    this.zzd = true;
                }
                this.zza.put(zzkhVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzlh) {
                }
                this.zza.put(zzkhVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzlx)) {
                    break;
                }
                if (obj instanceof zzlh) {
                }
                this.zza.put(zzkhVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkhVar.zza()), zzkhVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzki(boolean z) {
        zzg();
        zzg();
    }
}
