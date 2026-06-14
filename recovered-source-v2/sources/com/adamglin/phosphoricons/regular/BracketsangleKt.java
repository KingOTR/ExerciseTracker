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

/* compiled from: Bracketsangle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsAngle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBracketsAngle", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsAngle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsangleKt {
    private static ImageVector _bracketsAngle;

    public static final ImageVector getBracketsAngle(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _bracketsAngle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsAngle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(86.75f, 44.3f);
        pathBuilder.lineTo(33.48f, 128.0f);
        pathBuilder.lineToRelative(53.27f, 83.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.46f, 11.05f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, true, 80.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.76f, -3.71f);
        pathBuilder.lineToRelative(-56.0f, -88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -8.59f);
        pathBuilder.lineToRelative(56.0f, -88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.5f, 8.59f);
        pathBuilder.close();
        pathBuilder.moveTo(238.75f, 123.71f);
        pathBuilder.lineTo(182.75f, 35.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.5f, 8.59f);
        pathBuilder.lineTo(222.52f, 128.0f);
        pathBuilder.lineToRelative(-53.27f, 83.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.46f, 11.05f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, false, 176.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.76f, -3.71f);
        pathBuilder.lineToRelative(56.0f, -88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 238.75f, 123.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsAngle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
