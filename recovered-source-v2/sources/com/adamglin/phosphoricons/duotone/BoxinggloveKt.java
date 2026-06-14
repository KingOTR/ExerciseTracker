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

/* compiled from: Boxingglove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BoxingGlove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBoxingGlove", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boxingGlove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoxinggloveKt {
    private static ImageVector _boxingGlove;

    public static final ImageVector getBoxingGlove(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _boxingGlove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BoxingGlove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 72.0f);
        pathBuilder.verticalLineToRelative(46.88f);
        pathBuilder.arcToRelative(7.85f, 7.85f, 0.0f, false, true, -0.31f, 2.2f);
        pathBuilder.lineTo(200.0f, 176.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.lineTo(33.75f, 138.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.75f, -5.0f);
        pathBuilder.verticalLineTo(104.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 80.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 216.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 16.0f);
        pathBuilder2.lineTo(120.0f, 16.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, false, 64.0f, 72.0f);
        pathBuilder2.lineTo(56.0f, 72.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f);
        pathBuilder2.verticalLineToRelative(29.19f);
        pathBuilder2.arcToRelative(16.14f, 16.14f, 0.0f, false, false, 3.5f, 10.0f);
        pathBuilder2.quadToRelative(0.3f, 0.36f, 0.63f, 0.69f);
        pathBuilder2.lineTo(64.0f, 179.34f);
        pathBuilder2.lineTo(64.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(192.0f, 232.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(208.0f, 177.12f);
        pathBuilder2.lineToRelative(15.38f, -53.84f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.62f, -4.4f);
        pathBuilder2.lineTo(224.0f, 72.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, false, 168.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 118.88f);
        pathBuilder2.lineTo(192.31f, 173.8f);
        pathBuilder2.arcTo(7.85f, 7.85f, 0.0f, false, false, 192.0f, 176.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.lineTo(80.0f, 216.0f);
        pathBuilder2.lineTo(80.0f, 176.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.38f, -5.69f);
        pathBuilder2.lineTo(40.0f, 133.12f);
        pathBuilder2.lineTo(40.0f, 104.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 88.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(80.0f, 72.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(171.58f, 167.16f);
        pathBuilder2.lineTo(153.89f, 176.0f);
        pathBuilder2.lineToRelative(17.69f, 8.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 14.32f);
        pathBuilder2.lineTo(136.0f, 184.94f);
        pathBuilder2.lineToRelative(-28.42f, 14.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -7.16f, -14.32f);
        pathBuilder2.lineTo(118.11f, 176.0f);
        pathBuilder2.lineToRelative(-17.69f, -8.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, -14.32f);
        pathBuilder2.lineTo(136.0f, 167.06f);
        pathBuilder2.lineToRelative(28.42f, -14.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boxingGlove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
