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

/* compiled from: Pennibstraight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNibStraight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPenNibStraight", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNibStraight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibstraightKt {
    private static ImageVector _penNibStraight;

    public static final ImageVector getPenNibStraight(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _penNibStraight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PenNibStraight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.33f, 123.89f);
        pathBuilder.curveToRelative(-0.06f, -0.13f, -0.12f, -0.26f, -0.19f, -0.38f);
        pathBuilder.lineTo(192.0f, 69.91f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f);
        pathBuilder.verticalLineTo(69.9f);
        pathBuilder.lineTo(33.86f, 123.51f);
        pathBuilder.curveToRelative(-0.07f, 0.12f, -0.13f, 0.25f, -0.2f, 0.38f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 1.46f, 16.57f);
        pathBuilder.lineToRelative(0.11f, 0.14f);
        pathBuilder.lineToRelative(77.61f, 100.81f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 239.0f);
        pathBuilder.verticalLineTo(154.63f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(239.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.16f, 2.44f);
        pathBuilder.lineToRelative(77.6f, -100.81f);
        pathBuilder.lineToRelative(0.11f, -0.14f);
        pathBuilder.arcTo(15.92f, 15.92f, 0.0f, false, false, 222.33f, 123.89f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 64.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNibStraight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
