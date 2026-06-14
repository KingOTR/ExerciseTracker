package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UShort;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaw<K, V> extends zzap<K, V> {
    private static final zzap<Object, Object> zza = new zzaw(null, new Object[0], 0);

    @CheckForNull
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzak<V> zza() {
        return new zzba(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzau<Map.Entry<K, V>> zzb() {
        return new zzav(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    final zzau<K> zzc() {
        return new zzax(this, new zzba(this.zzc, 0, this.zzd));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static <K, V> zzaw<K, V> zza(int i, Object[] objArr, zzas<K, V> zzasVar) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzaw) zza;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            zzai.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzaw<>(null, objArr2, 1);
        }
        zzy.zzb(i3, objArr2.length >> 1);
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (i2 * 0.7d < max) {
                i2 <<= 1;
            }
        } else {
            i2 = Ints.MAX_POWER_OF_TWO;
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException(String.valueOf("collection too large"));
            }
        }
        if (i3 == 1) {
            zzai.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            c = 1;
            c2 = 2;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i6 * 2;
                    int i9 = i7 * 2;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i8]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i8 ^ i4]);
                    zzai.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzah.zza(requireNonNull.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i9;
                            if (i7 < i6) {
                                objArr2[i9] = requireNonNull;
                                objArr2[i9 ^ 1] = requireNonNull2;
                            }
                            i7++;
                        } else {
                            if (requireNonNull.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                obj = new zzar(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i12]));
                                objArr2[i12] = requireNonNull2;
                                break;
                            }
                            zza2 = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    obj = bArr;
                    c2 = 2;
                    c = 1;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i7), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (i2 <= 32768) {
                    sArr = new short[i2];
                    Arrays.fill(sArr, (short) -1);
                    int i13 = 0;
                    for (int i14 = 0; i14 < i3; i14++) {
                        int i15 = i14 * 2;
                        int i16 = i13 * 2;
                        Object requireNonNull3 = Objects.requireNonNull(objArr2[i15]);
                        Object requireNonNull4 = Objects.requireNonNull(objArr2[i15 ^ 1]);
                        zzai.zza(requireNonNull3, requireNonNull4);
                        int zza3 = zzah.zza(requireNonNull3.hashCode());
                        while (true) {
                            int i17 = zza3 & i5;
                            int i18 = sArr[i17] & UShort.MAX_VALUE;
                            if (i18 == 65535) {
                                sArr[i17] = (short) i16;
                                if (i13 < i14) {
                                    objArr2[i16] = requireNonNull3;
                                    objArr2[i16 ^ 1] = requireNonNull4;
                                }
                                i13++;
                            } else {
                                if (requireNonNull3.equals(objArr2[i18])) {
                                    int i19 = i18 ^ 1;
                                    obj = new zzar(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i19]));
                                    objArr2[i19] = requireNonNull4;
                                    break;
                                }
                                zza3 = i17 + 1;
                            }
                        }
                    }
                    if (i13 != i3) {
                        c2 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i13), obj};
                        c = 1;
                    }
                } else {
                    sArr = new int[i2];
                    Arrays.fill((int[]) sArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i3) {
                        int i22 = i20 * 2;
                        int i23 = i21 * 2;
                        Object requireNonNull5 = Objects.requireNonNull(objArr2[i22]);
                        Object requireNonNull6 = Objects.requireNonNull(objArr2[i22 ^ 1]);
                        zzai.zza(requireNonNull5, requireNonNull6);
                        int zza4 = zzah.zza(requireNonNull5.hashCode());
                        while (true) {
                            int i24 = zza4 & i5;
                            ?? r15 = sArr[i24];
                            if (r15 == c3) {
                                sArr[i24] = i23;
                                if (i21 < i20) {
                                    objArr2[i23] = requireNonNull5;
                                    objArr2[i23 ^ 1] = requireNonNull6;
                                }
                                i21++;
                            } else {
                                if (requireNonNull5.equals(objArr2[r15])) {
                                    int i25 = r15 ^ 1;
                                    obj = new zzar(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i25]));
                                    objArr2[i25] = requireNonNull6;
                                    break;
                                }
                                zza4 = i24 + 1;
                                c3 = 65535;
                            }
                        }
                        i20++;
                        c3 = 65535;
                    }
                    if (i21 != i3) {
                        c = 1;
                        c2 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                    }
                }
                obj = sArr;
                c2 = 2;
                c = 1;
            }
        }
        boolean z = obj instanceof Object[];
        Object obj2 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            zzar zzarVar = (zzar) objArr3[c2];
            if (zzasVar == null) {
                throw zzarVar.zza();
            }
            zzasVar.zza = zzarVar;
            Object obj3 = objArr3[0];
            int intValue = ((Integer) objArr3[c]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue << 1);
            obj2 = obj3;
            i3 = intValue;
        }
        return new zzaw<>(obj2, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(@CheckForNull Object obj) {
        V v;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                    v = (V) Objects.requireNonNull(objArr[1]);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int zza2 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i2 = zza2 & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            v = (V) objArr[i3 ^ 1];
                            break;
                        }
                        zza2 = i2 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int zza3 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i4 = zza3 & length2;
                        int i5 = sArr[i4] & UShort.MAX_VALUE;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            v = (V) objArr[i5 ^ 1];
                            break;
                        }
                        zza3 = i4 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int zza4 = zzah.zza(obj.hashCode());
                    while (true) {
                        int i6 = zza4 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            v = (V) objArr[i7 ^ 1];
                            break;
                        }
                        zza4 = i6 + 1;
                    }
                }
            }
            if (v != null) {
                return null;
            }
            return v;
        }
        v = null;
        if (v != null) {
        }
    }

    private zzaw(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }
}
