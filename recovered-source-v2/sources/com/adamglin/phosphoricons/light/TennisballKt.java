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

/* compiled from: Tennisball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TennisBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTennisBall", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tennisBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TennisballKt {
    private static ImageVector _tennisBall;

    public static final ImageVector getTennisBall(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tennisBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TennisBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.16f, 55.88f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, true, false, 0.0f, 144.24f);
        pathBuilder.arcTo(101.4f, 101.4f, 0.0f, false, false, 200.16f, 55.88f);
        pathBuilder.close();
        pathBuilder.moveTo(64.33f, 64.36f);
        pathBuilder.arcToRelative(89.62f, 89.62f, 0.0f, false, true, 57.25f, -26.07f);
        pathBuilder.arcTo(89.32f, 89.32f, 0.0f, false, true, 95.46f, 95.47f);
        pathBuilder.arcToRelative(89.38f, 89.38f, 0.0f, false, true, -57.21f, 26.11f);
        pathBuilder.arcTo(89.61f, 89.61f, 0.0f, false, true, 64.33f, 64.36f);
        pathBuilder.close();
        pathBuilder.moveTo(38.2f, 133.63f);
        pathBuilder.arcTo(101.36f, 101.36f, 0.0f, false, false, 104.0f, 104.0f);
        pathBuilder.arcToRelative(101.24f, 101.24f, 0.0f, false, false, 29.68f, -65.72f);
        pathBuilder.arcToRelative(89.76f, 89.76f, 0.0f, false, true, 84.17f, 84.13f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, -95.43f, 95.39f);
        pathBuilder.arcTo(89.76f, 89.76f, 0.0f, false, true, 38.2f, 133.63f);
        pathBuilder.close();
        pathBuilder.moveTo(191.67f, 191.63f);
        pathBuilder.arcToRelative(89.63f, 89.63f, 0.0f, false, true, -57.25f, 26.06f);
        pathBuilder.arcToRelative(89.94f, 89.94f, 0.0f, false, true, 83.33f, -83.28f);
        pathBuilder.arcTo(89.61f, 89.61f, 0.0f, false, true, 191.67f, 191.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tennisBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
