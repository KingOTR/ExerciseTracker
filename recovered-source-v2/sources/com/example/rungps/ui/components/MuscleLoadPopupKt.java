package com.example.rungps.ui.components;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.MuscleAnatomyCatalog;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import com.example.rungps.recovery.RegionRecentLoad;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MuscleLoadPopup.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u001aQ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0014\u001aI\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"tonnageKgForHeatmapRegion", "", "region", "", "kgByUserTag", "", "MuscleLoadDetailDialog", "", "loadValue", "", "mode", "Lcom/example/rungps/ui/components/MuscleHeatmapMode;", "volumeDaysBack", "", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;FLcom/example/rungps/ui/components/MuscleHeatmapMode;Ljava/util/Map;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MuscleLoadLegendChip", Values.VECTOR_MAP_VECTORS_KEY, "kgByGroup", "(Ljava/lang/String;FLcom/example/rungps/ui/components/MuscleHeatmapMode;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "MuscleLoadLegend", "loads", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/Map;Lcom/example/rungps/ui/components/MuscleHeatmapMode;Landroidx/compose/ui/Modifier;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "formatLoadLabel", "app_sideload", "recent", "Lcom/example/rungps/recovery/RegionRecentLoad;", "showDialog", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleLoadPopupKt {

    /* compiled from: MuscleLoadPopup.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MuscleHeatmapMode.values().length];
            try {
                iArr[MuscleHeatmapMode.Volume.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MuscleHeatmapMode.Recovery.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleLoadDetailDialog$lambda$7(String str, float f, MuscleHeatmapMode muscleHeatmapMode, Map map, int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        MuscleLoadDetailDialog(str, f, muscleHeatmapMode, map, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleLoadLegend$lambda$20(Map map, MuscleHeatmapMode muscleHeatmapMode, Modifier modifier, Map map2, int i, int i2, Composer composer, int i3) {
        MuscleLoadLegend(map, muscleHeatmapMode, modifier, map2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleLoadLegendChip$lambda$15(String str, float f, MuscleHeatmapMode muscleHeatmapMode, Map map, int i, int i2, Composer composer, int i3) {
        MuscleLoadLegendChip(str, f, muscleHeatmapMode, map, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final double tonnageKgForHeatmapRegion(String region, Map<String, Double> kgByUserTag) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(kgByUserTag, "kgByUserTag");
        String lowerCase2 = StringsKt.trim((CharSequence) region).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (lowerCase2.length() == 0) {
            return 0.0d;
        }
        Iterator<T> it = kgByUserTag.entrySet().iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            double doubleValue = ((Number) entry.getValue()).doubleValue();
            if (doubleValue > 0.0d) {
                String groupToRegion = MuscleHeatmapRegions.INSTANCE.groupToRegion(str);
                if (groupToRegion != null) {
                    lowerCase = groupToRegion.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                lowerCase = MuscleHeatmapRegions.INSTANCE.regionForUserTag(str).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!Intrinsics.areEqual(lowerCase, lowerCase2)) {
                    if (StringsKt.equals(StringsKt.trim((CharSequence) str).toString(), region, true)) {
                    }
                }
                d += doubleValue;
            }
            doubleValue = 0.0d;
            d += doubleValue;
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MuscleLoadDetailDialog(final String region, final float f, final MuscleHeatmapMode mode, final Map<String, Double> kgByUserTag, int i, final Function0<Unit> onDismiss, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean changed;
        Object rememberedValue;
        int i8;
        boolean z;
        Object rememberedValue2;
        int coerceIn;
        boolean changed2;
        Object rememberedValue3;
        MutableState mutableState;
        Integer valueOf;
        boolean changed3;
        Object rememberedValue4;
        Integer num;
        int i9;
        MutableState mutableState2;
        int i10;
        int i11;
        double tonnageKg;
        int i12;
        String str;
        Composer composer2;
        final int i13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(kgByUserTag, "kgByUserTag");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-15765547);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(region) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(mode) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(kgByUserTag) ? 2048 : 1024;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
            }
            i6 = i4;
            if ((74899 & i6) == 74898 || !startRestartGroup.getSkipping()) {
                i7 = i14 == 0 ? 90 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-15765547, i6, -1, "com.example.rungps.ui.components.MuscleLoadDetailDialog (MuscleLoadPopup.kt:59)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceGroup(575389809);
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Repository repository = (Repository) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(575391621);
                i8 = i6 & 14;
                z = i8 != 4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = MuscleAnatomyCatalog.INSTANCE.infoFor(region);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MuscleAnatomyCatalog.RegionInfo regionInfo = (MuscleAnatomyCatalog.RegionInfo) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                coerceIn = RangesKt.coerceIn(i7, 7, 365);
                startRestartGroup.startReplaceGroup(575395566);
                changed2 = (i8 != 4) | startRestartGroup.changed(coerceIn);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                valueOf = Integer.valueOf(coerceIn);
                startRestartGroup.startReplaceGroup(575398792);
                changed3 = (i8 != 4) | startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(coerceIn);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    num = valueOf;
                    i9 = coerceIn;
                    mutableState2 = mutableState;
                    i10 = i7;
                    i11 = i8;
                    rememberedValue4 = (Function2) new MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1(repository, region, coerceIn, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    num = valueOf;
                    i9 = coerceIn;
                    mutableState2 = mutableState;
                    i10 = i7;
                    i11 = i8;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(region, num, (Function2) rememberedValue4, startRestartGroup, i11);
                double d = tonnageKgForHeatmapRegion(region, kgByUserTag);
                RegionRecentLoad MuscleLoadDetailDialog$lambda$4 = MuscleLoadDetailDialog$lambda$4(mutableState2);
                tonnageKg = MuscleLoadDetailDialog$lambda$4 == null ? MuscleLoadDetailDialog$lambda$4.getTonnageKg() : 0.0d;
                if (tonnageKg <= 0.0d) {
                    d = tonnageKg;
                } else if (d <= 0.0d) {
                    d = (mode != MuscleHeatmapMode.Volume || f <= 0.0f) ? 0.0d : f;
                }
                i12 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                if (i12 == 1) {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (f > 0.05f) {
                        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        str = format + " h recovery";
                    } else {
                        str = "Recovery cleared";
                    }
                } else if (d > 0.0d) {
                    String format2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    str = format2 + " kg · " + i9 + " days";
                } else {
                    str = "No load logged · " + i9 + " days";
                }
                final String str2 = str;
                final MutableState mutableState3 = mutableState2;
                int i15 = i10;
                composer2 = startRestartGroup;
                AlertDialogKt.BasicAlertDialog(onDismiss, null, null, ComposableLambdaKt.rememberComposableLambda(-1184300709, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        invoke(composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i16) {
                        if ((i16 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1184300709, i16, -1, "com.example.rungps.ui.components.MuscleLoadDetailDialog.<anonymous> (MuscleLoadPopup.kt:87)");
                            }
                            RoundedCornerShape m967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(20));
                            float m6303constructorimpl = Dp.m6303constructorimpl(6);
                            final MuscleAnatomyCatalog.RegionInfo regionInfo2 = MuscleAnatomyCatalog.RegionInfo.this;
                            final String str3 = str2;
                            final MuscleHeatmapMode muscleHeatmapMode = mode;
                            final MutableState<RegionRecentLoad> mutableState4 = mutableState3;
                            final Function0<Unit> function0 = onDismiss;
                            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.92f), m967RoundedCornerShape0680j_4, 0L, 0L, m6303constructorimpl, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1134049738, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num2) {
                                    invoke(composer4, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:61:0x0500  */
                                /* JADX WARN: Removed duplicated region for block: B:64:0x050c  */
                                /* JADX WARN: Removed duplicated region for block: B:71:0x05a3  */
                                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:75:0x0510  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer4, int i17) {
                                    RegionRecentLoad MuscleLoadDetailDialog$lambda$42;
                                    String str4;
                                    String str5;
                                    String str6;
                                    String str7;
                                    Composer composer5;
                                    int currentCompositeKeyHash;
                                    Composer m3336constructorimpl;
                                    if ((i17 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1134049738, i17, -1, "com.example.rungps.ui.components.MuscleLoadDetailDialog.<anonymous>.<anonymous> (MuscleLoadPopup.kt:92)");
                                        }
                                        Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(20), Dp.m6303constructorimpl(16));
                                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                                        MuscleAnatomyCatalog.RegionInfo regionInfo3 = MuscleAnatomyCatalog.RegionInfo.this;
                                        String str8 = str3;
                                        MuscleHeatmapMode muscleHeatmapMode2 = muscleHeatmapMode;
                                        MutableState<RegionRecentLoad> mutableState5 = mutableState4;
                                        Function0<Unit> function02 = function0;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m685paddingVpY3zN4);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        TextKt.m2376Text4IGK_g(regionInfo3.getDisplayName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleMedium(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                        TextKt.m2376Text4IGK_g(str8, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                        MuscleLoadDetailDialog$lambda$42 = MuscleLoadPopupKt.MuscleLoadDetailDialog$lambda$4(mutableState5);
                                        Object obj = null;
                                        List<RegionRecentLoad.ExerciseTonnageLine> exercises = MuscleLoadDetailDialog$lambda$42 != null ? MuscleLoadDetailDialog$lambda$42.getExercises() : null;
                                        if (exercises == null) {
                                            exercises = CollectionsKt.emptyList();
                                        }
                                        List<RegionRecentLoad.ExerciseTonnageLine> take = CollectionsKt.take(exercises, 5);
                                        String str9 = "C101@5126L9:Row.kt#2w3rfo";
                                        String str10 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                        int i18 = 693286680;
                                        float f2 = 0.0f;
                                        int i19 = 1;
                                        if (!take.isEmpty()) {
                                            Composer composer6 = composer4;
                                            composer6.startReplaceGroup(1490093034);
                                            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer6, 6);
                                            String str11 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str11);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer6, verticalScroll$default);
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            String str12 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str12);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer6.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer4);
                                            Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                                            }
                                            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            composer6.startReplaceGroup(1444479473);
                                            for (RegionRecentLoad.ExerciseTonnageLine exerciseTonnageLine : take) {
                                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i19, obj);
                                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                ComposerKt.sourceInformationMarkerStart(composer6, i18, str10);
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer6, 6);
                                                ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str11);
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str12);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer6.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer4);
                                                Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
                                                }
                                                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer6, -407840262, str9);
                                                TextKt.m2376Text4IGK_g(exerciseTonnageLine.getExerciseName(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodyMedium(), composer4, 0, 0, 65532);
                                                String format3 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(exerciseTonnageLine.getTonnageKg())}, 1));
                                                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                                                TextKt.m2376Text4IGK_g(format3 + " kg", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelLarge(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer6 = composer4;
                                                str11 = str11;
                                                str12 = str12;
                                                str10 = str10;
                                                str9 = str9;
                                                f2 = 0.0f;
                                                i19 = 1;
                                                i18 = 693286680;
                                                obj = null;
                                            }
                                            str6 = str11;
                                            str7 = str12;
                                            str4 = str10;
                                            str5 = str9;
                                            composer4.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endReplaceGroup();
                                        } else {
                                            str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                            str5 = "C101@5126L9:Row.kt#2w3rfo";
                                            str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                            str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                            if (muscleHeatmapMode2 == MuscleHeatmapMode.Volume) {
                                                composer4.startReplaceGroup(1491328229);
                                                TextKt.m2376Text4IGK_g("No sets mapped here in the last week.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 6, 0, 65530);
                                                composer4.endReplaceGroup();
                                            } else {
                                                composer5 = composer4;
                                                composer5.startReplaceGroup(1491593465);
                                                composer4.endReplaceGroup();
                                                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str4);
                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer5, 6);
                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str6);
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str7);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (!composer4.getInserting()) {
                                                    composer5.createNode(constructor4);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                m3336constructorimpl = Updater.m3336constructorimpl(composer4);
                                                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                                }
                                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer5, -407840262, str5);
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$MuscleLoadPopupKt.INSTANCE.m6954getLambda1$app_sideload(), composer4, 805306368, 510);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    return;
                                                }
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                        }
                                        composer5 = composer4;
                                        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.Horizontal end2 = Arrangement.INSTANCE.getEnd();
                                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str4);
                                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(end2, Alignment.INSTANCE.getTop(), composer5, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str6);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default22);
                                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str7);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                        }
                                        composer4.startReusableNode();
                                        if (!composer4.getInserting()) {
                                        }
                                        m3336constructorimpl = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3336constructorimpl.getInserting()) {
                                        }
                                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer5, -407840262, str5);
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$MuscleLoadPopupKt.INSTANCE.m6954getLambda1$app_sideload(), composer4, 805306368, 510);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 12607494, 108);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), composer2, ((i6 >> 15) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i15;
            } else {
                startRestartGroup.skipToGroupEnd();
                i13 = i5;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MuscleLoadDetailDialog$lambda$7;
                        MuscleLoadDetailDialog$lambda$7 = MuscleLoadPopupKt.MuscleLoadDetailDialog$lambda$7(region, f, mode, kgByUserTag, i13, onDismiss, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return MuscleLoadDetailDialog$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if ((i3 & 32) == 0) {
        }
        i6 = i4;
        if ((74899 & i6) == 74898) {
        }
        if (i14 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        startRestartGroup.startReplaceGroup(575389809);
        changed = startRestartGroup.changed(context2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Repository.INSTANCE.get(context2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        Repository repository2 = (Repository) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(575391621);
        i8 = i6 & 14;
        if (i8 != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = MuscleAnatomyCatalog.INSTANCE.infoFor(region);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final MuscleAnatomyCatalog.RegionInfo regionInfo2 = (MuscleAnatomyCatalog.RegionInfo) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        coerceIn = RangesKt.coerceIn(i7, 7, 365);
        startRestartGroup.startReplaceGroup(575395566);
        changed2 = (i8 != 4) | startRestartGroup.changed(coerceIn);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        valueOf = Integer.valueOf(coerceIn);
        startRestartGroup.startReplaceGroup(575398792);
        changed3 = (i8 != 4) | startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(coerceIn);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        num = valueOf;
        i9 = coerceIn;
        mutableState2 = mutableState;
        i10 = i7;
        i11 = i8;
        rememberedValue4 = (Function2) new MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1(repository2, region, coerceIn, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(region, num, (Function2) rememberedValue4, startRestartGroup, i11);
        double d2 = tonnageKgForHeatmapRegion(region, kgByUserTag);
        RegionRecentLoad MuscleLoadDetailDialog$lambda$42 = MuscleLoadDetailDialog$lambda$4(mutableState2);
        if (MuscleLoadDetailDialog$lambda$42 == null) {
        }
        if (tonnageKg <= 0.0d) {
        }
        i12 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i12 == 1) {
        }
        final String str22 = str;
        final MutableState<RegionRecentLoad> mutableState32 = mutableState2;
        int i152 = i10;
        composer2 = startRestartGroup;
        AlertDialogKt.BasicAlertDialog(onDismiss, null, null, ComposableLambdaKt.rememberComposableLambda(-1184300709, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                invoke(composer3, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i16) {
                if ((i16 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1184300709, i16, -1, "com.example.rungps.ui.components.MuscleLoadDetailDialog.<anonymous> (MuscleLoadPopup.kt:87)");
                    }
                    RoundedCornerShape m967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(20));
                    float m6303constructorimpl = Dp.m6303constructorimpl(6);
                    final MuscleAnatomyCatalog.RegionInfo regionInfo22 = MuscleAnatomyCatalog.RegionInfo.this;
                    final String str3 = str22;
                    final MuscleHeatmapMode muscleHeatmapMode = mode;
                    final MutableState<RegionRecentLoad> mutableState4 = mutableState32;
                    final Function0<Unit> function0 = onDismiss;
                    SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.92f), m967RoundedCornerShape0680j_4, 0L, 0L, m6303constructorimpl, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1134049738, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num2) {
                            invoke(composer4, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:61:0x0500  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x050c  */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x05a3  */
                        /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:75:0x0510  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer4, int i17) {
                            RegionRecentLoad MuscleLoadDetailDialog$lambda$422;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            Composer composer5;
                            int currentCompositeKeyHash;
                            Composer m3336constructorimpl;
                            if ((i17 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1134049738, i17, -1, "com.example.rungps.ui.components.MuscleLoadDetailDialog.<anonymous>.<anonymous> (MuscleLoadPopup.kt:92)");
                                }
                                Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(20), Dp.m6303constructorimpl(16));
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                                MuscleAnatomyCatalog.RegionInfo regionInfo3 = MuscleAnatomyCatalog.RegionInfo.this;
                                String str8 = str3;
                                MuscleHeatmapMode muscleHeatmapMode2 = muscleHeatmapMode;
                                MutableState<RegionRecentLoad> mutableState5 = mutableState4;
                                Function0<Unit> function02 = function0;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 6);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m685paddingVpY3zN4);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer4);
                                Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                                }
                                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                TextKt.m2376Text4IGK_g(regionInfo3.getDisplayName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleMedium(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                TextKt.m2376Text4IGK_g(str8, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                MuscleLoadDetailDialog$lambda$422 = MuscleLoadPopupKt.MuscleLoadDetailDialog$lambda$4(mutableState5);
                                Object obj = null;
                                List<RegionRecentLoad.ExerciseTonnageLine> exercises = MuscleLoadDetailDialog$lambda$422 != null ? MuscleLoadDetailDialog$lambda$422.getExercises() : null;
                                if (exercises == null) {
                                    exercises = CollectionsKt.emptyList();
                                }
                                List<RegionRecentLoad.ExerciseTonnageLine> take = CollectionsKt.take(exercises, 5);
                                String str9 = "C101@5126L9:Row.kt#2w3rfo";
                                String str10 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                int i18 = 693286680;
                                float f2 = 0.0f;
                                int i19 = 1;
                                if (!take.isEmpty()) {
                                    Composer composer6 = composer4;
                                    composer6.startReplaceGroup(1490093034);
                                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                    ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer6, 6);
                                    String str11 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str11);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer6, verticalScroll$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    String str12 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                    ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str12);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer6.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer4);
                                    Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composer6.startReplaceGroup(1444479473);
                                    for (RegionRecentLoad.ExerciseTonnageLine exerciseTonnageLine : take) {
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, i19, obj);
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        ComposerKt.sourceInformationMarkerStart(composer6, i18, str10);
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer6, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str11);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str12);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer6.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer6, -407840262, str9);
                                        TextKt.m2376Text4IGK_g(exerciseTonnageLine.getExerciseName(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodyMedium(), composer4, 0, 0, 65532);
                                        String format3 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(exerciseTonnageLine.getTonnageKg())}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                                        TextKt.m2376Text4IGK_g(format3 + " kg", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelLarge(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer6 = composer4;
                                        str11 = str11;
                                        str12 = str12;
                                        str10 = str10;
                                        str9 = str9;
                                        f2 = 0.0f;
                                        i19 = 1;
                                        i18 = 693286680;
                                        obj = null;
                                    }
                                    str6 = str11;
                                    str7 = str12;
                                    str4 = str10;
                                    str5 = str9;
                                    composer4.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endReplaceGroup();
                                } else {
                                    str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                    str5 = "C101@5126L9:Row.kt#2w3rfo";
                                    str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                    str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                    if (muscleHeatmapMode2 == MuscleHeatmapMode.Volume) {
                                        composer4.startReplaceGroup(1491328229);
                                        TextKt.m2376Text4IGK_g("No sets mapped here in the last week.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 6, 0, 65530);
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer5 = composer4;
                                        composer5.startReplaceGroup(1491593465);
                                        composer4.endReplaceGroup();
                                        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.Horizontal end2 = Arrangement.INSTANCE.getEnd();
                                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str4);
                                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(end2, Alignment.INSTANCE.getTop(), composer5, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str6);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default22);
                                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str7);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (!composer4.getInserting()) {
                                            composer5.createNode(constructor42);
                                        } else {
                                            composer4.useNode();
                                        }
                                        m3336constructorimpl = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer5, -407840262, str5);
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$MuscleLoadPopupKt.INSTANCE.m6954getLambda1$app_sideload(), composer4, 805306368, 510);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                }
                                composer5 = composer4;
                                Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end22 = Arrangement.INSTANCE.getEnd();
                                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, str4);
                                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(end22, Alignment.INSTANCE.getTop(), composer5, 6);
                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str6);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap422 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default222);
                                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str7);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                }
                                composer4.startReusableNode();
                                if (!composer4.getInserting()) {
                                }
                                m3336constructorimpl = Updater.m3336constructorimpl(composer4);
                                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl.getInserting()) {
                                }
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer5, -407840262, str5);
                                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                                ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$MuscleLoadPopupKt.INSTANCE.m6954getLambda1$app_sideload(), composer4, 805306368, 510);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                        }
                    }, composer3, 54), composer3, 12607494, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, ((i6 >> 15) & 14) | 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        i13 = i152;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegionRecentLoad MuscleLoadDetailDialog$lambda$4(MutableState<RegionRecentLoad> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MuscleLoadLegendChip(final String region, final float f, final MuscleHeatmapMode mode, Map<String, Double> map, Composer composer, final int i, final int i2) {
        int i3;
        final Map<String, Double> map2;
        Object rememberedValue;
        final MutableState mutableState;
        Object rememberedValue2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Composer startRestartGroup = composer.startRestartGroup(837435174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(region) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(mode) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            map2 = map;
            i3 |= startRestartGroup.changedInstance(map2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Map<String, Double> emptyMap = i4 == 0 ? MapsKt.emptyMap() : map2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(837435174, i3, -1, "com.example.rungps.ui.components.MuscleLoadLegendChip (MuscleLoadPopup.kt:158)");
                }
                startRestartGroup.startReplaceGroup(423484046);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                final String str = MuscleAnatomyCatalog.INSTANCE.infoFor(region).getDisplayName() + " " + formatLoadLabel(f, mode);
                boolean MuscleLoadLegendChip$lambda$9 = MuscleLoadLegendChip$lambda$9(mutableState);
                startRestartGroup.startReplaceGroup(423490497);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MuscleLoadLegendChip$lambda$12$lambda$11;
                            MuscleLoadLegendChip$lambda$12$lambda$11 = MuscleLoadPopupKt.MuscleLoadLegendChip$lambda$12$lambda$11(MutableState.this);
                            return MuscleLoadLegendChip$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                ChipKt.FilterChip(MuscleLoadLegendChip$lambda$9, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(1586014297, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadLegendChip$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1586014297, i5, -1, "com.example.rungps.ui.components.MuscleLoadLegendChip.<anonymous> (MuscleLoadPopup.kt:164)");
                        }
                        TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), null, false, null, null, null, FilterChipDefaults.INSTANCE.m1794filterChipColorsXqyqHi0(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, FilterChipDefaults.$stable << 6, 4094), null, null, null, startRestartGroup, 432, 0, 3832);
                if (MuscleLoadLegendChip$lambda$9(mutableState)) {
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(423504866);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit MuscleLoadLegendChip$lambda$14$lambda$13;
                                MuscleLoadLegendChip$lambda$14$lambda$13 = MuscleLoadPopupKt.MuscleLoadLegendChip$lambda$14$lambda$13(MutableState.this);
                                return MuscleLoadLegendChip$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    MuscleLoadDetailDialog(region, f, mode, emptyMap, 0, (Function0) rememberedValue3, startRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & SdkConfig.SDK_VERSION) | (i3 & 896) | (i3 & 7168), 16);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                map2 = emptyMap;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MuscleLoadLegendChip$lambda$15;
                        MuscleLoadLegendChip$lambda$15 = MuscleLoadPopupKt.MuscleLoadLegendChip$lambda$15(region, f, mode, map2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MuscleLoadLegendChip$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        map2 = map;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(423484046);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        final String str2 = MuscleAnatomyCatalog.INSTANCE.infoFor(region).getDisplayName() + " " + formatLoadLabel(f, mode);
        boolean MuscleLoadLegendChip$lambda$92 = MuscleLoadLegendChip$lambda$9(mutableState);
        startRestartGroup.startReplaceGroup(423490497);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        ChipKt.FilterChip(MuscleLoadLegendChip$lambda$92, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(1586014297, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadLegendChip$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i5) {
                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1586014297, i5, -1, "com.example.rungps.ui.components.MuscleLoadLegendChip.<anonymous> (MuscleLoadPopup.kt:164)");
                }
                TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65534);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), null, false, null, null, null, FilterChipDefaults.INSTANCE.m1794filterChipColorsXqyqHi0(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, FilterChipDefaults.$stable << 6, 4094), null, null, null, startRestartGroup, 432, 0, 3832);
        if (MuscleLoadLegendChip$lambda$9(mutableState)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        map2 = emptyMap;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void MuscleLoadLegendChip$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MuscleLoadLegendChip$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleLoadLegendChip$lambda$12$lambda$11(MutableState mutableState) {
        MuscleLoadLegendChip$lambda$10(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MuscleLoadLegendChip$lambda$14$lambda$13(MutableState mutableState) {
        MuscleLoadLegendChip$lambda$10(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1 A[LOOP:1: B:55:0x01db->B:57:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MuscleLoadLegend(final Map<String, Float> loads, final MuscleHeatmapMode mode, Modifier modifier, Map<String, Double> map, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Map<String, Double> map2;
        int i5;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        final Modifier modifier3;
        final Map<String, Double> map3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(loads, "loads");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Composer startRestartGroup = composer.startRestartGroup(717903636);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(loads) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(mode) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                map2 = map;
                i3 |= startRestartGroup.changedInstance(map2) ? 2048 : 1024;
                i5 = i3;
                if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    Map<String, Double> emptyMap = i4 != 0 ? MapsKt.emptyMap() : map2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(717903636, i5, -1, "com.example.rungps.ui.components.MuscleLoadLegend (MuscleLoadPopup.kt:186)");
                    }
                    Modifier m686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6303constructorimpl(4), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m686paddingVpY3zN4$default);
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
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-47235469);
                    Set<Map.Entry<String, Float>> entrySet = loads.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : entrySet) {
                        if (((Number) ((Map.Entry) obj).getValue()).floatValue() > 0.1f) {
                            arrayList.add(obj);
                        }
                    }
                    for (Map.Entry entry : CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadLegend$lambda$19$$inlined$sortedByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues((Float) ((Map.Entry) t2).getValue(), (Float) ((Map.Entry) t).getValue());
                        }
                    }), 6)) {
                        MuscleLoadLegendChip((String) entry.getKey(), ((Number) entry.getValue()).floatValue(), mode, emptyMap, startRestartGroup, ((i5 << 3) & 896) | (i5 & 7168), 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    map3 = emptyMap;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    map3 = map2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.MuscleLoadPopupKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit MuscleLoadLegend$lambda$20;
                            MuscleLoadLegend$lambda$20 = MuscleLoadPopupKt.MuscleLoadLegend$lambda$20(loads, mode, modifier3, map3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return MuscleLoadLegend$lambda$20;
                        }
                    });
                    return;
                }
                return;
            }
            map2 = map;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m686paddingVpY3zN4$default2 = PaddingKt.m686paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6303constructorimpl(4), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m686paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-47235469);
            Set<Map.Entry<String, Float>> entrySet2 = loads.entrySet();
            ArrayList arrayList2 = new ArrayList();
            while (r0.hasNext()) {
            }
            while (r0.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            map3 = emptyMap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        map2 = map;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m686paddingVpY3zN4$default22 = PaddingKt.m686paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6303constructorimpl(4), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m686paddingVpY3zN4$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-47235469);
        Set<Map.Entry<String, Float>> entrySet22 = loads.entrySet();
        ArrayList arrayList22 = new ArrayList();
        while (r0.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        map3 = emptyMap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final String formatLoadLabel(float f, MuscleHeatmapMode muscleHeatmapMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[muscleHeatmapMode.ordinal()];
        if (i == 1) {
            return ((int) f) + " kg";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format + " h";
    }
}
