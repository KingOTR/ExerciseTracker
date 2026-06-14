package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.AmbientSessionTagger;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymAmbientTagRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1", f = "GymAmbientTagRow.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $customDraft$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Set<String>> $selected$delegate;
    final /* synthetic */ GymSessionEntity $session;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1(Repository repository, GymSessionEntity gymSessionEntity, MutableState<Set<String>> mutableState, MutableState<String> mutableState2, Continuation<? super GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$session = gymSessionEntity;
        this.$selected$delegate = mutableState;
        this.$customDraft$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1(this.$repo, this.$session, this.$selected$delegate, this.$customDraft$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<String> GymAmbientTagRow$lambda$1;
        String GymAmbientTagRow$lambda$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            long id = this.$session.getId();
            AmbientSessionTagger ambientSessionTagger = AmbientSessionTagger.INSTANCE;
            GymAmbientTagRow$lambda$1 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$1(this.$selected$delegate);
            GymAmbientTagRow$lambda$4 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$4(this.$customDraft$delegate);
            this.label = 1;
            if (repository.setGymAmbientTagCustom(id, ambientSessionTagger.encodeStoredTags(GymAmbientTagRow$lambda$1, GymAmbientTagRow$lambda$4), this) == coroutine_suspended) {
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
