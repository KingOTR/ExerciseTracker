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

/* compiled from: Sharefat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShareFat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getShareFat", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shareFat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharefatKt {
    private static ImageVector _shareFat;

    public static final ImageVector getShareFat(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _shareFat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShareFat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 192.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.curveToRelative(-61.4f, 0.0f, -104.61f, 37.19f, -121.07f, 54.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.9f, -3.18f);
        pathBuilder.curveTo(31.51f, 130.45f, 99.19f, 80.0f, 152.0f, 80.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.lineToRelative(80.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.66f, 106.35f);
        pathBuilder2.lineToRelative(-80.0f, -80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 32.0f);
        pathBuilder2.verticalLineTo(72.35f);
        pathBuilder2.curveToRelative(-25.94f, 2.22f, -54.59f, 14.92f, -78.16f, 34.91f);
        pathBuilder2.curveToRelative(-28.38f, 24.08f, -46.05f, 55.11f, -49.76f, 87.37f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.68f, 9.58f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(11.0f, -11.71f, 50.14f, -48.74f, 107.24f, -52.0f);
        pathBuilder2.verticalLineTo(192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.65f);
        pathBuilder2.lineToRelative(80.0f, -80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 106.35f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 172.69f);
        pathBuilder2.verticalLineTo(144.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.curveToRelative(-28.08f, 0.0f, -55.43f, 7.33f, -81.29f, 21.8f);
        pathBuilder2.arcToRelative(196.17f, 196.17f, 0.0f, false, false, -36.57f, 26.52f);
        pathBuilder2.curveToRelative(5.8f, -23.84f, 20.42f, -46.51f, 42.05f, -64.86f);
        pathBuilder2.curveTo(99.41f, 99.77f, 127.75f, 88.0f, 152.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.verticalLineTo(51.32f);
        pathBuilder2.lineTo(220.69f, 112.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shareFat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
