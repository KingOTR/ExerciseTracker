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

/* compiled from: Stacksimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StackSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getStackSimple", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stackSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StacksimpleKt {
    private static ImageVector _stackSimple;

    public static final ImageVector getStackSimple(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _stackSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StackSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 111.0f);
        pathBuilder.lineToRelative(112.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f);
        pathBuilder.lineToRelative(112.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.9f);
        pathBuilder.lineToRelative(-112.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f);
        pathBuilder.lineToRelative(-112.0f, 64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 111.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 49.21f);
        pathBuilder.lineTo(223.87f, 104.0f);
        pathBuilder.lineTo(128.0f, 158.79f);
        pathBuilder.lineTo(32.13f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.94f, 140.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 244.0f, 151.0f);
        pathBuilder.lineTo(132.0f, 215.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 0.0f);
        pathBuilder.lineTo(12.0f, 151.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 137.05f);
        pathBuilder.lineToRelative(108.0f, 61.74f);
        pathBuilder.lineToRelative(108.0f, -61.74f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 246.94f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stackSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
