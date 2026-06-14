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

/* compiled from: Shieldslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getShieldSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldslashKt {
    private static ImageVector _shieldSlash;

    public static final ImageVector getShieldSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _shieldSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 40.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, 16.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 54.29f, 26.32f, 87.22f, 48.4f, 105.29f);
        pathBuilder.curveToRelative(23.71f, 19.39f, 47.44f, 26.0f, 48.44f, 26.29f);
        pathBuilder.arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.32f, 0.0f);
        pathBuilder.curveToRelative(1.35f, -0.37f, 30.0f, -8.42f, 55.86f, -32.82f);
        pathBuilder.lineToRelative(12.1f, 13.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 219.38f);
        pathBuilder.arcToRelative(126.38f, 126.38f, 0.0f, false, true, -37.09f, -21.23f);
        pathBuilder.curveTo(65.09f, 176.69f, 52.0f, 147.71f, 52.0f, 112.0f);
        pathBuilder.verticalLineTo(62.24f);
        pathBuilder.lineTo(170.87f, 193.0f);
        pathBuilder.arcTo(126.0f, 126.0f, 0.0f, false, true, 128.0f, 219.38f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(144.0f, 144.0f, 0.0f, false, true, -8.23f, 49.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.28f, 7.92f);
        pathBuilder.arcToRelative(11.86f, 11.86f, 0.0f, false, true, -4.08f, -0.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -15.37f);
        pathBuilder.arcTo(120.31f, 120.31f, 0.0f, false, false, 204.0f, 112.0f);
        pathBuilder.verticalLineTo(60.0f);
        pathBuilder.horizontalLineTo(109.33f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
