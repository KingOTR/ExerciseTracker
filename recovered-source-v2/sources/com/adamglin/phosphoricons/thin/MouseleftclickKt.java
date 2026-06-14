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

/* compiled from: Mouseleftclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MouseLeftClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMouseLeftClick", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mouseLeftClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MouseleftclickKt {
    private static ImageVector _mouseLeftClick;

    public static final ImageVector getMouseLeftClick(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _mouseLeftClick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MouseLeftClick", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 20.0f);
        pathBuilder.lineTo(112.0f, 20.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 52.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f);
        pathBuilder.lineTo(204.0f, 80.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 144.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 80.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(132.0f, 108.0f);
        pathBuilder.lineTo(132.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 196.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 28.0f);
        pathBuilder.lineTo(124.0f, 70.34f);
        pathBuilder.lineTo(87.7f, 34.05f);
        pathBuilder.arcTo(51.61f, 51.61f, 0.0f, false, true, 112.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.78f, 38.44f);
        pathBuilder.lineTo(124.0f, 81.66f);
        pathBuilder.lineTo(124.0f, 108.0f);
        pathBuilder.lineTo(113.66f, 108.0f);
        pathBuilder.lineTo(64.51f, 58.85f);
        pathBuilder.arcTo(52.5f, 52.5f, 0.0f, false, true, 80.78f, 38.44f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 80.0f);
        pathBuilder.arcToRelative(51.55f, 51.55f, 0.0f, false, true, 1.59f, -12.75f);
        pathBuilder.lineTo(102.34f, 108.0f);
        pathBuilder.lineTo(60.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 228.0f);
        pathBuilder.lineTo(112.0f, 228.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f);
        pathBuilder.lineTo(60.0f, 116.0f);
        pathBuilder.lineTo(196.0f, 116.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 144.0f, 228.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mouseLeftClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
