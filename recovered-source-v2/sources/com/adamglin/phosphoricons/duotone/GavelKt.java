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

/* compiled from: Gavel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gavel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGavel", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gavel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gavel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(149.66f, 45.66f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 149.66f, 45.66f);
        pathBuilder.close();
        pathBuilder.moveTo(237.66f, 122.34f);
        pathBuilder.lineTo(221.66f, 106.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 122.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(243.32f, 116.69f);
        pathBuilder2.lineToRelative(-16.0f, -16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.84f, -1.53f);
        pathBuilder2.lineTo(156.84f, 49.52f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.52f, -20.84f);
        pathBuilder2.lineToRelative(-16.0f, -16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder2.lineToRelative(-64.0f, 64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder2.lineToRelative(16.0f, 16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.83f, 1.52f);
        pathBuilder2.lineTo(96.69f, 124.0f);
        pathBuilder2.lineTo(31.31f, 189.38f);
        pathBuilder2.arcTo(25.0f, 25.0f, 0.0f, false, false, 66.63f, 224.7f);
        pathBuilder2.lineTo(132.0f, 159.32f);
        pathBuilder2.lineToRelative(7.17f, 7.16f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.52f, 20.84f);
        pathBuilder2.lineToRelative(16.0f, 16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder2.lineToRelative(64.0f, -64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 243.32f, 116.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 104.0f);
        pathBuilder2.lineTo(64.0f, 88.0f);
        pathBuilder2.lineToRelative(64.0f, -64.0f);
        pathBuilder2.lineToRelative(16.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(55.32f, 213.38f);
        pathBuilder2.arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.69f, 0.0f);
        pathBuilder2.arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, -12.68f);
        pathBuilder2.lineTo(108.0f, 135.32f);
        pathBuilder2.lineTo(120.69f, 148.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(101.0f, 105.66f);
        pathBuilder2.lineTo(145.66f, 61.0f);
        pathBuilder2.lineTo(195.0f, 110.34f);
        pathBuilder2.lineTo(150.35f, 155.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 192.0f);
        pathBuilder2.lineToRelative(-16.0f, -16.0f);
        pathBuilder2.lineToRelative(4.0f, -4.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(56.0f, -56.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(4.0f, -4.0f);
        pathBuilder2.lineToRelative(16.0f, 16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gavel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
