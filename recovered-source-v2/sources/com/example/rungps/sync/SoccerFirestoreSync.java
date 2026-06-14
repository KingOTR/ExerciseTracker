package com.example.rungps.sync;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import com.example.rungps.data.SoccerSessionEntity;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SoccerFirestoreSync.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sync/SoccerFirestoreSync;", "", "<init>", "()V", "col", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pushSession", "", "session", "Lcom/example/rungps/data/SoccerSessionEntity;", "(Lcom/example/rungps/data/SoccerSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushRecent", "", "context", "Landroid/content/Context;", "limit", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerFirestoreSync {
    public static final int $stable = 0;
    public static final SoccerFirestoreSync INSTANCE = new SoccerFirestoreSync();

    private SoccerFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference col(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("soccer_sessions");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pushSession(SoccerSessionEntity soccerSessionEntity, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SoccerFirestoreSync$pushSession$2(soccerSessionEntity, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public static /* synthetic */ Object pushRecent$default(SoccerFirestoreSync soccerFirestoreSync, Context context, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = MenuKt.InTransitionDuration;
        }
        return soccerFirestoreSync.pushRecent(context, i, continuation);
    }

    public final Object pushRecent(Context context, int i, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SoccerFirestoreSync$pushRecent$2(context, i, null), continuation);
    }
}
