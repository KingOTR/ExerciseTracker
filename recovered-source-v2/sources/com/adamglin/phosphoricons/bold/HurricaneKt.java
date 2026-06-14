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

/* compiled from: Hurricane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hurricane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHurricane", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hurricane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HurricaneKt {
    private static ImageVector _hurricane;

    public static final ImageVector getHurricane(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hurricane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hurricane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.37f, 43.0f);
        pathBuilder.lineTo(171.51f, 15.35f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 157.89f, 0.19f);
        pathBuilder.arcTo(194.0f, 194.0f, 0.0f, false, false, 97.77f, 23.74f);
        pathBuilder.curveTo(57.36f, 48.28f, 36.0f, 84.33f, 36.0f, 128.0f);
        pathBuilder.arcToRelative(92.15f, 92.15f, 0.0f, false, false, 56.63f, 85.0f);
        pathBuilder.lineToRelative(-8.14f, 27.65f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 256.0f);
        pathBuilder.arcToRelative(11.58f, 11.58f, 0.0f, false, false, 2.11f, -0.19f);
        pathBuilder.arcToRelative(194.0f, 194.0f, 0.0f, false, false, 60.12f, -23.55f);
        pathBuilder.curveTo(198.64f, 207.72f, 220.0f, 171.67f, 220.0f, 128.0f);
        pathBuilder.arcTo(92.15f, 92.15f, 0.0f, false, false, 163.37f, 43.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.37f, 211.35f);
        pathBuilder.arcToRelative(168.74f, 168.74f, 0.0f, false, true, -32.74f, 15.28f);
        pathBuilder.lineToRelative(5.28f, -18.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.42f, -15.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 60.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -35.12f, 16.7f, -63.18f, 49.65f, -83.39f);
        pathBuilder.arcToRelative(168.84f, 168.84f, 0.0f, false, true, 32.74f, -15.29f);
        pathBuilder.lineToRelative(-5.28f, 18.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.42f, 15.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 196.0f, 128.0f);
        pathBuilder.curveTo(196.0f, 163.12f, 179.3f, 191.17f, 146.35f, 211.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hurricane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
