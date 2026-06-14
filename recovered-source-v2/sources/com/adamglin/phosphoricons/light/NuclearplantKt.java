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

/* compiled from: Nuclearplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NuclearPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNuclearPlant", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nuclearPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NuclearplantKt {
    private static ImageVector _nuclearPlant;

    public static final ImageVector getNuclearPlant(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _nuclearPlant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NuclearPlant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, 10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 152.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 98.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(34.0f);
        pathBuilder.curveToRelative(14.0f, -28.0f, 30.2f, -69.68f, 31.88f, -114.59f);
        pathBuilder.arcTo(13.92f, 13.92f, 0.0f, false, true, 79.85f, 82.0f);
        pathBuilder.horizontalLineToRelative(88.33f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 13.37f);
        pathBuilder.curveTo(184.32f, 144.45f, 206.92f, 190.0f, 218.28f, 210.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.18f, 94.0f);
        pathBuilder.horizontalLineTo(150.0f);
        pathBuilder.curveToRelative(0.06f, 0.46f, 0.1f, 0.94f, 0.12f, 1.41f);
        pathBuilder.curveTo(151.82f, 140.32f, 168.0f, 182.0f, 182.0f, 210.0f);
        pathBuilder.horizontalLineToRelative(22.55f);
        pathBuilder.curveToRelative(-12.44f, -23.1f, -32.32f, -66.9f, -34.4f, -114.11f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 168.18f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.34f, 210.0f);
        pathBuilder.horizontalLineTo(168.66f);
        pathBuilder.curveToRelative(-13.86f, -28.94f, -28.86f, -69.92f, -30.51f, -114.14f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -1.86f);
        pathBuilder.horizontalLineTo(79.85f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.86f);
        pathBuilder.curveTo(76.2f, 140.08f, 61.2f, 181.06f, 47.34f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nuclearPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
