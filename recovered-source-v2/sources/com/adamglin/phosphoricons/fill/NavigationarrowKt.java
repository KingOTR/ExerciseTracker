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

/* compiled from: Navigationarrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NavigationArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNavigationArrow", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_navigationArrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationarrowKt {
    private static ImageVector _navigationArrow;

    public static final ImageVector getNavigationArrow(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 121.58f);
        pathBuilder.arcToRelative(15.76f, 15.76f, 0.0f, false, true, -11.29f, 15.0f);
        pathBuilder.lineToRelative(-0.2f, 0.06f);
        pathBuilder.lineToRelative(-78.0f, 21.84f);
        pathBuilder.lineToRelative(-21.84f, 78.0f);
        pathBuilder.lineToRelative(-0.06f, 0.2f);
        pathBuilder.arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.0f, 11.29f);
        pathBuilder.horizontalLineToRelative(-0.3f);
        pathBuilder.arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.07f, -10.67f);
        pathBuilder.lineTo(41.0f, 61.41f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.05f, -0.16f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 61.25f, 40.9f);
        pathBuilder.lineToRelative(0.16f, 0.05f);
        pathBuilder.lineToRelative(175.92f, 65.26f);
        pathBuilder.arcTo(15.78f, 15.78f, 0.0f, false, true, 248.0f, 121.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _navigationArrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
