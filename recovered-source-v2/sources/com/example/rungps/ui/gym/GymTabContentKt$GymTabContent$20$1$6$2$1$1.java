package com.example.rungps.ui.gym;

import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$6$2$1$1", f = "GymTabContent.kt", i = {}, l = {455}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$6$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ List<SplitExerciseEditRow> $rows;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$6$2$1$1(List<SplitExerciseEditRow> list, Repository repository, Continuation<? super GymTabContentKt$GymTabContent$20$1$6$2$1$1> continuation) {
        super(2, continuation);
        this.$rows = list;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$6$2$1$1(this.$rows, this.$repo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$6$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<SplitExerciseEditRow> list = this.$rows;
            ArrayList arrayList = new ArrayList();
            for (SplitExerciseEditRow splitExerciseEditRow : list) {
                Integer intOrNull = StringsKt.toIntOrNull(splitExerciseEditRow.getDefaultSets());
                Triple triple = null;
                if (intOrNull != null) {
                    int coerceIn = RangesKt.coerceIn(intOrNull.intValue(), 1, 10);
                    String obj2 = StringsKt.trim((CharSequence) splitExerciseEditRow.getName()).toString();
                    if (obj2.length() != 0) {
                        triple = new Triple(Boxing.boxLong(splitExerciseEditRow.getTemplateId()), obj2, Boxing.boxInt(coerceIn));
                    }
                }
                if (triple != null) {
                    arrayList.add(triple);
                }
            }
            Repository repository = this.$repo;
            this.label = 1;
            if (repository.updateSplitExerciseTemplates(arrayList, this) == coroutine_suspended) {
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
