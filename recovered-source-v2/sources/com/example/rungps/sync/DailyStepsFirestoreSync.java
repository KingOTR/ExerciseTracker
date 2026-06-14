package com.example.rungps.sync;

import android.content.Context;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DailyStepsFirestoreSync.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sync/DailyStepsFirestoreSync;", "", "<init>", "()V", "col", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pushDay", "", "context", "Landroid/content/Context;", "epochDay", "", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushRecent", "", "daysBack", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DailyStepsFirestoreSync {
    public static final int $stable = 0;
    public static final DailyStepsFirestoreSync INSTANCE = new DailyStepsFirestoreSync();

    private DailyStepsFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference col(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("daily_steps");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pushDay(Context context, long j, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new DailyStepsFirestoreSync$pushDay$2(context, j, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public static /* synthetic */ Object pushRecent$default(DailyStepsFirestoreSync dailyStepsFirestoreSync, Context context, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        return dailyStepsFirestoreSync.pushRecent(context, i, continuation);
    }

    public final Object pushRecent(Context context, int i, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DailyStepsFirestoreSync$pushRecent$2(context, i, null), continuation);
    }
}
