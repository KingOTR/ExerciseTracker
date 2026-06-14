package com.example.rungps.sync;

import android.content.Context;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RouteFirestoreSync.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sync/RouteFirestoreSync;", "", "<init>", "()V", "col", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pullIntoRoom", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushRoute", "localRouteId", "", "remoteId", "(Landroid/content/Context;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushAllRoutes", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteFirestoreSync {
    public static final int $stable = 0;
    public static final RouteFirestoreSync INSTANCE = new RouteFirestoreSync();

    private RouteFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference col(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("saved_routes");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pullIntoRoom(Context context, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RouteFirestoreSync$pullIntoRoom$2(context, null), continuation);
    }

    public static /* synthetic */ Object pushRoute$default(RouteFirestoreSync routeFirestoreSync, Context context, long j, String str, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return routeFirestoreSync.pushRoute(context, j, str, continuation);
    }

    public final Object pushRoute(Context context, long j, String str, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RouteFirestoreSync$pushRoute$2(context, j, str, null), continuation);
    }

    public final Object pushAllRoutes(Context context, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RouteFirestoreSync$pushAllRoutes$2(context, null), continuation);
    }
}
