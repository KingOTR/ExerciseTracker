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

/* compiled from: Ambulance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ambulance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAmbulance", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ambulance", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmbulanceKt {
    private static ImageVector _ambulance;

    public static final ImageVector getAmbulance(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(80.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(104.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(120.0f, 128.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(104.0f, 128.0f);
        pathBuilder.lineTo(88.0f, 128.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 120.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(223.0f, 200.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f);
        pathBuilder.lineTo(111.0f, 200.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f);
        pathBuilder.lineTo(32.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f);
        pathBuilder.lineTo(184.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(34.58f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, true, 14.86f, 10.06f);
        pathBuilder.lineToRelative(14.0f, 35.0f);
        pathBuilder.arcTo(7.92f, 7.92f, 0.0f, false, true, 256.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.horizontalLineToRelative(44.18f);
        pathBuilder.lineToRelative(-9.6f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 184.0f);
        pathBuilder.lineTo(49.0f, 184.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 62.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(50.0f);
        pathBuilder.arcToRelative(32.11f, 32.11f, 0.0f, false, true, 15.0f, -19.69f);
        pathBuilder.lineTo(176.0f, 72.0f);
        pathBuilder.lineTo(32.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 184.0f);
        pathBuilder.lineTo(240.0f, 128.0f);
        pathBuilder.lineTo(192.0f, 128.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, false, true, 31.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ambulance = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
