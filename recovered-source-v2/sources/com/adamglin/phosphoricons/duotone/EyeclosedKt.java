package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eyeclosed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getEyeClosed", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeClosed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeclosedKt {
    private static ImageVector _eyeClosed;

    public static final ImageVector getEyeClosed(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _eyeClosed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeClosed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 104.0f);
        pathBuilder.curveToRelative(-16.81f, 20.81f, -47.63f, 48.0f, -96.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(-79.19f, -27.19f, -96.0f, -48.0f);
        pathBuilder.curveToRelative(16.81f, -20.81f, 47.63f, -48.0f, 96.0f, -48.0f);
        pathBuilder.reflectiveCurveTo(207.19f, 83.19f, 224.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(228.0f, 175.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.92f, -3.0f);
        pathBuilder2.lineToRelative(-19.0f, -33.2f);
        pathBuilder2.arcTo(123.23f, 123.23f, 0.0f, false, true, 162.0f, 155.46f);
        pathBuilder2.lineToRelative(5.87f, 35.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, 9.21f);
        pathBuilder2.arcTo(8.4f, 8.4f, 0.0f, false, true, 160.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.69f);
        pathBuilder2.lineToRelative(-5.77f, -34.58f);
        pathBuilder2.arcToRelative(133.06f, 133.06f, 0.0f, false, true, -36.68f, 0.0f);
        pathBuilder2.lineToRelative(-5.77f, 34.58f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 200.0f);
        pathBuilder2.arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.32f, -0.11f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -9.21f);
        pathBuilder2.lineTo(94.0f, 155.46f);
        pathBuilder2.arcToRelative(123.23f, 123.23f, 0.0f, false, true, -36.06f, -16.69f);
        pathBuilder2.lineTo(39.0f, 172.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 25.06f, 164.0f);
        pathBuilder2.lineToRelative(20.0f, -35.0f);
        pathBuilder2.arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, -20.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 38.22f, 99.0f);
        pathBuilder2.curveToRelative(16.6f, 20.54f, 45.64f, 45.0f, 89.78f, 45.0f);
        pathBuilder2.reflectiveCurveToRelative(73.18f, -24.49f, 89.78f, -45.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 230.22f, 109.0f);
        pathBuilder2.arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, 20.0f);
        pathBuilder2.lineToRelative(20.0f, 35.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 175.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeClosed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
