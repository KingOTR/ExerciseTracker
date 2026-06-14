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

/* compiled from: Balloon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Balloon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBalloon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_balloon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonKt {
    private static ImageVector _balloon;

    public static final ImageVector getBalloon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 18.0f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f);
        pathBuilder.curveToRelative(0.0f, 23.0f, 9.24f, 48.52f, 24.71f, 68.27f);
        pathBuilder.curveToRelative(12.37f, 15.79f, 27.23f, 26.42f, 43.05f, 31.07f);
        pathBuilder.lineToRelative(-11.27f, 26.3f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 238.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.51f, -8.36f);
        pathBuilder.lineToRelative(-11.27f, -26.3f);
        pathBuilder.curveToRelative(15.82f, -4.65f, 30.68f, -15.28f, 43.0f, -31.07f);
        pathBuilder.curveTo(204.76f, 152.52f, 214.0f, 127.0f, 214.0f, 104.0f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.17f, 204.0f);
        pathBuilder.lineToRelative(0.58f, 0.14f);
        pathBuilder.arcToRelative(2.05f, 2.05f, 0.0f, false, true, -0.58f, -0.14f);
        pathBuilder.close();
        pathBuilder.moveTo(142.9f, 226.0f);
        pathBuilder.lineTo(113.1f, 226.0f);
        pathBuilder.lineToRelative(8.7f, -20.31f);
        pathBuilder.arcToRelative(62.15f, 62.15f, 0.0f, false, false, 12.4f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 194.0f);
        pathBuilder.curveToRelative(-33.52f, 0.0f, -74.0f, -40.15f, -74.0f, -90.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f);
        pathBuilder.curveTo(202.0f, 153.85f, 161.52f, 194.0f, 128.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.0f, 101.92f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f);
        pathBuilder.arcTo(43.29f, 43.29f, 0.0f, false, false, 135.0f, 61.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.0f, -11.84f);
        pathBuilder.arcTo(55.48f, 55.48f, 0.0f, false, true, 181.92f, 95.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 177.0f, 101.92f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _balloon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
