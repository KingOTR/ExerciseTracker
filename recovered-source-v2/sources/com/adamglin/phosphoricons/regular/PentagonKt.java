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

/* compiled from: Pentagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPentagon", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagonKt {
    private static ImageVector _pentagon;

    public static final ImageVector getPentagon(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pentagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.56f, 87.56f);
        pathBuilder.lineTo(137.64f, 19.25f);
        pathBuilder.lineToRelative(-0.18f, -0.14f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -18.92f, 0.0f);
        pathBuilder.lineToRelative(-0.18f, 0.14f);
        pathBuilder.lineTo(30.44f, 87.56f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.7f, 17.63f);
        pathBuilder.lineToRelative(32.0f, 107.54f);
        pathBuilder.lineToRelative(0.06f, 0.17f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, false, 72.0f, 224.0f);
        pathBuilder.lineTo(184.0f, 224.0f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 15.23f, -11.1f);
        pathBuilder.lineToRelative(0.06f, -0.17f);
        pathBuilder.lineToRelative(32.0f, -107.54f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 225.56f, 87.56f);
        pathBuilder.close();
        pathBuilder.moveTo(215.94f, 100.56f);
        pathBuilder.lineTo(184.0f, 208.0f);
        pathBuilder.lineTo(72.0f, 208.0f);
        pathBuilder.lineToRelative(-32.0f, -107.44f);
        pathBuilder.lineToRelative(-0.06f, -0.17f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.18f, -0.14f);
        pathBuilder.lineTo(128.0f, 32.0f);
        pathBuilder.lineToRelative(87.82f, 68.23f);
        pathBuilder.lineToRelative(0.18f, 0.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
