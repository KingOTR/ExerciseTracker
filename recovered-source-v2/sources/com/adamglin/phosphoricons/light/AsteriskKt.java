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

/* compiled from: Asterisk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Asterisk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAsterisk", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asterisk", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsteriskKt {
    private static ImageVector _asterisk;

    public static final ImageVector getAsterisk(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _asterisk;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Asterisk", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.14f, 179.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.23f, 2.06f);
        pathBuilder.lineTo(134.0f, 138.6f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(138.6f);
        pathBuilder.lineTo(51.09f, 181.15f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, true, 48.0f, 182.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.1f, -11.15f);
        pathBuilder.lineTo(116.34f, 128.0f);
        pathBuilder.lineTo(44.91f, 85.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.18f, -10.3f);
        pathBuilder.lineTo(122.0f, 117.4f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(77.4f);
        pathBuilder.lineToRelative(70.91f, -42.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.18f, 10.3f);
        pathBuilder.lineTo(139.66f, 128.0f);
        pathBuilder.lineToRelative(71.43f, 42.85f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 213.14f, 179.09f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asterisk = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
