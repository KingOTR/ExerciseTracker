package com.example.rungps.ui.gym;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.GymSpotifyTimelineBackfill;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$19$1$1$1", f = "GymTabContent.kt", i = {}, l = {752, 758}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$19$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $backfillingSpotify$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$19$1$1$1(Repository repository, MutableState<Boolean> mutableState, Context context, Continuation<? super GymTabContentKt$GymTabContent$20$1$19$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$backfillingSpotify$delegate = mutableState;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymTabContentKt$GymTabContent$20$1$19$1$1$1 gymTabContentKt$GymTabContent$20$1$19$1$1$1 = new GymTabContentKt$GymTabContent$20$1$19$1$1$1(this.$repo, this.$backfillingSpotify$delegate, this.$ctx, continuation);
        gymTabContentKt$GymTabContent$20$1$19$1$1$1.L$0 = obj;
        return gymTabContentKt$GymTabContent$20$1$19$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$19$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            Result.Companion companion2 = Result.INSTANCE;
            this.label = 1;
            obj = repository.backfillGymSpotifyTimeline(true, 90, true, this);
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
        m7905constructorimpl = Result.m7905constructorimpl((GymSpotifyTimelineBackfill.Result) obj);
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(m7905constructorimpl, this.$backfillingSpotify$delegate, this.$ctx, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$19$1$1$1$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$19$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $backfillingSpotify$delegate;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Object $r;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, MutableState<Boolean> mutableState, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$r = obj;
            this.$backfillingSpotify$delegate = mutableState;
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, this.$backfillingSpotify$delegate, this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$74(this.$backfillingSpotify$delegate, false);
                Object obj2 = this.$r;
                Context context = this.$ctx;
                if (Result.m7912isSuccessimpl(obj2)) {
                    GymSpotifyTimelineBackfill.Result result = (GymSpotifyTimelineBackfill.Result) obj2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Updated " + result.getRowsInserted() + " playlist rows");
                    if (result.getSessionsFilled() > 0) {
                        sb.append(" (" + result.getSessionsFilled() + " sessions gained tracks)");
                    }
                    if (result.getSkippedAlreadyHadMusic() > 0) {
                        sb.append(" · " + result.getSkippedAlreadyHadMusic() + " already had music");
                    }
                    if (result.getRowsInserted() == 0 && result.getSessionsFilled() == 0) {
                        sb.append(" — no Spotify plays matched session times");
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    Toast.makeText(context, sb2, 1).show();
                }
                Object obj3 = this.$r;
                Context context2 = this.$ctx;
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj3);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Spotify backfill failed";
                    }
                    Toast.makeText(context2, message, 1).show();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
