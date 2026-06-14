package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cubetransparent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeTransparent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCubeTransparent", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeTransparent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubetransparentKt {
    private static ImageVector _cubeTransparent;

    public static final ImageVector getCubeTransparent(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.92f, 95.22f);
        pathBuilder.arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.1f, -0.33f);
        pathBuilder.arcToRelative(3.38f, 3.38f, 0.0f, false, false, -0.13f, -0.42f);
        pathBuilder.arcToRelative(2.58f, 2.58f, 0.0f, false, false, -0.19f, -0.37f);
        pathBuilder.curveToRelative(-0.06f, -0.11f, -0.11f, -0.22f, -0.17f, -0.32f);
        pathBuilder.arcToRelative(3.62f, 3.62f, 0.0f, false, false, -0.5f, -0.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(2.32f, 2.32f, 0.0f, false, false, -0.33f, -0.27f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 36.0f);
        pathBuilder.lineTo(40.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(36.0f, 160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.9f, 2.5f);
        pathBuilder.arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.27f, 0.33f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 220.0f);
        pathBuilder.lineTo(216.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(220.0f, 96.0f);
        pathBuilder.arcTo(4.13f, 4.13f, 0.0f, false, false, 219.92f, 95.22f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 49.66f);
        pathBuilder.lineTo(206.34f, 92.0f);
        pathBuilder.lineTo(164.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 206.34f);
        pathBuilder.lineTo(49.66f, 164.0f);
        pathBuilder.lineTo(92.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 156.0f);
        pathBuilder.lineTo(44.0f, 156.0f);
        pathBuilder.lineTo(44.0f, 49.66f);
        pathBuilder.lineToRelative(48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(49.66f, 44.0f);
        pathBuilder.lineTo(156.0f, 44.0f);
        pathBuilder.lineTo(156.0f, 92.0f);
        pathBuilder.lineTo(97.66f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 100.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(100.0f, 156.0f);
        pathBuilder.lineTo(100.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 212.0f);
        pathBuilder.lineTo(100.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(58.34f);
        pathBuilder.lineToRelative(48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 206.34f);
        pathBuilder.lineTo(164.0f, 158.34f);
        pathBuilder.lineTo(164.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeTransparent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
