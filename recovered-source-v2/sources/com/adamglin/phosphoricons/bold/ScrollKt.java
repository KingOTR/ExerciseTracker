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

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scroll", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getScroll", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scroll", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollKt {
    private static ImageVector _scroll;

    public static final ImageVector getScroll(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(92.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(104.0f, 104.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(104.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 192.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.lineTo(88.0f, 228.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.lineTo(52.0f, 64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 3.73f, 3.35f, 6.51f, 3.38f, 6.54f);
        pathBuilder.lineToRelative(-0.18f, -0.14f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 16.81f, 89.59f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(15.49f, 88.62f, 4.0f, 79.55f, 4.0f, 64.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 40.0f, 28.0f);
        pathBuilder.lineTo(176.0f, 28.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f);
        pathBuilder.lineTo(212.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.2f, 2.4f);
        pathBuilder.curveTo(224.51f, 167.38f, 236.0f, 176.45f, 236.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.62f, 172.2f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.lineTo(188.0f, 64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(73.94f, 52.0f);
        pathBuilder.arcTo(35.88f, 35.88f, 0.0f, false, true, 76.0f, 64.0f);
        pathBuilder.lineTo(76.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -3.58f, -3.17f, -6.38f, -3.2f, -6.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.62f, 172.2f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 192.0f);
        pathBuilder.arcToRelative(7.69f, 7.69f, 0.0f, false, false, -1.24f, -4.0f);
        pathBuilder.horizontalLineToRelative(-87.0f);
        pathBuilder.arcToRelative(30.32f, 30.32f, 0.0f, false, true, 0.26f, 4.0f);
        pathBuilder.arcToRelative(35.84f, 35.84f, 0.0f, false, true, -2.06f, 12.0f);
        pathBuilder.lineTo(200.0f, 204.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scroll = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
