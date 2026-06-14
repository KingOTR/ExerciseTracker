package com.example.rungps.data;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5}, l = {1960, 1962, 1964, 1966, 1966, 1968}, m = "recordRecoveryEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "id", "this", NotificationCompat.CATEGORY_EVENT, "id", "id"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
/* loaded from: classes3.dex */
final class Repository$recordRecoveryEvent$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$recordRecoveryEvent$1(Repository repository, Continuation<? super Repository$recordRecoveryEvent$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.recordRecoveryEvent(null, this);
    }
}
