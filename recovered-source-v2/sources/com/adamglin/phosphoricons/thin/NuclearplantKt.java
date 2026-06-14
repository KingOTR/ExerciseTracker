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

/* compiled from: Nuclearplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NuclearPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getNuclearPlant", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nuclearPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NuclearplantKt {
    private static ImageVector _nuclearPlant;

    public static final ImageVector getNuclearPlant(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(16.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(35.21f, 212.0f);
        pathBuilder.curveToRelative(14.21f, -28.21f, 30.94f, -70.65f, 32.65f, -116.51f);
        pathBuilder.arcTo(11.93f, 11.93f, 0.0f, false, true, 79.85f, 84.0f);
        pathBuilder.horizontalLineToRelative(88.33f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 11.46f);
        pathBuilder.curveToRelative(2.21f, 50.34f, 25.71f, 97.0f, 37.0f, 116.54f);
        pathBuilder.lineTo(240.0f, 212.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.85f, 212.0f);
        pathBuilder.curveToRelative(-14.14f, -28.88f, -30.0f, -70.85f, -31.7f, -116.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.79f);
        pathBuilder.lineTo(79.85f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.79f);
        pathBuilder.curveTo(74.16f, 141.15f, 58.29f, 183.12f, 44.15f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.94f, 212.0f);
        pathBuilder.curveToRelative(-12.17f, -22.0f, -33.62f, -67.3f, -35.77f, -116.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.81f);
        pathBuilder.lineTo(147.49f, 92.0f);
        pathBuilder.arcToRelative(11.86f, 11.86f, 0.0f, false, true, 0.65f, 3.49f);
        pathBuilder.curveToRelative(1.71f, 45.86f, 18.44f, 88.3f, 32.65f, 116.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nuclearPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
