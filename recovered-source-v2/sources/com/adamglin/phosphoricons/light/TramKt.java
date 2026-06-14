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

/* compiled from: Tram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTram", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tram", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 50.0f);
        pathBuilder.lineTo(134.0f, 50.0f);
        pathBuilder.lineTo(134.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(88.0f, 10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.lineTo(122.0f, 50.0f);
        pathBuilder.lineTo(72.0f, 50.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 42.0f, 80.0f);
        pathBuilder.lineTo(42.0f, 184.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, 30.0f);
        pathBuilder.lineTo(84.0f, 214.0f);
        pathBuilder.lineTo(67.2f, 236.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.6f, 7.2f);
        pathBuilder.lineTo(99.0f, 214.0f);
        pathBuilder.horizontalLineToRelative(58.0f);
        pathBuilder.lineToRelative(22.2f, 29.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, -7.2f);
        pathBuilder.lineTo(172.0f, 214.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, -30.0f);
        pathBuilder.lineTo(214.0f, 80.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 184.0f, 50.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 62.0f);
        pathBuilder.lineTo(184.0f, 62.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(42.0f);
        pathBuilder.lineTo(54.0f, 122.0f);
        pathBuilder.lineTo(54.0f, 80.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 72.0f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 202.0f);
        pathBuilder.lineTo(72.0f, 202.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f);
        pathBuilder.lineTo(54.0f, 134.0f);
        pathBuilder.lineTo(202.0f, 134.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 184.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 172.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 172.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
