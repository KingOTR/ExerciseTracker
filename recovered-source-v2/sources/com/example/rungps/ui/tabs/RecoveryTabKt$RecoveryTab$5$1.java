package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableIntState;
import com.example.rungps.data.RecoveryEventEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$5$1", f = "RecoveryTab.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RecoveryEventEntity> $active;
    final /* synthetic */ MutableIntState $recoveryTick$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$5$1(List<RecoveryEventEntity> list, MutableIntState mutableIntState, Continuation<? super RecoveryTabKt$RecoveryTab$5$1> continuation) {
        super(2, continuation);
        this.$active = list;
        this.$recoveryTick$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$5$1(this.$active, this.$recoveryTick$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0053 -> B:5:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<RecoveryEventEntity> list;
        Iterator<T> it;
        int RecoveryTab$lambda$29;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = this.$active;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RecoveryTab$lambda$29 = RecoveryTabKt.RecoveryTab$lambda$29(this.$recoveryTick$delegate);
        this.$recoveryTick$delegate.setIntValue(RecoveryTab$lambda$29 + 1);
        list = this.$active;
        if ((list instanceof Collection) || !list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                if (((RecoveryEventEntity) it.next()).getEndsAtMs() > System.currentTimeMillis()) {
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    RecoveryTab$lambda$29 = RecoveryTabKt.RecoveryTab$lambda$29(this.$recoveryTick$delegate);
                    this.$recoveryTick$delegate.setIntValue(RecoveryTab$lambda$29 + 1);
                    list = this.$active;
                    if (list instanceof Collection) {
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
