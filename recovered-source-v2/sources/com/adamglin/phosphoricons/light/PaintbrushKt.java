package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paintbrush.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrush", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaintBrush", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrush", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushKt {
    private static ImageVector _paintBrush;

    public static final ImageVector getPaintBrush(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paintBrush;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBrush", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 26.0f);
        pathBuilder.curveToRelative(-20.8f, 0.0f, -44.11f, 11.41f, -69.3f, 33.9f);
        pathBuilder.curveTo(136.62f, 76.06f, 121.0f, 94.9f, 110.3f, 109.0f);
        pathBuilder.arcTo(58.0f, 58.0f, 0.0f, false, false, 34.0f, 164.0f);
        pathBuilder.curveToRelative(0.0f, 32.07f, -20.43f, 46.39f, -21.35f, 47.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 16.0f, 222.0f);
        pathBuilder.lineTo(92.0f, 222.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, 55.0f, -76.3f);
        pathBuilder.curveToRelative(14.08f, -10.67f, 32.92f, -26.32f, 49.08f, -44.4f);
        pathBuilder.curveTo(218.59f, 76.11f, 230.0f, 52.8f, 230.0f, 32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 210.0f);
        pathBuilder.lineTo(30.65f, 210.0f);
        pathBuilder.curveTo(37.92f, 200.85f, 46.0f, 185.78f, 46.0f, 164.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(121.49f, 114.09f);
        pathBuilder.curveToRelative(3.6f, -4.67f, 7.88f, -10.0f, 12.71f, -15.69f);
        pathBuilder.arcToRelative(78.17f, 78.17f, 0.0f, false, true, 23.4f, 23.4f);
        pathBuilder.curveToRelative(-5.67f, 4.83f, -11.0f, 9.11f, -15.69f, 12.71f);
        pathBuilder.arcTo(58.38f, 58.38f, 0.0f, false, false, 121.49f, 114.09f);
        pathBuilder.close();
        pathBuilder.moveTo(166.69f, 113.79f);
        pathBuilder.arcToRelative(90.24f, 90.24f, 0.0f, false, false, -24.48f, -24.48f);
        pathBuilder.curveTo(163.05f, 66.46f, 191.0f, 42.0f, 217.56f, 38.44f);
        pathBuilder.curveTo(214.0f, 65.0f, 189.54f, 93.0f, 166.69f, 113.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrush = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
