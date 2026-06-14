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

/* compiled from: Heartstraightbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartStraightBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeartStraightBreak", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartStraightBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartstraightbreakKt {
    private static ImageVector _heartStraightBreak;

    public static final ImageVector getHeartStraightBreak(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _heartStraightBreak;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartStraightBreak", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.62f, 58.38f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -79.16f, 0.0f);
        pathBuilder.lineTo(128.0f, 72.24f);
        pathBuilder.lineToRelative(-14.44f, -13.9f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -79.2f, 79.21f);
        pathBuilder.lineToRelative(89.37f, 90.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.55f, 0.0f);
        pathBuilder.lineToRelative(89.33f, -90.63f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 221.62f, 58.38f);
        pathBuilder.close();
        pathBuilder.moveTo(213.11f, 129.13f);
        pathBuilder.lineTo(128.0f, 215.45f);
        pathBuilder.lineTo(42.89f, 129.1f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.23f, -62.24f);
        pathBuilder.lineToRelative(0.08f, 0.08f);
        pathBuilder.lineToRelative(14.16f, 13.64f);
        pathBuilder.lineTo(107.85f, 91.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.08f, 8.56f);
        pathBuilder.lineTo(135.53f, 128.0f);
        pathBuilder.lineToRelative(-11.76f, 11.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.49f);
        pathBuilder.lineTo(120.58f, 96.06f);
        pathBuilder.lineToRelative(30.24f, -29.12f);
        pathBuilder.arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, -0.08f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 62.21f, 62.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartStraightBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
