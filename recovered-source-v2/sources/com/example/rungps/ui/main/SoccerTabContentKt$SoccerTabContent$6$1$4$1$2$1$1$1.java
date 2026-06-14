package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.data.WatchActivityReclassifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: SoccerTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1", f = "SoccerTabContent.kt", i = {}, l = {291, 295}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ SoccerSessionEntity $s;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1(Repository repository, SoccerSessionEntity soccerSessionEntity, Context context, Continuation<? super SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$s = soccerSessionEntity;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1(this.$repo, this.$s, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.reclassifyWatchSoccerToRun(this.$s.getId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        WatchActivityReclassifier.Result result = (WatchActivityReclassifier.Result) obj;
        if (result instanceof WatchActivityReclassifier.Result.Ok) {
            message = ((WatchActivityReclassifier.Result.Ok) result).getMessage();
        } else {
            if (!(result instanceof WatchActivityReclassifier.Result.Err)) {
                throw new NoWhenBranchMatchedException();
            }
            message = ((WatchActivityReclassifier.Result.Err) result).getMessage();
        }
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$ctx, message, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SoccerTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1$1", f = "SoccerTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ String $msg;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$msg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$msg, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$ctx, this.$msg, 1).show();
            return Unit.INSTANCE;
        }
    }
}
