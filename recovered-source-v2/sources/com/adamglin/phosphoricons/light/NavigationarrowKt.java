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

/* compiled from: Navigationarrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NavigationArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNavigationArrow", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_navigationArrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationarrowKt {
    private static ImageVector _navigationArrow;

    public static final ImageVector getNavigationArrow(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _navigationArrow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NavigationArrow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.65f, 108.1f);
        pathBuilder.lineTo(60.72f, 42.83f);
        pathBuilder.lineToRelative(-0.13f, 0.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 42.78f, 60.59f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.09f, 0.0f, 0.13f);
        pathBuilder.lineTo(108.1f, 236.65f);
        pathBuilder.arcTo(13.77f, 13.77f, 0.0f, false, false, 121.28f, 246.0f);
        pathBuilder.horizontalLineToRelative(0.26f);
        pathBuilder.arcToRelative(13.8f, 13.8f, 0.0f, false, false, 13.14f, -9.88f);
        pathBuilder.lineToRelative(0.0f, -0.15f);
        pathBuilder.lineToRelative(22.14f, -79.1f);
        pathBuilder.lineTo(236.0f, 134.73f);
        pathBuilder.lineToRelative(0.15f, 0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.53f, -26.58f);
        pathBuilder.close();
        pathBuilder.moveTo(232.65f, 123.2f);
        pathBuilder.lineTo(150.39f, 146.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.16f, 4.16f);
        pathBuilder.lineToRelative(-23.0f, 82.26f);
        pathBuilder.arcToRelative(1.85f, 1.85f, 0.0f, false, true, -1.86f, 1.36f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.92f, -1.35f);
        pathBuilder.arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, -0.12f);
        pathBuilder.lineTo(54.11f, 56.62f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.51f, -2.51f);
        pathBuilder.lineToRelative(175.91f, 65.26f);
        pathBuilder.lineToRelative(0.12f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _navigationArrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
