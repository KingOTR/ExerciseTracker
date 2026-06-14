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

/* compiled from: Sneaker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sneaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSneaker", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneaker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakerKt {
    private static ImageVector _sneaker;

    public static final ImageVector getSneaker(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _sneaker;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sneaker", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.65f, 129.11f);
        pathBuilder.lineToRelative(-28.06f, -9.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, 0.0f);
        pathBuilder.lineToRelative(-43.23f, 15.72f);
        pathBuilder.arcTo(8.14f, 8.14f, 0.0f, false, true, 152.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, -5.88f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f);
        pathBuilder.lineTo(168.0f, 113.67f);
        pathBuilder.arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.06f, -4.8f);
        pathBuilder.arcToRelative(23.93f, 23.93f, 0.0f, false, true, -8.8f, -5.25f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.17f, -0.91f);
        pathBuilder.lineToRelative(-24.22f, 8.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.44f, -5.39f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f);
        pathBuilder.lineTo(146.0f, 88.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.31f, -5.34f);
        pathBuilder.lineToRelative(-3.06f, -7.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.05f, -2.19f);
        pathBuilder.lineToRelative(-25.5f, 9.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.44f, -5.39f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 5.22f, -9.73f);
        pathBuilder.lineToRelative(24.0f, -8.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.31f, -5.33f);
        pathBuilder.lineTo(130.39f, 41.6f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.1f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 110.25f, 33.0f);
        pathBuilder.lineTo(34.53f, 60.49f);
        pathBuilder.arcTo(16.05f, 16.05f, 0.0f, false, false, 24.0f, 75.53f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(167.06f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 228.65f, 129.11f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 192.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneaker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
