package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecoveryFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RecoveryFirestoreSync$pushRecent$2", f = "RecoveryFirestoreSync.kt", i = {0, 1, 1}, l = {37, 41}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "n"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class RecoveryFirestoreSync$pushRecent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $daysBack;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryFirestoreSync$pushRecent$2(int i, Context context, Continuation<? super RecoveryFirestoreSync$pushRecent$2> continuation) {
        super(2, continuation);
        this.$daysBack = i;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecoveryFirestoreSync$pushRecent$2 recoveryFirestoreSync$pushRecent$2 = new RecoveryFirestoreSync$pushRecent$2(this.$daysBack, this.$context, continuation);
        recoveryFirestoreSync$pushRecent$2.L$0 = obj;
        return recoveryFirestoreSync$pushRecent$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((RecoveryFirestoreSync$pushRecent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0095 -> B:8:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ref.IntRef intRef;
        CoroutineScope coroutineScope2;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                return Boxing.boxInt(0);
            }
            long currentTimeMillis = System.currentTimeMillis() - (this.$daysBack * 86400000);
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$context).recoverySince(currentTimeMillis, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            intRef = (Ref.IntRef) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            int i2 = intRef.element;
            intRef.element = i2 + 1;
            Result.m7905constructorimpl(Boxing.boxInt(i2));
            if (it.hasNext()) {
                RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) it.next();
                Result.Companion companion2 = Result.INSTANCE;
                RecoveryFirestoreSync recoveryFirestoreSync = RecoveryFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = intRef;
                this.L$2 = it;
                this.label = 2;
                if (recoveryFirestoreSync.pushEvent(recoveryEventEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i22 = intRef.element;
                intRef.element = i22 + 1;
                Result.m7905constructorimpl(Boxing.boxInt(i22));
                if (it.hasNext()) {
                    return Boxing.boxInt(intRef.element);
                }
            }
        }
        intRef = new Ref.IntRef();
        coroutineScope2 = coroutineScope;
        it = ((List) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
