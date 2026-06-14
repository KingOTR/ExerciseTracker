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

/* compiled from: Sneakermove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SneakerMove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSneakerMove", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneakerMove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakermoveKt {
    private static ImageVector _sneakerMove;

    public static final ImageVector getSneakerMove(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _sneakerMove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SneakerMove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 180.94f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(148.06f);
        pathBuilder.lineTo(34.34f, 94.28f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 35.0f, 82.41f);
        pathBuilder.lineTo(112.0f, 24.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder.verticalLineToRelative(29.39f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 31.0f, 50.09f);
        pathBuilder.lineToRelative(28.62f, 14.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 180.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(231.16f, 166.63f);
        pathBuilder2.lineToRelative(-28.63f, -14.31f);
        pathBuilder2.arcTo(47.74f, 47.74f, 0.0f, false, true, 176.0f, 109.39f);
        pathBuilder2.lineTo(176.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.83f, -6.37f);
        pathBuilder2.lineTo(30.13f, 76.0f);
        pathBuilder2.lineToRelative(-0.2f, 0.16f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.24f, 23.75f);
        pathBuilder2.lineTo(142.4f, 213.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, 2.34f);
        pathBuilder2.lineTo(224.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(240.0f, 180.94f);
        pathBuilder2.arcTo(15.92f, 15.92f, 0.0f, false, false, 231.16f, 166.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 200.0f);
        pathBuilder2.lineTo(151.37f, 200.0f);
        pathBuilder2.lineTo(40.0f, 88.63f);
        pathBuilder2.lineToRelative(12.87f, -9.76f);
        pathBuilder2.lineToRelative(38.79f, 38.79f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 103.0f, 106.34f);
        pathBuilder2.lineTo(65.74f, 69.11f);
        pathBuilder2.lineToRelative(40.0f, -30.31f);
        pathBuilder2.arcTo(64.15f, 64.15f, 0.0f, false, false, 160.0f, 87.5f);
        pathBuilder2.verticalLineToRelative(21.89f);
        pathBuilder2.arcToRelative(63.65f, 63.65f, 0.0f, false, false, 35.38f, 57.24f);
        pathBuilder2.lineTo(224.0f, 180.94f);
        pathBuilder2.close();
        pathBuilder2.moveTo(70.8f, 184.0f);
        pathBuilder2.lineTo(32.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.lineTo(70.8f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(110.8f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(48.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(54.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 110.8f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneakerMove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
