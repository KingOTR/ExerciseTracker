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

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scroll", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getScroll", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scroll", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollKt {
    private static ImageVector _scroll;

    public static final ImageVector getScroll(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _scroll;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scroll", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(104.0f, 108.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(104.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 192.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f);
        pathBuilder.lineTo(88.0f, 220.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f);
        pathBuilder.lineTo(60.0f, 64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 7.78f, 6.34f, 12.75f, 6.4f, 12.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.8f, 6.4f);
        pathBuilder.curveTo(21.21f, 82.91f, 12.0f, 75.86f, 12.0f, 64.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 40.0f, 36.0f);
        pathBuilder.lineTo(176.0f, 36.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f);
        pathBuilder.lineTo(204.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f);
        pathBuilder.curveTo(218.79f, 173.09f, 228.0f, 180.14f, 228.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 192.0f);
        pathBuilder.curveToRelative(0.0f, -7.78f, -6.34f, -12.75f, -6.4f, -12.8f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.lineTo(196.0f, 64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(59.57f, 44.0f);
        pathBuilder.arcTo(27.9f, 27.9f, 0.0f, false, true, 68.0f, 64.0f);
        pathBuilder.lineTo(68.0f, 192.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 192.0f);
        pathBuilder.curveToRelative(0.0f, -6.0f, -3.74f, -10.3f, -5.5f, -12.0f);
        pathBuilder.lineTo(112.61f, 180.0f);
        pathBuilder.arcTo(23.31f, 23.31f, 0.0f, false, true, 116.0f, 192.0f);
        pathBuilder.arcToRelative(27.94f, 27.94f, 0.0f, false, true, -8.42f, 20.0f);
        pathBuilder.lineTo(200.0f, 212.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 220.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scroll = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
