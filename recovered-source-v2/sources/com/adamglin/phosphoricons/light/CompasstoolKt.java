package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Compasstool.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCompassTool", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassTool", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompasstoolKt {
    private static ImageVector _compassTool;

    public static final ImageVector getCompassTool(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(213.34f, 122.73f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.68f, -5.46f);
        pathBuilder.arcToRelative(81.79f, 81.79f, 0.0f, false, true, -35.81f, 35.36f);
        pathBuilder.lineToRelative(-18.14f, -40.8f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 134.0f, 42.48f);
        pathBuilder.lineTo(134.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 42.48f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -14.71f, 69.35f);
        pathBuilder.lineTo(58.52f, 221.56f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, 4.88f);
        pathBuilder.lineToRelative(25.9f, -58.26f);
        pathBuilder.arcTo(93.37f, 93.37f, 0.0f, false, false, 128.0f, 174.0f);
        pathBuilder.arcToRelative(97.0f, 97.0f, 0.0f, false, false, 32.68f, -5.69f);
        pathBuilder.lineToRelative(25.84f, 58.13f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, -4.88f);
        pathBuilder.lineToRelative(-25.77f, -58.0f);
        pathBuilder.arcTo(93.92f, 93.92f, 0.0f, false, false, 213.34f, 122.73f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 54.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 162.0f);
        pathBuilder.arcToRelative(81.51f, 81.51f, 0.0f, false, true, -27.73f, -4.83f);
        pathBuilder.lineToRelative(18.0f, -40.45f);
        pathBuilder.arcToRelative(37.85f, 37.85f, 0.0f, false, false, 19.52f, 0.0f);
        pathBuilder.lineToRelative(18.0f, 40.6f);
        pathBuilder.arcTo(85.34f, 85.34f, 0.0f, false, true, 128.0f, 162.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassTool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
