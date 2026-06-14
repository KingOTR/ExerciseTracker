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

/* compiled from: Baseball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Baseball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBaseball", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballKt {
    private static ImageVector _baseball;

    public static final ImageVector getBaseball(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(209.35f, 63.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.8f, -0.47f);
        pathBuilder.arcToRelative(88.94f, 88.94f, 0.0f, false, false, -9.4f, 10.0f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.0f, 1.81f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 181.49f, 63.0f);
        pathBuilder.arcToRelative(104.17f, 104.17f, 0.0f, false, true, 10.33f, -11.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.22f, -6.09f);
        pathBuilder.arcToRelative(103.79f, 103.79f, 0.0f, false, false, -127.2f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.22f, 6.09f);
        pathBuilder.arcTo(104.64f, 104.64f, 0.0f, false, true, 74.35f, 62.79f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 74.0f, 73.58f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 62.0f, 73.0f);
        pathBuilder.arcToRelative(88.41f, 88.41f, 0.0f, false, false, -9.59f, -10.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.79f, 0.48f);
        pathBuilder.arcToRelative(103.79f, 103.79f, 0.0f, false, false, 0.0f, 129.44f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.8f, 0.47f);
        pathBuilder.arcToRelative(88.94f, 88.94f, 0.0f, false, false, 9.4f, -10.0f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, 11.0f, -1.81f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 74.51f, 193.0f);
        pathBuilder.arcToRelative(104.17f, 104.17f, 0.0f, false, true, -10.33f, 11.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.22f, 6.09f);
        pathBuilder.arcToRelative(103.79f, 103.79f, 0.0f, false, false, 127.2f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.22f, -6.09f);
        pathBuilder.arcTo(104.17f, 104.17f, 0.0f, false, true, 181.49f, 193.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, -11.59f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, 11.0f, 1.81f);
        pathBuilder.arcToRelative(88.94f, 88.94f, 0.0f, false, false, 9.4f, 10.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.8f, -0.47f);
        pathBuilder.arcToRelative(103.79f, 103.79f, 0.0f, false, false, 0.0f, -129.44f);
        pathBuilder.close();
        pathBuilder.moveTo(81.71f, 88.3f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, 9.79f, 5.29f);
        pathBuilder.arcToRelative(105.1f, 105.1f, 0.0f, false, true, 4.34f, 16.77f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.35f);
        pathBuilder.curveToRelative(-0.38f, -4.44f, -1.11f, -8.91f, -3.2f, -12.84f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 81.71f, 88.3f);
        pathBuilder.close();
        pathBuilder.moveTo(95.84f, 145.59f);
        pathBuilder.arcToRelative(103.54f, 103.54f, 0.0f, false, true, -4.43f, 17.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.17f, 4.46f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -3.82f, -10.08f);
        pathBuilder.arcToRelative(87.84f, 87.84f, 0.0f, false, false, 3.69f, -14.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.18f, -6.35f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 95.84f, 145.59f);
        pathBuilder.close();
        pathBuilder.moveTo(175.76f, 167.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.17f, -4.46f);
        pathBuilder.arcToRelative(103.54f, 103.54f, 0.0f, false, true, -4.43f, -17.08f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, 5.55f, -9.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.18f, 6.35f);
        pathBuilder.arcToRelative(87.84f, 87.84f, 0.0f, false, false, 3.69f, 14.37f);
        pathBuilder.arcTo(8.19f, 8.19f, 0.0f, false, true, 175.76f, 167.13f);
        pathBuilder.close();
        pathBuilder.moveTo(179.17f, 99.81f);
        pathBuilder.curveToRelative(-2.09f, 3.93f, -2.82f, 8.4f, -3.2f, 12.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.17f, 7.0f);
        pathBuilder.arcToRelative(8.16f, 8.16f, 0.0f, false, true, -5.65f, -9.25f);
        pathBuilder.arcTo(103.59f, 103.59f, 0.0f, false, true, 164.5f, 93.6f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 9.79f, -5.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 179.17f, 99.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
