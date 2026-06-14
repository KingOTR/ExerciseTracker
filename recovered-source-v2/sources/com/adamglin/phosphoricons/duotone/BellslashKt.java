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

/* compiled from: Bellslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBellSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellslashKt {
    private static ImageVector _bellSlash;

    public static final ImageVector getBellSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bellSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 192.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.88f, -12.0f);
        pathBuilder.curveTo(47.71f, 168.6f, 56.0f, 139.81f, 56.0f, 104.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.82f, 8.3f, 64.6f, 14.9f, 76.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.92f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder2.lineTo(58.82f, 63.8f);
        pathBuilder2.arcTo(79.59f, 79.59f, 0.0f, false, false, 48.0f, 104.0f);
        pathBuilder2.curveToRelative(0.0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f);
        pathBuilder2.lineTo(88.8f, 200.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f);
        pathBuilder2.horizontalLineToRelative(15.44f);
        pathBuilder2.lineToRelative(19.44f, 21.38f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 216.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f);
        pathBuilder2.horizontalLineToRelative(45.24f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 184.0f);
        pathBuilder2.curveToRelative(7.7f, -13.24f, 16.0f, -43.92f, 16.0f, -80.0f);
        pathBuilder2.arcToRelative(63.65f, 63.65f, 0.0f, false, true, 6.26f, -27.62f);
        pathBuilder2.lineTo(168.09f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(214.0f, 179.27f);
        pathBuilder2.arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.93f, 0.55f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.44f, -5.08f);
        pathBuilder2.curveTo(196.35f, 156.19f, 192.0f, 129.75f, 192.0f, 104.0f);
        pathBuilder2.arcTo(64.0f, 64.0f, 0.0f, false, false, 96.43f, 48.31f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, -13.91f);
        pathBuilder2.arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f);
        pathBuilder2.curveToRelative(0.0f, 35.35f, 8.05f, 58.59f, 10.52f, 64.88f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 214.0f, 179.25f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
