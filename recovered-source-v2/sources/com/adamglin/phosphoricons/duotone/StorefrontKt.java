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

/* compiled from: Storefront.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Storefront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStorefront", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_storefront", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorefrontKt {
    private static ImageVector _storefront;

    public static final ImageVector getStorefront(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _storefront;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Storefront", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 96.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.lineTo(46.34f, 45.8f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 54.0f, 40.0f);
        pathBuilder.horizontalLineTo(202.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.69f, 5.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(231.69f, 93.81f);
        pathBuilder2.lineTo(217.35f, 43.6f);
        pathBuilder2.arcTo(16.07f, 16.07f, 0.0f, false, false, 202.0f, 32.0f);
        pathBuilder2.lineTo(54.0f, 32.0f);
        pathBuilder2.arcTo(16.07f, 16.07f, 0.0f, false, false, 38.65f, 43.6f);
        pathBuilder2.lineTo(24.31f, 93.81f);
        pathBuilder2.arcTo(7.94f, 7.94f, 0.0f, false, false, 24.0f, 96.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, 32.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.lineTo(208.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(216.0f, 144.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, -32.0f);
        pathBuilder2.lineTo(232.0f, 96.0f);
        pathBuilder2.arcTo(7.94f, 7.94f, 0.0f, false, false, 231.69f, 93.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(54.0f, 48.0f);
        pathBuilder2.lineTo(202.0f, 48.0f);
        pathBuilder2.lineToRelative(11.42f, 40.0f);
        pathBuilder2.lineTo(42.61f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 104.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(51.06f, 132.2f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 40.0f, 112.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineTo(88.0f, 104.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -35.12f, 21.26f);
        pathBuilder2.arcTo(7.88f, 7.88f, 0.0f, false, false, 51.06f, 132.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 208.0f);
        pathBuilder2.lineTo(56.0f, 208.0f);
        pathBuilder2.lineTo(56.0f, 151.2f);
        pathBuilder2.arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, 0.8f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, -16.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, 16.0f);
        pathBuilder2.arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, -0.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 112.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -11.07f, 20.2f);
        pathBuilder2.arcToRelative(8.08f, 8.08f, 0.0f, false, false, -1.8f, 1.05f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 112.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _storefront = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
