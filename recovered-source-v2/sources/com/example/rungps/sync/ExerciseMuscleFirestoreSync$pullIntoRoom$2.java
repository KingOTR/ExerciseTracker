package com.example.rungps.sync;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: ExerciseMuscleFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.ExerciseMuscleFirestoreSync$pullIntoRoom$2", f = "ExerciseMuscleFirestoreSync.kt", i = {1, 1, 1}, l = {46, 63}, m = "invokeSuspend", n = {"prefs", "repo", "remoteUpdated"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class ExerciseMuscleFirestoreSync$pullIntoRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExerciseMuscleFirestoreSync$pullIntoRoom$2(Context context, Continuation<? super ExerciseMuscleFirestoreSync$pullIntoRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExerciseMuscleFirestoreSync$pullIntoRoom$2 exerciseMuscleFirestoreSync$pullIntoRoom$2 = new ExerciseMuscleFirestoreSync$pullIntoRoom$2(this.$context, continuation);
        exerciseMuscleFirestoreSync$pullIntoRoom$2.L$0 = obj;
        return exerciseMuscleFirestoreSync$pullIntoRoom$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ExerciseMuscleFirestoreSync$pullIntoRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01f6 -> B:7:0x01f9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Repository repository;
        Iterator it;
        SharedPreferences sharedPreferences;
        long j;
        String obj2;
        String obj3;
        DocumentReference doc;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 2;
        boolean z = true;
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
            ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync = ExerciseMuscleFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            doc = exerciseMuscleFirestoreSync.doc(uid);
            Task<DocumentSnapshot> task = doc.get();
            Intrinsics.checkNotNullExpressionValue(task, "get(...)");
            this.label = 1;
            await = TasksKt.await(task, this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = this.J$0;
                it = (Iterator) this.L$2;
                repository = (Repository) this.L$1;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.L$0;
                ResultKt.throwOnFailure(obj);
                j = j2;
                sharedPreferences = sharedPreferences2;
                i2 = 2;
                z = true;
                while (it.hasNext()) {
                    Object next = it.next();
                    Map map = next instanceof Map ? (Map) next : null;
                    if (map != null) {
                        Object obj4 = map.get("displayName");
                        String str = obj4 instanceof String ? (String) obj4 : null;
                        String obj5 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
                        if (obj5 == null) {
                            obj5 = "";
                        }
                        Object obj6 = map.get("exerciseNameLower");
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        String obj7 = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
                        if (obj7 == null) {
                            obj7 = "";
                        }
                        Object obj8 = map.get("muscleGroup");
                        String str3 = obj8 instanceof String ? (String) obj8 : null;
                        String obj9 = str3 != null ? StringsKt.trim((CharSequence) str3).toString() : null;
                        String str4 = obj9 != null ? obj9 : "";
                        String str5 = obj5;
                        if (str5.length() != 0 && str4.length() != 0) {
                            if (str5.length() != 0) {
                                obj7 = str5;
                            }
                            String str6 = obj7;
                            Object obj10 = map.get("secondaryMuscleGroup");
                            String str7 = obj10 instanceof String ? (String) obj10 : null;
                            String str8 = (str7 == null || (obj3 = StringsKt.trim((CharSequence) str7).toString()) == null || obj3.length() <= 0) ? null : obj3;
                            Object obj11 = map.get("tertiaryMuscleGroup");
                            String str9 = obj11 instanceof String ? (String) obj11 : null;
                            String str10 = (str9 == null || (obj2 = StringsKt.trim((CharSequence) str9).toString()) == null || obj2.length() <= 0) ? null : obj2;
                            this.L$0 = sharedPreferences;
                            this.L$1 = repository;
                            this.L$2 = it;
                            this.J$0 = j;
                            this.label = i2;
                            SharedPreferences sharedPreferences3 = sharedPreferences;
                            long j3 = j;
                            if (repository.setExerciseMuscleGroups(str6, str4, str8, str10, Intrinsics.areEqual(map.get("isUnilateral"), Boxing.boxBoolean(z)), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = j3;
                            sharedPreferences = sharedPreferences3;
                            i2 = 2;
                            z = true;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                sharedPreferences.edit().putLong("cloud_exercise_muscle_tags_updated_ms", j).apply();
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
            long longValue = l != null ? l.longValue() : 0L;
            SharedPreferences sharedPreferences4 = this.$context.getSharedPreferences("cloud_sync", 0);
            if (longValue <= sharedPreferences4.getLong("cloud_exercise_muscle_tags_updated_ms", 0L)) {
                return Boxing.boxBoolean(false);
            }
            Object obj12 = documentSnapshot.get("tags");
            List list = obj12 instanceof List ? (List) obj12 : null;
            if (list == null) {
                return Boxing.boxBoolean(false);
            }
            repository = Repository.INSTANCE.get(this.$context);
            it = list.iterator();
            sharedPreferences = sharedPreferences4;
            j = longValue;
            while (it.hasNext()) {
            }
            sharedPreferences.edit().putLong("cloud_exercise_muscle_tags_updated_ms", j).apply();
            return Boxing.boxBoolean(true);
        }
        return Boxing.boxBoolean(false);
    }
}
