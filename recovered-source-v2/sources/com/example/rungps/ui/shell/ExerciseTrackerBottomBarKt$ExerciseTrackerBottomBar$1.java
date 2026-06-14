package com.example.rungps.ui.shell;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarItemColors;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import com.example.rungps.ui.icons.EtIcons;
import com.example.rungps.ui.icons.EtIconsKt;
import com.example.rungps.ui.navigation.MainTab;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseTrackerBottomBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1 implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ String $current;
    final /* synthetic */ boolean $moreSelected;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onMoreClick;
    final /* synthetic */ ColorScheme $scheme;

    ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1(ColorScheme colorScheme, boolean z, Function0<Unit> function0, String str, NavController navController) {
        this.$scheme = colorScheme;
        this.$moreSelected = z;
        this.$onMoreClick = function0;
        this.$current = str;
        this.$navController = navController;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope NavigationBar, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
        int i2 = (i & 6) == 0 ? i | (composer2.changed(NavigationBar) ? 4 : 2) : i;
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1378532301, i2, -1, "com.example.rungps.ui.shell.ExerciseTrackerBottomBar.<anonymous> (ExerciseTrackerBottomBar.kt:40)");
            }
            NavigationBarItemColors m1954colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1954colors69fazGs(this.$scheme.getTertiary(), this.$scheme.getTertiary(), Color.m3842copywmQWz5c$default(this.$scheme.getTertiary(), 0.14f, 0.0f, 0.0f, 0.0f, 14, null), this.$scheme.getOnSurfaceVariant(), this.$scheme.getOnSurfaceVariant(), 0L, 0L, composer, NavigationBarItemDefaults.$stable << 21, 96);
            composer2.startReplaceGroup(-26587458);
            EnumEntries<MainTab> entries = MainTab.getEntries();
            String str = this.$current;
            final NavController navController = this.$navController;
            for (final MainTab mainTab : entries) {
                final boolean areEqual = Intrinsics.areEqual(str, mainTab.getRoute());
                composer2.startReplaceGroup(-1567998887);
                boolean changedInstance = composer2.changedInstance(navController) | composer2.changed(mainTab);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$4$lambda$3$lambda$2;
                            invoke$lambda$4$lambda$3$lambda$2 = ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1.invoke$lambda$4$lambda$3$lambda$2(NavController.this, mainTab);
                            return invoke$lambda$4$lambda$3$lambda$2;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                NavigationBarKt.NavigationBarItem(NavigationBar, areEqual, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(114925623, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(114925623, i3, -1, "com.example.rungps.ui.shell.ExerciseTrackerBottomBar.<anonymous>.<anonymous>.<anonymous> (ExerciseTrackerBottomBar.kt:60)");
                            }
                            IconKt.m1833Iconww6aTOc(EtIconsKt.icon(MainTab.this, areEqual), MainTab.this.getLabel(), SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(22)), 0L, composer3, 384, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), null, false, ComposableLambdaKt.rememberComposableLambda(-142779052, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        TextStyle m5814copyp1EtxEg;
                        if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-142779052, i3, -1, "com.example.rungps.ui.shell.ExerciseTrackerBottomBar.<anonymous>.<anonymous>.<anonymous> (ExerciseTrackerBottomBar.kt:67)");
                            }
                            String label = MainTab.this.getLabel();
                            m5814copyp1EtxEg = r15.m5814copyp1EtxEg((r48 & 1) != 0 ? r15.spanStyle.m5738getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r15.spanStyle.getFontSize() : TextUnitKt.getSp(10), (r48 & 4) != 0 ? r15.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r15.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r15.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r15.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r15.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r15.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r15.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r15.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r15.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r15.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r15.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r15.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r15.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r15.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r15.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r15.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r15.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r15.platformStyle : null, (r48 & 1048576) != 0 ? r15.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r15.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r15.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall().paragraphStyle.getTextMotion() : null);
                            TextKt.m2376Text4IGK_g(label, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m5814copyp1EtxEg, composer3, 0, 3504, 51198);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), true, m1954colors69fazGs, null, composer, (i2 & 14) | 14158848, 280);
                composer2 = composer2;
                navController = navController;
                str = str;
                i2 = i2;
            }
            composer.endReplaceGroup();
            boolean z = this.$moreSelected;
            Function0<Unit> function0 = this.$onMoreClick;
            final boolean z2 = this.$moreSelected;
            NavigationBarKt.NavigationBarItem(NavigationBar, z, function0, ComposableLambdaKt.rememberComposableLambda(2111440114, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2111440114, i3, -1, "com.example.rungps.ui.shell.ExerciseTrackerBottomBar.<anonymous>.<anonymous> (ExerciseTrackerBottomBar.kt:83)");
                        }
                        IconKt.m1833Iconww6aTOc(z2 ? EtIcons.INSTANCE.getMoreFill() : EtIcons.INSTANCE.getMore(), "More", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(22)), 0L, composer3, 432, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), null, false, ComposableSingletons$ExerciseTrackerBottomBarKt.INSTANCE.m7479getLambda1$app_sideload(), true, m1954colors69fazGs, null, composer, (i2 & 14) | 14158848, 280);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(final NavController navController, MainTab mainTab) {
        navController.navigate(mainTab.getRoute(), new Function1() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1;
                invoke$lambda$4$lambda$3$lambda$2$lambda$1 = ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(NavController.this, (NavOptionsBuilder) obj);
                return invoke$lambda$4$lambda$3$lambda$2$lambda$1;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(NavController navController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navController.getGraph().getStartDestId(), new Function1() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
                invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0 = ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0((PopUpToBuilder) obj);
                return invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
            }
        });
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.INSTANCE;
    }
}
