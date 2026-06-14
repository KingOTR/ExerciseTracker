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

/* compiled from: Filexls.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileXls", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFileXls", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileXls", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilexlsKt {
    private static ImageVector _fileXls;

    public static final ImageVector getFileXls(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _fileXls;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileXls", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 88.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(156.0f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(120.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.lineTo(112.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(92.65f, 145.49f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f);
        pathBuilder2.lineTo(68.0f, 166.24f);
        pathBuilder2.lineTo(54.51f, 147.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.0f, 9.3f);
        pathBuilder2.lineTo(58.17f, 180.0f);
        pathBuilder2.lineTo(41.49f, 203.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 9.3f);
        pathBuilder2.lineTo(68.0f, 193.76f);
        pathBuilder2.lineToRelative(13.49f, 18.89f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, -9.3f);
        pathBuilder2.lineTo(77.83f, 180.0f);
        pathBuilder2.lineToRelative(16.68f, -23.35f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 92.65f, 145.49f);
        pathBuilder2.close();
        pathBuilder2.moveTo(191.59f, 171.31f);
        pathBuilder2.curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f);
        pathBuilder2.curveToRelative(-1.25f, -0.82f, -1.23f, -1.0f, -1.12f, -1.9f);
        pathBuilder2.arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f);
        pathBuilder2.curveToRelative(4.6f, -3.12f, 15.34f, -1.73f, 19.82f, -0.56f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.07f, -15.48f);
        pathBuilder2.curveToRelative(-2.11f, -0.55f, -21.0f, -5.22f, -32.83f, 2.76f);
        pathBuilder2.arcToRelative(20.58f, 20.58f, 0.0f, false, false, -8.95f, 14.94f);
        pathBuilder2.curveToRelative(-2.0f, 15.89f, 13.65f, 20.42f, 23.0f, 23.12f);
        pathBuilder2.curveToRelative(12.06f, 3.49f, 13.12f, 4.92f, 12.78f, 7.59f);
        pathBuilder2.curveToRelative(-0.31f, 2.41f, -1.26f, 3.33f, -2.15f, 3.93f);
        pathBuilder2.curveToRelative(-4.6f, 3.06f, -15.16f, 1.56f, -19.54f, 0.35f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 173.93f, 214.0f);
        pathBuilder2.arcToRelative(60.63f, 60.63f, 0.0f, false, false, 15.19f, 2.0f);
        pathBuilder2.curveToRelative(5.82f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f);
        pathBuilder2.arcToRelative(20.81f, 20.81f, 0.0f, false, false, 9.18f, -15.23f);
        pathBuilder2.curveTo(218.0f, 179.0f, 201.48f, 174.17f, 191.59f, 171.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 112.0f);
        pathBuilder2.lineTo(40.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder2.lineToRelative(56.0f, 56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(200.0f, 96.0f);
        pathBuilder2.lineTo(152.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.lineTo(144.0f, 40.0f);
        pathBuilder2.lineTo(56.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(28.68f);
        pathBuilder2.lineTo(160.0f, 51.31f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileXls = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
