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

/* compiled from: Trucktrailer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TruckTrailer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTruckTrailer", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_truckTrailer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrucktrailerKt {
    private static ImageVector _truckTrailer;

    public static final ImageVector getTruckTrailer(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _truckTrailer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TruckTrailer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 72.0f);
        pathBuilder.lineTo(120.0f, 72.0f);
        pathBuilder.lineTo(120.0f, 184.0f);
        pathBuilder.lineTo(104.0f, 184.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder.lineTo(8.0f, 80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 104.0f);
        pathBuilder.lineTo(216.0f, 96.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(152.0f, 184.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f);
        pathBuilder.lineTo(248.0f, 136.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 216.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 96.8f);
        pathBuilder2.lineTo(224.0f, 96.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.lineTo(144.0f, 176.0f);
        pathBuilder2.lineTo(128.0f, 176.0f);
        pathBuilder2.lineTo(128.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineTo(16.0f, 64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 80.0f);
        pathBuilder2.lineTo(0.0f, 184.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.0f, 21.13f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 111.0f, 192.0f);
        pathBuilder2.horizontalLineToRelative(82.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 63.0f, -8.0f);
        pathBuilder2.lineTo(256.0f, 136.0f);
        pathBuilder2.arcTo(40.07f, 40.07f, 0.0f, false, false, 224.0f, 96.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder2.verticalLineToRelative(20.31f);
        pathBuilder2.arcTo(31.71f, 31.71f, 0.0f, false, false, 224.0f, 152.0f);
        pathBuilder2.arcToRelative(32.06f, 32.06f, 0.0f, false, false, -31.0f, 24.0f);
        pathBuilder2.lineTo(160.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -55.0f, -13.13f);
        pathBuilder2.arcToRelative(31.9f, 31.9f, 0.0f, false, false, -40.0f, -6.56f);
        pathBuilder2.lineTo(16.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 200.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _truckTrailer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
