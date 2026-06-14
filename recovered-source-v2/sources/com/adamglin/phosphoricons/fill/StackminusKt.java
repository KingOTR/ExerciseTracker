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

/* compiled from: Stackminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StackMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStackMinus", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stackMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackminusKt {
    private static ImageVector _stackMinus;

    public static final ImageVector getStackMinus(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _stackMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StackMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.91f, 124.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 134.91f);
        pathBuilder.lineToRelative(-96.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.06f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 36.0f, 121.09f);
        pathBuilder.lineToRelative(92.0f, 53.65f);
        pathBuilder.lineToRelative(92.0f, -53.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 230.91f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 86.91f);
        pathBuilder.lineToRelative(96.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.82f);
        pathBuilder.lineToRelative(-96.0f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.06f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.82f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 192.0f);
        pathBuilder.lineTo(184.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 215.76f);
        pathBuilder.lineTo(128.0f, 222.76f);
        pathBuilder.lineTo(36.0f, 169.09f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 182.91f);
        pathBuilder.lineToRelative(96.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f);
        pathBuilder.lineToRelative(16.0f, -9.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 140.0f, 215.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stackMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
