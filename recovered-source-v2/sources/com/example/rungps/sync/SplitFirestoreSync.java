package com.example.rungps.sync;

import android.content.Context;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SplitFirestoreSync.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/sync/SplitFirestoreSync;", "", "<init>", "()V", "PREFS", "", "KEY_SPLIT_UPDATED", "doc", "Lcom/google/firebase/firestore/DocumentReference;", "uid", "pullIntoRoom", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushFromRoom", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitFirestoreSync {
    public static final int $stable = 0;
    public static final SplitFirestoreSync INSTANCE = new SplitFirestoreSync();
    private static final String KEY_SPLIT_UPDATED = "cloud_split_updated_ms";
    private static final String PREFS = "cloud_sync";

    private SplitFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentReference doc(String uid) {
        DocumentReference document = FirebaseFirestore.getInstance().collection("users").document(uid).collection("gym_config").document("active_split");
        Intrinsics.checkNotNullExpressionValue(document, "document(...)");
        return document;
    }

    public final Object pullIntoRoom(Context context, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SplitFirestoreSync$pullIntoRoom$2(context, null), continuation);
    }

    public final Object pushFromRoom(Context context, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SplitFirestoreSync$pushFromRoom$2(context, null), continuation);
    }
}
