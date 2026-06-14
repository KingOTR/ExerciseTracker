package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.LocalPbWithRun;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.Repository;
import com.example.rungps.util.SecureSettingsStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$3$1", f = "HistoryTabContent.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localPbRuns$delegate;
    final /* synthetic */ MutableState<Map<String, Long>> $localPbs$delegate;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localRidePbs$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<String> $spotifyClientId$delegate;
    final /* synthetic */ MutableState<Boolean> $spotifyConnected$delegate;
    final /* synthetic */ MutableState<String> $stravaClientId$delegate;
    final /* synthetic */ MutableState<Boolean> $stravaConnected$delegate;
    final /* synthetic */ MutableState<Boolean> $stravaSecretSaved$delegate;
    final /* synthetic */ MutableState<String> $stravaUploadStatus$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$3$1(Context context, MutableState<String> mutableState, MutableState<Boolean> mutableState2, Repository repository, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<Boolean> mutableState6, MutableState<Map<String, LocalPbWithRun>> mutableState7, MutableState<Map<String, LocalPbWithRun>> mutableState8, MutableState<Map<String, Long>> mutableState9, Continuation<? super HistoryTabContentKt$HistoryTabContent$3$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$stravaClientId$delegate = mutableState;
        this.$stravaSecretSaved$delegate = mutableState2;
        this.$repo = repository;
        this.$stravaConnected$delegate = mutableState3;
        this.$stravaUploadStatus$delegate = mutableState4;
        this.$spotifyClientId$delegate = mutableState5;
        this.$spotifyConnected$delegate = mutableState6;
        this.$localPbRuns$delegate = mutableState7;
        this.$localRidePbs$delegate = mutableState8;
        this.$localPbs$delegate = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryTabContentKt$HistoryTabContent$3$1(this.$ctx, this.$stravaClientId$delegate, this.$stravaSecretSaved$delegate, this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate, this.$spotifyClientId$delegate, this.$spotifyConnected$delegate, this.$localPbRuns$delegate, this.$localRidePbs$delegate, this.$localPbs$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object HistoryTabContent$reloadLocalPbs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppPreferences.INSTANCE.migrateFromLegacyBlocking(this.$ctx);
            this.$stravaClientId$delegate.setValue(AppPreferences.INSTANCE.stravaClientIdBlocking(this.$ctx));
            HistoryTabContentKt.HistoryTabContent$lambda$35(this.$stravaSecretSaved$delegate, SecureSettingsStore.INSTANCE.stravaClientSecret(this.$ctx).length() > 0);
            HistoryTabContentKt.HistoryTabContent$refreshStravaUiState(this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate);
            MutableState<String> mutableState = this.$spotifyClientId$delegate;
            String string = this.$ctx.getSharedPreferences("settings", 0).getString("spotifyClientId", "");
            mutableState.setValue(string != null ? string : "");
            HistoryTabContentKt.HistoryTabContent$lambda$49(this.$spotifyConnected$delegate, Repository.INSTANCE.get(this.$ctx).isSpotifyConnected());
            this.label = 1;
            HistoryTabContent$reloadLocalPbs = HistoryTabContentKt.HistoryTabContent$reloadLocalPbs(this.$repo, this.$localPbRuns$delegate, this.$localRidePbs$delegate, this.$localPbs$delegate, this);
            if (HistoryTabContent$reloadLocalPbs == coroutine_suspended) {
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
