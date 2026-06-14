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

/* compiled from: Headcircuit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeadCircuit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHeadCircuit", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_headCircuit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadcircuitKt {
    private static ImageVector _headCircuit;

    public static final ImageVector getHeadCircuit(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(188.25f, 169.77f);
        pathBuilder.arcTo(84.3f, 84.3f, 0.0f, false, false, 220.0f, 102.0f);
        pathBuilder.curveToRelative(-1.0f, -43.64f, -35.9f, -79.62f, -79.45f, -81.91f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 52.0f, 103.0f);
        pathBuilder.lineTo(29.1f, 147.0f);
        pathBuilder.curveToRelative(-0.05f, 0.09f, -0.09f, 0.18f, -0.13f, 0.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.66f, 15.46f);
        pathBuilder.lineToRelative(0.13f, 0.06f);
        pathBuilder.lineTo(60.0f, 174.38f);
        pathBuilder.lineTo(60.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(72.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(68.0f, 171.81f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.34f, -3.64f);
        pathBuilder.lineToRelative(-27.5f, -12.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.88f, -5.0f);
        pathBuilder.lineToRelative(23.27f, -44.72f);
        pathBuilder.arcTo(4.11f, 4.11f, 0.0f, false, false, 60.0f, 104.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 64.0f, -75.0f);
        pathBuilder.lineTo(124.0f, 52.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 28.11f);
        pathBuilder.arcToRelative(78.35f, 78.35f, 0.0f, false, true, 8.11f, 0.0f);
        pathBuilder.curveToRelative(33.13f, 1.74f, 60.72f, 25.0f, 69.2f, 55.89f);
        pathBuilder.lineTo(184.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.07f, 1.44f);
        pathBuilder.lineToRelative(-27.46f, 33.0f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, true, false, 6.13f, 5.13f);
        pathBuilder.lineTo(185.87f, 92.0f);
        pathBuilder.lineTo(211.0f, 92.0f);
        pathBuilder.arcToRelative(75.9f, 75.9f, 0.0f, false, true, -29.44f, 72.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.57f, 3.7f);
        pathBuilder.lineToRelative(8.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.5f);
        pathBuilder.lineToRelative(0.5f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 231.5f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _headCircuit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
