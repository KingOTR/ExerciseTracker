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

/* compiled from: Motorcycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Motorcycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMotorcycle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_motorcycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Motorcycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 112.0f);
        pathBuilder.curveToRelative(-0.57f, 0.0f, -1.13f, 0.0f, -1.69f, 0.0f);
        pathBuilder.lineToRelative(-3.5f, -11.8f);
        pathBuilder.curveToRelative(1.71f, -0.15f, 3.44f, -0.24f, 5.19f, -0.24f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(195.63f, 75.96f);
        pathBuilder.lineToRelative(-8.12f, -27.41f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 40.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(23.0f);
        pathBuilder.lineToRelative(3.56f, 12.0f);
        pathBuilder.lineTo(152.0f, 76.0f);
        pathBuilder.curveToRelative(-19.44f, 0.0f, -35.32f, 4.62f, -45.92f, 13.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.56f, 1.52f);
        pathBuilder.curveToRelative(-13.13f, -6.0f, -57.19f, -25.0f, -61.65f, -26.89f);
        pathBuilder.lineTo(26.6f, 61.76f);
        pathBuilder.reflectiveCurveTo(22.4f, 60.0f, 20.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.61f, 23.08f);
        pathBuilder.curveToRelative(1.72f, 0.73f, 43.67f, 18.5f, 68.2f, 29.66f);
        pathBuilder.arcToRelative(36.25f, 36.25f, 0.0f, false, false, 15.0f, 3.23f);
        pathBuilder.arcToRelative(35.78f, 35.78f, 0.0f, false, false, 22.78f, -8.09f);
        pathBuilder.curveToRelative(5.74f, -4.73f, 15.58f, -7.48f, 27.89f, -7.84f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -24.4f, 48.0f);
        pathBuilder.lineTo(94.48f, 148.04f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 24.0f);
        pathBuilder.lineTo(136.0f, 172.04f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 31.8f, -52.94f);
        pathBuilder.lineToRelative(3.5f, 11.8f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 172.0f);
        pathBuilder.lineTo(68.77f, 172.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -24.0f);
        pathBuilder.lineTo(48.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 184.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.4f, -40.5f);
        pathBuilder.lineToRelative(5.89f, 19.91f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 172.0f);
        pathBuilder.arcToRelative(12.28f, 12.28f, 0.0f, false, false, 3.41f, -0.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.1f, -14.92f);
        pathBuilder.lineToRelative(-5.91f, -19.92f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 208.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _motorcycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
