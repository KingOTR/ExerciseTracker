package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RemoteGymSetRow;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync$pullWithConflictResolution$2", f = "GymFirestoreSync.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 3, 3}, l = {104, 109, 113, 121}, m = "invokeSuspend", n = {"repo", "repo", "doc", "remoteId", "merged", "remoteUpdated", "repo", "merged", "repo", "merged"}, s = {"L$0", "L$0", "L$2", "L$3", "I$0", "J$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class GymFirestoreSync$pullWithConflictResolution$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function2<Context, Long, Long> $localUpdatedMs;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymFirestoreSync$pullWithConflictResolution$2(Context context, Function2<? super Context, ? super Long, Long> function2, Continuation<? super GymFirestoreSync$pullWithConflictResolution$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$localUpdatedMs = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymFirestoreSync$pullWithConflictResolution$2 gymFirestoreSync$pullWithConflictResolution$2 = new GymFirestoreSync$pullWithConflictResolution$2(this.$context, this.$localUpdatedMs, continuation);
        gymFirestoreSync$pullWithConflictResolution$2.L$0 = obj;
        return gymFirestoreSync$pullWithConflictResolution$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((GymFirestoreSync$pullWithConflictResolution$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01f9 -> B:13:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01e6 -> B:9:0x01e8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Iterator<DocumentSnapshot> it;
        int i;
        Repository repository;
        String str;
        DocumentSnapshot documentSnapshot;
        int i2;
        long j;
        Object obj2;
        GymSessionEntity gymSessionEntity;
        List<RemoteGymSetRow> parseSetRows;
        Repository repository2;
        Object applyRemoteDocToLocal;
        CollectionReference sessionsCollection;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        int i4 = 2;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            repository2 = Repository.INSTANCE.get(this.$context);
            Result.Companion companion2 = Result.INSTANCE;
            GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            sessionsCollection = gymFirestoreSync.sessionsCollection(uid);
            Task<QuerySnapshot> task = sessionsCollection.get();
            Intrinsics.checkNotNullExpressionValue(task, "get(...)");
            this.L$0 = repository2;
            this.label = 1;
            await = TasksKt.await(task, this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i3 == 1) {
            repository2 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            await = obj;
        } else if (i3 == 2) {
            j = this.J$0;
            int i5 = this.I$0;
            String str2 = (String) this.L$3;
            documentSnapshot = (DocumentSnapshot) this.L$2;
            Iterator<DocumentSnapshot> it2 = (Iterator) this.L$1;
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            i2 = i5;
            it = it2;
            str = str2;
            gymSessionEntity = (GymSessionEntity) obj2;
            if (gymSessionEntity == null) {
            }
            i = i2;
            repository2 = repository;
            i4 = 2;
            if (it.hasNext()) {
            }
        } else if (i3 == 3) {
            int i6 = this.I$0;
            Iterator<DocumentSnapshot> it3 = (Iterator) this.L$1;
            Repository repository3 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = i6 + 1;
            it = it3;
            repository2 = repository3;
            i4 = 2;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$0;
            Iterator<DocumentSnapshot> it4 = (Iterator) this.L$1;
            Repository repository4 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object importRemoteGymSession = obj;
            char c = 4;
            i = i7;
            it = it4;
            repository2 = repository4;
            if (((Number) importRemoteGymSession).longValue() > 0) {
                i++;
            }
            i4 = 2;
            if (it.hasNext()) {
                documentSnapshot = it.next();
                String id = documentSnapshot.getId();
                Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                Long l = documentSnapshot.getLong("updatedAtMs");
                long longValue = l != null ? l.longValue() : 0L;
                this.L$0 = repository2;
                this.L$1 = it;
                this.L$2 = documentSnapshot;
                this.L$3 = id;
                this.I$0 = i;
                this.J$0 = longValue;
                this.label = i4;
                obj2 = repository2.gymSessionByRemoteId(id, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j2 = longValue;
                repository = repository2;
                str = id;
                i2 = i;
                j = j2;
                gymSessionEntity = (GymSessionEntity) obj2;
                if (gymSessionEntity == null) {
                    Long l2 = documentSnapshot.getLong("startedAtMs");
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        Long l3 = documentSnapshot.getLong("endedAtMs");
                        if (l3 != null) {
                            long longValue3 = l3.longValue();
                            parseSetRows = GymFirestoreSync.INSTANCE.parseSetRows(documentSnapshot.get("sets"));
                            if (parseSetRows != null && !parseSetRows.isEmpty()) {
                                Boolean bool = documentSnapshot.getBoolean("freeDay");
                                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                this.L$0 = repository;
                                this.L$1 = it;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = i2;
                                c = 4;
                                this.label = 4;
                                importRemoteGymSession = repository.importRemoteGymSession(str, longValue2, longValue3, null, booleanValue, documentSnapshot.getString("notes"), parseSetRows, documentSnapshot.getString("ambientTag"), documentSnapshot.getString("ambientTagCustom"), this);
                                if (importRemoteGymSession == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i = i2;
                                repository2 = repository;
                                if (((Number) importRemoteGymSession).longValue() > 0) {
                                }
                                i4 = 2;
                                if (it.hasNext()) {
                                    return Boxing.boxInt(i);
                                }
                            }
                        }
                    }
                } else if (j > this.$localUpdatedMs.invoke(this.$context, Boxing.boxLong(gymSessionEntity.getId())).longValue()) {
                    GymFirestoreSync gymFirestoreSync2 = GymFirestoreSync.INSTANCE;
                    long id2 = gymSessionEntity.getId();
                    Map<String, Object> data = documentSnapshot.getData();
                    if (data != null) {
                        this.L$0 = repository;
                        this.L$1 = it;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = i2;
                        this.label = 3;
                        applyRemoteDocToLocal = gymFirestoreSync2.applyRemoteDocToLocal(repository, id2, str, data, this);
                        if (applyRemoteDocToLocal == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = i2 + 1;
                        it = it;
                        repository2 = repository;
                        i4 = 2;
                        if (it.hasNext()) {
                        }
                    }
                }
                i = i2;
                repository2 = repository;
                i4 = 2;
                if (it.hasNext()) {
                }
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl((QuerySnapshot) await);
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            return Boxing.boxInt(0);
        }
        it = ((QuerySnapshot) m7905constructorimpl).getDocuments().iterator();
        i = 0;
        if (it.hasNext()) {
        }
    }
}
