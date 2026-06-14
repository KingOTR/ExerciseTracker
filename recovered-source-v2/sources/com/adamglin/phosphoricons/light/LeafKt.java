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

/* compiled from: Leaf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Leaf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLeaf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_leaf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeafKt {
    private static ImageVector _leaf;

    public static final ImageVector getLeaf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _leaf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Leaf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.45f, 40.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, -5.64f);
        pathBuilder.curveTo(140.43f, 30.11f, 80.14f, 52.71f, 54.53f, 95.0f);
        pathBuilder.curveToRelative(-17.44f, 28.79f, -16.76f, 62.8f, 1.79f, 96.2f);
        pathBuilder.lineTo(35.76f, 211.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineTo(64.8f, 199.68f);
        pathBuilder.curveToRelative(17.27f, 9.59f, 34.7f, 14.41f, 51.49f, 14.41f);
        pathBuilder.arcTo(85.38f, 85.38f, 0.0f, false, false, 161.0f, 201.47f);
        pathBuilder.curveTo(203.29f, 175.86f, 225.88f, 115.57f, 221.45f, 40.19f);
        pathBuilder.close();
        pathBuilder.moveTo(154.79f, 191.19f);
        pathBuilder.curveToRelative(-24.08f, 14.58f, -52.64f, 14.37f, -81.13f, -0.39f);
        pathBuilder.lineToRelative(90.59f, -90.59f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineTo(65.18f, 182.34f);
        pathBuilder.curveToRelative(-14.76f, -28.49f, -15.0f, -57.0f, -0.39f, -81.13f);
        pathBuilder.curveToRelative(22.68f, -37.43f, 76.63f, -57.8f, 145.0f, -54.95f);
        pathBuilder.curveTo(212.59f, 114.58f, 192.22f, 168.54f, 154.79f, 191.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _leaf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
