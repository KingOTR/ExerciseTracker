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

/* compiled from: Hoodie.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hoodie", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHoodie", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hoodie", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HoodieKt {
    private static ImageVector _hoodie;

    public static final ImageVector getHoodie(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _hoodie;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hoodie", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.72f, 131.51f);
        pathBuilder.lineTo(210.28f, 210.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, 5.9f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(53.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, -5.9f);
        pathBuilder.lineTo(24.28f, 131.51f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 25.34f, 125.0f);
        pathBuilder.lineTo(72.0f, 55.0f);
        pathBuilder.lineToRelative(56.0f, 33.0f);
        pathBuilder.lineToRelative(56.0f, -33.0f);
        pathBuilder.lineToRelative(46.66f, 70.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 231.72f, 131.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.31f, 120.53f);
        pathBuilder2.lineTo(183.0f, 39.12f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 169.73f, 32.0f);
        pathBuilder2.lineTo(86.27f, 32.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 73.0f, 39.12f);
        pathBuilder2.lineTo(18.69f, 120.53f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.13f, 13.09f);
        pathBuilder2.lineTo(38.0f, 212.21f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 53.43f, 224.0f);
        pathBuilder2.lineTo(80.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(96.0f, 192.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(26.57f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 218.0f, 212.21f);
        pathBuilder2.lineToRelative(21.44f, -78.59f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 237.31f, 120.53f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 176.0f);
        pathBuilder2.lineTo(80.0f, 69.0f);
        pathBuilder2.lineToRelative(24.0f, 14.15f);
        pathBuilder2.lineTo(104.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 92.57f);
        pathBuilder2.lineToRelative(3.94f, 2.32f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.12f, 0.0f);
        pathBuilder2.lineTo(136.0f, 92.57f);
        pathBuilder2.lineTo(136.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(152.0f, 83.14f);
        pathBuilder2.lineTo(176.0f, 69.0f);
        pathBuilder2.lineTo(176.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(169.73f, 48.0f);
        pathBuilder2.lineToRelative(2.92f, 4.39f);
        pathBuilder2.lineTo(128.0f, 78.71f);
        pathBuilder2.lineTo(83.35f, 52.39f);
        pathBuilder2.lineTo(86.27f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 208.0f);
        pathBuilder2.lineTo(53.43f, 208.0f);
        pathBuilder2.lineTo(32.0f, 129.41f);
        pathBuilder2.lineToRelative(32.0f, -48.0f);
        pathBuilder2.lineTo(64.0f, 176.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(202.57f, 208.0f);
        pathBuilder2.lineTo(176.0f, 208.0f);
        pathBuilder2.lineTo(176.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(192.0f, 81.41f);
        pathBuilder2.lineToRelative(32.0f, 48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hoodie = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
