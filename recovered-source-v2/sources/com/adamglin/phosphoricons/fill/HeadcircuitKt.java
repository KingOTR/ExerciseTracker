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

/* compiled from: Headcircuit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeadCircuit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHeadCircuit", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_headCircuit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadcircuitKt {
    private static ImageVector _headCircuit;

    public static final ImageVector getHeadCircuit(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(120.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.5f, 171.47f);
        pathBuilder.arcTo(88.32f, 88.32f, 0.0f, false, false, 224.0f, 101.89f);
        pathBuilder.quadToRelative(0.0f, -1.1f, -0.09f, -2.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.75f);
        pathBuilder.lineTo(195.75f, 95.95f);
        pathBuilder.lineTo(172.62f, 123.7f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -12.28f, -10.25f);
        pathBuilder.lineToRelative(25.51f, -30.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(23.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.77f, -5.35f);
        pathBuilder.curveTo(207.27f, 42.0f, 176.86f, 18.0f, 140.74f, 16.08f);
        pathBuilder.lineToRelative(-0.59f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.15f, 4.0f);
        pathBuilder.lineTo(136.0f, 49.33f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-27.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.89f, -3.91f);
        pathBuilder.arcTo(88.16f, 88.16f, 0.0f, false, false, 48.0f, 102.0f);
        pathBuilder.lineTo(25.55f, 145.14f);
        pathBuilder.lineToRelative(-0.22f, 0.45f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.51f, 20.7f);
        pathBuilder.lineToRelative(0.25f, 0.12f);
        pathBuilder.lineTo(56.0f, 176.9f);
        pathBuilder.verticalLineToRelative(31.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(71.77f);
        pathBuilder.arcToRelative(8.42f, 8.42f, 0.0f, false, false, 4.06f, -1.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.11f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _headCircuit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
