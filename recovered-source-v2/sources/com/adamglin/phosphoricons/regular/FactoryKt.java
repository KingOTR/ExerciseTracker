package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Factory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Factory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFactory", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_factory", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Factory", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(80.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 168.0f);
        pathBuilder.lineTo(148.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(24.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineTo(32.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f);
        pathBuilder.lineTo(96.0f, 120.0f);
        pathBuilder.lineTo(96.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f);
        pathBuilder.lineToRelative(38.74f, 29.05f);
        pathBuilder.lineTo(159.1f, 29.74f);
        pathBuilder.arcTo(16.08f, 16.08f, 0.0f, false, true, 174.94f, 16.0f);
        pathBuilder.horizontalLineToRelative(18.12f);
        pathBuilder.arcTo(16.08f, 16.08f, 0.0f, false, true, 208.9f, 29.74f);
        pathBuilder.lineToRelative(15.0f, 105.13f);
        pathBuilder.reflectiveCurveToRelative(0.08f, 0.78f, 0.08f, 1.13f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.14f, 121.6f);
        pathBuilder.lineTo(170.67f, 128.0f);
        pathBuilder.horizontalLineToRelative(36.11f);
        pathBuilder.lineTo(193.06f, 32.0f);
        pathBuilder.lineTo(174.94f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 208.0f);
        pathBuilder.lineTo(208.0f, 208.0f);
        pathBuilder.lineTo(208.0f, 144.0f);
        pathBuilder.lineTo(168.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -1.6f);
        pathBuilder.lineToRelative(-14.4f, -10.8f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(112.0f, 104.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 6.4f);
        pathBuilder.lineTo(48.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _factory = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
