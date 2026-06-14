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

/* compiled from: Testtube.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TestTube", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTestTube", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_testTube", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TesttubeKt {
    private static ImageVector _testTube;

    public static final ImageVector getTestTube(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _testTube;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TestTube", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(167.18f, 140.82f);
        pathBuilder.lineTo(94.77f, 213.23f);
        pathBuilder.arcToRelative(36.77f, 36.77f, 0.0f, false, true, -52.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.77f, 36.77f, 0.0f, false, true, 0.0f, -52.0f);
        pathBuilder.lineToRelative(30.0f, -30.0f);
        pathBuilder.curveToRelative(9.37f, -3.65f, 25.78f, -6.36f, 47.18f, 4.82f);
        pathBuilder.reflectiveCurveTo(157.81f, 144.47f, 167.18f, 140.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.66f, 86.34f);
        pathBuilder2.lineToRelative(-60.0f, -60.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder2.lineTo(37.11f, 155.57f);
        pathBuilder2.arcToRelative(44.77f, 44.77f, 0.0f, false, false, 63.32f, 63.32f);
        pathBuilder2.lineTo(212.32f, 107.0f);
        pathBuilder2.lineToRelative(22.21f, -7.4f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(89.11f, 207.57f);
        pathBuilder2.arcToRelative(28.77f, 28.77f, 0.0f, false, true, -40.68f, -40.68f);
        pathBuilder2.lineToRelative(28.8f, -28.8f);
        pathBuilder2.curveToRelative(8.47f, -2.9f, 21.75f, -4.0f, 39.07f, 5.0f);
        pathBuilder2.curveToRelative(10.6f, 5.54f, 20.18f, 8.0f, 28.56f, 8.73f);
        pathBuilder2.close();
        pathBuilder2.moveTo(205.47f, 92.41f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.13f, 1.93f);
        pathBuilder2.lineToRelative(-39.57f, 39.57f);
        pathBuilder2.curveToRelative(-8.47f, 2.9f, -21.75f, 4.0f, -39.07f, -5.0f);
        pathBuilder2.curveToRelative(-10.6f, -5.54f, -20.18f, -8.0f, -28.56f, -8.73f);
        pathBuilder2.lineTo(172.0f, 43.31f);
        pathBuilder2.lineTo(217.19f, 88.5f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _testTube = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
