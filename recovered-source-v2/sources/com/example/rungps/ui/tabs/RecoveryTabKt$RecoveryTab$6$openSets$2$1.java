package com.example.rungps.ui.tabs;

import androidx.compose.runtime.ProduceStateScope;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Lcom/example/rungps/data/GymSetEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$openSets$2$1", f = "RecoveryTab.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$openSets$2$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends GymSetEntity>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $openSessionId;
    final /* synthetic */ Repository $repo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$6$openSets$2$1(Long l, Repository repository, Continuation<? super RecoveryTabKt$RecoveryTab$6$openSets$2$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecoveryTabKt$RecoveryTab$6$openSets$2$1 recoveryTabKt$RecoveryTab$6$openSets$2$1 = new RecoveryTabKt$RecoveryTab$6$openSets$2$1(this.$openSessionId, this.$repo, continuation);
        recoveryTabKt$RecoveryTab$6$openSets$2$1.L$0 = obj;
        return recoveryTabKt$RecoveryTab$6$openSets$2$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProduceStateScope<List<GymSetEntity>> produceStateScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$6$openSets$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProduceStateScope<List<? extends GymSetEntity>> produceStateScope, Continuation<? super Unit> continuation) {
        return invoke2((ProduceStateScope<List<GymSetEntity>>) produceStateScope, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            Long l = this.$openSessionId;
            if (l == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (this.$repo.setsForSessionFlow(l.longValue()).collect(new FlowCollector() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$openSets$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<GymSetEntity>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<GymSetEntity> list, Continuation<? super Unit> continuation) {
                    produceStateScope.setValue(list);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
