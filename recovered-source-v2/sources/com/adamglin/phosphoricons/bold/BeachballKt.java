package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beachball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeachBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBeachBall", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beachBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeachballKt {
    private static ImageVector _beachBall;

    public static final ImageVector getBeachBall(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.arcToRelative(84.26f, 84.26f, 0.0f, false, true, -1.32f, 14.74f);
        pathBuilder.arcToRelative(204.79f, 204.79f, 0.0f, false, false, -18.52f, -31.49f);
        pathBuilder.arcToRelative(176.78f, 176.78f, 0.0f, false, true, 19.08f, 5.62f);
        pathBuilder.arcTo(85.0f, 85.0f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.39f, 89.06f);
        pathBuilder.arcToRelative(204.25f, 204.25f, 0.0f, false, false, -30.0f, -5.47f);
        pathBuilder.arcToRelative(204.25f, 204.25f, 0.0f, false, false, -5.47f, -30.0f);
        pathBuilder.arcTo(84.53f, 84.53f, 0.0f, false, true, 202.39f, 89.06f);
        pathBuilder.close();
        pathBuilder.moveTo(139.13f, 44.76f);
        pathBuilder.arcToRelative(176.78f, 176.78f, 0.0f, false, true, 5.62f, 19.08f);
        pathBuilder.arcToRelative(204.79f, 204.79f, 0.0f, false, false, -31.49f, -18.52f);
        pathBuilder.arcToRelative(82.49f, 82.49f, 0.0f, false, true, 25.87f, -0.56f);
        pathBuilder.close();
        pathBuilder.moveTo(81.07f, 58.36f);
        pathBuilder.arcToRelative(179.84f, 179.84f, 0.0f, false, true, 49.8f, 25.06f);
        pathBuilder.arcToRelative(204.19f, 204.19f, 0.0f, false, false, -85.23f, 28.05f);
        pathBuilder.arcTo(84.23f, 84.23f, 0.0f, false, true, 81.07f, 58.36f);
        pathBuilder.close();
        pathBuilder.moveTo(45.0f, 140.65f);
        pathBuilder.arcToRelative(180.19f, 180.19f, 0.0f, false, true, 104.62f, -34.22f);
        pathBuilder.arcToRelative(180.19f, 180.19f, 0.0f, false, true, -34.22f, 104.62f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, true, 45.0f, 140.65f);
        pathBuilder.close();
        pathBuilder.moveTo(144.58f, 210.36f);
        pathBuilder.arcToRelative(204.19f, 204.19f, 0.0f, false, false, 28.05f, -85.23f);
        pathBuilder.arcToRelative(179.84f, 179.84f, 0.0f, false, true, 25.06f, 49.8f);
        pathBuilder.arcTo(84.23f, 84.23f, 0.0f, false, true, 144.53f, 210.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beachBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
