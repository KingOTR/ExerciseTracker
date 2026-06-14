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

/* compiled from: Ambulance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ambulance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAmbulance", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ambulance", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmbulanceKt {
    private static ImageVector _ambulance;

    public static final ImageVector getAmbulance(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.lineTo(92.0f, 132.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 120.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(225.94f, 204.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -67.88f, 0.0f);
        pathBuilder.lineTo(113.94f, 204.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -67.88f, 0.0f);
        pathBuilder.lineTo(32.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(12.0f, 72.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 52.0f);
        pathBuilder.lineTo(184.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(26.58f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, 18.57f, 12.57f);
        pathBuilder.lineToRelative(14.0f, 35.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 92.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(30.28f);
        pathBuilder.lineToRelative(-6.4f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 180.0f);
        pathBuilder.lineTo(46.06f, 180.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 67.88f, 0.0f);
        pathBuilder.horizontalLineToRelative(44.12f);
        pathBuilder.arcTo(36.32f, 36.32f, 0.0f, false, true, 172.0f, 162.08f);
        pathBuilder.lineTo(172.0f, 76.0f);
        pathBuilder.lineTo(36.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 180.0f);
        pathBuilder.lineTo(232.0f, 132.0f);
        pathBuilder.lineTo(196.0f, 132.0f);
        pathBuilder.verticalLineToRelative(24.23f);
        pathBuilder.arcTo(36.09f, 36.09f, 0.0f, false, true, 225.94f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ambulance = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
