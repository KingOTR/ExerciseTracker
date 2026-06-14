package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beachball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeachBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBeachBall", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beachBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeachballKt {
    private static ImageVector _beachBall;

    public static final ImageVector getBeachBall(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _beachBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BeachBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(161.23f, 93.36f);
        pathBuilder.arcToRelative(191.07f, 191.07f, 0.0f, false, false, -82.0f, -48.09f);
        pathBuilder.arcToRelative(96.4f, 96.4f, 0.0f, false, true, 68.68f, -11.2f);
        pathBuilder.arcTo(191.91f, 191.91f, 0.0f, false, true, 161.23f, 93.36f);
        pathBuilder.close();
        pathBuilder.moveTo(221.93f, 108.06f);
        pathBuilder.arcToRelative(192.2f, 192.2f, 0.0f, false, false, -59.29f, -13.29f);
        pathBuilder.arcToRelative(191.0f, 191.0f, 0.0f, false, true, 48.09f, 82.0f);
        pathBuilder.arcToRelative(96.37f, 96.37f, 0.0f, false, false, 11.2f, -68.67f);
        pathBuilder.close();
        pathBuilder.moveTo(32.27f, 135.19f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 88.54f, 88.54f);
        pathBuilder.arcToRelative(191.56f, 191.56f, 0.0f, false, false, 40.5f, -129.0f);
        pathBuilder.arcTo(191.61f, 191.61f, 0.0f, false, false, 32.27f, 135.19f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(209.7f, 95.3f);
        pathBuilder2.arcToRelative(199.77f, 199.77f, 0.0f, false, false, -40.94f, -8.06f);
        pathBuilder2.arcTo(199.77f, 199.77f, 0.0f, false, false, 160.7f, 46.3f);
        pathBuilder2.arcTo(88.57f, 88.57f, 0.0f, false, true, 209.7f, 95.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 128.0f);
        pathBuilder2.arcToRelative(87.83f, 87.83f, 0.0f, false, true, -4.28f, 27.12f);
        pathBuilder2.arcToRelative(200.28f, 200.28f, 0.0f, false, false, -29.16f, -49.93f);
        pathBuilder2.arcToRelative(183.12f, 183.12f, 0.0f, false, true, 32.31f, 8.75f);
        pathBuilder2.arcTo(88.14f, 88.14f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(142.06f, 41.13f);
        pathBuilder2.arcToRelative(183.12f, 183.12f, 0.0f, false, true, 8.75f, 32.31f);
        pathBuilder2.arcToRelative(200.28f, 200.28f, 0.0f, false, false, -49.93f, -29.16f);
        pathBuilder2.arcToRelative(88.05f, 88.05f, 0.0f, false, true, 41.18f, -3.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.44f, 54.0f);
        pathBuilder2.arcToRelative(183.88f, 183.88f, 0.0f, false, true, 61.25f, 32.64f);
        pathBuilder2.arcTo(200.21f, 200.21f, 0.0f, false, false, 40.41f, 119.5f);
        pathBuilder2.arcTo(88.11f, 88.11f, 0.0f, false, true, 80.44f, 54.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.67f, 138.86f);
        pathBuilder2.arcToRelative(184.08f, 184.08f, 0.0f, false, true, 112.88f, -36.41f);
        pathBuilder2.arcToRelative(184.08f, 184.08f, 0.0f, false, true, -36.41f, 112.88f);
        pathBuilder2.arcTo(88.18f, 88.18f, 0.0f, false, true, 40.67f, 138.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.5f, 215.59f);
        pathBuilder2.arcToRelative(200.21f, 200.21f, 0.0f, false, false, 32.87f, -101.28f);
        pathBuilder2.arcTo(183.88f, 183.88f, 0.0f, false, true, 202.0f, 175.56f);
        pathBuilder2.arcTo(88.11f, 88.11f, 0.0f, false, true, 136.5f, 215.59f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beachBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
