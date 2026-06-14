package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mouseleftclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MouseLeftClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMouseLeftClick", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mouseLeftClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MouseleftclickKt {
    private static ImageVector _mouseLeftClick;

    public static final ImageVector getMouseLeftClick(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 56.0f, -56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(144.0f, 16.0f);
        pathBuilder2.lineTo(112.0f, 16.0f);
        pathBuilder2.arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f);
        pathBuilder2.lineTo(208.0f, 80.0f);
        pathBuilder2.arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(136.0f, 104.0f);
        pathBuilder2.lineTo(136.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(115.31f, 104.0f);
        pathBuilder2.lineTo(69.31f, 58.0f);
        pathBuilder2.arcTo(48.49f, 48.49f, 0.0f, false, true, 80.51f, 43.82f);
        pathBuilder2.lineTo(120.0f, 83.31f);
        pathBuilder2.lineTo(120.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(64.0f, 80.0f);
        pathBuilder2.curveToRelative(0.0f, -1.51f, 0.08f, -3.0f, 0.22f, -4.47f);
        pathBuilder2.lineTo(92.69f, 104.0f);
        pathBuilder2.lineTo(64.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 32.0f);
        pathBuilder2.lineTo(120.0f, 60.69f);
        pathBuilder2.lineTo(94.59f, 35.28f);
        pathBuilder2.arcTo(47.73f, 47.73f, 0.0f, false, true, 112.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 224.0f);
        pathBuilder2.lineTo(112.0f, 224.0f);
        pathBuilder2.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder2.lineTo(64.0f, 120.0f);
        pathBuilder2.lineTo(192.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.arcTo(48.05f, 48.05f, 0.0f, false, true, 144.0f, 224.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mouseLeftClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
