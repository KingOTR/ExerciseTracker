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

/* compiled from: Baseballcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BaseballCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBaseballCap", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseballCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballcapKt {
    private static ImageVector _baseballCap;

    public static final ImageVector getBaseballCap(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _baseballCap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BaseballCap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 20.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(27.86f, 27.86f, 0.0f, false, false, 15.26f, 24.93f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 29.28f, -2.34f);
        pathBuilder.curveTo(76.2f, 198.11f, 96.68f, 188.0f, 128.0f, 188.0f);
        pathBuilder.reflectiveCurveToRelative(51.8f, 10.1f, 63.46f, 18.58f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 236.0f, 184.0f);
        pathBuilder.lineTo(236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.verticalLineToRelative(1.87f);
        pathBuilder.arcToRelative(170.0f, 170.0f, 0.0f, false, false, -33.29f, -14.3f);
        pathBuilder.arcToRelative(170.81f, 170.81f, 0.0f, false, false, -23.45f, -67.0f);
        pathBuilder.arcTo(84.14f, 84.14f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.54f, 109.88f);
        pathBuilder.arcToRelative(174.42f, 174.42f, 0.0f, false, false, -51.08f, 0.0f);
        pathBuilder.arcTo(150.0f, 150.0f, 0.0f, false, true, 128.0f, 50.94f);
        pathBuilder.arcTo(150.07f, 150.07f, 0.0f, false, true, 153.54f, 109.88f);
        pathBuilder.close();
        pathBuilder.moveTo(100.74f, 48.57f);
        pathBuilder.arcToRelative(170.81f, 170.81f, 0.0f, false, false, -23.45f, 67.0f);
        pathBuilder.arcTo(170.0f, 170.0f, 0.0f, false, false, 44.0f, 129.87f);
        pathBuilder.lineTo(44.0f, 128.0f);
        pathBuilder.arcTo(84.14f, 84.14f, 0.0f, false, true, 100.74f, 48.57f);
        pathBuilder.close();
        pathBuilder.moveTo(209.85f, 187.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.28f, -0.36f);
        pathBuilder.curveTo(191.0f, 176.61f, 165.77f, 164.0f, 128.0f, 164.0f);
        pathBuilder.reflectiveCurveToRelative(-63.0f, 12.61f, -77.57f, 23.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.28f, 0.36f);
        pathBuilder.arcTo(3.76f, 3.76f, 0.0f, false, true, 44.0f, 184.0f);
        pathBuilder.lineTo(44.0f, 158.14f);
        pathBuilder.arcToRelative(148.0f, 148.0f, 0.0f, false, true, 168.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 184.0f);
        pathBuilder.arcTo(3.76f, 3.76f, 0.0f, false, true, 209.85f, 187.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseballCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
