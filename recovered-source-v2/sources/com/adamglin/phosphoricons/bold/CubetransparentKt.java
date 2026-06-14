package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cubetransparent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeTransparent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCubeTransparent", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeTransparent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubetransparentKt {
    private static ImageVector _cubeTransparent;

    public static final ImageVector getCubeTransparent(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cubeTransparent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CubeTransparent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.5f, 95.53f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-64.0f, -64.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 28.0f);
        pathBuilder.lineTo(40.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f);
        pathBuilder.lineTo(28.0f, 152.0f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, 7.93f);
        pathBuilder.curveToRelative(0.15f, 0.18f, 0.31f, 0.36f, 0.5f, 0.56f);
        pathBuilder.lineToRelative(64.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 228.0f);
        pathBuilder.lineTo(216.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(228.0f, 104.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.5f, 95.53f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 69.0f);
        pathBuilder.lineToRelative(23.0f, 23.0f);
        pathBuilder.lineTo(164.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 187.0f);
        pathBuilder.lineTo(69.0f, 164.0f);
        pathBuilder.lineTo(92.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 140.0f);
        pathBuilder.lineTo(52.0f, 140.0f);
        pathBuilder.lineTo(52.0f, 69.0f);
        pathBuilder.lineToRelative(40.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(69.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(71.0f);
        pathBuilder.lineTo(140.0f, 92.0f);
        pathBuilder.lineTo(109.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 116.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(116.0f, 140.0f);
        pathBuilder.lineTo(116.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 204.0f);
        pathBuilder.lineTo(116.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(31.0f);
        pathBuilder.lineToRelative(40.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 187.0f);
        pathBuilder.lineTo(164.0f, 147.0f);
        pathBuilder.lineTo(164.0f, 116.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeTransparent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
