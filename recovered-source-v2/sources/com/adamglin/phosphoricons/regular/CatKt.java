package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCat", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(96.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 52.93f, -46.65f, 96.0f, -104.0f, 96.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 188.93f, 24.0f, 136.0f);
        pathBuilder.lineTo(24.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 51.31f, 36.69f);
        pathBuilder.curveToRelative(0.14f, 0.14f, 0.26f, 0.27f, 0.38f, 0.41f);
        pathBuilder.lineTo(69.0f, 57.0f);
        pathBuilder.arcToRelative(111.22f, 111.22f, 0.0f, false, true, 118.1f, 0.0f);
        pathBuilder.lineTo(204.31f, 37.1f);
        pathBuilder.curveToRelative(0.12f, -0.14f, 0.24f, -0.27f, 0.38f, -0.41f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 48.0f);
        pathBuilder.lineTo(194.44f, 72.8f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 183.63f, 74.0f);
        pathBuilder.arcTo(88.86f, 88.86f, 0.0f, false, false, 168.0f, 64.75f);
        pathBuilder.lineTo(168.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(152.0f, 59.05f);
        pathBuilder.arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, -2.72f);
        pathBuilder.lineTo(136.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 56.33f);
        pathBuilder.arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, 2.72f);
        pathBuilder.lineTo(104.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 64.75f);
        pathBuilder.arcTo(88.86f, 88.86f, 0.0f, false, false, 72.37f, 74.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.81f, -1.17f);
        pathBuilder.lineTo(40.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 41.66f, 35.21f, 76.0f, 80.0f, 79.67f);
        pathBuilder.lineTo(120.0f, 195.31f);
        pathBuilder.lineToRelative(-13.66f, -13.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.31f);
        pathBuilder.lineTo(128.0f, 180.68f);
        pathBuilder.lineToRelative(10.34f, -10.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f);
        pathBuilder.lineTo(136.0f, 195.31f);
        pathBuilder.verticalLineToRelative(20.36f);
        pathBuilder.curveToRelative(44.79f, -3.69f, 80.0f, -38.0f, 80.0f, -79.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
