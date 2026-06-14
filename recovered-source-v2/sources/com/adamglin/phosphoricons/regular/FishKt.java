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

/* compiled from: Fish.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fish", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFish", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fish", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishKt {
    private static ImageVector _fish;

    public static final ImageVector getFish(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fish;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fish", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.72f, 143.64f);
        pathBuilder.curveToRelative(-19.37f, 34.9f, -55.44f, 53.76f, -107.24f, 56.1f);
        pathBuilder.lineToRelative(-22.0f, 51.41f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.1f, 256.0f);
        pathBuilder.lineToRelative(-0.51f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, -5.78f);
        pathBuilder.lineTo(57.6f, 198.39f);
        pathBuilder.lineTo(5.8f, 183.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, -15.05f);
        pathBuilder.lineToRelative(51.41f, -22.0f);
        pathBuilder.curveToRelative(2.35f, -51.78f, 21.21f, -87.84f, 56.09f, -107.22f);
        pathBuilder.curveToRelative(24.75f, -13.74f, 52.74f, -15.84f, 71.88f, -15.18f);
        pathBuilder.curveToRelative(18.64f, 0.64f, 36.0f, 4.27f, 38.86f, 6.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.83f, 2.83f);
        pathBuilder.curveToRelative(1.69f, 2.85f, 5.33f, 20.21f, 6.0f, 38.85f);
        pathBuilder.curveTo(232.55f, 90.89f, 230.46f, 118.89f, 216.72f, 143.64f);
        pathBuilder.close();
        pathBuilder.moveTo(161.54f, 172.64f);
        pathBuilder.arcToRelative(52.11f, 52.11f, 0.0f, false, true, -33.4f, -44.78f);
        pathBuilder.arcTo(52.09f, 52.09f, 0.0f, false, true, 83.37f, 94.47f);
        pathBuilder.quadToRelative(-10.45f, 23.79f, -11.3f, 57.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.85f, 7.17f);
        pathBuilder.lineTo(31.83f, 174.37f);
        pathBuilder.lineToRelative(34.45f, 9.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.49f, 5.5f);
        pathBuilder.lineToRelative(9.84f, 34.44f);
        pathBuilder.lineToRelative(15.16f, -35.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.17f, -4.84f);
        pathBuilder.quadTo(137.71f, 183.12f, 161.54f, 172.64f);
        pathBuilder.close();
        pathBuilder.moveTo(212.42f, 43.57f);
        pathBuilder.curveToRelative(-14.15f, -3.0f, -64.1f, -11.0f, -100.3f, 14.75f);
        pathBuilder.arcToRelative(81.21f, 81.21f, 0.0f, false, false, -16.0f, 15.07f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 39.35f, 38.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.73f, 8.73f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 38.47f, 39.34f);
        pathBuilder.arcToRelative(80.81f, 80.81f, 0.0f, false, false, 15.0f, -16.0f);
        pathBuilder.curveTo(223.42f, 107.73f, 215.42f, 57.74f, 212.42f, 43.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fish = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
