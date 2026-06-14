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

/* compiled from: Stackoverflowlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StackOverflowLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStackOverflowLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stackOverflowLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackoverflowlogoKt {
    private static ImageVector _stackOverflowLogo;

    public static final ImageVector getStackOverflowLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 152.09f);
        pathBuilder.lineTo(212.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(48.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 152.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(52.0f, 212.0f);
        pathBuilder.lineTo(204.0f, 212.0f);
        pathBuilder.lineTo(204.0f, 152.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 180.09f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f);
        pathBuilder.lineTo(88.0f, 172.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(93.92f, 127.23f);
        pathBuilder.lineTo(171.19f, 147.9f);
        pathBuilder.arcToRelative(3.72f, 3.72f, 0.0f, false, false, 1.0f, 0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.85f);
        pathBuilder.lineTo(96.0f, 119.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.07f, 7.72f);
        pathBuilder.close();
        pathBuilder.moveTo(113.33f, 77.69f);
        pathBuilder.lineTo(182.61f, 117.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -6.92f);
        pathBuilder.lineTo(117.33f, 70.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f);
        pathBuilder.close();
        pathBuilder.moveTo(201.49f, 91.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.64f);
        pathBuilder.lineToRelative(-56.57f, -56.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stackOverflowLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
