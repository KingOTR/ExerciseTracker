package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEar", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarKt {
    private static ImageVector _ear;

    public static final ImageVector getEar(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _ear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 25.0f, 7.58f, 32.3f, 16.35f, 40.76f);
        pathBuilder.reflectiveCurveTo(96.0f, 163.71f, 96.0f, 188.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f);
        pathBuilder.curveToRelative(9.0f, 0.0f, 16.19f, -3.7f, 22.75f, -11.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.5f, 15.28f);
        pathBuilder.curveTo(158.09f, 237.15f, 144.21f, 244.0f, 128.0f, 244.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, -56.0f);
        pathBuilder.curveToRelative(0.0f, -14.09f, -4.63f, -18.56f, -12.31f, -26.0f);
        pathBuilder.curveTo(49.13f, 151.86f, 36.0f, 139.19f, 36.0f, 104.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.87f, 157.61f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.4f, 4.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.47f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -7.61f, 3.65f, -12.86f, 9.6f, -20.8f);
        pathBuilder.curveTo(172.0f, 130.65f, 180.0f, 120.0f, 180.0f, 104.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 7.61f, -3.65f, 12.86f, -9.6f, 20.8f);
        pathBuilder.curveTo(140.0f, 133.35f, 132.0f, 144.0f, 132.0f, 160.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 52.25f, 14.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 179.87f, 157.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
