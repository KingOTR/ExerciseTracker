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

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(243.0f, 89.83f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 224.0f, 76.0f);
        pathBuilder.lineTo(165.85f, 76.0f);
        pathBuilder.lineToRelative(-18.8f, -57.95f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, false, 109.0f, 18.0f);
        pathBuilder.lineTo(90.15f, 76.0f);
        pathBuilder.lineTo(32.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.3f, 112.22f);
        pathBuilder.lineToRelative(47.1f, 33.89f);
        pathBuilder.lineToRelative(-18.07f, 55.7f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 80.07f, 224.2f);
        pathBuilder.lineTo(128.0f, 189.71f);
        pathBuilder.lineToRelative(47.89f, 34.45f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 30.78f, -22.35f);
        pathBuilder.lineToRelative(-18.07f, -55.7f);
        pathBuilder.lineToRelative(47.15f, -33.92f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 243.0f, 89.83f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 37.11f);
        pathBuilder.lineTo(140.62f, 76.0f);
        pathBuilder.lineTo(115.38f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.42f, 100.0f);
        pathBuilder.lineTo(82.36f, 100.0f);
        pathBuilder.lineToRelative(-7.18f, 22.13f);
        pathBuilder.close();
        pathBuilder.moveTo(75.93f, 197.6f);
        pathBuilder.lineTo(87.86f, 160.82f);
        pathBuilder.lineTo(107.45f, 174.92f);
        pathBuilder.close();
        pathBuilder.moveTo(95.64f, 136.85f);
        pathBuilder.lineTo(107.64f, 100.0f);
        pathBuilder.horizontalLineToRelative(40.82f);
        pathBuilder.lineToRelative(12.0f, 36.85f);
        pathBuilder.lineTo(128.0f, 160.14f);
        pathBuilder.close();
        pathBuilder.moveTo(148.55f, 174.92f);
        pathBuilder.lineTo(168.14f, 160.82f);
        pathBuilder.lineTo(180.07f, 197.6f);
        pathBuilder.close();
        pathBuilder.moveTo(180.82f, 122.13f);
        pathBuilder.lineTo(173.64f, 100.0f);
        pathBuilder.horizontalLineToRelative(37.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
