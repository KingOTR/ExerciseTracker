package androidx.paging;

import androidx.health.connect.client.records.ExerciseSegment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SingleRunner.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$1(SingleRunner singleRunner, Continuation<? super SingleRunner$runInIsolation$1> continuation) {
        super(continuation);
        this.this$0 = singleRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runInIsolation(0, null, this);
    }
}
