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

/* compiled from: Pencil.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pencil", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPencil", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencil", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilKt {
    private static ImageVector _pencil;

    public static final ImageVector getPencil(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pencil;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pencil", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(92.69f, 224.0f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 104.0f, 219.31f);
        pathBuilder.lineTo(227.31f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(51.31f, 160.0f);
        pathBuilder.lineTo(136.0f, 75.31f);
        pathBuilder.lineTo(152.69f, 92.0f);
        pathBuilder.lineTo(68.0f, 176.68f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 179.31f);
        pathBuilder.lineTo(76.69f, 208.0f);
        pathBuilder.lineTo(48.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 204.69f);
        pathBuilder.lineTo(79.31f, 188.0f);
        pathBuilder.lineTo(164.0f, 103.31f);
        pathBuilder.lineTo(180.69f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 108.69f);
        pathBuilder.lineTo(147.31f, 64.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.lineTo(216.0f, 84.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencil = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
