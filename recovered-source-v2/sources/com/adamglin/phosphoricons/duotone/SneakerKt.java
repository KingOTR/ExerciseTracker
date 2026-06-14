package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sneaker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sneaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSneaker", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneaker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakerKt {
    private static ImageVector _sneaker;

    public static final ImageVector getSneaker(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 167.06f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.verticalLineTo(75.54f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 37.27f, 68.0f);
        pathBuilder.lineTo(113.0f, 40.48f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 4.27f);
        pathBuilder.lineTo(146.27f, 99.1f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 19.12f, 17.36f);
        pathBuilder.lineToRelative(60.73f, 20.25f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 248.0f, 167.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(228.65f, 129.11f);
        pathBuilder2.lineToRelative(-60.73f, -20.24f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -14.32f, -13.0f);
        pathBuilder2.lineTo(130.39f, 41.6f);
        pathBuilder2.reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.1f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 110.25f, 33.0f);
        pathBuilder2.lineTo(34.53f, 60.49f);
        pathBuilder2.arcTo(16.05f, 16.05f, 0.0f, false, false, 24.0f, 75.53f);
        pathBuilder2.verticalLineTo(192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineTo(240.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.verticalLineTo(167.06f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 228.65f, 129.11f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 75.53f);
        pathBuilder2.lineTo(115.72f, 48.0f);
        pathBuilder2.lineToRelative(7.11f, 16.63f);
        pathBuilder2.lineToRelative(-21.56f, 7.85f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f);
        pathBuilder2.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f);
        pathBuilder2.lineToRelative(22.4f, -8.14f);
        pathBuilder2.lineToRelative(4.74f, 11.07f);
        pathBuilder2.lineToRelative(-16.6f, 6.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 112.0f);
        pathBuilder2.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f);
        pathBuilder2.lineToRelative(17.6f, -6.4f);
        pathBuilder2.arcToRelative(40.06f, 40.06f, 0.0f, false, false, 7.68f, 10.0f);
        pathBuilder2.lineToRelative(-14.74f, 5.36f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 136.0f);
        pathBuilder2.arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f);
        pathBuilder2.lineToRelative(28.0f, -10.18f);
        pathBuilder2.lineToRelative(56.87f, 18.95f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 238.93f, 160.0f);
        pathBuilder2.horizontalLineTo(40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 192.0f);
        pathBuilder2.horizontalLineTo(40.0f);
        pathBuilder2.verticalLineTo(176.0f);
        pathBuilder2.horizontalLineTo(240.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneaker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
