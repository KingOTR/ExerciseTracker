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

/* compiled from: Baby.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Baby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBaby", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baby", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BabyKt {
    private static ImageVector _baby;

    public static final ImageVector getBaby(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _baby;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Baby", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.16f, 24.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.56f, 1.81f);
        pathBuilder.curveTo(120.3f, 41.48f, 120.0f, 55.79f, 120.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.68f, 7.79f);
        pathBuilder.arcTo(8.24f, 8.24f, 0.0f, false, false, 136.0f, 55.68f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.8f, 48.0f);
        pathBuilder.arcToRelative(8.14f, 8.14f, 0.0f, false, true, 7.2f, 8.23f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, -0.27f);
        pathBuilder.curveToRelative(0.0f, -0.63f, 0.09f, -10.78f, 5.44f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.59f, -5.39f);
        pathBuilder.arcTo(104.16f, 104.16f, 0.0f, false, false, 24.07f, 131.66f);
        pathBuilder.curveTo(26.0f, 186.72f, 71.23f, 231.0f, 126.32f, 231.9f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, false, 7.84f, -207.8f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 127.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 127.91f);
        pathBuilder.close();
        pathBuilder.moveTo(160.27f, 182.68f);
        pathBuilder.arcToRelative(61.0f, 61.0f, 0.0f, false, true, -64.54f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, -13.54f);
        pathBuilder.arcToRelative(45.0f, 45.0f, 0.0f, false, false, 47.46f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, 13.54f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 139.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 139.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baby = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
