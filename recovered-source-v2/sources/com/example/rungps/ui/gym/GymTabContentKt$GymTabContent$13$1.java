package com.example.rungps.ui.gym;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.gym.GymSplitCycleTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$13$1", f = "GymTabContent.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$13$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
    final /* synthetic */ MutableState<Set<Long>> $pendingSplitDayIds$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$13$1(MutableState<Long> mutableState, Context context, MutableState<List<GymDayTemplateEntity>> mutableState2, MutableState<Set<Long>> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$13$1> continuation) {
        super(2, continuation);
        this.$activeSplitId$delegate = mutableState;
        this.$ctx = context;
        this.$dayOptions$delegate = mutableState2;
        this.$pendingSplitDayIds$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$13$1(this.$activeSplitId$delegate, this.$ctx, this.$dayOptions$delegate, this.$pendingSplitDayIds$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long GymTabContent$lambda$29;
        MutableState<Set<Long>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(this.$activeSplitId$delegate);
            if (GymTabContent$lambda$29 == null) {
                return Unit.INSTANCE;
            }
            long longValue = GymTabContent$lambda$29.longValue();
            MutableState<Set<Long>> mutableState2 = this.$pendingSplitDayIds$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, longValue, this.$dayOptions$delegate, null), this);
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
        mutableState.setValue((Set) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$13$1$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$13$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends Long>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
        final /* synthetic */ long $spId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, long j, MutableState<List<GymDayTemplateEntity>> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$spId = j;
            this.$dayOptions$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$spId, this.$dayOptions$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Set<? extends Long>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Set<Long>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Set<Long>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<GymDayTemplateEntity> GymTabContent$lambda$50;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GymSplitCycleTracker gymSplitCycleTracker = GymSplitCycleTracker.INSTANCE;
            Context context = this.$ctx;
            long j = this.$spId;
            GymTabContent$lambda$50 = GymTabContentKt.GymTabContent$lambda$50(this.$dayOptions$delegate);
            List<GymDayTemplateEntity> pendingDays = gymSplitCycleTracker.pendingDays(context, j, GymTabContent$lambda$50);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pendingDays, 10));
            Iterator<T> it = pendingDays.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxLong(((GymDayTemplateEntity) it.next()).getId()));
            }
            return CollectionsKt.toSet(arrayList);
        }
    }
}
