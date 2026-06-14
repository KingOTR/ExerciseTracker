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

/* compiled from: Biohazard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Biohazard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBiohazard", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_biohazard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BiohazardKt {
    private static ImageVector _biohazard;

    public static final ImageVector getBiohazard(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _biohazard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Biohazard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.26f, 100.55f);
        pathBuilder.curveToRelative(-0.37f, -0.71f, -0.76f, -1.42f, -1.16f, -2.11f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -29.55f, -81.29f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -11.1f, 21.28f);
        pathBuilder.arcTo(39.91f, 39.91f, 0.0f, false, true, 168.0f, 73.92f);
        pathBuilder.curveToRelative(0.0f, 1.0f, -0.05f, 2.0f, -0.13f, 3.0f);
        pathBuilder.arcToRelative(67.79f, 67.79f, 0.0f, false, false, -79.74f, 0.0f);
        pathBuilder.curveToRelative(-0.08f, -1.0f, -0.13f, -2.0f, -0.13f, -3.0f);
        pathBuilder.arcToRelative(39.92f, 39.92f, 0.0f, false, true, 21.55f, -35.5f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 98.46f, 17.14f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 68.89f, 98.45f);
        pathBuilder.curveToRelative(-0.4f, 0.7f, -0.78f, 1.39f, -1.15f, 2.1f);
        pathBuilder.arcTo(64.08f, 64.08f, 0.0f, false, false, 12.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 24.18f, -36.73f);
        pathBuilder.curveToRelative(-0.11f, 1.56f, -0.18f, 3.14f, -0.18f, 4.73f);
        pathBuilder.arcToRelative(68.12f, 68.12f, 0.0f, false, false, 41.63f, 62.68f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -47.16f, 3.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.94f, 20.21f);
        pathBuilder.arcTo(63.95f, 63.95f, 0.0f, false, false, 128.0f, 201.24f);
        pathBuilder.arcToRelative(63.95f, 63.95f, 0.0f, false, false, 86.47f, 16.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.94f, -20.21f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -47.16f, -3.0f);
        pathBuilder.arcTo(68.12f, 68.12f, 0.0f, false, false, 196.0f, 132.0f);
        pathBuilder.curveToRelative(0.0f, -1.59f, -0.07f, -3.17f, -0.18f, -4.73f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 220.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcTo(64.08f, 64.08f, 0.0f, false, false, 188.26f, 100.55f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 88.0f);
        pathBuilder.arcToRelative(43.85f, 43.85f, 0.0f, false, true, 30.23f, 12.07f);
        pathBuilder.arcToRelative(39.93f, 39.93f, 0.0f, false, true, -60.46f, 0.0f);
        pathBuilder.arcTo(43.81f, 43.81f, 0.0f, false, true, 128.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 132.0f);
        pathBuilder.arcToRelative(44.35f, 44.35f, 0.0f, false, true, 0.57f, -7.06f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 30.18f, 49.0f);
        pathBuilder.arcTo(44.08f, 44.08f, 0.0f, false, true, 84.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(141.25f, 174.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 30.18f, -49.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -30.18f, 49.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _biohazard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
