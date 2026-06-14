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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _twitterLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TwitterLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.66f, 77.66f);
        pathBuilder.lineToRelative(-29.9f, 29.9f);
        pathBuilder.curveTo(209.72f, 177.58f, 150.67f, 232.0f, 80.0f, 232.0f);
        pathBuilder.curveToRelative(-14.52f, 0.0f, -26.49f, -2.3f, -35.58f, -6.84f);
        pathBuilder.curveToRelative(-7.33f, -3.67f, -10.33f, -7.6f, -11.08f, -8.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.85f, -11.93f);
        pathBuilder.curveToRelative(0.26f, -0.1f, 24.24f, -9.31f, 39.47f, -26.84f);
        pathBuilder.arcToRelative(110.93f, 110.93f, 0.0f, false, true, -21.88f, -24.2f);
        pathBuilder.curveToRelative(-12.4f, -18.41f, -26.28f, -50.39f, -22.0f, -98.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.65f, -4.92f);
        pathBuilder.curveToRelative(0.35f, 0.35f, 33.28f, 33.1f, 73.54f, 43.72f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(47.87f, 47.87f, 0.0f, false, true, 14.36f, -34.3f);
        pathBuilder.arcTo(46.87f, 46.87f, 0.0f, false, true, 168.1f, 40.0f);
        pathBuilder.arcToRelative(48.66f, 48.66f, 0.0f, false, true, 41.47f, 24.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
