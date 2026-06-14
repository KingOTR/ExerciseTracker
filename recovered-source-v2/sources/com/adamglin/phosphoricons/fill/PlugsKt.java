package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Plugs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plugs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPlugs", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plugs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlugsKt {
    private static ImageVector _plugs;

    public static final ImageVector getPlugs(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _plugs;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Plugs", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(149.66f, 149.66f);
        pathBuilder.lineTo(131.31f, 168.0f);
        pathBuilder.lineToRelative(18.35f, 18.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(132.0f, 191.31f);
        pathBuilder.lineToRelative(-23.31f, 23.32f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, false, true, -45.26f, 0.0f);
        pathBuilder.lineToRelative(-5.37f, -5.38f);
        pathBuilder.lineToRelative(-28.4f, 28.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineToRelative(28.41f, -28.4f);
        pathBuilder.lineToRelative(-5.38f, -5.37f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -45.26f);
        pathBuilder.lineTo(64.69f, 124.0f);
        pathBuilder.lineToRelative(-6.35f, -6.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineTo(88.0f, 124.69f);
        pathBuilder.lineToRelative(18.34f, -18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineTo(99.31f, 136.0f);
        pathBuilder.lineTo(120.0f, 156.69f);
        pathBuilder.lineToRelative(18.34f, -18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(237.66f, 18.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-28.4f, 28.41f);
        pathBuilder.lineToRelative(-5.37f, -5.38f);
        pathBuilder.arcToRelative(32.05f, 32.05f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.lineTo(124.0f, 64.69f);
        pathBuilder.lineToRelative(-6.34f, -6.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder.lineToRelative(80.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder.lineTo(191.31f, 132.0f);
        pathBuilder.lineToRelative(23.32f, -23.31f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -45.26f);
        pathBuilder.lineToRelative(-5.38f, -5.37f);
        pathBuilder.lineToRelative(28.41f, -28.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 18.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plugs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
