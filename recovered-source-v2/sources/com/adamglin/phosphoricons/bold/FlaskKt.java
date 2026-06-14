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

/* compiled from: Flask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flask", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlask", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flask", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlaskKt {
    private static ImageVector _flask;

    public static final ImageVector getFlask(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(225.15f, 197.71f);
        pathBuilder.lineTo(164.0f, 95.81f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(95.81f);
        pathBuilder.lineTo(30.85f, 197.71f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 228.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.15f, -30.29f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 44.0f);
        pathBuilder.verticalLineTo(99.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.71f, 6.17f);
        pathBuilder.lineToRelative(35.13f, 58.54f);
        pathBuilder.curveToRelative(-10.79f, 0.86f, -25.15f, -1.31f, -43.42f, -10.56f);
        pathBuilder.curveToRelative(-14.0f, -7.08f, -27.46f, -11.33f, -40.27f, -12.76f);
        pathBuilder.lineToRelative(21.14f, -35.22f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 99.14f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(55.06f, 204.0f);
        pathBuilder.lineTo(79.0f, 164.19f);
        pathBuilder.curveToRelative(13.0f, -1.11f, 27.62f, 2.42f, 43.62f, 10.52f);
        pathBuilder.curveToRelative(19.61f, 9.92f, 36.25f, 13.31f, 49.85f, 13.31f);
        pathBuilder.arcTo(75.44f, 75.44f, 0.0f, false, false, 190.11f, 186.0f);
        pathBuilder.lineToRelative(10.83f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flask = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
