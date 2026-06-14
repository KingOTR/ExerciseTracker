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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpotifyMiniPlayerCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1", f = "SpotifyMiniPlayerCard.kt", i = {}, l = {224, 224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<DeviceNowPlaying> $deviceNowPlaying$delegate;
    final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ boolean $showSpotify;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1(boolean z, MutableState<Boolean> mutableState, MutableState<DeviceNowPlaying> mutableState2, Repository repository, Context context, Continuation<? super SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1> continuation) {
        super(2, continuation);
        this.$showSpotify = z;
        this.$isPlaying$delegate = mutableState;
        this.$deviceNowPlaying$delegate = mutableState2;
        this.$repo = repository;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1 spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1 = new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1(this.$showSpotify, this.$isPlaying$delegate, this.$deviceNowPlaying$delegate, this.$repo, this.$ctx, continuation);
        spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1.L$0 = obj;
        return spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        Unit unit;
        DeviceNowPlaying SpotifyMiniPlayerCard$lambda$20;
        Boolean boxBoolean;
        DeviceNowPlaying SpotifyMiniPlayerCard$lambda$202;
        MediaController controller;
        MediaController.TransportControls transportControls;
        DeviceNowPlaying SpotifyMiniPlayerCard$lambda$203;
        MediaController controller2;
        MediaController.TransportControls transportControls2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            unit = null;
            if (this.$showSpotify) {
                boxBoolean = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$14(this.$isPlaying$delegate);
            } else {
                SpotifyMiniPlayerCard$lambda$20 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$20(this.$deviceNowPlaying$delegate);
                boxBoolean = SpotifyMiniPlayerCard$lambda$20 != null ? Boxing.boxBoolean(SpotifyMiniPlayerCard$lambda$20.isPlaying()) : null;
            }
            boolean areEqual = Intrinsics.areEqual(boxBoolean, Boxing.boxBoolean(true));
            boolean z = !areEqual;
            if (this.$showSpotify) {
                this.$isPlaying$delegate.setValue(Boxing.boxBoolean(z));
            }
            boolean z2 = this.$showSpotify;
            Repository repository = this.$repo;
            MutableState<DeviceNowPlaying> mutableState = this.$deviceNowPlaying$delegate;
            Result.Companion companion2 = Result.INSTANCE;
            if (!z2) {
                if (!areEqual) {
                    SpotifyMiniPlayerCard$lambda$203 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$20(mutableState);
                    if (SpotifyMiniPlayerCard$lambda$203 != null && (controller2 = SpotifyMiniPlayerCard$lambda$203.getController()) != null && (transportControls2 = controller2.getTransportControls()) != null) {
                        transportControls2.play();
                        unit = Unit.INSTANCE;
                    }
                } else {
                    SpotifyMiniPlayerCard$lambda$202 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$20(mutableState);
                    if (SpotifyMiniPlayerCard$lambda$202 != null && (controller = SpotifyMiniPlayerCard$lambda$202.getController()) != null && (transportControls = controller.getTransportControls()) != null) {
                        transportControls.pause();
                        unit = Unit.INSTANCE;
                    }
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
            if (areEqual) {
                this.label = 2;
                if (repository.spotifyPause(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 1;
                if (repository.spotifyPlay(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
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
