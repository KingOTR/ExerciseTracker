package com.example.rungps.ui.gear;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.gear.GearAdvice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GearAdviceCards.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gear.GearAdviceCardsKt$GearAdviceSection$1$1", f = "GearAdviceCards.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GearAdviceCardsKt$GearAdviceSection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<GearAdvice.Advice>> $advice$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ int $maxCards;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GearAdviceCardsKt$GearAdviceSection$1$1(Context context, int i, MutableState<List<GearAdvice.Advice>> mutableState, Continuation<? super GearAdviceCardsKt$GearAdviceSection$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$maxCards = i;
        this.$advice$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GearAdviceCardsKt$GearAdviceSection$1$1(this.$ctx, this.$maxCards, this.$advice$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GearAdviceCardsKt$GearAdviceSection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GearAdviceCards.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/gear/GearAdvice$Advice;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gear.GearAdviceCardsKt$GearAdviceSection$1$1$1", f = "GearAdviceCards.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gear.GearAdviceCardsKt$GearAdviceSection$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends GearAdvice.Advice>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ int $maxCards;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$maxCards = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$maxCards, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends GearAdvice.Advice>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<GearAdvice.Advice>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<GearAdvice.Advice>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = Repository.INSTANCE.get(this.$ctx).gearAdvice(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (((GearAdvice.Advice) obj2).getUrgency() != GearAdvice.Urgency.GOOD) {
                    arrayList.add(obj2);
                }
            }
            return CollectionsKt.take(arrayList, this.$maxCards);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<List<GearAdvice.Advice>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<List<GearAdvice.Advice>> mutableState2 = this.$advice$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$maxCards, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
