package com.example.rungps.sync;

import android.content.Context;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: StravaPbFirestoreSync.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/example/rungps/sync/StravaPbFirestoreSync;", "", "<init>", "()V", "col", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pushAll", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaPbFirestoreSync {
    public static final int $stable = 0;
    public static final StravaPbFirestoreSync INSTANCE = new StravaPbFirestoreSync();

    private StravaPbFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference col(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("strava_pbs");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pushAll(Context context, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new StravaPbFirestoreSync$pushAll$2(context, null), continuation);
    }
}
