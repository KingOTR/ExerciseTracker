package com.example.rungps.sync;

import android.content.Context;
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

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync$pullIntoRoom$2", f = "GymFirestoreSync.kt", i = {0, 1, 1, 1, 1, 2, 2}, l = {143, 147, 160}, m = "invokeSuspend", n = {"repo", "repo", "doc", "remoteId", "imported", "repo", "imported"}, s = {"L$0", "L$0", "L$2", "L$3", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class GymFirestoreSync$pullIntoRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymFirestoreSync$pullIntoRoom$2(Context context, Continuation<? super GymFirestoreSync$pullIntoRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymFirestoreSync$pullIntoRoom$2 gymFirestoreSync$pullIntoRoom$2 = new GymFirestoreSync$pullIntoRoom$2(this.$context, continuation);
        gymFirestoreSync$pullIntoRoom$2.L$0 = obj;
        return gymFirestoreSync$pullIntoRoom$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((GymFirestoreSync$pullIntoRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01ac -> B:7:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01bf -> B:10:0x00c5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Repository repository;
        CollectionReference sessionsCollection;
        Object await;
        Object m7905constructorimpl;
        Iterator<DocumentSnapshot> it;
        int i;
        int i2;
        String str;
        Object obj2;
        DocumentSnapshot documentSnapshot;
        Long l;
        Long l2;
        Long boxLong;
        List<RemoteGymSetRow> parseSetRows;
        String obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            Repository repository2 = Repository.INSTANCE.get(this.$context);
            try {
                Result.Companion companion = Result.INSTANCE;
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
                repository = repository2;
            } catch (Throwable th) {
                th = th;
                repository = repository2;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                }
            }
        } else if (i3 == 1) {
            repository = (Repository) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                await = obj;
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                }
            }
        } else if (i3 == 2) {
            int i4 = this.I$0;
            String str2 = (String) this.L$3;
            documentSnapshot = (DocumentSnapshot) this.L$2;
            Iterator<DocumentSnapshot> it2 = (Iterator) this.L$1;
            Repository repository3 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            str = str2;
            repository = repository3;
            i2 = i4;
            it = it2;
            if (obj2 == null) {
                long longValue = l.longValue();
                l2 = documentSnapshot.getLong("endedAtMs");
                if (l2 != null) {
                }
            }
            i = i2;
            if (!it.hasNext()) {
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = this.I$0;
            Iterator<DocumentSnapshot> it3 = (Iterator) this.L$1;
            Repository repository4 = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = i5;
            it = it3;
            repository = repository4;
            Object importRemoteGymSession = obj;
            if (((Number) importRemoteGymSession).longValue() > 0) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    DocumentSnapshot next = it.next();
                    String id = next.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                    this.L$0 = repository;
                    this.L$1 = it;
                    this.L$2 = next;
                    this.L$3 = id;
                    this.I$0 = i;
                    this.label = 2;
                    obj2 = repository.gymSessionByRemoteId(id, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = id;
                    i2 = i;
                    documentSnapshot = next;
                    if (obj2 == null && (l = documentSnapshot.getLong("startedAtMs")) != null) {
                        long longValue2 = l.longValue();
                        l2 = documentSnapshot.getLong("endedAtMs");
                        if (l2 != null) {
                            long longValue3 = l2.longValue();
                            Boolean bool = documentSnapshot.getBoolean("freeDay");
                            boolean booleanValue = bool != null ? bool.booleanValue() : false;
                            String string = documentSnapshot.getString("notes");
                            String str3 = (string == null || (obj3 = StringsKt.trim((CharSequence) string).toString()) == null || obj3.length() <= 0) ? null : obj3;
                            if (documentSnapshot.contains("templateDayId") && documentSnapshot.get("templateDayId") != null && (documentSnapshot.get("templateDayId") instanceof Number)) {
                                Object obj4 = documentSnapshot.get("templateDayId");
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Number");
                                boxLong = Boxing.boxLong(((Number) obj4).longValue());
                            } else {
                                boxLong = null;
                            }
                            parseSetRows = GymFirestoreSync.INSTANCE.parseSetRows(documentSnapshot.get("sets"));
                            if (parseSetRows != null && !parseSetRows.isEmpty()) {
                                this.L$0 = repository;
                                this.L$1 = it;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = i2;
                                this.label = 3;
                                importRemoteGymSession = repository.importRemoteGymSession(str, longValue2, longValue3, boxLong, booleanValue, str3, parseSetRows, documentSnapshot.getString("ambientTag"), documentSnapshot.getString("ambientTagCustom"), this);
                                if (importRemoteGymSession == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Number) importRemoteGymSession).longValue() > 0) {
                                }
                            }
                        }
                    }
                } else {
                    return Boxing.boxInt(i);
                }
            }
            i = i2;
            if (!it.hasNext()) {
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl((QuerySnapshot) await);
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            return Boxing.boxInt(0);
        }
        it = ((QuerySnapshot) m7905constructorimpl).getDocuments().iterator();
        i = 0;
        if (!it.hasNext()) {
        }
    }
}
