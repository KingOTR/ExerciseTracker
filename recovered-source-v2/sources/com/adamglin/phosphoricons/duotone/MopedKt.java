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

/* compiled from: Moped.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moped", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMoped", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moped", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MopedKt {
    private static ImageVector _moped;

    public static final ImageVector getMoped(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _moped;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Moped", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(131.0f, 168.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 32.0f, -45.27f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 128.0f);
        pathBuilder2.arcToRelative(39.3f, 39.3f, 0.0f, false, false, -6.27f, 0.5f);
        pathBuilder2.lineTo(175.49f, 37.19f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f);
        pathBuilder2.horizontalLineTo(136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(26.46f);
        pathBuilder2.lineToRelative(32.3f, 86.13f);
        pathBuilder2.arcToRelative(40.13f, 40.13f, 0.0f, false, false, -18.0f, 25.87f);
        pathBuilder2.horizontalLineTo(136.54f);
        pathBuilder2.lineToRelative(-25.0f, -66.81f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f);
        pathBuilder2.horizontalLineTo(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(13.39f);
        pathBuilder2.arcTo(56.12f, 56.12f, 0.0f, false, false, 0.0f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(8.8f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f);
        pathBuilder2.horizontalLineToRelative(81.6f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, true, false, 216.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 192.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f);
        pathBuilder2.horizontalLineTo(78.62f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.81f, 160.0f);
        pathBuilder2.arcToRelative(40.07f, 40.07f, 0.0f, false, true, 25.86f, -29.73f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 122.73f);
        pathBuilder2.verticalLineTo(104.0f);
        pathBuilder2.horizontalLineTo(98.46f);
        pathBuilder2.lineToRelative(21.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 192.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -15.43f, -42.36f);
        pathBuilder2.lineToRelative(7.94f, 21.17f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, -5.62f);
        pathBuilder2.lineTo(215.55f, 144.0f);
        pathBuilder2.horizontalLineTo(216.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moped = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
