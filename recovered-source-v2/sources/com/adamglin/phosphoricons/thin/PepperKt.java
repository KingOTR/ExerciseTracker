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

/* compiled from: Pepper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pepper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPepper", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pepper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PepperKt {
    private static ImageVector _pepper;

    public static final ImageVector getPepper(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pepper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pepper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(163.79f, 44.14f);
        pathBuilder.arcTo(36.06f, 36.06f, 0.0f, false, false, 128.0f, 12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.73f, 24.17f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 100.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 48.75f, -26.71f, 81.34f, -79.4f, 96.87f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.33f, 23.36f);
        pathBuilder.arcTo(260.42f, 260.42f, 0.0f, false, false, 66.69f, 228.0f);
        pathBuilder.arcToRelative(256.53f, 256.53f, 0.0f, false, false, 34.83f, -2.3f);
        pathBuilder.curveToRelative(33.23f, -4.59f, 60.2f, -15.41f, 80.19f, -32.18f);
        pathBuilder.curveTo(207.12f, 172.21f, 220.0f, 142.09f, 220.0f, 104.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 163.79f, 44.14f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 52.0f);
        pathBuilder.arcToRelative(52.08f, 52.08f, 0.0f, false, true, 50.19f, 38.44f);
        pathBuilder.lineTo(192.0f, 99.54f);
        pathBuilder.lineTo(161.79f, 84.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.lineTo(128.0f, 99.54f);
        pathBuilder.lineToRelative(-18.19f, -9.1f);
        pathBuilder.arcTo(52.08f, 52.08f, 0.0f, false, true, 160.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.57f, 187.39f);
        pathBuilder.curveToRelative(-25.47f, 21.37f, -80.88f, 41.77f, -153.24f, 29.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -7.81f);
        pathBuilder.curveTo(78.56f, 192.14f, 108.0f, 156.0f, 108.0f, 104.0f);
        pathBuilder.arcToRelative(53.28f, 53.28f, 0.0f, false, true, 0.28f, -5.39f);
        pathBuilder.lineToRelative(17.93f, 9.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f);
        pathBuilder.lineTo(160.0f, 92.48f);
        pathBuilder.lineToRelative(30.21f, 15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f);
        pathBuilder.lineToRelative(17.93f, -9.0f);
        pathBuilder.arcTo(53.28f, 53.28f, 0.0f, false, true, 212.0f, 104.0f);
        pathBuilder.curveTo(212.0f, 139.62f, 200.08f, 167.67f, 176.57f, 187.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pepper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
