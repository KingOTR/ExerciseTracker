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

/* compiled from: Pepper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pepper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPepper", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pepper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PepperKt {
    private static ImageVector _pepper;

    public static final ImageVector getPepper(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pepper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pepper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(170.56f, 36.82f);
        pathBuilder.arcTo(44.08f, 44.08f, 0.0f, false, false, 128.0f, 4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 17.09f, 9.66f);
        pathBuilder.arcTo(68.11f, 68.11f, 0.0f, false, false, 92.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 21.74f, -5.83f, 40.14f, -17.32f, 54.69f);
        pathBuilder.curveToRelative(-12.22f, 15.47f, -31.18f, 27.08f, -56.34f, 34.49f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.2f, 38.91f);
        pathBuilder.arcTo(268.22f, 268.22f, 0.0f, false, false, 66.64f, 236.0f);
        pathBuilder.curveToRelative(41.61f, 0.0f, 88.0f, -9.38f, 120.21f, -36.38f);
        pathBuilder.curveTo(214.16f, 176.72f, 228.0f, 144.55f, 228.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(68.11f, 68.11f, 0.0f, false, false, 170.56f, 36.82f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 60.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 40.32f, 26.41f);
        pathBuilder.lineTo(192.0f, 90.58f);
        pathBuilder.lineTo(165.37f, 77.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.lineTo(128.0f, 90.58f);
        pathBuilder.lineToRelative(-8.32f, -4.17f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 160.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.43f, 181.23f);
        pathBuilder.curveToRelative(-17.4f, 14.59f, -42.33f, 24.47f, -72.1f, 28.58f);
        pathBuilder.arcToRelative(251.28f, 251.28f, 0.0f, false, true, -58.21f, 0.89f);
        pathBuilder.curveToRelative(46.68f, -18.51f, 72.28f, -52.54f, 74.68f, -99.39f);
        pathBuilder.lineToRelative(6.83f, 3.42f);
        pathBuilder.arcToRelative(12.07f, 12.07f, 0.0f, false, false, 10.74f, 0.0f);
        pathBuilder.lineTo(160.0f, 101.41f);
        pathBuilder.lineToRelative(26.63f, 13.32f);
        pathBuilder.arcToRelative(12.07f, 12.07f, 0.0f, false, false, 10.74f, 0.0f);
        pathBuilder.lineToRelative(6.43f, -3.22f);
        pathBuilder.curveTo(202.24f, 141.07f, 191.38f, 164.5f, 171.43f, 181.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pepper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
