package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.media.SessionMediaSnapshot;
import com.example.rungps.ui.components.SpotifyMiniPlayerCardKt;
import com.example.rungps.ui.gym.GymSessionMediaTimelineKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymActiveSessionBanner.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002"}, d2 = {"GymActiveSessionBanner", "", "session", "Lcom/example/rungps/data/GymSessionEntity;", "openSessionId", "", "dayNameCache", "", "", "repo", "Lcom/example/rungps/data/Repository;", "(Lcom/example/rungps/data/GymSessionEntity;JLjava/util/Map;Lcom/example/rungps/data/Repository;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "mediaTimeline", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "liveMedia", "Lcom/example/rungps/media/SessionMediaSnapshot;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymActiveSessionBannerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymActiveSessionBanner$lambda$7(GymSessionEntity gymSessionEntity, long j, Map map, Repository repository, int i, Composer composer, int i2) {
        GymActiveSessionBanner(gymSessionEntity, j, map, repository, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GymActiveSessionBanner(final GymSessionEntity session, final long j, final Map<Long, String> dayNameCache, final Repository repo, Composer composer, final int i) {
        int i2;
        String str;
        MutableState mutableState;
        Long l;
        int i3;
        MutableState mutableState2;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(dayNameCache, "dayNameCache");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Composer startRestartGroup = composer.startRestartGroup(-599806361);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(session) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(dayNameCache) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(repo) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-599806361, i2, -1, "com.example.rungps.ui.main.GymActiveSessionBanner (GymActiveSessionBanner.kt:64)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-1066112632);
            int i4 = i2 & SdkConfig.SDK_VERSION;
            boolean z = i4 == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1066109407);
            boolean z2 = i4 == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            if (session.getFreeDay()) {
                str = "Today: Free day (split rotation unchanged)";
            } else if (session.getTemplateDayId() != null) {
                Long templateDayId = session.getTemplateDayId();
                Intrinsics.checkNotNull(templateDayId);
                String str2 = dayNameCache.get(templateDayId);
                if (str2 == null) {
                    str2 = "Split day";
                }
                str = "Today: " + str2;
            } else {
                str = "Today: Custom session (no split template)";
            }
            TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
            Long valueOf = Long.valueOf(j);
            startRestartGroup.startReplaceGroup(-1066092453);
            boolean changed = startRestartGroup.changed(mutableState4) | (i4 == 32) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(repo) | startRestartGroup.changed(mutableState3);
            GymActiveSessionBannerKt$GymActiveSessionBanner$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState4;
                l = valueOf;
                i3 = 1;
                mutableState2 = mutableState3;
                rememberedValue3 = new GymActiveSessionBannerKt$GymActiveSessionBanner$1$1(j, context, repo, mutableState, mutableState3, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                l = valueOf;
                mutableState = mutableState4;
                mutableState2 = mutableState3;
                i3 = 1;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i2 >> 3) & 14);
            GymSessionMediaTimelineKt.GymSessionMediaTimelineList(GymActiveSessionBanner$lambda$1(mutableState2), session.getStartedAtMs(), GymActiveSessionBanner$lambda$4(mutableState), null, PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), 0.0f, Dp.m6303constructorimpl(4), 0.0f, 0.0f, 13, null), null, startRestartGroup, 24576, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.GymActiveSessionBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymActiveSessionBanner$lambda$7;
                    GymActiveSessionBanner$lambda$7 = GymActiveSessionBannerKt.GymActiveSessionBanner$lambda$7(GymSessionEntity.this, j, dayNameCache, repo, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GymActiveSessionBanner$lambda$7;
                }
            });
        }
    }

    private static final List<SpotifyTimelineEntity> GymActiveSessionBanner$lambda$1(MutableState<List<SpotifyTimelineEntity>> mutableState) {
        return mutableState.getValue();
    }

    private static final SessionMediaSnapshot GymActiveSessionBanner$lambda$4(MutableState<SessionMediaSnapshot> mutableState) {
        return mutableState.getValue();
    }
}
