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

/* compiled from: Keyhole.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Keyhole", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getKeyhole", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_keyhole", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyholeKt {
    private static ImageVector _keyhole;

    public static final ImageVector getKeyhole(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _keyhole;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Keyhole", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f);
        pathBuilder.arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 112.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, -61.5f, 29.86f);
        pathBuilder.lineToRelative(-14.0f, 31.72f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.49f, -8.42f);
        pathBuilder.lineToRelative(-14.0f, -31.72f);
        pathBuilder.arcTo(38.16f, 38.16f, 0.0f, false, false, 166.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(141.0f, 134.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.49f, 7.61f);
        pathBuilder.lineTo(150.8f, 170.0f);
        pathBuilder.lineTo(105.2f, 170.0f);
        pathBuilder.lineToRelative(12.29f, -27.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.49f, -7.61f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _keyhole = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
