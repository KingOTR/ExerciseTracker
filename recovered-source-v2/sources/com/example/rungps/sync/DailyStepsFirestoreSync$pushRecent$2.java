package com.example.rungps.sync;

import android.content.Context;
import androidx.health.connect.client.records.ExerciseSegment;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.SetOptions;
import java.time.LocalDate;
import java.time.ZoneId;
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
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: DailyStepsFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.DailyStepsFirestoreSync$pushRecent$2", f = "DailyStepsFirestoreSync.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {40, ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION}, m = "invokeSuspend", n = {"user", "repo", "today", "n", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "user", "repo", "today", "n", DebugKt.DEBUG_PROPERTY_VALUE_OFF}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class DailyStepsFirestoreSync$pushRecent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $daysBack;
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyStepsFirestoreSync$pushRecent$2(Context context, int i, Continuation<? super DailyStepsFirestoreSync$pushRecent$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$daysBack = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DailyStepsFirestoreSync$pushRecent$2(this.$context, this.$daysBack, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((DailyStepsFirestoreSync$pushRecent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a6 -> B:7:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0134 -> B:6:0x0135). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Repository repository;
        LocalDate now;
        long j;
        long j2;
        int i;
        Object obj2;
        FirebaseUser firebaseUser;
        Repository repository2;
        LocalDate localDate;
        long j3;
        long j4;
        int i2;
        DailyStepsEntity dailyStepsEntity;
        CollectionReference col;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        char c = 2;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            repository = Repository.INSTANCE.get(this.$context);
            now = LocalDate.now(ZoneId.systemDefault());
            j = this.$daysBack;
            j2 = 0;
            i = 0;
            if (j2 >= j) {
            }
        } else if (i3 == 1) {
            j4 = this.J$1;
            j3 = this.J$0;
            i2 = this.I$0;
            localDate = (LocalDate) this.L$2;
            repository2 = (Repository) this.L$1;
            firebaseUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            dailyStepsEntity = (DailyStepsEntity) obj2;
            if (dailyStepsEntity != null) {
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = this.J$1;
            j3 = this.J$0;
            i2 = this.I$0;
            localDate = (LocalDate) this.L$2;
            repository2 = (Repository) this.L$1;
            firebaseUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            char c2 = 2;
            int i5 = 1;
            i2 += i5;
            FirebaseUser firebaseUser2 = firebaseUser;
            i = i2;
            currentUser = firebaseUser2;
            long j5 = j4;
            now = localDate;
            repository = repository2;
            long j6 = j3 + 1;
            i4 = i5;
            c = c2;
            j = j5;
            j2 = j6;
            if (j2 >= j) {
                this.L$0 = currentUser;
                this.L$1 = repository;
                this.L$2 = now;
                this.I$0 = i;
                this.J$0 = j2;
                this.J$1 = j;
                this.label = i4;
                obj2 = repository.dailyStepsForDay(now.minusDays(j2).toEpochDay(), this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i6 = i;
                firebaseUser = currentUser;
                i2 = i6;
                long j7 = j2;
                repository2 = repository;
                localDate = now;
                j4 = j;
                j3 = j7;
                dailyStepsEntity = (DailyStepsEntity) obj2;
                if (dailyStepsEntity != null) {
                    c2 = c;
                    i5 = i4;
                    FirebaseUser firebaseUser22 = firebaseUser;
                    i = i2;
                    currentUser = firebaseUser22;
                    long j52 = j4;
                    now = localDate;
                    repository = repository2;
                    long j62 = j3 + 1;
                    i4 = i5;
                    c = c2;
                    j = j52;
                    j2 = j62;
                    if (j2 >= j) {
                        return Boxing.boxInt(i);
                    }
                } else {
                    DailyStepsFirestoreSync dailyStepsFirestoreSync = DailyStepsFirestoreSync.INSTANCE;
                    String uid = firebaseUser.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    col = dailyStepsFirestoreSync.col(uid);
                    Task<Void> task = col.document(String.valueOf(dailyStepsEntity.getEpochDay())).set(MapsKt.mapOf(TuplesKt.to("epochDay", Boxing.boxLong(dailyStepsEntity.getEpochDay())), TuplesKt.to("steps", Boxing.boxLong(dailyStepsEntity.getSteps())), TuplesKt.to(Property.SYMBOL_Z_ORDER_SOURCE, dailyStepsEntity.getSource()), TuplesKt.to("updatedAtMs", Boxing.boxLong(dailyStepsEntity.getSyncedAtMs()))), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                    this.L$0 = firebaseUser;
                    this.L$1 = repository2;
                    this.L$2 = localDate;
                    this.I$0 = i2;
                    this.J$0 = j3;
                    this.J$1 = j4;
                    c2 = 2;
                    this.label = 2;
                    if (TasksKt.await(task, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i5 = 1;
                    i2 += i5;
                    FirebaseUser firebaseUser222 = firebaseUser;
                    i = i2;
                    currentUser = firebaseUser222;
                    long j522 = j4;
                    now = localDate;
                    repository = repository2;
                    long j622 = j3 + 1;
                    i4 = i5;
                    c = c2;
                    j = j522;
                    j2 = j622;
                    if (j2 >= j) {
                    }
                }
            }
        }
    }
}
