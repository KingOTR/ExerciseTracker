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

/* compiled from: Tshirt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TShirt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTShirt", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tShirt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TshirtKt {
    private static ImageVector _tShirt;

    public static final ImageVector getTShirt(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _tShirt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TShirt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.17f, 57.9f);
        pathBuilder.lineTo(198.09f, 29.65f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 192.0f, 28.0f);
        pathBuilder.lineTo(160.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 28.0f);
        pathBuilder.lineTo(64.0f, 28.0f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, false, -6.07f, 1.66f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(9.83f, 57.9f);
        pathBuilder.arcTo(20.18f, 20.18f, 0.0f, false, false, 2.0f, 84.0f);
        pathBuilder.lineToRelative(17.9f, 36.8f);
        pathBuilder.arcTo(19.62f, 19.62f, 0.0f, false, false, 37.67f, 132.0f);
        pathBuilder.lineTo(52.0f, 132.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(184.0f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(204.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(14.32f);
        pathBuilder.arcToRelative(19.64f, 19.64f, 0.0f, false, false, 17.75f, -11.17f);
        pathBuilder.lineTo(254.0f, 84.0f);
        pathBuilder.arcTo(20.18f, 20.18f, 0.0f, false, false, 246.17f, 57.9f);
        pathBuilder.close();
        pathBuilder.moveTo(40.37f, 108.0f);
        pathBuilder.lineTo(25.16f, 76.73f);
        pathBuilder.lineTo(52.0f, 61.0f);
        pathBuilder.verticalLineToRelative(47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 204.0f);
        pathBuilder.lineTo(76.0f, 204.0f);
        pathBuilder.lineTo(76.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(9.67f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.68f, 0.0f);
        pathBuilder.lineTo(180.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.62f, 108.0f);
        pathBuilder.lineTo(204.0f, 108.0f);
        pathBuilder.lineTo(204.0f, 61.0f);
        pathBuilder.lineToRelative(26.83f, 15.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tShirt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
