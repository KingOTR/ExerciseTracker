package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.ExerciseMuscleTagEntity;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
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

/* compiled from: ExerciseMuscleFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.ExerciseMuscleFirestoreSync$pushFromRoom$2", f = "ExerciseMuscleFirestoreSync.kt", i = {0, 1}, l = {23, 38}, m = "invokeSuspend", n = {"user", "now"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class ExerciseMuscleFirestoreSync$pushFromRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExerciseMuscleFirestoreSync$pushFromRoom$2(Context context, Continuation<? super ExerciseMuscleFirestoreSync$pushFromRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExerciseMuscleFirestoreSync$pushFromRoom$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ExerciseMuscleFirestoreSync$pushFromRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        DocumentReference doc;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxBoolean(false);
            }
            this.L$0 = currentUser;
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$context).allExerciseMuscleTags(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("cloud_exercise_muscle_tags_updated_ms", j).apply();
                return Boxing.boxBoolean(true);
            }
            currentUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<ExerciseMuscleTagEntity> list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ExerciseMuscleTagEntity exerciseMuscleTagEntity : list) {
            arrayList.add(MapsKt.mapOf(TuplesKt.to("exerciseNameLower", exerciseMuscleTagEntity.getExerciseNameLower()), TuplesKt.to("displayName", exerciseMuscleTagEntity.getDisplayName()), TuplesKt.to("muscleGroup", exerciseMuscleTagEntity.getMuscleGroup()), TuplesKt.to("secondaryMuscleGroup", exerciseMuscleTagEntity.getSecondaryMuscleGroup()), TuplesKt.to("tertiaryMuscleGroup", exerciseMuscleTagEntity.getTertiaryMuscleGroup()), TuplesKt.to("isUnilateral", Boxing.boxBoolean(exerciseMuscleTagEntity.isUnilateral()))));
        }
        long currentTimeMillis = System.currentTimeMillis();
        ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync = ExerciseMuscleFirestoreSync.INSTANCE;
        String uid = currentUser.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        doc = exerciseMuscleFirestoreSync.doc(uid);
        Task<Void> task = doc.set(MapsKt.mapOf(TuplesKt.to("updatedAtMs", Boxing.boxLong(currentTimeMillis)), TuplesKt.to("tags", arrayList)), SetOptions.merge());
        Intrinsics.checkNotNullExpressionValue(task, "set(...)");
        this.L$0 = null;
        this.J$0 = currentTimeMillis;
        this.label = 2;
        if (TasksKt.await(task, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = currentTimeMillis;
        this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("cloud_exercise_muscle_tags_updated_ms", j).apply();
        return Boxing.boxBoolean(true);
    }
}
