package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.RemoteGymSetRow;
import com.example.rungps.data.Repository;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u0011J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0018J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ<\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H\u0082@¢\u0006\u0002\u0010\"J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\rH\u0002J\u001a\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006)"}, d2 = {"Lcom/example/rungps/sync/GymFirestoreSync;", "", "<init>", "()V", "sessionsCollection", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pushFinishedSession", "", "context", "Landroid/content/Context;", "localSessionId", "", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRemoteSession", "remoteId", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullWithConflictResolution", "", "localUpdatedMs", "Lkotlin/Function2;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullIntoRoom", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushAllFinishedSessions", "errors", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyRemoteDocToLocal", "repo", "Lcom/example/rungps/data/Repository;", "data", "", "(Lcom/example/rungps/data/Repository;JLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ctx", "sessionId", "parseSetRows", "", "Lcom/example/rungps/data/RemoteGymSetRow;", "raw", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymFirestoreSync {
    public static final int $stable = 0;
    public static final GymFirestoreSync INSTANCE = new GymFirestoreSync();

    private GymFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference sessionsCollection(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("gym_sessions");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pushFinishedSession(Context context, long j, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new GymFirestoreSync$pushFinishedSession$2(context, j, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object deleteRemoteSession(Context context, String str, Continuation<Object> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymFirestoreSync$deleteRemoteSession$2(str, null), continuation);
    }

    public final Object pullWithConflictResolution(Context context, Function2<? super Context, ? super Long, Long> function2, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymFirestoreSync$pullWithConflictResolution$2(context, function2, null), continuation);
    }

    public final Object pullIntoRoom(Context context, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymFirestoreSync$pullIntoRoom$2(context, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object pushAllFinishedSessions$default(GymFirestoreSync gymFirestoreSync, Context context, List list, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return gymFirestoreSync.pushAllFinishedSessions(context, list, continuation);
    }

    public final Object pushAllFinishedSessions(Context context, List<String> list, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymFirestoreSync$pushAllFinishedSessions$2(context, list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyRemoteDocToLocal(Repository repository, long j, String str, Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        GymFirestoreSync$applyRemoteDocToLocal$1 gymFirestoreSync$applyRemoteDocToLocal$1;
        Object coroutine_suspended;
        int i;
        Repository repository2;
        long j2;
        String str2;
        String str3;
        if (continuation instanceof GymFirestoreSync$applyRemoteDocToLocal$1) {
            gymFirestoreSync$applyRemoteDocToLocal$1 = (GymFirestoreSync$applyRemoteDocToLocal$1) continuation;
            if ((gymFirestoreSync$applyRemoteDocToLocal$1.label & Integer.MIN_VALUE) != 0) {
                gymFirestoreSync$applyRemoteDocToLocal$1.label -= Integer.MIN_VALUE;
                Object obj = gymFirestoreSync$applyRemoteDocToLocal$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymFirestoreSync$applyRemoteDocToLocal$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<RemoteGymSetRow> parseSetRows = parseSetRows(map.get("sets"));
                    if (parseSetRows == null) {
                        return Unit.INSTANCE;
                    }
                    gymFirestoreSync$applyRemoteDocToLocal$1.L$0 = repository;
                    gymFirestoreSync$applyRemoteDocToLocal$1.L$1 = str;
                    gymFirestoreSync$applyRemoteDocToLocal$1.L$2 = map;
                    gymFirestoreSync$applyRemoteDocToLocal$1.J$0 = j;
                    gymFirestoreSync$applyRemoteDocToLocal$1.label = 1;
                    if (repository.replaceGymSessionSets(j, parseSetRows, gymFirestoreSync$applyRemoteDocToLocal$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        long j3 = gymFirestoreSync$applyRemoteDocToLocal$1.J$0;
                        Map<String, ? extends Object> map2 = (Map) gymFirestoreSync$applyRemoteDocToLocal$1.L$1;
                        Repository repository3 = (Repository) gymFirestoreSync$applyRemoteDocToLocal$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        map = map2;
                        j2 = j3;
                        repository2 = repository3;
                        Object obj2 = map.get("ambientTag");
                        str2 = !(obj2 instanceof String) ? (String) obj2 : null;
                        Object obj3 = map.get("ambientTagCustom");
                        str3 = !(obj3 instanceof String) ? (String) obj3 : null;
                        if (str2 == null || str3 != null) {
                            gymFirestoreSync$applyRemoteDocToLocal$1.L$0 = null;
                            gymFirestoreSync$applyRemoteDocToLocal$1.L$1 = null;
                            gymFirestoreSync$applyRemoteDocToLocal$1.label = 3;
                            if (repository2.setGymAmbientTagFromRemote(j2, str2, str3, gymFirestoreSync$applyRemoteDocToLocal$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    j = gymFirestoreSync$applyRemoteDocToLocal$1.J$0;
                    map = (Map) gymFirestoreSync$applyRemoteDocToLocal$1.L$2;
                    str = (String) gymFirestoreSync$applyRemoteDocToLocal$1.L$1;
                    repository = (Repository) gymFirestoreSync$applyRemoteDocToLocal$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                gymFirestoreSync$applyRemoteDocToLocal$1.L$0 = repository;
                gymFirestoreSync$applyRemoteDocToLocal$1.L$1 = map;
                gymFirestoreSync$applyRemoteDocToLocal$1.L$2 = null;
                gymFirestoreSync$applyRemoteDocToLocal$1.J$0 = j;
                gymFirestoreSync$applyRemoteDocToLocal$1.label = 2;
                if (repository.setGymSessionRemoteId(j, str, gymFirestoreSync$applyRemoteDocToLocal$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository2 = repository;
                j2 = j;
                Object obj22 = map.get("ambientTag");
                if (!(obj22 instanceof String)) {
                }
                Object obj32 = map.get("ambientTagCustom");
                if (!(obj32 instanceof String)) {
                }
                if (str2 == null) {
                }
                gymFirestoreSync$applyRemoteDocToLocal$1.L$0 = null;
                gymFirestoreSync$applyRemoteDocToLocal$1.L$1 = null;
                gymFirestoreSync$applyRemoteDocToLocal$1.label = 3;
                if (repository2.setGymAmbientTagFromRemote(j2, str2, str3, gymFirestoreSync$applyRemoteDocToLocal$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        gymFirestoreSync$applyRemoteDocToLocal$1 = new GymFirestoreSync$applyRemoteDocToLocal$1(this, continuation);
        Object obj4 = gymFirestoreSync$applyRemoteDocToLocal$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymFirestoreSync$applyRemoteDocToLocal$1.label;
        if (i != 0) {
        }
        gymFirestoreSync$applyRemoteDocToLocal$1.L$0 = repository;
        gymFirestoreSync$applyRemoteDocToLocal$1.L$1 = map;
        gymFirestoreSync$applyRemoteDocToLocal$1.L$2 = null;
        gymFirestoreSync$applyRemoteDocToLocal$1.J$0 = j;
        gymFirestoreSync$applyRemoteDocToLocal$1.label = 2;
        if (repository.setGymSessionRemoteId(j, str, gymFirestoreSync$applyRemoteDocToLocal$1) != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long localUpdatedMs(Context ctx, long sessionId) {
        return ctx.getSharedPreferences("cloud_sync", 0).getLong("gym_local_updated_" + sessionId, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RemoteGymSetRow> parseSetRows(Object raw) {
        String obj;
        List list = raw instanceof List ? (List) raw : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj2 : list) {
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            if (map == null) {
                return null;
            }
            Object obj3 = map.get("exerciseName");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str != null && (obj = StringsKt.trim((CharSequence) str).toString()) != null) {
                String str2 = obj.length() > 0 ? obj : null;
                if (str2 != null) {
                    Object obj4 = map.get("setIndex");
                    Number number = obj4 instanceof Number ? (Number) obj4 : null;
                    if (number != null) {
                        int intValue = number.intValue();
                        Object obj5 = map.get("reps");
                        Integer valueOf = (obj5 != null && (obj5 instanceof Number)) ? Integer.valueOf(((Number) obj5).intValue()) : null;
                        Object obj6 = map.get("weightKg");
                        Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
                        if (number2 != null) {
                            double doubleValue = number2.doubleValue();
                            Object obj7 = map.get("loggedAtMs");
                            Number number3 = obj7 instanceof Number ? (Number) obj7 : null;
                            Long valueOf2 = number3 != null ? Long.valueOf(number3.longValue()) : null;
                            Object obj8 = map.get("rpeBorg");
                            arrayList.add(new RemoteGymSetRow(str2, intValue, valueOf, doubleValue, valueOf2, (obj8 != null && (obj8 instanceof Number)) ? Integer.valueOf(((Number) obj8).intValue()) : null));
                        }
                    }
                }
            }
            return null;
        }
        return arrayList;
    }
}
