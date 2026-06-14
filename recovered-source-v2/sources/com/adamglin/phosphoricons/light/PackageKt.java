package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Package.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Package", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPackage", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_package", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PackageKt {
    private static ImageVector _package;

    public static final ImageVector getPackage(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _package;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Package", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.72f, 67.91f);
        pathBuilder.lineToRelative(-88.0f, -48.18f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.44f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.18f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.18f);
        pathBuilder.verticalLineToRelative(95.64f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.28f, 12.27f);
        pathBuilder.lineToRelative(88.0f, 48.18f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.44f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.18f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 175.82f);
        pathBuilder.verticalLineTo(80.18f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 222.72f, 67.91f);
        pathBuilder.close();
        pathBuilder.moveTo(127.0f, 30.25f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 0.0f);
        pathBuilder.lineTo(212.51f, 76.0f);
        pathBuilder.lineTo(178.57f, 94.57f);
        pathBuilder.lineTo(94.05f, 48.31f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 223.0f);
        pathBuilder.lineTo(39.0f, 177.57f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.75f);
        pathBuilder.verticalLineTo(86.66f);
        pathBuilder.lineToRelative(84.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(43.49f, 76.0f);
        pathBuilder.lineTo(81.56f, 55.15f);
        pathBuilder.lineToRelative(84.51f, 46.26f);
        pathBuilder.lineTo(128.0f, 122.24f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 175.82f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(134.0f, 223.0f);
        pathBuilder.verticalLineTo(132.64f);
        pathBuilder.lineToRelative(36.0f, -19.71f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(106.37f);
        pathBuilder.lineToRelative(36.0f, -19.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _package = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
