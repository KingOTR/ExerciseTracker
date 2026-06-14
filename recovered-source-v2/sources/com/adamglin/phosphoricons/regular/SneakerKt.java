package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sneaker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sneaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSneaker", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneaker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakerKt {
    private static ImageVector _sneaker;

    public static final ImageVector getSneaker(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.lineToRelative(-60.73f, -20.24f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -14.32f, -13.0f);
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
        pathBuilder.moveTo(115.72f, 48.0f);
        pathBuilder.lineToRelative(7.11f, 16.63f);
        pathBuilder.lineToRelative(-21.56f, 7.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f);
        pathBuilder.lineToRelative(22.4f, -8.14f);
        pathBuilder.lineToRelative(4.74f, 11.07f);
        pathBuilder.lineToRelative(-16.6f, 6.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 112.0f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f);
        pathBuilder.lineToRelative(17.6f, -6.4f);
        pathBuilder.arcToRelative(40.24f, 40.24f, 0.0f, false, false, 7.68f, 10.0f);
        pathBuilder.lineToRelative(-14.74f, 5.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 136.0f);
        pathBuilder.arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f);
        pathBuilder.lineToRelative(28.0f, -10.18f);
        pathBuilder.lineToRelative(56.87f, 18.95f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 238.93f, 160.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(75.53f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneaker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
