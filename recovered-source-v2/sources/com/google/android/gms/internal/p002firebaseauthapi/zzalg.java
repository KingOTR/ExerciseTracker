package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalg<T> implements zzalv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalk zzn;
    private final zzakm zzo;
    private final zzamo<?, ?> zzp;
    private final zzajm<?> zzq;
    private final zzakz zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzamp.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzamp.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzamw zzamwVar, Class<?> cls, zzaik zzaikVar) throws IOException {
        switch (zzalj.zza[zzamwVar.ordinal()]) {
            case 1:
                int zzd = zzail.zzd(bArr, i, zzaikVar);
                zzaikVar.zzc = Boolean.valueOf(zzaikVar.zzb != 0);
                return zzd;
            case 2:
                return zzail.zza(bArr, i, zzaikVar);
            case 3:
                zzaikVar.zzc = Double.valueOf(zzail.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzaikVar.zzc = Integer.valueOf(zzail.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzaikVar.zzc = Long.valueOf(zzail.zzd(bArr, i));
                return i + 8;
            case 8:
                zzaikVar.zzc = Float.valueOf(zzail.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzail.zzc(bArr, i, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzaikVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzail.zzd(bArr, i, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzaikVar.zzb);
                return zzd2;
            case 14:
                return zzail.zza(zzalr.zza().zza((Class) cls), bArr, i, i2, zzaikVar);
            case 15:
                int zzc2 = zzail.zzc(bArr, i, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzajb.zze(zzaikVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzail.zzd(bArr, i, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzajb.zza(zzaikVar.zzb));
                return zzd3;
            case 17:
                return zzail.zzb(bArr, i, zzaikVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        int zza2;
        int zza3;
        int zzd;
        int zzd2;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        ?? r9 = 0;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i6 < this.zzc.length) {
            int zzc = zzc(i6);
            int i9 = (267386880 & zzc) >>> 20;
            int[] iArr = this.zzc;
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i8) {
                    i5 = i12 == i4 ? r9 : unsafe.getInt(t, i12);
                    i8 = i12;
                }
                i = i8;
                i2 = i5;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i8;
                i2 = i5;
                i3 = r9;
            }
            long j = zzc & i4;
            if (i9 >= zzajs.DOUBLE_LIST_PACKED.zza()) {
                zzajs.SINT64_LIST_PACKED.zza();
            }
            int i13 = i3;
            switch (i9) {
                case 0:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zza(i10, 0.0d);
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zza(i10, 0.0f);
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zzb(i10, unsafe.getLong(t, j));
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zze(i10, unsafe.getLong(t, j));
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zzd(i10, unsafe.getInt(t, j));
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z = r9;
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza2 = zzajg.zza(i10, 0L);
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        z = false;
                        zza2 = zzajg.zzc(i10, 0);
                        i7 += zza2;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zza(i10, true);
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 8:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzaip) {
                            zza3 = zzajg.zza(i10, (zzaip) object);
                        } else {
                            zza3 = zzajg.zza(i10, (String) object);
                        }
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 9:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzalx.zza(i10, unsafe.getObject(t, j), (zzalv<?>) zze(i6));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 10:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zza(i10, (zzaip) unsafe.getObject(t, j));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 11:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zzg(i10, unsafe.getInt(t, j));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 12:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zzb(i10, unsafe.getInt(t, j));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 13:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        i7 += zzajg.zze(i10, 0);
                    }
                    z = false;
                    break;
                case 14:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zzc(i10, 0L);
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 15:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zzf(i10, unsafe.getInt(t, j));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 16:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zzd(i10, unsafe.getLong(t, j));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 17:
                    if (zza((zzalg<T>) t, i6, i, i2, i13)) {
                        zza3 = zzajg.zza(i10, (zzalc) unsafe.getObject(t, j), zze(i6));
                        i7 += zza3;
                    }
                    z = false;
                    break;
                case 18:
                    zzd = zzalx.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 19:
                    zzd = zzalx.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 20:
                    zzd = zzalx.zzf(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 21:
                    zzd = zzalx.zzj(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 22:
                    zzd = zzalx.zze(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 23:
                    zzd = zzalx.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 24:
                    zzd = zzalx.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 25:
                    zzd = zzalx.zza(i10, (List<?>) unsafe.getObject(t, j), (boolean) r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 26:
                    zzd = zzalx.zzb(i10, (List) unsafe.getObject(t, j));
                    i7 += zzd;
                    z = r9;
                    break;
                case 27:
                    zzd = zzalx.zzb(i10, (List<?>) unsafe.getObject(t, j), (zzalv<?>) zze(i6));
                    i7 += zzd;
                    z = r9;
                    break;
                case 28:
                    zzd = zzalx.zza(i10, (List<zzaip>) unsafe.getObject(t, j));
                    i7 += zzd;
                    z = r9;
                    break;
                case 29:
                    zzd = zzalx.zzi(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 30:
                    zzd = zzalx.zzb(i10, (List<Integer>) unsafe.getObject(t, j), (boolean) r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 31:
                    zzd = zzalx.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 32:
                    zzd = zzalx.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 33:
                    zzd = zzalx.zzg(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 34:
                    zzd = zzalx.zzh(i10, (List) unsafe.getObject(t, j), r9);
                    i7 += zzd;
                    z = r9;
                    break;
                case 35:
                    zzd2 = zzalx.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 36:
                    zzd2 = zzalx.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 37:
                    zzd2 = zzalx.zzf((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 38:
                    zzd2 = zzalx.zzj((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 39:
                    zzd2 = zzalx.zze((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 40:
                    zzd2 = zzalx.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 41:
                    zzd2 = zzalx.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 42:
                    zzd2 = zzalx.zza((List<?>) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 43:
                    zzd2 = zzalx.zzi((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 44:
                    zzd2 = zzalx.zzb((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 45:
                    zzd2 = zzalx.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 46:
                    zzd2 = zzalx.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 47:
                    zzd2 = zzalx.zzg((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case 48:
                    zzd2 = zzalx.zzh((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzi = zzajg.zzi(i10);
                        zzj = zzajg.zzj(zzd2);
                        i7 += zzi + zzj + zzd2;
                    }
                    z = r9;
                    break;
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                    zzd = zzalx.zza(i10, (List<zzalc>) unsafe.getObject(t, j), (zzalv<?>) zze(i6));
                    i7 += zzd;
                    z = r9;
                    break;
                case 50:
                    zzd = this.zzr.zza(i10, unsafe.getObject(t, j), zzf(i6));
                    i7 += zzd;
                    z = r9;
                    break;
                case 51:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, 0.0d);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 52:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, 0.0f);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 53:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzb(i10, zzd(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 54:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zze(i10, zzd(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 55:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzd(i10, zzc(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 56:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, 0L);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 57:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzc(i10, (int) r9);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 58:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, true);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 59:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzaip) {
                            zzd = zzajg.zza(i10, (zzaip) object2);
                        } else {
                            zzd = zzajg.zza(i10, (String) object2);
                        }
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 60:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzalx.zza(i10, unsafe.getObject(t, j), (zzalv<?>) zze(i6));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 61:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, (zzaip) unsafe.getObject(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 62:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzg(i10, zzc(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 63:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzb(i10, zzc(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 64:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zze(i10, (int) r9);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 65:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzc(i10, 0L);
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case 66:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzf(i10, zzc(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zzd(i10, zzd(t, j));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    if (zzc((zzalg<T>) t, i10, i6)) {
                        zzd = zzajg.zza(i10, (zzalc) unsafe.getObject(t, j), zze(i6));
                        i7 += zzd;
                    }
                    z = r9;
                    break;
                default:
                    z = r9;
                    break;
            }
            i6 += 3;
            i8 = i;
            r9 = z;
            i5 = i2;
            i4 = 1048575;
        }
        int i14 = r9;
        zzamo<?, ?> zzamoVar = this.zzp;
        int zza4 = i7 + zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t));
        if (!this.zzh) {
            return zza4;
        }
        zzajr<?> zza5 = this.zzq.zza(t);
        int zza6 = zza5.zza.zza();
        for (int i15 = i14; i15 < zza6; i15++) {
            Map.Entry<?, Object> zza7 = zza5.zza.zza(i15);
            i14 += zzajr.zza((zzajt<?>) zza7.getKey(), zza7.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i14 += zzajr.zza((zzajt<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i14;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzakb.zza(Double.doubleToLongBits(zzamp.zza(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzamp.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzh(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzamp.zze(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zzamp.zze(t, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzamp.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzamp.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzakb.zza(zzamp.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zzamp.zze(t, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    zza2 = zzamp.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzamp.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzamp.zze(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzamp.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzamp.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzakb.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    if (zzc((zzalg<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzamp.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t).hashCode() : hashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzamp.zze(t, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d43, code lost:
    
        if (r13 == 1048575) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d45, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d4b, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a76, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d52, code lost:
    
        if (r6 >= r11.zzm) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d54, code lost:
    
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzamn) zza((java.lang.Object) r32, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzamo<UT, int>) r11.zzp, (java.lang.Object) r32);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d6a, code lost:
    
        if (r3 == null) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d6c, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d71, code lost:
    
        if (r8 != 0) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d75, code lost:
    
        if (r7 != r35) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d7c, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d83, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d7f, code lost:
    
        if (r7 > r35) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d81, code lost:
    
        if (r10 != r8) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d88, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x094b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x093c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0d22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0cb7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v59, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(T t, byte[] bArr, int i, int i2, int i3, zzaik zzaikVar) throws IOException {
        Unsafe unsafe;
        int i4;
        zzalg<T> zzalgVar;
        int i5;
        int zza2;
        int i6;
        zzalg<T> zzalgVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzaik zzaikVar2;
        int i12;
        zzaik zzaikVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        zzaik zzaikVar4;
        int i24;
        int i25;
        int i26;
        int zzd;
        int i27;
        int i28;
        int zza3;
        int i29;
        int i30;
        Object obj;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzakc zzakcVar;
        int i31;
        zzaik zzaikVar5;
        int i32;
        int i33;
        Unsafe unsafe5;
        int i34;
        int i35;
        int i36;
        int i37;
        Unsafe unsafe6;
        int i38;
        int i39;
        int i40;
        int i41;
        zzaik zzaikVar6;
        int i42;
        int i43;
        Unsafe unsafe7;
        zzakc zzakcVar2;
        int i44;
        zzaik zzaikVar7;
        int i45;
        int i46;
        zzaik zzaikVar8;
        zzakc zzakcVar3;
        int zza4;
        zzalg<T> zzalgVar3 = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i47 = i2;
        int i48 = i3;
        zzaik zzaikVar9 = zzaikVar;
        zzf(t);
        Unsafe unsafe8 = zzb;
        int i49 = i;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = -1;
        int i54 = 1048575;
        while (true) {
            if (i49 < i47) {
                int i55 = i49 + 1;
                byte b = bArr2[i49];
                if (b < 0) {
                    int zza5 = zzail.zza(b, bArr2, i55, zzaikVar9);
                    i5 = zzaikVar9.zza;
                    i55 = zza5;
                } else {
                    i5 = b;
                }
                int i56 = i5 >>> 3;
                int i57 = i5 & 7;
                if (i56 > i53) {
                    zza2 = (i56 < zzalgVar3.zze || i56 > zzalgVar3.zzf) ? -1 : zzalgVar3.zza(i56, i50 / 3);
                } else {
                    zza2 = zzalgVar3.zza(i56);
                }
                int i58 = zza2;
                if (i58 != -1) {
                    int[] iArr = zzalgVar3.zzc;
                    int i59 = iArr[i58 + 1];
                    int i60 = (i59 & 267386880) >>> 20;
                    int i61 = i55;
                    int i62 = i5;
                    long j = i59 & 1048575;
                    if (i60 > 17) {
                        i9 = i52;
                        i10 = i54;
                        zzaik zzaikVar10 = zzaikVar9;
                        int i63 = i62;
                        Unsafe unsafe9 = unsafe8;
                        if (i60 != 27) {
                            if (i60 > 49) {
                                Unsafe unsafe10 = unsafe9;
                                i50 = i58;
                                i23 = i61;
                                int i64 = i63;
                                if (i60 != 50) {
                                    zzaikVar2 = zzaikVar10;
                                    unsafe = unsafe10;
                                    t2 = t;
                                    Unsafe unsafe11 = zzb;
                                    long j2 = iArr[i50 + 2] & 1048575;
                                    switch (i60) {
                                        case 51:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 1) {
                                                unsafe11.putObject(t2, j, Double.valueOf(zzail.zza(bArr2, i25)));
                                                i26 = i25 + 8;
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = i26;
                                                if (i49 != i25) {
                                                    i6 = i3;
                                                    i12 = i49;
                                                    break;
                                                } else {
                                                    int i65 = i8;
                                                    int i66 = i7;
                                                    bArr2 = bArr;
                                                    i47 = i2;
                                                    zzaikVar9 = zzaikVar2;
                                                    i53 = i66;
                                                    i50 = i11;
                                                    i51 = i65;
                                                    i52 = i9;
                                                    i54 = i10;
                                                    unsafe8 = unsafe;
                                                    zzalgVar3 = zzalgVar2;
                                                    i48 = i3;
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                        case 52:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 5) {
                                                unsafe11.putObject(t2, j, Float.valueOf(zzail.zzb(bArr2, i25)));
                                                i26 = i25 + 4;
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = i26;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                zzd = zzail.zzd(bArr2, i25, zzaikVar2);
                                                unsafe11.putObject(t2, j, Long.valueOf(zzaikVar2.zzb));
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zzd;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                zzd = zzail.zzc(bArr2, i25, zzaikVar2);
                                                unsafe11.putObject(t2, j, Integer.valueOf(zzaikVar2.zza));
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zzd;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 1) {
                                                unsafe11.putObject(t2, j, Long.valueOf(zzail.zzd(bArr2, i25)));
                                                i26 = i25 + 8;
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = i26;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 5) {
                                                unsafe11.putObject(t2, j, Integer.valueOf(zzail.zzc(bArr2, i25)));
                                                i26 = i25 + 4;
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = i26;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 58:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                zzd = zzail.zzd(bArr2, i25, zzaikVar2);
                                                unsafe11.putObject(t2, j, Boolean.valueOf(zzaikVar2.zzb != 0));
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zzd;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 59:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 2) {
                                                int zzc = zzail.zzc(bArr2, i25, zzaikVar2);
                                                int i67 = zzaikVar2.zza;
                                                if (i67 == 0) {
                                                    unsafe11.putObject(t2, j, "");
                                                } else {
                                                    if ((i59 & 536870912) != 0 && !zzamt.zzc(bArr2, zzc, zzc + i67)) {
                                                        throw zzakf.zzd();
                                                    }
                                                    unsafe11.putObject(t2, j, new String(bArr2, zzc, i67, zzakb.zza));
                                                    zzc += i67;
                                                }
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zzc;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 60:
                                            zzalgVar2 = this;
                                            i27 = i23;
                                            i28 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 2) {
                                                Object zza6 = zzalgVar2.zza((zzalg<T>) t2, i7, i28);
                                                int zza7 = zzail.zza(zza6, zzalgVar2.zze(i28), bArr, i27, i2, zzaikVar);
                                                zzalgVar2.zza((zzalg<T>) t2, i7, i28, zza6);
                                                i49 = zza7;
                                                i11 = i28;
                                                i25 = i27;
                                                i7 = i7;
                                                zzalgVar2 = zzalgVar2;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i11 = i28;
                                            i25 = i27;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 61:
                                            zzalgVar2 = this;
                                            i27 = i23;
                                            i28 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 2) {
                                                zza3 = zzail.zza(bArr2, i27, zzaikVar2);
                                                unsafe11.putObject(t2, j, zzaikVar2.zzc);
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zza3;
                                                i11 = i28;
                                                i25 = i27;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i11 = i28;
                                            i25 = i27;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 63:
                                            zzalgVar2 = this;
                                            i27 = i23;
                                            i28 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                zza3 = zzail.zzc(bArr2, i27, zzaikVar2);
                                                int i68 = zzaikVar2.zza;
                                                zzakd zzd2 = zzalgVar2.zzd(i28);
                                                if (zzd2 == null || zzd2.zza(i68)) {
                                                    unsafe11.putObject(t2, j, Integer.valueOf(i68));
                                                    unsafe11.putInt(t2, j2, i7);
                                                } else {
                                                    zzc(t).zza(i8, Long.valueOf(i68));
                                                }
                                                i49 = zza3;
                                                i11 = i28;
                                                i25 = i27;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i11 = i28;
                                            i25 = i27;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case 66:
                                            zzalgVar2 = this;
                                            i27 = i23;
                                            i28 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                zza3 = zzail.zzc(bArr2, i27, zzaikVar2);
                                                unsafe11.putObject(t2, j, Integer.valueOf(zzajb.zze(zzaikVar2.zza)));
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zza3;
                                                i11 = i28;
                                                i25 = i27;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i11 = i28;
                                            i25 = i27;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                                            zzalgVar2 = this;
                                            i27 = i23;
                                            i28 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            if (i57 == 0) {
                                                int zzd3 = zzail.zzd(bArr2, i27, zzaikVar2);
                                                unsafe11.putObject(t2, j, Long.valueOf(zzajb.zza(zzaikVar2.zzb)));
                                                unsafe11.putInt(t2, j2, i7);
                                                i49 = zzd3;
                                                i11 = i28;
                                                i25 = i27;
                                                if (i49 != i25) {
                                                }
                                            }
                                            i11 = i28;
                                            i25 = i27;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                        case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                                            if (i57 == 3) {
                                                zzalgVar2 = this;
                                                i7 = i56;
                                                Object zza8 = zzalgVar2.zza((zzalg<T>) t2, i7, i50);
                                                i49 = zzail.zza(zza8, zzalgVar2.zze(i50), bArr, i23, i2, (i64 & (-8)) | 4, zzaikVar);
                                                zzalgVar2.zza((zzalg<T>) t2, i7, i50, zza8);
                                                i11 = i50;
                                                i25 = i23;
                                                i8 = i64;
                                                if (i49 != i25) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzalgVar2 = this;
                                            i25 = i23;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i64;
                                            i49 = i25;
                                            if (i49 != i25) {
                                            }
                                            break;
                                    }
                                } else if (i57 == 2) {
                                    Unsafe unsafe12 = zzb;
                                    Object zzf = zzalgVar3.zzf(i50);
                                    zzaikVar4 = zzaikVar10;
                                    t2 = t;
                                    Object object = unsafe12.getObject(t2, j);
                                    if (zzalgVar3.zzr.zzf(object)) {
                                        Object zzb2 = zzalgVar3.zzr.zzb(zzf);
                                        zzalgVar3.zzr.zza(zzb2, object);
                                        unsafe12.putObject(t2, j, zzb2);
                                        object = zzb2;
                                    }
                                    zzakx<?, ?> zza9 = zzalgVar3.zzr.zza(zzf);
                                    Map<?, ?> zze = zzalgVar3.zzr.zze(object);
                                    int zzc2 = zzail.zzc(bArr2, i23, zzaikVar4);
                                    int i69 = zzaikVar4.zza;
                                    if (i69 >= 0 && i69 <= i2 - zzc2) {
                                        int i70 = zzc2 + i69;
                                        Object obj2 = zza9.zzb;
                                        Object obj3 = zza9.zzd;
                                        Object obj4 = obj2;
                                        while (zzc2 < i70) {
                                            int i71 = zzc2 + 1;
                                            byte b2 = bArr2[zzc2];
                                            if (b2 < 0) {
                                                i71 = zzail.zza(b2, bArr2, i71, zzaikVar4);
                                                b2 = zzaikVar4.zza;
                                            }
                                            Object obj5 = obj3;
                                            int i72 = b2 >>> 3;
                                            Object obj6 = obj4;
                                            int i73 = b2 & 7;
                                            if (i72 == 1) {
                                                i29 = i70;
                                                i30 = i64;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                if (i73 == zza9.zza.zza()) {
                                                    zzc2 = zza(bArr, i71, i2, zza9.zza, (Class<?>) null, zzaikVar);
                                                    obj4 = zzaikVar4.zzc;
                                                    i70 = i29;
                                                    obj3 = obj5;
                                                    i64 = i30;
                                                    unsafe10 = unsafe3;
                                                }
                                            } else if (i72 == 2) {
                                                if (i73 == zza9.zzc.zza()) {
                                                    zzc2 = zza(bArr, i71, i2, zza9.zzc, zza9.zzd.getClass(), zzaikVar);
                                                    obj3 = zzaikVar4.zzc;
                                                    i70 = i70;
                                                    obj4 = obj6;
                                                    i64 = i64;
                                                } else {
                                                    i29 = i70;
                                                    i30 = i64;
                                                    obj = obj6;
                                                    unsafe3 = unsafe10;
                                                }
                                            } else {
                                                obj3 = obj5;
                                                i29 = i70;
                                                i30 = i64;
                                                obj = obj6;
                                                unsafe3 = unsafe10;
                                                zzc2 = zzail.zza(b2, bArr2, i71, i2, zzaikVar4);
                                                i70 = i29;
                                                obj4 = obj;
                                                i64 = i30;
                                                unsafe10 = unsafe3;
                                            }
                                            obj3 = obj5;
                                            zzc2 = zzail.zza(b2, bArr2, i71, i2, zzaikVar4);
                                            i70 = i29;
                                            obj4 = obj;
                                            i64 = i30;
                                            unsafe10 = unsafe3;
                                        }
                                        int i74 = i70;
                                        i24 = i64;
                                        unsafe = unsafe10;
                                        Object obj7 = obj4;
                                        if (zzc2 != i74) {
                                            throw zzakf.zzg();
                                        }
                                        zze.put(obj7, obj3);
                                        if (i74 == i23) {
                                            zzalgVar2 = this;
                                            i6 = i3;
                                            i12 = i74;
                                            zzaikVar2 = zzaikVar4;
                                            i11 = i50;
                                            i7 = i56;
                                            i8 = i24;
                                        } else {
                                            i48 = i3;
                                            i49 = i74;
                                            zzaikVar9 = zzaikVar4;
                                            i47 = i2;
                                            i53 = i56;
                                            i52 = i9;
                                            i51 = i24;
                                            i54 = i10;
                                            unsafe8 = unsafe;
                                            zzalgVar3 = this;
                                        }
                                    }
                                } else {
                                    i24 = i64;
                                    zzaikVar4 = zzaikVar10;
                                    unsafe = unsafe10;
                                    t2 = t;
                                    zzalgVar2 = this;
                                    i6 = i3;
                                    i12 = i23;
                                    zzaikVar2 = zzaikVar4;
                                    i11 = i50;
                                    i7 = i56;
                                    i8 = i24;
                                }
                            } else {
                                long j3 = i59;
                                Unsafe unsafe13 = zzb;
                                zzakc zzakcVar4 = (zzakc) unsafe13.getObject(t2, j);
                                if (zzakcVar4.zzc()) {
                                    unsafe4 = unsafe9;
                                    zzakcVar = zzakcVar4;
                                } else {
                                    unsafe4 = unsafe9;
                                    zzakcVar = zzakcVar4.zza(zzakcVar4.size() << 1);
                                    unsafe13.putObject(t2, j, zzakcVar);
                                }
                                switch (i60) {
                                    case 18:
                                    case 35:
                                        i31 = i3;
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i32 = i61;
                                        i33 = i63;
                                        unsafe5 = unsafe4;
                                        i34 = i2;
                                        if (i57 == 2) {
                                            zzaji zzajiVar = (zzaji) zzakcVar;
                                            i35 = zzail.zzc(bArr2, i32, zzaikVar5);
                                            int i75 = zzaikVar5.zza;
                                            int i76 = i35 + i75;
                                            if (i76 > bArr2.length) {
                                                throw zzakf.zzj();
                                            }
                                            zzajiVar.zzc(zzajiVar.size() + (i75 / 8));
                                            while (i35 < i76) {
                                                zzajiVar.zza(zzail.zza(bArr2, i35));
                                                i35 += 8;
                                            }
                                            if (i35 != i76) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i57 == 1) {
                                                zzaji zzajiVar2 = (zzaji) zzakcVar;
                                                zzajiVar2.zza(zzail.zza(bArr2, i32));
                                                i35 = i32 + 8;
                                                while (i35 < i34) {
                                                    int zzc3 = zzail.zzc(bArr2, i35, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        zzajiVar2.zza(zzail.zza(bArr2, zzc3));
                                                        i35 = zzc3 + 8;
                                                    }
                                                }
                                            }
                                            i36 = i32;
                                            if (i36 == i32) {
                                                i12 = i36;
                                                zzalgVar2 = zzalgVar3;
                                                i6 = i31;
                                                i11 = i50;
                                                unsafe = unsafe5;
                                                i8 = i33;
                                                zzaikVar2 = zzaikVar5;
                                                i7 = i56;
                                                t2 = t;
                                                break;
                                            } else {
                                                i49 = i36;
                                                i48 = i31;
                                                unsafe8 = unsafe5;
                                                i51 = i33;
                                                i47 = i34;
                                                zzaikVar9 = zzaikVar5;
                                                i53 = i56;
                                                i52 = i9;
                                                i54 = i10;
                                                t2 = t;
                                            }
                                        }
                                        i36 = i35;
                                        if (i36 == i32) {
                                        }
                                    case 19:
                                    case 36:
                                        i31 = i3;
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i32 = i61;
                                        i33 = i63;
                                        unsafe5 = unsafe4;
                                        i34 = i2;
                                        if (i57 == 2) {
                                            zzajx zzajxVar = (zzajx) zzakcVar;
                                            i35 = zzail.zzc(bArr2, i32, zzaikVar5);
                                            int i77 = zzaikVar5.zza;
                                            int i78 = i35 + i77;
                                            if (i78 > bArr2.length) {
                                                throw zzakf.zzj();
                                            }
                                            zzajxVar.zzc(zzajxVar.size() + (i77 / 4));
                                            while (i35 < i78) {
                                                zzajxVar.zza(zzail.zzb(bArr2, i35));
                                                i35 += 4;
                                            }
                                            if (i35 != i78) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i57 == 5) {
                                                zzajx zzajxVar2 = (zzajx) zzakcVar;
                                                zzajxVar2.zza(zzail.zzb(bArr2, i32));
                                                i35 = i32 + 4;
                                                while (i35 < i34) {
                                                    int zzc4 = zzail.zzc(bArr2, i35, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        zzajxVar2.zza(zzail.zzb(bArr2, zzc4));
                                                        i35 = zzc4 + 4;
                                                    }
                                                }
                                            }
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        i36 = i35;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i31 = i3;
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i32 = i61;
                                        i33 = i63;
                                        unsafe5 = unsafe4;
                                        i34 = i2;
                                        if (i57 == 2) {
                                            zzakr zzakrVar = (zzakr) zzakcVar;
                                            i35 = zzail.zzc(bArr2, i32, zzaikVar5);
                                            int i79 = zzaikVar5.zza + i35;
                                            while (i35 < i79) {
                                                i35 = zzail.zzd(bArr2, i35, zzaikVar5);
                                                zzakrVar.zza(zzaikVar5.zzb);
                                            }
                                            if (i35 != i79) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                zzakr zzakrVar2 = (zzakr) zzakcVar;
                                                i35 = zzail.zzd(bArr2, i32, zzaikVar5);
                                                zzakrVar2.zza(zzaikVar5.zzb);
                                                while (i35 < i34) {
                                                    int zzc5 = zzail.zzc(bArr2, i35, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        i35 = zzail.zzd(bArr2, zzc5, zzaikVar5);
                                                        zzakrVar2.zza(zzaikVar5.zzb);
                                                    }
                                                }
                                            }
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        i36 = i35;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i37 = i61;
                                        i33 = i63;
                                        unsafe6 = unsafe4;
                                        i34 = i2;
                                        i38 = i3;
                                        if (i57 == 2) {
                                            i36 = zzail.zza(bArr2, i37, (zzakc<?>) zzakcVar, zzaikVar5);
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            if (i36 == i32) {
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                i32 = i37;
                                                i31 = i38;
                                                unsafe5 = unsafe6;
                                                i35 = zzail.zza(i33, bArr, i32, i2, (zzakc<?>) zzakcVar, zzaikVar);
                                                i36 = i35;
                                                if (i36 == i32) {
                                                }
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i37 = i61;
                                        i33 = i63;
                                        unsafe6 = unsafe4;
                                        i34 = i2;
                                        i38 = i3;
                                        if (i57 == 2) {
                                            zzakr zzakrVar3 = (zzakr) zzakcVar;
                                            i36 = zzail.zzc(bArr2, i37, zzaikVar5);
                                            int i80 = zzaikVar5.zza;
                                            int i81 = i36 + i80;
                                            if (i81 > bArr2.length) {
                                                throw zzakf.zzj();
                                            }
                                            zzakrVar3.zzc(zzakrVar3.size() + (i80 / 8));
                                            while (i36 < i81) {
                                                zzakrVar3.zza(zzail.zzd(bArr2, i36));
                                                i36 += 8;
                                            }
                                            if (i36 != i81) {
                                                throw zzakf.zzj();
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            if (i36 == i32) {
                                            }
                                        } else {
                                            if (i57 == 1) {
                                                zzakr zzakrVar4 = (zzakr) zzakcVar;
                                                zzakrVar4.zza(zzail.zzd(bArr2, i37));
                                                i39 = i37 + 8;
                                                while (i39 < i34) {
                                                    int zzc6 = zzail.zzc(bArr2, i39, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        zzakrVar4.zza(zzail.zzd(bArr2, zzc6));
                                                        i39 = zzc6 + 8;
                                                    } else {
                                                        i32 = i37;
                                                        i31 = i38;
                                                        i36 = i39;
                                                        unsafe5 = unsafe6;
                                                        if (i36 == i32) {
                                                        }
                                                    }
                                                }
                                                i32 = i37;
                                                i31 = i38;
                                                i36 = i39;
                                                unsafe5 = unsafe6;
                                                if (i36 == i32) {
                                                }
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i37 = i61;
                                        i33 = i63;
                                        unsafe6 = unsafe4;
                                        i34 = i2;
                                        i38 = i3;
                                        if (i57 == 2) {
                                            zzajz zzajzVar = (zzajz) zzakcVar;
                                            i36 = zzail.zzc(bArr2, i37, zzaikVar5);
                                            int i82 = zzaikVar5.zza;
                                            int i83 = i36 + i82;
                                            if (i83 > bArr2.length) {
                                                throw zzakf.zzj();
                                            }
                                            zzajzVar.zzd(zzajzVar.size() + (i82 / 4));
                                            while (i36 < i83) {
                                                zzajzVar.zzc(zzail.zzc(bArr2, i36));
                                                i36 += 4;
                                            }
                                            if (i36 != i83) {
                                                throw zzakf.zzj();
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            if (i36 == i32) {
                                            }
                                        } else {
                                            if (i57 == 5) {
                                                zzajz zzajzVar2 = (zzajz) zzakcVar;
                                                zzajzVar2.zzc(zzail.zzc(bArr2, i37));
                                                i39 = i37 + 4;
                                                while (i39 < i34) {
                                                    int zzc7 = zzail.zzc(bArr2, i39, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        zzajzVar2.zzc(zzail.zzc(bArr2, zzc7));
                                                        i39 = zzc7 + 4;
                                                    } else {
                                                        i32 = i37;
                                                        i31 = i38;
                                                        i36 = i39;
                                                        unsafe5 = unsafe6;
                                                        if (i36 == i32) {
                                                        }
                                                    }
                                                }
                                                i32 = i37;
                                                i31 = i38;
                                                i36 = i39;
                                                unsafe5 = unsafe6;
                                                if (i36 == i32) {
                                                }
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i37 = i61;
                                        i33 = i63;
                                        unsafe6 = unsafe4;
                                        i34 = i2;
                                        i38 = i3;
                                        if (i57 == 2) {
                                            zzain zzainVar = (zzain) zzakcVar;
                                            i36 = zzail.zzc(bArr2, i37, zzaikVar5);
                                            int i84 = zzaikVar5.zza + i36;
                                            while (i36 < i84) {
                                                i36 = zzail.zzd(bArr2, i36, zzaikVar5);
                                                zzainVar.zza(zzaikVar5.zzb != 0);
                                            }
                                            if (i36 != i84) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                zzain zzainVar2 = (zzain) zzakcVar;
                                                i36 = zzail.zzd(bArr2, i37, zzaikVar5);
                                                zzainVar2.zza(zzaikVar5.zzb != 0);
                                                while (i36 < i34) {
                                                    int zzc8 = zzail.zzc(bArr2, i36, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        i36 = zzail.zzd(bArr2, zzc8, zzaikVar5);
                                                        zzainVar2.zza(zzaikVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        i32 = i37;
                                        i31 = i38;
                                        unsafe5 = unsafe6;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 26:
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i37 = i61;
                                        i33 = i63;
                                        unsafe6 = unsafe4;
                                        i34 = i2;
                                        i38 = i3;
                                        if (i57 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                i36 = zzail.zzc(bArr2, i37, zzaikVar5);
                                                int i85 = zzaikVar5.zza;
                                                if (i85 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i85 == 0) {
                                                    zzakcVar.add("");
                                                } else {
                                                    zzakcVar.add(new String(bArr2, i36, i85, zzakb.zza));
                                                    i36 += i85;
                                                }
                                                while (i36 < i34) {
                                                    int zzc9 = zzail.zzc(bArr2, i36, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        i36 = zzail.zzc(bArr2, zzc9, zzaikVar5);
                                                        int i86 = zzaikVar5.zza;
                                                        if (i86 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i86 == 0) {
                                                            zzakcVar.add("");
                                                        } else {
                                                            zzakcVar.add(new String(bArr2, i36, i86, zzakb.zza));
                                                            i36 += i86;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i36 = zzail.zzc(bArr2, i37, zzaikVar5);
                                                int i87 = zzaikVar5.zza;
                                                if (i87 < 0) {
                                                    throw zzakf.zzf();
                                                }
                                                if (i87 == 0) {
                                                    zzakcVar.add("");
                                                } else {
                                                    int i88 = i36 + i87;
                                                    if (!zzamt.zzc(bArr2, i36, i88)) {
                                                        throw zzakf.zzd();
                                                    }
                                                    zzakcVar.add(new String(bArr2, i36, i87, zzakb.zza));
                                                    i36 = i88;
                                                }
                                                while (i36 < i34) {
                                                    int zzc10 = zzail.zzc(bArr2, i36, zzaikVar5);
                                                    if (i33 == zzaikVar5.zza) {
                                                        i36 = zzail.zzc(bArr2, zzc10, zzaikVar5);
                                                        int i89 = zzaikVar5.zza;
                                                        if (i89 < 0) {
                                                            throw zzakf.zzf();
                                                        }
                                                        if (i89 == 0) {
                                                            zzakcVar.add("");
                                                        } else {
                                                            int i90 = i36 + i89;
                                                            if (!zzamt.zzc(bArr2, i36, i90)) {
                                                                throw zzakf.zzd();
                                                            }
                                                            zzakcVar.add(new String(bArr2, i36, i89, zzakb.zza));
                                                            i36 = i90;
                                                        }
                                                    }
                                                }
                                            }
                                            i32 = i37;
                                            i31 = i38;
                                            unsafe5 = unsafe6;
                                            if (i36 == i32) {
                                            }
                                        }
                                        i32 = i37;
                                        i31 = i38;
                                        unsafe5 = unsafe6;
                                        i36 = i32;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 27:
                                        i31 = i3;
                                        i40 = i2;
                                        i41 = i58;
                                        zzaikVar6 = zzaikVar10;
                                        i42 = i61;
                                        i43 = i63;
                                        unsafe7 = unsafe4;
                                        if (i57 == 2) {
                                            zzaikVar5 = zzaikVar6;
                                            int zzb3 = zzail.zzb(zzalgVar3.zze(i41), i43, bArr, i42, i2, zzakcVar, zzaikVar);
                                            i34 = i40;
                                            i50 = i41;
                                            i31 = i31;
                                            unsafe5 = unsafe7;
                                            i33 = i43;
                                            i36 = zzb3;
                                            i32 = i42;
                                            if (i36 == i32) {
                                            }
                                        }
                                        zzaikVar5 = zzaikVar6;
                                        i33 = i43;
                                        i34 = i40;
                                        unsafe5 = unsafe7;
                                        i32 = i42;
                                        i50 = i41;
                                        i36 = i32;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 28:
                                        i31 = i3;
                                        i40 = i2;
                                        zzakc zzakcVar5 = zzakcVar;
                                        i41 = i58;
                                        zzaikVar6 = zzaikVar10;
                                        i42 = i61;
                                        i43 = i63;
                                        unsafe7 = unsafe4;
                                        if (i57 == 2) {
                                            int zzc11 = zzail.zzc(bArr2, i42, zzaikVar6);
                                            int i91 = zzaikVar6.zza;
                                            if (i91 < 0) {
                                                throw zzakf.zzf();
                                            }
                                            if (i91 > bArr2.length - zzc11) {
                                                throw zzakf.zzj();
                                            }
                                            if (i91 == 0) {
                                                zzakcVar2 = zzakcVar5;
                                                zzakcVar2.add(zzaip.zza);
                                            } else {
                                                zzakcVar2 = zzakcVar5;
                                                zzakcVar2.add(zzaip.zza(bArr2, zzc11, i91));
                                                zzc11 += i91;
                                            }
                                            while (zzc11 < i40) {
                                                int zzc12 = zzail.zzc(bArr2, zzc11, zzaikVar6);
                                                if (i43 == zzaikVar6.zza) {
                                                    zzc11 = zzail.zzc(bArr2, zzc12, zzaikVar6);
                                                    int i92 = zzaikVar6.zza;
                                                    if (i92 < 0) {
                                                        throw zzakf.zzf();
                                                    }
                                                    if (i92 > bArr2.length - zzc11) {
                                                        throw zzakf.zzj();
                                                    }
                                                    if (i92 == 0) {
                                                        zzakcVar2.add(zzaip.zza);
                                                    } else {
                                                        zzakcVar2.add(zzaip.zza(bArr2, zzc11, i92));
                                                        zzc11 += i92;
                                                    }
                                                } else {
                                                    i36 = zzc11;
                                                    zzaikVar5 = zzaikVar6;
                                                    i33 = i43;
                                                    i34 = i40;
                                                    unsafe5 = unsafe7;
                                                    i32 = i42;
                                                    i50 = i41;
                                                    if (i36 == i32) {
                                                    }
                                                }
                                            }
                                            i36 = zzc11;
                                            zzaikVar5 = zzaikVar6;
                                            i33 = i43;
                                            i34 = i40;
                                            unsafe5 = unsafe7;
                                            i32 = i42;
                                            i50 = i41;
                                            if (i36 == i32) {
                                            }
                                        }
                                        zzaikVar5 = zzaikVar6;
                                        i33 = i43;
                                        i34 = i40;
                                        unsafe5 = unsafe7;
                                        i32 = i42;
                                        i50 = i41;
                                        i36 = i32;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i44 = i58;
                                        zzaikVar7 = zzaikVar10;
                                        i45 = i61;
                                        i46 = i63;
                                        if (i57 == 2) {
                                            i31 = i3;
                                            zzaikVar8 = zzaikVar7;
                                            zza4 = zzail.zza(bArr2, i45, (zzakc<?>) zzakcVar, zzaikVar7);
                                            i41 = i44;
                                            i40 = i2;
                                            i42 = i45;
                                            zzakcVar3 = zzakcVar;
                                            unsafe7 = unsafe4;
                                        } else {
                                            if (i57 == 0) {
                                                zzaikVar8 = zzaikVar7;
                                                i41 = i44;
                                                i40 = i2;
                                                i42 = i45;
                                                i31 = i3;
                                                zzakcVar3 = zzakcVar;
                                                unsafe7 = unsafe4;
                                                zza4 = zzail.zza(i46, bArr, i45, i2, (zzakc<?>) zzakcVar, zzaikVar);
                                            }
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i32 = i45;
                                            i33 = i46;
                                            unsafe5 = unsafe4;
                                            i34 = i2;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        zzalx.zza(t, i56, zzakcVar3, zzalgVar3.zzd(i41), null, zzalgVar3.zzp);
                                        zzaikVar5 = zzaikVar8;
                                        i33 = i46;
                                        i36 = zza4;
                                        i34 = i40;
                                        unsafe5 = unsafe7;
                                        i32 = i42;
                                        i50 = i41;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i44 = i58;
                                        zzaikVar7 = zzaikVar10;
                                        i45 = i61;
                                        i46 = i63;
                                        if (i57 == 2) {
                                            zzajz zzajzVar3 = (zzajz) zzakcVar;
                                            i36 = zzail.zzc(bArr2, i45, zzaikVar7);
                                            int i93 = zzaikVar7.zza + i36;
                                            while (i36 < i93) {
                                                i36 = zzail.zzc(bArr2, i36, zzaikVar7);
                                                zzajzVar3.zzc(zzajb.zze(zzaikVar7.zza));
                                            }
                                            if (i36 != i93) {
                                                throw zzakf.zzj();
                                            }
                                        } else {
                                            if (i57 == 0) {
                                                zzajz zzajzVar4 = (zzajz) zzakcVar;
                                                i36 = zzail.zzc(bArr2, i45, zzaikVar7);
                                                zzajzVar4.zzc(zzajb.zze(zzaikVar7.zza));
                                                while (i36 < i2) {
                                                    int zzc13 = zzail.zzc(bArr2, i36, zzaikVar7);
                                                    if (i46 == zzaikVar7.zza) {
                                                        i36 = zzail.zzc(bArr2, zzc13, zzaikVar7);
                                                        zzajzVar4.zzc(zzajb.zze(zzaikVar7.zza));
                                                    }
                                                }
                                            }
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i32 = i45;
                                            i33 = i46;
                                            unsafe5 = unsafe4;
                                            i34 = i2;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        i31 = i3;
                                        zzaikVar5 = zzaikVar7;
                                        i50 = i44;
                                        i32 = i45;
                                        i33 = i46;
                                        unsafe5 = unsafe4;
                                        i34 = i2;
                                        if (i36 == i32) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i44 = i58;
                                        zzaikVar7 = zzaikVar10;
                                        i45 = i61;
                                        if (i57 == 2) {
                                            zzakr zzakrVar5 = (zzakr) zzakcVar;
                                            i36 = zzail.zzc(bArr2, i45, zzaikVar7);
                                            int i94 = zzaikVar7.zza + i36;
                                            while (i36 < i94) {
                                                i36 = zzail.zzd(bArr2, i36, zzaikVar7);
                                                zzakrVar5.zza(zzajb.zza(zzaikVar7.zzb));
                                            }
                                            if (i36 != i94) {
                                                throw zzakf.zzj();
                                            }
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i34 = i2;
                                            i32 = i45;
                                            i33 = i63;
                                            unsafe5 = unsafe4;
                                            if (i36 == i32) {
                                            }
                                        } else if (i57 == 0) {
                                            zzakr zzakrVar6 = (zzakr) zzakcVar;
                                            i36 = zzail.zzd(bArr2, i45, zzaikVar7);
                                            zzakrVar6.zza(zzajb.zza(zzaikVar7.zzb));
                                            while (true) {
                                                if (i36 < i2) {
                                                    int zzc14 = zzail.zzc(bArr2, i36, zzaikVar7);
                                                    i46 = i63;
                                                    if (i46 == zzaikVar7.zza) {
                                                        i36 = zzail.zzd(bArr2, zzc14, zzaikVar7);
                                                        zzakrVar6.zza(zzajb.zza(zzaikVar7.zzb));
                                                        i63 = i46;
                                                    }
                                                } else {
                                                    i46 = i63;
                                                }
                                            }
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i32 = i45;
                                            i33 = i46;
                                            unsafe5 = unsafe4;
                                            i34 = i2;
                                            if (i36 == i32) {
                                            }
                                        } else {
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i34 = i2;
                                            i32 = i45;
                                            i33 = i63;
                                            unsafe5 = unsafe4;
                                            i36 = i32;
                                            if (i36 == i32) {
                                            }
                                        }
                                        break;
                                    case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                                        if (i57 == 3) {
                                            i45 = i61;
                                            i44 = i58;
                                            zzaikVar7 = zzaikVar10;
                                            i36 = zzail.zza(zzalgVar3.zze(i58), i63, bArr, i45, i2, (zzakc<?>) zzakcVar, zzaikVar);
                                            i31 = i3;
                                            zzaikVar5 = zzaikVar7;
                                            i50 = i44;
                                            i34 = i2;
                                            i32 = i45;
                                            i33 = i63;
                                            unsafe5 = unsafe4;
                                            if (i36 == i32) {
                                            }
                                        }
                                        break;
                                    default:
                                        i31 = i3;
                                        i50 = i58;
                                        zzaikVar5 = zzaikVar10;
                                        i32 = i61;
                                        i33 = i63;
                                        unsafe5 = unsafe4;
                                        i34 = i2;
                                        i36 = i32;
                                        if (i36 == i32) {
                                        }
                                        break;
                                }
                            }
                        } else if (i57 == 2) {
                            zzakc zzakcVar6 = (zzakc) unsafe9.getObject(t2, j);
                            if (!zzakcVar6.zzc()) {
                                int size = zzakcVar6.size();
                                zzakcVar6 = zzakcVar6.zza(size == 0 ? 10 : size << 1);
                                unsafe9.putObject(t2, j, zzakcVar6);
                            }
                            i49 = zzail.zzb(zzalgVar3.zze(i58), i63, bArr, i61, i2, zzakcVar6, zzaikVar);
                            zzaikVar9 = zzaikVar10;
                            i50 = i58;
                            i47 = i2;
                            unsafe8 = unsafe9;
                            i53 = i56;
                            i51 = i63;
                            i52 = i9;
                            i54 = i10;
                            i48 = i3;
                        } else {
                            unsafe = unsafe9;
                            i23 = i61;
                            i50 = i58;
                            zzaikVar4 = zzaikVar10;
                            i24 = i63;
                            zzalgVar2 = this;
                            i6 = i3;
                            i12 = i23;
                            zzaikVar2 = zzaikVar4;
                            i11 = i50;
                            i7 = i56;
                            i8 = i24;
                        }
                    } else {
                        int i95 = iArr[i58 + 2];
                        int i96 = 1 << (i95 >>> 20);
                        int i97 = 1048575;
                        int i98 = i95 & 1048575;
                        if (i98 != i54) {
                            if (i54 != 1048575) {
                                unsafe8.putInt(t2, i54, i52);
                                i97 = 1048575;
                            }
                            i10 = i98;
                            i9 = i98 == i97 ? 0 : unsafe8.getInt(t2, i98);
                        } else {
                            i9 = i52;
                            i10 = i54;
                        }
                        switch (i60) {
                            case 0:
                                i15 = i2;
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 1) {
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    zzamp.zza(t2, j, zzail.zza(bArr2, i14));
                                    i18 = i14 + 8;
                                    i21 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 1:
                                i15 = i2;
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 5) {
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    zzamp.zza((Object) t2, j, zzail.zzb(bArr2, i14));
                                    i18 = i14 + 4;
                                    i21 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 2:
                            case 3:
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 0) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    int zzd4 = zzail.zzd(bArr2, i14, zzaikVar3);
                                    unsafe2.putLong(t, j, zzaikVar3.zzb);
                                    i20 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i49 = zzd4;
                                    i48 = i19;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i52 = i20;
                                }
                            case 4:
                            case 11:
                                i15 = i2;
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 0) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    i18 = zzail.zzc(bArr2, i14, zzaikVar3);
                                    unsafe2.putInt(t2, j, zzaikVar3.zza);
                                    i21 = i9 | i96;
                                    i48 = i19;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 5:
                            case 14:
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 1) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    unsafe2.putLong(t, j, zzail.zzd(bArr2, i14));
                                    i18 = i14 + 8;
                                    i21 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i48 = i19;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 6:
                            case 13:
                                i15 = i2;
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 5) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    unsafe2.putInt(t2, j, zzail.zzc(bArr2, i14));
                                    i18 = i14 + 4;
                                    i21 = i9 | i96;
                                    i48 = i19;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 7:
                                i15 = i2;
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 0) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    i18 = zzail.zzd(bArr2, i14, zzaikVar3);
                                    zzamp.zzc(t2, j, zzaikVar3.zzb != 0);
                                    i21 = i9 | i96;
                                    i48 = i19;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 8:
                                i15 = i2;
                                i19 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 2) {
                                    i48 = i19;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    if (zzg(i59)) {
                                        i18 = zzail.zzb(bArr2, i14, zzaikVar3);
                                    } else {
                                        i18 = zzail.zzc(bArr2, i14, zzaikVar3);
                                        int i99 = zzaikVar3.zza;
                                        if (i99 < 0) {
                                            throw zzakf.zzf();
                                        }
                                        if (i99 == 0) {
                                            zzaikVar3.zzc = "";
                                        } else {
                                            zzaikVar3.zzc = new String(bArr2, i18, i99, zzakb.zza);
                                            i18 += i99;
                                        }
                                    }
                                    unsafe2.putObject(t2, j, zzaikVar3.zzc);
                                    i21 = i9 | i96;
                                    i48 = i19;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 9:
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i22 = i62;
                                i14 = i61;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 2) {
                                    i16 = i22;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    Object zza10 = zzalgVar3.zza((zzalg<T>) t2, i13);
                                    i16 = i22;
                                    i18 = zzail.zza(zza10, zzalgVar3.zze(i13), bArr, i14, i2, zzaikVar);
                                    zzalgVar3.zza((zzalg<T>) t2, i13, zza10);
                                    i21 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i48 = i48;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 10:
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i22 = i62;
                                i14 = i61;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 2) {
                                    i16 = i22;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    i18 = zzail.zza(bArr2, i14, zzaikVar3);
                                    unsafe2.putObject(t2, j, zzaikVar3.zzc);
                                    i21 = i9 | i96;
                                    i51 = i22;
                                    unsafe8 = unsafe2;
                                    i47 = i2;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 12:
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 0) {
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    int zzc15 = zzail.zzc(bArr2, i14, zzaikVar3);
                                    int i100 = zzaikVar3.zza;
                                    zzakd zzd5 = zzalgVar3.zzd(i13);
                                    if ((i59 & Integer.MIN_VALUE) == 0 || zzd5 == null || zzd5.zza(i100)) {
                                        unsafe2.putInt(t2, j, i100);
                                        i51 = i16;
                                        unsafe8 = unsafe2;
                                        i47 = i2;
                                        i50 = i13;
                                        zzaikVar9 = zzaikVar3;
                                        i53 = i17;
                                        i54 = i10;
                                        i52 = i9 | i96;
                                    } else {
                                        zzc(t).zza(i16, Long.valueOf(i100));
                                        i51 = i16;
                                        unsafe8 = unsafe2;
                                        i47 = i2;
                                        i50 = i13;
                                        zzaikVar9 = zzaikVar3;
                                        i53 = i17;
                                        i52 = i9;
                                        i54 = i10;
                                    }
                                    i49 = zzc15;
                                }
                            case 15:
                                i15 = i2;
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                if (i57 != 0) {
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    i18 = zzail.zzc(bArr2, i14, zzaikVar3);
                                    unsafe2.putInt(t2, j, zzajb.zze(zzaikVar3.zza));
                                    i21 = i9 | i96;
                                    unsafe8 = unsafe2;
                                    i47 = i15;
                                    i50 = i13;
                                    zzaikVar9 = zzaikVar3;
                                    i53 = i17;
                                    i51 = i16;
                                    i54 = i10;
                                    i49 = i18;
                                    i52 = i21;
                                }
                            case 16:
                                if (i57 != 0) {
                                    zzaikVar3 = zzaikVar9;
                                    unsafe2 = unsafe8;
                                    i13 = i58;
                                    i17 = i56;
                                    i14 = i61;
                                    i48 = i3;
                                    i16 = i62;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    int zzd6 = zzail.zzd(bArr2, i61, zzaikVar9);
                                    unsafe8.putLong(t, j, zzajb.zza(zzaikVar9.zzb));
                                    i20 = i9 | i96;
                                    unsafe8 = unsafe8;
                                    i47 = i2;
                                    i48 = i3;
                                    i50 = i58;
                                    zzaikVar9 = zzaikVar9;
                                    i53 = i56;
                                    i51 = i62;
                                    i54 = i10;
                                    i49 = zzd6;
                                    i52 = i20;
                                }
                            case 17:
                                if (i57 != 3) {
                                    i48 = i3;
                                    zzaikVar3 = zzaikVar9;
                                    i13 = i58;
                                    i14 = i61;
                                    i16 = i62;
                                    i17 = i56;
                                    unsafe2 = unsafe8;
                                    i6 = i48;
                                    zzalgVar2 = zzalgVar3;
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i11 = i13;
                                    zzaikVar2 = zzaikVar3;
                                    i7 = i17;
                                    i8 = i16;
                                    break;
                                } else {
                                    Object zza11 = zzalgVar3.zza((zzalg<T>) t2, i58);
                                    i49 = zzail.zza(zza11, zzalgVar3.zze(i58), bArr, i61, i2, (i56 << 3) | 4, zzaikVar);
                                    zzalgVar3.zza((zzalg<T>) t2, i58, zza11);
                                    i52 = i9 | i96;
                                    i51 = i62;
                                    i50 = i58;
                                    i53 = i56;
                                    i54 = i10;
                                    i47 = i2;
                                    i48 = i3;
                                }
                            default:
                                i48 = i3;
                                zzaikVar3 = zzaikVar9;
                                i13 = i58;
                                i14 = i61;
                                i16 = i62;
                                i17 = i56;
                                unsafe2 = unsafe8;
                                i6 = i48;
                                zzalgVar2 = zzalgVar3;
                                unsafe = unsafe2;
                                i12 = i14;
                                i11 = i13;
                                zzaikVar2 = zzaikVar3;
                                i7 = i17;
                                i8 = i16;
                                break;
                        }
                    }
                } else {
                    unsafe = unsafe8;
                    i6 = i48;
                    zzalgVar2 = zzalgVar3;
                    i7 = i56;
                    i8 = i5;
                    i9 = i52;
                    i10 = i54;
                    i11 = 0;
                    zzaikVar2 = zzaikVar9;
                    i12 = i55;
                }
                if (i8 != i6 || i6 == 0) {
                    if (zzalgVar2.zzh && zzaikVar2.zzd != zzajk.zza) {
                        int i101 = i8;
                        i49 = zzail.zza(i8, bArr, i12, i2, t, zzalgVar2.zzg, zzalgVar2.zzp, zzaikVar);
                        bArr2 = bArr;
                        i53 = i7;
                        zzaikVar9 = zzaikVar2;
                        i50 = i11;
                        i51 = i101;
                        i52 = i9;
                        i54 = i10;
                        i47 = i2;
                        zzalgVar3 = zzalgVar2;
                        i48 = i6;
                    } else {
                        int i102 = i8;
                        int i103 = i7;
                        zzalg<T> zzalgVar4 = zzalgVar2;
                        i49 = zzail.zza(i102, bArr, i12, i2, zzc(t), zzaikVar);
                        bArr2 = bArr;
                        i47 = i2;
                        zzaikVar9 = zzaikVar2;
                        i48 = i6;
                        i53 = i103;
                        zzalgVar3 = zzalgVar4;
                        i50 = i11;
                        i51 = i102;
                        i52 = i9;
                        i54 = i10;
                    }
                    unsafe8 = unsafe;
                } else {
                    i49 = i12;
                    i4 = i6;
                    zzalgVar = zzalgVar2;
                    i51 = i8;
                    i52 = i9;
                    i54 = i10;
                }
            } else {
                unsafe = unsafe8;
                i4 = i48;
                zzalgVar = zzalgVar3;
            }
        }
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
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

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzamp.zze(t, j)).longValue();
    }

    private final zzakd zzd(int i) {
        return (zzakd) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzalg<T> zza(Class<T> cls, zzala zzalaVar, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
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
        zzalt zzaltVar;
        int i19;
        int objectFieldOffset;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        Field zza2;
        int i24;
        char charAt11;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (zzalaVar instanceof zzalt) {
            zzalt zzaltVar2 = (zzalt) zzalaVar;
            String zzd = zzaltVar2.zzd();
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
                i6 = 0;
                charAt = 0;
                charAt2 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                iArr = zza;
                i2 = 0;
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
                int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
                int i60 = (charAt17 << 1) + charAt18;
                i2 = charAt17;
                i3 = charAt22;
                i33 = i57;
                i4 = charAt20;
                i5 = charAt19;
                i6 = i60;
                iArr = iArr2;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzaltVar2.zze();
            Class<?> cls2 = zzaltVar2.zza().getClass();
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i61 = i3 + charAt2;
            int i62 = i3;
            int i63 = i61;
            int i64 = 0;
            int i65 = 0;
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
                        i16 = length;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i71 |= (charAt13 & 8191) << i73;
                        i73 += 13;
                        i72 = i29;
                        length = i16;
                    }
                    charAt24 = i71 | (charAt13 << i73);
                    i17 = i29;
                } else {
                    i16 = length;
                    i17 = i70;
                }
                int i74 = charAt24 & 255;
                int i75 = i4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i65] = i64;
                    i65++;
                }
                int i76 = i5;
                if (i74 >= 51) {
                    int i77 = i17 + 1;
                    int charAt25 = zzd.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i78 = charAt25 & 8191;
                        int i79 = 13;
                        while (true) {
                            i28 = i77 + 1;
                            charAt12 = zzd.charAt(i77);
                            if (charAt12 < c2) {
                                break;
                            }
                            i78 |= (charAt12 & 8191) << i79;
                            i79 += 13;
                            i77 = i28;
                            c2 = 55296;
                        }
                        charAt25 = i78 | (charAt12 << i79);
                        i77 = i28;
                    }
                    int i80 = i74 - 51;
                    int i81 = i77;
                    if (i80 == 9 || i80 == 17) {
                        i26 = 1;
                        i27 = i6 + 1;
                        objArr[((i64 / 3) << 1) + 1] = zze[i6];
                    } else if (i80 == 12 && (zzaltVar2.zzb().equals(zzalo.PROTO2) || (charAt24 & 2048) != 0)) {
                        i26 = 1;
                        i27 = i6 + 1;
                        objArr[((i64 / 3) << 1) + 1] = zze[i6];
                    } else {
                        i26 = 1;
                        int i82 = charAt25 << i26;
                        obj = zze[i82];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i82] = zza3;
                        }
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                        int i83 = i82 + 1;
                        obj2 = zze[i83];
                        int i84 = i6;
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i83] = zza4;
                        }
                        i21 = (int) unsafe.objectFieldOffset(zza4);
                        str = zzd;
                        objectFieldOffset = objectFieldOffset2;
                        i20 = i84;
                        i23 = 0;
                        zzaltVar = zzaltVar2;
                        i18 = charAt23;
                        i22 = i81;
                    }
                    i6 = i27;
                    int i822 = charAt25 << i26;
                    obj = zze[i822];
                    if (!(obj instanceof Field)) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                    int i832 = i822 + 1;
                    obj2 = zze[i832];
                    int i842 = i6;
                    if (!(obj2 instanceof Field)) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    objectFieldOffset = objectFieldOffset22;
                    i20 = i842;
                    i23 = 0;
                    zzaltVar = zzaltVar2;
                    i18 = charAt23;
                    i22 = i81;
                } else {
                    int i85 = i6 + 1;
                    Field zza5 = zza(cls2, (String) zze[i6]);
                    i18 = charAt23;
                    if (i74 == 9 || i74 == 17) {
                        zzaltVar = zzaltVar2;
                        objArr[((i64 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i74 == 27 || i74 == 49) {
                            zzaltVar = zzaltVar2;
                            i25 = i6 + 2;
                            objArr[((i64 / 3) << 1) + 1] = zze[i85];
                        } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                            zzaltVar = zzaltVar2;
                            if (zzaltVar2.zzb() == zzalo.PROTO2 || (charAt24 & 2048) != 0) {
                                i25 = i6 + 2;
                                objArr[((i64 / 3) << 1) + 1] = zze[i85];
                            }
                        } else if (i74 == 50) {
                            int i86 = i62 + 1;
                            iArr[i62] = i64;
                            int i87 = (i64 / 3) << 1;
                            int i88 = i6 + 2;
                            objArr[i87] = zze[i85];
                            if ((charAt24 & 2048) != 0) {
                                i85 = i6 + 3;
                                objArr[i87 + 1] = zze[i88];
                                zzaltVar = zzaltVar2;
                                i62 = i86;
                            } else {
                                i62 = i86;
                                zzaltVar = zzaltVar2;
                                i19 = i88;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                                if ((charAt24 & 4096) != 0 || i74 > 17) {
                                    i20 = i19;
                                    str = zzd;
                                    i21 = 1048575;
                                    i22 = i17;
                                    i23 = 0;
                                } else {
                                    i22 = i17 + 1;
                                    int charAt26 = zzd.charAt(i17);
                                    if (charAt26 >= 55296) {
                                        int i89 = charAt26 & 8191;
                                        int i90 = 13;
                                        while (true) {
                                            i24 = i22 + 1;
                                            charAt11 = zzd.charAt(i22);
                                            if (charAt11 < 55296) {
                                                break;
                                            }
                                            i89 |= (charAt11 & 8191) << i90;
                                            i90 += 13;
                                            i22 = i24;
                                        }
                                        charAt26 = i89 | (charAt11 << i90);
                                        i22 = i24;
                                    }
                                    int i91 = (i2 << 1) + (charAt26 / 32);
                                    Object obj3 = zze[i91];
                                    if (obj3 instanceof Field) {
                                        zza2 = (Field) obj3;
                                    } else {
                                        zza2 = zza(cls2, (String) obj3);
                                        zze[i91] = zza2;
                                    }
                                    i20 = i19;
                                    str = zzd;
                                    i23 = charAt26 % 32;
                                    i21 = (int) unsafe.objectFieldOffset(zza2);
                                }
                                if (i74 >= 18 && i74 <= 49) {
                                    iArr[i63] = objectFieldOffset;
                                    i63++;
                                }
                            }
                        } else {
                            zzaltVar = zzaltVar2;
                        }
                        i19 = i25;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) != 0) {
                        }
                        i20 = i19;
                        str = zzd;
                        i21 = 1048575;
                        i22 = i17;
                        i23 = 0;
                        if (i74 >= 18) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                    }
                    i19 = i85;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = i19;
                    str = zzd;
                    i21 = 1048575;
                    i22 = i17;
                    i23 = 0;
                    if (i74 >= 18) {
                    }
                }
                int i92 = i64 + 1;
                iArr3[i64] = i18;
                int i93 = i64 + 2;
                Class<?> cls3 = cls2;
                int i94 = i22;
                iArr3[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | objectFieldOffset;
                i64 += 3;
                iArr3[i93] = (i23 << 20) | i21;
                zzd = str;
                i4 = i75;
                i6 = i20;
                zzaltVar2 = zzaltVar;
                length = i16;
                i5 = i76;
                cls2 = cls3;
                i33 = i94;
                c = 55296;
            }
            return new zzalg<>(iArr3, objArr, i5, i4, zzaltVar2.zza(), false, iArr, i3, i61, zzalkVar, zzakmVar, zzamoVar, zzajmVar, zzakzVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzalv zze(int i) {
        int i2 = (i / 3) << 1;
        zzalv zzalvVar = (zzalv) this.zzd[i2];
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zza2 = zzalr.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    static zzamn zzc(Object obj) {
        zzajy zzajyVar = (zzajy) obj;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar != zzamn.zzc()) {
            return zzamnVar;
        }
        zzamn zzd = zzamn.zzd();
        zzajyVar.zzb = zzd;
        return zzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzamo<UT, UB> zzamoVar, Object obj2) {
        zzakd zzd;
        int i2 = this.zzc[i];
        Object zze = zzamp.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(zze), zzd, (zzakd) ub, (zzamo<UT, zzakd>) zzamoVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar, Object obj) {
        zzakx<?, ?> zza2 = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakdVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamoVar.zzc(obj);
                }
                zzaiu zzc = zzaip.zzc(zzaku.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzaku.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzamoVar.zza((zzamo<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzalv zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzalg<T>) t, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzalv zze = zze(i2);
        if (!zzc((zzalg<T>) t, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    private zzalg(int[] iArr, Object[] objArr, int i, int i2, zzalc zzalcVar, boolean z, int[] iArr2, int i3, int i4, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzalcVar instanceof zzajy;
        this.zzh = zzajmVar != null && zzajmVar.zza(zzalcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzalkVar;
        this.zzo = zzakmVar;
        this.zzp = zzamoVar;
        this.zzq = zzajmVar;
        this.zzg = zzalcVar;
        this.zzr = zzakzVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t) {
        if (zzg(t)) {
            if (t instanceof zzajy) {
                zzajy zzajyVar = (zzajy) t;
                zzajyVar.zzb(Integer.MAX_VALUE);
                zzajyVar.zza = 0;
                zzajyVar.zzt();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzalg<T>) t, this.zzc[i], i)) {
                            zze(i).zzd(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i2) {
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
                                this.zzo.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzc((zzalg<T>) t, i)) {
                    zze(i).zzd(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza(t, j, zzamp.zza(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzb(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzd(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzd(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzd(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zzc(t, j, zzamp.zzh(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza(t, j, zzamp.zze(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza(t, j, zzamp.zze(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzd(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzc(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzalg<T>) t2, i)) {
                        zzamp.zza((Object) t, j, zzamp.zzd(t2, j));
                        zzb((zzalg<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
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
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzalx.zza(this.zzr, t, t2, j);
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
                    if (zzc((zzalg<T>) t2, i2, i)) {
                        zzamp.zza(t, j, zzamp.zze(t2, j));
                        zzb((zzalg<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                    if (zzc((zzalg<T>) t2, i2, i)) {
                        zzamp.zza(t, j, zzamp.zze(t2, j));
                        zzb((zzalg<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzalx.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzalx.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x065b A[LOOP:3: B:217:0x0657->B:219:0x065b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0625 A[Catch: all -> 0x0297, TryCatch #4 {all -> 0x0297, blocks: (B:201:0x05f6, B:35:0x0620, B:37:0x0625, B:38:0x062a, B:29:0x00cc, B:52:0x00de, B:54:0x00f0, B:56:0x0102, B:58:0x0113, B:60:0x0124, B:62:0x012e, B:65:0x0135, B:66:0x013b, B:68:0x0148, B:70:0x0159, B:72:0x0166, B:74:0x0177, B:76:0x0182, B:78:0x0193, B:80:0x01a4, B:82:0x01b5, B:84:0x01c6, B:86:0x01d7, B:88:0x01e8, B:90:0x01f9, B:92:0x020b, B:94:0x021b, B:95:0x023c, B:96:0x0225, B:98:0x022d, B:100:0x024d, B:102:0x025f, B:104:0x026d, B:106:0x027b, B:108:0x0289), top: B:200:0x05f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzals] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzals zzalsVar, zzajk zzajkVar) throws IOException {
        zzamo zzamoVar;
        T t2;
        int i;
        zzamo zzamoVar2;
        T t3;
        zzajm<?> zzajmVar;
        zzajk zzajkVar2;
        Object obj;
        Object obj2;
        T t4 = t;
        zzajk zzajkVar3 = zzajkVar;
        zzajkVar.getClass();
        zzf(t);
        zzamo zzamoVar3 = this.zzp;
        zzajm<?> zzajmVar2 = this.zzq;
        Object obj3 = null;
        zzajr<?> zzajrVar = null;
        while (true) {
            try {
                int zzc = zzalsVar.zzc();
                int zza2 = zza(zzc);
                if (zza2 < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                            obj3 = zza((Object) t, this.zzk[i2], (int) obj3, (zzamo<UT, int>) zzamoVar3, (Object) t);
                        }
                        if (obj3 != null) {
                            zzamoVar3.zzb((Object) t4, (T) obj3);
                            return;
                        }
                        return;
                    }
                    try {
                        Object zza3 = !this.zzh ? null : zzajmVar2.zza(zzajkVar3, this.zzg, zzc);
                        if (zza3 != null) {
                            if (zzajrVar == null) {
                                zzajrVar = zzajmVar2.zzb(t4);
                            }
                            zzajr<?> zzajrVar2 = zzajrVar;
                            zzamoVar2 = zzamoVar3;
                            t3 = t4;
                            try {
                                obj3 = zzajmVar2.zza(t, zzalsVar, zza3, zzajkVar, zzajrVar2, obj3, zzamoVar2);
                                zzajrVar = zzajrVar2;
                            } catch (Throwable th) {
                                th = th;
                                t2 = t3;
                                zzamoVar = zzamoVar2;
                                for (i = this.zzl; i < this.zzm; i++) {
                                    obj3 = zza((Object) t, this.zzk[i], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t);
                                }
                                if (obj3 != null) {
                                    zzamoVar.zzb((Object) t2, (T) obj3);
                                }
                                throw th;
                            }
                        } else {
                            zzamoVar2 = zzamoVar3;
                            t3 = t4;
                            zzamoVar2.zza((zzals) zzalsVar);
                            if (obj3 == null) {
                                obj3 = zzamoVar2.zzc(t3);
                            }
                            if (!zzamoVar2.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                int i3 = this.zzl;
                                while (i3 < this.zzm) {
                                    zzamo zzamoVar4 = zzamoVar2;
                                    obj3 = zza((Object) t, this.zzk[i3], (int) obj3, (zzamo<UT, int>) zzamoVar4, (Object) t);
                                    i3++;
                                    t3 = t3;
                                    zzamoVar2 = zzamoVar4;
                                }
                                Object obj4 = t3;
                                zzamo zzamoVar5 = zzamoVar2;
                                if (obj3 != null) {
                                    zzamoVar5.zzb(obj4, obj3);
                                    return;
                                }
                                return;
                            }
                        }
                        t4 = t3;
                        zzamoVar3 = zzamoVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        zzamoVar = zzamoVar3;
                        t2 = t4;
                    }
                } else {
                    zzamoVar = zzamoVar3;
                    t2 = t4;
                    try {
                        int zzc2 = zzc(zza2);
                        switch ((267386880 & zzc2) >>> 20) {
                            case 0:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t2, zzc2 & 1048575, zzalsVar.zza());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 1:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzb());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 2:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzl());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 3:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzo());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 4:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzg());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 5:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzk());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 6:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzf());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 7:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zzc(t2, zzc2 & 1048575, zzalsVar.zzs());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 8:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zza((Object) t2, zzc2, (zzals) zzalsVar);
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 9:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar = (zzalc) zza((zzalg<T>) t2, zza2);
                                zzalsVar.zzb(zzalcVar, zze(zza2), zzajkVar2);
                                zza((zzalg<T>) t2, zza2, zzalcVar);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 10:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza(t2, zzc2 & 1048575, zzalsVar.zzp());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 11:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzj());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 12:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                int zze = zzalsVar.zze();
                                zzakd zzd = zzd(zza2);
                                if (zzd != null && !zzd.zza(zze)) {
                                    obj3 = zzalx.zza(t2, zzc, zze, obj2, zzamoVar);
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t4 = t2;
                                    break;
                                }
                                zzamp.zza((Object) t2, zzc2 & 1048575, zze);
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 13:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzh());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 14:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzm());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 15:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzi());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 16:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzamp.zza((Object) t2, zzc2 & 1048575, zzalsVar.zzn());
                                zzb((zzalg<T>) t2, zza2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 17:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalc zzalcVar2 = (zzalc) zza((zzalg<T>) t2, zza2);
                                zzalsVar.zza(zzalcVar2, zze(zza2), zzajkVar2);
                                zza((zzalg<T>) t2, zza2, zzalcVar2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 18:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 19:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 20:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 21:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 22:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 23:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 24:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 25:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 26:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                if (zzg(zzc2)) {
                                    zzalsVar.zzo(this.zzo.zza(t2, zzc2 & 1048575));
                                } else {
                                    zzalsVar.zzn(this.zzo.zza(t2, zzc2 & 1048575));
                                }
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 27:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb(this.zzo.zza(t2, zzc2 & 1048575), zze(zza2), zzajkVar2);
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 28:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzb(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 29:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 30:
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                List zza4 = this.zzo.zza(t2, zzc2 & 1048575);
                                zzalsVar.zzd(zza4);
                                obj3 = zzalx.zza(t, zzc, zza4, zzd(zza2), obj3, zzamoVar);
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                break;
                            case 31:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzj(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 32:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzk(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 33:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzl(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 34:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzm(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 35:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzc(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 36:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzg(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 37:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzi(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 38:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzq(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 39:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzh(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 40:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzf(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 41:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zze(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 42:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zza(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 43:
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzalsVar.zzp(this.zzo.zza(t2, zzc2 & 1048575));
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 44:
                                List zza5 = this.zzo.zza(t2, zzc2 & 1048575);
                                zzalsVar.zzd(zza5);
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                obj3 = zzalx.zza(t, zzc, zza5, zzd(zza2), obj3, zzamoVar);
                                zzamoVar3 = zzamoVar;
                                zzajmVar2 = zzajmVar;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                break;
                            case 45:
                                zzalsVar.zzj(this.zzo.zza(t2, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 46:
                                zzalsVar.zzk(this.zzo.zza(t2, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 47:
                                zzalsVar.zzl(this.zzo.zza(t2, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 48:
                                zzalsVar.zzm(this.zzo.zza(t2, zzc2 & 1048575));
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                                zzalsVar.zza(this.zzo.zza(t2, zzc2 & 1048575), zze(zza2), zzajkVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 50:
                                Object zzf = zzf(zza2);
                                long zzc3 = zzc(zza2) & 1048575;
                                Object zze2 = zzamp.zze(t2, zzc3);
                                if (zze2 == null) {
                                    zze2 = this.zzr.zzb(zzf);
                                    zzamp.zza(t2, zzc3, zze2);
                                } else if (this.zzr.zzf(zze2)) {
                                    Object zzb2 = this.zzr.zzb(zzf);
                                    this.zzr.zza(zzb2, zze2);
                                    zzamp.zza(t2, zzc3, zzb2);
                                    zze2 = zzb2;
                                }
                                zzalsVar.zza(this.zzr.zze(zze2), this.zzr.zza(zzf), zzajkVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 51:
                                zzamp.zza(t2, zzc2 & 1048575, Double.valueOf(zzalsVar.zza()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 52:
                                zzamp.zza(t2, zzc2 & 1048575, Float.valueOf(zzalsVar.zzb()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 53:
                                zzamp.zza(t2, zzc2 & 1048575, Long.valueOf(zzalsVar.zzl()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 54:
                                zzamp.zza(t2, zzc2 & 1048575, Long.valueOf(zzalsVar.zzo()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 55:
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzg()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 56:
                                zzamp.zza(t2, zzc2 & 1048575, Long.valueOf(zzalsVar.zzk()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 57:
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzf()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 58:
                                zzamp.zza(t2, zzc2 & 1048575, Boolean.valueOf(zzalsVar.zzs()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 59:
                                zza((Object) t2, zzc2, (zzals) zzalsVar);
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 60:
                                zzalc zzalcVar3 = (zzalc) zza((zzalg<T>) t2, zzc, zza2);
                                zzalsVar.zzb(zzalcVar3, zze(zza2), zzajkVar3);
                                zza((zzalg<T>) t2, zzc, zza2, zzalcVar3);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 61:
                                zzamp.zza(t2, zzc2 & 1048575, zzalsVar.zzp());
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 62:
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzj()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 63:
                                int zze3 = zzalsVar.zze();
                                zzakd zzd2 = zzd(zza2);
                                if (zzd2 != null && !zzd2.zza(zze3)) {
                                    obj3 = zzalx.zza(t2, zzc, zze3, obj3, zzamoVar);
                                    t4 = t2;
                                    zzamoVar3 = zzamoVar;
                                    break;
                                }
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zze3));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 64:
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzh()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 65:
                                zzamp.zza(t2, zzc2 & 1048575, Long.valueOf(zzalsVar.zzm()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case 66:
                                zzamp.zza(t2, zzc2 & 1048575, Integer.valueOf(zzalsVar.zzi()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                                zzamp.zza(t2, zzc2 & 1048575, Long.valueOf(zzalsVar.zzn()));
                                zzb((zzalg<T>) t2, zzc, zza2);
                                obj2 = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                zzajmVar2 = zzajmVar;
                                obj3 = obj2;
                                zzajkVar3 = zzajkVar2;
                                t4 = t2;
                                zzamoVar3 = zzamoVar;
                                break;
                            case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                                try {
                                    zzalc zzalcVar4 = (zzalc) zza((zzalg<T>) t2, zzc, zza2);
                                    zzalsVar.zza(zzalcVar4, zze(zza2), zzajkVar3);
                                    zza((zzalg<T>) t2, zzc, zza2, zzalcVar4);
                                    obj2 = obj3;
                                    zzajmVar = zzajmVar2;
                                    zzajkVar2 = zzajkVar3;
                                    zzajmVar2 = zzajmVar;
                                    obj3 = obj2;
                                    zzajkVar3 = zzajkVar2;
                                    t4 = t2;
                                    zzamoVar3 = zzamoVar;
                                } catch (zzake unused) {
                                    obj = obj3;
                                    zzajmVar = zzajmVar2;
                                    zzajkVar2 = zzajkVar3;
                                    obj3 = obj;
                                    zzamoVar.zza((zzals) zzalsVar);
                                    if (obj3 == null) {
                                    }
                                    if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                    }
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t4 = t2;
                                }
                                break;
                            default:
                                obj = obj3;
                                zzajmVar = zzajmVar2;
                                zzajkVar2 = zzajkVar3;
                                if (obj == null) {
                                    try {
                                        obj3 = zzamoVar.zzc(t2);
                                    } catch (zzake unused2) {
                                        obj3 = obj;
                                        zzamoVar.zza((zzals) zzalsVar);
                                        if (obj3 == null) {
                                        }
                                        if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                        }
                                        zzamoVar3 = zzamoVar;
                                        zzajmVar2 = zzajmVar;
                                        zzajkVar3 = zzajkVar2;
                                        t4 = t2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj3 = obj;
                                        while (i < this.zzm) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj3 = obj;
                                }
                                try {
                                    try {
                                        if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                                obj3 = zza((Object) t, this.zzk[i4], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t);
                                            }
                                            if (obj3 != null) {
                                                zzamoVar.zzb((Object) t2, (T) obj3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (zzake unused3) {
                                        zzamoVar.zza((zzals) zzalsVar);
                                        if (obj3 == null) {
                                            obj3 = zzamoVar.zzc(t2);
                                        }
                                        if (!zzamoVar.zza((zzamo) obj3, (zzals) zzalsVar, 0)) {
                                            for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                                obj3 = zza((Object) t, this.zzk[i5], (int) obj3, (zzamo<UT, int>) zzamoVar, (Object) t);
                                            }
                                            if (obj3 != null) {
                                                zzamoVar.zzb((Object) t2, (T) obj3);
                                                return;
                                            }
                                            return;
                                        }
                                        zzamoVar3 = zzamoVar;
                                        zzajmVar2 = zzajmVar;
                                        zzajkVar3 = zzajkVar2;
                                        t4 = t2;
                                    }
                                    zzamoVar3 = zzamoVar;
                                    zzajmVar2 = zzajmVar;
                                    zzajkVar3 = zzajkVar2;
                                    t4 = t2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    while (i < this.zzm) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        while (i < this.zzm) {
                        }
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                zzamoVar = zzamoVar3;
                t2 = t4;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t, byte[] bArr, int i, int i2, zzaik zzaikVar) throws IOException {
        zza((zzalg<T>) t, bArr, i, i2, 0, zzaikVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzalg<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzalv zze = zze(i);
            if (!zzc((zzalg<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzalg<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzalg<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzalv zze = zze(i);
            if (!zzc((zzalg<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzalg<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzals zzalsVar) throws IOException {
        if (zzg(i)) {
            zzamp.zza(obj, i & 1048575, zzalsVar.zzr());
        } else if (this.zzi) {
            zzamp.zza(obj, i & 1048575, zzalsVar.zzq());
        } else {
            zzamp.zza(obj, i & 1048575, zzalsVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzamp.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zzamp.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzamp.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzalg<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzalg<T>) t, i, i2);
    }

    private final <K, V> void zza(zzanf zzanfVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzanfVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzanf zzanfVar) throws IOException {
        if (obj instanceof String) {
            zzanfVar.zza(i, (String) obj);
        } else {
            zzanfVar.zza(i, (zzaip) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b8e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzanf zzanfVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        int i2;
        Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        int i5;
        Map.Entry<?, ?> entry3;
        int i6;
        boolean z;
        int i7;
        Unsafe unsafe;
        boolean z2;
        Iterator<Map.Entry<?, Object>> it3;
        Map.Entry<?, ?> entry4;
        int length2;
        zzanf zzanfVar2 = zzanfVar;
        int i8 = 267386880;
        int i9 = 1048575;
        if (zzanfVar.zza() == 2) {
            zza(this.zzp, t, zzanfVar2);
            if (this.zzh) {
                zzajr<?> zza2 = this.zzq.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it3 = zza2.zzc();
                    entry4 = (Map.Entry) it3.next();
                    for (length2 = this.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzc(length2);
                        int i10 = this.zzc[length2];
                        while (entry4 != null && this.zzq.zza(entry4) > i10) {
                            this.zzq.zza(zzanfVar2, entry4);
                            entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzb(i10, zzamp.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zze(i10, zzamp.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzc(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzb(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zzh(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zza(i10, zzamp.zze(t, zzc & 1048575), zzanfVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzb(i10, zzamp.zze(t, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, (zzaip) zzamp.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzf(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzd(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzc(i10, zzamp.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zze(i10, zzamp.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zzd(i10, zzamp.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzc((zzalg<T>) t, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zze(t, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzalx.zzb(this.zzc[length2], (List<Double>) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 19:
                                zzalx.zzf(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 20:
                                zzalx.zzh(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 21:
                                zzalx.zzn(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 22:
                                zzalx.zzg(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 23:
                                zzalx.zze(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 24:
                                zzalx.zzd(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 25:
                                zzalx.zza(this.zzc[length2], (List<Boolean>) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 26:
                                zzalx.zzb(this.zzc[length2], (List<String>) zzamp.zze(t, zzc & 1048575), zzanfVar2);
                                break;
                            case 27:
                                zzalx.zzb(this.zzc[length2], (List<?>) zzamp.zze(t, zzc & 1048575), zzanfVar2, (zzalv<?>) zze(length2));
                                break;
                            case 28:
                                zzalx.zza(this.zzc[length2], (List<zzaip>) zzamp.zze(t, zzc & 1048575), zzanfVar2);
                                break;
                            case 29:
                                zzalx.zzm(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 30:
                                zzalx.zzc(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 31:
                                zzalx.zzi(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 32:
                                zzalx.zzj(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 33:
                                zzalx.zzk(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 34:
                                zzalx.zzl(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, false);
                                break;
                            case 35:
                                zzalx.zzb(this.zzc[length2], (List<Double>) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 36:
                                zzalx.zzf(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 37:
                                zzalx.zzh(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 38:
                                zzalx.zzn(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 39:
                                zzalx.zzg(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 40:
                                zzalx.zze(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 41:
                                zzalx.zzd(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 42:
                                zzalx.zza(this.zzc[length2], (List<Boolean>) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 43:
                                zzalx.zzm(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 44:
                                zzalx.zzc(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 45:
                                zzalx.zzi(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 46:
                                zzalx.zzj(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 47:
                                zzalx.zzk(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case 48:
                                zzalx.zzl(this.zzc[length2], (List) zzamp.zze(t, zzc & 1048575), zzanfVar2, true);
                                break;
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                                zzalx.zza(this.zzc[length2], (List<?>) zzamp.zze(t, zzc & 1048575), zzanfVar2, (zzalv<?>) zze(length2));
                                break;
                            case 50:
                                zza(zzanfVar2, i10, zzamp.zze(t, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzb(i10, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zze(i10, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzc(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzb(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zza(i10, zzamp.zze(t, zzc & 1048575), zzanfVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzb(i10, zzamp.zze(t, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, (zzaip) zzamp.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzf(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzd(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzc(i10, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zze(i10, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zzd(i10, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                                if (zzc((zzalg<T>) t, i10, length2)) {
                                    zzanfVar2.zza(i10, zzamp.zze(t, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry4 != null) {
                        this.zzq.zza(zzanfVar2, entry4);
                        entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                    }
                    return;
                }
            }
            it3 = null;
            entry4 = null;
            while (length2 >= 0) {
            }
            while (entry4 != null) {
            }
            return;
        }
        if (this.zzh) {
            zzajr<?> zza3 = this.zzq.zza(t);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = this.zzc.length;
                Unsafe unsafe2 = zzb;
                int i11 = 0;
                i = 0;
                int i12 = 1048575;
                while (i < length) {
                    int zzc2 = zzc(i);
                    int[] iArr = this.zzc;
                    int i13 = iArr[i];
                    int i14 = (zzc2 & i8) >>> 20;
                    if (i14 <= 17) {
                        int i15 = iArr[i + 2];
                        int i16 = i15 & i9;
                        if (i16 != i12) {
                            if (i16 == i9) {
                                it2 = it;
                                i11 = 0;
                            } else {
                                it2 = it;
                                i11 = unsafe2.getInt(t, i16);
                            }
                            i12 = i16;
                        } else {
                            it2 = it;
                        }
                        entry2 = entry;
                        i3 = i11;
                        i4 = 1 << (i15 >>> 20);
                        i2 = i12;
                    } else {
                        it2 = it;
                        i2 = i12;
                        entry2 = entry;
                        i3 = i11;
                        i4 = 0;
                    }
                    while (entry2 != null && this.zzq.zza(entry2) <= i13) {
                        this.zzq.zza(zzanfVar2, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    long j = zzc2 & 1048575;
                    switch (i14) {
                        case 0:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, zzamp.zza(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, zzamp.zzb(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzb(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zze(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzc(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzb(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, zzamp.zzh(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zza(i13, unsafe.getObject(t, j), zzanfVar2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzb(i13, unsafe.getObject(t, j), zze(i7));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, (zzaip) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzf(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zza(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzd(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zzc(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i7, i5, i3, i4)) {
                                zzanfVar2.zze(i13, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            i5 = i2;
                            if (zza((zzalg<T>) t, i7, i2, i3, i4)) {
                                zzanfVar2.zzd(i13, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            z = false;
                            entry3 = entry2;
                            i7 = i;
                            i6 = length;
                            unsafe = unsafe2;
                            if (zza((zzalg<T>) t, i, i2, i3, i4)) {
                                zzanfVar2 = zzanfVar;
                                zzanfVar2.zza(i13, unsafe.getObject(t, j), zze(i7));
                            } else {
                                zzanfVar2 = zzanfVar;
                            }
                            i5 = i2;
                            break;
                        case 18:
                            z2 = false;
                            zzalx.zzb(this.zzc[i], (List<Double>) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 19:
                            z2 = false;
                            zzalx.zzf(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 20:
                            z2 = false;
                            zzalx.zzh(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 21:
                            z2 = false;
                            zzalx.zzn(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 22:
                            z2 = false;
                            zzalx.zzg(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 23:
                            z2 = false;
                            zzalx.zze(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 24:
                            z2 = false;
                            zzalx.zzd(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 25:
                            z2 = false;
                            zzalx.zza(this.zzc[i], (List<Boolean>) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 26:
                            zzalx.zzb(this.zzc[i], (List<String>) unsafe2.getObject(t, j), zzanfVar2);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 27:
                            zzalx.zzb(this.zzc[i], (List<?>) unsafe2.getObject(t, j), zzanfVar2, (zzalv<?>) zze(i));
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 28:
                            zzalx.zza(this.zzc[i], (List<zzaip>) unsafe2.getObject(t, j), zzanfVar2);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 29:
                            z2 = false;
                            zzalx.zzm(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 30:
                            z2 = false;
                            zzalx.zzc(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 31:
                            z2 = false;
                            zzalx.zzi(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 32:
                            z2 = false;
                            zzalx.zzj(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 33:
                            z2 = false;
                            zzalx.zzk(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 34:
                            z2 = false;
                            zzalx.zzl(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, false);
                            i5 = i2;
                            entry3 = entry2;
                            z = z2;
                            i6 = length;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 35:
                            zzalx.zzb(this.zzc[i], (List<Double>) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 36:
                            zzalx.zzf(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 37:
                            zzalx.zzh(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 38:
                            zzalx.zzn(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 39:
                            zzalx.zzg(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 40:
                            zzalx.zze(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 41:
                            zzalx.zzd(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 42:
                            zzalx.zza(this.zzc[i], (List<Boolean>) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 43:
                            zzalx.zzm(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 44:
                            zzalx.zzc(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 45:
                            zzalx.zzi(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 46:
                            zzalx.zzj(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 47:
                            zzalx.zzk(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 48:
                            zzalx.zzl(this.zzc[i], (List) unsafe2.getObject(t, j), zzanfVar2, true);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION /* 49 */:
                            zzalx.zza(this.zzc[i], (List<?>) unsafe2.getObject(t, j), zzanfVar2, (zzalv<?>) zze(i));
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 50:
                            zza(zzanfVar2, i13, unsafe2.getObject(t, j), i);
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 51:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, zza(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 52:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, zzb(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 53:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzb(i13, zzd(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 54:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zze(i13, zzd(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 55:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzc(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 56:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, zzd(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 57:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzb(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 58:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, zze(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 59:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zza(i13, unsafe2.getObject(t, j), zzanfVar2);
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 60:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzb(i13, unsafe2.getObject(t, j), zze(i));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 61:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, (zzaip) unsafe2.getObject(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 62:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzf(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 63:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 64:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzd(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 65:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzc(i13, zzd(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case 66:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zze(i13, zzc(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA /* 67 */:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zzd(i13, zzd(t, j));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        case ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING /* 68 */:
                            if (zzc((zzalg<T>) t, i13, i)) {
                                zzanfVar2.zza(i13, unsafe2.getObject(t, j), zze(i));
                            }
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                        default:
                            i5 = i2;
                            entry3 = entry2;
                            i6 = length;
                            z = false;
                            i7 = i;
                            unsafe = unsafe2;
                            break;
                    }
                    i = i7 + 3;
                    i11 = i3;
                    unsafe2 = unsafe;
                    i9 = 1048575;
                    it = it2;
                    entry = entry3;
                    length = i6;
                    i12 = i5;
                    i8 = 267386880;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    this.zzq.zza(zzanfVar2, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(this.zzp, t, zzanfVar2);
            }
        }
        entry = null;
        it = null;
        length = this.zzc.length;
        Unsafe unsafe22 = zzb;
        int i112 = 0;
        i = 0;
        int i122 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(this.zzp, t, zzanfVar2);
    }

    private static <UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t, zzanf zzanfVar) throws IOException {
        zzamoVar.zzb((zzamo<UT, UB>) zzamoVar.zzd(t), zzanfVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzalg<T>) t, i) == zzc((zzalg<T>) t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzalx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzc = zzc(i);
                long j = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
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
                        z = zzalx.zza(zzamp.zze(t, j), zzamp.zze(t2, j));
                        break;
                    case 50:
                        z = zzalx.zza(zzamp.zze(t, j), zzamp.zze(t2, j));
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
                        long zzb2 = zzb(i) & 1048575;
                        if (zzamp.zzc(t, zzb2) == zzamp.zzc(t2, zzb2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzp.zzd(t).equals(this.zzp.zzd(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t).equals(this.zzq.zza(t2));
                }
                return true;
            }
        }
    }

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return ((1 << (zzb2 >>> 20)) & zzamp.zzc(t, j)) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamp.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamp.zzb(t, j2)) != 0;
            case 2:
                return zzamp.zzd(t, j2) != 0;
            case 3:
                return zzamp.zzd(t, j2) != 0;
            case 4:
                return zzamp.zzc(t, j2) != 0;
            case 5:
                return zzamp.zzd(t, j2) != 0;
            case 6:
                return zzamp.zzc(t, j2) != 0;
            case 7:
                return zzamp.zzh(t, j2);
            case 8:
                Object zze = zzamp.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzaip) {
                    return !zzaip.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamp.zze(t, j2) != null;
            case 10:
                return !zzaip.zza.equals(zzamp.zze(t, j2));
            case 11:
                return zzamp.zzc(t, j2) != 0;
            case 12:
                return zzamp.zzc(t, j2) != 0;
            case 13:
                return zzamp.zzc(t, j2) != 0;
            case 14:
                return zzamp.zzd(t, j2) != 0;
            case 15:
                return zzamp.zzc(t, j2) != 0;
            case 16:
                return zzamp.zzd(t, j2) != 0;
            case 17:
                return zzamp.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzalg<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzc = zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzc) != 0 && !zza((zzalg<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzalg<T>) t, i6, i, i2, i10) && !zza((Object) t, zzc, zze(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc((zzalg<T>) t, i7, i6) && !zza((Object) t, zzc, zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzamp.zze(t, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i6)).zzc.zzb() == zzand.MESSAGE) {
                                ?? r1 = 0;
                                for (Object obj : zzd.values()) {
                                    r1 = r1;
                                    if (r1 == 0) {
                                        r1 = zzalr.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r1.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzamp.zze(t, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zze.zze(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzq.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzalv zzalvVar) {
        return zzalvVar.zze(zzamp.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzajy) {
            return ((zzajy) obj).zzu();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzamp.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzamp.zze(t, j)).booleanValue();
    }
}
