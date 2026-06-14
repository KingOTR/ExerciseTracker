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

/* compiled from: Crownsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCrownSimple", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownsimpleKt {
    private static ImageVector _crownSimple;

    public static final ImageVector getCrownSimple(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _crownSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.63f, 70.0f);
        pathBuilder.arcToRelative(19.82f, 19.82f, 0.0f, false, false, -23.55f, 4.71f);
        pathBuilder.lineToRelative(-29.52f, 31.82f);
        pathBuilder.lineTo(146.22f, 31.76f);
        pathBuilder.lineToRelative(-0.06f, -0.14f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -36.32f, 0.0f);
        pathBuilder.lineToRelative(-0.06f, 0.14f);
        pathBuilder.lineTo(76.44f, 106.52f);
        pathBuilder.lineTo(46.92f, 74.7f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.6f, 16.81f);
        pathBuilder.curveToRelative(0.0f, 0.16f, 0.06f, 0.31f, 0.09f, 0.47f);
        pathBuilder.lineTo(35.07f, 195.76f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 54.71f, 212.0f);
        pathBuilder.horizontalLineTo(201.29f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.64f, -16.24f);
        pathBuilder.lineTo(243.59f, 92.0f);
        pathBuilder.curveToRelative(0.0f, -0.16f, 0.07f, -0.31f, 0.09f, -0.47f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, false, 232.63f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.06f, 188.0f);
        pathBuilder.horizontalLineTo(57.94f);
        pathBuilder.lineTo(39.06f, 101.51f);
        pathBuilder.lineTo(71.2f, 136.16f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 91.0f, 132.89f);
        pathBuilder.lineToRelative(37.0f, -83.07f);
        pathBuilder.lineToRelative(37.0f, 83.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.76f, 3.27f);
        pathBuilder.lineToRelative(32.14f, -34.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
