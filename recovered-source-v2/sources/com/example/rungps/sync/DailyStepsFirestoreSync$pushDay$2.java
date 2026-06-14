package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.Repository;
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

/* compiled from: DailyStepsFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.DailyStepsFirestoreSync$pushDay$2", f = "DailyStepsFirestoreSync.kt", i = {0}, l = {20, 29}, m = "invokeSuspend", n = {"user"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DailyStepsFirestoreSync$pushDay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $epochDay;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyStepsFirestoreSync$pushDay$2(Context context, long j, Continuation<? super DailyStepsFirestoreSync$pushDay$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$epochDay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DailyStepsFirestoreSync$pushDay$2(this.$context, this.$epochDay, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DailyStepsFirestoreSync$pushDay$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        CollectionReference col;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = currentUser;
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$context).dailyStepsForDay(this.$epochDay, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            currentUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        DailyStepsEntity dailyStepsEntity = (DailyStepsEntity) obj;
        if (dailyStepsEntity == null) {
            return Unit.INSTANCE;
        }
        DailyStepsFirestoreSync dailyStepsFirestoreSync = DailyStepsFirestoreSync.INSTANCE;
        String uid = currentUser.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        col = dailyStepsFirestoreSync.col(uid);
        Task<Void> task = col.document(String.valueOf(dailyStepsEntity.getEpochDay())).set(MapsKt.mapOf(TuplesKt.to("epochDay", Boxing.boxLong(dailyStepsEntity.getEpochDay())), TuplesKt.to("steps", Boxing.boxLong(dailyStepsEntity.getSteps())), TuplesKt.to(Property.SYMBOL_Z_ORDER_SOURCE, dailyStepsEntity.getSource()), TuplesKt.to("updatedAtMs", Boxing.boxLong(dailyStepsEntity.getSyncedAtMs()))), SetOptions.merge());
        Intrinsics.checkNotNullExpressionValue(task, "set(...)");
        this.L$0 = null;
        this.label = 2;
        if (TasksKt.await(task, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
