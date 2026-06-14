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

/* compiled from: Circledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCircleDashed", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CircledashedKt {
    private static ImageVector _circleDashed;

    public static final ImageVector getCircleDashed(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _circleDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CircleDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(155.87f, 36.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, 3.0f);
        pathBuilder.arcToRelative(4.29f, 4.29f, 0.0f, false, true, -1.0f, -0.13f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, -46.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -7.74f);
        pathBuilder.arcToRelative(100.09f, 100.09f, 0.0f, false, true, 50.0f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 155.87f, 36.06f);
        pathBuilder.close();
        pathBuilder.moveTo(56.65f, 57.94f);
        pathBuilder.arcToRelative(100.18f, 100.18f, 0.0f, false, false, -25.0f, 43.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.71f, 2.14f);
        pathBuilder.arcToRelative(92.06f, 92.06f, 0.0f, false, true, 23.0f, -39.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.7f, -5.61f);
        pathBuilder.close();
        pathBuilder.moveTo(39.36f, 152.62f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.71f, 2.14f);
        pathBuilder.arcToRelative(100.08f, 100.08f, 0.0f, false, false, 25.0f, 43.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.71f, -5.61f);
        pathBuilder.arcTo(91.91f, 91.91f, 0.0f, false, true, 39.36f, 152.62f);
        pathBuilder.close();
        pathBuilder.moveTo(151.0f, 217.09f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 7.75f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, 50.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.0f, -7.74f);
        pathBuilder.close();
        pathBuilder.moveTo(221.58f, 149.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.92f, 2.79f);
        pathBuilder.arcToRelative(92.12f, 92.12f, 0.0f, false, true, -23.0f, 39.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.7f, 5.61f);
        pathBuilder.arcToRelative(100.18f, 100.18f, 0.0f, false, false, 25.0f, -43.29f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 221.58f, 149.84f);
        pathBuilder.close();
        pathBuilder.moveTo(216.64f, 103.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.71f, -2.14f);
        pathBuilder.arcToRelative(100.08f, 100.08f, 0.0f, false, false, -25.0f, -43.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.71f, 5.61f);
        pathBuilder.arcTo(91.91f, 91.91f, 0.0f, false, true, 216.64f, 103.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
