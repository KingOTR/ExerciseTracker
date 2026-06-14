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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _binoculars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binoculars", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(104.0f, 168.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 104.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 128.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.2f, 151.87f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, -5.45f);
        pathBuilder2.lineTo(193.26f, 51.8f);
        pathBuilder2.arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, -2.44f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 55.0f);
        pathBuilder2.verticalLineTo(80.0f);
        pathBuilder2.horizontalLineTo(112.0f);
        pathBuilder2.verticalLineTo(55.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder2.arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, 2.44f);
        pathBuilder2.lineTo(21.15f, 146.4f);
        pathBuilder2.arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, 5.45f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, true, false, 112.0f, 168.0f);
        pathBuilder2.verticalLineTo(96.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 93.2f, -16.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.71f, 59.75f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, -1.0f);
        pathBuilder2.verticalLineToRelative(73.51f);
        pathBuilder2.arcToRelative(47.9f, 47.9f, 0.0f, false, false, -46.79f, -9.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(64.0f, 200.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 58.74f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, 1.0f);
        pathBuilder2.lineToRelative(27.5f, 62.58f);
        pathBuilder2.arcTo(47.9f, 47.9f, 0.0f, false, false, 160.0f, 132.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 200.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 200.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
