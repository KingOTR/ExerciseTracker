package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stackoverflowlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StackOverflowLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getStackOverflowLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stackOverflowLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackoverflowlogoKt {
    private static ImageVector _stackOverflowLogo;

    public static final ImageVector getStackOverflowLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _stackOverflowLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StackOverflowLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 152.09f);
        pathBuilder.lineTo(216.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 152.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.lineTo(200.0f, 208.0f);
        pathBuilder.lineTo(200.0f, 152.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 184.09f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f);
        pathBuilder.lineTo(88.0f, 168.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.88f, 131.09f);
        pathBuilder.lineTo(170.15f, 151.77f);
        pathBuilder.arcToRelative(7.89f, 7.89f, 0.0f, false, false, 2.08f, 0.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.07f, -15.71f);
        pathBuilder.lineTo(97.0f, 115.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 92.88f, 131.0f);
        pathBuilder.close();
        pathBuilder.moveTo(111.33f, 81.16f);
        pathBuilder.lineTo(180.61f, 121.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.93f, -2.93f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.93f, -10.91f);
        pathBuilder.lineTo(119.33f, 67.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.84f);
        pathBuilder.close();
        pathBuilder.moveTo(198.66f, 94.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 210.0f, 82.84f);
        pathBuilder.lineToRelative(-56.57f, -56.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stackOverflowLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
