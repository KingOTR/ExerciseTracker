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

/* compiled from: Compasstool.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCompassTool", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassTool", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompasstoolKt {
    private static ImageVector _compassTool;

    public static final ImageVector getCompassTool(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _compassTool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CompassTool", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.56f, 121.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.12f, -3.64f);
        pathBuilder.arcToRelative(84.05f, 84.05f, 0.0f, false, true, -38.58f, 37.16f);
        pathBuilder.lineToRelative(-19.68f, -44.29f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 132.0f, 44.23f);
        pathBuilder.lineTo(132.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 44.23f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -14.18f, 66.82f);
        pathBuilder.lineTo(60.35f, 222.37f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 5.28f);
        pathBuilder.arcTo(3.88f, 3.88f, 0.0f, false, false, 64.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -2.38f);
        pathBuilder.lineToRelative(26.66f, -60.0f);
        pathBuilder.arcTo(91.4f, 91.4f, 0.0f, false, false, 128.0f, 172.0f);
        pathBuilder.arcToRelative(95.21f, 95.21f, 0.0f, false, false, 33.75f, -6.22f);
        pathBuilder.lineToRelative(26.59f, 59.84f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 228.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, false, 1.62f, -0.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -5.28f);
        pathBuilder.lineToRelative(-26.54f, -59.73f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 211.56f, 121.82f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 80.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(83.43f, 83.43f, 0.0f, false, true, -30.43f, -5.68f);
        pathBuilder.lineToRelative(19.56f, -44.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 21.74f, 0.0f);
        pathBuilder.lineToRelative(19.63f, 44.15f);
        pathBuilder.arcTo(87.44f, 87.44f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassTool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
