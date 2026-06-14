package com.example.rungps.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"LightColors", "Landroidx/compose/material3/ColorScheme;", "DarkColors", "AmoledColors", "ExerciseTrackerTheme", "", "darkTheme", "", "amoled", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeKt {
    private static final ColorScheme AmoledColors;
    private static final ColorScheme DarkColors;
    private static final ColorScheme LightColors;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExerciseTrackerTheme$lambda$0(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        ExerciseTrackerTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        long m7636getIronstone0d7_KjU = EarthColors.INSTANCE.m7636getIronstone0d7_KjU();
        long m7639getLimestone0d7_KjU = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color = ColorKt.Color(4293973176L);
        long Color2 = ColorKt.Color(4282194440L);
        long m7633getGoldenHour0d7_KjU = EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU();
        long m7632getEarthInk0d7_KjU = EarthColors.INSTANCE.m7632getEarthInk0d7_KjU();
        long Color3 = ColorKt.Color(4294305480L);
        long Color4 = ColorKt.Color(4282200088L);
        long m7655getTurquoise0d7_KjU = EarthColors.INSTANCE.m7655getTurquoise0d7_KjU();
        long m7639getLimestone0d7_KjU2 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color5 = ColorKt.Color(4290308320L);
        long Color6 = ColorKt.Color(4278861110L);
        long m7639getLimestone0d7_KjU3 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long m7632getEarthInk0d7_KjU2 = EarthColors.INSTANCE.m7632getEarthInk0d7_KjU();
        long m7630getDryGrass0d7_KjU = EarthColors.INSTANCE.m7630getDryGrass0d7_KjU();
        long m7632getEarthInk0d7_KjU3 = EarthColors.INSTANCE.m7632getEarthInk0d7_KjU();
        long Color7 = ColorKt.Color(4293253576L);
        long m7629getClay0d7_KjU = EarthColors.INSTANCE.m7629getClay0d7_KjU();
        long m7639getLimestone0d7_KjU4 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color8 = ColorKt.Color(4292726972L);
        LightColors = ColorSchemeKt.m1618lightColorSchemeCXl9yA$default(m7636getIronstone0d7_KjU, m7639getLimestone0d7_KjU, Color, Color2, 0L, m7633getGoldenHour0d7_KjU, m7632getEarthInk0d7_KjU, Color3, Color4, m7655getTurquoise0d7_KjU, m7639getLimestone0d7_KjU2, Color5, Color6, m7639getLimestone0d7_KjU3, m7632getEarthInk0d7_KjU2, m7630getDryGrass0d7_KjU, m7632getEarthInk0d7_KjU3, Color7, m7629getClay0d7_KjU, 0L, 0L, 0L, EarthColors.INSTANCE.m7643getOchreRed0d7_KjU(), EarthColors.INSTANCE.m7639getLimestone0d7_KjU(), 0L, 0L, EarthColors.INSTANCE.m7629getClay0d7_KjU(), ColorKt.Color(4292134062L), 0L, 0L, 0L, Color8, 0L, m7639getLimestone0d7_KjU4, 0L, 0L, 1933049872, 13, null);
        long m7627getCelebrationGold0d7_KjU = EarthColors.INSTANCE.m7627getCelebrationGold0d7_KjU();
        long m7638getJarrahDeep0d7_KjU = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color9 = ColorKt.Color(4284234264L);
        long Color10 = ColorKt.Color(4294305492L);
        long m7649getSandstone0d7_KjU = EarthColors.INSTANCE.m7649getSandstone0d7_KjU();
        long m7638getJarrahDeep0d7_KjU2 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color11 = ColorKt.Color(4283055912L);
        long Color12 = ColorKt.Color(4293976772L);
        long m7655getTurquoise0d7_KjU2 = EarthColors.INSTANCE.m7655getTurquoise0d7_KjU();
        long m7639getLimestone0d7_KjU5 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color13 = ColorKt.Color(4279913026L);
        long Color14 = ColorKt.Color(4290308320L);
        long m7637getJarrah0d7_KjU = EarthColors.INSTANCE.m7637getJarrah0d7_KjU();
        long m7639getLimestone0d7_KjU6 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color15 = ColorKt.Color(4280951324L);
        long m7639getLimestone0d7_KjU7 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color16 = ColorKt.Color(4282004008L);
        long Color17 = ColorKt.Color(4291081370L);
        long m7637getJarrah0d7_KjU2 = EarthColors.INSTANCE.m7637getJarrah0d7_KjU();
        long Color18 = ColorKt.Color(4282004008L);
        DarkColors = ColorSchemeKt.m1614darkColorSchemeCXl9yA$default(m7627getCelebrationGold0d7_KjU, m7638getJarrahDeep0d7_KjU, Color9, Color10, 0L, m7649getSandstone0d7_KjU, m7638getJarrahDeep0d7_KjU2, Color11, Color12, m7655getTurquoise0d7_KjU2, m7639getLimestone0d7_KjU5, Color13, Color14, m7637getJarrah0d7_KjU, m7639getLimestone0d7_KjU6, Color15, m7639getLimestone0d7_KjU7, Color16, Color17, 0L, 0L, 0L, ColorKt.Color(4293227379L), ColorKt.Color(4282714634L), 0L, 0L, ColorKt.Color(4285226056L), ColorKt.Color(4283582520L), 0L, 0L, 0L, Color18, 0L, m7637getJarrah0d7_KjU2, 0L, 0L, 1933049872, 13, null);
        long m7633getGoldenHour0d7_KjU2 = EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU();
        long m7638getJarrahDeep0d7_KjU3 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color19 = ColorKt.Color(4283052048L);
        long Color20 = ColorKt.Color(4294305492L);
        long m7649getSandstone0d7_KjU2 = EarthColors.INSTANCE.m7649getSandstone0d7_KjU();
        long m7638getJarrahDeep0d7_KjU4 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color21 = ColorKt.Color(4282003480L);
        long Color22 = ColorKt.Color(4293976772L);
        long m7650getShallowWater0d7_KjU = EarthColors.INSTANCE.m7650getShallowWater0d7_KjU();
        long m7638getJarrahDeep0d7_KjU5 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color23 = ColorKt.Color(4279515184L);
        long Color24 = ColorKt.Color(4290308320L);
        long m7638getJarrahDeep0d7_KjU6 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long m7639getLimestone0d7_KjU8 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long m7638getJarrahDeep0d7_KjU7 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long m7639getLimestone0d7_KjU9 = EarthColors.INSTANCE.m7639getLimestone0d7_KjU();
        long Color25 = ColorKt.Color(4279899152L);
        long Color26 = ColorKt.Color(4291081370L);
        long m7638getJarrahDeep0d7_KjU8 = EarthColors.INSTANCE.m7638getJarrahDeep0d7_KjU();
        long Color27 = ColorKt.Color(4280556566L);
        AmoledColors = ColorSchemeKt.m1614darkColorSchemeCXl9yA$default(m7633getGoldenHour0d7_KjU2, m7638getJarrahDeep0d7_KjU3, Color19, Color20, 0L, m7649getSandstone0d7_KjU2, m7638getJarrahDeep0d7_KjU4, Color21, Color22, m7650getShallowWater0d7_KjU, m7638getJarrahDeep0d7_KjU5, Color23, Color24, m7638getJarrahDeep0d7_KjU6, m7639getLimestone0d7_KjU8, m7638getJarrahDeep0d7_KjU7, m7639getLimestone0d7_KjU9, Color25, Color26, 0L, 0L, 0L, ColorKt.Color(4293227379L), ColorKt.Color(4282714634L), 0L, 0L, ColorKt.Color(4284107320L), ColorKt.Color(4282003492L), 0L, 0L, 0L, Color27, 0L, m7638getJarrahDeep0d7_KjU8, 0L, 0L, 1933049872, 13, null);
    }

    public static final void ExerciseTrackerTheme(final boolean z, boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ColorScheme colorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1328348120);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1328348120, i3, -1, "com.example.rungps.ui.theme.ExerciseTrackerTheme (Theme.kt:101)");
            }
            if (z2) {
                colorScheme = AmoledColors;
            } else if (z) {
                colorScheme = DarkColors;
            } else {
                colorScheme = LightColors;
            }
            int i5 = ((i3 << 3) & 7168) | 432;
            MaterialThemeKt.MaterialTheme(colorScheme, ShapeKt.getExerciseTrackerShapes(), TypeKt.getExerciseTrackerTypography(), content, startRestartGroup, i5, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final boolean z3 = z2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExerciseTrackerTheme$lambda$0;
                    ExerciseTrackerTheme$lambda$0 = ThemeKt.ExerciseTrackerTheme$lambda$0(z, z3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExerciseTrackerTheme$lambda$0;
                }
            });
        }
    }
}
