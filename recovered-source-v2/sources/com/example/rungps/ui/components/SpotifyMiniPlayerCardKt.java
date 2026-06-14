package com.example.rungps.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
import com.example.rungps.media.DeviceNowPlaying;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpotifyMiniPlayerCard.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, d2 = {"SpotifyMiniPlayerCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "connected", "", "title", "", "lastTitle", "subtitle", "isPlaying", "artUrl", "deviceNowPlaying", "Lcom/example/rungps/media/DeviceNowPlaying;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyMiniPlayerCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpotifyMiniPlayerCard$lambda$23(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpotifyMiniPlayerCard(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpotifyMiniPlayerCard$lambda$24(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpotifyMiniPlayerCard(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SpotifyMiniPlayerCard(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        String title;
        String str;
        Composer startRestartGroup = composer.startRestartGroup(1282198743);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1282198743, i3, -1, "com.example.rungps.ui.components.SpotifyMiniPlayerCard (SpotifyMiniPlayerCard.kt:51)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(1202873643);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1202877692);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(repository.isSpotifyConnected()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202879984);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState2 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202882032);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState3 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202884048);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState4 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202886097);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState5 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202888080);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState6 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1202890387);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState7 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(1202895029);
            boolean changedInstance = startRestartGroup.changedInstance(repository) | startRestartGroup.changedInstance(context);
            SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1 rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1(repository, context, mutableState, mutableState7, mutableState2, mutableState4, mutableState5, mutableState6, mutableState3, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10, startRestartGroup, 6);
            DeviceNowPlaying SpotifyMiniPlayerCard$lambda$20 = SpotifyMiniPlayerCard$lambda$20(mutableState7);
            boolean z = false;
            boolean z2 = SpotifyMiniPlayerCard$lambda$2(mutableState) && SpotifyMiniPlayerCard$lambda$20 == null;
            String SpotifyMiniPlayerCard$lambda$5 = SpotifyMiniPlayerCard$lambda$5(mutableState2);
            if (SpotifyMiniPlayerCard$lambda$5 == null) {
                SpotifyMiniPlayerCard$lambda$5 = SpotifyMiniPlayerCard$lambda$8(mutableState3);
            }
            String str2 = SpotifyMiniPlayerCard$lambda$5;
            boolean z3 = (!z2 || (str = str2) == null || StringsKt.isBlank(str)) ? false : true;
            if (SpotifyMiniPlayerCard$lambda$20 != null && (title = SpotifyMiniPlayerCard$lambda$20.getTitle()) != null && !StringsKt.isBlank(title)) {
                z = true;
            }
            if (!z3 && !z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SpotifyMiniPlayerCard$lambda$23;
                            SpotifyMiniPlayerCard$lambda$23 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$23(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SpotifyMiniPlayerCard$lambda$23;
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifier4 = modifier3;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1153463387, true, new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3(z2, SpotifyMiniPlayerCard$lambda$20, mutableState6, str2, mutableState5, mutableState4, coroutineScope, repository, context, mutableState7), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SpotifyMiniPlayerCard$lambda$24;
                    SpotifyMiniPlayerCard$lambda$24 = SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$24(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SpotifyMiniPlayerCard$lambda$24;
                }
            });
        }
    }

    private static final boolean SpotifyMiniPlayerCard$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpotifyMiniPlayerCard$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String SpotifyMiniPlayerCard$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String SpotifyMiniPlayerCard$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SpotifyMiniPlayerCard$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean SpotifyMiniPlayerCard$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SpotifyMiniPlayerCard$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceNowPlaying SpotifyMiniPlayerCard$lambda$20(MutableState<DeviceNowPlaying> mutableState) {
        return mutableState.getValue();
    }
}
