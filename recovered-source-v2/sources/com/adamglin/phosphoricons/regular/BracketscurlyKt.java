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

/* compiled from: Bracketscurly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsCurly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBracketsCurly", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsCurly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketscurlyKt {
    private static ImageVector _bracketsCurly;

    public static final ImageVector getBracketsCurly(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _bracketsCurly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsCurly", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(43.18f, 128.0f);
        pathBuilder.arcToRelative(29.78f, 29.78f, 0.0f, false, true, 8.0f, 10.26f);
        pathBuilder.curveToRelative(4.8f, 9.9f, 4.8f, 22.0f, 4.8f, 33.74f);
        pathBuilder.curveToRelative(0.0f, 24.31f, 1.0f, 36.0f, 24.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveToRelative(-17.48f, 0.0f, -29.32f, -6.14f, -35.2f, -18.26f);
        pathBuilder.curveToRelative(-4.8f, -9.9f, -4.8f, -22.0f, -4.8f, -33.74f);
        pathBuilder.curveToRelative(0.0f, -24.31f, -1.0f, -36.0f, -24.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.curveToRelative(23.0f, 0.0f, 24.0f, -11.69f, 24.0f, -36.0f);
        pathBuilder.curveToRelative(0.0f, -11.72f, 0.0f, -23.84f, 4.8f, -33.74f);
        pathBuilder.curveTo(50.68f, 38.14f, 62.52f, 32.0f, 80.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveTo(57.0f, 48.0f, 56.0f, 59.69f, 56.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, 11.72f, 0.0f, 23.84f, -4.8f, 33.74f);
        pathBuilder.arcTo(29.78f, 29.78f, 0.0f, false, true, 43.18f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 120.0f);
        pathBuilder.curveToRelative(-23.0f, 0.0f, -24.0f, -11.69f, -24.0f, -36.0f);
        pathBuilder.curveToRelative(0.0f, -11.72f, 0.0f, -23.84f, -4.8f, -33.74f);
        pathBuilder.curveTo(205.32f, 38.14f, 193.48f, 32.0f, 176.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.curveToRelative(23.0f, 0.0f, 24.0f, 11.69f, 24.0f, 36.0f);
        pathBuilder.curveToRelative(0.0f, 11.72f, 0.0f, 23.84f, 4.8f, 33.74f);
        pathBuilder.arcToRelative(29.78f, 29.78f, 0.0f, false, false, 8.0f, 10.26f);
        pathBuilder.arcToRelative(29.78f, 29.78f, 0.0f, false, false, -8.0f, 10.26f);
        pathBuilder.curveToRelative(-4.8f, 9.9f, -4.8f, 22.0f, -4.8f, 33.74f);
        pathBuilder.curveToRelative(0.0f, 24.31f, -1.0f, 36.0f, -24.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.curveToRelative(17.48f, 0.0f, 29.32f, -6.14f, 35.2f, -18.26f);
        pathBuilder.curveToRelative(4.8f, -9.9f, 4.8f, -22.0f, 4.8f, -33.74f);
        pathBuilder.curveToRelative(0.0f, -24.31f, 1.0f, -36.0f, 24.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsCurly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
