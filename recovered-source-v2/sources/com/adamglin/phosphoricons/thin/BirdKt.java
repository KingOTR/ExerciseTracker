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

/* compiled from: Bird.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bird", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBird", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bird", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirdKt {
    private static ImageVector _bird;

    public static final ImageVector getBird(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bird;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bird", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 68.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, 3.33f);
        pathBuilder.lineTo(212.0f, 98.14f);
        pathBuilder.lineTo(212.0f, 120.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, true, 112.0f, 220.0f);
        pathBuilder.lineTo(24.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.37f, -19.5f);
        pathBuilder.lineTo(100.0f, 98.08f);
        pathBuilder.lineTo(100.0f, 76.89f);
        pathBuilder.curveToRelative(0.0f, -31.22f, 25.0f, -56.74f, 55.72f, -56.89f);
        pathBuilder.lineTo(156.0f, 20.0f);
        pathBuilder.arcToRelative(55.94f, 55.94f, 0.0f, false, true, 53.79f, 40.39f);
        pathBuilder.lineToRelative(24.43f, 16.28f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.79f, 80.0f);
        pathBuilder.lineTo(204.11f, 66.22f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.65f, -2.33f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 156.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(-0.24f);
        pathBuilder.curveTo(129.43f, 28.13f, 108.0f, 50.06f, 108.0f, 76.89f);
        pathBuilder.lineTo(108.0f, 99.52f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.93f, 2.56f);
        pathBuilder.lineTo(20.84f, 205.56f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 212.0f);
        pathBuilder.lineTo(52.79f, 212.0f);
        pathBuilder.lineToRelative(72.14f, -86.56f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.14f, 5.12f);
        pathBuilder.lineTo(63.21f, 212.0f);
        pathBuilder.lineTo(112.0f, 212.0f);
        pathBuilder.arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f);
        pathBuilder.lineTo(204.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.78f, -3.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bird = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
