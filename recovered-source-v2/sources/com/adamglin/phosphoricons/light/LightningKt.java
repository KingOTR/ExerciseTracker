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

/* compiled from: Lightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLightning", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningKt {
    private static ImageVector _lightning;

    public static final ImageVector getLightning(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lightning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lightning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.84f, 118.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.73f, -4.25f);
        pathBuilder.lineTo(150.88f, 92.17f);
        pathBuilder.lineToRelative(15.0f, -75.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.27f, -5.27f);
        pathBuilder.lineToRelative(-112.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.28f, 9.71f);
        pathBuilder.lineToRelative(59.23f, 22.21f);
        pathBuilder.lineToRelative(-15.0f, 75.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, 6.52f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 246.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.39f, -1.91f);
        pathBuilder.lineToRelative(112.0f, -120.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 213.84f, 118.63f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 220.46f);
        pathBuilder.lineToRelative(11.85f, -59.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, -6.8f);
        pathBuilder.lineToRelative(-55.6f, -20.85f);
        pathBuilder.lineToRelative(91.46f, -98.0f);
        pathBuilder.lineTo(138.12f, 94.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.77f, 6.8f);
        pathBuilder.lineToRelative(55.6f, 20.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
