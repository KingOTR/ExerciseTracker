package com.samsung.android.sdk.health.data;

import com.google.gson.Gson;
import com.samsung.android.sdk.health.data.data.Field;
import com.samsung.android.sdk.health.data.data.entries.BloodGlucose;
import com.samsung.android.sdk.health.data.data.entries.ExerciseSession;
import com.samsung.android.sdk.health.data.data.entries.HeartRate;
import com.samsung.android.sdk.health.data.data.entries.OxygenSaturation;
import com.samsung.android.sdk.health.data.data.entries.SkinTemperature;
import com.samsung.android.sdk.health.data.data.entries.SleepSession;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements j0 {
    public static final h0 a = new h0();
    public static final Set b = SetsKt.setOf((Object[]) new Field[]{DataType.ExerciseType.SESSIONS, DataType.SleepType.SESSIONS, DataType.HeartRateType.SERIES_DATA, DataType.BloodOxygenType.SERIES_DATA, DataType.SkinTemperatureType.SERIES_DATA, DataType.BloodGlucoseType.SERIES_DATA});

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj, int i) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(field, "field");
        if (list != null) {
            if (Intrinsics.areEqual(field, DataType.ExerciseType.SESSIONS)) {
                if (i == 0 && list.size() > 1) {
                    throw new InvalidRequestException(1001, "Insert and Update operations for multiple sessions are not supported");
                }
                return a(list);
            }
            if (Intrinsics.areEqual(field, DataType.SleepType.SESSIONS)) {
                if (i == 0 && list.size() > 1) {
                    throw new InvalidRequestException(1001, "Insert and Update operations for multiple sessions are not supported");
                }
                return a(list);
            }
            if (Intrinsics.areEqual(field, DataType.HeartRateType.SERIES_DATA) || Intrinsics.areEqual(field, DataType.BloodOxygenType.SERIES_DATA) || Intrinsics.areEqual(field, DataType.SkinTemperatureType.SERIES_DATA) || Intrinsics.areEqual(field, DataType.BloodGlucoseType.SERIES_DATA)) {
                return a(list);
            }
        }
        return null;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            Gson gson = e.a;
            arrayList.add(e.a(obj));
        }
        return arrayList;
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Object a(Field field, Object obj) {
        List<byte[]> list = (List) obj;
        Intrinsics.checkNotNullParameter(field, "field");
        if (list != null) {
            if (Intrinsics.areEqual(field, DataType.ExerciseType.SESSIONS)) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr : list) {
                    Gson gson = e.a;
                    arrayList.add(e.a(bArr, ExerciseSession.class));
                }
                return arrayList;
            }
            if (Intrinsics.areEqual(field, DataType.SleepType.SESSIONS)) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr2 : list) {
                    Gson gson2 = e.a;
                    arrayList2.add(e.a(bArr2, SleepSession.class));
                }
                return arrayList2;
            }
            if (Intrinsics.areEqual(field, DataType.HeartRateType.SERIES_DATA)) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr3 : list) {
                    Gson gson3 = e.a;
                    arrayList3.add(e.a(bArr3, HeartRate.class));
                }
                return arrayList3;
            }
            if (Intrinsics.areEqual(field, DataType.BloodOxygenType.SERIES_DATA)) {
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr4 : list) {
                    Gson gson4 = e.a;
                    arrayList4.add(e.a(bArr4, OxygenSaturation.class));
                }
                return arrayList4;
            }
            if (Intrinsics.areEqual(field, DataType.SkinTemperatureType.SERIES_DATA)) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr5 : list) {
                    Gson gson5 = e.a;
                    arrayList5.add(e.a(bArr5, SkinTemperature.class));
                }
                return arrayList5;
            }
            if (Intrinsics.areEqual(field, DataType.BloodGlucoseType.SERIES_DATA)) {
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (byte[] bArr6 : list) {
                    Gson gson6 = e.a;
                    arrayList6.add(e.a(bArr6, BloodGlucose.class));
                }
                return arrayList6;
            }
        }
        return null;
    }

    @Override // com.samsung.android.sdk.health.data.j0
    public final Set a() {
        return b;
    }
}
