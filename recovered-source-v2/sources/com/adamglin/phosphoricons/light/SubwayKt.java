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

/* compiled from: Subway.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Subway", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSubway", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_subway", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Subway", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 96.0f);
        pathBuilder.lineTo(222.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(210.0f, 96.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, -58.0f);
        pathBuilder.lineTo(104.0f, 38.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, false, 46.0f, 96.0f);
        pathBuilder.lineTo(46.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(34.0f, 96.0f);
        pathBuilder.arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, -70.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(70.08f, 70.08f, 0.0f, false, true, 222.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 96.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -20.33f, 21.93f);
        pathBuilder.lineToRelative(3.7f, 7.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.74f, 5.36f);
        pathBuilder.lineTo(148.29f, 190.0f);
        pathBuilder.lineTo(107.71f, 190.0f);
        pathBuilder.lineToRelative(-6.34f, 12.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f);
        pathBuilder.lineToRelative(3.7f, -7.39f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 74.0f, 168.0f);
        pathBuilder.lineTo(74.0f, 96.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 96.0f, 74.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 182.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 96.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.lineTo(170.0f, 96.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.lineTo(96.0f, 86.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 86.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.0f, 158.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(138.0f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 178.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineTo(106.0f, 158.0f);
        pathBuilder.lineTo(86.0f, 158.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 96.0f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 168.0f);
        pathBuilder.lineTo(170.0f, 158.0f);
        pathBuilder.lineTo(150.0f, 158.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 170.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _subway = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
