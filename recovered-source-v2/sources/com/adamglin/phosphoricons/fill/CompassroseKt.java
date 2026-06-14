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

/* compiled from: Compassrose.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassRose", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCompassRose", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassRose", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompassroseKt {
    private static ImageVector _compassRose;

    public static final ImageVector getCompassRose(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _compassRose;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CompassRose", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.94f, 120.24f);
        pathBuilder.lineToRelative(-27.05f, -6.76f);
        pathBuilder.arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, -80.37f);
        pathBuilder.lineToRelative(-6.76f, -27.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, 0.0f);
        pathBuilder.lineToRelative(-6.76f, 27.05f);
        pathBuilder.arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, 80.37f);
        pathBuilder.lineToRelative(-27.0f, 6.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 15.52f);
        pathBuilder.lineToRelative(27.05f, 6.76f);
        pathBuilder.arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, 80.37f);
        pathBuilder.lineToRelative(6.76f, 27.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.52f, 0.0f);
        pathBuilder.lineToRelative(6.76f, -27.05f);
        pathBuilder.arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, -80.37f);
        pathBuilder.lineToRelative(27.05f, -6.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.52f);
        pathBuilder.close();
        pathBuilder.moveTo(205.77f, 109.24f);
        pathBuilder.lineTo(158.6f, 97.4f);
        pathBuilder.lineTo(146.8f, 50.23f);
        pathBuilder.arcTo(79.88f, 79.88f, 0.0f, false, true, 205.77f, 109.2f);
        pathBuilder.close();
        pathBuilder.moveTo(109.2f, 50.24f);
        pathBuilder.lineTo(97.4f, 97.4f);
        pathBuilder.lineTo(50.23f, 109.2f);
        pathBuilder.arcTo(79.88f, 79.88f, 0.0f, false, true, 109.2f, 50.23f);
        pathBuilder.close();
        pathBuilder.moveTo(50.2f, 146.81f);
        pathBuilder.lineTo(97.4f, 158.6f);
        pathBuilder.lineToRelative(11.8f, 47.17f);
        pathBuilder.arcTo(79.88f, 79.88f, 0.0f, false, true, 50.23f, 146.8f);
        pathBuilder.close();
        pathBuilder.moveTo(146.77f, 205.81f);
        pathBuilder.lineTo(158.57f, 158.64f);
        pathBuilder.lineTo(205.74f, 146.84f);
        pathBuilder.arcTo(79.88f, 79.88f, 0.0f, false, true, 146.8f, 205.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassRose = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
