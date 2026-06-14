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

/* compiled from: Dribbblelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DribbbleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDribbbleLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dribbbleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DribbblelogoKt {
    private static ImageVector _dribbbleLogo;

    public static final ImageVector getDribbbleLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.13f, 116.0f);
        pathBuilder.curveToRelative(-1.0f, 0.0f, -2.08f, 0.0f, -3.12f, 0.0f);
        pathBuilder.arcToRelative(172.63f, 172.63f, 0.0f, false, false, -41.39f, 5.06f);
        pathBuilder.arcTo(171.26f, 171.26f, 0.0f, false, false, 156.0f, 97.39f);
        pathBuilder.arcTo(172.34f, 172.34f, 0.0f, false, false, 188.9f, 70.24f);
        pathBuilder.arcTo(83.72f, 83.72f, 0.0f, false, true, 211.13f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 55.3f);
        pathBuilder.arcToRelative(148.53f, 148.53f, 0.0f, false, true, -27.0f, 21.88f);
        pathBuilder.arcToRelative(173.29f, 173.29f, 0.0f, false, false, -30.58f, -31.71f);
        pathBuilder.arcTo(83.52f, 83.52f, 0.0f, false, true, 170.0f, 55.3f);
        pathBuilder.close();
        pathBuilder.moveTo(85.54f, 55.57f);
        pathBuilder.arcToRelative(149.23f, 149.23f, 0.0f, false, true, 35.9f, 32.87f);
        pathBuilder.arcTo(147.73f, 147.73f, 0.0f, false, true, 64.0f, 100.0f);
        pathBuilder.curveToRelative(-5.0f, 0.0f, -10.0f, -0.26f, -14.94f, -0.75f);
        pathBuilder.arcTo(84.49f, 84.49f, 0.0f, false, true, 85.53f, 55.57f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -1.73f, 0.07f, -3.44f, 0.17f, -5.14f);
        pathBuilder.arcTo(175.15f, 175.15f, 0.0f, false, false, 64.0f, 124.0f);
        pathBuilder.arcToRelative(171.8f, 171.8f, 0.0f, false, false, 70.84f, -15.22f);
        pathBuilder.arcToRelative(145.82f, 145.82f, 0.0f, false, true, 8.92f, 19.65f);
        pathBuilder.arcToRelative(170.71f, 170.71f, 0.0f, false, false, -21.52f, 10.44f);
        pathBuilder.arcToRelative(173.0f, 173.0f, 0.0f, false, false, -53.68f, 48.44f);
        pathBuilder.arcTo(83.77f, 83.77f, 0.0f, false, true, 44.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(87.77f, 201.72f);
        pathBuilder.arcToRelative(149.0f, 149.0f, 0.0f, false, true, 46.46f, -42.06f);
        pathBuilder.arcToRelative(147.2f, 147.2f, 0.0f, false, true, 16.0f, -7.94f);
        pathBuilder.arcToRelative(148.52f, 148.52f, 0.0f, false, true, 2.67f, 28.0f);
        pathBuilder.arcTo(148.66f, 148.66f, 0.0f, false, true, 150.0f, 209.06f);
        pathBuilder.arcToRelative(83.81f, 83.81f, 0.0f, false, true, -62.22f, -7.34f);
        pathBuilder.close();
        pathBuilder.moveTo(176.06f, 196.83f);
        pathBuilder.curveToRelative(0.56f, -5.68f, 0.86f, -11.4f, 0.86f, -17.14f);
        pathBuilder.arcToRelative(172.57f, 172.57f, 0.0f, false, false, -3.72f, -35.54f);
        pathBuilder.arcTo(148.85f, 148.85f, 0.0f, false, true, 208.0f, 140.0f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.07f, 0.0f, 3.11f, 0.0f);
        pathBuilder.arcTo(84.07f, 84.07f, 0.0f, false, true, 176.06f, 196.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dribbbleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
