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

/* compiled from: Play.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Play", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPlay", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_play", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayKt {
    private static ImageVector _play;

    public static final ImageVector getPlay(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(230.32f, 117.9f);
        pathBuilder.lineTo(86.24f, 29.79f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, false, -12.17f, -0.23f);
        pathBuilder.arcTo(11.71f, 11.71f, 0.0f, false, false, 68.0f, 39.89f);
        pathBuilder.lineTo(68.0f, 216.11f);
        pathBuilder.arcToRelative(11.71f, 11.71f, 0.0f, false, false, 6.07f, 10.33f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, false, 12.17f, -0.23f);
        pathBuilder.lineTo(230.32f, 138.1f);
        pathBuilder.arcToRelative(11.82f, 11.82f, 0.0f, false, false, 0.0f, -20.2f);
        pathBuilder.close();
        pathBuilder.moveTo(226.14f, 131.27f);
        pathBuilder.lineTo(82.06f, 219.39f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.07f, 0.07f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, -2.0f, -3.35f);
        pathBuilder.lineTo(75.99f, 39.89f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.0f, -3.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.07f, 0.07f);
        pathBuilder.lineToRelative(144.08f, 88.12f);
        pathBuilder.arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, 6.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _play = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
