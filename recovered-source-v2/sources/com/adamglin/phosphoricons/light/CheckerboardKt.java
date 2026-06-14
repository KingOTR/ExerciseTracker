package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Checkerboard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Checkerboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCheckerboard", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_checkerboard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckerboardKt {
    private static ImageVector _checkerboard;

    public static final ImageVector getCheckerboard(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _checkerboard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Checkerboard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 34.0f);
        pathBuilder.lineTo(48.0f, 34.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f);
        pathBuilder.lineTo(34.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(208.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(222.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.48f, 122.0f);
        pathBuilder.lineTo(134.0f, 61.52f);
        pathBuilder.lineTo(134.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(15.52f);
        pathBuilder.lineTo(210.0f, 106.48f);
        pathBuilder.lineTo(210.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 78.48f);
        pathBuilder.lineTo(177.52f, 122.0f);
        pathBuilder.lineTo(134.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 48.0f);
        pathBuilder.lineTo(210.0f, 89.52f);
        pathBuilder.lineTo(166.48f, 46.0f);
        pathBuilder.lineTo(208.0f, 46.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(74.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.lineTo(46.0f, 122.0f);
        pathBuilder.lineTo(46.0f, 48.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.48f, 210.0f);
        pathBuilder.lineTo(46.0f, 149.52f);
        pathBuilder.lineTo(46.0f, 134.0f);
        pathBuilder.lineTo(61.52f, 134.0f);
        pathBuilder.lineTo(122.0f, 194.48f);
        pathBuilder.lineTo(122.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 177.52f);
        pathBuilder.lineTo(78.48f, 134.0f);
        pathBuilder.lineTo(122.0f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 208.0f);
        pathBuilder.lineTo(46.0f, 166.48f);
        pathBuilder.lineTo(89.52f, 210.0f);
        pathBuilder.lineTo(48.0f, 210.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 210.0f);
        pathBuilder.lineTo(134.0f, 210.0f);
        pathBuilder.lineTo(134.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(134.0f, 134.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.verticalLineToRelative(74.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _checkerboard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
