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

/* compiled from: Newspaperclipping.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NewspaperClipping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNewspaperClipping", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_newspaperClipping", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewspaperclippingKt {
    private static ImageVector _newspaperClipping;

    public static final ImageVector getNewspaperClipping(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _newspaperClipping;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NewspaperClipping", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 42.0f);
        pathBuilder.lineTo(40.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f);
        pathBuilder.lineTo(26.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, 5.37f);
        pathBuilder.lineTo(64.0f, 206.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineTo(128.0f, 206.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineTo(192.0f, 206.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 222.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.15f, -0.9f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 216.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 206.29f);
        pathBuilder.lineTo(194.68f, 194.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(160.0f, 209.29f);
        pathBuilder.lineToRelative(-29.32f, -14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(96.0f, 209.29f);
        pathBuilder.lineTo(66.68f, 194.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(38.0f, 206.29f);
        pathBuilder.lineTo(38.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(216.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(144.0f, 118.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(144.0f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 90.0f);
        pathBuilder.lineTo(64.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(118.0f, 96.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 154.0f);
        pathBuilder.lineTo(70.0f, 154.0f);
        pathBuilder.lineTo(70.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _newspaperClipping = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
