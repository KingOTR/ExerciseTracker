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

/* compiled from: Gift.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gift", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGift", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gift", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GiftKt {
    private static ImageVector _gift;

    public static final ImageVector getGift(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _gift;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gift", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 72.0f);
        pathBuilder2.lineTo(180.92f, 72.0f);
        pathBuilder2.curveToRelative(0.39f, -0.33f, 0.79f, -0.65f, 1.17f, -1.0f);
        pathBuilder2.arcTo(29.53f, 29.53f, 0.0f, false, false, 192.0f, 49.57f);
        pathBuilder2.arcTo(32.62f, 32.62f, 0.0f, false, false, 158.44f, 16.0f);
        pathBuilder2.arcTo(29.53f, 29.53f, 0.0f, false, false, 137.0f, 25.91f);
        pathBuilder2.arcToRelative(54.94f, 54.94f, 0.0f, false, false, -9.0f, 14.48f);
        pathBuilder2.arcToRelative(54.94f, 54.94f, 0.0f, false, false, -9.0f, -14.48f);
        pathBuilder2.arcTo(29.53f, 29.53f, 0.0f, false, false, 97.56f, 16.0f);
        pathBuilder2.arcTo(32.62f, 32.62f, 0.0f, false, false, 64.0f, 49.57f);
        pathBuilder2.arcTo(29.53f, 29.53f, 0.0f, false, false, 73.91f, 71.0f);
        pathBuilder2.curveToRelative(0.38f, 0.33f, 0.78f, 0.65f, 1.17f, 1.0f);
        pathBuilder2.lineTo(40.0f, 72.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(200.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 136.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(232.0f, 88.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(149.0f, 36.51f);
        pathBuilder2.arcToRelative(13.69f, 13.69f, 0.0f, false, true, 10.0f, -4.5f);
        pathBuilder2.horizontalLineToRelative(0.49f);
        pathBuilder2.arcTo(16.62f, 16.62f, 0.0f, false, true, 176.0f, 49.08f);
        pathBuilder2.arcToRelative(13.69f, 13.69f, 0.0f, false, true, -4.5f, 10.0f);
        pathBuilder2.curveToRelative(-9.49f, 8.4f, -25.24f, 11.36f, -35.0f, 12.4f);
        pathBuilder2.curveTo(137.7f, 60.89f, 141.0f, 45.5f, 149.0f, 36.51f);
        pathBuilder2.close();
        pathBuilder2.moveTo(84.91f, 36.87f);
        pathBuilder2.arcTo(16.63f, 16.63f, 0.0f, false, true, 96.59f, 32.0f);
        pathBuilder2.horizontalLineToRelative(0.49f);
        pathBuilder2.arcToRelative(13.69f, 13.69f, 0.0f, false, true, 10.0f, 4.5f);
        pathBuilder2.curveToRelative(8.39f, 9.48f, 11.35f, 25.2f, 12.39f, 34.92f);
        pathBuilder2.curveToRelative(-9.72f, -1.0f, -25.44f, -4.0f, -34.92f, -12.39f);
        pathBuilder2.arcToRelative(13.69f, 13.69f, 0.0f, false, true, -4.5f, -10.0f);
        pathBuilder2.arcTo(16.6f, 16.6f, 0.0f, false, true, 84.87f, 36.87f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 88.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.lineTo(40.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.lineTo(56.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 200.0f);
        pathBuilder2.lineTo(136.0f, 200.0f);
        pathBuilder2.lineTo(136.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 120.0f);
        pathBuilder2.lineTo(136.0f, 120.0f);
        pathBuilder2.lineTo(136.0f, 88.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gift = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
