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

/* compiled from: Earslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EarSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEarSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_earSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarslashKt {
    private static ImageVector _earSlash;

    public static final ImageVector getEarSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _earSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EarSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(58.23f, 57.2f);
        pathBuilder.arcTo(83.38f, 83.38f, 0.0f, false, false, 44.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 31.79f, 11.28f, 42.68f, 21.24f, 52.28f);
        pathBuilder.curveTo(73.16f, 163.91f, 80.0f, 170.51f, 80.0f, 188.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f);
        pathBuilder.curveToRelative(13.71f, 0.0f, 25.52f, -5.87f, 35.08f, -17.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.16f, -5.1f);
        pathBuilder.curveTo(148.83f, 223.24f, 139.37f, 228.0f, 128.0f, 228.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f);
        pathBuilder.curveToRelative(0.0f, -20.89f, -8.75f, -29.33f, -17.21f, -37.48f);
        pathBuilder.curveTo(61.55f, 141.61f, 52.0f, 132.4f, 52.0f, 104.0f);
        pathBuilder.arcTo(75.36f, 75.36f, 0.0f, false, true, 63.8f, 63.33f);
        pathBuilder.lineToRelative(23.0f, 25.27f);
        pathBuilder.arcTo(43.73f, 43.73f, 0.0f, false, false, 84.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(36.2f, 36.2f, 0.0f, false, true, 1.0f, -8.53f);
        pathBuilder.lineTo(141.65f, 149.0f);
        pathBuilder.arcTo(37.0f, 37.0f, 0.0f, false, false, 140.0f, 160.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.24f, 18.21f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.arcToRelative(29.55f, 29.55f, 0.0f, false, true, 0.24f, -3.79f);
        pathBuilder.lineToRelative(14.13f, 15.55f);
        pathBuilder.arcTo(12.37f, 12.37f, 0.0f, false, true, 160.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(83.55f, 37.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.37f, -5.49f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 89.0f, 38.74f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 83.55f, 37.36f);
        pathBuilder.close();
        pathBuilder.moveTo(160.44f, 118.17f);
        pathBuilder.arcTo(29.85f, 29.85f, 0.0f, false, false, 164.0f, 104.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -47.68f, -34.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.59f, -7.57f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 104.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -4.46f, 17.84f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 124.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.83f, -0.45f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 160.44f, 118.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _earSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
