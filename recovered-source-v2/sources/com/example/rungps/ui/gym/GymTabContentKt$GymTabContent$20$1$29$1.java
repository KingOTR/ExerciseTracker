package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$29$1", f = "GymTabContent.kt", i = {}, l = {1150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$29$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ExerciseTemplateEntity>> $activeDayExercises$delegate;
    final /* synthetic */ GymSessionEntity $openGymSession;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ Long $sid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$29$1(GymSessionEntity gymSessionEntity, MutableState<List<ExerciseTemplateEntity>> mutableState, Repository repository, Long l, Continuation<? super GymTabContentKt$GymTabContent$20$1$29$1> continuation) {
        super(2, continuation);
        this.$openGymSession = gymSessionEntity;
        this.$activeDayExercises$delegate = mutableState;
        this.$repo = repository;
        this.$sid = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$29$1(this.$openGymSession, this.$activeDayExercises$delegate, this.$repo, this.$sid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$29$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$132;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymSessionEntity gymSessionEntity = this.$openGymSession;
            Long templateDayId = gymSessionEntity != null ? gymSessionEntity.getTemplateDayId() : null;
            if (templateDayId != null) {
                GymTabContent$lambda$132 = GymTabContentKt.GymTabContent$lambda$132(this.$activeDayExercises$delegate);
                if (!GymTabContent$lambda$132.isEmpty()) {
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$sid, templateDayId, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$29$1$1", f = "GymTabContent.kt", i = {}, l = {1151, 1152, 1154}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$29$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ Long $sid;
        final /* synthetic */ Long $tid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, Long l, Long l2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$sid = l;
            this.$tid = l2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$sid, this.$tid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GymDayTemplateEntity gymDayTemplateEntity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$repo.seedTemplateSets(this.$sid.longValue(), this.$tid.longValue(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    gymDayTemplateEntity = (GymDayTemplateEntity) obj;
                    if (gymDayTemplateEntity != null) {
                        this.label = 3;
                        if (this.$repo.applyCarryoverToSession(this.$sid.longValue(), gymDayTemplateEntity.getSplitId(), this.$tid.longValue(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            obj = this.$repo.dayTemplateById(this.$tid.longValue(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            gymDayTemplateEntity = (GymDayTemplateEntity) obj;
            if (gymDayTemplateEntity != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
