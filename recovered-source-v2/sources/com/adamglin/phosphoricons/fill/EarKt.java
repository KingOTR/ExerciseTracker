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

/* compiled from: Ear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarKt {
    private static ImageVector _ear;

    public static final ImageVector getEar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _ear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 152.0f);
        pathBuilder.arcToRelative(4.21f, 4.21f, 0.0f, false, false, 1.33f, -0.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.34f, 15.08f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.curveToRelative(0.0f, -8.85f, 4.77f, -15.23f, 9.0f, -20.87f);
        pathBuilder.curveToRelative(3.77f, -5.0f, 7.0f, -9.38f, 7.0f, -15.13f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 11.07f, -5.66f, 18.63f, -10.2f, 24.71f);
        pathBuilder.curveToRelative(-3.6f, 4.81f, -5.8f, 7.93f, -5.8f, 11.29f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f);
        pathBuilder.curveToRelative(7.0f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 14.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.19f, 11.42f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, -6.74f, -5.0f, -13.14f, -10.79f, -20.55f);
        pathBuilder.curveTo(73.54f, 141.63f, 64.0f, 129.41f, 64.0f, 112.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
