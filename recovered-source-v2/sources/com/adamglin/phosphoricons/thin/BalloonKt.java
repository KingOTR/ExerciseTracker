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

/* compiled from: Balloon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Balloon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBalloon", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_balloon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonKt {
    private static ImageVector _balloon;

    public static final ImageVector getBalloon(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, 22.57f, 9.08f, 47.63f, 24.28f, 67.0f);
        pathBuilder.curveToRelative(12.68f, 16.17f, 28.0f, 26.81f, 44.22f, 31.0f);
        pathBuilder.lineToRelative(-12.18f, 28.4f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 236.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.68f, -5.58f);
        pathBuilder.lineTo(143.5f, 202.0f);
        pathBuilder.curveToRelative(16.23f, -4.17f, 31.54f, -14.81f, 44.22f, -31.0f);
        pathBuilder.curveToRelative(15.2f, -19.41f, 24.28f, -44.47f, 24.28f, -67.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(145.93f, 228.0f);
        pathBuilder.lineTo(110.07f, 228.0f);
        pathBuilder.lineToRelative(10.48f, -24.46f);
        pathBuilder.arcToRelative(60.56f, 60.56f, 0.0f, false, false, 14.9f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.curveToRelative(-42.1f, 0.0f, -76.0f, -50.33f, -76.0f, -92.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f);
        pathBuilder.curveTo(204.0f, 145.67f, 170.1f, 196.0f, 128.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 95.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, 4.61f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.66f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.95f, -3.34f);
        pathBuilder.arcTo(45.31f, 45.31f, 0.0f, false, false, 135.34f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.32f, -7.9f);
        pathBuilder.arcTo(53.46f, 53.46f, 0.0f, false, true, 180.0f, 95.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _balloon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
