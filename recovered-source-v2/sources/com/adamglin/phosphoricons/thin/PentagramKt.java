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

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pentagram;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagram", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.39f, 92.29f);
        pathBuilder.arcTo(11.82f, 11.82f, 0.0f, false, false, 224.0f, 84.0f);
        pathBuilder.lineTo(160.0f, 84.0f);
        pathBuilder.lineTo(139.42f, 20.47f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -22.83f, 0.0f);
        pathBuilder.lineTo(96.0f, 84.0f);
        pathBuilder.lineTo(32.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, 21.72f);
        pathBuilder.lineTo(76.82f, 143.0f);
        pathBuilder.lineTo(57.0f, 204.25f);
        pathBuilder.arcToRelative(11.83f, 11.83f, 0.0f, false, false, 4.36f, 13.41f);
        pathBuilder.arcToRelative(11.8f, 11.8f, 0.0f, false, false, 14.09f, 0.0f);
        pathBuilder.lineTo(128.0f, 179.83f);
        pathBuilder.lineToRelative(52.58f, 37.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.47f, -13.41f);
        pathBuilder.lineTo(179.18f, 143.0f);
        pathBuilder.lineTo(231.0f, 105.7f);
        pathBuilder.arcTo(11.83f, 11.83f, 0.0f, false, false, 235.39f, 92.29f);
        pathBuilder.close();
        pathBuilder.moveTo(124.21f, 22.88f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 7.59f, 0.0f);
        pathBuilder.lineTo(151.62f, 84.0f);
        pathBuilder.lineTo(104.38f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(29.67f, 99.23f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 92.0f);
        pathBuilder.lineTo(93.37f, 92.0f);
        pathBuilder.lineToRelative(-14.0f, 43.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.67f, 211.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, -4.47f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(19.08f, -58.8f);
        pathBuilder.lineToRelative(37.51f, 27.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.19f, 139.97f);
        pathBuilder.lineTo(101.78f, 92.0f);
        pathBuilder.horizontalLineToRelative(52.44f);
        pathBuilder.lineToRelative(15.55f, 47.93f);
        pathBuilder.lineTo(128.0f, 170.0f);
        pathBuilder.close();
        pathBuilder.moveTo(191.4f, 206.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.17f, 4.46f);
        pathBuilder.lineTo(134.85f, 174.9f);
        pathBuilder.lineToRelative(37.51f, -27.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.3f, 99.26f);
        pathBuilder.lineTo(176.59f, 135.0f);
        pathBuilder.lineToRelative(-14.0f, -43.0f);
        pathBuilder.lineTo(224.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.36f, 7.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
