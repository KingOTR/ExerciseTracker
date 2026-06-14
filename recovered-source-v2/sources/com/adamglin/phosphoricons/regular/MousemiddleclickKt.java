package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mousemiddleclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MouseMiddleClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMouseMiddleClick", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mouseMiddleClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MousemiddleclickKt {
    private static ImageVector _mouseMiddleClick;

    public static final ImageVector getMouseMiddleClick(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _mouseMiddleClick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MouseMiddleClick", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 16.0f);
        pathBuilder.lineTo(112.0f, 16.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f);
        pathBuilder.lineTo(208.0f, 80.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 80.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(152.0f, 104.0f);
        pathBuilder.lineTo(152.0f, 88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(136.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 136.0f);
        pathBuilder.lineTo(120.0f, 136.0f);
        pathBuilder.lineTo(120.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(23.9f);
        pathBuilder.arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.0f, 0.2f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineTo(120.0f, 72.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(64.0f, 104.0f);
        pathBuilder.lineTo(64.0f, 80.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 112.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 224.0f);
        pathBuilder.lineTo(112.0f, 224.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder.lineTo(64.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(152.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 144.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mouseMiddleClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
