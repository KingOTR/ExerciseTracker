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

/* compiled from: Pepper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pepper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPepper", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pepper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PepperKt {
    private static ImageVector _pepper;

    public static final ImageVector getPepper(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pepper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pepper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(167.27f, 40.42f);
        pathBuilder.arcTo(40.06f, 40.06f, 0.0f, false, false, 128.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 22.85f, 16.66f);
        pathBuilder.arcTo(64.08f, 64.08f, 0.0f, false, false, 96.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 46.75f, -25.75f, 78.0f, -76.53f, 93.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.77f, 31.13f);
        pathBuilder.arcTo(264.8f, 264.8f, 0.0f, false, false, 66.75f, 232.0f);
        pathBuilder.curveToRelative(40.78f, 0.0f, 86.16f, -9.15f, 117.53f, -35.46f);
        pathBuilder.curveTo(210.64f, 174.44f, 224.0f, 143.3f, 224.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, false, 167.27f, 40.42f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 56.0f);
        pathBuilder.arcToRelative(48.07f, 48.07f, 0.0f, false, true, 45.37f, 32.37f);
        pathBuilder.lineTo(192.0f, 95.0f);
        pathBuilder.lineTo(163.58f, 80.83f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder.lineTo(128.0f, 95.0f);
        pathBuilder.lineToRelative(-13.37f, -6.68f);
        pathBuilder.arcTo(48.08f, 48.08f, 0.0f, false, true, 160.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 184.3f);
        pathBuilder.curveToRelative(-18.0f, 15.07f, -43.6f, 25.26f, -74.12f, 29.47f);
        pathBuilder.arcTo(254.08f, 254.08f, 0.0f, false, true, 24.0f, 212.37f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(57.23f, -16.87f, 87.63f, -54.0f, 88.0f, -107.42f);
        pathBuilder.lineToRelative(12.44f, 6.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f);
        pathBuilder.lineTo(160.0f, 96.93f);
        pathBuilder.lineToRelative(28.42f, 14.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f);
        pathBuilder.lineToRelative(12.41f, -6.2f);
        pathBuilder.curveTo(207.78f, 138.84f, 196.35f, 165.54f, 174.0f, 184.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pepper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
