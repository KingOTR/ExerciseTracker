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

/* compiled from: Angularlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AngularLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAngularLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_angularLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AngularlogoKt {
    private static ImageVector _angularLogo;

    public static final ImageVector getAngularLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _angularLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AngularLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.61f, 60.92f);
        pathBuilder.lineToRelative(-96.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.24f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.28f, 12.67f);
        pathBuilder.lineToRelative(16.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.52f, 9.14f);
        pathBuilder.lineToRelative(80.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f);
        pathBuilder.lineToRelative(80.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.52f, -9.14f);
        pathBuilder.lineToRelative(16.0f, -120.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 228.61f, 60.92f);
        pathBuilder.close();
        pathBuilder.moveTo(197.0f, 184.11f);
        pathBuilder.lineTo(128.0f, 218.58f);
        pathBuilder.lineTo(59.05f, 184.11f);
        pathBuilder.lineTo(45.11f, 79.54f);
        pathBuilder.lineTo(128.0f, 45.0f);
        pathBuilder.lineToRelative(82.89f, 34.54f);
        pathBuilder.close();
        pathBuilder.moveTo(117.51f, 82.17f);
        pathBuilder.lineToRelative(-40.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.0f, 11.66f);
        pathBuilder.lineTo(106.17f, 152.0f);
        pathBuilder.horizontalLineToRelative(43.66f);
        pathBuilder.lineToRelative(7.68f, 13.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.0f, -11.66f);
        pathBuilder.lineToRelative(-40.0f, -72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(119.51f, 128.0f);
        pathBuilder.lineTo(128.0f, 112.71f);
        pathBuilder.lineTo(136.49f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _angularLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
