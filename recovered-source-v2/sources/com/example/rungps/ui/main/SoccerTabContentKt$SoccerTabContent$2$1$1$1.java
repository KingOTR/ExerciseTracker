package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SoccerTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$2$1$1$1", f = "SoccerTabContent.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $intensity$delegate;
    final /* synthetic */ MutableState<String> $kind$delegate;
    final /* synthetic */ MutableState<String> $notesText$delegate;
    final /* synthetic */ int $play;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ Long $startMs;
    final /* synthetic */ int $wu;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerTabContentKt$SoccerTabContent$2$1$1$1(Repository repository, Long l, int i, int i2, MutableState<String> mutableState, MutableState<Integer> mutableState2, MutableState<String> mutableState3, Continuation<? super SoccerTabContentKt$SoccerTabContent$2$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$startMs = l;
        this.$wu = i;
        this.$play = i2;
        this.$kind$delegate = mutableState;
        this.$intensity$delegate = mutableState2;
        this.$notesText$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoccerTabContentKt$SoccerTabContent$2$1$1$1(this.$repo, this.$startMs, this.$wu, this.$play, this.$kind$delegate, this.$intensity$delegate, this.$notesText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoccerTabContentKt$SoccerTabContent$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String SoccerTabContent$lambda$8;
        int SoccerTabContent$lambda$28;
        String SoccerTabContent$lambda$32;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            SoccerTabContent$lambda$8 = SoccerTabContentKt.SoccerTabContent$lambda$8(this.$kind$delegate);
            long longValue = this.$startMs.longValue();
            int i2 = this.$wu;
            int i3 = this.$play;
            SoccerTabContent$lambda$28 = SoccerTabContentKt.SoccerTabContent$lambda$28(this.$intensity$delegate);
            SoccerTabContent$lambda$32 = SoccerTabContentKt.SoccerTabContent$lambda$32(this.$notesText$delegate);
            String obj2 = StringsKt.trim((CharSequence) SoccerTabContent$lambda$32).toString();
            if (obj2.length() == 0) {
                obj2 = null;
            }
            this.label = 1;
            if (repository.addSoccerSession(SoccerTabContent$lambda$8, longValue, i2, i3, SoccerTabContent$lambda$28, obj2, this) == coroutine_suspended) {
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
