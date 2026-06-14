package com.google.android.recaptcha.internal;

import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzma<T> implements zzmk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzni.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlx zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zznb zzm;
    private final zzke zzn;

    private zzma(int[] iArr, Object[] objArr, int i, int i2, zzlx zzlxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzlxVar instanceof zzks;
        boolean z2 = false;
        if (zzkeVar != null && zzkeVar.zzj(zzlxVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zznbVar;
        this.zzn = zzkeVar;
        this.zzg = zzlxVar;
    }

    private final Object zzA(Object obj, int i) {
        zzmk zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzmk zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmk zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmk zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzmj zzmjVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzni.zzs(obj, j, zzmjVar.zzs());
        } else if (this.zzi) {
            zzni.zzs(obj, j, zzmjVar.zzr());
        } else {
            zzni.zzs(obj, j, zzmjVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzni.zzq(obj, j, (1 << (zzr >>> 20)) | zzni.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzni.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return ((1 << (zzr >>> 20)) & zzni.zzc(obj, j)) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzni.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzni.zzb(obj, j2)) != 0;
            case 2:
                return zzni.zzd(obj, j2) != 0;
            case 3:
                return zzni.zzd(obj, j2) != 0;
            case 4:
                return zzni.zzc(obj, j2) != 0;
            case 5:
                return zzni.zzd(obj, j2) != 0;
            case 6:
                return zzni.zzc(obj, j2) != 0;
            case 7:
                return zzni.zzw(obj, j2);
            case 8:
                Object zzf = zzni.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zziv) {
                    return !zziv.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzni.zzf(obj, j2) != null;
            case 10:
                return !zziv.zzb.equals(zzni.zzf(obj, j2));
            case 11:
                return zzni.zzc(obj, j2) != 0;
            case 12:
                return zzni.zzc(obj, j2) != 0;
            case 13:
                return zzni.zzc(obj, j2) != 0;
            case 14:
                return zzni.zzd(obj, j2) != 0;
            case 15:
                return zzni.zzc(obj, j2) != 0;
            case 16:
                return zzni.zzd(obj, j2) != 0;
            case 17:
                return zzni.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzmk zzmkVar) {
        return zzmkVar.zzl(zzni.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzks) {
            return ((zzks) obj).zzI();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzni.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzni.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzno zznoVar) throws IOException {
        if (obj instanceof String) {
            zznoVar.zzG(i, (String) obj);
        } else {
            zznoVar.zzd(i, (zziv) obj);
        }
    }

    static zznc zzd(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzf = zznc.zzf();
        zzksVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzma zzm(Class cls, zzlu zzluVar, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        zzmi zzmiVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzC;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzluVar instanceof zzmi)) {
            throw null;
        }
        zzmi zzmiVar2 = (zzmi) zzluVar;
        String zzd = zzmiVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i34 = charAt16 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt15 = zzd.charAt(i33);
                if (charAt15 < 55296) {
                    break;
                }
                i34 |= (charAt15 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt16 = i34 | (charAt15 << i35);
            i33 = i31;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt17 = zzd.charAt(i33);
            if (charAt17 >= 55296) {
                int i37 = charAt17 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = zzd.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt17 = i37 | (charAt10 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt18 = zzd.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = zzd.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt18 = i40 | (charAt9 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt19 = zzd.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = zzd.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt19 = i43 | (charAt8 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt20 = zzd.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = zzd.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt20 = i46 | (charAt7 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = zzd.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt6 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = zzd.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt5 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt21 = zzd.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    charAt4 = zzd.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                charAt21 = i55 | (charAt4 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int charAt22 = zzd.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i7 = i57 + 1;
                    charAt3 = zzd.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i7;
                }
                charAt22 = i58 | (charAt3 << i59);
                i57 = i7;
            }
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzmiVar2.zze();
        Class<?> cls2 = zzmiVar2.zza().getClass();
        int i60 = i4 + charAt2;
        int i61 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = 0;
        int i63 = 0;
        int i64 = i4;
        int i65 = i60;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt23 = zzd.charAt(i33);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    charAt14 = zzd.charAt(i68);
                    if (charAt14 < c) {
                        break;
                    }
                    i67 |= (charAt14 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                charAt23 = i67 | (charAt14 << i69);
                i15 = i30;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                }
                charAt24 = i71 | (charAt13 << i73);
                i16 = i29;
            } else {
                i16 = i70;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt24 & 2048;
            int i76 = length;
            if (i74 >= 51) {
                int i77 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = 13;
                    int i79 = charAt25 & 8191;
                    int i80 = i77;
                    while (true) {
                        i28 = i80 + 1;
                        charAt12 = zzd.charAt(i80);
                        if (charAt12 < c2) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i78;
                        i78 += 13;
                        i80 = i28;
                        c2 = 55296;
                    }
                    charAt25 = i79 | (charAt12 << i78);
                    i26 = i28;
                } else {
                    i26 = i77;
                }
                int i81 = i26;
                int i82 = i74 - 51;
                i18 = i6;
                if (i82 == 9 || i82 == 17) {
                    i27 = i2 + 1;
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = zze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzmiVar2.zzc() == 1 || i75 != 0) {
                            i27 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = zze[i2];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt25 + charAt25;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i85] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzC2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i86] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    zzmiVar = zzmiVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzC3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt25 + charAt25;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzC2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzmiVar = zzmiVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzC3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzmiVar = zzmiVar2;
                    int i88 = i63 / 3;
                    objArr[i88 + i88 + 1] = zzC4.getType();
                } else {
                    if (i74 == 27) {
                        zzmiVar = zzmiVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzmiVar = zzmiVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzmiVar = zzmiVar2;
                        if (zzmiVar2.zzc() == 1 || i75 != 0) {
                            i25 = i2 + 2;
                            int i89 = i63 / 3;
                            objArr[i89 + i89 + 1] = zze[i87];
                            i87 = i25;
                        } else {
                            i75 = 0;
                        }
                    } else {
                        if (i74 == 50) {
                            int i90 = i2 + 2;
                            int i91 = i64 + 1;
                            iArr[i64] = i63;
                            int i92 = i63 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i87];
                            if (i75 != 0) {
                                i87 = i2 + 3;
                                objArr[i93 + 1] = zze[i90];
                                i64 = i91;
                            } else {
                                i87 = i90;
                                i64 = i91;
                                i75 = 0;
                            }
                        }
                        zzmiVar = zzmiVar2;
                    }
                    int i94 = i63 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i19 = 1048575;
                if ((charAt24 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i95 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i96 = charAt26 & 8191;
                        int i97 = 13;
                        while (true) {
                            i20 = i95 + 1;
                            charAt11 = zzd.charAt(i95);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i95 = i20;
                        }
                        charAt26 = i96 | (charAt11 << i97);
                    } else {
                        i20 = i95;
                    }
                    int i98 = i5 + i5 + (charAt26 / 32);
                    Object obj3 = zze[i98];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i98] = zzC;
                    }
                    i21 = charAt26 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
                i22 = i87;
                i23 = objectFieldOffset;
            }
            int i99 = i63 + 1;
            iArr2[i63] = charAt23;
            int i100 = i63 + 2;
            iArr2[i99] = i23 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i75 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20);
            i63 += 3;
            iArr2[i100] = (i21 << 20) | i19;
            i2 = i22;
            i33 = i20;
            length = i76;
            zzmiVar2 = zzmiVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzmi zzmiVar3 = zzmiVar2;
        return new zzma(iArr2, objArr, i3, i6, zzmiVar3.zza(), zzmiVar3.zzc(), false, iArr, i4, i60, zzmdVar, zzlkVar, zznbVar, zzkeVar, zzlsVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzni.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzni.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzni.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzni.zzf(obj, j)).longValue();
    }

    private final zzkw zzw(int i) {
        int i2 = i / 3;
        return (zzkw) this.zzd[i2 + i2 + 1];
    }

    private final zzmk zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzmk zzmkVar = (zzmk) objArr[i3];
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zzb2 = zzmg.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zznb zznbVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzni.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v126, types: [int] */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzx;
        int zzx2;
        int zzx3;
        int zzy;
        int zzx4;
        int zzx5;
        int zzd;
        int zzx6;
        ?? zzg;
        int size;
        int zzx7;
        int zzw;
        int zzw2;
        ?? r3;
        int zzv;
        ?? r1;
        ?? r0;
        int zze;
        int zzx8;
        int zzx9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int zzu = zzu(i4);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (zzt <= 17) {
                if (i9 != i6) {
                    r12 = i9 == i3 ? z : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i8 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i10 = zzu & i3;
            if (zzt >= zzkj.DOUBLE_LIST_PACKED.zza()) {
                zzkj.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(j2);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(j3);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(j4);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx4 = zzjg.zzx(i7 << 3);
                        r0 = zzx4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zziv) {
                            zzx5 = zzjg.zzx(i11);
                            zzd = ((zziv) object).zzd();
                            zzx6 = zzjg.zzx(zzd);
                            r0 = zzx5 + zzx6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzx3 = zzjg.zzx(i11);
                            zzy = zzjg.zzw((String) object);
                            r0 = zzx3 + zzy;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzmm.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zziv zzivVar = (zziv) unsafe.getObject(obj, j);
                        zzx5 = zzjg.zzx(i7 << 3);
                        zzd = zzivVar.zzd();
                        zzx6 = zzjg.zzx(zzd);
                        r0 = zzx5 + zzx6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzx(i12);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(j5);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzx((i13 >> 31) ^ (i13 + i13));
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy((j6 >> 63) ^ (j6 + j6));
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzjg.zzt(i7, (zzlx) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 18:
                    r0 = zzmm.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    r0 = zzmm.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzmm.zza;
                    if (list.size() != 0) {
                        zzg = zzmm.zzg(list) + (list.size() * zzjg.zzx(i7 << 3));
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzmm.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzx3 = zzmm.zzl(list2);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzmm.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzx3 = zzmm.zzf(list3);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    r0 = zzmm.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    r0 = zzmm.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzmm.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzjg.zzx(i7 << 3) + 1);
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i18 = zzmm.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzx10 = zzjg.zzx(i7 << 3) * size3;
                        if (r02 instanceof zzlj) {
                            zzlj zzljVar = (zzlj) r02;
                            zzg = zzx10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzc = zzljVar.zzc();
                                if (zzc instanceof zziv) {
                                    int zzd2 = ((zziv) zzc).zzd();
                                    zzw2 = zzg + zzjg.zzx(zzd2) + zzd2;
                                } else {
                                    zzw2 = zzg + zzjg.zzw((String) zzc);
                                }
                                zzg = zzw2;
                            }
                        } else {
                            zzg = zzx10;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zziv) {
                                    int zzd3 = ((zziv) obj2).zzd();
                                    zzw = zzg + zzjg.zzx(zzd3) + zzd3;
                                } else {
                                    zzw = zzg + zzjg.zzw((String) obj2);
                                }
                                zzg = zzw;
                            }
                        }
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzmk zzx11 = zzx(i4);
                    int i19 = zzmm.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzjg.zzx(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzli) {
                                int zza2 = ((zzli) obj3).zza();
                                zzv = (r3 == true ? 1 : 0) + zzjg.zzx(zza2) + zza2;
                            } else {
                                zzv = (r3 == true ? 1 : 0) + zzjg.zzv((zzlx) obj3, zzx11);
                            }
                            r3 = zzv;
                        }
                    }
                    i5 += r3;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i20 = zzmm.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzjg.zzx(i7 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzd4 = ((zziv) r04.get(r2)).zzd();
                            r1 += zzjg.zzx(zzd4) + zzd4;
                        }
                    }
                    i5 += r1;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zzmm.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzx3 = zzmm.zzk(list5);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i22 = zzmm.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzx3 = zzmm.zza(list6);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 31:
                    r0 = zzmm.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    r0 = zzmm.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzmm.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzx3 = zzmm.zzi(list7);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzmm.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzx3 = zzmm.zzj(list8);
                        zzx7 = zzjg.zzx(i7 << 3);
                        zzy = size * zzx7;
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    zze = zzmm.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 36:
                    zze = zzmm.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 37:
                    zze = zzmm.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 38:
                    zze = zzmm.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 39:
                    zze = zzmm.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 40:
                    zze = zzmm.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 41:
                    zze = zzmm.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzmm.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 43:
                    zze = zzmm.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 44:
                    zze = zzmm.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 45:
                    zze = zzmm.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 46:
                    zze = zzmm.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 47:
                    zze = zzmm.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 48:
                    zze = zzmm.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzx8 = zzjg.zzx(i7 << 3);
                        zzx9 = zzjg.zzx(zze);
                        r1 = zzx8 + zzx9 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzmk zzx12 = zzx(i4);
                    int i26 = zzmm.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzt2 = zzjg.zzt(i7, (zzlx) r05.get(r34), zzx12);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzt2;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzlr zzlrVar = (zzlr) unsafe.getObject(obj, j);
                    if (zzlrVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzlrVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 51:
                    if (zzR(obj, i7, i4)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i7, i4)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i7, i4)) {
                        long zzv2 = zzv(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(zzv2);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 54:
                    if (zzR(obj, i7, i4)) {
                        long zzv3 = zzv(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(zzv3);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i7, i4)) {
                        long zzp = zzp(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(zzp);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i7, i4)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i7, i4)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i7, i4)) {
                        zzx4 = zzjg.zzx(i7 << 3);
                        r0 = zzx4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i7, i4)) {
                        int i27 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zziv) {
                            zzx5 = zzjg.zzx(i27);
                            zzd = ((zziv) object2).zzd();
                            zzx6 = zzjg.zzx(zzd);
                            r0 = zzx5 + zzx6 + zzd;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzx3 = zzjg.zzx(i27);
                            zzy = zzjg.zzw((String) object2);
                            r0 = zzx3 + zzy;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 60:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzmm.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i7, i4)) {
                        zziv zzivVar2 = (zziv) unsafe.getObject(obj, j);
                        zzx5 = zzjg.zzx(i7 << 3);
                        zzd = zzivVar2.zzd();
                        zzx6 = zzjg.zzx(zzd);
                        r0 = zzx5 + zzx6 + zzd;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i7, i4)) {
                        int zzp2 = zzp(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzx(zzp2);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i7, i4)) {
                        long zzp3 = zzp(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy(zzp3);
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i7, i4)) {
                        zzx2 = zzjg.zzx(i7 << 3);
                        r0 = zzx2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i7, i4)) {
                        zzx = zzjg.zzx(i7 << 3);
                        r0 = zzx + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i7, i4)) {
                        int zzp4 = zzp(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzx((zzp4 >> 31) ^ (zzp4 + zzp4));
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzR(obj, i7, i4)) {
                        long zzv4 = zzv(obj, j);
                        zzx3 = zzjg.zzx(i7 << 3);
                        zzy = zzjg.zzy((zzv4 >> 63) ^ (zzv4 + zzv4));
                        r0 = zzx3 + zzy;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzjg.zzt(i7, (zzlx) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
            }
        }
        zznb zznbVar = this.zzm;
        int zza3 = i5 + zznbVar.zza(zznbVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        zzki zzb2 = this.zzn.zzb(obj);
        int i28 = 0;
        for (int i29 = 0; i29 < zzb2.zza.zzb(); i29++) {
            Map.Entry zzg2 = zzb2.zza.zzg(i29);
            i28 += zzki.zza((zzkh) zzg2.getKey(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzb2.zza.zzc()) {
            i28 += zzki.zza((zzkh) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i28;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzt) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzni.zza(obj, j));
                    byte[] bArr = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzni.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr2 = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr3 = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr4 = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzla.zza(zzni.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzni.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr5 = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr6 = zzla.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzni.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzla.zza(zzS(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzla.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0c6b, code lost:
    
        if (r5 == 1048575) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c6d, code lost:
    
        r30.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c73, code lost:
    
        r10 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c78, code lost:
    
        if (r10 >= r12.zzl) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c7a, code lost:
    
        zzy(r33, r12.zzj[r10], null, r12.zzm, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c8d, code lost:
    
        if (r9 != 0) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0c91, code lost:
    
        if (r6 != r36) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0c98, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0c9f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0c9b, code lost:
    
        if (r6 > r36) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0c9d, code lost:
    
        if (r8 != r9) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0ca4, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x08ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzik zzikVar) throws IOException {
        zzma<T> zzmaVar;
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int zzq;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzik zzikVar2;
        int i13;
        int i14;
        boolean z;
        int i15;
        int i16;
        Object obj2;
        int i17;
        zzma<T> zzmaVar2;
        int i18;
        int i19;
        boolean z2;
        int i20;
        zzma<T> zzmaVar3;
        int i21;
        int zzl;
        zzma<T> zzmaVar4;
        Unsafe unsafe2;
        int i22;
        int i23;
        int i24;
        zzma<T> zzmaVar5;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int zza2;
        long j;
        zzkz zzkzVar;
        int i32;
        int i33;
        int i34;
        int i35;
        zzma<T> zzmaVar6;
        int i36;
        int i37;
        int i38;
        int i39;
        zzik zzikVar3;
        zzma<T> zzmaVar7;
        int zzf;
        Object obj3;
        zzma<T> zzmaVar8;
        int i40;
        int zzk;
        zzma<T> zzmaVar9 = this;
        Object obj4 = obj;
        int i41 = i2;
        int i42 = i3;
        zzik zzikVar4 = zzikVar;
        zzD(obj);
        Unsafe unsafe3 = zzb;
        int i43 = -1;
        int i44 = i;
        int i45 = -1;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 1048575;
        while (true) {
            if (i44 < i41) {
                int i50 = i44 + 1;
                int i51 = bArr[i44];
                if (i51 < 0) {
                    int zzj = zzil.zzj(i51, bArr, i50, zzikVar4);
                    i7 = zzikVar4.zza;
                    i50 = zzj;
                } else {
                    i7 = i51;
                }
                int i52 = i7 >>> 3;
                if (i52 > i45) {
                    zzq = (i52 < zzmaVar9.zze || i52 > zzmaVar9.zzf) ? i43 : zzmaVar9.zzs(i52, i46 / 3);
                } else {
                    zzq = zzmaVar9.zzq(i52);
                }
                int i53 = zzq;
                Object obj5 = null;
                if (i53 == i43) {
                    i8 = i50;
                    i9 = i48;
                    i10 = i49;
                    i11 = i7;
                    i12 = i43;
                    unsafe = unsafe3;
                    zzikVar2 = zzikVar4;
                    i4 = i42;
                    i13 = i52;
                    zzmaVar = zzmaVar9;
                    i14 = 0;
                    z = true;
                } else {
                    int i54 = i7 & 7;
                    int[] iArr = zzmaVar9.zzc;
                    int i55 = iArr[i53 + 1];
                    int zzt = zzt(i55);
                    long j2 = i55 & 1048575;
                    int i56 = i7;
                    if (zzt <= 17) {
                        int i57 = iArr[i53 + 2];
                        int i58 = 1 << (i57 >>> 20);
                        int i59 = i57 & 1048575;
                        if (i59 != i49) {
                            if (i49 != 1048575) {
                                unsafe3.putInt(obj4, i49, i48);
                            }
                            i48 = i59 == 1048575 ? 0 : unsafe3.getInt(obj4, i59);
                            i10 = i59;
                        } else {
                            i10 = i49;
                        }
                        switch (zzt) {
                            case 0:
                                zzmaVar2 = this;
                                i18 = i52;
                                i19 = i56;
                                z2 = true;
                                i14 = i53;
                                if (i54 != 1) {
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i44 = i50 + 8;
                                    i48 |= i58;
                                    zzni.zzo(obj4, j2, Double.longBitsToDouble(zzil.zzp(bArr, i50)));
                                    i41 = i2;
                                    i42 = i3;
                                    i45 = i18;
                                    i47 = i19;
                                    i49 = i10;
                                    i43 = -1;
                                    int i60 = i14;
                                    zzmaVar9 = zzmaVar2;
                                    i46 = i60;
                                    break;
                                }
                            case 1:
                                zzmaVar2 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 5) {
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i44 = i50 + 4;
                                    i48 |= i58;
                                    zzni.zzp(obj4, j2, Float.intBitsToFloat(zzil.zzb(bArr, i50)));
                                    i41 = i2;
                                    i42 = i3;
                                    i45 = i18;
                                    i47 = i19;
                                    i49 = i10;
                                    i43 = -1;
                                    int i602 = i14;
                                    zzmaVar9 = zzmaVar2;
                                    i46 = i602;
                                    break;
                                }
                            case 2:
                            case 3:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 0) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i21 = i58 | i48;
                                    zzl = zzil.zzl(bArr, i50, zzikVar4);
                                    zzmaVar4 = zzmaVar3;
                                    unsafe3.putLong(obj, j2, zzikVar4.zzb);
                                    i41 = i2;
                                    i46 = i14;
                                    i45 = i18;
                                    i48 = i21;
                                    i44 = zzl;
                                    zzmaVar9 = zzmaVar4;
                                    i47 = i19;
                                    i49 = i10;
                                    i43 = -1;
                                    i42 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 0) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i48 |= i58;
                                    i44 = zzil.zzi(bArr, i50, zzikVar4);
                                    unsafe3.putInt(obj4, j2, zzikVar4.zza);
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i19;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 1) {
                                    z2 = true;
                                    i20 = i48;
                                    zzmaVar2 = this;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    zzl = i50 + 8;
                                    i21 = i58 | i48;
                                    zzmaVar4 = this;
                                    unsafe3.putLong(obj, j2, zzil.zzp(bArr, i50));
                                    i41 = i2;
                                    i46 = i14;
                                    i45 = i18;
                                    i48 = i21;
                                    i44 = zzl;
                                    zzmaVar9 = zzmaVar4;
                                    i47 = i19;
                                    i49 = i10;
                                    i43 = -1;
                                    i42 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 5) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i44 = i50 + 4;
                                    i48 |= i58;
                                    unsafe3.putInt(obj4, j2, zzil.zzb(bArr, i50));
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i19;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 7:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 0) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i48 |= i58;
                                    i44 = zzil.zzl(bArr, i50, zzikVar4);
                                    zzni.zzm(obj4, j2, zzikVar4.zzb != 0);
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i19;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 8:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 2) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    if (zzM(i55)) {
                                        i44 = zzil.zzi(bArr, i50, zzikVar4);
                                        int i61 = zzikVar4.zza;
                                        if (i61 < 0) {
                                            throw zzlc.zzf();
                                        }
                                        int i62 = i48 | i58;
                                        if (i61 == 0) {
                                            zzikVar4.zzc = "";
                                        } else {
                                            zzikVar4.zzc = zznl.zzd(bArr, i44, i61);
                                            i44 += i61;
                                        }
                                        i48 = i62;
                                    } else {
                                        i48 |= i58;
                                        i44 = zzil.zzg(bArr, i50, zzikVar4);
                                    }
                                    unsafe3.putObject(obj4, j2, zzikVar4.zzc);
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i19;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 9:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 2) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    Object zzA = zzmaVar3.zzA(obj4, i14);
                                    zzmaVar4 = zzmaVar3;
                                    i44 = zzil.zzn(zzA, zzmaVar3.zzx(i14), bArr, i50, i2, zzikVar);
                                    zzmaVar4.zzJ(obj4, i14, zzA);
                                    i41 = i2;
                                    i46 = i14;
                                    i45 = i18;
                                    i48 = i58 | i48;
                                    zzmaVar9 = zzmaVar4;
                                    i47 = i19;
                                    i49 = i10;
                                    i43 = -1;
                                    i42 = i3;
                                    break;
                                }
                            case 10:
                                zzmaVar3 = this;
                                i18 = i52;
                                i19 = i56;
                                i14 = i53;
                                if (i54 != 2) {
                                    i20 = i48;
                                    zzmaVar2 = zzmaVar3;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i48 |= i58;
                                    i44 = zzil.zza(bArr, i50, zzikVar4);
                                    unsafe3.putObject(obj4, j2, zzikVar4.zzc);
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i19;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 12:
                                i14 = i53;
                                i18 = i52;
                                if (i54 != 0) {
                                    zzmaVar2 = this;
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i44 = zzil.zzi(bArr, i50, zzikVar4);
                                    int i63 = zzikVar4.zza;
                                    zzmaVar3 = this;
                                    zzkw zzw = zzmaVar3.zzw(i14);
                                    if ((i55 & Integer.MIN_VALUE) == 0 || zzw == null || zzw.zza(i63)) {
                                        i22 = i56;
                                        i48 |= i58;
                                        unsafe3.putInt(obj4, j2, i63);
                                    } else {
                                        i22 = i56;
                                        zzd(obj).zzj(i22, Long.valueOf(i63));
                                    }
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i22;
                                    i43 = -1;
                                    zzmaVar9 = zzmaVar3;
                                    i49 = i10;
                                    break;
                                }
                            case 15:
                                i14 = i53;
                                i18 = i52;
                                if (i54 != 0) {
                                    zzmaVar2 = this;
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    z2 = true;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    i48 |= i58;
                                    i44 = zzil.zzi(bArr, i50, zzikVar4);
                                    unsafe3.putInt(obj4, j2, zzjb.zzF(zzikVar4.zza));
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i14;
                                    i45 = i18;
                                    i47 = i56;
                                    i49 = i10;
                                    i43 = -1;
                                    zzmaVar9 = this;
                                    break;
                                }
                            case 16:
                                if (i54 != 0) {
                                    i14 = i53;
                                    zzmaVar2 = this;
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    i23 = i52;
                                    z2 = true;
                                    i12 = -1;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    int i64 = i48 | i58;
                                    int zzl2 = zzil.zzl(bArr, i50, zzikVar4);
                                    unsafe3.putLong(obj, j2, zzjb.zzG(zzikVar4.zzb));
                                    i41 = i2;
                                    i42 = i3;
                                    i46 = i53;
                                    i48 = i64;
                                    i44 = zzl2;
                                    i45 = i52;
                                    i47 = i56;
                                    i49 = i10;
                                    i43 = -1;
                                    zzmaVar9 = this;
                                    break;
                                }
                            default:
                                zzmaVar2 = this;
                                i18 = i52;
                                i19 = i56;
                                z2 = true;
                                i14 = i53;
                                if (i54 != 3) {
                                    i20 = i48;
                                    unsafe2 = unsafe3;
                                    i56 = i19;
                                    i12 = -1;
                                    i23 = i18;
                                    i4 = i3;
                                    i9 = i20;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i13 = i23;
                                    zzikVar2 = zzikVar4;
                                    i11 = i56;
                                    zzmaVar = zzmaVar2;
                                    i8 = i50;
                                    break;
                                } else {
                                    Object zzA2 = zzmaVar2.zzA(obj4, i14);
                                    i45 = i18;
                                    int zzm = zzil.zzm(zzA2, zzmaVar2.zzx(i14), bArr, i50, i2, (i18 << 3) | 4, zzikVar);
                                    zzmaVar2.zzJ(obj4, i14, zzA2);
                                    i42 = i3;
                                    zzikVar4 = zzikVar4;
                                    i41 = i2;
                                    unsafe3 = unsafe3;
                                    i44 = zzm;
                                    i43 = -1;
                                    i47 = i19;
                                    i49 = i10;
                                    i48 |= i58;
                                    int i6022 = i14;
                                    zzmaVar9 = zzmaVar2;
                                    i46 = i6022;
                                    break;
                                }
                        }
                    } else {
                        i9 = i48;
                        i10 = i49;
                        Unsafe unsafe4 = unsafe3;
                        i12 = -1;
                        zzma<T> zzmaVar10 = zzmaVar9;
                        i14 = i53;
                        zzmaVar2 = zzmaVar10;
                        if (zzt != 27) {
                            if (zzt > 49) {
                                unsafe = unsafe4;
                                i24 = i56;
                                zzmaVar5 = this;
                                zzik zzikVar5 = zzikVar4;
                                i25 = i50;
                                i26 = i52;
                                zzikVar2 = zzikVar5;
                                if (zzt != 50) {
                                    obj4 = obj;
                                    Unsafe unsafe5 = zzb;
                                    long j3 = iArr[i14 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 1) {
                                                i29 = i27 + 8;
                                                unsafe5.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr, i27))));
                                                unsafe5.putInt(obj4, j3, i13);
                                                if (i29 != i27) {
                                                    i4 = i3;
                                                    i8 = i29;
                                                    i14 = i28;
                                                    break;
                                                } else {
                                                    i41 = i2;
                                                    i42 = i3;
                                                    i45 = i13;
                                                    i47 = i11;
                                                    i44 = i29;
                                                    zzmaVar9 = zzmaVar;
                                                    i43 = -1;
                                                    i48 = i9;
                                                    i46 = i28;
                                                    i49 = i10;
                                                    unsafe3 = unsafe;
                                                    zzikVar4 = zzikVar2;
                                                    break;
                                                }
                                            }
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                        case 52:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 5) {
                                                i29 = i27 + 4;
                                                unsafe5.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i27))));
                                                unsafe5.putInt(obj4, j3, i13);
                                                if (i29 != i27) {
                                                }
                                            }
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 0) {
                                                i29 = zzil.zzl(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, Long.valueOf(zzikVar2.zzb));
                                                unsafe5.putInt(obj4, j3, i13);
                                                if (i29 != i27) {
                                                }
                                            }
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 0) {
                                                i29 = zzil.zzi(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, Integer.valueOf(zzikVar2.zza));
                                                unsafe5.putInt(obj4, j3, i13);
                                                if (i29 != i27) {
                                                }
                                            }
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 1) {
                                                i29 = i27 + 8;
                                                unsafe5.putObject(obj4, j2, Long.valueOf(zzil.zzp(bArr, i27)));
                                                unsafe5.putInt(obj4, j3, i13);
                                                if (i29 != i27) {
                                                }
                                            }
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i27 = i25;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 5) {
                                                i30 = i27 + 4;
                                                unsafe5.putObject(obj4, j2, Integer.valueOf(zzil.zzb(bArr, i27)));
                                                unsafe5.putInt(obj4, j3, i13);
                                                i29 = i30;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 58:
                                            i27 = i25;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 0) {
                                                i30 = zzil.zzl(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, Boolean.valueOf(zzikVar2.zzb != 0));
                                                unsafe5.putInt(obj4, j3, i13);
                                                i29 = i30;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 59:
                                            i27 = i25;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            if (i54 == 2) {
                                                i30 = zzil.zzi(bArr, i27, zzikVar2);
                                                int i65 = zzikVar2.zza;
                                                if (i65 == 0) {
                                                    unsafe5.putObject(obj4, j2, "");
                                                } else {
                                                    int i66 = i30 + i65;
                                                    if ((i55 & 536870912) != 0 && !zznl.zze(bArr, i30, i66)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    unsafe5.putObject(obj4, j2, new String(bArr, i30, i65, zzla.zza));
                                                    i30 = i66;
                                                }
                                                unsafe5.putInt(obj4, j3, i13);
                                                i29 = i30;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 60:
                                            i27 = i25;
                                            i31 = i26;
                                            if (i54 == 2) {
                                                Object zzB = zzmaVar5.zzB(obj4, i31, i14);
                                                zzmaVar = zzmaVar5;
                                                i30 = zzil.zzn(zzB, zzmaVar5.zzx(i14), bArr, i27, i2, zzikVar);
                                                zzmaVar.zzK(obj4, i31, i14, zzB);
                                                i28 = i14;
                                                i13 = i31;
                                                i11 = i24;
                                                i29 = i30;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            } else {
                                                zzmaVar = zzmaVar5;
                                                i11 = i24;
                                                i28 = i14;
                                                i13 = i31;
                                                z = true;
                                                i29 = i27;
                                                if (i29 != i27) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i27 = i25;
                                            i31 = i26;
                                            if (i54 == 2) {
                                                zza2 = zzil.zza(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, zzikVar2.zzc);
                                                unsafe5.putInt(obj4, j3, i31);
                                                zzmaVar = zzmaVar5;
                                                i28 = i14;
                                                i29 = zza2;
                                                i11 = i24;
                                                i13 = i31;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            zzmaVar = zzmaVar5;
                                            i28 = i14;
                                            i11 = i24;
                                            i13 = i31;
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 63:
                                            i27 = i25;
                                            i31 = i26;
                                            if (i54 == 0) {
                                                zza2 = zzil.zzi(bArr, i27, zzikVar2);
                                                int i67 = zzikVar2.zza;
                                                zzkw zzw2 = zzmaVar5.zzw(i14);
                                                if (zzw2 == null || zzw2.zza(i67)) {
                                                    unsafe5.putObject(obj4, j2, Integer.valueOf(i67));
                                                    unsafe5.putInt(obj4, j3, i31);
                                                } else {
                                                    zzd(obj).zzj(i24, Long.valueOf(i67));
                                                }
                                                zzmaVar = zzmaVar5;
                                                i28 = i14;
                                                i29 = zza2;
                                                i11 = i24;
                                                i13 = i31;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            zzmaVar = zzmaVar5;
                                            i28 = i14;
                                            i11 = i24;
                                            i13 = i31;
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case 66:
                                            i27 = i25;
                                            i31 = i26;
                                            if (i54 == 0) {
                                                zza2 = zzil.zzi(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, Integer.valueOf(zzjb.zzF(zzikVar2.zza)));
                                                unsafe5.putInt(obj4, j3, i31);
                                                zzmaVar = zzmaVar5;
                                                i28 = i14;
                                                i29 = zza2;
                                                i11 = i24;
                                                i13 = i31;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            zzmaVar = zzmaVar5;
                                            i28 = i14;
                                            i11 = i24;
                                            i13 = i31;
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                                            i27 = i25;
                                            i31 = i26;
                                            if (i54 == 0) {
                                                zza2 = zzil.zzl(bArr, i27, zzikVar2);
                                                unsafe5.putObject(obj4, j2, Long.valueOf(zzjb.zzG(zzikVar2.zzb)));
                                                unsafe5.putInt(obj4, j3, i31);
                                                zzmaVar = zzmaVar5;
                                                i28 = i14;
                                                i29 = zza2;
                                                i11 = i24;
                                                i13 = i31;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            zzmaVar = zzmaVar5;
                                            i28 = i14;
                                            i11 = i24;
                                            i13 = i31;
                                            z = true;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                        case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                                            if (i54 == 3) {
                                                i31 = i26;
                                                Object zzB2 = zzmaVar5.zzB(obj4, i31, i14);
                                                int zzm2 = zzil.zzm(zzB2, zzmaVar5.zzx(i14), bArr, i25, i2, (i24 & (-8)) | 4, zzikVar);
                                                zzmaVar5.zzK(obj4, i31, i14, zzB2);
                                                i27 = i25;
                                                zzmaVar = zzmaVar5;
                                                i28 = i14;
                                                i29 = zzm2;
                                                zzikVar2 = zzikVar2;
                                                i11 = i24;
                                                i13 = i31;
                                                z = true;
                                                if (i29 != i27) {
                                                }
                                            }
                                            break;
                                        default:
                                            i27 = i25;
                                            z = true;
                                            zzmaVar = zzmaVar5;
                                            i11 = i24;
                                            i13 = i26;
                                            i28 = i14;
                                            i29 = i27;
                                            if (i29 != i27) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i54 == 2) {
                                        Unsafe unsafe6 = zzb;
                                        Object zzz = zzmaVar5.zzz(i14);
                                        Object object = unsafe6.getObject(obj, j2);
                                        if (zzls.zza(object)) {
                                            zzlr zzb2 = zzlr.zza().zzb();
                                            zzls.zzb(zzb2, object);
                                            unsafe6.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    obj4 = obj;
                                }
                            } else {
                                long j4 = i55;
                                Unsafe unsafe7 = zzb;
                                zzkz zzkzVar2 = (zzkz) unsafe7.getObject(obj4, j2);
                                if (zzkzVar2.zzc()) {
                                    j = j4;
                                    zzkzVar = zzkzVar2;
                                } else {
                                    int size = zzkzVar2.size();
                                    j = j4;
                                    zzkz zzd = zzkzVar2.zzd(size != 0 ? size + size : 10);
                                    unsafe7.putObject(obj4, j2, zzd);
                                    zzkzVar = zzd;
                                }
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i32 = i50;
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        if (i54 == 2) {
                                            zzjx zzjxVar = (zzjx) zzkzVar;
                                            i44 = zzil.zzi(bArr, i32, zzikVar2);
                                            int i68 = zzikVar2.zza + i44;
                                            while (i44 < i68) {
                                                zzjxVar.zzf(Double.longBitsToDouble(zzil.zzp(bArr, i44)));
                                                i44 += 8;
                                            }
                                            if (i44 != i68) {
                                                throw zzlc.zzi();
                                            }
                                            i37 = i32;
                                            if (i44 == i37) {
                                                obj4 = obj;
                                                i8 = i44;
                                                i11 = i35;
                                                zzmaVar = zzmaVar6;
                                                i13 = i34;
                                                z = true;
                                                i4 = i3;
                                                break;
                                            } else {
                                                i42 = i3;
                                                i46 = i14;
                                                zzikVar4 = zzikVar2;
                                                i47 = i35;
                                                zzmaVar9 = zzmaVar6;
                                                i45 = i34;
                                                i43 = -1;
                                                i48 = i9;
                                                i49 = i10;
                                                unsafe3 = unsafe;
                                                i41 = i33;
                                                obj4 = obj;
                                                break;
                                            }
                                        } else {
                                            if (i54 == 1) {
                                                i36 = i32 + 8;
                                                zzjx zzjxVar2 = (zzjx) zzkzVar;
                                                zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr, i32)));
                                                while (i36 < i33) {
                                                    int zzi = zzil.zzi(bArr, i36, zzikVar2);
                                                    if (i35 == zzikVar2.zza) {
                                                        zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr, zzi)));
                                                        i36 = zzi + 8;
                                                    } else {
                                                        i44 = i36;
                                                        i37 = i32;
                                                        if (i44 == i37) {
                                                        }
                                                    }
                                                }
                                                i44 = i36;
                                                i37 = i32;
                                                if (i44 == i37) {
                                                }
                                            }
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i32 = i50;
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        if (i54 == 2) {
                                            zzkk zzkkVar = (zzkk) zzkzVar;
                                            i44 = zzil.zzi(bArr, i32, zzikVar2);
                                            int i69 = zzikVar2.zza + i44;
                                            while (i44 < i69) {
                                                zzkkVar.zzf(Float.intBitsToFloat(zzil.zzb(bArr, i44)));
                                                i44 += 4;
                                            }
                                            if (i44 != i69) {
                                                throw zzlc.zzi();
                                            }
                                            i37 = i32;
                                            if (i44 == i37) {
                                            }
                                        } else {
                                            if (i54 == 5) {
                                                i36 = i32 + 4;
                                                zzkk zzkkVar2 = (zzkk) zzkzVar;
                                                zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr, i32)));
                                                while (i36 < i33) {
                                                    int zzi2 = zzil.zzi(bArr, i36, zzikVar2);
                                                    if (i35 == zzikVar2.zza) {
                                                        zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr, zzi2)));
                                                        i36 = zzi2 + 4;
                                                    } else {
                                                        i44 = i36;
                                                        i37 = i32;
                                                        if (i44 == i37) {
                                                        }
                                                    }
                                                }
                                                i44 = i36;
                                                i37 = i32;
                                                if (i44 == i37) {
                                                }
                                            }
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i32 = i50;
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        if (i54 == 2) {
                                            zzlm zzlmVar = (zzlm) zzkzVar;
                                            i44 = zzil.zzi(bArr, i32, zzikVar2);
                                            int i70 = zzikVar2.zza + i44;
                                            while (i44 < i70) {
                                                i44 = zzil.zzl(bArr, i44, zzikVar2);
                                                zzlmVar.zzg(zzikVar2.zzb);
                                            }
                                            if (i44 != i70) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                zzlm zzlmVar2 = (zzlm) zzkzVar;
                                                i44 = zzil.zzl(bArr, i32, zzikVar2);
                                                zzlmVar2.zzg(zzikVar2.zzb);
                                                while (i44 < i33) {
                                                    int zzi3 = zzil.zzi(bArr, i44, zzikVar2);
                                                    if (i35 == zzikVar2.zza) {
                                                        i44 = zzil.zzl(bArr, zzi3, zzikVar2);
                                                        zzlmVar2.zzg(zzikVar2.zzb);
                                                    }
                                                }
                                            }
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i37 = i32;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i32 = i50;
                                        i33 = i2;
                                        i38 = i52;
                                        i39 = i56;
                                        zzikVar3 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar7 = this;
                                        if (i54 == 2) {
                                            zzf = zzil.zzf(bArr, i32, zzkzVar, zzikVar3);
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = zzf;
                                            zzikVar2 = zzikVar3;
                                            if (i44 == i37) {
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                zzikVar2 = zzikVar3;
                                                i35 = i39;
                                                zzmaVar6 = zzmaVar7;
                                                i34 = i38;
                                                i44 = zzil.zzk(i39, bArr, i32, i2, zzkzVar, zzikVar);
                                                i37 = i32;
                                                if (i44 == i37) {
                                                }
                                            }
                                            zzikVar2 = zzikVar3;
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i32 = i50;
                                        i33 = i2;
                                        i38 = i52;
                                        i39 = i56;
                                        zzikVar3 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar7 = this;
                                        if (i54 == 2) {
                                            zzlm zzlmVar3 = (zzlm) zzkzVar;
                                            zzf = zzil.zzi(bArr, i32, zzikVar3);
                                            int i71 = zzikVar3.zza + zzf;
                                            while (zzf < i71) {
                                                zzlmVar3.zzg(zzil.zzp(bArr, zzf));
                                                zzf += 8;
                                            }
                                            if (zzf != i71) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 1) {
                                                zzf = i32 + 8;
                                                zzlm zzlmVar4 = (zzlm) zzkzVar;
                                                zzlmVar4.zzg(zzil.zzp(bArr, i32));
                                                while (zzf < i33) {
                                                    int zzi4 = zzil.zzi(bArr, zzf, zzikVar3);
                                                    if (i39 == zzikVar3.zza) {
                                                        zzlmVar4.zzg(zzil.zzp(bArr, zzi4));
                                                        zzf = zzi4 + 8;
                                                    }
                                                }
                                            }
                                            zzikVar2 = zzikVar3;
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i35 = i39;
                                        zzmaVar6 = zzmaVar7;
                                        i34 = i38;
                                        i37 = i32;
                                        i44 = zzf;
                                        zzikVar2 = zzikVar3;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i32 = i50;
                                        i33 = i2;
                                        i38 = i52;
                                        i39 = i56;
                                        zzikVar3 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar7 = this;
                                        if (i54 == 2) {
                                            zzkt zzktVar = (zzkt) zzkzVar;
                                            zzf = zzil.zzi(bArr, i32, zzikVar3);
                                            int i72 = zzikVar3.zza + zzf;
                                            while (zzf < i72) {
                                                zzktVar.zzh(zzil.zzb(bArr, zzf));
                                                zzf += 4;
                                            }
                                            if (zzf != i72) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 5) {
                                                zzf = i32 + 4;
                                                zzkt zzktVar2 = (zzkt) zzkzVar;
                                                zzktVar2.zzh(zzil.zzb(bArr, i32));
                                                while (zzf < i33) {
                                                    int zzi5 = zzil.zzi(bArr, zzf, zzikVar3);
                                                    if (i39 == zzikVar3.zza) {
                                                        zzktVar2.zzh(zzil.zzb(bArr, zzi5));
                                                        zzf = zzi5 + 4;
                                                    }
                                                }
                                            }
                                            zzikVar2 = zzikVar3;
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i35 = i39;
                                        zzmaVar6 = zzmaVar7;
                                        i34 = i38;
                                        i37 = i32;
                                        i44 = zzf;
                                        zzikVar2 = zzikVar3;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i32 = i50;
                                        i33 = i2;
                                        i38 = i52;
                                        i39 = i56;
                                        zzikVar3 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar7 = this;
                                        if (i54 == 2) {
                                            zzim zzimVar = (zzim) zzkzVar;
                                            zzf = zzil.zzi(bArr, i32, zzikVar3);
                                            int i73 = zzikVar3.zza + zzf;
                                            while (zzf < i73) {
                                                zzf = zzil.zzl(bArr, zzf, zzikVar3);
                                                zzimVar.zze(zzikVar3.zzb != 0);
                                            }
                                            if (zzf != i73) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                zzim zzimVar2 = (zzim) zzkzVar;
                                                zzf = zzil.zzl(bArr, i32, zzikVar3);
                                                zzimVar2.zze(zzikVar3.zzb != 0);
                                                while (zzf < i33) {
                                                    int zzi6 = zzil.zzi(bArr, zzf, zzikVar3);
                                                    if (i39 == zzikVar3.zza) {
                                                        zzf = zzil.zzl(bArr, zzi6, zzikVar3);
                                                        zzimVar2.zze(zzikVar3.zzb != 0);
                                                    }
                                                }
                                            }
                                            zzikVar2 = zzikVar3;
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i35 = i39;
                                        zzmaVar6 = zzmaVar7;
                                        i34 = i38;
                                        i37 = i32;
                                        i44 = zzf;
                                        zzikVar2 = zzikVar3;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 26:
                                        i32 = i50;
                                        i33 = i2;
                                        i38 = i52;
                                        i39 = i56;
                                        zzikVar3 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar7 = this;
                                        if (i54 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzf = zzil.zzi(bArr, i32, zzikVar3);
                                                int i74 = zzikVar3.zza;
                                                if (i74 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i74 == 0) {
                                                    obj3 = "";
                                                    zzkzVar.add(obj3);
                                                } else {
                                                    obj3 = "";
                                                    zzkzVar.add(new String(bArr, zzf, i74, zzla.zza));
                                                    zzf += i74;
                                                }
                                                while (zzf < i33) {
                                                    int zzi7 = zzil.zzi(bArr, zzf, zzikVar3);
                                                    if (i39 == zzikVar3.zza) {
                                                        zzf = zzil.zzi(bArr, zzi7, zzikVar3);
                                                        int i75 = zzikVar3.zza;
                                                        if (i75 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i75 == 0) {
                                                            zzkzVar.add(obj3);
                                                        } else {
                                                            zzkzVar.add(new String(bArr, zzf, i75, zzla.zza));
                                                            zzf += i75;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzf = zzil.zzi(bArr, i32, zzikVar3);
                                                int i76 = zzikVar3.zza;
                                                if (i76 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i76 == 0) {
                                                    zzkzVar.add("");
                                                } else {
                                                    int i77 = zzf + i76;
                                                    if (!zznl.zze(bArr, zzf, i77)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    zzkzVar.add(new String(bArr, zzf, i76, zzla.zza));
                                                    zzf = i77;
                                                }
                                                while (zzf < i33) {
                                                    int zzi8 = zzil.zzi(bArr, zzf, zzikVar3);
                                                    if (i39 == zzikVar3.zza) {
                                                        zzf = zzil.zzi(bArr, zzi8, zzikVar3);
                                                        int i78 = zzikVar3.zza;
                                                        if (i78 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i78 == 0) {
                                                            zzkzVar.add("");
                                                        } else {
                                                            int i79 = zzf + i78;
                                                            if (!zznl.zze(bArr, zzf, i79)) {
                                                                throw zzlc.zzd();
                                                            }
                                                            zzkzVar.add(new String(bArr, zzf, i78, zzla.zza));
                                                            zzf = i79;
                                                        }
                                                    }
                                                }
                                            }
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = zzf;
                                            zzikVar2 = zzikVar3;
                                            if (i44 == i37) {
                                            }
                                        }
                                        zzikVar2 = zzikVar3;
                                        i35 = i39;
                                        zzmaVar6 = zzmaVar7;
                                        i34 = i38;
                                        i37 = i32;
                                        i44 = i37;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 27:
                                        zzmaVar8 = this;
                                        i32 = i50;
                                        i33 = i2;
                                        unsafe = unsafe4;
                                        if (i54 == 2) {
                                            i38 = i52;
                                            zzmaVar7 = zzmaVar8;
                                            i39 = i56;
                                            zzikVar3 = zzikVar4;
                                            zzf = zzil.zze(zzmaVar8.zzx(i14), i56, bArr, i32, i2, zzkzVar, zzikVar);
                                            i35 = i39;
                                            zzmaVar6 = zzmaVar7;
                                            i34 = i38;
                                            i37 = i32;
                                            i44 = zzf;
                                            zzikVar2 = zzikVar3;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i34 = i52;
                                        zzikVar2 = zzikVar4;
                                        i37 = i32;
                                        zzmaVar6 = zzmaVar8;
                                        i35 = i56;
                                        i44 = i37;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 28:
                                        zzmaVar8 = this;
                                        i32 = i50;
                                        i33 = i2;
                                        unsafe = unsafe4;
                                        if (i54 == 2) {
                                            i44 = zzil.zzi(bArr, i32, zzikVar4);
                                            int i80 = zzikVar4.zza;
                                            if (i80 < 0) {
                                                throw zzlc.zzf();
                                            }
                                            if (i80 > bArr.length - i44) {
                                                throw zzlc.zzi();
                                            }
                                            if (i80 == 0) {
                                                zzkzVar.add(zziv.zzb);
                                            } else {
                                                zzkzVar.add(zziv.zzk(bArr, i44, i80));
                                                i44 += i80;
                                            }
                                            while (i44 < i33) {
                                                int zzi9 = zzil.zzi(bArr, i44, zzikVar4);
                                                if (i56 == zzikVar4.zza) {
                                                    i44 = zzil.zzi(bArr, zzi9, zzikVar4);
                                                    int i81 = zzikVar4.zza;
                                                    if (i81 < 0) {
                                                        throw zzlc.zzf();
                                                    }
                                                    if (i81 > bArr.length - i44) {
                                                        throw zzlc.zzi();
                                                    }
                                                    if (i81 == 0) {
                                                        zzkzVar.add(zziv.zzb);
                                                    } else {
                                                        zzkzVar.add(zziv.zzk(bArr, i44, i81));
                                                        i44 += i81;
                                                    }
                                                } else {
                                                    i34 = i52;
                                                    zzikVar2 = zzikVar4;
                                                    i37 = i32;
                                                    zzmaVar6 = zzmaVar8;
                                                    i35 = i56;
                                                    if (i44 == i37) {
                                                    }
                                                }
                                            }
                                            i34 = i52;
                                            zzikVar2 = zzikVar4;
                                            i37 = i32;
                                            zzmaVar6 = zzmaVar8;
                                            i35 = i56;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i34 = i52;
                                        zzikVar2 = zzikVar4;
                                        i37 = i32;
                                        zzmaVar6 = zzmaVar8;
                                        i35 = i56;
                                        i44 = i37;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i54 == 2) {
                                            zzmaVar8 = this;
                                            zzk = zzil.zzf(bArr, i50, zzkzVar, zzikVar4);
                                            i40 = i50;
                                            i33 = i2;
                                            unsafe = unsafe4;
                                        } else if (i54 == 0) {
                                            zzmaVar8 = this;
                                            i40 = i50;
                                            i33 = i2;
                                            unsafe = unsafe4;
                                            zzk = zzil.zzk(i56, bArr, i50, i2, zzkzVar, zzikVar);
                                        } else {
                                            i33 = i2;
                                            unsafe = unsafe4;
                                            i34 = i52;
                                            i35 = i56;
                                            zzikVar2 = zzikVar4;
                                            zzmaVar6 = this;
                                            i37 = i50;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        zzmm.zzo(obj, i52, zzkzVar, zzmaVar8.zzw(i14), null, zzmaVar8.zzm);
                                        i34 = i52;
                                        zzikVar2 = zzikVar4;
                                        i44 = zzk;
                                        i37 = i40;
                                        zzmaVar6 = zzmaVar8;
                                        i35 = i56;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i54 == 2) {
                                            zzkt zzktVar3 = (zzkt) zzkzVar;
                                            i44 = zzil.zzi(bArr, i50, zzikVar4);
                                            int i82 = zzikVar4.zza + i44;
                                            while (i44 < i82) {
                                                i44 = zzil.zzi(bArr, i44, zzikVar4);
                                                zzktVar3.zzh(zzjb.zzF(zzikVar4.zza));
                                            }
                                            if (i44 != i82) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                zzkt zzktVar4 = (zzkt) zzkzVar;
                                                i44 = zzil.zzi(bArr, i50, zzikVar4);
                                                zzktVar4.zzh(zzjb.zzF(zzikVar4.zza));
                                                while (i44 < i2) {
                                                    int zzi10 = zzil.zzi(bArr, i44, zzikVar4);
                                                    if (i56 == zzikVar4.zza) {
                                                        i44 = zzil.zzi(bArr, zzi10, zzikVar4);
                                                        zzktVar4.zzh(zzjb.zzF(zzikVar4.zza));
                                                    }
                                                }
                                            }
                                            i33 = i2;
                                            i34 = i52;
                                            i35 = i56;
                                            zzikVar2 = zzikVar4;
                                            unsafe = unsafe4;
                                            zzmaVar6 = this;
                                            i37 = i50;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        i37 = i50;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i54 == 2) {
                                            zzlm zzlmVar5 = (zzlm) zzkzVar;
                                            i44 = zzil.zzi(bArr, i50, zzikVar4);
                                            int i83 = zzikVar4.zza + i44;
                                            while (i44 < i83) {
                                                i44 = zzil.zzl(bArr, i44, zzikVar4);
                                                zzlmVar5.zzg(zzjb.zzG(zzikVar4.zzb));
                                            }
                                            if (i44 != i83) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                zzlm zzlmVar6 = (zzlm) zzkzVar;
                                                i44 = zzil.zzl(bArr, i50, zzikVar4);
                                                zzlmVar6.zzg(zzjb.zzG(zzikVar4.zzb));
                                                while (i44 < i2) {
                                                    int zzi11 = zzil.zzi(bArr, i44, zzikVar4);
                                                    if (i56 == zzikVar4.zza) {
                                                        i44 = zzil.zzl(bArr, zzi11, zzikVar4);
                                                        zzlmVar6.zzg(zzjb.zzG(zzikVar4.zzb));
                                                    }
                                                }
                                            }
                                            i33 = i2;
                                            i34 = i52;
                                            i35 = i56;
                                            zzikVar2 = zzikVar4;
                                            unsafe = unsafe4;
                                            zzmaVar6 = this;
                                            i37 = i50;
                                            i44 = i37;
                                            if (i44 == i37) {
                                            }
                                        }
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        i37 = i50;
                                        if (i44 == i37) {
                                        }
                                        break;
                                    default:
                                        i32 = i50;
                                        i33 = i2;
                                        i34 = i52;
                                        i35 = i56;
                                        zzikVar2 = zzikVar4;
                                        unsafe = unsafe4;
                                        zzmaVar6 = this;
                                        if (i54 == 3) {
                                            int i84 = (i35 & (-8)) | 4;
                                            zzmk zzx = zzmaVar6.zzx(i14);
                                            i37 = i32;
                                            i44 = zzil.zzc(zzx, bArr, i32, i2, i84, zzikVar);
                                            zzkzVar.add(zzikVar2.zzc);
                                            while (i44 < i33) {
                                                int zzi12 = zzil.zzi(bArr, i44, zzikVar2);
                                                if (i35 == zzikVar2.zza) {
                                                    i44 = zzil.zzc(zzx, bArr, zzi12, i2, i84, zzikVar);
                                                    zzkzVar.add(zzikVar2.zzc);
                                                } else if (i44 == i37) {
                                                }
                                            }
                                            if (i44 == i37) {
                                            }
                                        }
                                        i37 = i32;
                                        i44 = i37;
                                        if (i44 == i37) {
                                        }
                                        break;
                                }
                            }
                        } else if (i54 == 2) {
                            zzkz zzkzVar3 = (zzkz) unsafe4.getObject(obj4, j2);
                            if (!zzkzVar3.zzc()) {
                                int size2 = zzkzVar3.size();
                                zzkzVar3 = zzkzVar3.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe4.putObject(obj4, j2, zzkzVar3);
                            }
                            i45 = i52;
                            int zze = zzil.zze(zzmaVar2.zzx(i14), i56, bArr, i50, i2, zzkzVar3, zzikVar);
                            i42 = i3;
                            zzikVar4 = zzikVar4;
                            i41 = i2;
                            unsafe3 = unsafe4;
                            i43 = -1;
                            i48 = i9;
                            i49 = i10;
                            i47 = i56;
                            i44 = zze;
                            int i60222 = i14;
                            zzmaVar9 = zzmaVar2;
                            i46 = i60222;
                        } else {
                            unsafe = unsafe4;
                            zzikVar2 = zzikVar4;
                            i24 = i56;
                            zzmaVar5 = zzmaVar2;
                            i25 = i50;
                            i26 = i52;
                        }
                        i4 = i3;
                        i8 = i25;
                        z = true;
                        zzmaVar = zzmaVar5;
                        i11 = i24;
                        i13 = i26;
                    }
                }
                if (i11 != i4 || i4 == 0) {
                    if (!zzmaVar.zzh || zzikVar2.zzd == zzkd.zza) {
                        i15 = i13;
                        i16 = i11;
                        i44 = zzil.zzh(i16, bArr, i8, i2, zzd(obj), zzikVar);
                    } else {
                        zzkq zza3 = zzikVar2.zzd.zza(zzmaVar.zzg, i13);
                        if (zza3 == null) {
                            i15 = i13;
                            i16 = i11;
                            i44 = zzil.zzh(i11, bArr, i8, i2, zzd(obj), zzikVar);
                        } else {
                            i15 = i13;
                            i16 = i11;
                            zzko zzkoVar = (zzko) obj4;
                            zzkoVar.zzi();
                            zzki zzkiVar = zzkoVar.zzb;
                            zznm zznmVar = zza3.zza.zzb;
                            if (zznmVar == zznm.ENUM) {
                                zzil.zzi(bArr, i8, zzikVar2);
                                throw null;
                            }
                            switch (zznmVar) {
                                case DOUBLE:
                                    i17 = i8 + 8;
                                    obj5 = Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr, i8)));
                                    i8 = i17;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case FLOAT:
                                    i17 = i8 + 4;
                                    obj5 = Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i8)));
                                    i8 = i17;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case INT64:
                                case UINT64:
                                    i8 = zzil.zzl(bArr, i8, zzikVar2);
                                    obj5 = Long.valueOf(zzikVar2.zzb);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case INT32:
                                case UINT32:
                                    i8 = zzil.zzi(bArr, i8, zzikVar2);
                                    obj5 = Integer.valueOf(zzikVar2.zza);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case FIXED64:
                                case SFIXED64:
                                    i17 = i8 + 8;
                                    obj5 = Long.valueOf(zzil.zzp(bArr, i8));
                                    i8 = i17;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case FIXED32:
                                case SFIXED32:
                                    i17 = i8 + 4;
                                    obj5 = Integer.valueOf(zzil.zzb(bArr, i8));
                                    i8 = i17;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case BOOL:
                                    i8 = zzil.zzl(bArr, i8, zzikVar2);
                                    if (zzikVar2.zzb == 0) {
                                        z = false;
                                    }
                                    obj5 = Boolean.valueOf(z);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case STRING:
                                    i8 = zzil.zzg(bArr, i8, zzikVar2);
                                    obj2 = zzikVar2.zzc;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case GROUP:
                                    int i85 = zzmg.zza;
                                    throw null;
                                case MESSAGE:
                                    int i86 = zzmg.zza;
                                    throw null;
                                case BYTES:
                                    i8 = zzil.zza(bArr, i8, zzikVar2);
                                    obj2 = zzikVar2.zzc;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case ENUM:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case SINT32:
                                    i8 = zzil.zzi(bArr, i8, zzikVar2);
                                    obj5 = Integer.valueOf(zzjb.zzF(zzikVar2.zza));
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                case SINT64:
                                    i8 = zzil.zzl(bArr, i8, zzikVar2);
                                    obj5 = Long.valueOf(zzjb.zzG(zzikVar2.zzb));
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                                default:
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza3.zza, obj2);
                                    i44 = i8;
                                    break;
                            }
                        }
                    }
                    i41 = i2;
                    i46 = i14;
                    i42 = i4;
                    i47 = i16;
                    i45 = i15;
                    zzmaVar9 = zzmaVar;
                    i43 = i12;
                    i48 = i9;
                    i49 = i10;
                    unsafe3 = unsafe;
                    zzikVar4 = zzikVar2;
                } else {
                    i5 = i8;
                    i6 = i11;
                    i48 = i9;
                    i49 = i10;
                }
            } else {
                zzmaVar = zzmaVar9;
                unsafe = unsafe3;
                i4 = i42;
                i5 = i44;
                i6 = i47;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        return ((zzks) this.zzg).zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzks) {
                zzks zzksVar = (zzks) obj;
                zzksVar.zzG(Integer.MAX_VALUE);
                zzksVar.zza = 0;
                zzksVar.zzE();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                                ((zzkz) zzni.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzlr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzm(obj);
            if (this.zzh) {
                this.zzn.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzni.zzo(obj, j, zzni.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzni.zzp(obj, j, zzni.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzni.zzm(obj, j, zzni.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                    zzkz zzkzVar = (zzkz) zzni.zzf(obj, j);
                    zzkz zzkzVar2 = (zzkz) zzni.zzf(obj2, j);
                    int size = zzkzVar.size();
                    int size2 = zzkzVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzkzVar.zzc()) {
                            zzkzVar = zzkzVar.zzd(size2 + size);
                        }
                        zzkzVar.addAll(zzkzVar2);
                    }
                    if (size > 0) {
                        zzkzVar2 = zzkzVar;
                    }
                    zzni.zzs(obj, j, zzkzVar2);
                    break;
                case 50:
                    int i4 = zzmm.zza;
                    zzni.zzs(obj, j, zzls.zzb(zzni.zzf(obj, j), zzni.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzmm.zzr(this.zzm, obj, obj2);
        if (this.zzh) {
            zzmm.zzq(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0604 A[LOOP:3: B:47:0x0600->B:49:0x0604, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0618  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) throws IOException {
        zznb zznbVar;
        Object obj2;
        int i;
        Object obj3;
        zzke zzkeVar;
        zzkd zzkdVar2;
        Object obj4 = obj;
        zzkd zzkdVar3 = zzkdVar;
        zzkdVar.getClass();
        zzD(obj);
        zznb zznbVar2 = this.zzm;
        zzke zzkeVar2 = this.zzn;
        zzki zzkiVar = null;
        Object obj5 = null;
        while (true) {
            try {
                int zzc = zzmjVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj3 = obj5;
                    zznbVar = zznbVar2;
                    obj2 = obj4;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzlb unused) {
                            obj5 = obj3;
                            zzkeVar = zzkeVar2;
                            zzkdVar2 = zzkdVar3;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzo(obj2, zzu & 1048575, zzmjVar.zza());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 1:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzp(obj2, zzu & 1048575, zzmjVar.zzb());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 2:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzl());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 3:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzo());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 4:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzg());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 5:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzk());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 6:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzf());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 7:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzm(obj2, zzu & 1048575, zzmjVar.zzN());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 8:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzG(obj2, zzu, zzmjVar);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 9:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzlx zzlxVar = (zzlx) zzA(obj2, zzq);
                                zzmjVar.zzu(zzlxVar, zzx(zzq), zzkdVar2);
                                zzJ(obj2, zzq, zzlxVar);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 10:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzs(obj2, zzu & 1048575, zzmjVar.zzp());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 11:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzj());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 12:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                int zze = zzmjVar.zze();
                                zzkw zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze)) {
                                    obj5 = zzmm.zzp(obj2, zzc, zze, obj5, zznbVar);
                                    obj4 = obj2;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                }
                                zzni.zzq(obj2, zzu & 1048575, zze);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                            case 13:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzh());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 14:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzm());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 15:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzi());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 16:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzn());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 17:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzlx zzlxVar2 = (zzlx) zzA(obj2, zzq);
                                zzmjVar.zzt(zzlxVar2, zzx(zzq), zzkdVar2);
                                zzJ(obj2, zzq, zzlxVar2);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 18:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzx(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 19:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzB(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 20:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzE(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 21:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzM(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 22:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzD(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 23:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzA(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 24:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzz(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 25:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzv(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 26:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                if (zzM(zzu)) {
                                    ((zzjc) zzmjVar).zzK(zzlk.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzjc) zzmjVar).zzK(zzlk.zza(obj2, zzu & 1048575), false);
                                }
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 27:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzF(zzlk.zza(obj2, zzu & 1048575), zzx(zzq), zzkdVar2);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 28:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzw(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 29:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzL(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 30:
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                List zza2 = zzlk.zza(obj2, zzu & 1048575);
                                zzmjVar.zzy(zza2);
                                obj5 = zzmm.zzo(obj, zzc, zza2, zzw(zzq), obj3, zznbVar);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 31:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzG(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 32:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzH(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 33:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzI(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 34:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzJ(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 35:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzx(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 36:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzB(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 37:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzE(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 38:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzM(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 39:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzD(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 40:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzA(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 41:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzz(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 42:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzv(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 43:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzL(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 44:
                                List zza3 = zzlk.zza(obj2, zzu & 1048575);
                                zzmjVar.zzy(zza3);
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj5 = zzmm.zzo(obj, zzc, zza3, zzw(zzq), obj3, zznbVar);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 45:
                                zzmjVar.zzG(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 46:
                                zzmjVar.zzH(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 47:
                                zzmjVar.zzI(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 48:
                                zzmjVar.zzJ(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                                zzmjVar.zzC(zzlk.zza(obj2, zzu & 1048575), zzx(zzq), zzkdVar3);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzni.zzf(obj2, zzu2);
                                if (zzf == null) {
                                    zzf = zzlr.zza().zzb();
                                    zzni.zzs(obj2, zzu2, zzf);
                                } else if (zzls.zza(zzf)) {
                                    Object zzb2 = zzlr.zza().zzb();
                                    zzls.zzb(zzb2, zzf);
                                    zzni.zzs(obj2, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzni.zzs(obj2, zzu & 1048575, Double.valueOf(zzmjVar.zza()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 52:
                                zzni.zzs(obj2, zzu & 1048575, Float.valueOf(zzmjVar.zzb()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 53:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzl()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 54:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzo()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 55:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzg()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 56:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzk()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 57:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzf()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 58:
                                zzni.zzs(obj2, zzu & 1048575, Boolean.valueOf(zzmjVar.zzN()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 59:
                                zzG(obj2, zzu, zzmjVar);
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 60:
                                zzlx zzlxVar3 = (zzlx) zzB(obj2, zzc, zzq);
                                zzmjVar.zzu(zzlxVar3, zzx(zzq), zzkdVar3);
                                zzK(obj2, zzc, zzq, zzlxVar3);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 61:
                                zzni.zzs(obj2, zzu & 1048575, zzmjVar.zzp());
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 62:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzj()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 63:
                                int zze2 = zzmjVar.zze();
                                zzkw zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze2)) {
                                    obj5 = zzmm.zzp(obj2, zzc, zze2, obj3, zznbVar);
                                    obj4 = obj2;
                                    zznbVar2 = zznbVar;
                                }
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zze2));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                            case 64:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzh()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 65:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzm()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 66:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzi()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzn()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                                zzlx zzlxVar4 = (zzlx) zzB(obj2, zzc, zzq);
                                zzmjVar.zzt(zzlxVar4, zzx(zzq), zzkdVar3);
                                zzK(obj2, zzc, zzq, zzlxVar4);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            default:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                if (obj5 == null) {
                                    try {
                                        try {
                                            obj5 = zznbVar.zzc(obj2);
                                        } catch (zzlb unused2) {
                                            zznbVar.zzs(zzmjVar);
                                            if (obj5 == null) {
                                                obj5 = zznbVar.zzc(obj2);
                                            }
                                            if (!zznbVar.zzr(obj5, zzmjVar)) {
                                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                                    zzy(obj, this.zzj[i2], obj5, zznbVar, obj);
                                                }
                                                if (obj5 == null) {
                                                }
                                            }
                                            obj4 = obj2;
                                            zzkeVar2 = zzkeVar;
                                            zzkdVar3 = zzkdVar2;
                                            zznbVar2 = zznbVar;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i < this.zzl) {
                                        }
                                        if (obj5 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!zznbVar.zzr(obj5, zzmjVar)) {
                                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                        zzy(obj, this.zzj[i3], obj5, zznbVar, obj);
                                    }
                                }
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj5 = obj3;
                        while (i < this.zzl) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzy(obj, this.zzj[i4], obj5, zznbVar2, obj);
                    }
                    zznbVar = zznbVar2;
                    obj2 = obj4;
                } else {
                    try {
                        Object zzd = !this.zzh ? null : zzkeVar2.zzd(zzkdVar3, this.zzg, zzc);
                        if (zzd != null) {
                            if (zzkiVar == null) {
                                zzkiVar = zzkeVar2.zzc(obj4);
                            }
                            zzki zzkiVar2 = zzkiVar;
                            obj3 = obj5;
                            zznb zznbVar3 = zznbVar2;
                            Object obj6 = obj4;
                            try {
                                zzkeVar2.zze(obj, zzmjVar, zzd, zzkdVar, zzkiVar2, obj3, zznbVar3);
                                zzkiVar = zzkiVar2;
                                obj4 = obj6;
                                zznbVar2 = zznbVar3;
                                obj5 = obj3;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = obj6;
                                zznbVar = zznbVar3;
                                obj5 = obj3;
                                while (i < this.zzl) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                        } else {
                            Object obj7 = obj5;
                            zznb zznbVar4 = zznbVar2;
                            Object obj8 = obj4;
                            zznbVar4.zzs(zzmjVar);
                            obj5 = obj7 == null ? zznbVar4.zzc(obj8) : obj7;
                            try {
                                if (zznbVar4.zzr(obj5, zzmjVar)) {
                                    obj4 = obj8;
                                    zznbVar2 = zznbVar4;
                                } else {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zznb zznbVar5 = zznbVar4;
                                        zzy(obj, this.zzj[i5], obj5, zznbVar5, obj);
                                        i5++;
                                        obj8 = obj8;
                                        zznbVar4 = zznbVar5;
                                    }
                                    obj2 = obj8;
                                    zznbVar = zznbVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj8;
                                zznbVar = zznbVar4;
                                while (i < this.zzl) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zznbVar = zznbVar2;
                        obj2 = obj4;
                        for (i = this.zzk; i < this.zzl; i++) {
                            zzy(obj, this.zzj[i], obj5, zznbVar, obj);
                        }
                        if (obj5 != null) {
                            zznbVar.zzn(obj2, obj5);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        if (obj5 == null) {
            zznbVar.zzn(obj2, obj5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzik zzikVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzno zznoVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Iterator it2;
        int[] iArr2;
        boolean z;
        boolean z2;
        Map.Entry entry3;
        if (this.zzh) {
            zzki zzb2 = this.zzn.zzb(obj);
            if (!zzb2.zza.isEmpty()) {
                Iterator zzf = zzb2.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzu = zzu(i);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i6 = iArr3[i];
                    if (zzt <= 17) {
                        int i7 = iArr3[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i4) {
                            if (i8 == 1048575) {
                                entry3 = entry;
                                i5 = 0;
                            } else {
                                entry3 = entry;
                                i5 = unsafe.getInt(obj, i8);
                            }
                            i4 = i8;
                        } else {
                            entry3 = entry;
                        }
                        i3 = 1 << (i7 >>> 20);
                        i2 = i5;
                        entry2 = entry3;
                    } else {
                        i2 = i5;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i9 = i4;
                    while (entry2 != null && this.zzn.zza(entry2) <= i6) {
                        this.zzn.zzi(zznoVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzf(i6, zzni.zza(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzo(i6, zzni.zzb(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzt(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzK(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzr(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzm(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzk(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzb(i6, zzni.zzw(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 8:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzT(i6, unsafe.getObject(obj, j), zznoVar);
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzv(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzd(i6, (zziv) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 11:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzI(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzi(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzx(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzz(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzB(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzD(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zznoVar.zzq(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 18:
                            z = false;
                            zzmm.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 19:
                            z = false;
                            zzmm.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 20:
                            z = false;
                            zzmm.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 21:
                            z = false;
                            zzmm.zzG(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 22:
                            z = false;
                            zzmm.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 23:
                            z = false;
                            zzmm.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 24:
                            z = false;
                            zzmm.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 25:
                            z = false;
                            zzmm.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 26:
                            int i10 = this.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zzmm.zza;
                            if (list != null && !list.isEmpty()) {
                                zznoVar.zzH(i10, list);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 27:
                            int i12 = this.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzmk zzx = zzx(i);
                            int i13 = zzmm.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzjh) zznoVar).zzv(i12, list2.get(i14), zzx);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 28:
                            int i15 = this.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zzmm.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zznoVar.zze(i15, list3);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 29:
                            z2 = false;
                            zzmm.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 30:
                            z2 = false;
                            zzmm.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 31:
                            z2 = false;
                            zzmm.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 32:
                            z2 = false;
                            zzmm.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 33:
                            z2 = false;
                            zzmm.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 34:
                            z2 = false;
                            zzmm.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 35:
                            zzmm.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 36:
                            zzmm.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 37:
                            zzmm.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 38:
                            zzmm.zzG(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 39:
                            zzmm.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 40:
                            zzmm.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 41:
                            zzmm.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 42:
                            zzmm.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 43:
                            zzmm.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 44:
                            zzmm.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 45:
                            zzmm.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 46:
                            zzmm.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 47:
                            zzmm.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 48:
                            zzmm.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                            int i17 = this.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzmk zzx2 = zzx(i);
                            int i18 = zzmm.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzjh) zznoVar).zzq(i17, list4.get(i19), zzx2);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 51:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzf(i6, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 52:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzo(i6, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 53:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzt(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 54:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzK(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 55:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzr(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 56:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzm(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 57:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzk(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 58:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzb(i6, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 59:
                            if (zzR(obj, i6, i)) {
                                zzT(i6, unsafe.getObject(obj, j), zznoVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 60:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzv(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 61:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzd(i6, (zziv) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 62:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzI(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 63:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzi(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 64:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzx(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 65:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzz(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 66:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzB(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzD(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                            if (zzR(obj, i6, i)) {
                                zznoVar.zzq(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzi(zznoVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                zznb zznbVar = this.zzm;
                zznbVar.zzq(zznbVar.zzd(obj), zznoVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        zznb zznbVar2 = this.zzm;
        zznbVar2.zzq(zznbVar2.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzH;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzni.zza(obj, j)) == Double.doubleToLongBits(zzni.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzni.zzb(obj, j)) == Float.floatToIntBits(zzni.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzni.zzw(obj, j) == zzni.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                    zzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
                    break;
                case 50:
                    zzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    long zzr = zzr(i) & 1048575;
                    if (zzni.zzc(obj, zzr) == zzni.zzc(obj2, zzr) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzlr) zzni.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzni.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmk zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzk();
    }
}
