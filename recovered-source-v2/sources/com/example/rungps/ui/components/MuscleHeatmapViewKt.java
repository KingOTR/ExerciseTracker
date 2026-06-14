package com.example.rungps.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.webkit.WebViewAssetLoader;
import com.example.rungps.ui.theme.EarthColors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: MuscleHeatmapView.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001ak\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a,\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0019H\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u001a\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0001H\u0002\u001a(\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"ATLAS_URL", "", "injectHandler", "Landroid/os/Handler;", "MuscleHeatmapView", "", "regionHours", "", "", "modifier", "Landroidx/compose/ui/Modifier;", "mode", "Lcom/example/rungps/ui/components/MuscleHeatmapMode;", "tagLegendVolume", "kgByMuscleGroup", "", "volumeDaysBack", "", "(Ljava/util/Map;Landroidx/compose/ui/Modifier;Lcom/example/rungps/ui/components/MuscleHeatmapMode;Ljava/util/Map;Ljava/util/Map;ILandroidx/compose/runtime/Composer;II)V", "bindMuscleBridge", "webView", "Landroid/webkit/WebView;", "bridge", "Lcom/example/rungps/ui/components/MuscleAtlasBridge;", "onRegion", "Lkotlin/Function1;", "mainHandlerPostInject", "injectMuscleTheme", "dark", "", "injectMuscleState", "json", "resolveRegionLoadForLegend", "raw", "app_sideload", "measuredHeightPx", "bodyPopupRegion"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleHeatmapViewKt {
    private static final String ATLAS_URL = "https://appassets.androidplatform.net/assets/muscle_atlas/index.html";
    private static final Handler injectHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$34(Map map, Modifier modifier, MuscleHeatmapMode muscleHeatmapMode, Map map2, Map map3, int i, int i2, int i3, Composer composer, int i4) {
        MuscleHeatmapView(map, modifier, muscleHeatmapMode, map2, map3, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MuscleHeatmapView(final Map<String, Float> regionHours, Modifier modifier, MuscleHeatmapMode muscleHeatmapMode, Map<String, Float> map, Map<String, Double> map2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        MuscleHeatmapMode muscleHeatmapMode2;
        int i6;
        Map<String, Float> map3;
        int i7;
        Map<String, Double> map4;
        int i8;
        int i9;
        MuscleHeatmapMode muscleHeatmapMode3;
        boolean changed;
        Object rememberedValue;
        Object rememberedValue2;
        final MutableIntState mutableIntState;
        float m6303constructorimpl;
        float m6317unboximpl;
        boolean changed2;
        Object rememberedValue3;
        String str;
        boolean changed3;
        Object rememberedValue4;
        boolean z;
        Object rememberedValue5;
        MuscleAtlasBridge muscleAtlasBridge;
        Object rememberedValue6;
        Object rememberedValue7;
        Object rememberedValue8;
        boolean changed4;
        Object rememberedValue9;
        float f;
        boolean changedInstance;
        Object rememberedValue10;
        String MuscleHeatmapView$lambda$9;
        int i10;
        int i11;
        MuscleHeatmapMode muscleHeatmapMode4;
        boolean z2;
        int i12;
        Map<String, Float> map5;
        Map map6;
        float f2;
        float f3;
        String str2;
        MuscleAtlasBridge muscleAtlasBridge2;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changedInstance2;
        Object rememberedValue11;
        boolean changedInstance3;
        Object rememberedValue12;
        List<Map.Entry> take;
        String str3;
        String str4;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        final MuscleHeatmapMode muscleHeatmapMode5;
        final Map<String, Double> map7;
        final int i13;
        final Map<String, Float> map8;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(regionHours, "regionHours");
        Composer startRestartGroup = composer.startRestartGroup(-423907648);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(regionHours) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                muscleHeatmapMode2 = muscleHeatmapMode;
                i4 |= startRestartGroup.changed(muscleHeatmapMode2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    map3 = map;
                    i4 |= startRestartGroup.changedInstance(map3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        map4 = map2;
                        i4 |= startRestartGroup.changedInstance(map4) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            i9 = i;
                        } else {
                            i9 = i;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changed(i9) ? 131072 : 65536;
                            }
                        }
                        if ((i4 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                            muscleHeatmapMode3 = i5 != 0 ? MuscleHeatmapMode.Recovery : muscleHeatmapMode2;
                            if (i6 != 0) {
                                map3 = MapsKt.emptyMap();
                            }
                            Map<String, Double> emptyMap = i7 != 0 ? MapsKt.emptyMap() : map4;
                            if (i8 != 0) {
                                i9 = 90;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-423907648, i4, -1, "com.example.rungps.ui.components.MuscleHeatmapView (MuscleHeatmapView.kt:58)");
                            }
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Context context = (Context) consume;
                            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Configuration configuration = (Configuration) consume2;
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume3;
                            int i15 = configuration.screenWidthDp;
                            int i16 = configuration.screenHeightDp;
                            startRestartGroup.startReplaceGroup(505833150);
                            changed = startRestartGroup.changed(i15) | startRestartGroup.changed(i16);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = Dp.m6301boximpl(Dp.m6303constructorimpl(Math.min(RangesKt.coerceIn(configuration.screenWidthDp * 1.12f, 440.0f, 640.0f), configuration.screenHeightDp * 0.52f)));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            float m6317unboximpl2 = ((Dp) rememberedValue).m6317unboximpl();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(505840869);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            mutableIntState = (MutableIntState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            if (MuscleHeatmapView$lambda$2(mutableIntState) > 0) {
                                m6303constructorimpl = density.mo373toDpu2uoSUM(MuscleHeatmapView$lambda$2(mutableIntState));
                            } else {
                                m6303constructorimpl = Dp.m6303constructorimpl(0);
                            }
                            m6317unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6301boximpl(m6303constructorimpl), Dp.m6301boximpl(m6317unboximpl2))).m6317unboximpl();
                            startRestartGroup.startReplaceGroup(505849184);
                            changed2 = startRestartGroup.changed(regionHours) | ((458752 & i4) == 131072) | startRestartGroup.changed(context);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = MuscleBodyMap.toBodyStateJson$default(MuscleBodyMap.INSTANCE, regionHours, false, context, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            str = (String) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(505853907);
                            int i17 = i4 & 896;
                            changed3 = startRestartGroup.changed(regionHours) | startRestartGroup.changed(map3) | (i17 == 256);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = (muscleHeatmapMode3 == MuscleHeatmapMode.Volume || map3.isEmpty()) ? resolveRegionLoadForLegend(regionHours) : map3;
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            Map map9 = (Map) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                            z = !DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) || ColorKt.m3895luminance8_81llA(colorScheme.getBackground()) < 0.45f;
                            startRestartGroup.startReplaceGroup(505865860);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new MuscleAtlasBridge();
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            muscleAtlasBridge = (MuscleAtlasBridge) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(505867790);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            Modifier modifier3 = companion;
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                            Integer valueOf = Integer.valueOf(i9);
                            startRestartGroup.startReplaceGroup(505870282);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            Map<String, Float> map10 = map3;
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$1$1(mutableState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, (i4 >> 15) & 14);
                            startRestartGroup.startReplaceGroup(505873654);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit MuscleHeatmapView$lambda$13$lambda$12;
                                        MuscleHeatmapView$lambda$13$lambda$12 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$13$lambda$12(MutableState.this, (String) obj);
                                        return MuscleHeatmapView$lambda$13$lambda$12;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            startRestartGroup.endReplaceGroup();
                            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue8, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(505876110);
                            changed4 = startRestartGroup.changed(context);
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (!changed4 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                f = m6317unboximpl;
                                rememberedValue9 = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).build();
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            } else {
                                f = m6317unboximpl;
                            }
                            final WebViewAssetLoader webViewAssetLoader = (WebViewAssetLoader) rememberedValue9;
                            startRestartGroup.endReplaceGroup();
                            Intrinsics.checkNotNull(webViewAssetLoader);
                            Boolean valueOf2 = Boolean.valueOf(z);
                            startRestartGroup.startReplaceGroup(505882871);
                            changedInstance = startRestartGroup.changedInstance(muscleAtlasBridge) | startRestartGroup.changed(str) | startRestartGroup.changed(z);
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(muscleAtlasBridge, str, z, null);
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(str, valueOf2, (Function2) rememberedValue10, startRestartGroup, 0);
                            MuscleHeatmapView$lambda$9 = MuscleHeatmapView$lambda$9(mutableState);
                            startRestartGroup.startReplaceGroup(505886532);
                            if (MuscleHeatmapView$lambda$9 == null) {
                                f3 = f;
                                i11 = i4;
                                muscleHeatmapMode4 = muscleHeatmapMode3;
                                i10 = i17;
                                str2 = str;
                                z2 = z;
                                muscleAtlasBridge2 = muscleAtlasBridge;
                                map5 = map10;
                                f2 = 0.0f;
                                i12 = 1;
                                map6 = map9;
                            } else {
                                Float f4 = regionHours.get(MuscleHeatmapView$lambda$9);
                                float floatValue = (f4 == null && (f4 = (Float) map9.get(MuscleHeatmapView$lambda$9)) == null) ? 0.0f : f4.floatValue();
                                startRestartGroup.startReplaceGroup(22542493);
                                Object rememberedValue13 = startRestartGroup.rememberedValue();
                                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit MuscleHeatmapView$lambda$18$lambda$17$lambda$16;
                                            MuscleHeatmapView$lambda$18$lambda$17$lambda$16 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$18$lambda$17$lambda$16(MutableState.this);
                                            return MuscleHeatmapView$lambda$18$lambda$17$lambda$16;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                }
                                startRestartGroup.endReplaceGroup();
                                int i18 = i4 >> 3;
                                i10 = i17;
                                i11 = i4;
                                muscleHeatmapMode4 = muscleHeatmapMode3;
                                z2 = z;
                                i12 = 1;
                                map5 = map10;
                                map6 = map9;
                                f2 = 0.0f;
                                f3 = f;
                                str2 = str;
                                muscleAtlasBridge2 = muscleAtlasBridge;
                                MuscleLoadPopupKt.MuscleLoadDetailDialog(MuscleHeatmapView$lambda$9, floatValue, muscleHeatmapMode3, emptyMap, i9, (Function0) rememberedValue13, startRestartGroup, (i18 & 7168) | i17 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (57344 & i18), 0);
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, f2, i12, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            String str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            String str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
                            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            final String str7 = str2;
                            startRestartGroup.startMovableGroup(22551170, startRestartGroup.joinKey(Integer.valueOf(i9), str7));
                            Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), f3);
                            startRestartGroup.startReplaceGroup(22556030);
                            final MuscleAtlasBridge muscleAtlasBridge3 = muscleAtlasBridge2;
                            changedInstance2 = startRestartGroup.changedInstance(muscleAtlasBridge3) | startRestartGroup.changedInstance(webViewAssetLoader) | startRestartGroup.changed(rememberUpdatedState);
                            rememberedValue11 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                                        MuscleHeatmapView$lambda$33$lambda$22$lambda$21 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$22$lambda$21(MuscleAtlasBridge.this, webViewAssetLoader, rememberUpdatedState, (Context) obj);
                                        return MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                            }
                            Function1 function1 = (Function1) rememberedValue11;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(22623813);
                            changedInstance3 = startRestartGroup.changedInstance(muscleAtlasBridge3) | startRestartGroup.changed(str7) | startRestartGroup.changed(z2) | startRestartGroup.changedInstance(context) | startRestartGroup.changed(rememberUpdatedState);
                            rememberedValue12 = startRestartGroup.rememberedValue();
                            if (!changedInstance3 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                final boolean z3 = z2;
                                rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                                        MuscleHeatmapView$lambda$33$lambda$27$lambda$26 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge.this, str7, z3, context, rememberUpdatedState, mutableIntState, (WebView) obj);
                                        return MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                            }
                            startRestartGroup.endReplaceGroup();
                            AndroidView_androidKt.AndroidView(function1, m715height3ABfNKs, (Function1) rememberedValue12, startRestartGroup, 0, 0);
                            startRestartGroup.endMovableGroup();
                            Set entrySet = map6.entrySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : entrySet) {
                                if (((Number) ((Map.Entry) obj).getValue()).floatValue() > 0.1f) {
                                    arrayList.add(obj);
                                }
                            }
                            take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$lambda$33$$inlined$sortedByDescending$1
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                                }
                            }), 4);
                            startRestartGroup.startReplaceGroup(22653014);
                            if (!take.isEmpty()) {
                                Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, i12), false, null, false, 14, null);
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, horizontalScroll$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                                }
                                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-2046991080);
                                for (Map.Entry entry : take) {
                                    MuscleLoadPopupKt.MuscleLoadLegendChip((String) entry.getKey(), ((Number) entry.getValue()).floatValue(), muscleHeatmapMode4, emptyMap, startRestartGroup, i10 | ((i11 >> 3) & 7168), 0);
                                    str5 = str5;
                                    str6 = str6;
                                }
                                str3 = str6;
                                str4 = str5;
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null);
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g("Low", (Modifier) null, EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                            MuscleHeatmapMode muscleHeatmapMode6 = muscleHeatmapMode4;
                            TextKt.m2376Text4IGK_g(muscleHeatmapMode6 == MuscleHeatmapMode.Volume ? "Load · tap body" : "Rest · tap body", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                            TextKt.m2376Text4IGK_g("High", (Modifier) null, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            muscleHeatmapMode5 = muscleHeatmapMode6;
                            map7 = emptyMap;
                            i13 = i9;
                            map8 = map5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i9;
                            muscleHeatmapMode5 = muscleHeatmapMode2;
                            map8 = map3;
                            map7 = map4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    Unit MuscleHeatmapView$lambda$34;
                                    MuscleHeatmapView$lambda$34 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$34(regionHours, modifier4, muscleHeatmapMode5, map8, map7, i13, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                    return MuscleHeatmapView$lambda$34;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    map4 = map2;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i4 & 74899) == 74898) {
                    }
                    if (i14 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context2 = (Context) consume4;
                    ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Configuration configuration2 = (Configuration) consume22;
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume32;
                    int i152 = configuration2.screenWidthDp;
                    int i162 = configuration2.screenHeightDp;
                    startRestartGroup.startReplaceGroup(505833150);
                    changed = startRestartGroup.changed(i152) | startRestartGroup.changed(i162);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = Dp.m6301boximpl(Dp.m6303constructorimpl(Math.min(RangesKt.coerceIn(configuration2.screenWidthDp * 1.12f, 440.0f, 640.0f), configuration2.screenHeightDp * 0.52f)));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    float m6317unboximpl22 = ((Dp) rememberedValue).m6317unboximpl();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(505840869);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableIntState = (MutableIntState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    if (MuscleHeatmapView$lambda$2(mutableIntState) > 0) {
                    }
                    m6317unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6301boximpl(m6303constructorimpl), Dp.m6301boximpl(m6317unboximpl22))).m6317unboximpl();
                    startRestartGroup.startReplaceGroup(505849184);
                    changed2 = startRestartGroup.changed(regionHours) | ((458752 & i4) == 131072) | startRestartGroup.changed(context2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = MuscleBodyMap.toBodyStateJson$default(MuscleBodyMap.INSTANCE, regionHours, false, context2, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    str = (String) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(505853907);
                    int i172 = i4 & 896;
                    changed3 = startRestartGroup.changed(regionHours) | startRestartGroup.changed(map3) | (i172 == 256);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    if (muscleHeatmapMode3 == MuscleHeatmapMode.Volume) {
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    Map map92 = (Map) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                    if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                    }
                    startRestartGroup.startReplaceGroup(505865860);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    muscleAtlasBridge = (MuscleAtlasBridge) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(505867790);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    Modifier modifier32 = companion;
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState2 = (MutableState) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    Integer valueOf3 = Integer.valueOf(i9);
                    startRestartGroup.startReplaceGroup(505870282);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    Map<String, Float> map102 = map3;
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, (i4 >> 15) & 14);
                    startRestartGroup.startReplaceGroup(505873654);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue8, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(505876110);
                    changed4 = startRestartGroup.changed(context2);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changed4) {
                    }
                    f = m6317unboximpl;
                    rememberedValue9 = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context2)).build();
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                    final WebViewAssetLoader webViewAssetLoader2 = (WebViewAssetLoader) rememberedValue9;
                    startRestartGroup.endReplaceGroup();
                    Intrinsics.checkNotNull(webViewAssetLoader2);
                    Boolean valueOf22 = Boolean.valueOf(z);
                    startRestartGroup.startReplaceGroup(505882871);
                    changedInstance = startRestartGroup.changedInstance(muscleAtlasBridge) | startRestartGroup.changed(str) | startRestartGroup.changed(z);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue10 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(muscleAtlasBridge, str, z, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, valueOf22, (Function2) rememberedValue10, startRestartGroup, 0);
                    MuscleHeatmapView$lambda$9 = MuscleHeatmapView$lambda$9(mutableState2);
                    startRestartGroup.startReplaceGroup(505886532);
                    if (MuscleHeatmapView$lambda$9 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier32, f2, i12, null);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    String str52 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    String str62 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting()) {
                    }
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    final String str72 = str2;
                    startRestartGroup.startMovableGroup(22551170, startRestartGroup.joinKey(Integer.valueOf(i9), str72));
                    Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), f3);
                    startRestartGroup.startReplaceGroup(22556030);
                    final MuscleAtlasBridge muscleAtlasBridge32 = muscleAtlasBridge2;
                    changedInstance2 = startRestartGroup.changedInstance(muscleAtlasBridge32) | startRestartGroup.changedInstance(webViewAssetLoader2) | startRestartGroup.changed(rememberUpdatedState2);
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                            MuscleHeatmapView$lambda$33$lambda$22$lambda$21 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$22$lambda$21(MuscleAtlasBridge.this, webViewAssetLoader2, rememberUpdatedState2, (Context) obj2);
                            return MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                    Function1 function12 = (Function1) rememberedValue11;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(22623813);
                    changedInstance3 = startRestartGroup.changedInstance(muscleAtlasBridge32) | startRestartGroup.changed(str72) | startRestartGroup.changed(z2) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(rememberUpdatedState2);
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    final boolean z32 = z2;
                    rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                            MuscleHeatmapView$lambda$33$lambda$27$lambda$26 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge.this, str72, z32, context2, rememberUpdatedState2, mutableIntState, (WebView) obj2);
                            return MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                    startRestartGroup.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function12, m715height3ABfNKs2, (Function1) rememberedValue12, startRestartGroup, 0, 0);
                    startRestartGroup.endMovableGroup();
                    Set entrySet2 = map6.entrySet();
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$lambda$33$$inlined$sortedByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                        }
                    }), 4);
                    startRestartGroup.startReplaceGroup(22653014);
                    if (!take.isEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null);
                    Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl2.getInserting()) {
                    }
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash32);
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g("Low", (Modifier) null, EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                    MuscleHeatmapMode muscleHeatmapMode62 = muscleHeatmapMode4;
                    TextKt.m2376Text4IGK_g(muscleHeatmapMode62 == MuscleHeatmapMode.Volume ? "Load · tap body" : "Rest · tap body", (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                    TextKt.m2376Text4IGK_g("High", (Modifier) null, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                    muscleHeatmapMode5 = muscleHeatmapMode62;
                    map7 = emptyMap;
                    i13 = i9;
                    map8 = map5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                map3 = map;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                map4 = map2;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i4 & 74899) == 74898) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume42 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context22 = (Context) consume42;
                ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Configuration configuration22 = (Configuration) consume222;
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume322;
                int i1522 = configuration22.screenWidthDp;
                int i1622 = configuration22.screenHeightDp;
                startRestartGroup.startReplaceGroup(505833150);
                changed = startRestartGroup.changed(i1522) | startRestartGroup.changed(i1622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = Dp.m6301boximpl(Dp.m6303constructorimpl(Math.min(RangesKt.coerceIn(configuration22.screenWidthDp * 1.12f, 440.0f, 640.0f), configuration22.screenHeightDp * 0.52f)));
                startRestartGroup.updateRememberedValue(rememberedValue);
                float m6317unboximpl222 = ((Dp) rememberedValue).m6317unboximpl();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(505840869);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableIntState = (MutableIntState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                if (MuscleHeatmapView$lambda$2(mutableIntState) > 0) {
                }
                m6317unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6301boximpl(m6303constructorimpl), Dp.m6301boximpl(m6317unboximpl222))).m6317unboximpl();
                startRestartGroup.startReplaceGroup(505849184);
                changed2 = startRestartGroup.changed(regionHours) | ((458752 & i4) == 131072) | startRestartGroup.changed(context22);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = MuscleBodyMap.toBodyStateJson$default(MuscleBodyMap.INSTANCE, regionHours, false, context22, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                str = (String) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(505853907);
                int i1722 = i4 & 896;
                changed3 = startRestartGroup.changed(regionHours) | startRestartGroup.changed(map3) | (i1722 == 256);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                if (muscleHeatmapMode3 == MuscleHeatmapMode.Volume) {
                }
                startRestartGroup.updateRememberedValue(rememberedValue4);
                Map map922 = (Map) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                ColorScheme colorScheme22 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                }
                startRestartGroup.startReplaceGroup(505865860);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                muscleAtlasBridge = (MuscleAtlasBridge) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(505867790);
                rememberedValue6 = startRestartGroup.rememberedValue();
                Modifier modifier322 = companion;
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22 = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                Integer valueOf32 = Integer.valueOf(i9);
                startRestartGroup.startReplaceGroup(505870282);
                rememberedValue7 = startRestartGroup.rememberedValue();
                Map<String, Float> map1022 = map3;
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, (i4 >> 15) & 14);
                startRestartGroup.startReplaceGroup(505873654);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                final State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue8, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(505876110);
                changed4 = startRestartGroup.changed(context22);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (changed4) {
                }
                f = m6317unboximpl;
                rememberedValue9 = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context22)).build();
                startRestartGroup.updateRememberedValue(rememberedValue9);
                final WebViewAssetLoader webViewAssetLoader22 = (WebViewAssetLoader) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                Intrinsics.checkNotNull(webViewAssetLoader22);
                Boolean valueOf222 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(505882871);
                changedInstance = startRestartGroup.changedInstance(muscleAtlasBridge) | startRestartGroup.changed(str) | startRestartGroup.changed(z);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue10 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(muscleAtlasBridge, str, z, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(str, valueOf222, (Function2) rememberedValue10, startRestartGroup, 0);
                MuscleHeatmapView$lambda$9 = MuscleHeatmapView$lambda$9(mutableState22);
                startRestartGroup.startReplaceGroup(505886532);
                if (MuscleHeatmapView$lambda$9 == null) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(modifier322, f2, i12, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_432 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_432, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                String str522 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                String str622 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                final String str722 = str2;
                startRestartGroup.startMovableGroup(22551170, startRestartGroup.joinKey(Integer.valueOf(i9), str722));
                Modifier m715height3ABfNKs22 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), f3);
                startRestartGroup.startReplaceGroup(22556030);
                final MuscleAtlasBridge muscleAtlasBridge322 = muscleAtlasBridge2;
                changedInstance2 = startRestartGroup.changedInstance(muscleAtlasBridge322) | startRestartGroup.changedInstance(webViewAssetLoader22) | startRestartGroup.changed(rememberUpdatedState22);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                        MuscleHeatmapView$lambda$33$lambda$22$lambda$21 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$22$lambda$21(MuscleAtlasBridge.this, webViewAssetLoader22, rememberUpdatedState22, (Context) obj2);
                        return MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
                Function1 function122 = (Function1) rememberedValue11;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(22623813);
                changedInstance3 = startRestartGroup.changedInstance(muscleAtlasBridge322) | startRestartGroup.changed(str722) | startRestartGroup.changed(z2) | startRestartGroup.changedInstance(context22) | startRestartGroup.changed(rememberUpdatedState22);
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                final boolean z322 = z2;
                rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                        MuscleHeatmapView$lambda$33$lambda$27$lambda$26 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge.this, str722, z322, context22, rememberUpdatedState22, mutableIntState, (WebView) obj2);
                        return MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
                startRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function122, m715height3ABfNKs22, (Function1) rememberedValue12, startRestartGroup, 0, 0);
                startRestartGroup.endMovableGroup();
                Set entrySet22 = map6.entrySet();
                ArrayList arrayList22 = new ArrayList();
                while (r5.hasNext()) {
                }
                take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList22, new Comparator() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$lambda$33$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                    }
                }), 4);
                startRestartGroup.startReplaceGroup(22653014);
                if (!take.isEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null);
                Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting()) {
                }
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash322);
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g("Low", (Modifier) null, EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                MuscleHeatmapMode muscleHeatmapMode622 = muscleHeatmapMode4;
                TextKt.m2376Text4IGK_g(muscleHeatmapMode622 == MuscleHeatmapMode.Volume ? "Load · tap body" : "Rest · tap body", (Modifier) null, colorScheme22.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                TextKt.m2376Text4IGK_g("High", (Modifier) null, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier322;
                muscleHeatmapMode5 = muscleHeatmapMode622;
                map7 = emptyMap;
                i13 = i9;
                map8 = map5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            muscleHeatmapMode2 = muscleHeatmapMode;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            map3 = map;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            map4 = map2;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i4 & 74899) == 74898) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume422 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context222 = (Context) consume422;
            ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Configuration configuration222 = (Configuration) consume2222;
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density222 = (Density) consume3222;
            int i15222 = configuration222.screenWidthDp;
            int i16222 = configuration222.screenHeightDp;
            startRestartGroup.startReplaceGroup(505833150);
            changed = startRestartGroup.changed(i15222) | startRestartGroup.changed(i16222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = Dp.m6301boximpl(Dp.m6303constructorimpl(Math.min(RangesKt.coerceIn(configuration222.screenWidthDp * 1.12f, 440.0f, 640.0f), configuration222.screenHeightDp * 0.52f)));
            startRestartGroup.updateRememberedValue(rememberedValue);
            float m6317unboximpl2222 = ((Dp) rememberedValue).m6317unboximpl();
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(505840869);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableIntState = (MutableIntState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            if (MuscleHeatmapView$lambda$2(mutableIntState) > 0) {
            }
            m6317unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6301boximpl(m6303constructorimpl), Dp.m6301boximpl(m6317unboximpl2222))).m6317unboximpl();
            startRestartGroup.startReplaceGroup(505849184);
            changed2 = startRestartGroup.changed(regionHours) | ((458752 & i4) == 131072) | startRestartGroup.changed(context222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = MuscleBodyMap.toBodyStateJson$default(MuscleBodyMap.INSTANCE, regionHours, false, context222, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            str = (String) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(505853907);
            int i17222 = i4 & 896;
            changed3 = startRestartGroup.changed(regionHours) | startRestartGroup.changed(map3) | (i17222 == 256);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            if (muscleHeatmapMode3 == MuscleHeatmapMode.Volume) {
            }
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Map map9222 = (Map) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            ColorScheme colorScheme222 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
            }
            startRestartGroup.startReplaceGroup(505865860);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            muscleAtlasBridge = (MuscleAtlasBridge) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(505867790);
            rememberedValue6 = startRestartGroup.rememberedValue();
            Modifier modifier3222 = companion;
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            Integer valueOf322 = Integer.valueOf(i9);
            startRestartGroup.startReplaceGroup(505870282);
            rememberedValue7 = startRestartGroup.rememberedValue();
            Map<String, Float> map10222 = map3;
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, (i4 >> 15) & 14);
            startRestartGroup.startReplaceGroup(505873654);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            final State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue8, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(505876110);
            changed4 = startRestartGroup.changed(context222);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed4) {
            }
            f = m6317unboximpl;
            rememberedValue9 = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context222)).build();
            startRestartGroup.updateRememberedValue(rememberedValue9);
            final WebViewAssetLoader webViewAssetLoader222 = (WebViewAssetLoader) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            Intrinsics.checkNotNull(webViewAssetLoader222);
            Boolean valueOf2222 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(505882871);
            changedInstance = startRestartGroup.changedInstance(muscleAtlasBridge) | startRestartGroup.changed(str) | startRestartGroup.changed(z);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue10 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(muscleAtlasBridge, str, z, null);
            startRestartGroup.updateRememberedValue(rememberedValue10);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(str, valueOf2222, (Function2) rememberedValue10, startRestartGroup, 0);
            MuscleHeatmapView$lambda$9 = MuscleHeatmapView$lambda$9(mutableState222);
            startRestartGroup.startReplaceGroup(505886532);
            if (MuscleHeatmapView$lambda$9 == null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(modifier3222, f2, i12, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4322 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4322, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            String str5222 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default322);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            String str6222 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            final String str7222 = str2;
            startRestartGroup.startMovableGroup(22551170, startRestartGroup.joinKey(Integer.valueOf(i9), str7222));
            Modifier m715height3ABfNKs222 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), f3);
            startRestartGroup.startReplaceGroup(22556030);
            final MuscleAtlasBridge muscleAtlasBridge3222 = muscleAtlasBridge2;
            changedInstance2 = startRestartGroup.changedInstance(muscleAtlasBridge3222) | startRestartGroup.changedInstance(webViewAssetLoader222) | startRestartGroup.changed(rememberUpdatedState222);
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                    MuscleHeatmapView$lambda$33$lambda$22$lambda$21 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$22$lambda$21(MuscleAtlasBridge.this, webViewAssetLoader222, rememberUpdatedState222, (Context) obj2);
                    return MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue11);
            Function1 function1222 = (Function1) rememberedValue11;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(22623813);
            changedInstance3 = startRestartGroup.changedInstance(muscleAtlasBridge3222) | startRestartGroup.changed(str7222) | startRestartGroup.changed(z2) | startRestartGroup.changedInstance(context222) | startRestartGroup.changed(rememberUpdatedState222);
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            final boolean z3222 = z2;
            rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                    MuscleHeatmapView$lambda$33$lambda$27$lambda$26 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge.this, str7222, z3222, context222, rememberUpdatedState222, mutableIntState, (WebView) obj2);
                    return MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue12);
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1222, m715height3ABfNKs222, (Function1) rememberedValue12, startRestartGroup, 0, 0);
            startRestartGroup.endMovableGroup();
            Set entrySet222 = map6.entrySet();
            ArrayList arrayList222 = new ArrayList();
            while (r5.hasNext()) {
            }
            take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList222, new Comparator() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$lambda$33$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                }
            }), 4);
            startRestartGroup.startReplaceGroup(22653014);
            if (!take.isEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null);
            Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceBetween222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl2.getInserting()) {
            }
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3222);
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g("Low", (Modifier) null, EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
            MuscleHeatmapMode muscleHeatmapMode6222 = muscleHeatmapMode4;
            TextKt.m2376Text4IGK_g(muscleHeatmapMode6222 == MuscleHeatmapMode.Volume ? "Load · tap body" : "Rest · tap body", (Modifier) null, colorScheme222.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
            TextKt.m2376Text4IGK_g("High", (Modifier) null, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3222;
            muscleHeatmapMode5 = muscleHeatmapMode6222;
            map7 = emptyMap;
            i13 = i9;
            map8 = map5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        muscleHeatmapMode2 = muscleHeatmapMode;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        map3 = map;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        map4 = map2;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i4 & 74899) == 74898) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2222 = (Context) consume4222;
        ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Configuration configuration2222 = (Configuration) consume22222;
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2222 = (Density) consume32222;
        int i152222 = configuration2222.screenWidthDp;
        int i162222 = configuration2222.screenHeightDp;
        startRestartGroup.startReplaceGroup(505833150);
        changed = startRestartGroup.changed(i152222) | startRestartGroup.changed(i162222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Dp.m6301boximpl(Dp.m6303constructorimpl(Math.min(RangesKt.coerceIn(configuration2222.screenWidthDp * 1.12f, 440.0f, 640.0f), configuration2222.screenHeightDp * 0.52f)));
        startRestartGroup.updateRememberedValue(rememberedValue);
        float m6317unboximpl22222 = ((Dp) rememberedValue).m6317unboximpl();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(505840869);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableIntState = (MutableIntState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        if (MuscleHeatmapView$lambda$2(mutableIntState) > 0) {
        }
        m6317unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6301boximpl(m6303constructorimpl), Dp.m6301boximpl(m6317unboximpl22222))).m6317unboximpl();
        startRestartGroup.startReplaceGroup(505849184);
        changed2 = startRestartGroup.changed(regionHours) | ((458752 & i4) == 131072) | startRestartGroup.changed(context2222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = MuscleBodyMap.toBodyStateJson$default(MuscleBodyMap.INSTANCE, regionHours, false, context2222, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        str = (String) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(505853907);
        int i172222 = i4 & 896;
        changed3 = startRestartGroup.changed(regionHours) | startRestartGroup.changed(map3) | (i172222 == 256);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        if (muscleHeatmapMode3 == MuscleHeatmapMode.Volume) {
        }
        startRestartGroup.updateRememberedValue(rememberedValue4);
        Map map92222 = (Map) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        ColorScheme colorScheme2222 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
        }
        startRestartGroup.startReplaceGroup(505865860);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        muscleAtlasBridge = (MuscleAtlasBridge) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(505867790);
        rememberedValue6 = startRestartGroup.rememberedValue();
        Modifier modifier32222 = companion;
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        Integer valueOf3222 = Integer.valueOf(i9);
        startRestartGroup.startReplaceGroup(505870282);
        rememberedValue7 = startRestartGroup.rememberedValue();
        Map<String, Float> map102222 = map3;
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf3222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, (i4 >> 15) & 14);
        startRestartGroup.startReplaceGroup(505873654);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue8, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(505876110);
        changed4 = startRestartGroup.changed(context2222);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (changed4) {
        }
        f = m6317unboximpl;
        rememberedValue9 = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context2222)).build();
        startRestartGroup.updateRememberedValue(rememberedValue9);
        final WebViewAssetLoader webViewAssetLoader2222 = (WebViewAssetLoader) rememberedValue9;
        startRestartGroup.endReplaceGroup();
        Intrinsics.checkNotNull(webViewAssetLoader2222);
        Boolean valueOf22222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(505882871);
        changedInstance = startRestartGroup.changedInstance(muscleAtlasBridge) | startRestartGroup.changed(str) | startRestartGroup.changed(z);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue10 = (Function2) new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(muscleAtlasBridge, str, z, null);
        startRestartGroup.updateRememberedValue(rememberedValue10);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, valueOf22222, (Function2) rememberedValue10, startRestartGroup, 0);
        MuscleHeatmapView$lambda$9 = MuscleHeatmapView$lambda$9(mutableState2222);
        startRestartGroup.startReplaceGroup(505886532);
        if (MuscleHeatmapView$lambda$9 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default3222 = SizeKt.fillMaxWidth$default(modifier32222, f2, i12, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_43222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        String str52222 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        String str62222 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        final String str72222 = str2;
        startRestartGroup.startMovableGroup(22551170, startRestartGroup.joinKey(Integer.valueOf(i9), str72222));
        Modifier m715height3ABfNKs2222 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null), f3);
        startRestartGroup.startReplaceGroup(22556030);
        final MuscleAtlasBridge muscleAtlasBridge32222 = muscleAtlasBridge2;
        changedInstance2 = startRestartGroup.changedInstance(muscleAtlasBridge32222) | startRestartGroup.changedInstance(webViewAssetLoader2222) | startRestartGroup.changed(rememberUpdatedState2222);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
                MuscleHeatmapView$lambda$33$lambda$22$lambda$21 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$22$lambda$21(MuscleAtlasBridge.this, webViewAssetLoader2222, rememberUpdatedState2222, (Context) obj2);
                return MuscleHeatmapView$lambda$33$lambda$22$lambda$21;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue11);
        Function1 function12222 = (Function1) rememberedValue11;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(22623813);
        changedInstance3 = startRestartGroup.changedInstance(muscleAtlasBridge32222) | startRestartGroup.changed(str72222) | startRestartGroup.changed(z2) | startRestartGroup.changedInstance(context2222) | startRestartGroup.changed(rememberUpdatedState2222);
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        final boolean z32222 = z2;
        rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
                MuscleHeatmapView$lambda$33$lambda$27$lambda$26 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge.this, str72222, z32222, context2222, rememberUpdatedState2222, mutableIntState, (WebView) obj2);
                return MuscleHeatmapView$lambda$33$lambda$27$lambda$26;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue12);
        startRestartGroup.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function12222, m715height3ABfNKs2222, (Function1) rememberedValue12, startRestartGroup, 0, 0);
        startRestartGroup.endMovableGroup();
        Set entrySet2222 = map6.entrySet();
        ArrayList arrayList2222 = new ArrayList();
        while (r5.hasNext()) {
        }
        take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList2222, new Comparator() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$lambda$33$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
            }
        }), 4);
        startRestartGroup.startReplaceGroup(22653014);
        if (!take.isEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i12, null);
        Arrangement.HorizontalOrVertical spaceBetween2222 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(spaceBetween2222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str4);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash32222);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Low", (Modifier) null, EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
        MuscleHeatmapMode muscleHeatmapMode62222 = muscleHeatmapMode4;
        TextKt.m2376Text4IGK_g(muscleHeatmapMode62222 == MuscleHeatmapMode.Volume ? "Load · tap body" : "Rest · tap body", (Modifier) null, colorScheme2222.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
        TextKt.m2376Text4IGK_g("High", (Modifier) null, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 196614, 0, 65498);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32222;
        muscleHeatmapMode5 = muscleHeatmapMode62222;
        map7 = emptyMap;
        i13 = i9;
        map8 = map5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final int MuscleHeatmapView$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final String MuscleHeatmapView$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$13$lambda$12(MutableState mutableState, String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        mutableState.setValue(region);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$18$lambda$17$lambda$16(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView MuscleHeatmapView$lambda$33$lambda$22$lambda$21(final MuscleAtlasBridge muscleAtlasBridge, final WebViewAssetLoader webViewAssetLoader, final State state, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        WebView webView = new WebView(ctx);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        webView.setNestedScrollingEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setMixedContentMode(1);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setGeolocationEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setClickable(true);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.addJavascriptInterface(muscleAtlasBridge, "AndroidBridge");
        webView.setWebViewClient(new WebViewClient() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$4$1$1$1$2
            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                return WebViewAssetLoader.this.shouldInterceptRequest(request.getUrl());
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                MuscleHeatmapViewKt.bindMuscleBridge(view, muscleAtlasBridge, state.getValue());
            }
        });
        webView.loadUrl(ATLAS_URL);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26(MuscleAtlasBridge muscleAtlasBridge, String str, boolean z, final Context context, final State state, final MutableIntState mutableIntState, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$23;
                MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$23 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$23(view, motionEvent);
                return MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$23;
            }
        });
        muscleAtlasBridge.setLatestJson(str);
        muscleAtlasBridge.setDarkTheme(z);
        muscleAtlasBridge.setMuscleClickHandler(new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$24;
                MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$24 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$24(context, state, (String) obj);
                return MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$24;
            }
        });
        muscleAtlasBridge.setHeightReadyHandler(new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$25;
                MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$25 = MuscleHeatmapViewKt.MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$25(MutableIntState.this, ((Integer) obj).intValue());
                return MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$25;
            }
        });
        mainHandlerPostInject(webView, muscleAtlasBridge);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$23(View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getAction() != 0 || (parent = view.getParent()) == null) {
            return false;
        }
        parent.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$24(Context context, State state, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String regionForMuscleId = MuscleBodyMap.INSTANCE.regionForMuscleId(id, context);
        if (regionForMuscleId.length() > 0) {
            ((Function1) state.getValue()).invoke(regionForMuscleId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleHeatmapView$lambda$33$lambda$27$lambda$26$lambda$25(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMuscleBridge(final WebView webView, MuscleAtlasBridge muscleAtlasBridge, final Function1<? super String, Unit> function1) {
        muscleAtlasBridge.setMuscleClickHandler(new Function1() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit bindMuscleBridge$lambda$35;
                bindMuscleBridge$lambda$35 = MuscleHeatmapViewKt.bindMuscleBridge$lambda$35(webView, function1, (String) obj);
                return bindMuscleBridge$lambda$35;
            }
        });
        mainHandlerPostInject(webView, muscleAtlasBridge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindMuscleBridge$lambda$35(WebView webView, Function1 function1, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        MuscleBodyMap muscleBodyMap = MuscleBodyMap.INSTANCE;
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String regionForMuscleId = muscleBodyMap.regionForMuscleId(id, context);
        if (regionForMuscleId.length() > 0) {
            function1.invoke(regionForMuscleId);
        }
        return Unit.INSTANCE;
    }

    private static final void mainHandlerPostInject(final WebView webView, final MuscleAtlasBridge muscleAtlasBridge) {
        injectHandler.removeCallbacksAndMessages(webView);
        Iterator it = CollectionsKt.listOf((Object[]) new Long[]{80L, 300L, 750L}).iterator();
        while (it.hasNext()) {
            injectHandler.postAtTime(new Runnable() { // from class: com.example.rungps.ui.components.MuscleHeatmapViewKt$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    MuscleHeatmapViewKt.mainHandlerPostInject$lambda$37$lambda$36(webView, muscleAtlasBridge);
                }
            }, webView, System.currentTimeMillis() + ((Number) it.next()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mainHandlerPostInject$lambda$37$lambda$36(WebView webView, MuscleAtlasBridge muscleAtlasBridge) {
        injectMuscleTheme(webView, muscleAtlasBridge.getDarkTheme());
        injectMuscleState(webView, muscleAtlasBridge.getLatestJson());
    }

    private static final void injectMuscleTheme(WebView webView, boolean z) {
        try {
            Result.Companion companion = Result.INSTANCE;
            webView.evaluateJavascript("window.setAtlasTheme&&window.setAtlasTheme(" + (z ? "true" : "false") + ");", null);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    private static final void injectMuscleState(WebView webView, String str) {
        String quote = JSONObject.quote(str);
        try {
            Result.Companion companion = Result.INSTANCE;
            webView.evaluateJavascript("(function(){try{var s=" + quote + ";var o=JSON.parse(s);if(window.updateMuscleState)window.updateMuscleState(o);if(window.attachMuscleTapHandlers)window.attachMuscleTapHandlers();}catch(e){console.error(e);}})();", null);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    private static final Map<String, Float> resolveRegionLoadForLegend(Map<String, Float> map) {
        return MuscleBodyMap.INSTANCE.resolveRegionLoadForDisplay(map);
    }
}
