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

/* compiled from: Pencilsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPencilSimple", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilsimpleKt {
    private static ImageVector _pencilSimple;

    public static final ImageVector getPencilSimple(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pencilSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.31f, 73.37f);
        pathBuilder.lineTo(182.63f, 28.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder.lineTo(36.69f, 152.0f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 32.0f, 163.31f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(92.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 104.0f, 219.31f);
        pathBuilder.lineTo(227.31f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(92.69f, 208.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.verticalLineTo(163.31f);
        pathBuilder.lineToRelative(88.0f, -88.0f);
        pathBuilder.lineTo(180.69f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 108.68f);
        pathBuilder.lineTo(147.31f, 64.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.lineTo(216.0f, 84.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
