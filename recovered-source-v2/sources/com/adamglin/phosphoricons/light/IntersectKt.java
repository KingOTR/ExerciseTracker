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

/* compiled from: Intersect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Intersect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getIntersect", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_intersect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersectKt {
    private static ImageVector _intersect;

    public static final ImageVector getIntersect(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _intersect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Intersect", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.91f, 83.09f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.82f, 89.82f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.82f, -89.82f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 96.0f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 160.49f, 82.0f);
        pathBuilder.lineTo(160.0f, 82.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, false, -78.0f, 78.0f);
        pathBuilder.curveToRelative(0.0f, 0.17f, 0.0f, 0.33f, 0.0f, 0.49f);
        pathBuilder.arcTo(66.1f, 66.1f, 0.0f, false, true, 30.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 160.0f);
        pathBuilder.arcToRelative(65.62f, 65.62f, 0.0f, false, true, 6.0f, -27.49f);
        pathBuilder.lineTo(123.49f, 156.0f);
        pathBuilder.arcTo(65.62f, 65.62f, 0.0f, false, true, 96.0f, 162.0f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.3f, 0.0f, -2.0f, -0.05f);
        pathBuilder.curveTo(94.0f, 161.3f, 94.0f, 160.65f, 94.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.23f, 149.75f);
        pathBuilder.lineTo(106.23f, 121.75f);
        pathBuilder.arcToRelative(66.47f, 66.47f, 0.0f, false, true, 15.52f, -15.52f);
        pathBuilder.lineToRelative(28.0f, 28.0f);
        pathBuilder.arcTo(66.47f, 66.47f, 0.0f, false, true, 134.23f, 149.75f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 96.0f);
        pathBuilder.arcToRelative(65.62f, 65.62f, 0.0f, false, true, -6.0f, 27.49f);
        pathBuilder.lineTo(132.51f, 100.0f);
        pathBuilder.arcTo(65.62f, 65.62f, 0.0f, false, true, 160.0f, 94.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.3f, 0.0f, 1.95f, 0.0f);
        pathBuilder.curveTo(162.0f, 94.7f, 162.0f, 95.35f, 162.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 226.0f);
        pathBuilder.arcToRelative(66.1f, 66.1f, 0.0f, false, true, -64.49f, -52.0f);
        pathBuilder.lineTo(96.0f, 174.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, false, 78.0f, -78.0f);
        pathBuilder.curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.0f, -0.49f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 160.0f, 226.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _intersect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
