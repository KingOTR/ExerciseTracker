package com.example.rungps.sync;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.example.rungps.data.GymDayExerciseSpec;
import com.example.rungps.data.GymSplitEntity;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: SplitFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.SplitFirestoreSync$pullIntoRoom$2", f = "SplitFirestoreSync.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {23, 46, 47, 48}, m = "invokeSuspend", n = {"prefs", HintConstants.AUTOFILL_HINT_NAME, "specs", "repo", "remoteUpdated", "prefs", HintConstants.AUTOFILL_HINT_NAME, "specs", "repo", "remoteUpdated", "prefs", "remoteUpdated"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "J$0"})
/* loaded from: classes3.dex */
final class SplitFirestoreSync$pullIntoRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitFirestoreSync$pullIntoRoom$2(Context context, Continuation<? super SplitFirestoreSync$pullIntoRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplitFirestoreSync$pullIntoRoom$2 splitFirestoreSync$pullIntoRoom$2 = new SplitFirestoreSync$pullIntoRoom$2(this.$context, continuation);
        splitFirestoreSync$pullIntoRoom$2.L$0 = obj;
        return splitFirestoreSync$pullIntoRoom$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SplitFirestoreSync$pullIntoRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0201, code lost:
    
        if (r0.length() > 0) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0261  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        String str;
        Repository repository;
        Object splitByName;
        List<GymDayExerciseSpec> list;
        SharedPreferences sharedPreferences;
        long j;
        Iterator it;
        String obj2;
        GymSplitEntity gymSplitEntity;
        long j2;
        Object createSplitFromSpecs;
        DocumentReference doc;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxBoolean(false);
            }
            Result.Companion companion2 = Result.INSTANCE;
            SplitFirestoreSync splitFirestoreSync = SplitFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            doc = splitFirestoreSync.doc(uid);
            Task<DocumentSnapshot> task = doc.get();
            Intrinsics.checkNotNullExpressionValue(task, "get(...)");
            this.label = 1;
            await = TasksKt.await(task, this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    j = this.J$0;
                    repository = (Repository) this.L$3;
                    list = (List) this.L$2;
                    str = (String) this.L$1;
                    sharedPreferences = (SharedPreferences) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    splitByName = obj;
                    gymSplitEntity = (GymSplitEntity) splitByName;
                    if (gymSplitEntity != null) {
                        this.L$0 = sharedPreferences;
                        this.L$1 = str;
                        this.L$2 = list;
                        this.L$3 = repository;
                        this.J$0 = j;
                        this.label = 3;
                        if (repository.deleteSplit(gymSplitEntity.getId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    j2 = j;
                    this.L$0 = sharedPreferences;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.J$0 = j2;
                    this.label = 4;
                    createSplitFromSpecs = repository.createSplitFromSpecs(str, list, 3, this);
                    if (createSplitFromSpecs == coroutine_suspended) {
                    }
                    long longValue = ((Number) createSplitFromSpecs).longValue();
                    sharedPreferences.edit().putLong("cloud_split_updated_ms", j2).putLong("gymActiveSplitId", longValue).apply();
                    this.$context.getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", longValue).apply();
                    return Boxing.boxBoolean(true);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.J$0;
                    SharedPreferences sharedPreferences2 = (SharedPreferences) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sharedPreferences = sharedPreferences2;
                    createSplitFromSpecs = obj;
                    long longValue2 = ((Number) createSplitFromSpecs).longValue();
                    sharedPreferences.edit().putLong("cloud_split_updated_ms", j2).putLong("gymActiveSplitId", longValue2).apply();
                    this.$context.getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", longValue2).apply();
                    return Boxing.boxBoolean(true);
                }
                j = this.J$0;
                repository = (Repository) this.L$3;
                list = (List) this.L$2;
                str = (String) this.L$1;
                sharedPreferences = (SharedPreferences) this.L$0;
                ResultKt.throwOnFailure(obj);
                j2 = j;
                this.L$0 = sharedPreferences;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = j2;
                this.label = 4;
                createSplitFromSpecs = repository.createSplitFromSpecs(str, list, 3, this);
                if (createSplitFromSpecs == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long longValue22 = ((Number) createSplitFromSpecs).longValue();
                sharedPreferences.edit().putLong("cloud_split_updated_ms", j2).putLong("gymActiveSplitId", longValue22).apply();
                this.$context.getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", longValue22).apply();
                return Boxing.boxBoolean(true);
            }
            ResultKt.throwOnFailure(obj);
            await = obj;
        }
        m7905constructorimpl = Result.m7905constructorimpl((DocumentSnapshot) await);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        DocumentSnapshot documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
        if (documentSnapshot != null && documentSnapshot.exists()) {
            Long l = documentSnapshot.getLong("updatedAtMs");
            long longValue3 = l != null ? l.longValue() : 0L;
            SharedPreferences sharedPreferences3 = this.$context.getSharedPreferences("cloud_sync", 0);
            if (longValue3 <= sharedPreferences3.getLong("cloud_split_updated_ms", 0L)) {
                return Boxing.boxBoolean(false);
            }
            String string = documentSnapshot.getString(HintConstants.AUTOFILL_HINT_NAME);
            String obj3 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
            if (obj3 == null) {
                obj3 = "";
            }
            String str2 = obj3;
            if (str2.length() == 0) {
                str2 = "Web split";
            }
            str = str2;
            Object obj4 = documentSnapshot.get("days");
            List list2 = obj4 instanceof List ? (List) obj4 : null;
            if (list2 == null) {
                return Boxing.boxBoolean(false);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                int i3 = i2 + 1;
                Object next = it2.next();
                Map map = next instanceof Map ? (Map) next : null;
                if (map == null) {
                    it = it2;
                    i2 = i3;
                } else {
                    Object obj5 = map.get("dayName");
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    String obj6 = str3 != null ? StringsKt.trim((CharSequence) str3).toString() : null;
                    if (obj6 == null) {
                        obj6 = "";
                    }
                    String str4 = obj6;
                    if (str4.length() == 0) {
                        str4 = "Day " + i3;
                    }
                    String str5 = str4;
                    Object obj7 = map.get("orderIdx");
                    Number number = obj7 instanceof Number ? (Number) obj7 : null;
                    if (number != null) {
                        i2 = number.intValue();
                    }
                    int i4 = i2;
                    Object obj8 = map.get("exercises");
                    List list3 = obj8 instanceof List ? (List) obj8 : null;
                    if (list3 == null) {
                        list3 = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj9 : list3) {
                        Iterator it3 = it2;
                        int i5 = i3;
                        Map map2 = obj9 instanceof Map ? (Map) obj9 : null;
                        if (map2 != null) {
                            Object obj10 = map2.get(HintConstants.AUTOFILL_HINT_NAME);
                            String str6 = obj10 instanceof String ? (String) obj10 : null;
                            if (str6 != null) {
                                obj2 = StringsKt.trim((CharSequence) str6).toString();
                                if (obj2 != null) {
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            arrayList2.add(obj2);
                        }
                        it2 = it3;
                        i3 = i5;
                    }
                    it = it2;
                    i2 = i3;
                    ArrayList arrayList3 = arrayList2;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(new GymDayExerciseSpec(str5, i4, arrayList3));
                    }
                }
                it2 = it;
            }
            if (arrayList.isEmpty()) {
                return Boxing.boxBoolean(false);
            }
            repository = Repository.INSTANCE.get(this.$context);
            this.L$0 = sharedPreferences3;
            this.L$1 = str;
            this.L$2 = arrayList;
            this.L$3 = repository;
            this.J$0 = longValue3;
            this.label = 2;
            splitByName = repository.splitByName(str, this);
            if (splitByName == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            long j3 = longValue3;
            sharedPreferences = sharedPreferences3;
            j = j3;
            gymSplitEntity = (GymSplitEntity) splitByName;
            if (gymSplitEntity != null) {
            }
            j2 = j;
            this.L$0 = sharedPreferences;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.J$0 = j2;
            this.label = 4;
            createSplitFromSpecs = repository.createSplitFromSpecs(str, list, 3, this);
            if (createSplitFromSpecs == coroutine_suspended) {
            }
            long longValue222 = ((Number) createSplitFromSpecs).longValue();
            sharedPreferences.edit().putLong("cloud_split_updated_ms", j2).putLong("gymActiveSplitId", longValue222).apply();
            this.$context.getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", longValue222).apply();
            return Boxing.boxBoolean(true);
        }
        return Boxing.boxBoolean(false);
    }
}
