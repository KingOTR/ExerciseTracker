package com.example.rungps.data.repo;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {153, 155, 165, 173, 182, 183}, m = "importMoyoungCardio", n = {"this", NotificationCompat.CATEGORY_WORKOUT, "watchId", "this", NotificationCompat.CATEGORY_WORKOUT, "watchId", "distM", "this", NotificationCompat.CATEGORY_WORKOUT, "distM", "durationMs", "endMs", "this", NotificationCompat.CATEGORY_WORKOUT, "runId", "this", NotificationCompat.CATEGORY_WORKOUT, "runId"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "D$0", "L$0", "L$1", "D$0", "J$0", "J$1", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RunRepository$importMoyoungCardio$1 extends ContinuationImpl {
    double D$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$importMoyoungCardio$1(RunRepository runRepository, Continuation<? super RunRepository$importMoyoungCardio$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.importMoyoungCardio(null, this);
    }
}
