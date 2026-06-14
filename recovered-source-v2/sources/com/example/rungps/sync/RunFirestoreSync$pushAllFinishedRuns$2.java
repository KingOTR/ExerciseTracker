package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RunFirestoreSync$pushAllFinishedRuns$2", f = "RunFirestoreSync.kt", i = {0, 0, 1, 1, 1}, l = {148, 150}, m = "invokeSuspend", n = {"$this$withContext", "n", "$this$withContext", "run", "n"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class RunFirestoreSync$pushAllFinishedRuns$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<String> $errors;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunFirestoreSync$pushAllFinishedRuns$2(Context context, List<String> list, Continuation<? super RunFirestoreSync$pushAllFinishedRuns$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$errors = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunFirestoreSync$pushAllFinishedRuns$2 runFirestoreSync$pushAllFinishedRuns$2 = new RunFirestoreSync$pushAllFinishedRuns$2(this.$context, this.$errors, continuation);
        runFirestoreSync$pushAllFinishedRuns$2.L$0 = obj;
        return runFirestoreSync$pushAllFinishedRuns$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((RunFirestoreSync$pushAllFinishedRuns$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009b -> B:8:0x009e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        Iterator it;
        CoroutineScope coroutineScope2;
        Object m7905constructorimpl;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                return Boxing.boxInt(0);
            }
            this.L$0 = coroutineScope3;
            this.I$0 = 0;
            this.label = 1;
            Object allRuns = Repository.INSTANCE.get(this.$context).allRuns(this);
            if (allRuns == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope3;
            obj = allRuns;
            i = 0;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                RunEntity runEntity = (RunEntity) this.L$2;
                it = (Iterator) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                    Boxing.boxInt(i);
                    i++;
                } else {
                    List<String> list = this.$errors;
                    if (list != null) {
                        long id = runEntity.getId();
                        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                        if (m7908exceptionOrNullimpl == null || (str = m7908exceptionOrNullimpl.getMessage()) == null) {
                            str = "push failed";
                        }
                        Boxing.boxBoolean(list.add("run #" + id + ": " + str));
                    }
                }
                while (it.hasNext()) {
                    runEntity = (RunEntity) it.next();
                    if (runEntity.getEndedAtMs() != null) {
                        Context context = this.$context;
                        Result.Companion companion2 = Result.INSTANCE;
                        RunFirestoreSync runFirestoreSync = RunFirestoreSync.INSTANCE;
                        long id2 = runEntity.getId();
                        this.L$0 = coroutineScope2;
                        this.L$1 = it;
                        this.L$2 = runEntity;
                        this.I$0 = i;
                        this.label = 2;
                        if (runFirestoreSync.pushFinishedRun(context, id2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                        if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                        }
                        while (it.hasNext()) {
                        }
                    }
                }
                return Boxing.boxInt(i);
            }
            i = this.I$0;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        it = ((List) obj).iterator();
        coroutineScope2 = coroutineScope;
        while (it.hasNext()) {
        }
        return Boxing.boxInt(i);
    }
}
