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

/* compiled from: Beachball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeachBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBeachBall", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beachBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeachballKt {
    private static ImageVector _beachBall;

    public static final ImageVector getBeachBall(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.14f, 101.64f);
        pathBuilder.arcTo(195.13f, 195.13f, 0.0f, false, false, 165.0f, 91.0f);
        pathBuilder.arcToRelative(195.13f, 195.13f, 0.0f, false, false, -10.68f, -51.1f);
        pathBuilder.arcTo(92.33f, 92.33f, 0.0f, false, true, 216.14f, 101.64f);
        pathBuilder.close();
        pathBuilder.moveTo(145.0f, 37.58f);
        pathBuilder.arcTo(187.54f, 187.54f, 0.0f, false, true, 156.3f, 83.26f);
        pathBuilder.arcTo(196.37f, 196.37f, 0.0f, false, false, 89.67f, 44.38f);
        pathBuilder.arcTo(91.34f, 91.34f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.arcTo(92.41f, 92.41f, 0.0f, false, true, 145.0f, 37.58f);
        pathBuilder.close();
        pathBuilder.moveTo(79.86f, 49.63f);
        pathBuilder.arcToRelative(188.08f, 188.08f, 0.0f, false, true, 72.45f, 40.82f);
        pathBuilder.arcTo(196.19f, 196.19f, 0.0f, false, false, 36.0f, 127.39f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 79.86f, 49.63f);
        pathBuilder.close();
        pathBuilder.moveTo(36.44f, 137.0f);
        pathBuilder.arcToRelative(188.17f, 188.17f, 0.0f, false, true, 121.0f, -38.48f);
        pathBuilder.arcToRelative(188.17f, 188.17f, 0.0f, false, true, -38.48f, 121.0f);
        pathBuilder.arcTo(92.17f, 92.17f, 0.0f, false, true, 36.44f, 137.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.61f, 220.0f);
        pathBuilder.arcToRelative(196.19f, 196.19f, 0.0f, false, false, 36.94f, -116.3f);
        pathBuilder.arcToRelative(188.08f, 188.08f, 0.0f, false, true, 40.82f, 72.45f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.61f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.61f, 166.34f);
        pathBuilder.arcTo(196.37f, 196.37f, 0.0f, false, false, 172.74f, 99.7f);
        pathBuilder.arcTo(187.54f, 187.54f, 0.0f, false, true, 218.42f, 111.0f);
        pathBuilder.arcTo(92.41f, 92.41f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.arcTo(91.34f, 91.34f, 0.0f, false, true, 211.62f, 166.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beachBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
