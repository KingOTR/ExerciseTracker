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

/* compiled from: Xlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"XLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getXLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_xLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class XlogoKt {
    private static ImageVector _xLogo;

    public static final ImageVector getXLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _xLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("XLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.12f, 209.56f);
        pathBuilder.lineToRelative(-61.0f, -95.8f);
        pathBuilder.lineToRelative(59.72f, -65.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f);
        pathBuilder.lineTo(143.81f, 92.77f);
        pathBuilder.lineTo(106.12f, 33.56f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 28.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 37.88f, 46.44f);
        pathBuilder.lineToRelative(61.0f, 95.8f);
        pathBuilder.lineTo(39.12f, 207.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f);
        pathBuilder.lineToRelative(55.31f, -60.84f);
        pathBuilder.lineToRelative(37.69f, 59.21f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.12f, -18.44f);
        pathBuilder.close();
        pathBuilder.moveTo(166.59f, 204.0f);
        pathBuilder.lineTo(69.86f, 52.0f);
        pathBuilder.horizontalLineTo(89.41f);
        pathBuilder.lineToRelative(96.73f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _xLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
