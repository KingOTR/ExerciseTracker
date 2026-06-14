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

/* compiled from: Bone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBone", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoneKt {
    private static ImageVector _bone;

    public static final ImageVector getBone(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.14f, 62.17f);
        pathBuilder.arcTo(33.88f, 33.88f, 0.0f, false, false, 206.0f, 50.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -62.81f, 20.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.23f, 2.54f);
        pathBuilder.lineTo(72.56f, 143.0f);
        pathBuilder.arcToRelative(2.06f, 2.06f, 0.0f, false, true, -2.55f, 0.23f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, true, false, 50.0f, 206.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, 62.81f, -20.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.23f, -2.54f);
        pathBuilder.lineToRelative(70.4f, -70.4f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.54f, -0.23f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 44.15f, -50.65f);
        pathBuilder.close();
        pathBuilder.moveTo(220.6f, 98.48f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -28.24f, 4.17f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -17.4f, 1.92f);
        pathBuilder.lineTo(104.57f, 175.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.92f, 17.4f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, -40.41f, 8.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.93f, -6.93f);
        pathBuilder.arcToRelative(7.28f, 7.28f, 0.0f, false, false, -0.93f, 0.07f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 8.26f, -40.41f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 81.0f, 151.43f);
        pathBuilder.lineTo(151.43f, 81.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.92f, -17.4f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 40.41f, -8.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.86f, 6.86f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 20.0f, 36.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
