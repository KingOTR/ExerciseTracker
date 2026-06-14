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

/* compiled from: Sparkle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sparkle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSparkle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sparkle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SparkleKt {
    private static ImageVector _sparkle;

    public static final ImageVector getSparkle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _sparkle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sparkle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(194.82f, 151.43f);
        pathBuilder.lineToRelative(-55.09f, 20.3f);
        pathBuilder.lineToRelative(-20.3f, 55.09f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, -14.86f, 0.0f);
        pathBuilder.lineToRelative(-20.3f, -55.09f);
        pathBuilder.lineToRelative(-55.09f, -20.3f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, 0.0f, -14.86f);
        pathBuilder.lineToRelative(55.09f, -20.3f);
        pathBuilder.lineToRelative(20.3f, -55.09f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, 14.86f, 0.0f);
        pathBuilder.lineToRelative(20.3f, 55.09f);
        pathBuilder.lineToRelative(55.09f, 20.3f);
        pathBuilder.arcTo(7.92f, 7.92f, 0.0f, false, true, 194.82f, 151.43f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(197.58f, 129.06f);
        pathBuilder2.lineTo(146.0f, 110.0f);
        pathBuilder2.lineToRelative(-19.0f, -51.62f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, -29.88f, 0.0f);
        pathBuilder2.lineTo(78.0f, 110.0f);
        pathBuilder2.lineToRelative(-51.62f, 19.0f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 0.0f, 29.88f);
        pathBuilder2.lineTo(78.0f, 178.0f);
        pathBuilder2.lineToRelative(19.0f, 51.62f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 29.88f, 0.0f);
        pathBuilder2.lineTo(146.0f, 178.0f);
        pathBuilder2.lineToRelative(51.62f, -19.0f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 0.0f, -29.88f);
        pathBuilder2.close();
        pathBuilder2.moveTo(137.0f, 164.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.74f, 4.74f);
        pathBuilder2.lineTo(112.0f, 223.85f);
        pathBuilder2.lineTo(91.78f, 169.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 87.0f, 164.22f);
        pathBuilder2.lineTo(32.15f, 144.0f);
        pathBuilder2.lineTo(87.0f, 123.78f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 91.78f, 119.0f);
        pathBuilder2.lineTo(112.0f, 64.15f);
        pathBuilder2.lineTo(132.22f, 119.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.74f, 4.74f);
        pathBuilder2.lineTo(191.85f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(32.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineTo(184.0f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.horizontalLineTo(152.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(248.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.verticalLineTo(96.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 88.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sparkle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
