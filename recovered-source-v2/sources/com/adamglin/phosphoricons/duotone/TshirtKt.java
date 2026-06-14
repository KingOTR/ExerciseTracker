package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tshirt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TShirt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTShirt", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tShirt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TshirtKt {
    private static ImageVector _tShirt;

    public static final ImageVector getTShirt(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(247.11f, 78.77f);
        pathBuilder.lineToRelative(-19.27f, 36.81f);
        pathBuilder.arcToRelative(8.44f, 8.44f, 0.0f, false, true, -7.5f, 4.42f);
        pathBuilder.lineTo(192.0f, 120.0f);
        pathBuilder.lineTo(192.0f, 40.0f);
        pathBuilder.lineToRelative(51.78f, 28.25f);
        pathBuilder.arcTo(7.81f, 7.81f, 0.0f, false, true, 247.11f, 78.77f);
        pathBuilder.close();
        pathBuilder.moveTo(8.89f, 78.77f);
        pathBuilder.lineTo(28.16f, 115.58f);
        pathBuilder.arcToRelative(8.44f, 8.44f, 0.0f, false, false, 7.5f, 4.42f);
        pathBuilder.lineTo(64.0f, 120.0f);
        pathBuilder.lineTo(64.0f, 40.0f);
        pathBuilder.lineTo(12.22f, 68.25f);
        pathBuilder.arcTo(7.81f, 7.81f, 0.0f, false, false, 8.89f, 78.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(247.59f, 61.22f);
        pathBuilder2.lineTo(195.83f, 33.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 32.0f);
        pathBuilder2.lineTo(160.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineTo(64.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.84f, 1.0f);
        pathBuilder2.lineTo(8.41f, 61.22f);
        pathBuilder2.arcTo(15.76f, 15.76f, 0.0f, false, false, 1.82f, 82.48f);
        pathBuilder2.lineToRelative(19.27f, 36.81f);
        pathBuilder2.arcTo(16.37f, 16.37f, 0.0f, false, false, 35.67f, 128.0f);
        pathBuilder2.lineTo(56.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(184.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(200.0f, 128.0f);
        pathBuilder2.horizontalLineToRelative(20.34f);
        pathBuilder2.arcToRelative(16.37f, 16.37f, 0.0f, false, false, 14.58f, -8.71f);
        pathBuilder2.lineToRelative(19.27f, -36.81f);
        pathBuilder2.arcTo(15.76f, 15.76f, 0.0f, false, false, 247.59f, 61.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(35.67f, 112.0f);
        pathBuilder2.arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.41f, -0.13f);
        pathBuilder2.lineTo(16.09f, 75.26f);
        pathBuilder2.lineTo(56.0f, 53.48f);
        pathBuilder2.lineTo(56.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.0f, 208.0f);
        pathBuilder2.lineTo(72.0f, 208.0f);
        pathBuilder2.lineTo(72.0f, 48.0f);
        pathBuilder2.horizontalLineToRelative(16.8f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.38f, 0.0f);
        pathBuilder2.lineTo(184.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(220.75f, 111.86f);
        pathBuilder2.arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.41f, 0.14f);
        pathBuilder2.lineTo(200.0f, 112.0f);
        pathBuilder2.lineTo(200.0f, 53.48f);
        pathBuilder2.lineToRelative(39.92f, 21.78f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tShirt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
