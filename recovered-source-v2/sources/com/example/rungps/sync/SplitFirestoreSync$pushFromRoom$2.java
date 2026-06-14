package com.example.rungps.sync;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSplitEntity;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: SplitFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.SplitFirestoreSync$pushFromRoom$2", f = "SplitFirestoreSync.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3}, l = {58, 62, 64, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER}, m = "invokeSuspend", n = {"user", "repo", "user", "repo", "split", "user", "repo", "split", "destination$iv$iv", "d", "now"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "J$0"})
/* loaded from: classes3.dex */
final class SplitFirestoreSync$pushFromRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitFirestoreSync$pushFromRoom$2(Context context, Continuation<? super SplitFirestoreSync$pushFromRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplitFirestoreSync$pushFromRoom$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SplitFirestoreSync$pushFromRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0156 A[LOOP:0: B:15:0x0150->B:17:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c0  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x013c -> B:14:0x013e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Repository repository;
        Object allSplits;
        Object obj2;
        Object dayTemplatesForSplit;
        FirebaseUser firebaseUser;
        GymSplitEntity gymSplitEntity;
        GymSplitEntity gymSplitEntity2;
        Repository repository2;
        FirebaseUser firebaseUser2;
        ArrayList arrayList;
        Iterator it;
        DocumentReference doc;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 10;
        int i3 = 2;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxBoolean(false);
            }
            repository = Repository.INSTANCE.get(this.$context);
            this.L$0 = currentUser;
            this.L$1 = repository;
            this.label = 1;
            allSplits = repository.allSplits(this);
            if (allSplits == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            Repository repository3 = (Repository) this.L$1;
            FirebaseUser firebaseUser3 = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            allSplits = obj;
            repository = repository3;
            currentUser = firebaseUser3;
        } else if (i == 2) {
            gymSplitEntity = (GymSplitEntity) this.L$2;
            repository = (Repository) this.L$1;
            FirebaseUser firebaseUser4 = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            firebaseUser = firebaseUser4;
            dayTemplatesForSplit = obj;
            List list = (List) dayTemplatesForSplit;
            gymSplitEntity2 = gymSplitEntity;
            repository2 = repository;
            firebaseUser2 = firebaseUser;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("cloud_split_updated_ms", j).apply();
                return Boxing.boxBoolean(true);
            }
            ?? r2 = (Collection) this.L$6;
            GymDayTemplateEntity gymDayTemplateEntity = (GymDayTemplateEntity) this.L$5;
            it = (Iterator) this.L$4;
            ?? r13 = (Collection) this.L$3;
            gymSplitEntity2 = (GymSplitEntity) this.L$2;
            repository2 = (Repository) this.L$1;
            FirebaseUser firebaseUser5 = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object exercisesForDay = obj;
            FirebaseUser firebaseUser6 = firebaseUser5;
            ArrayList arrayList2 = r2;
            arrayList = r13;
            Iterable<ExerciseTemplateEntity> iterable = (Iterable) exercisesForDay;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, i2));
            for (ExerciseTemplateEntity exerciseTemplateEntity : iterable) {
                Pair[] pairArr = new Pair[i3];
                pairArr[0] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, exerciseTemplateEntity.getName());
                pairArr[1] = TuplesKt.to("defaultSets", Boxing.boxInt(exerciseTemplateEntity.getDefaultSets()));
                arrayList3.add(MapsKt.mapOf(pairArr));
                i3 = 2;
            }
            arrayList2.add(MapsKt.mapOf(TuplesKt.to("dayName", gymDayTemplateEntity.getDayName()), TuplesKt.to("orderIdx", Boxing.boxInt(gymDayTemplateEntity.getOrderIdx())), TuplesKt.to("exercises", arrayList3)));
            firebaseUser2 = firebaseUser6;
            i2 = 10;
            i3 = 2;
            if (!it.hasNext()) {
                gymDayTemplateEntity = (GymDayTemplateEntity) it.next();
                long id = gymDayTemplateEntity.getId();
                this.L$0 = firebaseUser2;
                this.L$1 = repository2;
                this.L$2 = gymSplitEntity2;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = gymDayTemplateEntity;
                this.L$6 = arrayList;
                this.label = 3;
                exercisesForDay = repository2.exercisesForDay(id, this);
                if (exercisesForDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                firebaseUser6 = firebaseUser2;
                arrayList2 = arrayList;
                Iterable<ExerciseTemplateEntity> iterable2 = (Iterable) exercisesForDay;
                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, i2));
                while (r8.hasNext()) {
                }
                arrayList2.add(MapsKt.mapOf(TuplesKt.to("dayName", gymDayTemplateEntity.getDayName()), TuplesKt.to("orderIdx", Boxing.boxInt(gymDayTemplateEntity.getOrderIdx())), TuplesKt.to("exercises", arrayList32)));
                firebaseUser2 = firebaseUser6;
                i2 = 10;
                i3 = 2;
                if (!it.hasNext()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SplitFirestoreSync splitFirestoreSync = SplitFirestoreSync.INSTANCE;
                    String uid = firebaseUser2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    doc = splitFirestoreSync.doc(uid);
                    Task<Void> task = doc.set(MapsKt.mapOf(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, gymSplitEntity2.getName()), TuplesKt.to("updatedAtMs", Boxing.boxLong(currentTimeMillis)), TuplesKt.to("days", arrayList)), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.J$0 = currentTimeMillis;
                    this.label = 4;
                    if (TasksKt.await(task, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = currentTimeMillis;
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("cloud_split_updated_ms", j).apply();
                    return Boxing.boxBoolean(true);
                }
            }
        }
        List list2 = (List) allSplits;
        long j2 = this.$context.getSharedPreferences("settings", 0).getLong("gymActiveSplitId", -1L);
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((GymSplitEntity) obj2).getId() == j2) {
                break;
            }
        }
        GymSplitEntity gymSplitEntity3 = (GymSplitEntity) obj2;
        if (gymSplitEntity3 == null) {
            GymSplitEntity gymSplitEntity4 = (GymSplitEntity) CollectionsKt.firstOrNull(list2);
            if (gymSplitEntity4 == null) {
                return Boxing.boxBoolean(false);
            }
            gymSplitEntity3 = gymSplitEntity4;
        }
        this.L$0 = currentUser;
        this.L$1 = repository;
        this.L$2 = gymSplitEntity3;
        this.label = 2;
        dayTemplatesForSplit = repository.dayTemplatesForSplit(gymSplitEntity3.getId(), this);
        if (dayTemplatesForSplit == coroutine_suspended) {
            return coroutine_suspended;
        }
        firebaseUser = currentUser;
        gymSplitEntity = gymSplitEntity3;
        List list3 = (List) dayTemplatesForSplit;
        gymSplitEntity2 = gymSplitEntity;
        repository2 = repository;
        firebaseUser2 = firebaseUser;
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        it = list3.iterator();
        if (!it.hasNext()) {
        }
    }
}
