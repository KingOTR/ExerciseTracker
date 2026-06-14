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

/* compiled from: Horse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Horse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHorse", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_horse", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorseKt {
    private static ImageVector _horse;

    public static final ImageVector getHorse(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _horse;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Horse", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(132.0f, 100.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 132.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 129.42f);
        pathBuilder.arcTo(100.29f, 100.29f, 0.0f, false, true, 130.0f, 228.0f);
        pathBuilder.lineToRelative(-2.09f, 0.0f);
        pathBuilder.arcToRelative(99.37f, 99.37f, 0.0f, false, true, -66.6f, -25.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f);
        pathBuilder.arcToRelative(89.08f, 89.08f, 0.0f, false, false, 24.09f, 15.39f);
        pathBuilder.lineToRelative(31.35f, -43.11f);
        pathBuilder.curveToRelative(-25.16f, -13.0f, -53.95f, -8.1f, -68.14f, -5.7f);
        pathBuilder.arcToRelative(27.85f, 27.85f, 0.0f, false, true, -27.43f, -11.22f);
        pathBuilder.curveToRelative(-0.05f, -0.07f, -0.1f, -0.14f, -0.14f, -0.21f);
        pathBuilder.lineToRelative(-13.79f, -22.0f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -0.5f, -3.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.79f, -2.5f);
        pathBuilder.lineTo(116.0f, 61.76f);
        pathBuilder.lineTo(116.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 129.42f);
        pathBuilder.close();
        pathBuilder.moveTo(193.52f, 63.42f);
        pathBuilder.arcTo(91.35f, 91.35f, 0.0f, false, false, 128.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(124.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.9f, 3.41f);
        pathBuilder.lineTo(21.53f, 129.29f);
        pathBuilder.lineToRelative(11.58f, 18.52f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.52f, 7.91f);
        pathBuilder.curveToRelative(15.68f, -2.66f, 48.08f, -8.13f, 76.39f, 8.25f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 43.0f, -44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 130.07f, 172.0f);
        pathBuilder.lineToRelative(-31.56f, 43.4f);
        pathBuilder.arcTo(94.54f, 94.54f, 0.0f, false, false, 129.86f, 220.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 193.51f, 63.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _horse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
