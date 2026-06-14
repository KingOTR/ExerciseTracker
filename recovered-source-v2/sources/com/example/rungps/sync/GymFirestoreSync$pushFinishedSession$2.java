package com.example.rungps.sync;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync$pushFinishedSession$2", f = "GymFirestoreSync.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7}, l = {23, 25, 29, 32, 38, 41, 42, 84}, m = "invokeSuspend", n = {"$this$withContext", "user", "repo", "$this$withContext", "user", "repo", "session", "ended", "$this$withContext", "user", "repo", "session", "sets", "remoteId", "ended", "user", "repo", "session", "sets", "remoteId", "ended", "localUpdated", "user", "repo", "session", "sets", "remoteId", "ended", "localHasSets", "user", "repo", "session", "sets", "remoteId", "ended", "user", "session", "sets", "remoteId", "templateDayName", "ended", "now"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$0"})
/* loaded from: classes3.dex */
final class GymFirestoreSync$pushFinishedSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $localSessionId;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymFirestoreSync$pushFinishedSession$2(Context context, long j, Continuation<? super GymFirestoreSync$pushFinishedSession$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$localSessionId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymFirestoreSync$pushFinishedSession$2 gymFirestoreSync$pushFinishedSession$2 = new GymFirestoreSync$pushFinishedSession$2(this.$context, this.$localSessionId, continuation);
        gymFirestoreSync$pushFinishedSession$2.L$0 = obj;
        return gymFirestoreSync$pushFinishedSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymFirestoreSync$pushFinishedSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x018d, code lost:
    
        if (r14 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03a8, code lost:
    
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) r13, (java.lang.CharSequence) "podcast", true) == true) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0486 A[LOOP:2: B:47:0x0480->B:49:0x0486, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0366 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a9  */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Object gymSessionById;
        CoroutineScope coroutineScope;
        Repository repository;
        GymSessionEntity gymSessionEntity;
        long longValue;
        Object obj2;
        Repository repository2;
        GymSessionEntity gymSessionEntity2;
        Ref.ObjectRef objectRef;
        String remoteId;
        T t;
        GymSessionEntity gymSessionEntity3;
        FirebaseUser firebaseUser;
        Repository repository3;
        Ref.ObjectRef objectRef2;
        List list;
        long j;
        GymSessionEntity gymSessionEntity4;
        Ref.ObjectRef objectRef3;
        List list2;
        FirebaseUser firebaseUser2;
        long j2;
        String str;
        String str2;
        long localUpdatedMs;
        Long boxLong;
        long j3;
        long longValue2;
        FirebaseUser firebaseUser3;
        Repository repository4;
        long j4;
        CollectionReference sessionsCollection;
        Object await;
        Object m7905constructorimpl;
        Repository repository5;
        FirebaseUser firebaseUser4;
        List list3;
        GymSessionEntity gymSessionEntity5;
        Ref.ObjectRef objectRef4;
        long j5;
        DocumentSnapshot documentSnapshot;
        String str3;
        Object obj3;
        List parseSetRows;
        String str4;
        String str5;
        List list4;
        Map<String, Object> data;
        Object applyRemoteDocToLocal;
        int i;
        Long l;
        Ref.ObjectRef objectRef5;
        List list5;
        GymSessionEntity gymSessionEntity6;
        Repository repository6;
        FirebaseUser firebaseUser5;
        Long templateDayId;
        Object dayNameForTemplate;
        List list6;
        long j6;
        Ref.ObjectRef objectRef6;
        String str6;
        Object spotifyTimelineForGymSession;
        List list7;
        long j7;
        GymSessionEntity gymSessionEntity7;
        String str7;
        String obj4;
        Iterator it;
        Object obj5;
        CollectionReference sessionsCollection2;
        Task<Void> task;
        long j8;
        Object obj6;
        Iterator it2;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser == null) {
                    return Unit.INSTANCE;
                }
                Repository repository7 = Repository.INSTANCE.get(this.$context);
                this.L$0 = coroutineScope2;
                this.L$1 = currentUser;
                this.L$2 = repository7;
                this.label = 1;
                gymSessionById = repository7.gymSessionById(this.$localSessionId, this);
                if (gymSessionById == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                repository = repository7;
                gymSessionEntity = (GymSessionEntity) gymSessionById;
                if (gymSessionEntity != null) {
                    return Unit.INSTANCE;
                }
                Long endedAtMs = gymSessionEntity.getEndedAtMs();
                if (endedAtMs == null) {
                    return Unit.INSTANCE;
                }
                longValue = endedAtMs.longValue();
                this.L$0 = coroutineScope;
                this.L$1 = currentUser;
                this.L$2 = repository;
                this.L$3 = gymSessionEntity;
                this.J$0 = longValue;
                this.label = 2;
                obj2 = repository.setsForSession(this.$localSessionId, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository2 = repository;
                gymSessionEntity2 = gymSessionEntity;
                List list8 = (List) obj2;
                objectRef = new Ref.ObjectRef();
                remoteId = gymSessionEntity2.getRemoteId();
                if (remoteId != null) {
                    boolean isBlank = StringsKt.isBlank(remoteId);
                    t = remoteId;
                    break;
                }
                t = 0;
                objectRef.element = t;
                if (objectRef.element == 0) {
                    gymSessionEntity3 = gymSessionEntity2;
                    firebaseUser = currentUser;
                    repository3 = repository2;
                    objectRef2 = objectRef;
                    list = list8;
                    j = longValue;
                    str = "sets";
                    str2 = "updatedAtMs";
                    localUpdatedMs = GymFirestoreSync.INSTANCE.localUpdatedMs(this.$context, this.$localSessionId);
                    boxLong = Boxing.boxLong(localUpdatedMs);
                    j3 = 0;
                    if (boxLong.longValue() <= 0) {
                    }
                    if (boxLong != null) {
                    }
                    Result.Companion companion = Result.INSTANCE;
                    GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                    String uid = firebaseUser.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    sessionsCollection = gymFirestoreSync.sessionsCollection(uid);
                    Task<DocumentSnapshot> task2 = sessionsCollection.document((String) objectRef2.element).get();
                    Intrinsics.checkNotNullExpressionValue(task2, "get(...)");
                    this.L$0 = firebaseUser;
                    this.L$1 = repository3;
                    this.L$2 = gymSessionEntity3;
                    this.L$3 = list;
                    this.L$4 = objectRef2;
                    this.L$5 = null;
                    this.J$0 = j;
                    this.J$1 = longValue2;
                    this.label = 4;
                    await = TasksKt.await(task2, this);
                    if (await == coroutine_suspended) {
                    }
                } else {
                    objectRef.element = UUID.randomUUID().toString();
                    this.L$0 = coroutineScope;
                    this.L$1 = currentUser;
                    this.L$2 = repository2;
                    this.L$3 = gymSessionEntity2;
                    this.L$4 = list8;
                    this.L$5 = objectRef;
                    this.J$0 = longValue;
                    this.label = 3;
                    if (repository2.setGymSessionRemoteId(this.$localSessionId, (String) objectRef.element, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gymSessionEntity4 = gymSessionEntity2;
                    repository3 = repository2;
                    objectRef3 = objectRef;
                    list2 = list8;
                    firebaseUser2 = currentUser;
                    j2 = longValue;
                    gymSessionEntity3 = gymSessionEntity4;
                    firebaseUser = firebaseUser2;
                    list = list2;
                    j = j2;
                    objectRef2 = objectRef3;
                    str = "sets";
                    str2 = "updatedAtMs";
                    localUpdatedMs = GymFirestoreSync.INSTANCE.localUpdatedMs(this.$context, this.$localSessionId);
                    boxLong = Boxing.boxLong(localUpdatedMs);
                    j3 = 0;
                    if (boxLong.longValue() <= 0) {
                        boxLong = null;
                    }
                    longValue2 = boxLong != null ? boxLong.longValue() : j;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        GymFirestoreSync gymFirestoreSync2 = GymFirestoreSync.INSTANCE;
                        String uid2 = firebaseUser.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        sessionsCollection = gymFirestoreSync2.sessionsCollection(uid2);
                        Task<DocumentSnapshot> task22 = sessionsCollection.document((String) objectRef2.element).get();
                        Intrinsics.checkNotNullExpressionValue(task22, "get(...)");
                        this.L$0 = firebaseUser;
                        this.L$1 = repository3;
                        this.L$2 = gymSessionEntity3;
                        this.L$3 = list;
                        this.L$4 = objectRef2;
                        this.L$5 = null;
                        this.J$0 = j;
                        this.J$1 = longValue2;
                        this.label = 4;
                        await = TasksKt.await(task22, this);
                    } catch (Throwable th) {
                        th = th;
                        long j9 = longValue2;
                        firebaseUser3 = firebaseUser;
                        repository4 = repository3;
                        j4 = j9;
                        Result.Companion companion3 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        List list9 = list;
                        repository5 = repository4;
                        GymSessionEntity gymSessionEntity8 = gymSessionEntity3;
                        firebaseUser4 = firebaseUser3;
                        long j10 = j4;
                        list3 = list9;
                        gymSessionEntity5 = gymSessionEntity8;
                        objectRef4 = objectRef2;
                        j5 = j;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
                        String str8 = str2;
                        if (documentSnapshot != null) {
                        }
                        GymFirestoreSync gymFirestoreSync3 = GymFirestoreSync.INSTANCE;
                        if (documentSnapshot != null) {
                        }
                        parseSetRows = gymFirestoreSync3.parseSetRows(obj3);
                        str4 = str;
                        int i2 = !list3.isEmpty() ? 1 : 0;
                        str5 = str8;
                        if (documentSnapshot != null) {
                        }
                        objectRef5 = objectRef4;
                        list5 = list3;
                        gymSessionEntity6 = gymSessionEntity5;
                        repository6 = repository5;
                        firebaseUser5 = firebaseUser4;
                        templateDayId = gymSessionEntity6.getTemplateDayId();
                        if (templateDayId != null) {
                        }
                        list6 = list5;
                        j6 = j5;
                        objectRef6 = objectRef5;
                        str6 = null;
                        this.L$0 = firebaseUser5;
                        this.L$1 = gymSessionEntity6;
                        this.L$2 = list6;
                        this.L$3 = objectRef6;
                        this.L$4 = str6;
                        this.L$5 = null;
                        this.J$0 = j6;
                        this.label = 7;
                        spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                        if (spotifyTimelineForGymSession == coroutine_suspended) {
                        }
                    }
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    long j11 = longValue2;
                    firebaseUser3 = firebaseUser;
                    repository4 = repository3;
                    j4 = j11;
                    try {
                        m7905constructorimpl = Result.m7905constructorimpl((DocumentSnapshot) await);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion32 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        List list92 = list;
                        repository5 = repository4;
                        GymSessionEntity gymSessionEntity82 = gymSessionEntity3;
                        firebaseUser4 = firebaseUser3;
                        long j102 = j4;
                        list3 = list92;
                        gymSessionEntity5 = gymSessionEntity82;
                        objectRef4 = objectRef2;
                        j5 = j;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
                        String str82 = str2;
                        if (documentSnapshot != null) {
                        }
                        GymFirestoreSync gymFirestoreSync32 = GymFirestoreSync.INSTANCE;
                        if (documentSnapshot != null) {
                        }
                        parseSetRows = gymFirestoreSync32.parseSetRows(obj3);
                        str4 = str;
                        int i22 = !list3.isEmpty() ? 1 : 0;
                        str5 = str82;
                        if (documentSnapshot != null) {
                        }
                        objectRef5 = objectRef4;
                        list5 = list3;
                        gymSessionEntity6 = gymSessionEntity5;
                        repository6 = repository5;
                        firebaseUser5 = firebaseUser4;
                        templateDayId = gymSessionEntity6.getTemplateDayId();
                        if (templateDayId != null) {
                        }
                        list6 = list5;
                        j6 = j5;
                        objectRef6 = objectRef5;
                        str6 = null;
                        this.L$0 = firebaseUser5;
                        this.L$1 = gymSessionEntity6;
                        this.L$2 = list6;
                        this.L$3 = objectRef6;
                        this.L$4 = str6;
                        this.L$5 = null;
                        this.J$0 = j6;
                        this.label = 7;
                        spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                        if (spotifyTimelineForGymSession == coroutine_suspended) {
                        }
                    }
                    List list922 = list;
                    repository5 = repository4;
                    GymSessionEntity gymSessionEntity822 = gymSessionEntity3;
                    firebaseUser4 = firebaseUser3;
                    long j1022 = j4;
                    list3 = list922;
                    gymSessionEntity5 = gymSessionEntity822;
                    objectRef4 = objectRef2;
                    j5 = j;
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
                    String str822 = str2;
                    if (documentSnapshot != null && (l = documentSnapshot.getLong(str822)) != null) {
                        j3 = l.longValue();
                    }
                    GymFirestoreSync gymFirestoreSync322 = GymFirestoreSync.INSTANCE;
                    if (documentSnapshot != null) {
                        str3 = "getUid(...)";
                        obj3 = documentSnapshot.get(str);
                    } else {
                        str3 = "getUid(...)";
                        obj3 = null;
                    }
                    parseSetRows = gymFirestoreSync322.parseSetRows(obj3);
                    str4 = str;
                    int i222 = !list3.isEmpty() ? 1 : 0;
                    str5 = str822;
                    if (documentSnapshot != null && documentSnapshot.exists() && j3 > j1022 && (list4 = parseSetRows) != null && !list4.isEmpty()) {
                        GymFirestoreSync gymFirestoreSync4 = GymFirestoreSync.INSTANCE;
                        long j12 = this.$localSessionId;
                        String str9 = (String) objectRef4.element;
                        data = documentSnapshot.getData();
                        if (data != null) {
                            return Unit.INSTANCE;
                        }
                        this.L$0 = firebaseUser4;
                        this.L$1 = repository5;
                        this.L$2 = gymSessionEntity5;
                        this.L$3 = list3;
                        this.L$4 = objectRef4;
                        this.L$5 = null;
                        this.J$0 = j5;
                        this.I$0 = i222;
                        this.label = 5;
                        applyRemoteDocToLocal = gymFirestoreSync4.applyRemoteDocToLocal(repository5, j12, str9, data, this);
                        if (applyRemoteDocToLocal == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = i222;
                        if (i == 0) {
                            return Unit.INSTANCE;
                        }
                    }
                    objectRef5 = objectRef4;
                    list5 = list3;
                    gymSessionEntity6 = gymSessionEntity5;
                    repository6 = repository5;
                    firebaseUser5 = firebaseUser4;
                    templateDayId = gymSessionEntity6.getTemplateDayId();
                    if (templateDayId != null) {
                        long longValue3 = templateDayId.longValue();
                        this.L$0 = firebaseUser5;
                        this.L$1 = repository6;
                        this.L$2 = gymSessionEntity6;
                        this.L$3 = list5;
                        this.L$4 = objectRef5;
                        this.L$5 = null;
                        this.J$0 = j5;
                        this.label = 6;
                        dayNameForTemplate = repository6.dayNameForTemplate(longValue3, this);
                        if (dayNameForTemplate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str7 = (String) dayNameForTemplate;
                        if (str7 != null && (obj4 = StringsKt.trim((CharSequence) str7).toString()) != null && obj4.length() > 0) {
                            long j13 = j5;
                            objectRef6 = objectRef5;
                            str6 = obj4;
                            list6 = list5;
                            j6 = j13;
                            this.L$0 = firebaseUser5;
                            this.L$1 = gymSessionEntity6;
                            this.L$2 = list6;
                            this.L$3 = objectRef6;
                            this.L$4 = str6;
                            this.L$5 = null;
                            this.J$0 = j6;
                            this.label = 7;
                            spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                            if (spotifyTimelineForGymSession == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list7 = list6;
                            j7 = j6;
                            gymSessionEntity7 = gymSessionEntity6;
                            ArrayList arrayList = new ArrayList();
                            it = ((Iterable) spotifyTimelineForGymSession).iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                SpotifyTimelineEntity spotifyTimelineEntity = (SpotifyTimelineEntity) next;
                                if (!spotifyTimelineEntity.isPlaying() && !Intrinsics.areEqual(spotifyTimelineEntity.getItemType(), "episode")) {
                                    String itemType = spotifyTimelineEntity.getItemType();
                                    if (itemType != null) {
                                        z = true;
                                        break;
                                    } else {
                                        z = true;
                                    }
                                    String itemId = spotifyTimelineEntity.getItemId();
                                    if (itemId != null) {
                                        obj6 = coroutine_suspended;
                                        it2 = it;
                                        if (StringsKt.startsWith$default(itemId, "device:", false, 2, (Object) null) != z) {
                                        }
                                        arrayList.add(next);
                                    } else {
                                        obj6 = coroutine_suspended;
                                        it2 = it;
                                    }
                                    it = it2;
                                    coroutine_suspended = obj6;
                                }
                                obj6 = coroutine_suspended;
                                it2 = it;
                                arrayList.add(next);
                                it = it2;
                                coroutine_suspended = obj6;
                            }
                            obj5 = coroutine_suspended;
                            ArrayList<SpotifyTimelineEntity> arrayList2 = arrayList;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                            for (SpotifyTimelineEntity spotifyTimelineEntity2 : arrayList2) {
                                Pair[] pairArr = new Pair[6];
                                pairArr[0] = TuplesKt.to("timeMs", Boxing.boxLong(spotifyTimelineEntity2.getTimeMs()));
                                pairArr[1] = TuplesKt.to("isPlaying", Boxing.boxBoolean(spotifyTimelineEntity2.isPlaying()));
                                pairArr[2] = TuplesKt.to("itemType", spotifyTimelineEntity2.getItemType());
                                pairArr[3] = TuplesKt.to("title", spotifyTimelineEntity2.getTitle());
                                pairArr[4] = TuplesKt.to("subtitle", spotifyTimelineEntity2.getSubtitle());
                                String artUrl = spotifyTimelineEntity2.getArtUrl();
                                if (artUrl == null || !StringsKt.startsWith(artUrl, ProxyConfig.MATCH_HTTP, true)) {
                                    artUrl = null;
                                }
                                pairArr[5] = TuplesKt.to("artUrl", artUrl);
                                arrayList3.add(MapsKt.mapOf(pairArr));
                            }
                            ArrayList arrayList4 = arrayList3;
                            long currentTimeMillis = System.currentTimeMillis();
                            List<GymSetEntity> list10 = list7;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                            for (GymSetEntity gymSetEntity : list10) {
                                arrayList5.add(MapsKt.mapOf(TuplesKt.to("exerciseName", gymSetEntity.getExerciseName()), TuplesKt.to("setIndex", Boxing.boxInt(gymSetEntity.getSetIndex())), TuplesKt.to("reps", gymSetEntity.getReps()), TuplesKt.to("weightKg", Boxing.boxDouble(gymSetEntity.getWeightKg())), TuplesKt.to("loggedAtMs", gymSetEntity.getLoggedAtMs()), TuplesKt.to("rpeBorg", gymSetEntity.getRpeBorg())));
                            }
                            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("localSessionId", Boxing.boxLong(this.$localSessionId)), TuplesKt.to("startedAtMs", Boxing.boxLong(gymSessionEntity7.getStartedAtMs())), TuplesKt.to("endedAtMs", Boxing.boxLong(j7)), TuplesKt.to("templateDayId", gymSessionEntity7.getTemplateDayId()), TuplesKt.to("templateDayName", str6), TuplesKt.to("mediaTimeline", arrayList4), TuplesKt.to("freeDay", Boxing.boxBoolean(gymSessionEntity7.getFreeDay())), TuplesKt.to("notes", gymSessionEntity7.getNotes()), TuplesKt.to("ambientTag", gymSessionEntity7.getAmbientTag()), TuplesKt.to("ambientTagCustom", gymSessionEntity7.getAmbientTagCustom()), TuplesKt.to(str5, Boxing.boxLong(currentTimeMillis)), TuplesKt.to(str4, arrayList5));
                            GymFirestoreSync gymFirestoreSync5 = GymFirestoreSync.INSTANCE;
                            String uid3 = firebaseUser5.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid3, str3);
                            sessionsCollection2 = gymFirestoreSync5.sessionsCollection(uid3);
                            task = sessionsCollection2.document((String) objectRef6.element).set(hashMapOf);
                            Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.J$0 = currentTimeMillis;
                            this.label = 8;
                            if (TasksKt.await(task, this) != obj5) {
                                return obj5;
                            }
                            j8 = currentTimeMillis;
                            this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("gym_local_updated_" + this.$localSessionId, j8).apply();
                            return Unit.INSTANCE;
                        }
                    }
                    list6 = list5;
                    j6 = j5;
                    objectRef6 = objectRef5;
                    str6 = null;
                    this.L$0 = firebaseUser5;
                    this.L$1 = gymSessionEntity6;
                    this.L$2 = list6;
                    this.L$3 = objectRef6;
                    this.L$4 = str6;
                    this.L$5 = null;
                    this.J$0 = j6;
                    this.label = 7;
                    spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                    if (spotifyTimelineForGymSession == coroutine_suspended) {
                    }
                }
                break;
            case 1:
                repository = (Repository) this.L$2;
                currentUser = (FirebaseUser) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                gymSessionById = obj;
                coroutineScope = coroutineScope3;
                gymSessionEntity = (GymSessionEntity) gymSessionById;
                if (gymSessionEntity != null) {
                }
                break;
            case 2:
                long j14 = this.J$0;
                gymSessionEntity2 = (GymSessionEntity) this.L$3;
                repository2 = (Repository) this.L$2;
                FirebaseUser firebaseUser6 = (FirebaseUser) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                longValue = j14;
                currentUser = firebaseUser6;
                obj2 = obj;
                List list82 = (List) obj2;
                objectRef = new Ref.ObjectRef();
                remoteId = gymSessionEntity2.getRemoteId();
                if (remoteId != null) {
                }
                t = 0;
                objectRef.element = t;
                if (objectRef.element == 0) {
                }
                break;
            case 3:
                j2 = this.J$0;
                objectRef3 = (Ref.ObjectRef) this.L$5;
                list2 = (List) this.L$4;
                gymSessionEntity4 = (GymSessionEntity) this.L$3;
                repository3 = (Repository) this.L$2;
                firebaseUser2 = (FirebaseUser) this.L$1;
                ResultKt.throwOnFailure(obj);
                gymSessionEntity3 = gymSessionEntity4;
                firebaseUser = firebaseUser2;
                list = list2;
                j = j2;
                objectRef2 = objectRef3;
                str = "sets";
                str2 = "updatedAtMs";
                localUpdatedMs = GymFirestoreSync.INSTANCE.localUpdatedMs(this.$context, this.$localSessionId);
                boxLong = Boxing.boxLong(localUpdatedMs);
                j3 = 0;
                if (boxLong.longValue() <= 0) {
                }
                if (boxLong != null) {
                }
                Result.Companion companion22 = Result.INSTANCE;
                GymFirestoreSync gymFirestoreSync22 = GymFirestoreSync.INSTANCE;
                String uid22 = firebaseUser.getUid();
                Intrinsics.checkNotNullExpressionValue(uid22, "getUid(...)");
                sessionsCollection = gymFirestoreSync22.sessionsCollection(uid22);
                Task<DocumentSnapshot> task222 = sessionsCollection.document((String) objectRef2.element).get();
                Intrinsics.checkNotNullExpressionValue(task222, "get(...)");
                this.L$0 = firebaseUser;
                this.L$1 = repository3;
                this.L$2 = gymSessionEntity3;
                this.L$3 = list;
                this.L$4 = objectRef2;
                this.L$5 = null;
                this.J$0 = j;
                this.J$1 = longValue2;
                this.label = 4;
                await = TasksKt.await(task222, this);
                if (await == coroutine_suspended) {
                }
                break;
            case 4:
                j4 = this.J$1;
                j = this.J$0;
                objectRef2 = (Ref.ObjectRef) this.L$4;
                list = (List) this.L$3;
                gymSessionEntity3 = (GymSessionEntity) this.L$2;
                Repository repository8 = (Repository) this.L$1;
                FirebaseUser firebaseUser7 = (FirebaseUser) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    str = "sets";
                    str2 = "updatedAtMs";
                    repository4 = repository8;
                    firebaseUser3 = firebaseUser7;
                    j3 = 0;
                    m7905constructorimpl = Result.m7905constructorimpl((DocumentSnapshot) await);
                } catch (Throwable th3) {
                    th = th3;
                    str = "sets";
                    str2 = "updatedAtMs";
                    repository4 = repository8;
                    firebaseUser3 = firebaseUser7;
                    j3 = 0;
                    Result.Companion companion322 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    List list9222 = list;
                    repository5 = repository4;
                    GymSessionEntity gymSessionEntity8222 = gymSessionEntity3;
                    firebaseUser4 = firebaseUser3;
                    long j10222 = j4;
                    list3 = list9222;
                    gymSessionEntity5 = gymSessionEntity8222;
                    objectRef4 = objectRef2;
                    j5 = j;
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    }
                    documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
                    String str8222 = str2;
                    if (documentSnapshot != null) {
                    }
                    GymFirestoreSync gymFirestoreSync3222 = GymFirestoreSync.INSTANCE;
                    if (documentSnapshot != null) {
                    }
                    parseSetRows = gymFirestoreSync3222.parseSetRows(obj3);
                    str4 = str;
                    int i2222 = !list3.isEmpty() ? 1 : 0;
                    str5 = str8222;
                    if (documentSnapshot != null) {
                    }
                    objectRef5 = objectRef4;
                    list5 = list3;
                    gymSessionEntity6 = gymSessionEntity5;
                    repository6 = repository5;
                    firebaseUser5 = firebaseUser4;
                    templateDayId = gymSessionEntity6.getTemplateDayId();
                    if (templateDayId != null) {
                    }
                    list6 = list5;
                    j6 = j5;
                    objectRef6 = objectRef5;
                    str6 = null;
                    this.L$0 = firebaseUser5;
                    this.L$1 = gymSessionEntity6;
                    this.L$2 = list6;
                    this.L$3 = objectRef6;
                    this.L$4 = str6;
                    this.L$5 = null;
                    this.J$0 = j6;
                    this.label = 7;
                    spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                    if (spotifyTimelineForGymSession == coroutine_suspended) {
                    }
                }
                List list92222 = list;
                repository5 = repository4;
                GymSessionEntity gymSessionEntity82222 = gymSessionEntity3;
                firebaseUser4 = firebaseUser3;
                long j102222 = j4;
                list3 = list92222;
                gymSessionEntity5 = gymSessionEntity82222;
                objectRef4 = objectRef2;
                j5 = j;
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                documentSnapshot = (DocumentSnapshot) m7905constructorimpl;
                String str82222 = str2;
                if (documentSnapshot != null) {
                    j3 = l.longValue();
                    break;
                }
                GymFirestoreSync gymFirestoreSync32222 = GymFirestoreSync.INSTANCE;
                if (documentSnapshot != null) {
                }
                parseSetRows = gymFirestoreSync32222.parseSetRows(obj3);
                str4 = str;
                int i22222 = !list3.isEmpty() ? 1 : 0;
                str5 = str82222;
                if (documentSnapshot != null) {
                    GymFirestoreSync gymFirestoreSync42 = GymFirestoreSync.INSTANCE;
                    long j122 = this.$localSessionId;
                    String str92 = (String) objectRef4.element;
                    data = documentSnapshot.getData();
                    if (data != null) {
                    }
                    break;
                }
                objectRef5 = objectRef4;
                list5 = list3;
                gymSessionEntity6 = gymSessionEntity5;
                repository6 = repository5;
                firebaseUser5 = firebaseUser4;
                templateDayId = gymSessionEntity6.getTemplateDayId();
                if (templateDayId != null) {
                }
                list6 = list5;
                j6 = j5;
                objectRef6 = objectRef5;
                str6 = null;
                this.L$0 = firebaseUser5;
                this.L$1 = gymSessionEntity6;
                this.L$2 = list6;
                this.L$3 = objectRef6;
                this.L$4 = str6;
                this.L$5 = null;
                this.J$0 = j6;
                this.label = 7;
                spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                if (spotifyTimelineForGymSession == coroutine_suspended) {
                }
                break;
            case 5:
                i = this.I$0;
                j5 = this.J$0;
                objectRef4 = (Ref.ObjectRef) this.L$4;
                list3 = (List) this.L$3;
                gymSessionEntity5 = (GymSessionEntity) this.L$2;
                repository5 = (Repository) this.L$1;
                firebaseUser4 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = "getUid(...)";
                str4 = "sets";
                str5 = "updatedAtMs";
                if (i == 0) {
                }
                objectRef5 = objectRef4;
                list5 = list3;
                gymSessionEntity6 = gymSessionEntity5;
                repository6 = repository5;
                firebaseUser5 = firebaseUser4;
                templateDayId = gymSessionEntity6.getTemplateDayId();
                if (templateDayId != null) {
                }
                list6 = list5;
                j6 = j5;
                objectRef6 = objectRef5;
                str6 = null;
                this.L$0 = firebaseUser5;
                this.L$1 = gymSessionEntity6;
                this.L$2 = list6;
                this.L$3 = objectRef6;
                this.L$4 = str6;
                this.L$5 = null;
                this.J$0 = j6;
                this.label = 7;
                spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                if (spotifyTimelineForGymSession == coroutine_suspended) {
                }
                break;
            case 6:
                j5 = this.J$0;
                objectRef5 = (Ref.ObjectRef) this.L$4;
                list5 = (List) this.L$3;
                gymSessionEntity6 = (GymSessionEntity) this.L$2;
                repository6 = (Repository) this.L$1;
                firebaseUser5 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = "getUid(...)";
                str5 = "updatedAtMs";
                dayNameForTemplate = obj;
                str4 = "sets";
                str7 = (String) dayNameForTemplate;
                if (str7 != null) {
                    long j132 = j5;
                    objectRef6 = objectRef5;
                    str6 = obj4;
                    list6 = list5;
                    j6 = j132;
                    this.L$0 = firebaseUser5;
                    this.L$1 = gymSessionEntity6;
                    this.L$2 = list6;
                    this.L$3 = objectRef6;
                    this.L$4 = str6;
                    this.L$5 = null;
                    this.J$0 = j6;
                    this.label = 7;
                    spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                    if (spotifyTimelineForGymSession == coroutine_suspended) {
                    }
                    break;
                }
                list6 = list5;
                j6 = j5;
                objectRef6 = objectRef5;
                str6 = null;
                this.L$0 = firebaseUser5;
                this.L$1 = gymSessionEntity6;
                this.L$2 = list6;
                this.L$3 = objectRef6;
                this.L$4 = str6;
                this.L$5 = null;
                this.J$0 = j6;
                this.label = 7;
                spotifyTimelineForGymSession = repository6.spotifyTimelineForGymSession(this.$localSessionId, this);
                if (spotifyTimelineForGymSession == coroutine_suspended) {
                }
                break;
            case 7:
                long j15 = this.J$0;
                str6 = (String) this.L$4;
                objectRef6 = (Ref.ObjectRef) this.L$3;
                List list11 = (List) this.L$2;
                GymSessionEntity gymSessionEntity9 = (GymSessionEntity) this.L$1;
                FirebaseUser firebaseUser8 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = "getUid(...)";
                str5 = "updatedAtMs";
                gymSessionEntity7 = gymSessionEntity9;
                list7 = list11;
                firebaseUser5 = firebaseUser8;
                j7 = j15;
                spotifyTimelineForGymSession = obj;
                str4 = "sets";
                ArrayList arrayList6 = new ArrayList();
                it = ((Iterable) spotifyTimelineForGymSession).iterator();
                while (it.hasNext()) {
                }
                obj5 = coroutine_suspended;
                ArrayList<SpotifyTimelineEntity> arrayList22 = arrayList6;
                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
                while (r8.hasNext()) {
                }
                ArrayList arrayList42 = arrayList32;
                long currentTimeMillis2 = System.currentTimeMillis();
                List<GymSetEntity> list102 = list7;
                ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list102, 10));
                while (r5.hasNext()) {
                }
                HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("localSessionId", Boxing.boxLong(this.$localSessionId)), TuplesKt.to("startedAtMs", Boxing.boxLong(gymSessionEntity7.getStartedAtMs())), TuplesKt.to("endedAtMs", Boxing.boxLong(j7)), TuplesKt.to("templateDayId", gymSessionEntity7.getTemplateDayId()), TuplesKt.to("templateDayName", str6), TuplesKt.to("mediaTimeline", arrayList42), TuplesKt.to("freeDay", Boxing.boxBoolean(gymSessionEntity7.getFreeDay())), TuplesKt.to("notes", gymSessionEntity7.getNotes()), TuplesKt.to("ambientTag", gymSessionEntity7.getAmbientTag()), TuplesKt.to("ambientTagCustom", gymSessionEntity7.getAmbientTagCustom()), TuplesKt.to(str5, Boxing.boxLong(currentTimeMillis2)), TuplesKt.to(str4, arrayList52));
                GymFirestoreSync gymFirestoreSync52 = GymFirestoreSync.INSTANCE;
                String uid32 = firebaseUser5.getUid();
                Intrinsics.checkNotNullExpressionValue(uid32, str3);
                sessionsCollection2 = gymFirestoreSync52.sessionsCollection(uid32);
                task = sessionsCollection2.document((String) objectRef6.element).set(hashMapOf2);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = currentTimeMillis2;
                this.label = 8;
                if (TasksKt.await(task, this) != obj5) {
                }
                break;
            case 8:
                j8 = this.J$0;
                ResultKt.throwOnFailure(obj);
                this.$context.getSharedPreferences("cloud_sync", 0).edit().putLong("gym_local_updated_" + this.$localSessionId, j8).apply();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
