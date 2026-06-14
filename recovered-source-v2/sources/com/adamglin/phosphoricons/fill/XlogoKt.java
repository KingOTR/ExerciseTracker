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

/* compiled from: Xlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"XLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getXLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_xLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class XlogoKt {
    private static ImageVector _xLogo;

    public static final ImageVector getXLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(215.0f, 219.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, 4.15f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.75f, -3.71f);
        pathBuilder.lineToRelative(-40.49f, -63.63f);
        pathBuilder.lineTo(53.92f, 221.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.84f, -10.76f);
        pathBuilder.lineToRelative(61.77f, -68.0f);
        pathBuilder.lineTo(41.25f, 44.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.75f, 3.71f);
        pathBuilder.lineToRelative(40.49f, 63.63f);
        pathBuilder.lineToRelative(58.84f, -64.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.84f, 10.76f);
        pathBuilder.lineToRelative(-61.77f, 67.95f);
        pathBuilder.lineToRelative(62.6f, 98.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 215.0f, 219.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _xLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
