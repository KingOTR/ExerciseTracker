package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.GymWeeklyVolume;
import com.example.rungps.analytics.WeekVolumeBar;
import com.example.rungps.data.GymSessionEntity;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$1$1", f = "GymTabContent.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
    final /* synthetic */ MutableState<List<WeekVolumeBar>> $weekBars$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$1$1(Repository repository, State<? extends List<GymSessionEntity>> state, MutableState<List<WeekVolumeBar>> mutableState, Continuation<? super GymTabContentKt$GymTabContent$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$sessions$delegate = state;
        this.$weekBars$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$1$1(this.$repo, this.$sessions$delegate, this.$weekBars$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/analytics/WeekVolumeBar;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$1$1$1", f = "GymTabContent.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WeekVolumeBar>>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Repository repository, State<? extends List<GymSessionEntity>> state, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$sessions$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$sessions$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WeekVolumeBar>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<WeekVolumeBar>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WeekVolumeBar>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List GymTabContent$lambda$1;
            List GymTabContent$lambda$12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GymTabContent$lambda$1 = GymTabContentKt.GymTabContent$lambda$1(this.$sessions$delegate);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : GymTabContent$lambda$1) {
                    if (((GymSessionEntity) obj2).getEndedAtMs() != null) {
                        arrayList.add(obj2);
                    }
                }
                Repository repository = this.$repo;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
                }
                this.label = 1;
                obj = repository.setsForSessionsGrouped(arrayList3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GymWeeklyVolume gymWeeklyVolume = GymWeeklyVolume.INSTANCE;
            GymTabContent$lambda$12 = GymTabContentKt.GymTabContent$lambda$1(this.$sessions$delegate);
            return GymWeeklyVolume.compute$default(gymWeeklyVolume, GymTabContent$lambda$12, (Map) obj, null, 0, 12, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<List<WeekVolumeBar>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<List<WeekVolumeBar>> mutableState2 = this.$weekBars$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$sessions$delegate, null), this);
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
