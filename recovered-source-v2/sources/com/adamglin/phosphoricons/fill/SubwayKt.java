package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Subway.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Subway", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSubway", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_subway", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Subway", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(156.0f, 176.0f);
        pathBuilder.lineTo(156.0f, 152.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 176.0f);
        pathBuilder.lineTo(140.0f, 152.0f);
        pathBuilder.lineTo(116.0f, 152.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.lineTo(88.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 24.0f);
        pathBuilder.lineTo(104.0f, 24.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 32.0f, 96.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.lineTo(76.58f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -2.21f);
        pathBuilder.lineTo(91.06f, 192.0f);
        pathBuilder.lineTo(88.0f, 192.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.lineTo(64.0f, 88.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 88.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(-3.06f);
        pathBuilder.lineToRelative(10.9f, 21.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 2.21f);
        pathBuilder.lineTo(216.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(224.0f, 96.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.06f, 192.0f);
        pathBuilder.lineTo(108.94f, 192.0f);
        pathBuilder.lineToRelative(-9.1f, 18.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 5.79f);
        pathBuilder.horizontalLineToRelative(49.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -5.79f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(100.0f, 152.0f);
        pathBuilder.lineTo(80.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _subway = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
