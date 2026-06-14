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

/* compiled from: Scribble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scribble", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getScribble", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribble", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleKt {
    private static ImageVector _scribble;

    public static final ImageVector getScribble(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _scribble;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scribble", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(202.84f, 186.83f);
        pathBuilder.arcToRelative(18.61f, 18.61f, 0.0f, false, false, 0.0f, 26.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.arcToRelative(26.63f, 26.63f, 0.0f, false, true, 0.0f, -37.66f);
        pathBuilder.lineToRelative(9.38f, -9.37f);
        pathBuilder.arcToRelative(18.63f, 18.63f, 0.0f, true, false, -26.35f, -26.34f);
        pathBuilder.lineTo(113.45f, 212.2f);
        pathBuilder.arcToRelative(26.63f, 26.63f, 0.0f, false, true, -37.66f, -37.66f);
        pathBuilder.lineTo(174.55f, 75.8f);
        pathBuilder.arcTo(18.63f, 18.63f, 0.0f, true, false, 148.2f, 49.46f);
        pathBuilder.lineTo(81.45f, 116.2f);
        pathBuilder.arcTo(26.63f, 26.63f, 0.0f, false, true, 43.79f, 78.54f);
        pathBuilder.lineTo(85.17f, 37.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.65f, 5.66f);
        pathBuilder.lineTo(49.44f, 84.2f);
        pathBuilder.arcToRelative(18.63f, 18.63f, 0.0f, true, false, 26.35f, 26.34f);
        pathBuilder.lineTo(142.55f, 43.8f);
        pathBuilder.arcToRelative(26.63f, 26.63f, 0.0f, false, true, 37.66f, 37.66f);
        pathBuilder.lineTo(81.45f, 180.2f);
        pathBuilder.arcToRelative(18.63f, 18.63f, 0.0f, true, false, 26.35f, 26.34f);
        pathBuilder.lineToRelative(66.75f, -66.74f);
        pathBuilder.arcToRelative(26.63f, 26.63f, 0.0f, false, true, 37.66f, 37.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribble = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
