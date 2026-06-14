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

/* compiled from: Pants.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pants", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPants", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pants", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PantsKt {
    private static ImageVector _pants;

    public static final ImageVector getPants(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pants;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pants", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.91f, 214.51f);
        pathBuilder.lineToRelative(-22.0f, -176.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 186.0f, 28.0f);
        pathBuilder.lineTo(70.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 58.09f, 38.51f);
        pathBuilder.lineToRelative(-22.0f, 176.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 228.0f);
        pathBuilder.lineTo(88.69f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.64f, -9.06f);
        pathBuilder.lineTo(128.0f, 112.0f);
        pathBuilder.lineToRelative(27.67f, 106.94f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 167.31f, 228.0f);
        pathBuilder.lineTo(208.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.91f, -13.49f);
        pathBuilder.close();
        pathBuilder.moveTo(197.52f, 99.9f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 164.23f, 68.0f);
        pathBuilder.horizontalLineToRelative(29.3f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 36.0f);
        pathBuilder.lineTo(186.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.5f);
        pathBuilder.lineTo(192.53f, 60.0f);
        pathBuilder.lineTo(63.47f, 60.0f);
        pathBuilder.lineTo(66.0f, 39.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 70.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.47f, 68.0f);
        pathBuilder.horizontalLineToRelative(29.3f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 58.48f, 99.9f);
        pathBuilder.close();
        pathBuilder.moveTo(92.57f, 217.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 3.0f);
        pathBuilder.lineTo(48.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.5f);
        pathBuilder.lineTo(57.47f, 108.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 99.81f, 68.0f);
        pathBuilder.lineTo(124.0f, 68.0f);
        pathBuilder.lineTo(124.0f, 95.49f);
        pathBuilder.close();
        pathBuilder.moveTo(211.0f, 218.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.35f);
        pathBuilder.lineTo(167.31f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -3.06f);
        pathBuilder.lineTo(132.0f, 95.49f);
        pathBuilder.lineTo(132.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(24.19f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 42.34f, 40.0f);
        pathBuilder.lineTo(212.0f, 215.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 211.0f, 218.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pants = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
