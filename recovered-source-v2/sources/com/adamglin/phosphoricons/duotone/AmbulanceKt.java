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

/* compiled from: Ambulance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ambulance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAmbulance", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ambulance", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmbulanceKt {
    private static ImageVector _ambulance;

    public static final ImageVector getAmbulance(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _ambulance;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ambulance", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 120.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -32.0f, -22.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 168.0f, 192.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(80.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.lineTo(104.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(120.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(104.0f, 128.0f);
        pathBuilder2.lineTo(88.0f, 128.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(256.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(223.0f, 200.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f);
        pathBuilder2.lineTo(111.0f, 200.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f);
        pathBuilder2.lineTo(32.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.lineTo(16.0f, 72.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f);
        pathBuilder2.lineTo(184.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(34.58f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, true, 14.86f, 10.06f);
        pathBuilder2.lineToRelative(14.0f, 35.0f);
        pathBuilder2.arcTo(7.92f, 7.92f, 0.0f, false, true, 256.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 88.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.horizontalLineToRelative(44.18f);
        pathBuilder2.lineToRelative(-9.6f, -24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 184.0f);
        pathBuilder2.lineTo(49.0f, 184.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 62.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(50.0f);
        pathBuilder2.arcToRelative(32.11f, 32.11f, 0.0f, false, true, 15.0f, -19.69f);
        pathBuilder2.lineTo(176.0f, 72.0f);
        pathBuilder2.lineTo(32.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 184.0f);
        pathBuilder2.lineTo(240.0f, 128.0f);
        pathBuilder2.lineTo(192.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(32.06f, 32.06f, 0.0f, false, true, 31.0f, 24.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ambulance = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
