package com.example.rungps.ui.tabs;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "", "", "Lcom/example/rungps/data/GymSetEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1", f = "RecoveryTab.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Long, ? extends List<? extends GymSetEntity>>>, Object> {
    final /* synthetic */ List<GymSessionEntity> $recent;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1(Repository repository, List<GymSessionEntity> list, Continuation<? super RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$recent = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1(this.$repo, this.$recent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Long, ? extends List<? extends GymSetEntity>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<Long, ? extends List<GymSetEntity>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<Long, ? extends List<GymSetEntity>>> continuation) {
        return ((RecoveryTabKt$RecoveryTab$6$1$1$1$setsMap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            List<GymSessionEntity> list = this.$recent;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
            }
            this.label = 1;
            obj = repository.setsForSessionsGrouped(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
