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

/* compiled from: Baseball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Baseball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBaseball", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballKt {
    private static ImageVector _baseball;

    public static final ImageVector getBaseball(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _baseball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Baseball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.31f, 187.67f);
        pathBuilder.curveToRelative(-1.0f, -1.12f, -2.0f, -2.26f, -2.9f, -3.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.36f, 7.5f);
        pathBuilder.curveToRelative(1.19f, 1.49f, 2.43f, 2.94f, 3.71f, 4.37f);
        pathBuilder.arcToRelative(89.84f, 89.84f, 0.0f, false, true, -117.52f, 0.0f);
        pathBuilder.curveToRelative(1.28f, -1.43f, 2.52f, -2.88f, 3.71f, -4.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.36f, -7.5f);
        pathBuilder.curveToRelative(-0.93f, 1.16f, -1.91f, 2.3f, -2.9f, 3.42f);
        pathBuilder.arcToRelative(89.8f, 89.8f, 0.0f, false, true, 0.0f, -119.34f);
        pathBuilder.curveToRelative(1.0f, 1.12f, 2.0f, 2.26f, 2.9f, 3.42f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 68.28f, 74.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 73.0f, 64.25f);
        pathBuilder.curveToRelative(-1.19f, -1.49f, -2.43f, -2.94f, -3.71f, -4.37f);
        pathBuilder.arcToRelative(89.84f, 89.84f, 0.0f, false, true, 117.52f, 0.0f);
        pathBuilder.curveToRelative(-1.28f, 1.43f, -2.52f, 2.88f, -3.71f, 4.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.36f, 7.5f);
        pathBuilder.curveToRelative(0.93f, -1.16f, 1.91f, -2.3f, 2.9f, -3.42f);
        pathBuilder.arcToRelative(89.8f, 89.8f, 0.0f, false, true, 0.0f, 119.34f);
        pathBuilder.close();
        pathBuilder.moveTo(93.92f, 145.0f);
        pathBuilder.arcToRelative(101.43f, 101.43f, 0.0f, false, true, -4.4f, 17.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, -4.0f);
        pathBuilder.arcToRelative(89.91f, 89.91f, 0.0f, false, false, 3.87f, -15.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(93.92f, 111.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 89.0f, 117.92f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f);
        pathBuilder.arcToRelative(89.91f, 89.91f, 0.0f, false, false, -3.87f, -15.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.31f, -4.0f);
        pathBuilder.arcTo(101.43f, 101.43f, 0.0f, false, true, 93.92f, 111.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.79f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, 4.0f);
        pathBuilder.arcToRelative(101.43f, 101.43f, 0.0f, false, true, -4.4f, -17.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, -2.0f);
        pathBuilder.arcTo(89.91f, 89.91f, 0.0f, false, false, 177.79f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.79f, 98.0f);
        pathBuilder.arcToRelative(89.91f, 89.91f, 0.0f, false, false, -3.87f, 15.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, 5.0f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, -0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, -6.91f);
        pathBuilder.arcToRelative(101.43f, 101.43f, 0.0f, false, true, 4.4f, -17.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.31f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
