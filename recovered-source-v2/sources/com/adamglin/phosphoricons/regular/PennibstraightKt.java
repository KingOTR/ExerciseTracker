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

/* compiled from: Pennibstraight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNibStraight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPenNibStraight", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNibStraight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibstraightKt {
    private static ImageVector _penNibStraight;

    public static final ImageVector getPenNibStraight(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.lineTo(192.0f, 69.9f);
        pathBuilder.lineTo(192.0f, 32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(80.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f);
        pathBuilder.lineTo(64.0f, 69.92f);
        pathBuilder.lineTo(33.86f, 123.51f);
        pathBuilder.curveToRelative(-0.07f, 0.12f, -0.13f, 0.25f, -0.2f, 0.38f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 1.46f, 16.57f);
        pathBuilder.lineToRelative(0.11f, 0.14f);
        pathBuilder.lineToRelative(86.44f, 112.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.67f, 0.0f);
        pathBuilder.lineTo(220.77f, 140.6f);
        pathBuilder.lineToRelative(0.11f, -0.14f);
        pathBuilder.arcTo(15.92f, 15.92f, 0.0f, false, false, 222.33f, 123.89f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 32.0f);
        pathBuilder.lineTo(176.0f, 64.0f);
        pathBuilder.lineTo(80.0f, 64.0f);
        pathBuilder.lineTo(80.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 224.5f);
        pathBuilder.lineTo(136.0f, 158.83f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(65.66f);
        pathBuilder.lineTo(48.0f, 131.0f);
        pathBuilder.lineTo(76.69f, 80.0f);
        pathBuilder.lineTo(179.32f, 80.0f);
        pathBuilder.lineTo(208.0f, 131.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNibStraight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
