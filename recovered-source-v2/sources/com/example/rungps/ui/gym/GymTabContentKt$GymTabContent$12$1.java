package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymDayTemplateEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$12$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
    final /* synthetic */ MutableState<GymDayTemplateEntity> $nextSplitDay$delegate;
    final /* synthetic */ Long $openSessionId;
    final /* synthetic */ MutableState<Long> $selectedSplitDayId$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$12$1(Long l, MutableState<GymDayTemplateEntity> mutableState, MutableState<List<GymDayTemplateEntity>> mutableState2, MutableState<Long> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$12$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$nextSplitDay$delegate = mutableState;
        this.$dayOptions$delegate = mutableState2;
        this.$selectedSplitDayId$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$12$1(this.$openSessionId, this.$nextSplitDay$delegate, this.$dayOptions$delegate, this.$selectedSplitDayId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r6 = com.example.rungps.ui.gym.GymTabContentKt.GymTabContent$lambda$32(r5.$nextSplitDay$delegate);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GymDayTemplateEntity GymTabContent$lambda$32;
        List GymTabContent$lambda$50;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$openSessionId == null && GymTabContent$lambda$32 != null) {
            Long boxLong = Boxing.boxLong(GymTabContent$lambda$32.getId());
            MutableState<List<GymDayTemplateEntity>> mutableState = this.$dayOptions$delegate;
            long longValue = boxLong.longValue();
            GymTabContent$lambda$50 = GymTabContentKt.GymTabContent$lambda$50(mutableState);
            List list = GymTabContent$lambda$50;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((GymDayTemplateEntity) it.next()).getId() == longValue) {
                        break;
                    }
                }
            }
            boxLong = null;
            if (boxLong != null) {
                this.$selectedSplitDayId$delegate.setValue(Boxing.boxLong(boxLong.longValue()));
            }
        }
        return Unit.INSTANCE;
    }
}
