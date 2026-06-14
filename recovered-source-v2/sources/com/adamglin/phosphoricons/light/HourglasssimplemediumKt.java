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

/* compiled from: Hourglasssimplemedium.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassSimpleMedium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHourglassSimpleMedium", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassSimpleMedium", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasssimplemediumKt {
    private static ImageVector _hourglassSimpleMedium;

    public static final ImageVector getHourglassSimpleMedium(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hourglassSimpleMedium;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HourglassSimpleMedium", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(209.8f, 198.0f);
        pathBuilder.lineToRelative(-73.12f, -70.0f);
        pathBuilder.lineTo(209.8f, 58.0f);
        pathBuilder.lineToRelative(0.09f, -0.09f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 34.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.9f, 23.9f);
        pathBuilder.lineToRelative(0.09f, 0.09f);
        pathBuilder.lineToRelative(73.12f, 70.0f);
        pathBuilder.lineTo(46.2f, 198.0f);
        pathBuilder.lineToRelative(-0.09f, 0.09f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 222.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, -23.9f);
        pathBuilder.close();
        pathBuilder.moveTo(92.81f, 86.0f);
        pathBuilder.horizontalLineToRelative(70.38f);
        pathBuilder.lineTo(128.0f, 119.69f);
        pathBuilder.close();
        pathBuilder.moveTo(54.16f, 47.23f);
        pathBuilder.arcTo(1.91f, 1.91f, 0.0f, false, true, 56.0f, 46.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, 3.38f);
        pathBuilder.lineTo(175.72f, 74.0f);
        pathBuilder.horizontalLineTo(80.28f);
        pathBuilder.lineTo(54.56f, 49.38f);
        pathBuilder.arcTo(1.91f, 1.91f, 0.0f, false, true, 54.16f, 47.23f);
        pathBuilder.close();
        pathBuilder.moveTo(201.84f, 208.77f);
        pathBuilder.arcTo(1.91f, 1.91f, 0.0f, false, true, 200.0f, 210.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, -3.38f);
        pathBuilder.lineTo(122.0f, 142.05f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(142.05f);
        pathBuilder.lineToRelative(67.44f, 64.57f);
        pathBuilder.arcTo(1.91f, 1.91f, 0.0f, false, true, 201.84f, 208.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassSimpleMedium = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
