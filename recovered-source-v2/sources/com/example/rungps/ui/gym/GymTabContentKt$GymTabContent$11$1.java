package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymDayTemplateEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$11$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
    final /* synthetic */ MutableState<GymDayTemplateEntity> $nextSplitDay$delegate;
    final /* synthetic */ MutableState<Long> $selectedSplitDayId$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$11$1(MutableState<List<GymDayTemplateEntity>> mutableState, MutableState<Long> mutableState2, MutableState<GymDayTemplateEntity> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$11$1> continuation) {
        super(2, continuation);
        this.$dayOptions$delegate = mutableState;
        this.$selectedSplitDayId$delegate = mutableState2;
        this.$nextSplitDay$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$11$1(this.$dayOptions$delegate, this.$selectedSplitDayId$delegate, this.$nextSplitDay$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r0 == null) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$50;
        Long GymTabContent$lambda$54;
        GymDayTemplateEntity GymTabContent$lambda$32;
        List GymTabContent$lambda$502;
        List GymTabContent$lambda$503;
        List GymTabContent$lambda$504;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$50 = GymTabContentKt.GymTabContent$lambda$50(this.$dayOptions$delegate);
            Long l = null;
            if (!GymTabContent$lambda$50.isEmpty()) {
                GymTabContent$lambda$54 = GymTabContentKt.GymTabContent$lambda$54(this.$selectedSplitDayId$delegate);
                if (GymTabContent$lambda$54 != null) {
                    GymTabContent$lambda$504 = GymTabContentKt.GymTabContent$lambda$50(this.$dayOptions$delegate);
                    List list = GymTabContent$lambda$504;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            long id = ((GymDayTemplateEntity) it.next()).getId();
                            if (GymTabContent$lambda$54 != null && id == GymTabContent$lambda$54.longValue()) {
                                break;
                            }
                        }
                    }
                }
                MutableState<Long> mutableState = this.$selectedSplitDayId$delegate;
                GymTabContent$lambda$32 = GymTabContentKt.GymTabContent$lambda$32(this.$nextSplitDay$delegate);
                if (GymTabContent$lambda$32 != null) {
                    Long boxLong = Boxing.boxLong(GymTabContent$lambda$32.getId());
                    MutableState<List<GymDayTemplateEntity>> mutableState2 = this.$dayOptions$delegate;
                    long longValue = boxLong.longValue();
                    GymTabContent$lambda$503 = GymTabContentKt.GymTabContent$lambda$50(mutableState2);
                    List list2 = GymTabContent$lambda$503;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((GymDayTemplateEntity) it2.next()).getId() == longValue) {
                                l = boxLong;
                                break;
                            }
                        }
                    }
                }
                GymTabContent$lambda$502 = GymTabContentKt.GymTabContent$lambda$50(this.$dayOptions$delegate);
                l = Boxing.boxLong(((GymDayTemplateEntity) CollectionsKt.first(GymTabContent$lambda$502)).getId());
                mutableState.setValue(l);
                return Unit.INSTANCE;
            }
            this.$selectedSplitDayId$delegate.setValue(null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
