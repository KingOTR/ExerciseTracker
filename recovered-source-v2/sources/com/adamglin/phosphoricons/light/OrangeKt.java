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

/* compiled from: Orange.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Orange", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getOrange", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_orange", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrangeKt {
    private static ImageVector _orange;

    public static final ImageVector getOrange(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _orange;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Orange", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(161.15f, 72.65f);
        pathBuilder.arcTo(62.08f, 62.08f, 0.0f, false, false, 198.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(62.08f, 62.08f, 0.0f, false, false, -56.0f, 35.42f);
        pathBuilder.arcTo(62.08f, 62.08f, 0.0f, false, false, 72.0f, 10.0f);
        pathBuilder.lineTo(64.0f, 10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(50.06f, 50.06f, 0.0f, false, true, 49.66f, 44.26f);
        pathBuilder.arcToRelative(85.95f, 85.95f, 0.0f, true, false, 39.49f, 6.39f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.64f);
        pathBuilder.arcTo(50.07f, 50.07f, 0.0f, false, true, 136.0f, 66.0f);
        pathBuilder.horizontalLineToRelative(-1.64f);
        pathBuilder.arcTo(50.07f, 50.07f, 0.0f, false, true, 184.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, -74.0f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 226.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.92f, 161.0f);
        pathBuilder.arcTo(55.48f, 55.48f, 0.0f, false, true, 137.0f, 205.92f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f);
        pathBuilder.arcTo(43.29f, 43.29f, 0.0f, false, false, 170.08f, 159.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _orange = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
