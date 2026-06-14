package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pennibstraight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNibStraight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPenNibStraight", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNibStraight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibstraightKt {
    private static ImageVector _penNibStraight;

    public static final ImageVector getPenNibStraight(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(225.92f, 122.11f);
        pathBuilder.curveToRelative(-0.1f, -0.19f, -0.19f, -0.37f, -0.3f, -0.56f);
        pathBuilder.lineTo(196.0f, 68.85f);
        pathBuilder.lineTo(196.0f, 32.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(80.0f, 12.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 32.0f);
        pathBuilder.lineTo(60.0f, 68.87f);
        pathBuilder.lineTo(30.38f, 121.55f);
        pathBuilder.arcToRelative(5.12f, 5.12f, 0.0f, false, false, -0.3f, 0.57f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 1.83f, 20.71f);
        pathBuilder.curveToRelative(0.09f, 0.13f, 0.18f, 0.25f, 0.28f, 0.37f);
        pathBuilder.lineToRelative(86.44f, 108.29f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.75f, 0.0f);
        pathBuilder.lineTo(223.81f, 143.2f);
        pathBuilder.curveToRelative(0.1f, -0.12f, 0.19f, -0.24f, 0.28f, -0.37f);
        pathBuilder.arcTo(19.91f, 19.91f, 0.0f, false, false, 225.92f, 122.11f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 36.0f);
        pathBuilder.lineTo(172.0f, 60.0f);
        pathBuilder.lineTo(84.0f, 60.0f);
        pathBuilder.lineTo(84.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 144.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 128.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 209.74f);
        pathBuilder.lineTo(140.0f, 165.81f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(43.92f);
        pathBuilder.lineTo(52.83f, 130.59f);
        pathBuilder.lineTo(79.0f, 84.0f);
        pathBuilder.lineTo(177.0f, 84.0f);
        pathBuilder.lineToRelative(26.19f, 46.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNibStraight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
