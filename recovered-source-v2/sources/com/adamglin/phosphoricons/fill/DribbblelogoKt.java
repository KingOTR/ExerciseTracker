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

/* compiled from: Dribbblelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DribbbleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDribbbleLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dribbbleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DribbblelogoKt {
    private static ImageVector _dribbbleLogo;

    public static final ImageVector getDribbbleLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _dribbbleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DribbbleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(93.27f, 36.86f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.82f, -7.19f);
        pathBuilder.arcToRelative(103.94f, 103.94f, 0.0f, false, true, 88.66f, 9.95f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, 5.87f);
        pathBuilder.arcToRelative(153.32f, 153.32f, 0.0f, false, true, -41.89f, 37.0f);
        pathBuilder.arcTo(169.43f, 169.43f, 0.0f, false, false, 93.27f, 36.86f);
        pathBuilder.close();
        pathBuilder.moveTo(127.58f, 90.0f);
        pathBuilder.arcToRelative(153.0f, 153.0f, 0.0f, false, false, -56.0f, -46.91f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, -4.0f, 0.33f);
        pathBuilder.arcToRelative(104.41f, 104.41f, 0.0f, false, false, -38.34f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 5.16f);
        pathBuilder.arcTo(152.34f, 152.34f, 0.0f, false, false, 64.0f, 104.0f);
        pathBuilder.arcTo(151.0f, 151.0f, 0.0f, false, false, 127.58f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.38f, 116.69f);
        pathBuilder.arcTo(103.81f, 103.81f, 0.0f, false, false, 202.19f, 55.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 0.34f);
        pathBuilder.arcToRelative(169.15f, 169.15f, 0.0f, false, true, -45.69f, 40.4f);
        pathBuilder.arcToRelative(167.73f, 167.73f, 0.0f, false, true, 13.55f, 29.9f);
        pathBuilder.arcTo(167.64f, 167.64f, 0.0f, false, true, 208.0f, 120.0f);
        pathBuilder.arcTo(169.35f, 169.35f, 0.0f, false, true, 227.0f, 121.07f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 231.38f, 116.72f);
        pathBuilder.close();
        pathBuilder.moveTo(168.47f, 141.19f);
        pathBuilder.arcToRelative(167.7f, 167.7f, 0.0f, false, true, 4.45f, 38.47f);
        pathBuilder.arcToRelative(168.0f, 168.0f, 0.0f, false, true, -4.11f, 36.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 174.5f, 221.0f);
        pathBuilder.arcToRelative(104.25f, 104.25f, 0.0f, false, false, 56.57f, -79.25f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.49f, -4.49f);
        pathBuilder.arcToRelative(152.44f, 152.44f, 0.0f, false, false, -59.11f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.83f, 130.74f);
        pathBuilder.arcToRelative(151.76f, 151.76f, 0.0f, false, false, -12.39f, -27.21f);
        pathBuilder.arcTo(167.0f, 167.0f, 0.0f, false, true, 64.0f, 120.0f);
        pathBuilder.arcToRelative(168.4f, 168.4f, 0.0f, false, true, -34.88f, -3.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.81f, 3.56f);
        pathBuilder.quadToRelative(-0.31f, 4.0f, -0.32f, 8.09f);
        pathBuilder.arcToRelative(103.72f, 103.72f, 0.0f, false, false, 33.0f, 75.91f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.15f, -0.92f);
        pathBuilder.arcTo(169.0f, 169.0f, 0.0f, false, true, 148.83f, 130.77f);
        pathBuilder.close();
        pathBuilder.moveTo(75.69f, 213.25f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.52f, 5.48f);
        pathBuilder.arcToRelative(103.88f, 103.88f, 0.0f, false, false, 68.85f, 11.69f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, 3.06f, -2.65f);
        pathBuilder.arcToRelative(152.6f, 152.6f, 0.0f, false, false, 7.8f, -48.08f);
        pathBuilder.arcToRelative(151.3f, 151.3f, 0.0f, false, false, -3.74f, -33.46f);
        pathBuilder.arcTo(152.94f, 152.94f, 0.0f, false, false, 75.69f, 213.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dribbbleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
