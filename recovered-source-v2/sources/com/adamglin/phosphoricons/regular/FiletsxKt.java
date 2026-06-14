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

/* compiled from: Filetsx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileTsx", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFileTsx", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileTsx", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiletsxKt {
    private static ImageVector _fileTsx;

    public static final ImageVector getFileTsx(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(214.51f, 156.65f);
        pathBuilder.lineTo(197.83f, 180.0f);
        pathBuilder.lineToRelative(16.68f, 23.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, 9.3f);
        pathBuilder.lineTo(188.0f, 193.76f);
        pathBuilder.lineToRelative(-13.49f, 18.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.3f);
        pathBuilder.lineTo(178.17f, 180.0f);
        pathBuilder.lineToRelative(-16.68f, -23.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, -9.3f);
        pathBuilder.lineTo(188.0f, 166.24f);
        pathBuilder.lineToRelative(13.49f, -18.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.3f);
        pathBuilder.close();
        pathBuilder.moveTo(123.6f, 171.31f);
        pathBuilder.curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f);
        pathBuilder.curveToRelative(-1.25f, -0.82f, -1.23f, -1.0f, -1.11f, -1.9f);
        pathBuilder.arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f);
        pathBuilder.curveToRelative(4.6f, -3.12f, 15.34f, -1.73f, 19.83f, -0.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 145.86f);
        pathBuilder.curveToRelative(-2.12f, -0.55f, -21.0f, -5.22f, -32.84f, 2.76f);
        pathBuilder.arcToRelative(20.58f, 20.58f, 0.0f, false, false, -9.0f, 14.95f);
        pathBuilder.curveToRelative(-2.0f, 15.88f, 13.65f, 20.41f, 23.0f, 23.11f);
        pathBuilder.curveToRelative(12.06f, 3.49f, 13.12f, 4.92f, 12.78f, 7.59f);
        pathBuilder.curveToRelative(-0.31f, 2.41f, -1.26f, 3.33f, -2.14f, 3.93f);
        pathBuilder.curveToRelative(-4.6f, 3.06f, -15.17f, 1.56f, -19.55f, 0.35f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 105.94f, 214.0f);
        pathBuilder.arcToRelative(60.63f, 60.63f, 0.0f, false, false, 15.19f, 2.0f);
        pathBuilder.curveToRelative(5.82f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f);
        pathBuilder.arcToRelative(20.82f, 20.82f, 0.0f, false, false, 9.19f, -15.23f);
        pathBuilder.curveTo(150.0f, 179.0f, 133.49f, 174.17f, 123.6f, 171.31f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 144.0f);
        pathBuilder.lineTo(40.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(52.0f, 160.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 160.0f);
        pathBuilder.lineTo(80.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(200.0f, 96.0f);
        pathBuilder.lineTo(152.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.lineTo(56.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.69f, 80.0f);
        pathBuilder.lineTo(160.0f, 51.31f);
        pathBuilder.lineTo(160.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileTsx = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
