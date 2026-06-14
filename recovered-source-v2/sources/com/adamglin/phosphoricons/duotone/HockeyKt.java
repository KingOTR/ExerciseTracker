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

/* compiled from: Hockey.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hockey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHockey", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hockey", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HockeyKt {
    private static ImageVector _hockey;

    public static final ImageVector getHockey(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _hockey;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hockey", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 160.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.horizontalLineTo(171.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.1f, -2.82f);
        pathBuilder.lineToRelative(-38.0f, -44.7f);
        pathBuilder.lineTo(90.4f, 205.12f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 84.25f, 208.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.verticalLineTo(160.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 152.0f);
        pathBuilder2.lineTo(130.9f, 152.0f);
        pathBuilder2.lineTo(38.1f, 42.82f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 25.9f, 53.18f);
        pathBuilder2.lineTo(159.51f, 210.36f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 171.7f, 216.0f);
        pathBuilder2.lineTo(224.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(240.0f, 168.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.5f, 168.0f);
        pathBuilder2.lineTo(192.0f, 168.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.lineTo(171.7f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 200.0f);
        pathBuilder2.lineTo(208.0f, 200.0f);
        pathBuilder2.lineTo(208.0f, 168.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.18f, 179.55f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.27f, 0.92f);
        pathBuilder2.lineTo(84.3f, 200.0f);
        pathBuilder2.lineTo(64.0f, 200.0f);
        pathBuilder2.lineTo(64.0f, 168.0f);
        pathBuilder2.lineTo(85.2f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(32.0f, 152.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(84.3f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.19f, -5.64f);
        pathBuilder2.lineToRelative(16.61f, -19.53f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.18f, 179.55f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 168.0f);
        pathBuilder2.lineTo(48.0f, 168.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.lineTo(32.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(149.9f, 122.82f);
        pathBuilder2.lineTo(217.9f, 42.82f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.2f, 10.36f);
        pathBuilder2.lineToRelative(-68.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.2f, -10.36f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hockey = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
