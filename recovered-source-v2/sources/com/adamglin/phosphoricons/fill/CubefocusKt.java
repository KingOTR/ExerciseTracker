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

/* compiled from: Cubefocus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeFocus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCubeFocus", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeFocus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubefocusKt {
    private static ImageVector _cubeFocus;

    public static final ImageVector getCubeFocus(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cubeFocus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CubeFocus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 48.0f);
        pathBuilder.lineTo(232.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 56.0f);
        pathBuilder.lineTo(184.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.lineTo(72.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.lineTo(184.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(232.0f, 168.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.lineTo(72.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(24.0f, 88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.92f, 83.31f);
        pathBuilder.lineTo(132.0f, 57.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f);
        pathBuilder.lineTo(78.08f, 83.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.0f);
        pathBuilder.lineTo(128.0f, 118.79f);
        pathBuilder.lineToRelative(49.92f, -28.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 177.92f, 83.31f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 107.53f);
        pathBuilder.lineTo(64.0f, 160.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 68.0f, 167.0f);
        pathBuilder.lineToRelative(46.0f, 26.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.47f);
        pathBuilder.lineTo(120.0f, 132.64f);
        pathBuilder.lineTo(70.0f, 104.06f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 107.53f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 160.0f);
        pathBuilder.lineTo(192.0f, 107.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.47f);
        pathBuilder.lineToRelative(-50.0f, 28.58f);
        pathBuilder.verticalLineToRelative(57.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.47f);
        pathBuilder.lineTo(188.0f, 167.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeFocus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
