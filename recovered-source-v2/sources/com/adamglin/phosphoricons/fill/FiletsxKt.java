package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Filetsx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileTsx", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileTsx", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileTsx", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiletsxKt {
    private static ImageVector _fileTsx;

    public static final ImageVector getFileTsx(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileTsx;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileTsx", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.66f, 82.34f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder.lineTo(56.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(212.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(216.0f, 88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 88.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.lineToRelative(44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.51f, 156.65f);
        pathBuilder.lineTo(197.83f, 180.0f);
        pathBuilder.lineToRelative(16.68f, 23.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, 9.3f);
        pathBuilder.lineTo(188.0f, 193.76f);
        pathBuilder.lineToRelative(-13.49f, 18.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.3f);
        pathBuilder.lineTo(178.17f, 180.0f);
        pathBuilder.lineToRelative(-16.68f, -23.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.3f, -11.46f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 10.88f, 2.38f);
        pathBuilder.lineTo(188.0f, 166.24f);
        pathBuilder.lineToRelative(13.49f, -18.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.3f);
        pathBuilder.close();
        pathBuilder.moveTo(147.81f, 196.31f);
        pathBuilder.arcToRelative(20.82f, 20.82f, 0.0f, false, true, -9.19f, 15.23f);
        pathBuilder.curveTo(133.43f, 215.0f, 127.0f, 216.0f, 121.13f, 216.0f);
        pathBuilder.arcTo(60.43f, 60.43f, 0.0f, false, true, 106.0f, 214.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.3f, -15.41f);
        pathBuilder.curveToRelative(4.38f, 1.21f, 15.0f, 2.71f, 19.55f, -0.35f);
        pathBuilder.curveToRelative(0.88f, -0.6f, 1.83f, -1.52f, 2.14f, -3.93f);
        pathBuilder.curveToRelative(0.34f, -2.67f, -0.72f, -4.1f, -12.78f, -7.59f);
        pathBuilder.curveToRelative(-9.35f, -2.7f, -25.0f, -7.23f, -23.0f, -23.12f);
        pathBuilder.arcToRelative(20.58f, 20.58f, 0.0f, false, true, 9.0f, -14.94f);
        pathBuilder.curveToRelative(11.85f, -8.0f, 30.72f, -3.31f, 32.84f, -2.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.07f, 15.48f);
        pathBuilder.curveToRelative(-4.49f, -1.17f, -15.23f, -2.56f, -19.83f, 0.56f);
        pathBuilder.arcToRelative(4.54f, 4.54f, 0.0f, false, false, -2.0f, 3.67f);
        pathBuilder.curveToRelative(-0.12f, 0.9f, -0.14f, 1.08f, 1.11f, 1.9f);
        pathBuilder.curveToRelative(2.31f, 1.49f, 6.45f, 2.68f, 10.45f, 3.84f);
        pathBuilder.curveTo(133.49f, 174.17f, 150.0f, 179.0f, 147.81f, 196.31f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 152.53f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 79.73f, 160.0f);
        pathBuilder.lineTo(68.0f, 160.0f);
        pathBuilder.verticalLineToRelative(47.72f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 60.53f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 52.0f, 208.0f);
        pathBuilder.lineTo(52.0f, 160.0f);
        pathBuilder.lineTo(40.27f, 160.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 32.0f, 152.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 144.0f);
        pathBuilder.lineTo(80.0f, 144.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 152.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileTsx = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
