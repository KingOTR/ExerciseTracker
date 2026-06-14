package com.example.rungps.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrandGradients.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/ui/theme/BrandGradients;", "", "<init>", "()V", "heroBrush", "Landroidx/compose/ui/graphics/Brush;", "scheme", "Landroidx/compose/material3/ColorScheme;", "pageHeroBrush", "mosaicStripeBrush", "cardFlameBrush", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandGradients {
    public static final int $stable = 0;
    public static final BrandGradients INSTANCE = new BrandGradients();

    private BrandGradients() {
    }

    public final Brush heroBrush(ColorScheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return Brush.Companion.m3794linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(EarthColors.INSTANCE.m7633getGoldenHour0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(scheme.getPrimary(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(EarthColors.INSTANCE.m7655getTurquoise0d7_KjU(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(scheme.getSurfaceContainerLow())}), OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(1000.0f, 600.0f), 0, 8, (Object) null);
    }

    public final Brush pageHeroBrush() {
        return Brush.Companion.m3794linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(ColorKt.Color(4285346832L)), Color.m3833boximpl(ColorKt.Color(4287322667L)), Color.m3833boximpl(ColorKt.Color(4280973934L))}), OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(1200.0f, 400.0f), 0, 8, (Object) null);
    }

    public final Brush mosaicStripeBrush() {
        return Brush.Companion.m3792horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(EarthColors.INSTANCE.m7642getMosaicYellow0d7_KjU()), Color.m3833boximpl(EarthColors.INSTANCE.m7655getTurquoise0d7_KjU()), Color.m3833boximpl(EarthColors.INSTANCE.m7654getTerracotta0d7_KjU()), Color.m3833boximpl(EarthColors.INSTANCE.m7635getHeritageBlue0d7_KjU()), Color.m3833boximpl(EarthColors.INSTANCE.m7640getMosaicCyan0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
    }

    public final Brush cardFlameBrush(ColorScheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return Brush.Companion.m3792horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(scheme.getPrimary(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(EarthColors.INSTANCE.m7655getTurquoise0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
    }
}
