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

/* compiled from: Skipforward.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SkipForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSkipForward", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skipForward", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkipforwardKt {
    private static ImageVector _skipForward;

    public static final ImageVector getSkipForward(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _skipForward;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SkipForward", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(72.84f);
        pathBuilder.lineTo(71.37f, 36.14f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.21f, -0.37f);
        pathBuilder.arcTo(13.69f, 13.69f, 0.0f, false, false, 50.0f, 47.88f);
        pathBuilder.lineTo(50.0f, 208.12f);
        pathBuilder.arcToRelative(13.69f, 13.69f, 0.0f, false, false, 7.16f, 12.11f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.21f, -0.37f);
        pathBuilder.lineTo(194.0f, 143.17f);
        pathBuilder.lineTo(194.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(206.0f, 40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.12f, 129.56f);
        pathBuilder.lineTo(65.0f, 209.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 0.05f);
        pathBuilder.arcToRelative(1.79f, 1.79f, 0.0f, false, true, -1.0f, -1.62f);
        pathBuilder.lineTo(62.0f, 47.88f);
        pathBuilder.arcToRelative(1.79f, 1.79f, 0.0f, false, true, 1.0f, -1.62f);
        pathBuilder.arcTo(2.1f, 2.1f, 0.0f, false, true, 64.0f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.31f);
        pathBuilder.lineToRelative(128.12f, 80.13f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, 3.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skipForward = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
