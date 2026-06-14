package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(final SupportSQLiteQuery query) {
        WorkInfo.State intToState;
        BackoffPolicy intToBackoffPolicy;
        long j;
        int i;
        NetworkType intToNetworkType;
        NetworkRequestCompat networkRequest$work_runtime_release;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
        int i2;
        this.__db.assertNotSuspendingTransaction();
        Cursor query2 = DBUtil.query(this.__db, query, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query2, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(query2, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(query2, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
            int i3 = columnIndex13;
            HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
            while (query2.moveToNext()) {
                int i4 = columnIndex12;
                String string = query2.getString(columnIndex);
                if (hashMap.containsKey(string)) {
                    i2 = columnIndex11;
                } else {
                    i2 = columnIndex11;
                    hashMap.put(string, new ArrayList<>());
                }
                String string2 = query2.getString(columnIndex);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i4;
                columnIndex11 = i2;
            }
            int i5 = columnIndex11;
            int i6 = columnIndex12;
            int i7 = -1;
            query2.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList = new ArrayList(query2.getCount());
            while (query2.moveToNext()) {
                String string3 = columnIndex == i7 ? null : query2.getString(columnIndex);
                if (columnIndex2 == i7) {
                    intToState = null;
                } else {
                    int i8 = query2.getInt(columnIndex2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    intToState = WorkTypeConverters.intToState(i8);
                }
                Data fromByteArray = columnIndex3 == i7 ? null : Data.fromByteArray(query2.getBlob(columnIndex3));
                long j2 = columnIndex4 == i7 ? 0L : query2.getLong(columnIndex4);
                long j3 = columnIndex5 == i7 ? 0L : query2.getLong(columnIndex5);
                long j4 = columnIndex6 == i7 ? 0L : query2.getLong(columnIndex6);
                int i9 = columnIndex7 == i7 ? 0 : query2.getInt(columnIndex7);
                if (columnIndex8 == i7) {
                    intToBackoffPolicy = null;
                } else {
                    int i10 = query2.getInt(columnIndex8);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                }
                long j5 = columnIndex9 == i7 ? 0L : query2.getLong(columnIndex9);
                if (columnIndex10 == i7) {
                    i = i5;
                    j = 0;
                } else {
                    j = query2.getLong(columnIndex10);
                    i = i5;
                }
                int i11 = i == i7 ? 0 : query2.getInt(i);
                int i12 = i6;
                int i13 = columnIndex2;
                int i14 = i12 == i7 ? 0 : query2.getInt(i12);
                int i15 = i3;
                long j6 = i15 == i7 ? 0L : query2.getLong(i15);
                int i16 = columnIndex14;
                int i17 = i16 == i7 ? 0 : query2.getInt(i16);
                int i18 = columnIndex15;
                if (i18 == i7) {
                    intToNetworkType = null;
                } else {
                    int i19 = query2.getInt(i18);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    intToNetworkType = WorkTypeConverters.intToNetworkType(i19);
                }
                int i20 = columnIndex16;
                if (i20 == i7) {
                    networkRequest$work_runtime_release = null;
                } else {
                    byte[] blob = query2.getBlob(i20);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                }
                int i21 = columnIndex17;
                if (i21 == i7) {
                    z = false;
                } else {
                    z = query2.getInt(i21) != 0;
                }
                int i22 = columnIndex18;
                if (i22 == i7) {
                    z2 = false;
                } else {
                    z2 = query2.getInt(i22) != 0;
                }
                int i23 = columnIndex19;
                if (i23 == i7) {
                    z3 = false;
                } else {
                    z3 = query2.getInt(i23) != 0;
                }
                int i24 = columnIndex20;
                if (i24 == i7) {
                    z4 = false;
                } else {
                    z4 = query2.getInt(i24) != 0;
                }
                int i25 = columnIndex21;
                long j7 = i25 == i7 ? 0L : query2.getLong(i25);
                int i26 = columnIndex22;
                long j8 = i26 != i7 ? query2.getLong(i26) : 0L;
                int i27 = columnIndex23;
                if (i27 == i7) {
                    byteArrayToSetOfTriggers = null;
                } else {
                    byte[] blob2 = query2.getBlob(i27);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, byteArrayToSetOfTriggers), i9, intToBackoffPolicy, j5, j, i11, i14, j6, i17, hashMap.get(query2.getString(columnIndex)), hashMap2.get(query2.getString(columnIndex))));
                i5 = i;
                i7 = -1;
                i3 = i15;
                columnIndex14 = i16;
                columnIndex15 = i18;
                columnIndex16 = i20;
                columnIndex17 = i21;
                columnIndex18 = i22;
                columnIndex19 = i23;
                columnIndex20 = i24;
                columnIndex21 = i25;
                columnIndex22 = i26;
                columnIndex23 = i27;
                columnIndex2 = i13;
                i6 = i12;
            }
            return arrayList;
        } finally {
            query2.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery query) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkInfo.State intToState;
                BackoffPolicy intToBackoffPolicy;
                long j;
                int i;
                NetworkType intToNetworkType;
                NetworkRequestCompat networkRequest$work_runtime_release;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                int i2;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i3 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i4 = columnIndex12;
                        String string = query2.getString(columnIndex);
                        if (hashMap.containsKey(string)) {
                            i2 = columnIndex11;
                        } else {
                            i2 = columnIndex11;
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query2.getString(columnIndex);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i4;
                        columnIndex11 = i2;
                    }
                    int i5 = columnIndex11;
                    int i6 = columnIndex12;
                    int i7 = -1;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        String string3 = columnIndex == i7 ? null : query2.getString(columnIndex);
                        if (columnIndex2 == i7) {
                            intToState = null;
                        } else {
                            int i8 = query2.getInt(columnIndex2);
                            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                            intToState = WorkTypeConverters.intToState(i8);
                        }
                        Data fromByteArray = columnIndex3 == i7 ? null : Data.fromByteArray(query2.getBlob(columnIndex3));
                        long j2 = columnIndex4 == i7 ? 0L : query2.getLong(columnIndex4);
                        long j3 = columnIndex5 == i7 ? 0L : query2.getLong(columnIndex5);
                        long j4 = columnIndex6 == i7 ? 0L : query2.getLong(columnIndex6);
                        int i9 = columnIndex7 == i7 ? 0 : query2.getInt(columnIndex7);
                        if (columnIndex8 == i7) {
                            intToBackoffPolicy = null;
                        } else {
                            int i10 = query2.getInt(columnIndex8);
                            WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                            intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                        }
                        long j5 = columnIndex9 == i7 ? 0L : query2.getLong(columnIndex9);
                        if (columnIndex10 == i7) {
                            i = i5;
                            j = 0;
                        } else {
                            j = query2.getLong(columnIndex10);
                            i = i5;
                        }
                        int i11 = i == i7 ? 0 : query2.getInt(i);
                        int i12 = i6;
                        int i13 = columnIndex2;
                        int i14 = i12 == i7 ? 0 : query2.getInt(i12);
                        int i15 = i3;
                        long j6 = i15 == i7 ? 0L : query2.getLong(i15);
                        int i16 = columnIndex14;
                        int i17 = i16 == i7 ? 0 : query2.getInt(i16);
                        int i18 = columnIndex15;
                        if (i18 == i7) {
                            intToNetworkType = null;
                        } else {
                            int i19 = query2.getInt(i18);
                            WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                            intToNetworkType = WorkTypeConverters.intToNetworkType(i19);
                        }
                        int i20 = columnIndex16;
                        if (i20 == i7) {
                            networkRequest$work_runtime_release = null;
                        } else {
                            byte[] blob = query2.getBlob(i20);
                            WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                            networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        }
                        int i21 = columnIndex17;
                        if (i21 == i7) {
                            z = false;
                        } else {
                            z = query2.getInt(i21) != 0;
                        }
                        int i22 = columnIndex18;
                        if (i22 == i7) {
                            z2 = false;
                        } else {
                            z2 = query2.getInt(i22) != 0;
                        }
                        int i23 = columnIndex19;
                        if (i23 == i7) {
                            z3 = false;
                        } else {
                            z3 = query2.getInt(i23) != 0;
                        }
                        int i24 = columnIndex20;
                        if (i24 == i7) {
                            z4 = false;
                        } else {
                            z4 = query2.getInt(i24) != 0;
                        }
                        int i25 = columnIndex21;
                        long j7 = i25 == i7 ? 0L : query2.getLong(i25);
                        int i26 = columnIndex22;
                        long j8 = i26 != i7 ? query2.getLong(i26) : 0L;
                        int i27 = columnIndex23;
                        if (i27 == i7) {
                            byteArrayToSetOfTriggers = null;
                        } else {
                            byte[] blob2 = query2.getBlob(i27);
                            WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                            byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                        }
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, byteArrayToSetOfTriggers), i9, intToBackoffPolicy, j5, j, i11, i14, j6, i17, (ArrayList) hashMap.get(query2.getString(columnIndex)), (ArrayList) hashMap2.get(query2.getString(columnIndex))));
                        i5 = i;
                        i7 = -1;
                        columnIndex23 = i27;
                        columnIndex2 = i13;
                        i6 = i12;
                        i3 = i15;
                        columnIndex14 = i16;
                        columnIndex15 = i18;
                        columnIndex16 = i20;
                        columnIndex17 = i21;
                        columnIndex18 = i22;
                        columnIndex19 = i23;
                        columnIndex20 = i24;
                        columnIndex21 = i25;
                        columnIndex22 = i26;
                    }
                    return arrayList;
                } finally {
                    query2.close();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery query) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkInfo.State intToState;
                BackoffPolicy intToBackoffPolicy;
                long j;
                int i;
                NetworkType intToNetworkType;
                NetworkRequestCompat networkRequest$work_runtime_release;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                int i2;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i3 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i4 = columnIndex12;
                        String string = query2.getString(columnIndex);
                        if (hashMap.containsKey(string)) {
                            i2 = columnIndex11;
                        } else {
                            i2 = columnIndex11;
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query2.getString(columnIndex);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i4;
                        columnIndex11 = i2;
                    }
                    int i5 = columnIndex11;
                    int i6 = columnIndex12;
                    int i7 = -1;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        String string3 = columnIndex == i7 ? null : query2.getString(columnIndex);
                        if (columnIndex2 == i7) {
                            intToState = null;
                        } else {
                            int i8 = query2.getInt(columnIndex2);
                            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                            intToState = WorkTypeConverters.intToState(i8);
                        }
                        Data fromByteArray = columnIndex3 == i7 ? null : Data.fromByteArray(query2.getBlob(columnIndex3));
                        long j2 = columnIndex4 == i7 ? 0L : query2.getLong(columnIndex4);
                        long j3 = columnIndex5 == i7 ? 0L : query2.getLong(columnIndex5);
                        long j4 = columnIndex6 == i7 ? 0L : query2.getLong(columnIndex6);
                        int i9 = columnIndex7 == i7 ? 0 : query2.getInt(columnIndex7);
                        if (columnIndex8 == i7) {
                            intToBackoffPolicy = null;
                        } else {
                            int i10 = query2.getInt(columnIndex8);
                            WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                            intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                        }
                        long j5 = columnIndex9 == i7 ? 0L : query2.getLong(columnIndex9);
                        if (columnIndex10 == i7) {
                            i = i5;
                            j = 0;
                        } else {
                            j = query2.getLong(columnIndex10);
                            i = i5;
                        }
                        int i11 = i == i7 ? 0 : query2.getInt(i);
                        int i12 = i6;
                        int i13 = columnIndex2;
                        int i14 = i12 == i7 ? 0 : query2.getInt(i12);
                        int i15 = i3;
                        long j6 = i15 == i7 ? 0L : query2.getLong(i15);
                        int i16 = columnIndex14;
                        int i17 = i16 == i7 ? 0 : query2.getInt(i16);
                        int i18 = columnIndex15;
                        if (i18 == i7) {
                            intToNetworkType = null;
                        } else {
                            int i19 = query2.getInt(i18);
                            WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                            intToNetworkType = WorkTypeConverters.intToNetworkType(i19);
                        }
                        int i20 = columnIndex16;
                        if (i20 == i7) {
                            networkRequest$work_runtime_release = null;
                        } else {
                            byte[] blob = query2.getBlob(i20);
                            WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                            networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        }
                        int i21 = columnIndex17;
                        if (i21 == i7) {
                            z = false;
                        } else {
                            z = query2.getInt(i21) != 0;
                        }
                        int i22 = columnIndex18;
                        if (i22 == i7) {
                            z2 = false;
                        } else {
                            z2 = query2.getInt(i22) != 0;
                        }
                        int i23 = columnIndex19;
                        if (i23 == i7) {
                            z3 = false;
                        } else {
                            z3 = query2.getInt(i23) != 0;
                        }
                        int i24 = columnIndex20;
                        if (i24 == i7) {
                            z4 = false;
                        } else {
                            z4 = query2.getInt(i24) != 0;
                        }
                        int i25 = columnIndex21;
                        long j7 = i25 == i7 ? 0L : query2.getLong(i25);
                        int i26 = columnIndex22;
                        long j8 = i26 != i7 ? query2.getLong(i26) : 0L;
                        int i27 = columnIndex23;
                        if (i27 == i7) {
                            byteArrayToSetOfTriggers = null;
                        } else {
                            byte[] blob2 = query2.getBlob(i27);
                            WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                            byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob2);
                        }
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, byteArrayToSetOfTriggers), i9, intToBackoffPolicy, j5, j, i11, i14, j6, i17, (ArrayList) hashMap.get(query2.getString(columnIndex)), (ArrayList) hashMap2.get(query2.getString(columnIndex))));
                        i5 = i;
                        i7 = -1;
                        columnIndex23 = i27;
                        columnIndex2 = i13;
                        i6 = i12;
                        i3 = i15;
                        columnIndex14 = i16;
                        columnIndex15 = i18;
                        columnIndex16 = i20;
                        columnIndex17 = i21;
                        columnIndex18 = i22;
                        columnIndex19 = i23;
                        columnIndex20 = i24;
                        columnIndex21 = i25;
                        columnIndex22 = i26;
                    }
                    return arrayList;
                } finally {
                    query2.close();
                }
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final HashMap<String, ArrayList<String>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(_map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.this.m6701x653d68c((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<String> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* renamed from: lambda$__fetchRelationshipWorkTagAsjavaLangString$0$androidx-work-impl-model-RawWorkInfoDao_Impl, reason: not valid java name */
    /* synthetic */ Unit m6701x653d68c(HashMap hashMap) {
        __fetchRelationshipWorkTagAsjavaLangString(hashMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final HashMap<String, ArrayList<Data>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(_map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.this.m6700x83915589((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<Data> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }

    /* renamed from: lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1$androidx-work-impl-model-RawWorkInfoDao_Impl, reason: not valid java name */
    /* synthetic */ Unit m6700x83915589(HashMap hashMap) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
        return Unit.INSTANCE;
    }
}
