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

/* compiled from: Testtube.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TestTube", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTestTube", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_testTube", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TesttubeKt {
    private static ImageVector _testTube;

    public static final ImageVector getTestTube(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(236.24f, 87.76f);
        pathBuilder.lineToRelative(-60.0f, -60.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f);
        pathBuilder.lineTo(38.53f, 157.0f);
        pathBuilder.arcTo(42.77f, 42.77f, 0.0f, true, false, 99.0f, 217.47f);
        pathBuilder.lineTo(211.24f, 105.24f);
        pathBuilder.lineToRelative(22.66f, -7.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, -9.93f);
        pathBuilder.close();
        pathBuilder.moveTo(90.53f, 209.0f);
        pathBuilder.arcTo(30.77f, 30.77f, 0.0f, true, true, 47.0f, 165.47f);
        pathBuilder.lineToRelative(29.13f, -29.12f);
        pathBuilder.curveToRelative(8.84f, -3.14f, 22.84f, -4.56f, 41.08f, 5.0f);
        pathBuilder.curveToRelative(12.28f, 6.41f, 23.13f, 8.66f, 32.27f, 8.71f);
        pathBuilder.close();
        pathBuilder.moveTo(206.1f, 94.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.34f, 1.45f);
        pathBuilder.lineToRelative(-39.9f, 39.89f);
        pathBuilder.curveToRelative(-8.84f, 3.14f, -22.84f, 4.56f, -41.08f, -5.0f);
        pathBuilder.curveTo(110.5f, 124.27f, 99.65f, 122.0f, 90.51f, 122.0f);
        pathBuilder.lineTo(172.0f, 40.49f);
        pathBuilder.lineToRelative(48.89f, 48.89f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _testTube = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
