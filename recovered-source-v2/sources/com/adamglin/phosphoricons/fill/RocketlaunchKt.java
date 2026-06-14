package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rocketlaunch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getRocketLaunch", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rocketLaunch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RocketlaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RocketLaunch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(101.85f, 191.14f);
        pathBuilder.curveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -42.29f, 23.0f, -57.34f, 32.86f, -61.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.64f, 14.56f);
        pathBuilder.curveToRelative(-6.43f, 2.93f, -20.62f, 12.36f, -23.12f, 38.91f);
        pathBuilder.curveToRelative(26.55f, -2.5f, 36.0f, -16.69f, 38.91f, -23.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.56f, 6.64f);
        pathBuilder.close();
        pathBuilder.moveTo(223.85f, 47.14f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.0f, -15.0f);
        pathBuilder.curveToRelative(-12.58f, -0.75f, -44.73f, 0.4f, -71.4f, 27.07f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(88.0f, 108.7f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 76.67f, 97.39f);
        pathBuilder.lineToRelative(26.56f, -26.57f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 100.41f, 64.0f);
        pathBuilder.lineTo(74.35f, 64.0f);
        pathBuilder.arcTo(15.9f, 15.9f, 0.0f, false, false, 63.0f, 68.68f);
        pathBuilder.lineTo(28.7f, 103.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.07f, 27.16f);
        pathBuilder.lineToRelative(38.47f, 5.37f);
        pathBuilder.lineToRelative(44.21f, 44.21f);
        pathBuilder.lineToRelative(5.37f, 38.49f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.78f, 12.92f);
        pathBuilder.arcToRelative(16.11f, 16.11f, 0.0f, false, false, 5.1f, 0.83f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 153.0f, 227.3f);
        pathBuilder.lineTo(187.32f, 193.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 181.65f);
        pathBuilder.lineTo(192.0f, 155.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.83f, -2.82f);
        pathBuilder.lineToRelative(-26.57f, 26.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.71f, -0.42f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.6f, -11.1f);
        pathBuilder.lineToRelative(49.27f, -49.27f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rocketLaunch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
