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

/* compiled from: Megaphone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Megaphone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMegaphone", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphoneKt {
    private static ImageVector _megaphone;

    public static final ImageVector getMegaphone(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _megaphone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Megaphone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 120.0f);
        pathBuilder.arcToRelative(46.05f, 46.05f, 0.0f, false, false, -46.0f, -46.0f);
        pathBuilder.lineTo(160.15f, 74.0f);
        pathBuilder.curveToRelative(-2.58f, -0.15f, -54.1f, -3.57f, -103.15f, -44.71f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 40.0f);
        pathBuilder.lineTo(34.0f, 200.0f);
        pathBuilder.arcToRelative(13.85f, 13.85f, 0.0f, false, false, 8.07f, 12.68f);
        pathBuilder.arcTo(14.16f, 14.16f, 0.0f, false, false, 48.0f, 214.0f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.0f, -3.3f);
        pathBuilder.curveToRelative(40.0f, -33.52f, 81.57f, -42.0f, 97.0f, -44.07f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.23f, 11.65f);
        pathBuilder.lineToRelative(11.0f, 7.33f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 21.32f, -8.17f);
        pathBuilder.lineToRelative(12.13f, -45.71f);
        pathBuilder.arcTo(46.07f, 46.07f, 0.0f, false, false, 246.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(49.29f, 201.52f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 200.0f);
        pathBuilder.lineTo(46.0f, 40.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.15f, -1.8f);
        pathBuilder.arcTo(2.08f, 2.08f, 0.0f, false, true, 48.0f, 38.0f);
        pathBuilder.arcToRelative(1.91f, 1.91f, 0.0f, false, true, 1.26f, 0.48f);
        pathBuilder.curveToRelative(44.0f, 36.92f, 89.0f, 45.19f, 104.71f, 47.0f);
        pathBuilder.verticalLineToRelative(69.0f);
        pathBuilder.curveTo(138.29f, 156.33f, 93.3f, 164.61f, 49.29f, 201.52f);
        pathBuilder.close();
        pathBuilder.moveTo(180.93f, 208.52f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.05f, 1.18f);
        pathBuilder.lineToRelative(-11.0f, -7.33f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, -1.67f);
        pathBuilder.lineTo(165.99f, 166.0f);
        pathBuilder.horizontalLineToRelative(26.2f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 154.0f);
        pathBuilder.lineTo(166.0f, 154.0f);
        pathBuilder.lineTo(166.0f, 86.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 0.0f, 68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
