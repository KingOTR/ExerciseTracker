package com.example.rungps.sync;

import android.content.Context;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.repo.RunRepository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
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

/* compiled from: CloudSyncManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sync/CloudSyncResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.CloudSyncManager$syncAll$2", f = "CloudSyncManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}, l = {56, 61, 62, 63, 65, ExerciseSessionRecord.EXERCISE_TYPE_STRENGTH_TRAINING, ExerciseSessionRecord.EXERCISE_TYPE_STRETCHING, ExerciseSessionRecord.EXERCISE_TYPE_SURFING, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL, ExerciseSessionRecord.EXERCISE_TYPE_VOLLEYBALL, ExerciseSessionRecord.EXERCISE_TYPE_WALKING, 80, ExerciseSessionRecord.EXERCISE_TYPE_YOGA, 87, 91, 94, 97, 100, 119}, m = "invokeSuspend", n = {"$this$withContext", "user", "errors", "$this$withContext", "user", "errors", "merged", "$this$withContext", "user", "errors", "merged", "splitPulled", "$this$withContext", "user", "errors", "merged", "splitPulled", "$this$withContext", "user", "errors", "merged", "splitPulled", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "queued", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "recovery", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "recovery", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "recovery", "$this$withContext", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "recovery", "user", "errors", "merged", "splitPulled", "runsPulled", "gym", "runs", "soccer", "sleep", "recovery", "now"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "I$0", "Z$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "J$0"})
/* loaded from: classes3.dex */
final class CloudSyncManager$syncAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CloudSyncResult>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudSyncManager$syncAll$2(Context context, Continuation<? super CloudSyncManager$syncAll$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CloudSyncManager$syncAll$2 cloudSyncManager$syncAll$2 = new CloudSyncManager$syncAll$2(this.$context, continuation);
        cloudSyncManager$syncAll$2.L$0 = obj;
        return cloudSyncManager$syncAll$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CloudSyncResult> continuation) {
        return ((CloudSyncManager$syncAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:289|290|267|260|(4:261|262|(0)|242)|243|244|245|(0)|209|210|(0)|216|(6:217|218|219|220|221|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:161|162|135|122|(0)|128|(16:(4:129|130|(0)|98)|35|36|37|38|39|40|41|42|43|44|45|46|47|48|(0)(0))|99|(0)|105|106|107|(0)|76|77|(0)|83|84|85|(0)|27|28|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0a20, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x09b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0947 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0810 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x075f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0661 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0587 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0560 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x053a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0506 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x049d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0450 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0420 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x03d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0b29 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a10 A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        Object m7905constructorimpl3;
        Object m7905constructorimpl4;
        CoroutineScope coroutineScope;
        FirebaseUser firebaseUser;
        List<String> list;
        Throwable m7908exceptionOrNullimpl;
        int intValue;
        Object pullIntoRoom;
        CoroutineScope coroutineScope2;
        FirebaseUser firebaseUser2;
        List<String> list2;
        int i;
        boolean booleanValue;
        Object pullIntoRoom2;
        Object pullIntoRoom3;
        Object pullIntoRoom4;
        CoroutineScope coroutineScope3;
        FirebaseUser firebaseUser3;
        List<String> list3;
        int i2;
        boolean z;
        Throwable m7908exceptionOrNullimpl2;
        int intValue2;
        Object dedupeSavedRoutes;
        Object flush;
        int intValue3;
        Object pushAllFinishedSessions;
        int intValue4;
        Object pushAllFinishedRuns;
        int i3;
        boolean z2;
        int i4;
        CoroutineScope coroutineScope4;
        List<String> list4;
        int intValue5;
        int i5;
        CoroutineScope coroutineScope5;
        FirebaseUser firebaseUser4;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        CoroutineScope coroutineScope6;
        FirebaseUser firebaseUser5;
        Object pushRecent$default;
        Object m7905constructorimpl5;
        int i10;
        CoroutineScope coroutineScope7;
        FirebaseUser firebaseUser6;
        List<String> list5;
        int i11;
        boolean z4;
        int i12;
        int i13;
        Throwable m7908exceptionOrNullimpl3;
        int intValue6;
        CoroutineScope coroutineScope8;
        int i14;
        Object pushAllRoutes;
        Object pushFromRoom;
        Throwable th;
        Object pushFromRoom2;
        Object m7905constructorimpl6;
        int i15;
        boolean z5;
        List<String> list6;
        FirebaseUser firebaseUser7;
        int i16;
        int i17;
        CoroutineScope coroutineScope9;
        int i18;
        Throwable m7908exceptionOrNullimpl4;
        CoroutineScope coroutineScope10;
        FirebaseUser firebaseUser8;
        List<String> list7;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z6;
        FirebaseUser firebaseUser9;
        List<String> list8;
        int i23;
        Object pushRecent$default2;
        Object m7905constructorimpl7;
        int i24;
        int i25;
        boolean z7;
        List<String> list9;
        FirebaseUser firebaseUser10;
        CoroutineScope coroutineScope11;
        int i26;
        int i27;
        Throwable m7908exceptionOrNullimpl5;
        int intValue7;
        int i28;
        CoroutineScope coroutineScope12;
        FirebaseUser firebaseUser11;
        List<String> list10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z8;
        int i34;
        int i35;
        List<String> list11;
        Object pushRecent$default3;
        Object m7905constructorimpl8;
        int i36;
        int i37;
        int i38;
        List<String> list12;
        FirebaseUser firebaseUser12;
        CoroutineScope coroutineScope13;
        int i39;
        boolean z9;
        int i40;
        int i41;
        Throwable m7908exceptionOrNullimpl6;
        int intValue8;
        int i42;
        CoroutineScope coroutineScope14;
        FirebaseUser firebaseUser13;
        List<String> list13;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        boolean z10;
        int i49;
        int i50;
        Object pushRecent$default4;
        Object m7905constructorimpl9;
        CoroutineScope coroutineScope15;
        List<String> list14;
        Throwable m7908exceptionOrNullimpl7;
        Object pushAll;
        Throwable th2;
        Object m7905constructorimpl10;
        Throwable m7908exceptionOrNullimpl8;
        Object pushMeta;
        Object m7905constructorimpl11;
        boolean z11;
        int i51;
        Throwable m7908exceptionOrNullimpl9;
        Object pushFromPrefs;
        Object m7905constructorimpl12;
        List<String> list15;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        Throwable m7908exceptionOrNullimpl10;
        long currentTimeMillis;
        int i59;
        long j;
        FirebaseUser firebaseUser14;
        int i60;
        Object await;
        Object m7905constructorimpl13;
        Throwable m7908exceptionOrNullimpl11;
        CoroutineScope coroutineScope16;
        FirebaseUser currentUser;
        ArrayList arrayList;
        Object pullWithConflictResolution;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                    try {
                        try {
                            try {
                            } catch (Throwable th3) {
                                Result.Companion companion = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th3));
                            }
                        } catch (Throwable th4) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m7905constructorimpl4 = Result.m7905constructorimpl(ResultKt.createFailure(th4));
                        }
                    } catch (Throwable th5) {
                        Result.Companion companion3 = Result.INSTANCE;
                        m7905constructorimpl3 = Result.m7905constructorimpl(ResultKt.createFailure(th5));
                    }
                } catch (Throwable th6) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th6));
                }
            } catch (Throwable th7) {
                Result.Companion companion5 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th7));
            }
        } catch (Throwable th8) {
            Result.Companion companion6 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th8));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope16 = (CoroutineScope) this.L$0;
                currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser == null) {
                    return new CloudSyncResult(0, 0, 0, 0, 0, 0, CloudSyncManager.INSTANCE.lastSyncMs(this.$context), false, 0, null, null, 1536, null);
                }
                arrayList = new ArrayList();
                Context context = this.$context;
                Result.Companion companion7 = Result.INSTANCE;
                GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                CloudSyncManager$syncAll$2$merged$1$1 cloudSyncManager$syncAll$2$merged$1$1 = new CloudSyncManager$syncAll$2$merged$1$1(CloudSyncManager.INSTANCE);
                this.L$0 = coroutineScope16;
                this.L$1 = currentUser;
                this.L$2 = arrayList;
                this.label = 1;
                pullWithConflictResolution = gymFirestoreSync.pullWithConflictResolution(context, cloudSyncManager$syncAll$2$merged$1$1, this);
                if (pullWithConflictResolution == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullWithConflictResolution).intValue()));
                coroutineScope = coroutineScope16;
                firebaseUser = currentUser;
                list = arrayList;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "failed";
                    }
                    list.add("pull: " + message);
                    m7905constructorimpl = Boxing.boxInt(0);
                }
                intValue = ((Number) m7905constructorimpl).intValue();
                Context context2 = this.$context;
                Result.Companion companion8 = Result.INSTANCE;
                SplitFirestoreSync splitFirestoreSync = SplitFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope;
                this.L$1 = firebaseUser;
                this.L$2 = list;
                this.I$0 = intValue;
                this.label = 2;
                pullIntoRoom = splitFirestoreSync.pullIntoRoom(context2, this);
                if (pullIntoRoom == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl3 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom).booleanValue()));
                coroutineScope2 = coroutineScope;
                firebaseUser2 = firebaseUser;
                list2 = list;
                i = intValue;
                Boolean boxBoolean = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl3)) {
                    m7905constructorimpl3 = boxBoolean;
                }
                booleanValue = ((Boolean) m7905constructorimpl3).booleanValue();
                Context context3 = this.$context;
                Result.Companion companion9 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 3;
                pullIntoRoom2 = exerciseMuscleFirestoreSync.pullIntoRoom(context3, this);
                if (pullIntoRoom2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom2).booleanValue()));
                Context context4 = this.$context;
                Result.Companion companion10 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 4;
                pullIntoRoom3 = routeFirestoreSync.pullIntoRoom(context4, this);
                if (pullIntoRoom3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom3).intValue()));
                Integer boxInt = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    m7905constructorimpl2 = boxInt;
                }
                ((Number) m7905constructorimpl2).intValue();
                Context context5 = this.$context;
                Result.Companion companion11 = Result.INSTANCE;
                RunFirestoreSync runFirestoreSync = RunFirestoreSync.INSTANCE;
                RunRepository runRepo = Repository.INSTANCE.get(context5).getRunRepo();
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 5;
                pullIntoRoom4 = runFirestoreSync.pullIntoRoom(context5, runRepo, this);
                if (pullIntoRoom4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                    String message2 = m7908exceptionOrNullimpl2.getMessage();
                    if (message2 == null) {
                        message2 = "failed";
                    }
                    list3.add("runs pull: " + message2);
                    m7905constructorimpl4 = Boxing.boxInt(0);
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context6 = this.$context;
                Result.Companion companion12 = Result.INSTANCE;
                Repository repository = Repository.INSTANCE.get(context6);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = intValue2;
                z2 = z;
                i4 = i2;
                coroutineScope4 = coroutineScope3;
                list4 = list3;
                intValue5 = ((Number) pushAllFinishedRuns).intValue();
                Context context7 = this.$context;
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    SoccerFirestoreSync soccerFirestoreSync = SoccerFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope4;
                    this.L$1 = firebaseUser3;
                    this.L$2 = list4;
                    this.I$0 = i4;
                    this.Z$0 = z2;
                    this.I$1 = i3;
                    this.I$2 = intValue4;
                    this.I$3 = intValue5;
                    this.label = 10;
                    i5 = intValue5;
                    coroutineScope5 = coroutineScope4;
                    firebaseUser4 = firebaseUser3;
                    try {
                        pushRecent$default = SoccerFirestoreSync.pushRecent$default(soccerFirestoreSync, context7, 0, this, 2, null);
                    } catch (Throwable th9) {
                        th = th9;
                        i6 = intValue4;
                        i7 = i3;
                        z3 = z2;
                        i8 = i4;
                        list4 = list4;
                        i9 = i5;
                        coroutineScope6 = coroutineScope5;
                        firebaseUser5 = firebaseUser4;
                        Result.Companion companion14 = Result.INSTANCE;
                        m7905constructorimpl5 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        int i61 = i6;
                        i10 = i9;
                        coroutineScope7 = coroutineScope6;
                        firebaseUser6 = firebaseUser5;
                        list5 = list4;
                        i11 = i8;
                        z4 = z3;
                        i12 = i7;
                        i13 = i61;
                        m7908exceptionOrNullimpl3 = Result.m7908exceptionOrNullimpl(m7905constructorimpl5);
                        if (m7908exceptionOrNullimpl3 != null) {
                        }
                        intValue6 = ((Number) m7905constructorimpl5).intValue();
                        Context context8 = this.$context;
                        try {
                            Result.Companion companion15 = Result.INSTANCE;
                            RouteFirestoreSync routeFirestoreSync2 = RouteFirestoreSync.INSTANCE;
                            this.L$0 = coroutineScope7;
                            this.L$1 = firebaseUser6;
                            this.L$2 = list5;
                            this.I$0 = i11;
                            this.Z$0 = z4;
                            this.I$1 = i12;
                            this.I$2 = i13;
                            this.I$3 = i10;
                            this.I$4 = intValue6;
                            this.label = 11;
                            pushAllRoutes = routeFirestoreSync2.pushAllRoutes(context8, this);
                            if (pushAllRoutes != coroutine_suspended) {
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            coroutineScope8 = coroutineScope7;
                            i14 = intValue6;
                            Result.Companion companion16 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                            Context context9 = this.$context;
                            try {
                                Result.Companion companion17 = Result.INSTANCE;
                                SplitFirestoreSync splitFirestoreSync2 = SplitFirestoreSync.INSTANCE;
                                this.L$0 = coroutineScope8;
                                this.L$1 = firebaseUser6;
                                this.L$2 = list5;
                                this.I$0 = i11;
                                this.Z$0 = z4;
                                this.I$1 = i12;
                                this.I$2 = i13;
                                this.I$3 = i10;
                                this.I$4 = i14;
                                this.label = 12;
                                pushFromRoom = splitFirestoreSync2.pushFromRoom(context9, this);
                                if (pushFromRoom == coroutine_suspended) {
                                }
                                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                            } catch (Throwable th11) {
                                th = th11;
                                Result.Companion companion18 = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th));
                                Context context10 = this.$context;
                                Result.Companion companion19 = Result.INSTANCE;
                                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync2 = ExerciseMuscleFirestoreSync.INSTANCE;
                                this.L$0 = coroutineScope8;
                                this.L$1 = firebaseUser6;
                                this.L$2 = list5;
                                this.I$0 = i11;
                                this.Z$0 = z4;
                                this.I$1 = i12;
                                this.I$2 = i13;
                                this.I$3 = i10;
                                this.I$4 = i14;
                                this.label = 13;
                                pushFromRoom2 = exerciseMuscleFirestoreSync2.pushFromRoom(context10, this);
                                if (pushFromRoom2 == coroutine_suspended) {
                                }
                                m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                                i15 = i12;
                                z5 = z4;
                                list6 = list5;
                                firebaseUser7 = firebaseUser6;
                                i16 = i14;
                                i17 = i10;
                                coroutineScope9 = coroutineScope8;
                                i18 = i13;
                                m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                                if (m7908exceptionOrNullimpl4 != null) {
                                }
                                Context context11 = this.$context;
                                Result.Companion companion20 = Result.INSTANCE;
                                SleepFirestoreSync sleepFirestoreSync = SleepFirestoreSync.INSTANCE;
                                this.L$0 = coroutineScope9;
                                this.L$1 = firebaseUser7;
                                this.L$2 = list6;
                                this.I$0 = i11;
                                this.Z$0 = z5;
                                this.I$1 = i15;
                                this.I$2 = i18;
                                this.I$3 = i17;
                                this.I$4 = i16;
                                this.label = 14;
                                coroutineScope10 = coroutineScope9;
                                firebaseUser8 = firebaseUser7;
                                list7 = list6;
                                i23 = i11;
                                try {
                                    pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync, context11, 0, this, 2, null);
                                    if (pushRecent$default2 == coroutine_suspended) {
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    i19 = i16;
                                    i20 = i17;
                                    i21 = i18;
                                    i22 = i15;
                                    z6 = z5;
                                    i11 = i23;
                                    firebaseUser9 = firebaseUser8;
                                    list8 = list7;
                                    Result.Companion companion21 = Result.INSTANCE;
                                    m7905constructorimpl7 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                    i24 = i21;
                                    i25 = i22;
                                    z7 = z6;
                                    list9 = list8;
                                    firebaseUser10 = firebaseUser9;
                                    coroutineScope11 = coroutineScope10;
                                    i26 = i19;
                                    i27 = i20;
                                    m7908exceptionOrNullimpl5 = Result.m7908exceptionOrNullimpl(m7905constructorimpl7);
                                    if (m7908exceptionOrNullimpl5 != null) {
                                    }
                                    intValue7 = ((Number) m7905constructorimpl7).intValue();
                                    Context context12 = this.$context;
                                    try {
                                        Result.Companion companion22 = Result.INSTANCE;
                                        RecoveryFirestoreSync recoveryFirestoreSync = RecoveryFirestoreSync.INSTANCE;
                                        this.L$0 = coroutineScope11;
                                        this.L$1 = firebaseUser10;
                                        this.L$2 = list9;
                                        this.I$0 = i11;
                                        this.Z$0 = z7;
                                        this.I$1 = i25;
                                        this.I$2 = i24;
                                        this.I$3 = i27;
                                        this.I$4 = i26;
                                        this.I$5 = intValue7;
                                        this.label = 15;
                                        i28 = intValue7;
                                        coroutineScope12 = coroutineScope11;
                                        firebaseUser11 = firebaseUser10;
                                        list10 = list9;
                                        i29 = i11;
                                        try {
                                            pushRecent$default3 = RecoveryFirestoreSync.pushRecent$default(recoveryFirestoreSync, context12, 0, this, 2, null);
                                            if (pushRecent$default3 == coroutine_suspended) {
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            i30 = i26;
                                            i31 = i27;
                                            i32 = i24;
                                            i33 = i25;
                                            z8 = z7;
                                            i34 = i29;
                                            i35 = i28;
                                            list11 = list10;
                                            Result.Companion companion23 = Result.INSTANCE;
                                            m7905constructorimpl8 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                            i36 = i31;
                                            i37 = i32;
                                            i38 = i33;
                                            list12 = list11;
                                            firebaseUser12 = firebaseUser11;
                                            coroutineScope13 = coroutineScope12;
                                            i39 = i30;
                                            z9 = z8;
                                            i40 = i34;
                                            i41 = i35;
                                            m7908exceptionOrNullimpl6 = Result.m7908exceptionOrNullimpl(m7905constructorimpl8);
                                            if (m7908exceptionOrNullimpl6 != null) {
                                            }
                                            intValue8 = ((Number) m7905constructorimpl8).intValue();
                                            Context context13 = this.$context;
                                            try {
                                                Result.Companion companion24 = Result.INSTANCE;
                                                DailyStepsFirestoreSync dailyStepsFirestoreSync = DailyStepsFirestoreSync.INSTANCE;
                                                this.L$0 = coroutineScope13;
                                                this.L$1 = firebaseUser12;
                                                this.L$2 = list12;
                                                this.I$0 = i40;
                                                this.Z$0 = z9;
                                                this.I$1 = i38;
                                                this.I$2 = i37;
                                                this.I$3 = i36;
                                                this.I$4 = i39;
                                                this.I$5 = i41;
                                                this.I$6 = intValue8;
                                                this.label = 16;
                                                i42 = intValue8;
                                                coroutineScope14 = coroutineScope13;
                                                firebaseUser13 = firebaseUser12;
                                                list13 = list12;
                                                i43 = i40;
                                                try {
                                                    pushRecent$default4 = DailyStepsFirestoreSync.pushRecent$default(dailyStepsFirestoreSync, context13, 0, this, 2, null);
                                                    if (pushRecent$default4 == coroutine_suspended) {
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    i44 = i41;
                                                    i45 = i39;
                                                    i46 = i36;
                                                    i47 = i37;
                                                    i48 = i38;
                                                    z10 = z9;
                                                    i49 = i43;
                                                    i50 = i42;
                                                    Result.Companion companion25 = Result.INSTANCE;
                                                    m7905constructorimpl9 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                                    coroutineScope15 = coroutineScope14;
                                                    list14 = list13;
                                                    m7908exceptionOrNullimpl7 = Result.m7908exceptionOrNullimpl(m7905constructorimpl9);
                                                    if (m7908exceptionOrNullimpl7 != null) {
                                                    }
                                                    Context context14 = this.$context;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        Result.Companion companion26 = Result.INSTANCE;
                                                                        StravaPbFirestoreSync stravaPbFirestoreSync = StravaPbFirestoreSync.INSTANCE;
                                                                        this.L$0 = coroutineScope15;
                                                                        this.L$1 = firebaseUser13;
                                                                        this.L$2 = list14;
                                                                        this.I$0 = i49;
                                                                        this.Z$0 = z10;
                                                                        this.I$1 = i48;
                                                                        this.I$2 = i47;
                                                                        this.I$3 = i46;
                                                                        this.I$4 = i45;
                                                                        this.I$5 = i44;
                                                                        this.I$6 = i50;
                                                                        this.label = 17;
                                                                        pushAll = stravaPbFirestoreSync.pushAll(context14, this);
                                                                        if (pushAll == coroutine_suspended) {
                                                                        }
                                                                        m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                                                                    } catch (Throwable th15) {
                                                                        th2 = th15;
                                                                        Result.Companion companion27 = Result.INSTANCE;
                                                                        m7905constructorimpl10 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                                                                        m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                                                                        if (m7908exceptionOrNullimpl8 != null) {
                                                                        }
                                                                        Context context15 = this.$context;
                                                                        Result.Companion companion28 = Result.INSTANCE;
                                                                        StravaFirestoreSync stravaFirestoreSync = StravaFirestoreSync.INSTANCE;
                                                                        this.L$0 = coroutineScope15;
                                                                        this.L$1 = firebaseUser13;
                                                                        this.L$2 = list14;
                                                                        this.I$0 = i49;
                                                                        this.Z$0 = z10;
                                                                        this.I$1 = i48;
                                                                        this.I$2 = i47;
                                                                        this.I$3 = i46;
                                                                        this.I$4 = i45;
                                                                        this.I$5 = i44;
                                                                        this.I$6 = i50;
                                                                        this.label = 18;
                                                                        pushMeta = stravaFirestoreSync.pushMeta(context15, this);
                                                                        if (pushMeta == coroutine_suspended) {
                                                                        }
                                                                        m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                                                                        int i62 = i49;
                                                                        z11 = z10;
                                                                        i51 = i62;
                                                                        m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                                                                        if (m7908exceptionOrNullimpl9 != null) {
                                                                        }
                                                                        Context context16 = this.$context;
                                                                        Result.Companion companion29 = Result.INSTANCE;
                                                                        ProfileFirestoreSync profileFirestoreSync = ProfileFirestoreSync.INSTANCE;
                                                                        this.L$0 = coroutineScope15;
                                                                        this.L$1 = firebaseUser13;
                                                                        this.L$2 = list14;
                                                                        this.I$0 = i51;
                                                                        this.Z$0 = z11;
                                                                        this.I$1 = i48;
                                                                        this.I$2 = i47;
                                                                        this.I$3 = i46;
                                                                        this.I$4 = i45;
                                                                        this.I$5 = i44;
                                                                        this.I$6 = i50;
                                                                        this.label = 19;
                                                                        pushFromPrefs = profileFirestoreSync.pushFromPrefs(context16, this);
                                                                        if (pushFromPrefs == coroutine_suspended) {
                                                                        }
                                                                        m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                                                                        list15 = list14;
                                                                        i52 = i51;
                                                                        i53 = i48;
                                                                        i54 = i46;
                                                                        i55 = i44;
                                                                        int i63 = i45;
                                                                        i56 = i50;
                                                                        i57 = i47;
                                                                        i58 = i63;
                                                                        m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                                                                        if (m7908exceptionOrNullimpl10 != null) {
                                                                        }
                                                                        currentTimeMillis = System.currentTimeMillis();
                                                                        this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                                                                        Context context17 = this.$context;
                                                                        Result.Companion companion30 = Result.INSTANCE;
                                                                        DocumentReference document = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                                                                        Pair[] pairArr = new Pair[6];
                                                                        pairArr[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                                                                        pairArr[1] = TuplesKt.to("device", "android");
                                                                        pairArr[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context17)));
                                                                        pairArr[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                                                                        pairArr[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                                                                        pairArr[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                                                                        Task<Void> task = document.set(MapsKt.mapOf(pairArr), SetOptions.merge());
                                                                        Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                                                                        this.L$0 = firebaseUser13;
                                                                        this.L$1 = list15;
                                                                        this.L$2 = null;
                                                                        this.I$0 = i52;
                                                                        this.Z$0 = z11;
                                                                        this.I$1 = i53;
                                                                        this.I$2 = i57;
                                                                        this.I$3 = i54;
                                                                        this.I$4 = i58;
                                                                        i60 = i55;
                                                                        this.I$5 = i60;
                                                                        i56 = i56;
                                                                        this.I$6 = i56;
                                                                        this.J$0 = currentTimeMillis;
                                                                        this.label = 20;
                                                                        await = TasksKt.await(task, this);
                                                                        if (await != coroutine_suspended) {
                                                                        }
                                                                    }
                                                                    this.I$6 = i56;
                                                                    this.J$0 = currentTimeMillis;
                                                                    this.label = 20;
                                                                    await = TasksKt.await(task, this);
                                                                    if (await != coroutine_suspended) {
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                    i59 = i57;
                                                                    i55 = i60;
                                                                    j = currentTimeMillis;
                                                                    firebaseUser14 = firebaseUser13;
                                                                    Result.Companion companion31 = Result.INSTANCE;
                                                                    m7905constructorimpl13 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                                                    List<String> list16 = list15;
                                                                    int i64 = i54;
                                                                    int i65 = i56;
                                                                    int i66 = i58;
                                                                    int i67 = i55;
                                                                    long j2 = j;
                                                                    FirebaseUser firebaseUser15 = firebaseUser14;
                                                                    int i68 = i59;
                                                                    int i69 = i52;
                                                                    int i70 = i53;
                                                                    m7908exceptionOrNullimpl11 = Result.m7908exceptionOrNullimpl(m7905constructorimpl13);
                                                                    if (m7908exceptionOrNullimpl11 != null) {
                                                                    }
                                                                    String uid = firebaseUser15.getUid();
                                                                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                                                    return new CloudSyncResult(i68, i64, i66, i67, i65, i69, j2, z11, i70, uid, list16);
                                                                }
                                                                this.I$5 = i60;
                                                                i56 = i56;
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                i56 = i56;
                                                            }
                                                            pairArr[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                                                            pairArr[1] = TuplesKt.to("device", "android");
                                                            pairArr[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context17)));
                                                            pairArr[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                                                            pairArr[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                                                            pairArr[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                                                            Task<Void> task2 = document.set(MapsKt.mapOf(pairArr), SetOptions.merge());
                                                            Intrinsics.checkNotNullExpressionValue(task2, "set(...)");
                                                            this.L$0 = firebaseUser13;
                                                            this.L$1 = list15;
                                                            this.L$2 = null;
                                                            this.I$0 = i52;
                                                            this.Z$0 = z11;
                                                            this.I$1 = i53;
                                                            this.I$2 = i57;
                                                            this.I$3 = i54;
                                                            this.I$4 = i58;
                                                            i60 = i55;
                                                        } catch (Throwable th18) {
                                                            th = th18;
                                                            i56 = i56;
                                                            i60 = i55;
                                                        }
                                                        Result.Companion companion302 = Result.INSTANCE;
                                                        DocumentReference document2 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                                                        Pair[] pairArr2 = new Pair[6];
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        i59 = i57;
                                                    }
                                                    m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                                                    if (m7908exceptionOrNullimpl8 != null) {
                                                    }
                                                    Context context152 = this.$context;
                                                    Result.Companion companion282 = Result.INSTANCE;
                                                    StravaFirestoreSync stravaFirestoreSync2 = StravaFirestoreSync.INSTANCE;
                                                    this.L$0 = coroutineScope15;
                                                    this.L$1 = firebaseUser13;
                                                    this.L$2 = list14;
                                                    this.I$0 = i49;
                                                    this.Z$0 = z10;
                                                    this.I$1 = i48;
                                                    this.I$2 = i47;
                                                    this.I$3 = i46;
                                                    this.I$4 = i45;
                                                    this.I$5 = i44;
                                                    this.I$6 = i50;
                                                    this.label = 18;
                                                    pushMeta = stravaFirestoreSync2.pushMeta(context152, this);
                                                    if (pushMeta == coroutine_suspended) {
                                                    }
                                                    m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                                                    int i622 = i49;
                                                    z11 = z10;
                                                    i51 = i622;
                                                    m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                                                    if (m7908exceptionOrNullimpl9 != null) {
                                                    }
                                                    Context context162 = this.$context;
                                                    Result.Companion companion292 = Result.INSTANCE;
                                                    ProfileFirestoreSync profileFirestoreSync2 = ProfileFirestoreSync.INSTANCE;
                                                    this.L$0 = coroutineScope15;
                                                    this.L$1 = firebaseUser13;
                                                    this.L$2 = list14;
                                                    this.I$0 = i51;
                                                    this.Z$0 = z11;
                                                    this.I$1 = i48;
                                                    this.I$2 = i47;
                                                    this.I$3 = i46;
                                                    this.I$4 = i45;
                                                    this.I$5 = i44;
                                                    this.I$6 = i50;
                                                    this.label = 19;
                                                    pushFromPrefs = profileFirestoreSync2.pushFromPrefs(context162, this);
                                                    if (pushFromPrefs == coroutine_suspended) {
                                                    }
                                                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                                                    list15 = list14;
                                                    i52 = i51;
                                                    i53 = i48;
                                                    i54 = i46;
                                                    i55 = i44;
                                                    int i632 = i45;
                                                    i56 = i50;
                                                    i57 = i47;
                                                    i58 = i632;
                                                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                                                    if (m7908exceptionOrNullimpl10 != null) {
                                                    }
                                                    currentTimeMillis = System.currentTimeMillis();
                                                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                                                    Context context172 = this.$context;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                i42 = intValue8;
                                                coroutineScope14 = coroutineScope13;
                                                firebaseUser13 = firebaseUser12;
                                                list13 = list12;
                                                i43 = i40;
                                            }
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        i28 = intValue7;
                                        coroutineScope12 = coroutineScope11;
                                        firebaseUser11 = firebaseUser10;
                                        list10 = list9;
                                        i29 = i11;
                                    }
                                }
                            }
                            Context context102 = this.$context;
                            Result.Companion companion192 = Result.INSTANCE;
                            ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync22 = ExerciseMuscleFirestoreSync.INSTANCE;
                            this.L$0 = coroutineScope8;
                            this.L$1 = firebaseUser6;
                            this.L$2 = list5;
                            this.I$0 = i11;
                            this.Z$0 = z4;
                            this.I$1 = i12;
                            this.I$2 = i13;
                            this.I$3 = i10;
                            this.I$4 = i14;
                            this.label = 13;
                            pushFromRoom2 = exerciseMuscleFirestoreSync22.pushFromRoom(context102, this);
                            if (pushFromRoom2 == coroutine_suspended) {
                            }
                            m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                            i15 = i12;
                            z5 = z4;
                            list6 = list5;
                            firebaseUser7 = firebaseUser6;
                            i16 = i14;
                            i17 = i10;
                            coroutineScope9 = coroutineScope8;
                            i18 = i13;
                            m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                            if (m7908exceptionOrNullimpl4 != null) {
                            }
                            Context context112 = this.$context;
                            try {
                                Result.Companion companion202 = Result.INSTANCE;
                                SleepFirestoreSync sleepFirestoreSync2 = SleepFirestoreSync.INSTANCE;
                                this.L$0 = coroutineScope9;
                                this.L$1 = firebaseUser7;
                                this.L$2 = list6;
                                this.I$0 = i11;
                                this.Z$0 = z5;
                                this.I$1 = i15;
                                this.I$2 = i18;
                                this.I$3 = i17;
                                this.I$4 = i16;
                                this.label = 14;
                                coroutineScope10 = coroutineScope9;
                                firebaseUser8 = firebaseUser7;
                                list7 = list6;
                                i23 = i11;
                                pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync2, context112, 0, this, 2, null);
                                if (pushRecent$default2 == coroutine_suspended) {
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                coroutineScope10 = coroutineScope9;
                                firebaseUser8 = firebaseUser7;
                                list7 = list6;
                                i19 = i16;
                                i20 = i17;
                                i21 = i18;
                                i22 = i15;
                                z6 = z5;
                            }
                        }
                    }
                } catch (Throwable th23) {
                    th = th23;
                    i5 = intValue5;
                    coroutineScope5 = coroutineScope4;
                    firebaseUser4 = firebaseUser3;
                    i6 = intValue4;
                    i7 = i3;
                    z3 = z2;
                    i8 = i4;
                }
                if (pushRecent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i6 = intValue4;
                i7 = i3;
                z3 = z2;
                i8 = i4;
                list4 = list4;
                i9 = i5;
                coroutineScope6 = coroutineScope5;
                firebaseUser5 = firebaseUser4;
                m7905constructorimpl5 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default).intValue()));
                int i612 = i6;
                i10 = i9;
                coroutineScope7 = coroutineScope6;
                firebaseUser6 = firebaseUser5;
                list5 = list4;
                i11 = i8;
                z4 = z3;
                i12 = i7;
                i13 = i612;
                m7908exceptionOrNullimpl3 = Result.m7908exceptionOrNullimpl(m7905constructorimpl5);
                if (m7908exceptionOrNullimpl3 != null) {
                    String message3 = m7908exceptionOrNullimpl3.getMessage();
                    if (message3 == null) {
                        message3 = "failed";
                    }
                    list5.add("soccer: " + message3);
                    m7905constructorimpl5 = Boxing.boxInt(0);
                }
                intValue6 = ((Number) m7905constructorimpl5).intValue();
                Context context82 = this.$context;
                Result.Companion companion152 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync22 = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope7;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = intValue6;
                this.label = 11;
                pushAllRoutes = routeFirestoreSync22.pushAllRoutes(context82, this);
                if (pushAllRoutes != coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope8 = coroutineScope7;
                i14 = intValue6;
                try {
                    Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAllRoutes).intValue()));
                } catch (Throwable th24) {
                    th = th24;
                    Result.Companion companion162 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    Context context92 = this.$context;
                    Result.Companion companion172 = Result.INSTANCE;
                    SplitFirestoreSync splitFirestoreSync22 = SplitFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope8;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = i14;
                    this.label = 12;
                    pushFromRoom = splitFirestoreSync22.pushFromRoom(context92, this);
                    if (pushFromRoom == coroutine_suspended) {
                    }
                    Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                    Context context1022 = this.$context;
                    Result.Companion companion1922 = Result.INSTANCE;
                    ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync222 = ExerciseMuscleFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope8;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = i14;
                    this.label = 13;
                    pushFromRoom2 = exerciseMuscleFirestoreSync222.pushFromRoom(context1022, this);
                    if (pushFromRoom2 == coroutine_suspended) {
                    }
                    m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                    i15 = i12;
                    z5 = z4;
                    list6 = list5;
                    firebaseUser7 = firebaseUser6;
                    i16 = i14;
                    i17 = i10;
                    coroutineScope9 = coroutineScope8;
                    i18 = i13;
                    m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                    if (m7908exceptionOrNullimpl4 != null) {
                    }
                    Context context1122 = this.$context;
                    Result.Companion companion2022 = Result.INSTANCE;
                    SleepFirestoreSync sleepFirestoreSync22 = SleepFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope9;
                    this.L$1 = firebaseUser7;
                    this.L$2 = list6;
                    this.I$0 = i11;
                    this.Z$0 = z5;
                    this.I$1 = i15;
                    this.I$2 = i18;
                    this.I$3 = i17;
                    this.I$4 = i16;
                    this.label = 14;
                    coroutineScope10 = coroutineScope9;
                    firebaseUser8 = firebaseUser7;
                    list7 = list6;
                    i23 = i11;
                    pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync22, context1122, 0, this, 2, null);
                    if (pushRecent$default2 == coroutine_suspended) {
                    }
                }
                Context context922 = this.$context;
                Result.Companion companion1722 = Result.INSTANCE;
                SplitFirestoreSync splitFirestoreSync222 = SplitFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope8;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = i14;
                this.label = 12;
                pushFromRoom = splitFirestoreSync222.pushFromRoom(context922, this);
                if (pushFromRoom == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                Context context10222 = this.$context;
                Result.Companion companion19222 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync2222 = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope8;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = i14;
                this.label = 13;
                pushFromRoom2 = exerciseMuscleFirestoreSync2222.pushFromRoom(context10222, this);
                if (pushFromRoom2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                i15 = i12;
                z5 = z4;
                list6 = list5;
                firebaseUser7 = firebaseUser6;
                i16 = i14;
                i17 = i10;
                coroutineScope9 = coroutineScope8;
                i18 = i13;
                m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                if (m7908exceptionOrNullimpl4 != null) {
                    String message4 = m7908exceptionOrNullimpl4.getMessage();
                    if (message4 == null) {
                        message4 = "failed";
                    }
                    list6.add("muscle tags: " + message4);
                }
                Context context11222 = this.$context;
                Result.Companion companion20222 = Result.INSTANCE;
                SleepFirestoreSync sleepFirestoreSync222 = SleepFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope9;
                this.L$1 = firebaseUser7;
                this.L$2 = list6;
                this.I$0 = i11;
                this.Z$0 = z5;
                this.I$1 = i15;
                this.I$2 = i18;
                this.I$3 = i17;
                this.I$4 = i16;
                this.label = 14;
                coroutineScope10 = coroutineScope9;
                firebaseUser8 = firebaseUser7;
                list7 = list6;
                i23 = i11;
                pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync222, context11222, 0, this, 2, null);
                if (pushRecent$default2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i19 = i16;
                i20 = i17;
                i21 = i18;
                i22 = i15;
                z6 = z5;
                i11 = i23;
                firebaseUser9 = firebaseUser8;
                list8 = list7;
                try {
                    m7905constructorimpl7 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default2).intValue()));
                } catch (Throwable th25) {
                    th = th25;
                    Result.Companion companion212 = Result.INSTANCE;
                    m7905constructorimpl7 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    i24 = i21;
                    i25 = i22;
                    z7 = z6;
                    list9 = list8;
                    firebaseUser10 = firebaseUser9;
                    coroutineScope11 = coroutineScope10;
                    i26 = i19;
                    i27 = i20;
                    m7908exceptionOrNullimpl5 = Result.m7908exceptionOrNullimpl(m7905constructorimpl7);
                    if (m7908exceptionOrNullimpl5 != null) {
                    }
                    intValue7 = ((Number) m7905constructorimpl7).intValue();
                    Context context122 = this.$context;
                    Result.Companion companion222 = Result.INSTANCE;
                    RecoveryFirestoreSync recoveryFirestoreSync2 = RecoveryFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope11;
                    this.L$1 = firebaseUser10;
                    this.L$2 = list9;
                    this.I$0 = i11;
                    this.Z$0 = z7;
                    this.I$1 = i25;
                    this.I$2 = i24;
                    this.I$3 = i27;
                    this.I$4 = i26;
                    this.I$5 = intValue7;
                    this.label = 15;
                    i28 = intValue7;
                    coroutineScope12 = coroutineScope11;
                    firebaseUser11 = firebaseUser10;
                    list10 = list9;
                    i29 = i11;
                    pushRecent$default3 = RecoveryFirestoreSync.pushRecent$default(recoveryFirestoreSync2, context122, 0, this, 2, null);
                    if (pushRecent$default3 == coroutine_suspended) {
                    }
                }
                i24 = i21;
                i25 = i22;
                z7 = z6;
                list9 = list8;
                firebaseUser10 = firebaseUser9;
                coroutineScope11 = coroutineScope10;
                i26 = i19;
                i27 = i20;
                m7908exceptionOrNullimpl5 = Result.m7908exceptionOrNullimpl(m7905constructorimpl7);
                if (m7908exceptionOrNullimpl5 != null) {
                    String message5 = m7908exceptionOrNullimpl5.getMessage();
                    if (message5 == null) {
                        message5 = "failed";
                    }
                    list9.add("sleep: " + message5);
                    m7905constructorimpl7 = Boxing.boxInt(0);
                }
                intValue7 = ((Number) m7905constructorimpl7).intValue();
                Context context1222 = this.$context;
                Result.Companion companion2222 = Result.INSTANCE;
                RecoveryFirestoreSync recoveryFirestoreSync22 = RecoveryFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope11;
                this.L$1 = firebaseUser10;
                this.L$2 = list9;
                this.I$0 = i11;
                this.Z$0 = z7;
                this.I$1 = i25;
                this.I$2 = i24;
                this.I$3 = i27;
                this.I$4 = i26;
                this.I$5 = intValue7;
                this.label = 15;
                i28 = intValue7;
                coroutineScope12 = coroutineScope11;
                firebaseUser11 = firebaseUser10;
                list10 = list9;
                i29 = i11;
                pushRecent$default3 = RecoveryFirestoreSync.pushRecent$default(recoveryFirestoreSync22, context1222, 0, this, 2, null);
                if (pushRecent$default3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i30 = i26;
                i31 = i27;
                i32 = i24;
                i33 = i25;
                z8 = z7;
                i34 = i29;
                i35 = i28;
                list11 = list10;
                try {
                    m7905constructorimpl8 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default3).intValue()));
                } catch (Throwable th26) {
                    th = th26;
                    Result.Companion companion232 = Result.INSTANCE;
                    m7905constructorimpl8 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    i36 = i31;
                    i37 = i32;
                    i38 = i33;
                    list12 = list11;
                    firebaseUser12 = firebaseUser11;
                    coroutineScope13 = coroutineScope12;
                    i39 = i30;
                    z9 = z8;
                    i40 = i34;
                    i41 = i35;
                    m7908exceptionOrNullimpl6 = Result.m7908exceptionOrNullimpl(m7905constructorimpl8);
                    if (m7908exceptionOrNullimpl6 != null) {
                    }
                    intValue8 = ((Number) m7905constructorimpl8).intValue();
                    Context context132 = this.$context;
                    Result.Companion companion242 = Result.INSTANCE;
                    DailyStepsFirestoreSync dailyStepsFirestoreSync2 = DailyStepsFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope13;
                    this.L$1 = firebaseUser12;
                    this.L$2 = list12;
                    this.I$0 = i40;
                    this.Z$0 = z9;
                    this.I$1 = i38;
                    this.I$2 = i37;
                    this.I$3 = i36;
                    this.I$4 = i39;
                    this.I$5 = i41;
                    this.I$6 = intValue8;
                    this.label = 16;
                    i42 = intValue8;
                    coroutineScope14 = coroutineScope13;
                    firebaseUser13 = firebaseUser12;
                    list13 = list12;
                    i43 = i40;
                    pushRecent$default4 = DailyStepsFirestoreSync.pushRecent$default(dailyStepsFirestoreSync2, context132, 0, this, 2, null);
                    if (pushRecent$default4 == coroutine_suspended) {
                    }
                }
                i36 = i31;
                i37 = i32;
                i38 = i33;
                list12 = list11;
                firebaseUser12 = firebaseUser11;
                coroutineScope13 = coroutineScope12;
                i39 = i30;
                z9 = z8;
                i40 = i34;
                i41 = i35;
                m7908exceptionOrNullimpl6 = Result.m7908exceptionOrNullimpl(m7905constructorimpl8);
                if (m7908exceptionOrNullimpl6 != null) {
                    String message6 = m7908exceptionOrNullimpl6.getMessage();
                    if (message6 == null) {
                        message6 = "failed";
                    }
                    list12.add("recovery: " + message6);
                    m7905constructorimpl8 = Boxing.boxInt(0);
                }
                intValue8 = ((Number) m7905constructorimpl8).intValue();
                Context context1322 = this.$context;
                Result.Companion companion2422 = Result.INSTANCE;
                DailyStepsFirestoreSync dailyStepsFirestoreSync22 = DailyStepsFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope13;
                this.L$1 = firebaseUser12;
                this.L$2 = list12;
                this.I$0 = i40;
                this.Z$0 = z9;
                this.I$1 = i38;
                this.I$2 = i37;
                this.I$3 = i36;
                this.I$4 = i39;
                this.I$5 = i41;
                this.I$6 = intValue8;
                this.label = 16;
                i42 = intValue8;
                coroutineScope14 = coroutineScope13;
                firebaseUser13 = firebaseUser12;
                list13 = list12;
                i43 = i40;
                pushRecent$default4 = DailyStepsFirestoreSync.pushRecent$default(dailyStepsFirestoreSync22, context1322, 0, this, 2, null);
                if (pushRecent$default4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i44 = i41;
                i45 = i39;
                i46 = i36;
                i47 = i37;
                i48 = i38;
                z10 = z9;
                i49 = i43;
                i50 = i42;
                try {
                    m7905constructorimpl9 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default4).intValue()));
                } catch (Throwable th27) {
                    th = th27;
                    Result.Companion companion252 = Result.INSTANCE;
                    m7905constructorimpl9 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    coroutineScope15 = coroutineScope14;
                    list14 = list13;
                    m7908exceptionOrNullimpl7 = Result.m7908exceptionOrNullimpl(m7905constructorimpl9);
                    if (m7908exceptionOrNullimpl7 != null) {
                    }
                    Context context142 = this.$context;
                    Result.Companion companion262 = Result.INSTANCE;
                    StravaPbFirestoreSync stravaPbFirestoreSync2 = StravaPbFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i49;
                    this.Z$0 = z10;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 17;
                    pushAll = stravaPbFirestoreSync2.pushAll(context142, this);
                    if (pushAll == coroutine_suspended) {
                    }
                    m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                    m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                    if (m7908exceptionOrNullimpl8 != null) {
                    }
                    Context context1522 = this.$context;
                    Result.Companion companion2822 = Result.INSTANCE;
                    StravaFirestoreSync stravaFirestoreSync22 = StravaFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i49;
                    this.Z$0 = z10;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 18;
                    pushMeta = stravaFirestoreSync22.pushMeta(context1522, this);
                    if (pushMeta == coroutine_suspended) {
                    }
                    m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                    int i6222 = i49;
                    z11 = z10;
                    i51 = i6222;
                    m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                    if (m7908exceptionOrNullimpl9 != null) {
                    }
                    Context context1622 = this.$context;
                    Result.Companion companion2922 = Result.INSTANCE;
                    ProfileFirestoreSync profileFirestoreSync22 = ProfileFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i51;
                    this.Z$0 = z11;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 19;
                    pushFromPrefs = profileFirestoreSync22.pushFromPrefs(context1622, this);
                    if (pushFromPrefs == coroutine_suspended) {
                    }
                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                    list15 = list14;
                    i52 = i51;
                    i53 = i48;
                    i54 = i46;
                    i55 = i44;
                    int i6322 = i45;
                    i56 = i50;
                    i57 = i47;
                    i58 = i6322;
                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                    if (m7908exceptionOrNullimpl10 != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                    Context context1722 = this.$context;
                    Result.Companion companion3022 = Result.INSTANCE;
                    DocumentReference document22 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                    Pair[] pairArr22 = new Pair[6];
                    pairArr22[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                    pairArr22[1] = TuplesKt.to("device", "android");
                    pairArr22[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context1722)));
                    pairArr22[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                    pairArr22[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                    pairArr22[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                    Task<Void> task22 = document22.set(MapsKt.mapOf(pairArr22), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task22, "set(...)");
                    this.L$0 = firebaseUser13;
                    this.L$1 = list15;
                    this.L$2 = null;
                    this.I$0 = i52;
                    this.Z$0 = z11;
                    this.I$1 = i53;
                    this.I$2 = i57;
                    this.I$3 = i54;
                    this.I$4 = i58;
                    i60 = i55;
                    this.I$5 = i60;
                    i56 = i56;
                    this.I$6 = i56;
                    this.J$0 = currentTimeMillis;
                    this.label = 20;
                    await = TasksKt.await(task22, this);
                    if (await != coroutine_suspended) {
                    }
                }
                coroutineScope15 = coroutineScope14;
                list14 = list13;
                m7908exceptionOrNullimpl7 = Result.m7908exceptionOrNullimpl(m7905constructorimpl9);
                if (m7908exceptionOrNullimpl7 != null) {
                    String message7 = m7908exceptionOrNullimpl7.getMessage();
                    if (message7 == null) {
                        message7 = "failed";
                    }
                    list14.add("steps: " + message7);
                }
                Context context1422 = this.$context;
                Result.Companion companion2622 = Result.INSTANCE;
                StravaPbFirestoreSync stravaPbFirestoreSync22 = StravaPbFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i49;
                this.Z$0 = z10;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 17;
                pushAll = stravaPbFirestoreSync22.pushAll(context1422, this);
                if (pushAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                if (m7908exceptionOrNullimpl8 != null) {
                    String message8 = m7908exceptionOrNullimpl8.getMessage();
                    if (message8 == null) {
                        message8 = "failed";
                    }
                    list14.add("strava_pbs: " + message8);
                }
                Context context15222 = this.$context;
                Result.Companion companion28222 = Result.INSTANCE;
                StravaFirestoreSync stravaFirestoreSync222 = StravaFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i49;
                this.Z$0 = z10;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 18;
                pushMeta = stravaFirestoreSync222.pushMeta(context15222, this);
                if (pushMeta == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                int i62222 = i49;
                z11 = z10;
                i51 = i62222;
                m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                if (m7908exceptionOrNullimpl9 != null) {
                    String message9 = m7908exceptionOrNullimpl9.getMessage();
                    if (message9 == null) {
                        message9 = "failed";
                    }
                    list14.add("strava_meta: " + message9);
                }
                Context context16222 = this.$context;
                Result.Companion companion29222 = Result.INSTANCE;
                ProfileFirestoreSync profileFirestoreSync222 = ProfileFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i51;
                this.Z$0 = z11;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 19;
                pushFromPrefs = profileFirestoreSync222.pushFromPrefs(context16222, this);
                if (pushFromPrefs == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                list15 = list14;
                i52 = i51;
                i53 = i48;
                i54 = i46;
                i55 = i44;
                int i63222 = i45;
                i56 = i50;
                i57 = i47;
                i58 = i63222;
                m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                if (m7908exceptionOrNullimpl10 != null) {
                    String message10 = m7908exceptionOrNullimpl10.getMessage();
                    if (message10 == null) {
                        message10 = "failed";
                    }
                    list15.add("profile: " + message10);
                }
                currentTimeMillis = System.currentTimeMillis();
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                Context context17222 = this.$context;
                Result.Companion companion30222 = Result.INSTANCE;
                DocumentReference document222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                Pair[] pairArr222 = new Pair[6];
                pairArr222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                pairArr222[1] = TuplesKt.to("device", "android");
                pairArr222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context17222)));
                pairArr222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                pairArr222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                pairArr222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                Task<Void> task222 = document222.set(MapsKt.mapOf(pairArr222), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task222, "set(...)");
                this.L$0 = firebaseUser13;
                this.L$1 = list15;
                this.L$2 = null;
                this.I$0 = i52;
                this.Z$0 = z11;
                this.I$1 = i53;
                this.I$2 = i57;
                this.I$3 = i54;
                this.I$4 = i58;
                i60 = i55;
                this.I$5 = i60;
                i56 = i56;
                this.I$6 = i56;
                this.J$0 = currentTimeMillis;
                this.label = 20;
                await = TasksKt.await(task222, this);
                if (await != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i59 = i57;
                i55 = i60;
                j = currentTimeMillis;
                firebaseUser14 = firebaseUser13;
                m7905constructorimpl13 = Result.m7905constructorimpl((Void) await);
                List<String> list162 = list15;
                int i642 = i54;
                int i652 = i56;
                int i662 = i58;
                int i672 = i55;
                long j22 = j;
                FirebaseUser firebaseUser152 = firebaseUser14;
                int i682 = i59;
                int i692 = i52;
                int i702 = i53;
                m7908exceptionOrNullimpl11 = Result.m7908exceptionOrNullimpl(m7905constructorimpl13);
                if (m7908exceptionOrNullimpl11 != null) {
                    String message11 = m7908exceptionOrNullimpl11.getMessage();
                    if (message11 == null) {
                        message11 = "failed";
                    }
                    list162.add("meta: " + message11);
                }
                String uid2 = firebaseUser152.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                return new CloudSyncResult(i682, i642, i662, i672, i652, i692, j22, z11, i702, uid2, list162);
            case 1:
                arrayList = (List) this.L$2;
                currentUser = (FirebaseUser) this.L$1;
                coroutineScope16 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pullWithConflictResolution = obj;
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullWithConflictResolution).intValue()));
                coroutineScope = coroutineScope16;
                firebaseUser = currentUser;
                list = arrayList;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                }
                intValue = ((Number) m7905constructorimpl).intValue();
                Context context22 = this.$context;
                Result.Companion companion82 = Result.INSTANCE;
                SplitFirestoreSync splitFirestoreSync3 = SplitFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope;
                this.L$1 = firebaseUser;
                this.L$2 = list;
                this.I$0 = intValue;
                this.label = 2;
                pullIntoRoom = splitFirestoreSync3.pullIntoRoom(context22, this);
                if (pullIntoRoom == coroutine_suspended) {
                }
                m7905constructorimpl3 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom).booleanValue()));
                coroutineScope2 = coroutineScope;
                firebaseUser2 = firebaseUser;
                list2 = list;
                i = intValue;
                Boolean boxBoolean2 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl3)) {
                }
                booleanValue = ((Boolean) m7905constructorimpl3).booleanValue();
                Context context32 = this.$context;
                Result.Companion companion92 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync3 = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 3;
                pullIntoRoom2 = exerciseMuscleFirestoreSync3.pullIntoRoom(context32, this);
                if (pullIntoRoom2 == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom2).booleanValue()));
                Context context42 = this.$context;
                Result.Companion companion102 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync3 = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 4;
                pullIntoRoom3 = routeFirestoreSync3.pullIntoRoom(context42, this);
                if (pullIntoRoom3 == coroutine_suspended) {
                }
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom3).intValue()));
                Integer boxInt2 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                ((Number) m7905constructorimpl2).intValue();
                Context context52 = this.$context;
                Result.Companion companion112 = Result.INSTANCE;
                RunFirestoreSync runFirestoreSync2 = RunFirestoreSync.INSTANCE;
                RunRepository runRepo2 = Repository.INSTANCE.get(context52).getRunRepo();
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 5;
                pullIntoRoom4 = runFirestoreSync2.pullIntoRoom(context52, runRepo2, this);
                if (pullIntoRoom4 == coroutine_suspended) {
                }
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context62 = this.$context;
                Result.Companion companion122 = Result.INSTANCE;
                Repository repository2 = Repository.INSTANCE.get(context62);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository2.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 2:
                intValue = this.I$0;
                list = (List) this.L$2;
                firebaseUser = (FirebaseUser) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pullIntoRoom = obj;
                m7905constructorimpl3 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom).booleanValue()));
                coroutineScope2 = coroutineScope;
                firebaseUser2 = firebaseUser;
                list2 = list;
                i = intValue;
                Boolean boxBoolean22 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl3)) {
                }
                booleanValue = ((Boolean) m7905constructorimpl3).booleanValue();
                Context context322 = this.$context;
                Result.Companion companion922 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync32 = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 3;
                pullIntoRoom2 = exerciseMuscleFirestoreSync32.pullIntoRoom(context322, this);
                if (pullIntoRoom2 == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom2).booleanValue()));
                Context context422 = this.$context;
                Result.Companion companion1022 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync32 = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 4;
                pullIntoRoom3 = routeFirestoreSync32.pullIntoRoom(context422, this);
                if (pullIntoRoom3 == coroutine_suspended) {
                }
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom3).intValue()));
                Integer boxInt22 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                ((Number) m7905constructorimpl2).intValue();
                Context context522 = this.$context;
                Result.Companion companion1122 = Result.INSTANCE;
                RunFirestoreSync runFirestoreSync22 = RunFirestoreSync.INSTANCE;
                RunRepository runRepo22 = Repository.INSTANCE.get(context522).getRunRepo();
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 5;
                pullIntoRoom4 = runFirestoreSync22.pullIntoRoom(context522, runRepo22, this);
                if (pullIntoRoom4 == coroutine_suspended) {
                }
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context622 = this.$context;
                Result.Companion companion1222 = Result.INSTANCE;
                Repository repository22 = Repository.INSTANCE.get(context622);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository22.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 3:
                booleanValue = this.Z$0;
                i = this.I$0;
                list2 = (List) this.L$2;
                firebaseUser2 = (FirebaseUser) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pullIntoRoom2 = obj;
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pullIntoRoom2).booleanValue()));
                Context context4222 = this.$context;
                Result.Companion companion10222 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync322 = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 4;
                pullIntoRoom3 = routeFirestoreSync322.pullIntoRoom(context4222, this);
                if (pullIntoRoom3 == coroutine_suspended) {
                }
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom3).intValue()));
                Integer boxInt222 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                ((Number) m7905constructorimpl2).intValue();
                Context context5222 = this.$context;
                Result.Companion companion11222 = Result.INSTANCE;
                RunFirestoreSync runFirestoreSync222 = RunFirestoreSync.INSTANCE;
                RunRepository runRepo222 = Repository.INSTANCE.get(context5222).getRunRepo();
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 5;
                pullIntoRoom4 = runFirestoreSync222.pullIntoRoom(context5222, runRepo222, this);
                if (pullIntoRoom4 == coroutine_suspended) {
                }
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context6222 = this.$context;
                Result.Companion companion12222 = Result.INSTANCE;
                Repository repository222 = Repository.INSTANCE.get(context6222);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository222.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 4:
                booleanValue = this.Z$0;
                i = this.I$0;
                list2 = (List) this.L$2;
                firebaseUser2 = (FirebaseUser) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pullIntoRoom3 = obj;
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom3).intValue()));
                Integer boxInt2222 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                ((Number) m7905constructorimpl2).intValue();
                Context context52222 = this.$context;
                Result.Companion companion112222 = Result.INSTANCE;
                RunFirestoreSync runFirestoreSync2222 = RunFirestoreSync.INSTANCE;
                RunRepository runRepo2222 = Repository.INSTANCE.get(context52222).getRunRepo();
                this.L$0 = coroutineScope2;
                this.L$1 = firebaseUser2;
                this.L$2 = list2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 5;
                pullIntoRoom4 = runFirestoreSync2222.pullIntoRoom(context52222, runRepo2222, this);
                if (pullIntoRoom4 == coroutine_suspended) {
                }
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context62222 = this.$context;
                Result.Companion companion122222 = Result.INSTANCE;
                Repository repository2222 = Repository.INSTANCE.get(context62222);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository2222.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 5:
                booleanValue = this.Z$0;
                i = this.I$0;
                list2 = (List) this.L$2;
                firebaseUser2 = (FirebaseUser) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pullIntoRoom4 = obj;
                m7905constructorimpl4 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pullIntoRoom4).intValue()));
                coroutineScope3 = coroutineScope2;
                firebaseUser3 = firebaseUser2;
                list3 = list2;
                i2 = i;
                z = booleanValue;
                m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl4);
                if (m7908exceptionOrNullimpl2 != null) {
                }
                intValue2 = ((Number) m7905constructorimpl4).intValue();
                Context context622222 = this.$context;
                Result.Companion companion1222222 = Result.INSTANCE;
                Repository repository22222 = Repository.INSTANCE.get(context622222);
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 6;
                dedupeSavedRoutes = repository22222.dedupeSavedRoutes(this);
                if (dedupeSavedRoutes == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 6:
                intValue2 = this.I$1;
                z = this.Z$0;
                i2 = this.I$0;
                list3 = (List) this.L$2;
                firebaseUser3 = (FirebaseUser) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                dedupeSavedRoutes = obj;
                Result.m7905constructorimpl(Boxing.boxInt(((Number) dedupeSavedRoutes).intValue()));
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.label = 7;
                flush = GymSyncQueue.INSTANCE.flush(this.$context, this);
                if (flush == coroutine_suspended) {
                }
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 7:
                int i71 = this.I$1;
                boolean z12 = this.Z$0;
                int i72 = this.I$0;
                List<String> list17 = (List) this.L$2;
                FirebaseUser firebaseUser16 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope3 = coroutineScope17;
                firebaseUser3 = firebaseUser16;
                list3 = list17;
                i2 = i72;
                z = z12;
                intValue2 = i71;
                flush = obj;
                intValue3 = ((Number) flush).intValue();
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue3;
                this.label = 8;
                pushAllFinishedSessions = GymFirestoreSync.INSTANCE.pushAllFinishedSessions(this.$context, list3, this);
                if (pushAllFinishedSessions == coroutine_suspended) {
                }
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 8:
                intValue3 = this.I$2;
                intValue2 = this.I$1;
                z = this.Z$0;
                i2 = this.I$0;
                list3 = (List) this.L$2;
                firebaseUser3 = (FirebaseUser) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pushAllFinishedSessions = obj;
                intValue4 = ((Number) pushAllFinishedSessions).intValue() + intValue3;
                this.L$0 = coroutineScope3;
                this.L$1 = firebaseUser3;
                this.L$2 = list3;
                this.I$0 = i2;
                this.Z$0 = z;
                this.I$1 = intValue2;
                this.I$2 = intValue4;
                this.label = 9;
                pushAllFinishedRuns = RunFirestoreSync.INSTANCE.pushAllFinishedRuns(this.$context, list3, this);
                if (pushAllFinishedRuns == coroutine_suspended) {
                }
                break;
            case 9:
                int i73 = this.I$2;
                int i74 = this.I$1;
                boolean z13 = this.Z$0;
                int i75 = this.I$0;
                list3 = (List) this.L$2;
                firebaseUser3 = (FirebaseUser) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                intValue4 = i73;
                i3 = i74;
                z2 = z13;
                i4 = i75;
                pushAllFinishedRuns = obj;
                coroutineScope4 = coroutineScope3;
                list4 = list3;
                intValue5 = ((Number) pushAllFinishedRuns).intValue();
                Context context72 = this.$context;
                Result.Companion companion132 = Result.INSTANCE;
                SoccerFirestoreSync soccerFirestoreSync2 = SoccerFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope4;
                this.L$1 = firebaseUser3;
                this.L$2 = list4;
                this.I$0 = i4;
                this.Z$0 = z2;
                this.I$1 = i3;
                this.I$2 = intValue4;
                this.I$3 = intValue5;
                this.label = 10;
                i5 = intValue5;
                coroutineScope5 = coroutineScope4;
                firebaseUser4 = firebaseUser3;
                pushRecent$default = SoccerFirestoreSync.pushRecent$default(soccerFirestoreSync2, context72, 0, this, 2, null);
                if (pushRecent$default != coroutine_suspended) {
                }
                break;
            case 10:
                i9 = this.I$3;
                i6 = this.I$2;
                i7 = this.I$1;
                z3 = this.Z$0;
                i8 = this.I$0;
                list4 = (List) this.L$2;
                firebaseUser5 = (FirebaseUser) this.L$1;
                coroutineScope6 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushRecent$default = obj;
                    m7905constructorimpl5 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default).intValue()));
                } catch (Throwable th28) {
                    th = th28;
                    Result.Companion companion142 = Result.INSTANCE;
                    m7905constructorimpl5 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    int i6122 = i6;
                    i10 = i9;
                    coroutineScope7 = coroutineScope6;
                    firebaseUser6 = firebaseUser5;
                    list5 = list4;
                    i11 = i8;
                    z4 = z3;
                    i12 = i7;
                    i13 = i6122;
                    m7908exceptionOrNullimpl3 = Result.m7908exceptionOrNullimpl(m7905constructorimpl5);
                    if (m7908exceptionOrNullimpl3 != null) {
                    }
                    intValue6 = ((Number) m7905constructorimpl5).intValue();
                    Context context822 = this.$context;
                    Result.Companion companion1522 = Result.INSTANCE;
                    RouteFirestoreSync routeFirestoreSync222 = RouteFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope7;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = intValue6;
                    this.label = 11;
                    pushAllRoutes = routeFirestoreSync222.pushAllRoutes(context822, this);
                    if (pushAllRoutes != coroutine_suspended) {
                    }
                }
                int i61222 = i6;
                i10 = i9;
                coroutineScope7 = coroutineScope6;
                firebaseUser6 = firebaseUser5;
                list5 = list4;
                i11 = i8;
                z4 = z3;
                i12 = i7;
                i13 = i61222;
                m7908exceptionOrNullimpl3 = Result.m7908exceptionOrNullimpl(m7905constructorimpl5);
                if (m7908exceptionOrNullimpl3 != null) {
                }
                intValue6 = ((Number) m7905constructorimpl5).intValue();
                Context context8222 = this.$context;
                Result.Companion companion15222 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync2222 = RouteFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope7;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = intValue6;
                this.label = 11;
                pushAllRoutes = routeFirestoreSync2222.pushAllRoutes(context8222, this);
                if (pushAllRoutes != coroutine_suspended) {
                }
                break;
            case 11:
                i14 = this.I$4;
                i10 = this.I$3;
                i13 = this.I$2;
                i12 = this.I$1;
                z4 = this.Z$0;
                i11 = this.I$0;
                list5 = (List) this.L$2;
                firebaseUser6 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushAllRoutes = obj;
                    coroutineScope8 = coroutineScope18;
                    Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAllRoutes).intValue()));
                } catch (Throwable th29) {
                    th = th29;
                    coroutineScope8 = coroutineScope18;
                    Result.Companion companion1622 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    Context context9222 = this.$context;
                    Result.Companion companion17222 = Result.INSTANCE;
                    SplitFirestoreSync splitFirestoreSync2222 = SplitFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope8;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = i14;
                    this.label = 12;
                    pushFromRoom = splitFirestoreSync2222.pushFromRoom(context9222, this);
                    if (pushFromRoom == coroutine_suspended) {
                    }
                    Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                    Context context102222 = this.$context;
                    Result.Companion companion192222 = Result.INSTANCE;
                    ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync22222 = ExerciseMuscleFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope8;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = i14;
                    this.label = 13;
                    pushFromRoom2 = exerciseMuscleFirestoreSync22222.pushFromRoom(context102222, this);
                    if (pushFromRoom2 == coroutine_suspended) {
                    }
                    m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                    i15 = i12;
                    z5 = z4;
                    list6 = list5;
                    firebaseUser7 = firebaseUser6;
                    i16 = i14;
                    i17 = i10;
                    coroutineScope9 = coroutineScope8;
                    i18 = i13;
                    m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                    if (m7908exceptionOrNullimpl4 != null) {
                    }
                    Context context112222 = this.$context;
                    Result.Companion companion202222 = Result.INSTANCE;
                    SleepFirestoreSync sleepFirestoreSync2222 = SleepFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope9;
                    this.L$1 = firebaseUser7;
                    this.L$2 = list6;
                    this.I$0 = i11;
                    this.Z$0 = z5;
                    this.I$1 = i15;
                    this.I$2 = i18;
                    this.I$3 = i17;
                    this.I$4 = i16;
                    this.label = 14;
                    coroutineScope10 = coroutineScope9;
                    firebaseUser8 = firebaseUser7;
                    list7 = list6;
                    i23 = i11;
                    pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync2222, context112222, 0, this, 2, null);
                    if (pushRecent$default2 == coroutine_suspended) {
                    }
                }
                Context context92222 = this.$context;
                Result.Companion companion172222 = Result.INSTANCE;
                SplitFirestoreSync splitFirestoreSync22222 = SplitFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope8;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = i14;
                this.label = 12;
                pushFromRoom = splitFirestoreSync22222.pushFromRoom(context92222, this);
                if (pushFromRoom == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                Context context1022222 = this.$context;
                Result.Companion companion1922222 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync222222 = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope8;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = i14;
                this.label = 13;
                pushFromRoom2 = exerciseMuscleFirestoreSync222222.pushFromRoom(context1022222, this);
                if (pushFromRoom2 == coroutine_suspended) {
                }
                m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                i15 = i12;
                z5 = z4;
                list6 = list5;
                firebaseUser7 = firebaseUser6;
                i16 = i14;
                i17 = i10;
                coroutineScope9 = coroutineScope8;
                i18 = i13;
                m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                if (m7908exceptionOrNullimpl4 != null) {
                }
                Context context1122222 = this.$context;
                Result.Companion companion2022222 = Result.INSTANCE;
                SleepFirestoreSync sleepFirestoreSync22222 = SleepFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope9;
                this.L$1 = firebaseUser7;
                this.L$2 = list6;
                this.I$0 = i11;
                this.Z$0 = z5;
                this.I$1 = i15;
                this.I$2 = i18;
                this.I$3 = i17;
                this.I$4 = i16;
                this.label = 14;
                coroutineScope10 = coroutineScope9;
                firebaseUser8 = firebaseUser7;
                list7 = list6;
                i23 = i11;
                pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync22222, context1122222, 0, this, 2, null);
                if (pushRecent$default2 == coroutine_suspended) {
                }
                break;
            case 12:
                i14 = this.I$4;
                i10 = this.I$3;
                i13 = this.I$2;
                i12 = this.I$1;
                z4 = this.Z$0;
                i11 = this.I$0;
                list5 = (List) this.L$2;
                firebaseUser6 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushFromRoom = obj;
                    coroutineScope8 = coroutineScope19;
                    Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom).booleanValue()));
                } catch (Throwable th30) {
                    th = th30;
                    coroutineScope8 = coroutineScope19;
                    Result.Companion companion182 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    Context context10222222 = this.$context;
                    Result.Companion companion19222222 = Result.INSTANCE;
                    ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync2222222 = ExerciseMuscleFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope8;
                    this.L$1 = firebaseUser6;
                    this.L$2 = list5;
                    this.I$0 = i11;
                    this.Z$0 = z4;
                    this.I$1 = i12;
                    this.I$2 = i13;
                    this.I$3 = i10;
                    this.I$4 = i14;
                    this.label = 13;
                    pushFromRoom2 = exerciseMuscleFirestoreSync2222222.pushFromRoom(context10222222, this);
                    if (pushFromRoom2 == coroutine_suspended) {
                    }
                    m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                    i15 = i12;
                    z5 = z4;
                    list6 = list5;
                    firebaseUser7 = firebaseUser6;
                    i16 = i14;
                    i17 = i10;
                    coroutineScope9 = coroutineScope8;
                    i18 = i13;
                    m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                    if (m7908exceptionOrNullimpl4 != null) {
                    }
                    Context context11222222 = this.$context;
                    Result.Companion companion20222222 = Result.INSTANCE;
                    SleepFirestoreSync sleepFirestoreSync222222 = SleepFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope9;
                    this.L$1 = firebaseUser7;
                    this.L$2 = list6;
                    this.I$0 = i11;
                    this.Z$0 = z5;
                    this.I$1 = i15;
                    this.I$2 = i18;
                    this.I$3 = i17;
                    this.I$4 = i16;
                    this.label = 14;
                    coroutineScope10 = coroutineScope9;
                    firebaseUser8 = firebaseUser7;
                    list7 = list6;
                    i23 = i11;
                    pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync222222, context11222222, 0, this, 2, null);
                    if (pushRecent$default2 == coroutine_suspended) {
                    }
                }
                Context context102222222 = this.$context;
                Result.Companion companion192222222 = Result.INSTANCE;
                ExerciseMuscleFirestoreSync exerciseMuscleFirestoreSync22222222 = ExerciseMuscleFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope8;
                this.L$1 = firebaseUser6;
                this.L$2 = list5;
                this.I$0 = i11;
                this.Z$0 = z4;
                this.I$1 = i12;
                this.I$2 = i13;
                this.I$3 = i10;
                this.I$4 = i14;
                this.label = 13;
                pushFromRoom2 = exerciseMuscleFirestoreSync22222222.pushFromRoom(context102222222, this);
                if (pushFromRoom2 == coroutine_suspended) {
                }
                m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                i15 = i12;
                z5 = z4;
                list6 = list5;
                firebaseUser7 = firebaseUser6;
                i16 = i14;
                i17 = i10;
                coroutineScope9 = coroutineScope8;
                i18 = i13;
                m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                if (m7908exceptionOrNullimpl4 != null) {
                }
                Context context112222222 = this.$context;
                Result.Companion companion202222222 = Result.INSTANCE;
                SleepFirestoreSync sleepFirestoreSync2222222 = SleepFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope9;
                this.L$1 = firebaseUser7;
                this.L$2 = list6;
                this.I$0 = i11;
                this.Z$0 = z5;
                this.I$1 = i15;
                this.I$2 = i18;
                this.I$3 = i17;
                this.I$4 = i16;
                this.label = 14;
                coroutineScope10 = coroutineScope9;
                firebaseUser8 = firebaseUser7;
                list7 = list6;
                i23 = i11;
                pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync2222222, context112222222, 0, this, 2, null);
                if (pushRecent$default2 == coroutine_suspended) {
                }
                break;
            case 13:
                i14 = this.I$4;
                i10 = this.I$3;
                i13 = this.I$2;
                i12 = this.I$1;
                z4 = this.Z$0;
                i11 = this.I$0;
                list5 = (List) this.L$2;
                firebaseUser6 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushFromRoom2 = obj;
                    coroutineScope8 = coroutineScope20;
                    m7905constructorimpl6 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromRoom2).booleanValue()));
                } catch (Throwable th31) {
                    Throwable th32 = th31;
                    coroutineScope8 = coroutineScope20;
                    Result.Companion companion32 = Result.INSTANCE;
                    m7905constructorimpl6 = Result.m7905constructorimpl(ResultKt.createFailure(th32));
                    i15 = i12;
                    z5 = z4;
                    list6 = list5;
                    firebaseUser7 = firebaseUser6;
                    i16 = i14;
                    i17 = i10;
                    coroutineScope9 = coroutineScope8;
                    i18 = i13;
                    m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                    if (m7908exceptionOrNullimpl4 != null) {
                    }
                    Context context1122222222 = this.$context;
                    Result.Companion companion2022222222 = Result.INSTANCE;
                    SleepFirestoreSync sleepFirestoreSync22222222 = SleepFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope9;
                    this.L$1 = firebaseUser7;
                    this.L$2 = list6;
                    this.I$0 = i11;
                    this.Z$0 = z5;
                    this.I$1 = i15;
                    this.I$2 = i18;
                    this.I$3 = i17;
                    this.I$4 = i16;
                    this.label = 14;
                    coroutineScope10 = coroutineScope9;
                    firebaseUser8 = firebaseUser7;
                    list7 = list6;
                    i23 = i11;
                    pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync22222222, context1122222222, 0, this, 2, null);
                    if (pushRecent$default2 == coroutine_suspended) {
                    }
                }
                i15 = i12;
                z5 = z4;
                list6 = list5;
                firebaseUser7 = firebaseUser6;
                i16 = i14;
                i17 = i10;
                coroutineScope9 = coroutineScope8;
                i18 = i13;
                m7908exceptionOrNullimpl4 = Result.m7908exceptionOrNullimpl(m7905constructorimpl6);
                if (m7908exceptionOrNullimpl4 != null) {
                }
                Context context11222222222 = this.$context;
                Result.Companion companion20222222222 = Result.INSTANCE;
                SleepFirestoreSync sleepFirestoreSync222222222 = SleepFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope9;
                this.L$1 = firebaseUser7;
                this.L$2 = list6;
                this.I$0 = i11;
                this.Z$0 = z5;
                this.I$1 = i15;
                this.I$2 = i18;
                this.I$3 = i17;
                this.I$4 = i16;
                this.label = 14;
                coroutineScope10 = coroutineScope9;
                firebaseUser8 = firebaseUser7;
                list7 = list6;
                i23 = i11;
                pushRecent$default2 = SleepFirestoreSync.pushRecent$default(sleepFirestoreSync222222222, context11222222222, 0, this, 2, null);
                if (pushRecent$default2 == coroutine_suspended) {
                }
                break;
            case 14:
                i19 = this.I$4;
                i20 = this.I$3;
                i21 = this.I$2;
                i22 = this.I$1;
                z6 = this.Z$0;
                i11 = this.I$0;
                list8 = (List) this.L$2;
                firebaseUser9 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushRecent$default2 = obj;
                    coroutineScope10 = coroutineScope21;
                    m7905constructorimpl7 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default2).intValue()));
                } catch (Throwable th33) {
                    th = th33;
                    coroutineScope10 = coroutineScope21;
                    Result.Companion companion2122 = Result.INSTANCE;
                    m7905constructorimpl7 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    i24 = i21;
                    i25 = i22;
                    z7 = z6;
                    list9 = list8;
                    firebaseUser10 = firebaseUser9;
                    coroutineScope11 = coroutineScope10;
                    i26 = i19;
                    i27 = i20;
                    m7908exceptionOrNullimpl5 = Result.m7908exceptionOrNullimpl(m7905constructorimpl7);
                    if (m7908exceptionOrNullimpl5 != null) {
                    }
                    intValue7 = ((Number) m7905constructorimpl7).intValue();
                    Context context12222 = this.$context;
                    Result.Companion companion22222 = Result.INSTANCE;
                    RecoveryFirestoreSync recoveryFirestoreSync222 = RecoveryFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope11;
                    this.L$1 = firebaseUser10;
                    this.L$2 = list9;
                    this.I$0 = i11;
                    this.Z$0 = z7;
                    this.I$1 = i25;
                    this.I$2 = i24;
                    this.I$3 = i27;
                    this.I$4 = i26;
                    this.I$5 = intValue7;
                    this.label = 15;
                    i28 = intValue7;
                    coroutineScope12 = coroutineScope11;
                    firebaseUser11 = firebaseUser10;
                    list10 = list9;
                    i29 = i11;
                    pushRecent$default3 = RecoveryFirestoreSync.pushRecent$default(recoveryFirestoreSync222, context12222, 0, this, 2, null);
                    if (pushRecent$default3 == coroutine_suspended) {
                    }
                }
                i24 = i21;
                i25 = i22;
                z7 = z6;
                list9 = list8;
                firebaseUser10 = firebaseUser9;
                coroutineScope11 = coroutineScope10;
                i26 = i19;
                i27 = i20;
                m7908exceptionOrNullimpl5 = Result.m7908exceptionOrNullimpl(m7905constructorimpl7);
                if (m7908exceptionOrNullimpl5 != null) {
                }
                intValue7 = ((Number) m7905constructorimpl7).intValue();
                Context context122222 = this.$context;
                Result.Companion companion222222 = Result.INSTANCE;
                RecoveryFirestoreSync recoveryFirestoreSync2222 = RecoveryFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope11;
                this.L$1 = firebaseUser10;
                this.L$2 = list9;
                this.I$0 = i11;
                this.Z$0 = z7;
                this.I$1 = i25;
                this.I$2 = i24;
                this.I$3 = i27;
                this.I$4 = i26;
                this.I$5 = intValue7;
                this.label = 15;
                i28 = intValue7;
                coroutineScope12 = coroutineScope11;
                firebaseUser11 = firebaseUser10;
                list10 = list9;
                i29 = i11;
                pushRecent$default3 = RecoveryFirestoreSync.pushRecent$default(recoveryFirestoreSync2222, context122222, 0, this, 2, null);
                if (pushRecent$default3 == coroutine_suspended) {
                }
                break;
            case 15:
                i35 = this.I$5;
                i30 = this.I$4;
                i31 = this.I$3;
                i32 = this.I$2;
                i33 = this.I$1;
                z8 = this.Z$0;
                i34 = this.I$0;
                list11 = (List) this.L$2;
                FirebaseUser firebaseUser17 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope22 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushRecent$default3 = obj;
                    firebaseUser11 = firebaseUser17;
                    coroutineScope12 = coroutineScope22;
                    m7905constructorimpl8 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default3).intValue()));
                } catch (Throwable th34) {
                    th = th34;
                    firebaseUser11 = firebaseUser17;
                    coroutineScope12 = coroutineScope22;
                    Result.Companion companion2322 = Result.INSTANCE;
                    m7905constructorimpl8 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    i36 = i31;
                    i37 = i32;
                    i38 = i33;
                    list12 = list11;
                    firebaseUser12 = firebaseUser11;
                    coroutineScope13 = coroutineScope12;
                    i39 = i30;
                    z9 = z8;
                    i40 = i34;
                    i41 = i35;
                    m7908exceptionOrNullimpl6 = Result.m7908exceptionOrNullimpl(m7905constructorimpl8);
                    if (m7908exceptionOrNullimpl6 != null) {
                    }
                    intValue8 = ((Number) m7905constructorimpl8).intValue();
                    Context context13222 = this.$context;
                    Result.Companion companion24222 = Result.INSTANCE;
                    DailyStepsFirestoreSync dailyStepsFirestoreSync222 = DailyStepsFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope13;
                    this.L$1 = firebaseUser12;
                    this.L$2 = list12;
                    this.I$0 = i40;
                    this.Z$0 = z9;
                    this.I$1 = i38;
                    this.I$2 = i37;
                    this.I$3 = i36;
                    this.I$4 = i39;
                    this.I$5 = i41;
                    this.I$6 = intValue8;
                    this.label = 16;
                    i42 = intValue8;
                    coroutineScope14 = coroutineScope13;
                    firebaseUser13 = firebaseUser12;
                    list13 = list12;
                    i43 = i40;
                    pushRecent$default4 = DailyStepsFirestoreSync.pushRecent$default(dailyStepsFirestoreSync222, context13222, 0, this, 2, null);
                    if (pushRecent$default4 == coroutine_suspended) {
                    }
                }
                i36 = i31;
                i37 = i32;
                i38 = i33;
                list12 = list11;
                firebaseUser12 = firebaseUser11;
                coroutineScope13 = coroutineScope12;
                i39 = i30;
                z9 = z8;
                i40 = i34;
                i41 = i35;
                m7908exceptionOrNullimpl6 = Result.m7908exceptionOrNullimpl(m7905constructorimpl8);
                if (m7908exceptionOrNullimpl6 != null) {
                }
                intValue8 = ((Number) m7905constructorimpl8).intValue();
                Context context132222 = this.$context;
                Result.Companion companion242222 = Result.INSTANCE;
                DailyStepsFirestoreSync dailyStepsFirestoreSync2222 = DailyStepsFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope13;
                this.L$1 = firebaseUser12;
                this.L$2 = list12;
                this.I$0 = i40;
                this.Z$0 = z9;
                this.I$1 = i38;
                this.I$2 = i37;
                this.I$3 = i36;
                this.I$4 = i39;
                this.I$5 = i41;
                this.I$6 = intValue8;
                this.label = 16;
                i42 = intValue8;
                coroutineScope14 = coroutineScope13;
                firebaseUser13 = firebaseUser12;
                list13 = list12;
                i43 = i40;
                pushRecent$default4 = DailyStepsFirestoreSync.pushRecent$default(dailyStepsFirestoreSync2222, context132222, 0, this, 2, null);
                if (pushRecent$default4 == coroutine_suspended) {
                }
                break;
            case 16:
                i50 = this.I$6;
                i44 = this.I$5;
                i45 = this.I$4;
                i46 = this.I$3;
                i47 = this.I$2;
                i48 = this.I$1;
                z10 = this.Z$0;
                i49 = this.I$0;
                List<String> list18 = (List) this.L$2;
                FirebaseUser firebaseUser18 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope23 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushRecent$default4 = obj;
                    list13 = list18;
                    firebaseUser13 = firebaseUser18;
                    coroutineScope14 = coroutineScope23;
                    m7905constructorimpl9 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushRecent$default4).intValue()));
                } catch (Throwable th35) {
                    th = th35;
                    list13 = list18;
                    firebaseUser13 = firebaseUser18;
                    coroutineScope14 = coroutineScope23;
                    Result.Companion companion2522 = Result.INSTANCE;
                    m7905constructorimpl9 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    coroutineScope15 = coroutineScope14;
                    list14 = list13;
                    m7908exceptionOrNullimpl7 = Result.m7908exceptionOrNullimpl(m7905constructorimpl9);
                    if (m7908exceptionOrNullimpl7 != null) {
                    }
                    Context context14222 = this.$context;
                    Result.Companion companion26222 = Result.INSTANCE;
                    StravaPbFirestoreSync stravaPbFirestoreSync222 = StravaPbFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i49;
                    this.Z$0 = z10;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 17;
                    pushAll = stravaPbFirestoreSync222.pushAll(context14222, this);
                    if (pushAll == coroutine_suspended) {
                    }
                    m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                    m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                    if (m7908exceptionOrNullimpl8 != null) {
                    }
                    Context context152222 = this.$context;
                    Result.Companion companion282222 = Result.INSTANCE;
                    StravaFirestoreSync stravaFirestoreSync2222 = StravaFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i49;
                    this.Z$0 = z10;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 18;
                    pushMeta = stravaFirestoreSync2222.pushMeta(context152222, this);
                    if (pushMeta == coroutine_suspended) {
                    }
                    m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                    int i622222 = i49;
                    z11 = z10;
                    i51 = i622222;
                    m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                    if (m7908exceptionOrNullimpl9 != null) {
                    }
                    Context context162222 = this.$context;
                    Result.Companion companion292222 = Result.INSTANCE;
                    ProfileFirestoreSync profileFirestoreSync2222 = ProfileFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i51;
                    this.Z$0 = z11;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 19;
                    pushFromPrefs = profileFirestoreSync2222.pushFromPrefs(context162222, this);
                    if (pushFromPrefs == coroutine_suspended) {
                    }
                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                    list15 = list14;
                    i52 = i51;
                    i53 = i48;
                    i54 = i46;
                    i55 = i44;
                    int i632222 = i45;
                    i56 = i50;
                    i57 = i47;
                    i58 = i632222;
                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                    if (m7908exceptionOrNullimpl10 != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                    Context context172222 = this.$context;
                    Result.Companion companion302222 = Result.INSTANCE;
                    DocumentReference document2222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                    Pair[] pairArr2222 = new Pair[6];
                    pairArr2222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                    pairArr2222[1] = TuplesKt.to("device", "android");
                    pairArr2222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context172222)));
                    pairArr2222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                    pairArr2222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                    pairArr2222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                    Task<Void> task2222 = document2222.set(MapsKt.mapOf(pairArr2222), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task2222, "set(...)");
                    this.L$0 = firebaseUser13;
                    this.L$1 = list15;
                    this.L$2 = null;
                    this.I$0 = i52;
                    this.Z$0 = z11;
                    this.I$1 = i53;
                    this.I$2 = i57;
                    this.I$3 = i54;
                    this.I$4 = i58;
                    i60 = i55;
                    this.I$5 = i60;
                    i56 = i56;
                    this.I$6 = i56;
                    this.J$0 = currentTimeMillis;
                    this.label = 20;
                    await = TasksKt.await(task2222, this);
                    if (await != coroutine_suspended) {
                    }
                }
                coroutineScope15 = coroutineScope14;
                list14 = list13;
                m7908exceptionOrNullimpl7 = Result.m7908exceptionOrNullimpl(m7905constructorimpl9);
                if (m7908exceptionOrNullimpl7 != null) {
                }
                Context context142222 = this.$context;
                Result.Companion companion262222 = Result.INSTANCE;
                StravaPbFirestoreSync stravaPbFirestoreSync2222 = StravaPbFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i49;
                this.Z$0 = z10;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 17;
                pushAll = stravaPbFirestoreSync2222.pushAll(context142222, this);
                if (pushAll == coroutine_suspended) {
                }
                m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                if (m7908exceptionOrNullimpl8 != null) {
                }
                Context context1522222 = this.$context;
                Result.Companion companion2822222 = Result.INSTANCE;
                StravaFirestoreSync stravaFirestoreSync22222 = StravaFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i49;
                this.Z$0 = z10;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 18;
                pushMeta = stravaFirestoreSync22222.pushMeta(context1522222, this);
                if (pushMeta == coroutine_suspended) {
                }
                m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                int i6222222 = i49;
                z11 = z10;
                i51 = i6222222;
                m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                if (m7908exceptionOrNullimpl9 != null) {
                }
                Context context1622222 = this.$context;
                Result.Companion companion2922222 = Result.INSTANCE;
                ProfileFirestoreSync profileFirestoreSync22222 = ProfileFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i51;
                this.Z$0 = z11;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 19;
                pushFromPrefs = profileFirestoreSync22222.pushFromPrefs(context1622222, this);
                if (pushFromPrefs == coroutine_suspended) {
                }
                m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                list15 = list14;
                i52 = i51;
                i53 = i48;
                i54 = i46;
                i55 = i44;
                int i6322222 = i45;
                i56 = i50;
                i57 = i47;
                i58 = i6322222;
                m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                if (m7908exceptionOrNullimpl10 != null) {
                }
                currentTimeMillis = System.currentTimeMillis();
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                Context context1722222 = this.$context;
                Result.Companion companion3022222 = Result.INSTANCE;
                DocumentReference document22222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                Pair[] pairArr22222 = new Pair[6];
                pairArr22222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                pairArr22222[1] = TuplesKt.to("device", "android");
                pairArr22222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context1722222)));
                pairArr22222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                pairArr22222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                pairArr22222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                Task<Void> task22222 = document22222.set(MapsKt.mapOf(pairArr22222), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task22222, "set(...)");
                this.L$0 = firebaseUser13;
                this.L$1 = list15;
                this.L$2 = null;
                this.I$0 = i52;
                this.Z$0 = z11;
                this.I$1 = i53;
                this.I$2 = i57;
                this.I$3 = i54;
                this.I$4 = i58;
                i60 = i55;
                this.I$5 = i60;
                i56 = i56;
                this.I$6 = i56;
                this.J$0 = currentTimeMillis;
                this.label = 20;
                await = TasksKt.await(task22222, this);
                if (await != coroutine_suspended) {
                }
                break;
            case 17:
                i50 = this.I$6;
                i44 = this.I$5;
                i45 = this.I$4;
                i46 = this.I$3;
                i47 = this.I$2;
                i48 = this.I$1;
                z10 = this.Z$0;
                i49 = this.I$0;
                List<String> list19 = (List) this.L$2;
                FirebaseUser firebaseUser19 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope24 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushAll = obj;
                    list14 = list19;
                    firebaseUser13 = firebaseUser19;
                    coroutineScope15 = coroutineScope24;
                    m7905constructorimpl10 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                } catch (Throwable th36) {
                    th2 = th36;
                    list14 = list19;
                    firebaseUser13 = firebaseUser19;
                    coroutineScope15 = coroutineScope24;
                    Result.Companion companion272 = Result.INSTANCE;
                    m7905constructorimpl10 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                    m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                    if (m7908exceptionOrNullimpl8 != null) {
                    }
                    Context context15222222 = this.$context;
                    Result.Companion companion28222222 = Result.INSTANCE;
                    StravaFirestoreSync stravaFirestoreSync222222 = StravaFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i49;
                    this.Z$0 = z10;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 18;
                    pushMeta = stravaFirestoreSync222222.pushMeta(context15222222, this);
                    if (pushMeta == coroutine_suspended) {
                    }
                    m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                    int i62222222 = i49;
                    z11 = z10;
                    i51 = i62222222;
                    m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                    if (m7908exceptionOrNullimpl9 != null) {
                    }
                    Context context16222222 = this.$context;
                    Result.Companion companion29222222 = Result.INSTANCE;
                    ProfileFirestoreSync profileFirestoreSync222222 = ProfileFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i51;
                    this.Z$0 = z11;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 19;
                    pushFromPrefs = profileFirestoreSync222222.pushFromPrefs(context16222222, this);
                    if (pushFromPrefs == coroutine_suspended) {
                    }
                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                    list15 = list14;
                    i52 = i51;
                    i53 = i48;
                    i54 = i46;
                    i55 = i44;
                    int i63222222 = i45;
                    i56 = i50;
                    i57 = i47;
                    i58 = i63222222;
                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                    if (m7908exceptionOrNullimpl10 != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                    Context context17222222 = this.$context;
                    Result.Companion companion30222222 = Result.INSTANCE;
                    DocumentReference document222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                    Pair[] pairArr222222 = new Pair[6];
                    pairArr222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                    pairArr222222[1] = TuplesKt.to("device", "android");
                    pairArr222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context17222222)));
                    pairArr222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                    pairArr222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                    pairArr222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                    Task<Void> task222222 = document222222.set(MapsKt.mapOf(pairArr222222), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task222222, "set(...)");
                    this.L$0 = firebaseUser13;
                    this.L$1 = list15;
                    this.L$2 = null;
                    this.I$0 = i52;
                    this.Z$0 = z11;
                    this.I$1 = i53;
                    this.I$2 = i57;
                    this.I$3 = i54;
                    this.I$4 = i58;
                    i60 = i55;
                    this.I$5 = i60;
                    i56 = i56;
                    this.I$6 = i56;
                    this.J$0 = currentTimeMillis;
                    this.label = 20;
                    await = TasksKt.await(task222222, this);
                    if (await != coroutine_suspended) {
                    }
                }
                m7908exceptionOrNullimpl8 = Result.m7908exceptionOrNullimpl(m7905constructorimpl10);
                if (m7908exceptionOrNullimpl8 != null) {
                }
                Context context152222222 = this.$context;
                Result.Companion companion282222222 = Result.INSTANCE;
                StravaFirestoreSync stravaFirestoreSync2222222 = StravaFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i49;
                this.Z$0 = z10;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 18;
                pushMeta = stravaFirestoreSync2222222.pushMeta(context152222222, this);
                if (pushMeta == coroutine_suspended) {
                }
                m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                int i622222222 = i49;
                z11 = z10;
                i51 = i622222222;
                m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                if (m7908exceptionOrNullimpl9 != null) {
                }
                Context context162222222 = this.$context;
                Result.Companion companion292222222 = Result.INSTANCE;
                ProfileFirestoreSync profileFirestoreSync2222222 = ProfileFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i51;
                this.Z$0 = z11;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 19;
                pushFromPrefs = profileFirestoreSync2222222.pushFromPrefs(context162222222, this);
                if (pushFromPrefs == coroutine_suspended) {
                }
                m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                list15 = list14;
                i52 = i51;
                i53 = i48;
                i54 = i46;
                i55 = i44;
                int i632222222 = i45;
                i56 = i50;
                i57 = i47;
                i58 = i632222222;
                m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                if (m7908exceptionOrNullimpl10 != null) {
                }
                currentTimeMillis = System.currentTimeMillis();
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                Context context172222222 = this.$context;
                Result.Companion companion302222222 = Result.INSTANCE;
                DocumentReference document2222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                Pair[] pairArr2222222 = new Pair[6];
                pairArr2222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                pairArr2222222[1] = TuplesKt.to("device", "android");
                pairArr2222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context172222222)));
                pairArr2222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                pairArr2222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                pairArr2222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                Task<Void> task2222222 = document2222222.set(MapsKt.mapOf(pairArr2222222), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task2222222, "set(...)");
                this.L$0 = firebaseUser13;
                this.L$1 = list15;
                this.L$2 = null;
                this.I$0 = i52;
                this.Z$0 = z11;
                this.I$1 = i53;
                this.I$2 = i57;
                this.I$3 = i54;
                this.I$4 = i58;
                i60 = i55;
                this.I$5 = i60;
                i56 = i56;
                this.I$6 = i56;
                this.J$0 = currentTimeMillis;
                this.label = 20;
                await = TasksKt.await(task2222222, this);
                if (await != coroutine_suspended) {
                }
                break;
            case 18:
                i50 = this.I$6;
                i44 = this.I$5;
                i45 = this.I$4;
                i46 = this.I$3;
                i47 = this.I$2;
                i48 = this.I$1;
                z10 = this.Z$0;
                i49 = this.I$0;
                List<String> list20 = (List) this.L$2;
                FirebaseUser firebaseUser20 = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope25 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushMeta = obj;
                    list14 = list20;
                    firebaseUser13 = firebaseUser20;
                    coroutineScope15 = coroutineScope25;
                    m7905constructorimpl11 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushMeta).booleanValue()));
                } catch (Throwable th37) {
                    Throwable th38 = th37;
                    list14 = list20;
                    firebaseUser13 = firebaseUser20;
                    coroutineScope15 = coroutineScope25;
                    Result.Companion companion33 = Result.INSTANCE;
                    m7905constructorimpl11 = Result.m7905constructorimpl(ResultKt.createFailure(th38));
                    int i6222222222 = i49;
                    z11 = z10;
                    i51 = i6222222222;
                    m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                    if (m7908exceptionOrNullimpl9 != null) {
                    }
                    Context context1622222222 = this.$context;
                    Result.Companion companion2922222222 = Result.INSTANCE;
                    ProfileFirestoreSync profileFirestoreSync22222222 = ProfileFirestoreSync.INSTANCE;
                    this.L$0 = coroutineScope15;
                    this.L$1 = firebaseUser13;
                    this.L$2 = list14;
                    this.I$0 = i51;
                    this.Z$0 = z11;
                    this.I$1 = i48;
                    this.I$2 = i47;
                    this.I$3 = i46;
                    this.I$4 = i45;
                    this.I$5 = i44;
                    this.I$6 = i50;
                    this.label = 19;
                    pushFromPrefs = profileFirestoreSync22222222.pushFromPrefs(context1622222222, this);
                    if (pushFromPrefs == coroutine_suspended) {
                    }
                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                    list15 = list14;
                    i52 = i51;
                    i53 = i48;
                    i54 = i46;
                    i55 = i44;
                    int i6322222222 = i45;
                    i56 = i50;
                    i57 = i47;
                    i58 = i6322222222;
                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                    if (m7908exceptionOrNullimpl10 != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                    Context context1722222222 = this.$context;
                    Result.Companion companion3022222222 = Result.INSTANCE;
                    DocumentReference document22222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                    Pair[] pairArr22222222 = new Pair[6];
                    pairArr22222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                    pairArr22222222[1] = TuplesKt.to("device", "android");
                    pairArr22222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context1722222222)));
                    pairArr22222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                    pairArr22222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                    pairArr22222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                    Task<Void> task22222222 = document22222222.set(MapsKt.mapOf(pairArr22222222), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task22222222, "set(...)");
                    this.L$0 = firebaseUser13;
                    this.L$1 = list15;
                    this.L$2 = null;
                    this.I$0 = i52;
                    this.Z$0 = z11;
                    this.I$1 = i53;
                    this.I$2 = i57;
                    this.I$3 = i54;
                    this.I$4 = i58;
                    i60 = i55;
                    this.I$5 = i60;
                    i56 = i56;
                    this.I$6 = i56;
                    this.J$0 = currentTimeMillis;
                    this.label = 20;
                    await = TasksKt.await(task22222222, this);
                    if (await != coroutine_suspended) {
                    }
                }
                int i62222222222 = i49;
                z11 = z10;
                i51 = i62222222222;
                m7908exceptionOrNullimpl9 = Result.m7908exceptionOrNullimpl(m7905constructorimpl11);
                if (m7908exceptionOrNullimpl9 != null) {
                }
                Context context16222222222 = this.$context;
                Result.Companion companion29222222222 = Result.INSTANCE;
                ProfileFirestoreSync profileFirestoreSync222222222 = ProfileFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope15;
                this.L$1 = firebaseUser13;
                this.L$2 = list14;
                this.I$0 = i51;
                this.Z$0 = z11;
                this.I$1 = i48;
                this.I$2 = i47;
                this.I$3 = i46;
                this.I$4 = i45;
                this.I$5 = i44;
                this.I$6 = i50;
                this.label = 19;
                pushFromPrefs = profileFirestoreSync222222222.pushFromPrefs(context16222222222, this);
                if (pushFromPrefs == coroutine_suspended) {
                }
                m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                list15 = list14;
                i52 = i51;
                i53 = i48;
                i54 = i46;
                i55 = i44;
                int i63222222222 = i45;
                i56 = i50;
                i57 = i47;
                i58 = i63222222222;
                m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                if (m7908exceptionOrNullimpl10 != null) {
                }
                currentTimeMillis = System.currentTimeMillis();
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                Context context17222222222 = this.$context;
                Result.Companion companion30222222222 = Result.INSTANCE;
                DocumentReference document222222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                Pair[] pairArr222222222 = new Pair[6];
                pairArr222222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                pairArr222222222[1] = TuplesKt.to("device", "android");
                pairArr222222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context17222222222)));
                pairArr222222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                pairArr222222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                pairArr222222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                Task<Void> task222222222 = document222222222.set(MapsKt.mapOf(pairArr222222222), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task222222222, "set(...)");
                this.L$0 = firebaseUser13;
                this.L$1 = list15;
                this.L$2 = null;
                this.I$0 = i52;
                this.Z$0 = z11;
                this.I$1 = i53;
                this.I$2 = i57;
                this.I$3 = i54;
                this.I$4 = i58;
                i60 = i55;
                this.I$5 = i60;
                i56 = i56;
                this.I$6 = i56;
                this.J$0 = currentTimeMillis;
                this.label = 20;
                await = TasksKt.await(task222222222, this);
                if (await != coroutine_suspended) {
                }
                break;
            case 19:
                i50 = this.I$6;
                i44 = this.I$5;
                i45 = this.I$4;
                i46 = this.I$3;
                i47 = this.I$2;
                i48 = this.I$1;
                z11 = this.Z$0;
                i51 = this.I$0;
                List<String> list21 = (List) this.L$2;
                FirebaseUser firebaseUser21 = (FirebaseUser) this.L$1;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushFromPrefs = obj;
                    list14 = list21;
                    firebaseUser13 = firebaseUser21;
                    m7905constructorimpl12 = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) pushFromPrefs).booleanValue()));
                } catch (Throwable th39) {
                    Throwable th40 = th39;
                    list14 = list21;
                    firebaseUser13 = firebaseUser21;
                    Result.Companion companion34 = Result.INSTANCE;
                    m7905constructorimpl12 = Result.m7905constructorimpl(ResultKt.createFailure(th40));
                    list15 = list14;
                    i52 = i51;
                    i53 = i48;
                    i54 = i46;
                    i55 = i44;
                    int i632222222222 = i45;
                    i56 = i50;
                    i57 = i47;
                    i58 = i632222222222;
                    m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                    if (m7908exceptionOrNullimpl10 != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                    Context context172222222222 = this.$context;
                    Result.Companion companion302222222222 = Result.INSTANCE;
                    DocumentReference document2222222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                    Pair[] pairArr2222222222 = new Pair[6];
                    pairArr2222222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                    pairArr2222222222[1] = TuplesKt.to("device", "android");
                    pairArr2222222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context172222222222)));
                    pairArr2222222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                    pairArr2222222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                    pairArr2222222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                    Task<Void> task2222222222 = document2222222222.set(MapsKt.mapOf(pairArr2222222222), SetOptions.merge());
                    Intrinsics.checkNotNullExpressionValue(task2222222222, "set(...)");
                    this.L$0 = firebaseUser13;
                    this.L$1 = list15;
                    this.L$2 = null;
                    this.I$0 = i52;
                    this.Z$0 = z11;
                    this.I$1 = i53;
                    this.I$2 = i57;
                    this.I$3 = i54;
                    this.I$4 = i58;
                    i60 = i55;
                    this.I$5 = i60;
                    i56 = i56;
                    this.I$6 = i56;
                    this.J$0 = currentTimeMillis;
                    this.label = 20;
                    await = TasksKt.await(task2222222222, this);
                    if (await != coroutine_suspended) {
                    }
                }
                list15 = list14;
                i52 = i51;
                i53 = i48;
                i54 = i46;
                i55 = i44;
                int i6322222222222 = i45;
                i56 = i50;
                i57 = i47;
                i58 = i6322222222222;
                m7908exceptionOrNullimpl10 = Result.m7908exceptionOrNullimpl(m7905constructorimpl12);
                if (m7908exceptionOrNullimpl10 != null) {
                }
                currentTimeMillis = System.currentTimeMillis();
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("last_cloud_sync_ms", currentTimeMillis).apply();
                Context context1722222222222 = this.$context;
                Result.Companion companion3022222222222 = Result.INSTANCE;
                DocumentReference document22222222222 = FirebaseFirestore.getInstance().collection("users").document(firebaseUser13.getUid()).collection("meta").document("sync");
                Pair[] pairArr22222222222 = new Pair[6];
                pairArr22222222222[0] = TuplesKt.to("lastSyncMs", Boxing.boxLong(currentTimeMillis));
                pairArr22222222222[1] = TuplesKt.to("device", "android");
                pairArr22222222222[2] = TuplesKt.to("pendingGymUploads", Boxing.boxInt(GymSyncQueue.INSTANCE.pendingCount(context1722222222222)));
                pairArr22222222222[3] = TuplesKt.to("lastError", CollectionsKt.firstOrNull((List) list15));
                pairArr22222222222[4] = TuplesKt.to("gymPushed", Boxing.boxInt(i57));
                pairArr22222222222[5] = TuplesKt.to("runsPulled", Boxing.boxInt(i53));
                Task<Void> task22222222222 = document22222222222.set(MapsKt.mapOf(pairArr22222222222), SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task22222222222, "set(...)");
                this.L$0 = firebaseUser13;
                this.L$1 = list15;
                this.L$2 = null;
                this.I$0 = i52;
                this.Z$0 = z11;
                this.I$1 = i53;
                this.I$2 = i57;
                this.I$3 = i54;
                this.I$4 = i58;
                i60 = i55;
                this.I$5 = i60;
                i56 = i56;
                this.I$6 = i56;
                this.J$0 = currentTimeMillis;
                this.label = 20;
                await = TasksKt.await(task22222222222, this);
                if (await != coroutine_suspended) {
                }
                break;
            case 20:
                j = this.J$0;
                i56 = this.I$6;
                i55 = this.I$5;
                i58 = this.I$4;
                i54 = this.I$3;
                i59 = this.I$2;
                i53 = this.I$1;
                z11 = this.Z$0;
                i52 = this.I$0;
                list15 = (List) this.L$1;
                firebaseUser14 = (FirebaseUser) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    m7905constructorimpl13 = Result.m7905constructorimpl((Void) await);
                } catch (Throwable th41) {
                    th = th41;
                    Result.Companion companion312 = Result.INSTANCE;
                    m7905constructorimpl13 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    List<String> list1622 = list15;
                    int i6422 = i54;
                    int i6522 = i56;
                    int i6622 = i58;
                    int i6722 = i55;
                    long j222 = j;
                    FirebaseUser firebaseUser1522 = firebaseUser14;
                    int i6822 = i59;
                    int i6922 = i52;
                    int i7022 = i53;
                    m7908exceptionOrNullimpl11 = Result.m7908exceptionOrNullimpl(m7905constructorimpl13);
                    if (m7908exceptionOrNullimpl11 != null) {
                    }
                    String uid22 = firebaseUser1522.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid22, "getUid(...)");
                    return new CloudSyncResult(i6822, i6422, i6622, i6722, i6522, i6922, j222, z11, i7022, uid22, list1622);
                }
                List<String> list16222 = list15;
                int i64222 = i54;
                int i65222 = i56;
                int i66222 = i58;
                int i67222 = i55;
                long j2222 = j;
                FirebaseUser firebaseUser15222 = firebaseUser14;
                int i68222 = i59;
                int i69222 = i52;
                int i70222 = i53;
                m7908exceptionOrNullimpl11 = Result.m7908exceptionOrNullimpl(m7905constructorimpl13);
                if (m7908exceptionOrNullimpl11 != null) {
                }
                String uid222 = firebaseUser15222.getUid();
                Intrinsics.checkNotNullExpressionValue(uid222, "getUid(...)");
                return new CloudSyncResult(i68222, i64222, i66222, i67222, i65222, i69222, j2222, z11, i70222, uid222, list16222);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
