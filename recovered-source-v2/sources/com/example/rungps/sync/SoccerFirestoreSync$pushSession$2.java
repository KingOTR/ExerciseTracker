package com.example.rungps.sync;

import com.example.rungps.data.SoccerSessionEntity;
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

/* compiled from: SoccerFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.SoccerFirestoreSync$pushSession$2", f = "SoccerFirestoreSync.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SoccerFirestoreSync$pushSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SoccerSessionEntity $session;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerFirestoreSync$pushSession$2(SoccerSessionEntity soccerSessionEntity, Continuation<? super SoccerFirestoreSync$pushSession$2> continuation) {
        super(2, continuation);
        this.$session = soccerSessionEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoccerFirestoreSync$pushSession$2(this.$session, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoccerFirestoreSync$pushSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SoccerFirestoreSync soccerFirestoreSync = SoccerFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            col = soccerFirestoreSync.col(uid);
            Task<Void> task = col.document("soccer_" + this.$session.getId()).set(MapsKt.hashMapOf(TuplesKt.to("kind", this.$session.getKind()), TuplesKt.to("startTimeMs", Boxing.boxLong(this.$session.getStartTimeMs())), TuplesKt.to("warmupMin", Boxing.boxInt(this.$session.getWarmupMin())), TuplesKt.to("playMin", Boxing.boxInt(this.$session.getPlayMin())), TuplesKt.to("intensity", Boxing.boxInt(this.$session.getIntensity())), TuplesKt.to("notes", this.$session.getNotes()), TuplesKt.to("watchSessionId", this.$session.getWatchSessionId()), TuplesKt.to("hrAvgBpm", this.$session.getHrAvgBpm()), TuplesKt.to("hrMaxBpm", this.$session.getHrMaxBpm()), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis()))), SetOptions.merge());
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
