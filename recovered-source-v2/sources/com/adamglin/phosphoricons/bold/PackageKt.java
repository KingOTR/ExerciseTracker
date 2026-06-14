package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Package.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Package", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPackage", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_package", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PackageKt {
    private static ImageVector _package;

    public static final ImageVector getPackage(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(225.6f, 62.64f);
        pathBuilder.lineToRelative(-88.0f, -48.17f);
        pathBuilder.arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.17f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f);
        pathBuilder.verticalLineToRelative(95.62f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f);
        pathBuilder.lineToRelative(88.0f, 48.17f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.17f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f);
        pathBuilder.lineTo(236.0f, 80.19f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.64f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.57f);
        pathBuilder.lineTo(200.0f, 76.0f);
        pathBuilder.lineTo(178.57f, 87.73f);
        pathBuilder.lineToRelative(-72.0f, -39.42f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 115.4f);
        pathBuilder.lineTo(56.0f, 76.0f);
        pathBuilder.lineTo(81.56f, 62.0f);
        pathBuilder.lineToRelative(72.0f, 39.41f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 96.79f);
        pathBuilder.lineToRelative(72.0f, 39.4f);
        pathBuilder.verticalLineToRelative(76.67f);
        pathBuilder.lineTo(44.0f, 173.44f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 212.86f);
        pathBuilder.lineTo(140.0f, 136.19f);
        pathBuilder.lineToRelative(24.0f, -13.13f);
        pathBuilder.lineTo(164.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(188.0f, 109.92f);
        pathBuilder.lineToRelative(24.0f, -13.13f);
        pathBuilder.verticalLineToRelative(76.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _package = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
