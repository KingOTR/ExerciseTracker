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

/* compiled from: Handfist.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandFist", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandFist", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handFist", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandfistKt {
    private static ImageVector _handFist;

    public static final ImageVector getHandFist(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handFist;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandFist", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 82.0f);
        pathBuilder.lineTo(182.0f, 82.0f);
        pathBuilder.lineTo(182.0f, 64.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -54.0f, -18.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 74.0f, 64.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 26.0f, 88.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, 204.0f, 0.0f);
        pathBuilder.lineTo(230.0f, 112.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 46.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.lineTo(170.0f, 82.0f);
        pathBuilder.lineTo(136.0f, 82.0f);
        pathBuilder.arcToRelative(14.71f, 14.71f, 0.0f, false, false, -2.0f, 0.16f);
        pathBuilder.lineTo(134.0f, 64.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 64.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 88.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -180.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.0f, -6.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 45.12f, 3.3f);
        pathBuilder.arcTo(30.18f, 30.18f, 0.0f, false, false, 140.0f, 139.51f);
        pathBuilder.arcTo(45.92f, 45.92f, 0.0f, false, false, 122.0f, 176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(152.0f, 130.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f);
        pathBuilder.lineTo(134.0f, 96.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handFist = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
