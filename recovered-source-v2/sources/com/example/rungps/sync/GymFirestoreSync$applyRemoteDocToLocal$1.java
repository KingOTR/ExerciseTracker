package com.example.rungps.sync;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymFirestoreSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync", f = "GymFirestoreSync.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {ComposerKt.referenceKey, ComposerKt.reuseKey, 211}, m = "applyRemoteDocToLocal", n = {"repo", "remoteId", "data", "localSessionId", "repo", "data", "localSessionId"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class GymFirestoreSync$applyRemoteDocToLocal$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GymFirestoreSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymFirestoreSync$applyRemoteDocToLocal$1(GymFirestoreSync gymFirestoreSync, Continuation<? super GymFirestoreSync$applyRemoteDocToLocal$1> continuation) {
        super(continuation);
        this.this$0 = gymFirestoreSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object applyRemoteDocToLocal;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        applyRemoteDocToLocal = this.this$0.applyRemoteDocToLocal(null, 0L, null, null, this);
        return applyRemoteDocToLocal;
    }
}
