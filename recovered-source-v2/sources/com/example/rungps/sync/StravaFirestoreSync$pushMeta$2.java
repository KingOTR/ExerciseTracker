package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.SetOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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

/* compiled from: StravaFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.StravaFirestoreSync$pushMeta$2", f = "StravaFirestoreSync.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {25, 29, 39}, m = "invokeSuspend", n = {"user", "repo", "connected", "now", "user", "connected", "now", "unlinkedRunKm", "unlinkedRideKm"}, s = {"L$0", "L$1", "Z$0", "J$0", "L$0", "Z$0", "J$0", "D$0", "D$1"})
/* loaded from: classes3.dex */
final class StravaFirestoreSync$pushMeta$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    double D$0;
    double D$1;
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaFirestoreSync$pushMeta$2(Context context, Continuation<? super StravaFirestoreSync$pushMeta$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StravaFirestoreSync$pushMeta$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((StravaFirestoreSync$pushMeta$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Repository repository;
        boolean isStravaConnected;
        long currentTimeMillis;
        Pair pair;
        Object stravaUnlinkedWeekKm;
        FirebaseUser firebaseUser;
        double doubleValue;
        double doubleValue2;
        int i;
        Object stravaPbsOnce;
        double d;
        long j;
        DocumentReference metaDoc;
        Task<Void> task;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxBoolean(false);
            }
            repository = Repository.INSTANCE.get(this.$context);
            isStravaConnected = repository.isStravaConnected();
            currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - 604800000;
            if (isStravaConnected) {
                this.L$0 = currentUser;
                this.L$1 = repository;
                this.Z$0 = isStravaConnected;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                stravaUnlinkedWeekKm = repository.stravaUnlinkedWeekKm(j2, currentTimeMillis, this);
                if (stravaUnlinkedWeekKm == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                pair = TuplesKt.to(Boxing.boxDouble(0.0d), Boxing.boxDouble(0.0d));
                firebaseUser = currentUser;
                doubleValue = ((Number) pair.component1()).doubleValue();
                doubleValue2 = ((Number) pair.component2()).doubleValue();
                if (!isStravaConnected) {
                    this.L$0 = firebaseUser;
                    this.L$1 = null;
                    this.Z$0 = isStravaConnected;
                    this.J$0 = currentTimeMillis;
                    this.D$0 = doubleValue;
                    this.D$1 = doubleValue2;
                    this.label = 2;
                    stravaPbsOnce = repository.stravaPbsOnce(this);
                    if (stravaPbsOnce == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    long j3 = currentTimeMillis;
                    d = doubleValue2;
                    j = j3;
                    i = ((List) stravaPbsOnce).size();
                    double d2 = d;
                    currentTimeMillis = j;
                    doubleValue2 = d2;
                    StravaFirestoreSync stravaFirestoreSync = StravaFirestoreSync.INSTANCE;
                    String uid = firebaseUser.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    metaDoc = stravaFirestoreSync.metaDoc(uid);
                    task = metaDoc.set(MapsKt.mapOf(TuplesKt.to("connected", Boxing.boxBoolean(isStravaConnected)), TuplesKt.to("syncedAtMs", Boxing.boxLong(currentTimeMillis)), TuplesKt.to("unlinkedRunKm7d", Boxing.boxDouble(doubleValue)), TuplesKt.to("unlinkedRideKm7d", Boxing.boxDouble(doubleValue2)), TuplesKt.to("pbCount", Boxing.boxInt(i))), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (TasksKt.await(task, this) == coroutine_suspended) {
                    }
                    return Boxing.boxBoolean(true);
                }
                i = 0;
                StravaFirestoreSync stravaFirestoreSync2 = StravaFirestoreSync.INSTANCE;
                String uid2 = firebaseUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                metaDoc = stravaFirestoreSync2.metaDoc(uid2);
                task = metaDoc.set(MapsKt.mapOf(TuplesKt.to("connected", Boxing.boxBoolean(isStravaConnected)), TuplesKt.to("syncedAtMs", Boxing.boxLong(currentTimeMillis)), TuplesKt.to("unlinkedRunKm7d", Boxing.boxDouble(doubleValue)), TuplesKt.to("unlinkedRideKm7d", Boxing.boxDouble(doubleValue2)), TuplesKt.to("pbCount", Boxing.boxInt(i))), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (TasksKt.await(task, this) == coroutine_suspended) {
                }
                return Boxing.boxBoolean(true);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(true);
                }
                d = this.D$1;
                double d3 = this.D$0;
                j = this.J$0;
                isStravaConnected = this.Z$0;
                firebaseUser = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                doubleValue = d3;
                stravaPbsOnce = obj;
                i = ((List) stravaPbsOnce).size();
                double d22 = d;
                currentTimeMillis = j;
                doubleValue2 = d22;
                StravaFirestoreSync stravaFirestoreSync22 = StravaFirestoreSync.INSTANCE;
                String uid22 = firebaseUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid22, "getUid(...)");
                metaDoc = stravaFirestoreSync22.metaDoc(uid22);
                task = metaDoc.set(MapsKt.mapOf(TuplesKt.to("connected", Boxing.boxBoolean(isStravaConnected)), TuplesKt.to("syncedAtMs", Boxing.boxLong(currentTimeMillis)), TuplesKt.to("unlinkedRunKm7d", Boxing.boxDouble(doubleValue)), TuplesKt.to("unlinkedRideKm7d", Boxing.boxDouble(doubleValue2)), TuplesKt.to("pbCount", Boxing.boxInt(i))), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (TasksKt.await(task, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(true);
            }
            currentTimeMillis = this.J$0;
            isStravaConnected = this.Z$0;
            repository = (Repository) this.L$1;
            currentUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            stravaUnlinkedWeekKm = obj;
        }
        pair = (Pair) stravaUnlinkedWeekKm;
        firebaseUser = currentUser;
        doubleValue = ((Number) pair.component1()).doubleValue();
        doubleValue2 = ((Number) pair.component2()).doubleValue();
        if (!isStravaConnected) {
        }
    }
}
