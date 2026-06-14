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

/* compiled from: Compasstool.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCompassTool", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassTool", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompasstoolKt {
    private static ImageVector _compassTool;

    public static final ImageVector getCompassTool(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(215.12f, 123.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.24f, -7.28f);
        pathBuilder.arcToRelative(79.58f, 79.58f, 0.0f, false, true, -33.08f, 33.5f);
        pathBuilder.lineToRelative(-18.24f, -41.05f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 136.0f, 44.91f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(44.91f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -13.56f, 63.9f);
        pathBuilder.lineTo(56.69f, 220.75f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.62f, 6.5f);
        pathBuilder.lineToRelative(25.14f, -56.56f);
        pathBuilder.arcTo(95.48f, 95.48f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder.arcToRelative(99.13f, 99.13f, 0.0f, false, false, 31.6f, -5.21f);
        pathBuilder.lineToRelative(25.09f, 56.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.62f, -6.5f);
        pathBuilder.lineToRelative(-25.0f, -56.25f);
        pathBuilder.arcTo(95.81f, 95.81f, 0.0f, false, false, 215.12f, 123.64f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 160.0f);
        pathBuilder.arcToRelative(79.52f, 79.52f, 0.0f, false, true, -25.0f, -4.0f);
        pathBuilder.lineToRelative(18.08f, -40.68f);
        pathBuilder.arcToRelative(35.75f, 35.75f, 0.0f, false, false, 13.88f, 0.0f);
        pathBuilder.lineToRelative(18.14f, 40.8f);
        pathBuilder.arcTo(83.21f, 83.21f, 0.0f, false, true, 128.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassTool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
