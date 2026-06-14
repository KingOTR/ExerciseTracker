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

/* compiled from: Play.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Play", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPlay", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_play", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayKt {
    private static ImageVector _play;

    public static final ImageVector getPlay(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _play;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Play", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.36f, 116.19f);
        pathBuilder.lineTo(87.28f, 28.06f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.18f, -0.27f);
        pathBuilder.arcTo(13.69f, 13.69f, 0.0f, false, false, 66.0f, 39.87f);
        pathBuilder.lineTo(66.0f, 216.13f);
        pathBuilder.arcToRelative(13.69f, 13.69f, 0.0f, false, false, 7.1f, 12.08f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.18f, -0.27f);
        pathBuilder.lineToRelative(144.08f, -88.13f);
        pathBuilder.arcToRelative(13.82f, 13.82f, 0.0f, false, false, 0.0f, -23.62f);
        pathBuilder.close();
        pathBuilder.moveTo(225.1f, 129.57f);
        pathBuilder.lineTo(81.0f, 217.7f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.06f, 0.0f);
        pathBuilder.arcToRelative(1.78f, 1.78f, 0.0f, false, true, -1.0f, -1.61f);
        pathBuilder.lineTo(77.94f, 39.87f);
        pathBuilder.arcToRelative(1.78f, 1.78f, 0.0f, false, true, 1.0f, -1.61f);
        pathBuilder.arcTo(2.06f, 2.06f, 0.0f, false, true, 80.0f, 38.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.31f);
        pathBuilder.lineTo(225.1f, 126.43f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, 3.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _play = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
