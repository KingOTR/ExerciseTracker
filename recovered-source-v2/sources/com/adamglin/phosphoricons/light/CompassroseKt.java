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

/* compiled from: Compassrose.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassRose", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCompassRose", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassRose", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompassroseKt {
    private static ImageVector _compassRose;

    public static final ImageVector getCompassRose(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _compassRose;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CompassRose", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.46f, 122.18f);
        pathBuilder.lineToRelative(-28.34f, -7.09f);
        pathBuilder.arcTo(93.87f, 93.87f, 0.0f, false, false, 140.9f, 34.88f);
        pathBuilder.lineTo(133.82f, 6.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.64f, 0.0f);
        pathBuilder.lineTo(115.1f, 34.88f);
        pathBuilder.arcToRelative(93.87f, 93.87f, 0.0f, false, false, -80.22f, 80.21f);
        pathBuilder.lineTo(6.54f, 122.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 11.64f);
        pathBuilder.lineToRelative(28.34f, 7.09f);
        pathBuilder.arcToRelative(93.87f, 93.87f, 0.0f, false, false, 80.22f, 80.21f);
        pathBuilder.lineToRelative(7.08f, 28.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.64f, 0.0f);
        pathBuilder.lineToRelative(7.08f, -28.34f);
        pathBuilder.arcToRelative(93.87f, 93.87f, 0.0f, false, false, 80.22f, -80.21f);
        pathBuilder.lineToRelative(28.34f, -7.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.64f);
        pathBuilder.close();
        pathBuilder.moveTo(208.41f, 111.92f);
        pathBuilder.lineTo(157.0f, 99.05f);
        pathBuilder.lineTo(144.08f, 47.59f);
        pathBuilder.arcTo(81.87f, 81.87f, 0.0f, false, true, 208.41f, 111.92f);
        pathBuilder.close();
        pathBuilder.moveTo(145.41f, 102.16f);
        pathBuilder.lineTo(128.0f, 119.51f);
        pathBuilder.lineToRelative(-17.36f, -17.35f);
        pathBuilder.lineTo(128.0f, 32.74f);
        pathBuilder.close();
        pathBuilder.moveTo(111.92f, 47.59f);
        pathBuilder.lineTo(99.05f, 99.05f);
        pathBuilder.lineTo(47.59f, 111.92f);
        pathBuilder.arcTo(81.87f, 81.87f, 0.0f, false, true, 111.92f, 47.59f);
        pathBuilder.close();
        pathBuilder.moveTo(102.16f, 110.65f);
        pathBuilder.lineTo(119.52f, 128.0f);
        pathBuilder.lineToRelative(-17.36f, 17.35f);
        pathBuilder.lineTo(32.74f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.59f, 144.08f);
        pathBuilder.lineTo(99.05f, 157.0f);
        pathBuilder.lineToRelative(12.87f, 51.46f);
        pathBuilder.arcTo(81.87f, 81.87f, 0.0f, false, true, 47.59f, 144.08f);
        pathBuilder.close();
        pathBuilder.moveTo(110.64f, 153.84f);
        pathBuilder.lineTo(128.0f, 136.49f);
        pathBuilder.lineToRelative(17.36f, 17.35f);
        pathBuilder.lineTo(128.0f, 223.26f);
        pathBuilder.close();
        pathBuilder.moveTo(144.08f, 208.41f);
        pathBuilder.lineTo(157.0f, 157.0f);
        pathBuilder.lineToRelative(51.46f, -12.87f);
        pathBuilder.arcTo(81.87f, 81.87f, 0.0f, false, true, 144.08f, 208.41f);
        pathBuilder.close();
        pathBuilder.moveTo(153.84f, 145.35f);
        pathBuilder.lineTo(136.48f, 128.0f);
        pathBuilder.lineToRelative(17.36f, -17.35f);
        pathBuilder.lineTo(223.26f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassRose = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
