package com.example.rungps.ui.gym;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.media.MediaArtCache;
import com.example.rungps.media.SessionMediaSnapshot;
import com.example.rungps.ui.main.MainActivityFormattersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GymSessionMediaTimeline.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"GymSessionMediaTimelineList", "", "timeline", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "startedAtMs", "", "liveSnapshot", "Lcom/example/rungps/media/SessionMediaSnapshot;", "liveArtUrl", "", "modifier", "Landroidx/compose/ui/Modifier;", "sectionTitle", "(Ljava/util/List;JLcom/example/rungps/media/SessionMediaSnapshot;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "MediaTimelineRow", "entry", "index", "", "(Lcom/example/rungps/data/SpotifyTimelineEntity;JILandroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionMediaTimelineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSessionMediaTimelineList$lambda$3(List list, long j, SessionMediaSnapshot sessionMediaSnapshot, String str, Modifier modifier, String str2, int i, int i2, Composer composer, int i3) {
        GymSessionMediaTimelineList(list, j, sessionMediaSnapshot, str, modifier, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSessionMediaTimelineList$lambda$6(List list, long j, SessionMediaSnapshot sessionMediaSnapshot, String str, Modifier modifier, String str2, int i, int i2, Composer composer, int i3) {
        GymSessionMediaTimelineList(list, j, sessionMediaSnapshot, str, modifier, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaTimelineRow$lambda$8(SpotifyTimelineEntity spotifyTimelineEntity, long j, int i, int i2, Composer composer, int i3) {
        MediaTimelineRow(spotifyTimelineEntity, j, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymSessionMediaTimelineList(final List<SpotifyTimelineEntity> timeline, final long j, SessionMediaSnapshot sessionMediaSnapshot, String str, Modifier modifier, String str2, Composer composer, final int i, final int i2) {
        int i3;
        final SessionMediaSnapshot sessionMediaSnapshot2;
        int i4;
        String str3;
        int i5;
        Modifier modifier2;
        int i6;
        String str4;
        SessionMediaSnapshot sessionMediaSnapshot3;
        boolean changed;
        Object rememberedValue;
        SessionMediaSnapshot sessionMediaSnapshot4;
        List list;
        Composer composer2;
        final Modifier modifier3;
        final String str5;
        final String str6;
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Composer startRestartGroup = composer.startRestartGroup(-1377340842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(timeline) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            sessionMediaSnapshot2 = sessionMediaSnapshot;
            i3 |= startRestartGroup.changedInstance(sessionMediaSnapshot2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str4 = str2;
                    } else {
                        str4 = str2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        sessionMediaSnapshot3 = i7 == 0 ? null : sessionMediaSnapshot2;
                        String str7 = i4 == 0 ? null : str3;
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        String str8 = i6 == 0 ? "Played during session" : str4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1377340842, i3, -1, "com.example.rungps.ui.gym.GymSessionMediaTimelineList (GymSessionMediaTimeline.kt:87)");
                        }
                        startRestartGroup.startReplaceGroup(-1480346621);
                        int i8 = 0;
                        changed = startRestartGroup.changed(timeline) | startRestartGroup.changed(sessionMediaSnapshot3) | ((i3 & 7168) != 2048);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            List<SpotifyTimelineEntity> grouped = GymSessionMediaTimeline.INSTANCE.grouped(timeline);
                            sessionMediaSnapshot4 = (sessionMediaSnapshot3 == null && (sessionMediaSnapshot3.isPlaying() || sessionMediaSnapshot3.isPodcast())) ? sessionMediaSnapshot3 : null;
                            if (sessionMediaSnapshot4 != null) {
                                List<SpotifyTimelineEntity> list2 = grouped;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (GymSessionMediaTimeline.INSTANCE.matchesSnapshot((SpotifyTimelineEntity) it.next(), sessionMediaSnapshot4)) {
                                        }
                                    }
                                }
                                List<SpotifyTimelineEntity> list3 = grouped;
                                long coerceAtLeast = RangesKt.coerceAtLeast(System.currentTimeMillis(), j);
                                SpotifyTimelineEntity spotifyTimelineEntity = (SpotifyTimelineEntity) CollectionsKt.firstOrNull((List) timeline);
                                Long gymSessionId = spotifyTimelineEntity != null ? spotifyTimelineEntity.getGymSessionId() : null;
                                boolean isPlaying = sessionMediaSnapshot4.isPlaying();
                                String itemType = sessionMediaSnapshot4.getItemType();
                                String itemId = sessionMediaSnapshot4.getItemId();
                                String title = sessionMediaSnapshot4.getTitle();
                                String subtitle = sessionMediaSnapshot4.getSubtitle();
                                Long progressMs = sessionMediaSnapshot4.getProgressMs();
                                String artUrl = sessionMediaSnapshot4.getArtUrl();
                                rememberedValue = CollectionsKt.plus((Collection<? extends SpotifyTimelineEntity>) list3, new SpotifyTimelineEntity(0L, coerceAtLeast, null, gymSessionId, isPlaying, itemType, itemId, title, subtitle, progressMs, artUrl == null ? str7 : artUrl, 5, null));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            rememberedValue = grouped;
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        list = (List) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        if (!list.isEmpty()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final SessionMediaSnapshot sessionMediaSnapshot5 = sessionMediaSnapshot3;
                                final String str9 = str7;
                                final Modifier modifier5 = modifier4;
                                final String str10 = str8;
                                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSessionMediaTimelineKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit GymSessionMediaTimelineList$lambda$3;
                                        GymSessionMediaTimelineList$lambda$3 = GymSessionMediaTimelineKt.GymSessionMediaTimelineList$lambda$3(timeline, j, sessionMediaSnapshot5, str9, modifier5, str10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return GymSessionMediaTimelineList$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifier6 = modifier4;
                        TextKt.m2376Text4IGK_g(str8, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, ((i3 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                        startRestartGroup.startReplaceGroup(-686144557);
                        for (Object obj : list) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            i8 = i9;
                            MediaTimelineRow((SpotifyTimelineEntity) obj, j, i8, startRestartGroup, i3 & SdkConfig.SDK_VERSION);
                            i3 = i3;
                            sessionMediaSnapshot3 = sessionMediaSnapshot3;
                            startRestartGroup = startRestartGroup;
                        }
                        SessionMediaSnapshot sessionMediaSnapshot6 = sessionMediaSnapshot3;
                        composer2 = startRestartGroup;
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier6;
                        sessionMediaSnapshot2 = sessionMediaSnapshot6;
                        str5 = str7;
                        str6 = str8;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        str5 = str3;
                        modifier3 = modifier2;
                        String str11 = str4;
                        composer2 = startRestartGroup;
                        str6 = str11;
                    }
                    ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSessionMediaTimelineKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit GymSessionMediaTimelineList$lambda$6;
                                GymSessionMediaTimelineList$lambda$6 = GymSessionMediaTimelineKt.GymSessionMediaTimelineList$lambda$6(timeline, j, sessionMediaSnapshot2, str5, modifier3, str6, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return GymSessionMediaTimelineList$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(-1480346621);
                int i82 = 0;
                changed = startRestartGroup.changed(timeline) | startRestartGroup.changed(sessionMediaSnapshot3) | ((i3 & 7168) != 2048);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                List<SpotifyTimelineEntity> grouped2 = GymSessionMediaTimeline.INSTANCE.grouped(timeline);
                if (sessionMediaSnapshot3 == null) {
                }
                if (sessionMediaSnapshot4 != null) {
                }
                rememberedValue = grouped2;
                startRestartGroup.updateRememberedValue(rememberedValue);
                list = (List) rememberedValue;
                startRestartGroup.endReplaceGroup();
                if (!list.isEmpty()) {
                }
            }
            str3 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-1480346621);
            int i822 = 0;
            changed = startRestartGroup.changed(timeline) | startRestartGroup.changed(sessionMediaSnapshot3) | ((i3 & 7168) != 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            List<SpotifyTimelineEntity> grouped22 = GymSessionMediaTimeline.INSTANCE.grouped(timeline);
            if (sessionMediaSnapshot3 == null) {
            }
            if (sessionMediaSnapshot4 != null) {
            }
            rememberedValue = grouped22;
            startRestartGroup.updateRememberedValue(rememberedValue);
            list = (List) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (!list.isEmpty()) {
            }
        }
        sessionMediaSnapshot2 = sessionMediaSnapshot;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1480346621);
        int i8222 = 0;
        changed = startRestartGroup.changed(timeline) | startRestartGroup.changed(sessionMediaSnapshot3) | ((i3 & 7168) != 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        List<SpotifyTimelineEntity> grouped222 = GymSessionMediaTimeline.INSTANCE.grouped(timeline);
        if (sessionMediaSnapshot3 == null) {
        }
        if (sessionMediaSnapshot4 != null) {
        }
        rememberedValue = grouped222;
        startRestartGroup.updateRememberedValue(rememberedValue);
        list = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (!list.isEmpty()) {
        }
    }

    private static final void MediaTimelineRow(final SpotifyTimelineEntity spotifyTimelineEntity, final long j, final int i, Composer composer, final int i2) {
        int i3;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-1309378055);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(spotifyTimelineEntity) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309378055, i3, -1, "com.example.rungps.ui.gym.MediaTimelineRow (GymSessionMediaTimeline.kt:130)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            final boolean isPodcastRow = GymSessionMediaTimeline.INSTANCE.isPodcastRow(spotifyTimelineEntity);
            final String formatElapsed = MainActivityFormattersKt.formatElapsed(RangesKt.coerceAtLeast(spotifyTimelineEntity.getTimeMs() - j, 0L));
            String artUrl = spotifyTimelineEntity.getArtUrl();
            startRestartGroup.startReplaceGroup(-1714344860);
            boolean changed = startRestartGroup.changed(artUrl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Object coilModel = MediaArtCache.INSTANCE.coilModel(spotifyTimelineEntity.getArtUrl());
                startRestartGroup.updateRememberedValue(coilModel);
                obj = coilModel;
            } else {
                obj = rememberedValue;
            }
            startRestartGroup.endReplaceGroup();
            final String displayTitle = GymSessionMediaTimeline.INSTANCE.displayTitle(spotifyTimelineEntity);
            final String displaySubtitle = GymSessionMediaTimeline.INSTANCE.displaySubtitle(spotifyTimelineEntity);
            final Object obj2 = obj;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme.getSurfaceContainerHigh(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1576438841, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymSessionMediaTimelineKt$MediaTimelineRow$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                    int i5;
                    String str;
                    String str2;
                    String str3;
                    boolean z;
                    ColorScheme colorScheme2;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    float f;
                    String str10;
                    String str11;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1576438841, i4, -1, "com.example.rungps.ui.gym.MediaTimelineRow.<anonymous> (GymSessionMediaTimeline.kt:146)");
                        }
                        float f2 = 12;
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f2));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Object obj3 = obj2;
                        Context context2 = context;
                        boolean z2 = isPodcastRow;
                        ColorScheme colorScheme3 = colorScheme;
                        String str12 = displaySubtitle;
                        String str13 = displayTitle;
                        String str14 = formatElapsed;
                        int i6 = i;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (obj3 != null) {
                            composer2.startReplaceGroup(-2001305938);
                            i5 = i6;
                            str = str14;
                            str2 = str13;
                            str3 = str12;
                            colorScheme2 = colorScheme3;
                            z = z2;
                            SingletonAsyncImageKt.m6745AsyncImagegl8XCv8(new ImageRequest.Builder(context2).data(obj3).crossfade(true).build(), null, ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(52)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(10))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer2, 1572912, 0, 4024);
                            composer2.endReplaceGroup();
                            str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        } else {
                            i5 = i6;
                            str = str14;
                            str2 = str13;
                            str3 = str12;
                            z = z2;
                            colorScheme2 = colorScheme3;
                            composer2.startReplaceGroup(-2000833405);
                            Modifier m239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(52)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(10))), z ? colorScheme2.getTertiaryContainer() : colorScheme2.getPrimaryContainer(), null, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m239backgroundbw27NRU$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            TextKt.m2376Text4IGK_g(z ? "🎙" : "♪", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleLarge(), composer2, 0, 0, 65534);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceGroup();
                        }
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        float f3 = 2;
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer2, 6);
                        String str15 = str5;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str15);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        String str16 = str4;
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str16);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
                        Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-1248885210);
                        if (!z || (str11 = str3) == null || StringsKt.isBlank(str11)) {
                            str6 = "C88@4444L9:Column.kt#2w3rfo";
                            str7 = str16;
                            str8 = str15;
                            str9 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                            f = f3;
                        } else {
                            str6 = "C88@4444L9:Column.kt#2w3rfo";
                            str7 = str16;
                            str8 = str15;
                            str9 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                            f = f3;
                            TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55258);
                        }
                        composer2.endReplaceGroup();
                        TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
                        composer2.startReplaceGroup(-1248862249);
                        if (!z && (str10 = str3) != null && !StringsKt.isBlank(str10)) {
                            TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 3120, 55290);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str9);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, end, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str8);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str7);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer2);
                        Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str6);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g(str, (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        TextKt.m2376Text4IGK_g("#" + i5, (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSessionMediaTimelineKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit MediaTimelineRow$lambda$8;
                    MediaTimelineRow$lambda$8 = GymSessionMediaTimelineKt.MediaTimelineRow$lambda$8(SpotifyTimelineEntity.this, j, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    return MediaTimelineRow$lambda$8;
                }
            });
        }
    }
}
