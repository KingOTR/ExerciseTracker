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

/* compiled from: Storefront.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Storefront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getStorefront", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_storefront", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorefrontKt {
    private static ImageVector _storefront;

    public static final ImageVector getStorefront(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.44f, -3.3f);
        pathBuilder.lineTo(221.2f, 42.51f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, false, 202.0f, 28.0f);
        pathBuilder.lineTo(54.0f, 28.0f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, false, 34.8f, 42.51f);
        pathBuilder.lineTo(20.46f, 92.7f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(43.94f, 43.94f, 0.0f, false, false, 16.0f, 33.92f);
        pathBuilder.lineTo(36.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(208.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(220.0f, 145.92f);
        pathBuilder.arcTo(43.94f, 43.94f, 0.0f, false, false, 236.0f, 112.0f);
        pathBuilder.lineTo(236.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.05f, 52.0f);
        pathBuilder.lineTo(199.0f, 52.0f);
        pathBuilder.lineToRelative(9.14f, 32.0f);
        pathBuilder.lineTo(47.91f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.05f, 108.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.0f, 128.71f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 112.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(84.0f, 108.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.arcToRelative(19.76f, 19.76f, 0.0f, false, true, -9.07f, -2.2f);
        pathBuilder.arcTo(11.54f, 11.54f, 0.0f, false, false, 53.0f, 128.71f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 204.0f);
        pathBuilder.lineTo(60.0f, 204.0f);
        pathBuilder.lineTo(60.0f, 155.81f);
        pathBuilder.curveToRelative(1.32f, 0.12f, 2.65f, 0.19f, 4.0f, 0.19f);
        pathBuilder.arcToRelative(43.86f, 43.86f, 0.0f, false, false, 32.0f, -13.85f);
        pathBuilder.arcToRelative(43.89f, 43.89f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder.arcTo(43.86f, 43.86f, 0.0f, false, false, 192.0f, 156.0f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.68f, -0.07f, 4.0f, -0.19f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 112.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.0f, 16.71f);
        pathBuilder.arcToRelative(11.66f, 11.66f, 0.0f, false, false, -1.88f, 1.09f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 172.0f, 112.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _storefront = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
