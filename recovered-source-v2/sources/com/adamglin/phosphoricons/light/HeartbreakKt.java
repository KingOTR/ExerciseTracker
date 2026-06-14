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

/* compiled from: Heartbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeartBreak", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbreakKt {
    private static ImageVector _heartBreak;

    public static final ImageVector getHeartBreak(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _heartBreak;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartBreak", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.0f, 42.0f);
        pathBuilder.arcToRelative(59.63f, 59.63f, 0.0f, false, false, -42.43f, 17.57f);
        pathBuilder.lineTo(128.0f, 67.15f);
        pathBuilder.lineToRelative(-7.57f, -7.58f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 18.0f, 102.0f);
        pathBuilder.curveToRelative(0.0f, 29.2f, 18.2f, 59.59f, 54.1f, 90.31f);
        pathBuilder.arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, 37.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f);
        pathBuilder.arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, -37.0f);
        pathBuilder.curveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 178.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 217.11f);
        pathBuilder.curveTo(111.59f, 207.64f, 30.0f, 157.72f, 30.0f, 102.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 81.94f, -33.94f);
        pathBuilder.lineToRelative(7.57f, 7.57f);
        pathBuilder.lineTo(107.76f, 87.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.49f);
        pathBuilder.lineToRelative(25.94f, 25.94f);
        pathBuilder.lineToRelative(-17.94f, 17.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(22.19f, -22.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.49f);
        pathBuilder.lineTo(120.49f, 91.63f);
        pathBuilder.lineToRelative(23.57f, -23.57f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 226.0f, 102.0f);
        pathBuilder.curveTo(226.0f, 157.72f, 144.41f, 207.64f, 128.0f, 217.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
