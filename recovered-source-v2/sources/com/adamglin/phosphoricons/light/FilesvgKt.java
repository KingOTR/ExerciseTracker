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

/* compiled from: Filesvg.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileSvg", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFileSvg", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileSvg", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilesvgKt {
    private static ImageVector _fileSvg;

    public static final ImageVector getFileSvg(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _fileSvg;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileSvg", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.24f, 83.75f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f);
        pathBuilder.lineTo(56.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(54.0f, 40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(90.0f);
        pathBuilder.lineTo(146.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(50.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(214.0f, 88.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.75f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 46.48f);
        pathBuilder.lineTo(193.52f, 82.0f);
        pathBuilder.lineTo(158.0f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.83f, 196.05f);
        pathBuilder.arcToRelative(18.85f, 18.85f, 0.0f, false, true, -8.3f, 13.81f);
        pathBuilder.curveTo(72.71f, 213.05f, 66.66f, 214.0f, 61.16f, 214.0f);
        pathBuilder.arcToRelative(59.38f, 59.38f, 0.0f, false, true, -14.67f, -2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.23f, -11.56f);
        pathBuilder.curveToRelative(3.71f, 1.0f, 15.58f, 3.11f, 21.19f, -0.62f);
        pathBuilder.arcToRelative(6.85f, 6.85f, 0.0f, false, false, 3.0f, -5.34f);
        pathBuilder.curveToRelative(0.57f, -4.43f, -2.08f, -6.26f, -14.2f, -9.76f);
        pathBuilder.curveToRelative(-9.31f, -2.69f, -23.37f, -6.75f, -21.57f, -20.94f);
        pathBuilder.arcToRelative(18.61f, 18.61f, 0.0f, false, true, 8.08f, -13.54f);
        pathBuilder.curveToRelative(11.11f, -7.49f, 29.18f, -3.0f, 31.2f, -2.48f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, 11.6f);
        pathBuilder.curveToRelative(-3.79f, -1.0f, -15.85f, -2.95f, -21.45f, 0.84f);
        pathBuilder.arcToRelative(6.59f, 6.59f, 0.0f, false, false, -2.88f, 5.08f);
        pathBuilder.curveToRelative(-0.41f, 3.22f, 2.14f, 4.78f, 13.0f, 7.91f);
        pathBuilder.curveTo(72.93f, 176.08f, 87.85f, 180.39f, 85.83f, 196.05f);
        pathBuilder.close();
        pathBuilder.moveTo(149.65f, 154.05f);
        pathBuilder.lineTo(129.65f, 210.05f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.3f, 0.0f);
        pathBuilder.lineToRelative(-20.0f, -56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.3f, -4.0f);
        pathBuilder.lineTo(124.0f, 190.15f);
        pathBuilder.lineTo(138.35f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.3f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 184.0f);
        pathBuilder.verticalLineToRelative(16.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.67f, 4.15f);
        pathBuilder.arcTo(28.06f, 28.06f, 0.0f, false, true, 192.0f, 214.0f);
        pathBuilder.curveToRelative(-16.54f, 0.0f, -30.0f, -15.25f, -30.0f, -34.0f);
        pathBuilder.reflectiveCurveToRelative(13.46f, -34.0f, 30.0f, -34.0f);
        pathBuilder.arcToRelative(27.43f, 27.43f, 0.0f, false, true, 15.36f, 4.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.72f, 10.0f);
        pathBuilder.arcTo(15.25f, 15.25f, 0.0f, false, false, 192.0f, 158.0f);
        pathBuilder.curveToRelative(-9.92f, 0.0f, -18.0f, 9.87f, -18.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(8.08f, 22.0f, 18.0f, 22.0f);
        pathBuilder.arcToRelative(15.7f, 15.7f, 0.0f, false, false, 10.0f, -3.74f);
        pathBuilder.lineTo(202.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileSvg = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
