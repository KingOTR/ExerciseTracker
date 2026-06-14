package com.example.rungps.sync;

import androidx.health.connect.client.records.ExerciseSegment;
import com.example.rungps.data.SleepEntryEntity;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.SetOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
import org.maplibre.android.style.layers.Property;

/* compiled from: SleepFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.SleepFirestoreSync$pushEntry$2", f = "SleepFirestoreSync.kt", i = {}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepFirestoreSync$pushEntry$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SleepEntryEntity $entry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepFirestoreSync$pushEntry$2(SleepEntryEntity sleepEntryEntity, Continuation<? super SleepFirestoreSync$pushEntry$2> continuation) {
        super(2, continuation);
        this.$entry = sleepEntryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepFirestoreSync$pushEntry$2(this.$entry, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepFirestoreSync$pushEntry$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CollectionReference col;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Unit.INSTANCE;
            }
            String str = "sleep_" + this.$entry.getStartTimeMs();
            SleepFirestoreSync sleepFirestoreSync = SleepFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            col = sleepFirestoreSync.col(uid);
            Task<Void> task = col.document(str).set(MapsKt.hashMapOf(TuplesKt.to("startTimeMs", Boxing.boxLong(this.$entry.getStartTimeMs())), TuplesKt.to("endTimeMs", Boxing.boxLong(this.$entry.getEndTimeMs())), TuplesKt.to("totalSleepMin", Boxing.boxInt(this.$entry.getTotalSleepMin())), TuplesKt.to("sleepEfficiency", this.$entry.getSleepEfficiency()), TuplesKt.to("sleepQuality", this.$entry.getSleepQuality()), TuplesKt.to(Property.SYMBOL_Z_ORDER_SOURCE, this.$entry.getSource()), TuplesKt.to("notes", this.$entry.getNotes()), TuplesKt.to("wakeMood", this.$entry.getWakeMood()), TuplesKt.to("snoreEvents", this.$entry.getSnoreEvents()), TuplesKt.to("awakeSleepMin", this.$entry.getAwakeSleepMin()), TuplesKt.to("restlessnessIndex", this.$entry.getRestlessnessIndex()), TuplesKt.to("remSleepMin", this.$entry.getRemSleepMin()), TuplesKt.to("smartAlarmUsed", Boxing.boxBoolean(this.$entry.getSmartAlarmUsed())), TuplesKt.to("timeToFallAsleepMin", this.$entry.getTimeToFallAsleepMin()), TuplesKt.to("scoreRoutine", this.$entry.getScoreRoutine()), TuplesKt.to("scoreQualityPillar", this.$entry.getScoreQualityPillar()), TuplesKt.to("scoreDuration", this.$entry.getScoreDuration()), TuplesKt.to("hypnogramCompact", this.$entry.getHypnogramCompact()), TuplesKt.to("eventMarkersCompact", this.$entry.getEventMarkersCompact()), TuplesKt.to("deepSleepMin", this.$entry.getDeepSleepMin()), TuplesKt.to("lightSleepMin", this.$entry.getLightSleepMin()), TuplesKt.to("remSleepMin", this.$entry.getRemSleepMin()), TuplesKt.to("awakeSleepMin", this.$entry.getAwakeSleepMin()), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis()))), SetOptions.merge());
            Intrinsics.checkNotNullExpressionValue(task, "set(...)");
            this.label = 1;
            if (TasksKt.await(task, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
