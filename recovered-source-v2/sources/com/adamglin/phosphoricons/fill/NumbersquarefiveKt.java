package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Numbersquarefive.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberSquareFive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNumberSquareFive", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberSquareFive", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumbersquarefiveKt {
    private static ImageVector _numberSquareFive;

    public static final ImageVector getNumberSquareFive(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _numberSquareFive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NumberSquareFive", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 112.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f);
        pathBuilder.arcToRelative(35.54f, 35.54f, 0.0f, false, true, -25.71f, -10.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.42f, -11.2f);
        pathBuilder.arcTo(19.73f, 19.73f, 0.0f, false, false, 124.0f, 168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f);
        pathBuilder.arcToRelative(19.73f, 19.73f, 0.0f, false, false, -14.29f, 5.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.6f, -6.92f);
        pathBuilder.lineToRelative(8.0f, -48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(118.78f, 88.0f);
        pathBuilder.lineToRelative(-4.19f, 25.14f);
        pathBuilder.arcTo(38.8f, 38.8f, 0.0f, false, true, 124.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberSquareFive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
