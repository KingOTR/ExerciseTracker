package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.Repository;
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

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$10$1", f = "GymTabContent.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
    final /* synthetic */ Repository $repo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$10$1(MutableState<Long> mutableState, MutableState<List<GymDayTemplateEntity>> mutableState2, Repository repository, Continuation<? super GymTabContentKt$GymTabContent$10$1> continuation) {
        super(2, continuation);
        this.$activeSplitId$delegate = mutableState;
        this.$dayOptions$delegate = mutableState2;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymTabContentKt$GymTabContent$10$1 gymTabContentKt$GymTabContent$10$1 = new GymTabContentKt$GymTabContent$10$1(this.$activeSplitId$delegate, this.$dayOptions$delegate, this.$repo, continuation);
        gymTabContentKt$GymTabContent$10$1.L$0 = obj;
        return gymTabContentKt$GymTabContent$10$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long GymTabContent$lambda$29;
        MutableState<List<GymDayTemplateEntity>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(this.$activeSplitId$delegate);
            if (GymTabContent$lambda$29 != null) {
                long longValue = GymTabContent$lambda$29.longValue();
                MutableState<List<GymDayTemplateEntity>> mutableState2 = this.$dayOptions$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, longValue, null), this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = withContext;
                mutableState = mutableState2;
            } else {
                this.$dayOptions$delegate.setValue(CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
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

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/GymDayTemplateEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$10$1$1", f = "GymTabContent.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$10$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends GymDayTemplateEntity>>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ long $spId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$spId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$spId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends GymDayTemplateEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<GymDayTemplateEntity>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<GymDayTemplateEntity>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.dayTemplatesForSplit(this.$spId, this);
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
}
