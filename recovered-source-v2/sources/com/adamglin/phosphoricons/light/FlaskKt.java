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

/* compiled from: Flask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flask", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlask", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flask", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlaskKt {
    private static ImageVector _flask;

    public static final ImageVector getFlask(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flask;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flask", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 200.8f);
        pathBuilder.lineTo(158.0f, 97.48f);
        pathBuilder.verticalLineTo(38.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(98.0f);
        pathBuilder.verticalLineTo(97.48f);
        pathBuilder.lineTo(36.0f, 200.8f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 222.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, -21.2f);
        pathBuilder.close();
        pathBuilder.moveTo(109.15f, 102.23f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, -3.09f);
        pathBuilder.verticalLineTo(38.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineTo(99.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, 3.09f);
        pathBuilder.lineToRelative(39.65f, 66.08f);
        pathBuilder.curveToRelative(-12.41f, 3.16f, -30.86f, 3.0f, -55.79f, -9.66f);
        pathBuilder.curveToRelative(-16.94f, -8.58f, -33.0f, -12.8f, -47.83f, -12.64f);
        pathBuilder.close();
        pathBuilder.moveTo(209.72f, 209.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.74f, 1.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.71f, -3.0f);
        pathBuilder.lineToRelative(29.0f, -48.41f);
        pathBuilder.curveToRelative(14.89f, -2.08f, 31.68f, 1.55f, 49.94f, 10.79f);
        pathBuilder.curveTo(144.0f, 178.8f, 159.67f, 182.0f, 172.42f, 182.0f);
        pathBuilder.arcTo(67.89f, 67.89f, 0.0f, false, false, 192.89f, 179.0f);
        pathBuilder.lineToRelative(16.8f, 28.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 209.72f, 209.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flask = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
