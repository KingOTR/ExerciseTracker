package com.example.rungps.ui.components;

import android.content.Context;
import android.media.session.MediaController;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.media.DeviceNowPlaying;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpotifyMiniPlayerCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1", f = "SpotifyMiniPlayerCard.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<DeviceNowPlaying> $deviceNowPlaying$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ boolean $showSpotify;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1(boolean z, Repository repository, MutableState<DeviceNowPlaying> mutableState, Context context, Continuation<? super SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1> continuation) {
        super(2, continuation);
        this.$showSpotify = z;
        this.$repo = repository;
        this.$deviceNowPlaying$delegate = mutableState;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1 spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1 = new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1(this.$showSpotify, this.$repo, this.$deviceNowPlaying$delegate, this.$ctx, continuation);
        spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1.L$0 = obj;
        return spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        DeviceNowPlaying SpotifyMiniPlayerCard$lambda$20;
        Unit unit;
        MediaController controller;
        MediaController.TransportControls transportControls;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.$showSpotify;
            Repository repository = this.$repo;
            MutableState<DeviceNowPlaying> mutableState = this.$deviceNowPlaying$delegate;
            Result.Companion companion2 = Result.INSTANCE;
            if (!z) {
                SpotifyMiniPlayerCard$lambda$20 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$20(mutableState);
                if (SpotifyMiniPlayerCard$lambda$20 == null || (controller = SpotifyMiniPlayerCard$lambda$20.getController()) == null || (transportControls = controller.getTransportControls()) == null) {
                    unit = null;
                } else {
                    transportControls.skipToNext();
                    unit = Unit.INSTANCE;
                }
                m7905constructorimpl = Result.m7905constructorimpl(unit);
                Context context = this.$ctx;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Spotify error";
                    }
                    Toast.makeText(context, message, 0).show();
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (repository.spotifyNext(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        unit = Unit.INSTANCE;
        m7905constructorimpl = Result.m7905constructorimpl(unit);
        Context context2 = this.$ctx;
        m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
