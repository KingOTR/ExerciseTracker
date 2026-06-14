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

/* compiled from: Highheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighHeel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHighHeel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highHeel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighheelKt {
    private static ImageVector _highHeel;

    public static final ImageVector getHighHeel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _highHeel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HighHeel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.93f, 152.31f);
        pathBuilder.lineToRelative(-45.82f, -11.17f);
        pathBuilder.lineTo(72.49f, 31.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.34f, 0.39f);
        pathBuilder.curveTo(32.48f, 56.68f, 20.0f, 88.0f, 20.0f, 120.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(72.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(92.0f, 150.29f);
        pathBuilder.lineToRelative(1.07f, 0.71f);
        pathBuilder.arcToRelative(108.44f, 108.44f, 0.0f, false, true, 39.11f, 48.6f);
        pathBuilder.arcTo(19.9f, 19.9f, 0.0f, false, false, 150.72f, 212.0f);
        pathBuilder.lineTo(236.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineToRelative(-4.73f);
        pathBuilder.arcTo(35.68f, 35.68f, 0.0f, false, false, 227.93f, 152.31f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 188.0f);
        pathBuilder.lineTo(44.0f, 188.0f);
        pathBuilder.lineTo(44.0f, 132.67f);
        pathBuilder.arcToRelative(106.69f, 106.69f, 0.0f, false, true, 24.0f, 5.51f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 188.0f);
        pathBuilder.lineTo(153.35f, 188.0f);
        pathBuilder.arcToRelative(132.44f, 132.44f, 0.0f, false, false, -46.67f, -56.77f);
        pathBuilder.arcToRelative(131.08f, 131.08f, 0.0f, false, false, -62.0f, -22.63f);
        pathBuilder.arcTo(106.69f, 106.69f, 0.0f, false, true, 64.87f, 57.84f);
        pathBuilder.lineTo(167.51f, 160.49f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, 5.65f, 3.17f);
        pathBuilder.lineToRelative(49.2f, 12.0f);
        pathBuilder.lineToRelative(0.25f, 0.06f);
        pathBuilder.arcToRelative(11.84f, 11.84f, 0.0f, false, true, 9.39f, 11.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highHeel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
