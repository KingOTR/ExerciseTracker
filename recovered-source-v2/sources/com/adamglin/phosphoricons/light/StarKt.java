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

/* compiled from: Star.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_star", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Star", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.28f, 97.87f);
        pathBuilder.arcTo(14.18f, 14.18f, 0.0f, false, false, 224.76f, 88.0f);
        pathBuilder.lineToRelative(-60.25f, -4.87f);
        pathBuilder.lineToRelative(-23.22f, -56.2f);
        pathBuilder.arcToRelative(14.37f, 14.37f, 0.0f, false, false, -26.58f, 0.0f);
        pathBuilder.lineTo(91.49f, 83.11f);
        pathBuilder.lineTo(31.24f, 88.0f);
        pathBuilder.arcToRelative(14.18f, 14.18f, 0.0f, false, false, -12.52f, 9.89f);
        pathBuilder.arcTo(14.43f, 14.43f, 0.0f, false, false, 23.0f, 113.32f);
        pathBuilder.lineTo(69.0f, 152.93f);
        pathBuilder.lineToRelative(-14.0f, 59.25f);
        pathBuilder.arcToRelative(14.4f, 14.4f, 0.0f, false, false, 5.59f, 15.0f);
        pathBuilder.arcToRelative(14.1f, 14.1f, 0.0f, false, false, 15.91f, 0.6f);
        pathBuilder.lineTo(128.0f, 196.12f);
        pathBuilder.lineToRelative(51.58f, 31.71f);
        pathBuilder.arcToRelative(14.1f, 14.1f, 0.0f, false, false, 15.91f, -0.6f);
        pathBuilder.arcToRelative(14.4f, 14.4f, 0.0f, false, false, 5.59f, -15.0f);
        pathBuilder.lineToRelative(-14.0f, -59.25f);
        pathBuilder.lineTo(233.0f, 113.32f);
        pathBuilder.arcTo(14.43f, 14.43f, 0.0f, false, false, 237.28f, 97.87f);
        pathBuilder.close();
        pathBuilder.moveTo(225.14f, 104.24f);
        pathBuilder.lineTo(176.45f, 146.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.92f, 5.92f);
        pathBuilder.lineToRelative(14.88f, 62.79f);
        pathBuilder.arcToRelative(2.35f, 2.35f, 0.0f, false, true, -0.95f, 2.57f);
        pathBuilder.arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.6f, 0.1f);
        pathBuilder.lineTo(131.14f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.28f, 0.0f);
        pathBuilder.lineTo(70.14f, 217.61f);
        pathBuilder.arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.6f, -0.1f);
        pathBuilder.arcToRelative(2.35f, 2.35f, 0.0f, false, true, -1.0f, -2.57f);
        pathBuilder.lineToRelative(14.88f, -62.79f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.92f, -5.92f);
        pathBuilder.lineToRelative(-48.69f, -42.0f);
        pathBuilder.arcToRelative(2.37f, 2.37f, 0.0f, false, true, -0.73f, -2.65f);
        pathBuilder.arcToRelative(2.28f, 2.28f, 0.0f, false, true, 2.07f, -1.65f);
        pathBuilder.lineToRelative(63.92f, -5.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -3.69f);
        pathBuilder.lineToRelative(24.63f, -59.6f);
        pathBuilder.arcToRelative(2.35f, 2.35f, 0.0f, false, true, 4.38f, 0.0f);
        pathBuilder.lineToRelative(24.63f, 59.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, 3.69f);
        pathBuilder.lineToRelative(63.92f, 5.16f);
        pathBuilder.arcToRelative(2.28f, 2.28f, 0.0f, false, true, 2.07f, 1.65f);
        pathBuilder.arcTo(2.37f, 2.37f, 0.0f, false, true, 225.14f, 104.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _star = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
