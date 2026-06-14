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

/* compiled from: Stackoverflowlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StackOverflowLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStackOverflowLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stackOverflowLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackoverflowlogoKt {
    private static ImageVector _stackOverflowLogo;

    public static final ImageVector getStackOverflowLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(214.0f, 152.09f);
        pathBuilder.lineTo(214.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(48.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f);
        pathBuilder.lineTo(42.0f, 152.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(54.0f, 210.0f);
        pathBuilder.lineTo(202.0f, 210.0f);
        pathBuilder.lineTo(202.0f, 152.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 182.09f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f);
        pathBuilder.lineTo(88.0f, 170.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(93.4f, 129.16f);
        pathBuilder.lineTo(170.67f, 149.83f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 3.11f, -11.57f);
        pathBuilder.lineTo(96.5f, 117.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.1f, 11.58f);
        pathBuilder.close();
        pathBuilder.moveTo(112.33f, 79.42f);
        pathBuilder.lineTo(181.61f, 119.42f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, false, 3.0f, 0.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -11.18f);
        pathBuilder.lineTo(118.33f, 69.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 10.38f);
        pathBuilder.close();
        pathBuilder.moveTo(200.08f, 92.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(152.0f, 27.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stackOverflowLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
