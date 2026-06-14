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

/* compiled from: Needle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Needle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNeedle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_needle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NeedleKt {
    private static ImageVector _needle;

    public static final ImageVector getNeedle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _needle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Needle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.24f, 67.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-16.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 188.24f, 67.76f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 72.0f);
        pathBuilder.arcToRelative(37.74f, 37.74f, 0.0f, false, true, -11.13f, 26.87f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.23f, 1.67f);
        pathBuilder.curveToRelative(-52.14f, 9.0f, -138.53f, 94.84f, -139.4f, 95.7f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, -1.82f, 1.25f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(6.12f, 6.12f, 0.0f, false, true, 40.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -10.24f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.4f, -1.41f, 86.78f, -87.44f, 95.69f, -139.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.67f, -3.23f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 222.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 72.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -44.38f, -18.38f);
        pathBuilder.lineTo(142.93f, 76.3f);
        pathBuilder.curveToRelative(-4.14f, 20.79f, -18.62f, 47.61f, -43.13f, 79.9f);
        pathBuilder.curveToRelative(32.29f, -24.51f, 59.11f, -39.0f, 79.9f, -43.13f);
        pathBuilder.lineToRelative(22.68f, -22.69f);
        pathBuilder.arcTo(25.79f, 25.79f, 0.0f, false, false, 210.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _needle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
