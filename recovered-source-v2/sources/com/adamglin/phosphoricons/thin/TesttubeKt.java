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

/* compiled from: Testtube.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TestTube", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTestTube", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_testTube", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TesttubeKt {
    private static ImageVector _testTube;

    public static final ImageVector getTestTube(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(234.83f, 89.18f);
        pathBuilder.lineToRelative(-60.0f, -60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f);
        pathBuilder.lineTo(39.94f, 158.41f);
        pathBuilder.arcTo(40.78f, 40.78f, 0.0f, false, false, 97.6f, 216.08f);
        pathBuilder.lineTo(210.16f, 103.5f);
        pathBuilder.lineToRelative(23.1f, -7.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.57f, -6.62f);
        pathBuilder.close();
        pathBuilder.moveTo(91.94f, 210.42f);
        pathBuilder.arcTo(32.77f, 32.77f, 0.0f, true, true, 45.6f, 164.07f);
        pathBuilder.lineTo(75.0f, 134.63f);
        pathBuilder.curveToRelative(9.2f, -3.38f, 23.94f, -5.08f, 43.11f, 4.93f);
        pathBuilder.curveToRelative(12.09f, 6.31f, 22.74f, 8.48f, 31.66f, 8.48f);
        pathBuilder.curveToRelative(1.64f, 0.0f, 3.2f, -0.09f, 4.73f, -0.22f);
        pathBuilder.close();
        pathBuilder.moveTo(206.74f, 96.21f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, -1.57f, 1.0f);
        pathBuilder.lineTo(165.0f, 137.39f);
        pathBuilder.curveToRelative(-9.2f, 3.38f, -23.94f, 5.08f, -43.11f, -4.93f);
        pathBuilder.curveToRelative(-14.3f, -7.47f, -26.58f, -9.13f, -36.38f, -8.27f);
        pathBuilder.lineTo(172.0f, 37.66f);
        pathBuilder.lineToRelative(52.6f, 52.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _testTube = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
