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

/* compiled from: Package.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Package", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPackage", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_package", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PackageKt {
    private static ImageVector _package;

    public static final ImageVector getPackage(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(223.68f, 66.15f);
        pathBuilder.lineTo(135.68f, 18.0f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, false, -15.36f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.32f, 14.0f);
        pathBuilder.verticalLineToRelative(95.64f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f);
        pathBuilder.lineToRelative(88.0f, 48.17f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f);
        pathBuilder.lineTo(232.0f, 80.18f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.lineToRelative(80.34f, 44.0f);
        pathBuilder.lineToRelative(-29.77f, 16.3f);
        pathBuilder.lineToRelative(-80.35f, -44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 120.0f);
        pathBuilder.lineTo(47.66f, 76.0f);
        pathBuilder.lineToRelative(33.9f, -18.56f);
        pathBuilder.lineToRelative(80.34f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 90.0f);
        pathBuilder.lineToRelative(80.0f, 43.78f);
        pathBuilder.verticalLineToRelative(85.79f);
        pathBuilder.lineTo(40.0f, 175.82f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 175.78f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-80.0f, 43.79f);
        pathBuilder.lineTo(136.0f, 133.82f);
        pathBuilder.lineToRelative(32.0f, -17.51f);
        pathBuilder.lineTo(168.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(184.0f, 107.55f);
        pathBuilder.lineTo(216.0f, 90.0f);
        pathBuilder.verticalLineToRelative(85.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _package = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
