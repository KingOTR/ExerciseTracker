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

/* compiled from: Sneaker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sneaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSneaker", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneaker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakerKt {
    private static ImageVector _sneaker;

    public static final ImageVector getSneaker(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(228.0f, 131.0f);
        pathBuilder.lineToRelative(-60.73f, -20.24f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -15.51f, -14.0f);
        pathBuilder.lineTo(128.51f, 42.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -17.57f, -7.47f);
        pathBuilder.lineTo(35.22f, 62.37f);
        pathBuilder.arcTo(14.05f, 14.05f, 0.0f, false, false, 26.0f, 75.53f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.verticalLineTo(167.06f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 228.0f, 131.0f);
        pathBuilder.close();
        pathBuilder.moveTo(39.32f, 73.65f);
        pathBuilder.lineTo(115.0f, 46.12f);
        pathBuilder.arcToRelative(1.81f, 1.81f, 0.0f, false, true, 0.68f, -0.12f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 1.11f);
        pathBuilder.lineToRelative(8.0f, 18.68f);
        pathBuilder.lineTo(102.0f, 74.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 86.0f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, 2.0f, -0.37f);
        pathBuilder.lineToRelative(24.18f, -8.79f);
        pathBuilder.lineToRelative(6.31f, 14.76f);
        pathBuilder.lineTo(118.0f, 98.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 110.0f);
        pathBuilder.arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, -0.36f);
        pathBuilder.lineToRelative(19.26f, -7.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 10.57f, 13.21f);
        pathBuilder.lineTo(134.0f, 122.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 136.0f, 134.0f);
        pathBuilder.arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.05f, -0.36f);
        pathBuilder.lineToRelative(28.64f, -10.42f);
        pathBuilder.lineToRelative(57.53f, 19.18f);
        pathBuilder.arcTo(25.94f, 25.94f, 0.0f, false, true, 241.49f, 162.0f);
        pathBuilder.horizontalLineTo(38.0f);
        pathBuilder.verticalLineTo(75.53f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 39.32f, 73.65f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 194.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(174.0f);
        pathBuilder.horizontalLineTo(242.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 240.0f, 194.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneaker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
