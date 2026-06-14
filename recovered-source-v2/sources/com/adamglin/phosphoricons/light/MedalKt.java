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

/* compiled from: Medal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Medal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMedal", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalKt {
    private static ImageVector _medal;

    public static final ImageVector getMedal(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _medal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Medal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.0f, 96.0f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, true, false, 74.0f, 162.87f);
        pathBuilder.lineTo(74.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.85f, 5.1f);
        pathBuilder.arcTo(5.93f, 5.93f, 0.0f, false, false, 80.0f, 246.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.68f, -0.63f);
        pathBuilder.lineTo(128.0f, 222.71f);
        pathBuilder.lineToRelative(45.33f, 22.66f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 182.0f, 240.0f);
        pathBuilder.lineTo(182.0f, 162.87f);
        pathBuilder.arcTo(85.87f, 85.87f, 0.0f, false, false, 214.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 96.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 54.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 230.29f);
        pathBuilder.lineToRelative(-39.33f, -19.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(86.0f, 230.29f);
        pathBuilder.lineTo(86.0f, 171.0f);
        pathBuilder.arcToRelative(85.75f, 85.75f, 0.0f, false, false, 84.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 150.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, true, false, 74.0f, 96.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 128.0f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 54.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, true, true, 86.0f, 96.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 54.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
