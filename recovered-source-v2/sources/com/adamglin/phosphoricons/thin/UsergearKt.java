package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Usergear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserGear", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsergearKt {
    private static ImageVector _userGear;

    public static final ImageVector getUserGear(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(133.17f, 158.84f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.34f, 0.0f);
        pathBuilder.curveToRelative(-23.76f, 5.46f, -45.18f, 18.69f, -61.89f, 38.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.12f, 5.14f);
        pathBuilder.curveTo(48.0f, 177.7f, 76.7f, 164.0f, 108.0f, 164.0f);
        pathBuilder.reflectiveCurveToRelative(60.0f, 13.7f, 80.94f, 38.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, -5.14f);
        pathBuilder.curveTo(178.35f, 177.53f, 156.93f, 164.3f, 133.17f, 158.84f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 100.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 52.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(250.25f, 146.54f);
        pathBuilder.lineTo(243.0f, 142.33f);
        pathBuilder.arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, -12.66f);
        pathBuilder.lineToRelative(7.29f, -4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, -6.92f);
        pathBuilder.lineToRelative(-7.31f, 4.21f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 116.4f);
        pathBuilder.lineTo(228.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -10.94f, 6.35f);
        pathBuilder.lineToRelative(-7.31f, -4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f);
        pathBuilder.lineToRelative(7.29f, 4.21f);
        pathBuilder.arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, 12.66f);
        pathBuilder.lineToRelative(-7.29f, 4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 7.46f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, -0.54f);
        pathBuilder.lineToRelative(7.31f, -4.21f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 220.0f, 155.6f);
        pathBuilder.lineTo(220.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.94f, -6.35f);
        pathBuilder.lineToRelative(7.31f, 4.21f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, 0.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -7.46f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 224.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
