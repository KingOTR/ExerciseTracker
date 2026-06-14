package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _scissors;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scissors", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(161.0f, 110.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.05f, -5.56f);
        pathBuilder.lineTo(229.74f, 59.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.52f, 6.61f);
        pathBuilder.lineToRelative(-67.67f, 46.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.3f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, 1.0f);
        pathBuilder.lineTo(136.0f, 132.85f);
        pathBuilder.lineTo(88.47f, 165.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, -5.84f, -8.0f);
        pathBuilder.curveToRelative(0.45f, 0.45f, 0.89f, 0.92f, 1.31f, 1.4f);
        pathBuilder.lineToRelative(45.0f, -30.78f);
        pathBuilder.lineToRelative(-45.0f, -30.78f);
        pathBuilder.curveToRelative(-0.42f, 0.48f, -0.86f, 1.0f, -1.31f, 1.4f);
        pathBuilder.arcToRelative(31.86f, 31.86f, 0.0f, true, true, 5.84f, -8.0f);
        pathBuilder.lineToRelative(49.69f, 34.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(96.09f, 65.76f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 235.3f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(77.0f, 93.0f);
        pathBuilder.arcToRelative(24.42f, 24.42f, 0.0f, false, false, 2.82f, -3.38f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 77.0f, 93.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 180.0f);
        pathBuilder.arcToRelative(23.75f, 23.75f, 0.0f, false, false, -4.15f, -13.49f);
        pathBuilder.lineToRelative(0.0f, -0.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcTo(24.5f, 24.5f, 0.0f, false, false, 77.0f, 163.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 77.0f, 197.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(23.85f, 23.85f, 0.0f, false, false, 84.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
