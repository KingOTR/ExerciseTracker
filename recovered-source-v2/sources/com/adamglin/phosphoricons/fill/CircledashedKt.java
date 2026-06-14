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

/* compiled from: Circledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCircleDashed", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CircledashedKt {
    private static ImageVector _circleDashed;

    public static final ImageVector getCircleDashed(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.59f, 69.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.29f, 0.7f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 17.6f, 30.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.08f);
        pathBuilder.arcToRelative(71.87f, 71.87f, 0.0f, false, false, -14.4f, -25.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 182.59f, 69.0f);
        pathBuilder.close();
        pathBuilder.moveTo(73.41f, 187.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.29f, -0.7f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -17.6f, -30.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 59.7f, 150.8f);
        pathBuilder.arcToRelative(71.87f, 71.87f, 0.0f, false, false, 14.4f, 24.95f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 73.41f, 187.05f);
        pathBuilder.close();
        pathBuilder.moveTo(74.1f, 80.25f);
        pathBuilder.arcToRelative(71.87f, 71.87f, 0.0f, false, false, -14.4f, 25.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.18f, -5.08f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 17.6f, -30.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.6f);
        pathBuilder.close();
        pathBuilder.moveTo(145.59f, 214.25f);
        pathBuilder.arcToRelative(87.8f, 87.8f, 0.0f, false, true, -35.18f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.18f, -15.68f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, false, 28.82f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.18f, 15.68f);
        pathBuilder.close();
        pathBuilder.moveTo(151.84f, 51.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 57.61f);
        pathBuilder.arcToRelative(7.89f, 7.89f, 0.0f, false, true, -1.6f, -0.16f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, false, -28.82f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.18f, -15.68f);
        pathBuilder.arcToRelative(87.92f, 87.92f, 0.0f, false, true, 35.18f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 151.84f, 51.2f);
        pathBuilder.close();
        pathBuilder.moveTo(211.48f, 155.93f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -17.6f, 30.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.6f);
        pathBuilder.arcToRelative(71.87f, 71.87f, 0.0f, false, false, 14.4f, -24.95f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, 5.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
