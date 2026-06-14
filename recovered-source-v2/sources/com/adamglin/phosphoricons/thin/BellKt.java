package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bell.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bell", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBell", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bell", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellKt {
    private static ImageVector _bell;

    public static final ImageVector getBell(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bell;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bell", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.35f, 178.0f);
        pathBuilder.curveTo(212.58f, 168.0f, 204.0f, 140.13f, 204.0f, 104.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, -152.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 36.13f, -8.59f, 64.0f, -14.36f, 73.95f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 196.0f);
        pathBuilder.lineTo(92.23f, 196.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.54f, 0.0f);
        pathBuilder.lineTo(208.0f, 196.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 218.35f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.71f, -24.0f);
        pathBuilder.horizontalLineToRelative(55.42f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.45f, 186.0f);
        pathBuilder.arcToRelative(3.91f, 3.91f, 0.0f, false, true, -3.44f, 2.0f);
        pathBuilder.lineTo(48.0f, 188.0f);
        pathBuilder.arcToRelative(3.91f, 3.91f, 0.0f, false, true, -3.44f, -2.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f);
        pathBuilder.curveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 136.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.31f, 8.0f, 65.17f, 15.44f, 78.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 211.45f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bell = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
