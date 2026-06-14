package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Headcircuit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeadCircuit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHeadCircuit", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_headCircuit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadcircuitKt {
    private static ImageVector _headCircuit;

    public static final ImageVector getHeadCircuit(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _headCircuit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeadCircuit", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(215.93f, 100.72f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, false, 56.0f, 104.0f);
        pathBuilder.lineTo(32.65f, 148.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.77f, 10.31f);
        pathBuilder.lineTo(64.0f, 171.81f);
        pathBuilder.lineTo(64.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.lineToRelative(-8.0f, -64.0f);
        pathBuilder.arcTo(79.86f, 79.86f, 0.0f, false, false, 215.93f, 100.72f);
        pathBuilder.close();
        pathBuilder.moveTo(112.13f, 74.08f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 13.79f, 13.79f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 112.13f, 74.08f);
        pathBuilder.close();
        pathBuilder.moveTo(146.13f, 151.87f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 13.79f, -13.79f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 146.08f, 151.87f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(192.5f, 171.47f);
        pathBuilder2.arcTo(88.34f, 88.34f, 0.0f, false, false, 224.0f, 101.93f);
        pathBuilder2.curveToRelative(-1.0f, -45.71f, -37.61f, -83.4f, -83.24f, -85.8f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 48.0f, 102.0f);
        pathBuilder2.lineTo(25.55f, 145.18f);
        pathBuilder2.curveToRelative(-0.09f, 0.18f, -0.18f, 0.36f, -0.26f, 0.54f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.55f, 20.62f);
        pathBuilder2.lineToRelative(0.25f, 0.11f);
        pathBuilder2.lineTo(56.0f, 176.94f);
        pathBuilder2.lineTo(56.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(72.0f, 208.0f);
        pathBuilder2.lineTo(72.0f, 171.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.67f, -7.28f);
        pathBuilder2.lineTo(40.0f, 152.0f);
        pathBuilder2.lineToRelative(23.07f, -44.34f);
        pathBuilder2.arcTo(7.9f, 7.9f, 0.0f, false, false, 64.0f, 104.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 56.0f, -70.21f);
        pathBuilder2.lineTo(120.0f, 49.38f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 32.0f);
        pathBuilder2.curveToRelative(1.3f, 0.0f, 2.6f, 0.0f, 3.9f, 0.1f);
        pathBuilder2.arcTo(72.26f, 72.26f, 0.0f, false, true, 203.84f, 80.0f);
        pathBuilder2.lineTo(184.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.15f, 2.88f);
        pathBuilder2.lineTo(152.34f, 113.5f);
        pathBuilder2.arcToRelative(24.06f, 24.06f, 0.0f, true, false, 12.28f, 10.25f);
        pathBuilder2.lineTo(187.75f, 96.0f);
        pathBuilder2.horizontalLineToRelative(19.79f);
        pathBuilder2.quadToRelative(0.36f, 3.12f, 0.44f, 6.3f);
        pathBuilder2.arcToRelative(72.26f, 72.26f, 0.0f, false, true, -28.78f, 59.3f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.14f, 7.39f);
        pathBuilder2.lineToRelative(8.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.93f, 7.0f);
        pathBuilder2.arcToRelative(8.39f, 8.39f, 0.0f, false, false, 1.0f, -0.06f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.95f, -8.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 144.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 144.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _headCircuit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
