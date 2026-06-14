package com.example.rungps.sync;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.example.rungps.data.Repository;
import com.example.rungps.data.StravaPbEntity;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.firestore.WriteBatch;
import java.util.List;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: StravaPbFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.StravaPbFirestoreSync$pushAll$2", f = "StravaPbFirestoreSync.kt", i = {0, 1}, l = {18, 38}, m = "invokeSuspend", n = {"user", "rows"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class StravaPbFirestoreSync$pushAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaPbFirestoreSync$pushAll$2(Context context, Continuation<? super StravaPbFirestoreSync$pushAll$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StravaPbFirestoreSync$pushAll$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((StravaPbFirestoreSync$pushAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Object stravaPbsOnce;
        CollectionReference col;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            this.L$0 = currentUser;
            this.label = 1;
            stravaPbsOnce = Repository.INSTANCE.get(this.$context).stravaPbsOnce(this);
            if (stravaPbsOnce == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                return Boxing.boxInt(list.size());
            }
            currentUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            stravaPbsOnce = obj;
        }
        List<StravaPbEntity> list2 = (List) stravaPbsOnce;
        if (list2.isEmpty()) {
            return Boxing.boxInt(0);
        }
        WriteBatch batch = FirebaseFirestore.getInstance().batch();
        Intrinsics.checkNotNullExpressionValue(batch, "batch(...)");
        StravaPbFirestoreSync stravaPbFirestoreSync = StravaPbFirestoreSync.INSTANCE;
        String uid = currentUser.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        col = stravaPbFirestoreSync.col(uid);
        for (StravaPbEntity stravaPbEntity : list2) {
            DocumentReference document = col.document(StringsKt.replace$default(stravaPbEntity.getActivityKind() + "_" + stravaPbEntity.getDistanceKey(), DomExceptionUtils.SEPARATOR, "_", false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(document, "document(...)");
            batch.set(document, MapsKt.mapOf(TuplesKt.to("activityKind", stravaPbEntity.getActivityKind()), TuplesKt.to("distanceKey", stravaPbEntity.getDistanceKey()), TuplesKt.to("targetDistanceM", Boxing.boxDouble(stravaPbEntity.getTargetDistanceM())), TuplesKt.to("bestMovingTimeSec", Boxing.boxLong(stravaPbEntity.getBestMovingTimeSec())), TuplesKt.to("activityName", stravaPbEntity.getActivityName()), TuplesKt.to("startDate", stravaPbEntity.getStartDate()), TuplesKt.to("syncedAtMs", Boxing.boxLong(stravaPbEntity.getSyncedAtMs()))), SetOptions.merge());
        }
        Task<Void> commit = batch.commit();
        Intrinsics.checkNotNullExpressionValue(commit, "commit(...)");
        this.L$0 = list2;
        this.label = 2;
        if (TasksKt.await(commit, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list2;
        return Boxing.boxInt(list.size());
    }
}
