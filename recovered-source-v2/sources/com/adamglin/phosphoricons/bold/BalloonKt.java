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

/* compiled from: Balloon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Balloon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBalloon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_balloon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonKt {
    private static ImageVector _balloon;

    public static final ImageVector getBalloon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _balloon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Balloon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 12.0f);
        pathBuilder.arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 24.53f, 9.55f, 50.13f, 26.19f, 70.22f);
        pathBuilder.curveToRelative(10.0f, 12.0f, 21.56f, 21.07f, 34.05f, 26.76f);
        pathBuilder.lineTo(85.0f, 227.27f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 244.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.73f);
        pathBuilder.lineTo(159.76f, 201.0f);
        pathBuilder.curveToRelative(12.49f, -5.69f, 24.08f, -14.73f, 34.05f, -26.76f);
        pathBuilder.curveTo(210.45f, 154.13f, 220.0f, 128.53f, 220.0f, 104.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(141.8f, 220.0f);
        pathBuilder.lineTo(114.2f, 220.0f);
        pathBuilder.lineToRelative(5.35f, -12.49f);
        pathBuilder.arcToRelative(73.1f, 73.1f, 0.0f, false, false, 16.9f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.33f, 158.91f);
        pathBuilder.curveTo(161.93f, 175.09f, 145.12f, 184.0f, 128.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(-33.93f, -8.91f, -47.33f, -25.09f);
        pathBuilder.curveTo(67.73f, 143.29f, 60.0f, 122.76f, 60.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f);
        pathBuilder.curveTo(196.0f, 122.76f, 188.27f, 143.29f, 175.33f, 158.91f);
        pathBuilder.close();
        pathBuilder.moveTo(168.99f, 111.91f);
        pathBuilder.quadToRelative(-0.6f, 0.06f, -1.2f, 0.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.93f, -10.81f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -19.47f, -23.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.22f, -22.89f);
        pathBuilder.arcToRelative(51.94f, 51.94f, 0.0f, false, true, 36.13f, 44.42f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 169.0f, 111.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _balloon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
