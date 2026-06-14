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

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCat", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _cat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 48.6f, -43.0f, 88.0f, -96.0f, 88.0f);
        pathBuilder.reflectiveCurveToRelative(-96.0f, -39.4f, -96.0f, -88.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f);
        pathBuilder.lineTo(67.6f, 67.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(102.87f, 102.87f, 0.0f, false, true, 120.8f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(21.94f, -25.24f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(96.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(172.0f, 128.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 48.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.curveToRelative(0.0f, 52.93f, -46.65f, 96.0f, -104.0f, 96.0f);
        pathBuilder2.reflectiveCurveTo(24.0f, 188.93f, 24.0f, 136.0f);
        pathBuilder2.lineTo(24.0f, 48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 51.31f, 36.69f);
        pathBuilder2.curveToRelative(0.14f, 0.14f, 0.26f, 0.27f, 0.38f, 0.41f);
        pathBuilder2.lineTo(69.0f, 57.0f);
        pathBuilder2.arcToRelative(111.22f, 111.22f, 0.0f, false, true, 118.1f, 0.0f);
        pathBuilder2.lineTo(204.31f, 37.1f);
        pathBuilder2.curveToRelative(0.12f, -0.14f, 0.24f, -0.27f, 0.38f, -0.41f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 48.0f);
        pathBuilder2.lineTo(194.44f, 72.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 183.63f, 74.0f);
        pathBuilder2.arcTo(88.86f, 88.86f, 0.0f, false, false, 168.0f, 64.75f);
        pathBuilder2.lineTo(168.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(152.0f, 59.05f);
        pathBuilder2.arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, -2.72f);
        pathBuilder2.lineTo(136.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 56.33f);
        pathBuilder2.arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, 2.72f);
        pathBuilder2.lineTo(104.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(88.0f, 64.75f);
        pathBuilder2.arcTo(88.86f, 88.86f, 0.0f, false, false, 72.37f, 74.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.81f, -1.17f);
        pathBuilder2.lineTo(40.0f, 48.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.curveToRelative(0.0f, 41.66f, 35.21f, 76.0f, 80.0f, 79.67f);
        pathBuilder2.lineTo(120.0f, 195.31f);
        pathBuilder2.lineToRelative(-13.66f, -13.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.31f);
        pathBuilder2.lineTo(128.0f, 180.68f);
        pathBuilder2.lineToRelative(10.34f, -10.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f);
        pathBuilder2.lineTo(136.0f, 195.31f);
        pathBuilder2.verticalLineToRelative(20.36f);
        pathBuilder2.curveToRelative(44.79f, -3.69f, 80.0f, -38.0f, 80.0f, -79.67f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
