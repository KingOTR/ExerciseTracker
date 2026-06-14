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

/* compiled from: Heartstraight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartStraight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHeartStraight", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartStraight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartstraightKt {
    private static ImageVector _heartStraight;

    public static final ImageVector getHeartStraight(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _heartStraight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartStraight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.84f, 54.13f);
        pathBuilder.arcTo(62.07f, 62.07f, 0.0f, false, false, 138.32f, 54.0f);
        pathBuilder.lineTo(128.0f, 63.58f);
        pathBuilder.lineTo(117.68f, 54.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, -87.58f, 87.8f);
        pathBuilder.lineToRelative(89.35f, 90.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.1f, 0.0f);
        pathBuilder.lineToRelative(89.29f, -90.59f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, -87.7f);
        pathBuilder.close();
        pathBuilder.moveTo(208.84f, 124.92f);
        pathBuilder.lineTo(128.0f, 206.9f);
        pathBuilder.lineTo(47.13f, 124.85f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 53.74f, -53.74f);
        pathBuilder.curveToRelative(0.1f, 0.1f, 0.2f, 0.2f, 0.31f, 0.29f);
        pathBuilder.lineToRelative(18.64f, 17.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.36f, 0.0f);
        pathBuilder.lineTo(154.82f, 71.4f);
        pathBuilder.curveToRelative(0.11f, -0.09f, 0.21f, -0.19f, 0.31f, -0.29f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.68f, 53.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartStraight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
