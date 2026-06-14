package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Phone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPhone", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneKt {
    private static ImageVector _phone;

    public static final ImageVector getPhone(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _phone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Phone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.59f, 160.3f);
        pathBuilder.lineToRelative(-47.24f, -21.17f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.28f, 1.22f);
        pathBuilder.arcToRelative(4.81f, 4.81f, 0.0f, false, false, -0.56f, 0.42f);
        pathBuilder.lineToRelative(-24.69f, 21.0f);
        pathBuilder.arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.68f, 0.06f);
        pathBuilder.curveToRelative(-15.87f, -7.66f, -32.31f, -24.0f, -40.0f, -39.65f);
        pathBuilder.arcToRelative(1.91f, 1.91f, 0.0f, false, true, 0.0f, -1.68f);
        pathBuilder.lineToRelative(21.07f, -25.0f);
        pathBuilder.arcToRelative(6.13f, 6.13f, 0.0f, false, false, 0.42f, -0.58f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.12f, -13.27f);
        pathBuilder.lineTo(95.73f, 34.49f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.56f, -8.38f);
        pathBuilder.arcTo(54.24f, 54.24f, 0.0f, false, false, 34.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 78.3f, 63.7f, 142.0f, 142.0f, 142.0f);
        pathBuilder.arcToRelative(54.25f, 54.25f, 0.0f, false, false, 53.89f, -47.17f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 221.59f, 160.3f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 210.0f);
        pathBuilder.curveTo(104.32f, 210.0f, 46.0f, 151.68f, 46.0f, 80.0f);
        pathBuilder.arcTo(42.23f, 42.23f, 0.0f, false, true, 82.67f, 38.0f);
        pathBuilder.horizontalLineToRelative(0.23f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.84f, 1.31f);
        pathBuilder.lineToRelative(21.1f, 47.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 1.67f);
        pathBuilder.lineTo(84.73f, 113.15f);
        pathBuilder.arcToRelative(4.73f, 4.73f, 0.0f, false, false, -0.43f, 0.57f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.91f, 13.73f);
        pathBuilder.curveToRelative(8.87f, 18.16f, 27.17f, 36.32f, 45.53f, 45.19f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.77f, -1.0f);
        pathBuilder.curveToRelative(0.19f, -0.13f, 0.38f, -0.27f, 0.56f, -0.42f);
        pathBuilder.lineToRelative(24.68f, -21.0f);
        pathBuilder.arcToRelative(1.92f, 1.92f, 0.0f, false, true, 1.6f, -0.1f);
        pathBuilder.lineToRelative(47.25f, 21.17f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.21f, 2.0f);
        pathBuilder.arcTo(42.24f, 42.24f, 0.0f, false, true, 176.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
