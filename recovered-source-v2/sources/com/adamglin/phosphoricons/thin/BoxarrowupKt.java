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

/* compiled from: Boxarrowup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BoxArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBoxArrowUp", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boxArrowUp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoxarrowupKt {
    private static ImageVector _boxArrowUp;

    public static final ImageVector getBoxArrowUp(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _boxArrowUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BoxArrowUp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.58f, 70.21f);
        pathBuilder.lineToRelative(-16.0f, -32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 36.0f);
        pathBuilder.lineTo(56.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f);
        pathBuilder.lineToRelative(-16.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f);
        pathBuilder.lineTo(36.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(208.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(220.0f, 72.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 219.58f, 70.21f);
        pathBuilder.close();
        pathBuilder.moveTo(58.47f, 44.0f);
        pathBuilder.lineTo(197.53f, 44.0f);
        pathBuilder.lineToRelative(12.0f, 24.0f);
        pathBuilder.lineTo(46.47f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 212.0f);
        pathBuilder.lineTo(48.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 76.0f);
        pathBuilder.lineTo(212.0f, 76.0f);
        pathBuilder.lineTo(212.0f, 208.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.83f, 133.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(132.0f, 113.66f);
        pathBuilder.lineTo(132.0f, 184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 113.66f);
        pathBuilder.lineTo(98.83f, 138.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boxArrowUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
