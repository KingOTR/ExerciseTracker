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

/* compiled from: Scribble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scribble", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getScribble", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribble", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleKt {
    private static ImageVector _scribble;

    public static final ImageVector getScribble(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _scribble;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scribble", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.25f, 188.24f);
        pathBuilder.arcToRelative(16.63f, 16.63f, 0.0f, false, false, 0.0f, 23.52f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.arcToRelative(28.61f, 28.61f, 0.0f, false, true, 0.0f, -40.48f);
        pathBuilder.lineToRelative(9.37f, -9.38f);
        pathBuilder.arcToRelative(16.63f, 16.63f, 0.0f, false, false, -23.52f, -23.51f);
        pathBuilder.lineToRelative(-66.75f, 66.75f);
        pathBuilder.arcToRelative(28.63f, 28.63f, 0.0f, false, true, -40.49f, -40.49f);
        pathBuilder.lineToRelative(98.76f, -98.75f);
        pathBuilder.arcToRelative(16.63f, 16.63f, 0.0f, false, false, -23.52f, -23.51f);
        pathBuilder.lineTo(82.86f, 117.62f);
        pathBuilder.arcTo(28.63f, 28.63f, 0.0f, false, true, 42.37f, 77.13f);
        pathBuilder.lineTo(83.75f, 35.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.49f, 8.48f);
        pathBuilder.lineTo(50.86f, 85.62f);
        pathBuilder.arcToRelative(16.63f, 16.63f, 0.0f, false, false, 23.52f, 23.51f);
        pathBuilder.lineToRelative(66.75f, -66.75f);
        pathBuilder.arcToRelative(28.63f, 28.63f, 0.0f, false, true, 40.49f, 40.49f);
        pathBuilder.lineTo(82.86f, 181.62f);
        pathBuilder.arcToRelative(16.63f, 16.63f, 0.0f, false, false, 23.52f, 23.51f);
        pathBuilder.lineToRelative(66.76f, -66.75f);
        pathBuilder.arcToRelative(28.63f, 28.63f, 0.0f, false, true, 40.49f, 40.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribble = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
