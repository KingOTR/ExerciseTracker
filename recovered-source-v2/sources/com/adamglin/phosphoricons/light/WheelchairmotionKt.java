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

/* compiled from: Wheelchairmotion.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WheelchairMotion", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWheelchairMotion", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchairMotion", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairmotionKt {
    private static ImageVector _wheelchairMotion;

    public static final ImageVector getWheelchairMotion(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wheelchairMotion;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WheelchairMotion", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 78.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 176.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 30.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 168.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, true, true, -62.0f, -62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, true, false, 50.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.64f, 132.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.24f, 5.0f);
        pathBuilder.lineToRelative(-16.0f, 80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 184.0f, 222.0f);
        pathBuilder.arcToRelative(6.08f, 6.08f, 0.0f, false, true, -1.19f, -0.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.7f, -7.06f);
        pathBuilder.lineTo(192.68f, 142.0f);
        pathBuilder.lineTo(128.0f, 142.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, -9.0f);
        pathBuilder.lineToRelative(21.07f, -36.68f);
        pathBuilder.arcToRelative(82.05f, 82.05f, 0.0f, false, false, -92.05f, 8.41f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.64f, -9.25f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, true, 111.1f, -6.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.92f, 8.0f);
        pathBuilder.lineTo(138.37f, 130.0f);
        pathBuilder.lineTo(200.0f, 130.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 204.64f, 132.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchairMotion = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
