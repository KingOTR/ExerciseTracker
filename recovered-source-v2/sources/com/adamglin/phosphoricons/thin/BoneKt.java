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

/* compiled from: Bone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBone", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoneKt {
    private static ImageVector _bone;

    public static final ImageVector getBone(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(228.6f, 63.46f);
        pathBuilder.arcTo(31.83f, 31.83f, 0.0f, false, false, 204.1f, 52.0f);
        pathBuilder.horizontalLineTo(204.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -59.17f, 17.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.51f, 5.0f);
        pathBuilder.lineTo(74.0f, 144.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, 0.51f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 51.9f, 204.0f);
        pathBuilder.horizontalLineTo(52.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 59.16f, -17.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.51f, -5.0f);
        pathBuilder.lineTo(182.0f, 111.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -0.51f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 228.6f, 63.46f);
        pathBuilder.close();
        pathBuilder.moveTo(222.1f, 99.8f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -30.8f, 4.55f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 176.37f, 106.0f);
        pathBuilder.lineTo(106.0f, 176.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.63f, 14.93f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -44.09f, 9.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.12f, -3.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, -1.17f);
        pathBuilder.arcToRelative(4.32f, 4.32f, 0.0f, false, false, -0.62f, 0.05f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 9.0f, -44.09f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 79.63f, 150.0f);
        pathBuilder.lineTo(150.0f, 79.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.63f, -14.93f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 44.09f, -9.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.57f, 4.57f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 222.1f, 99.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
