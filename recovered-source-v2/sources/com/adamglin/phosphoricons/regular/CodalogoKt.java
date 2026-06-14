package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Codalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCodaLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodalogoKt {
    private static ImageVector _codaLogo;

    public static final ImageVector getCodaLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _codaLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CodaLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 88.0f);
        pathBuilder.arcToRelative(39.79f, 39.79f, 0.0f, false, true, 21.53f, 6.1f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 84.0f);
        pathBuilder.lineTo(216.0f, 48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(56.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f);
        pathBuilder.lineTo(40.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(200.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.44f, -10.11f);
        pathBuilder.curveToRelative(-7.25f, 4.65f, -13.41f, 6.41f, -21.24f, 6.11f);
        pathBuilder.lineTo(176.0f, 168.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 128.0f);
        pathBuilder.arcToRelative(56.07f, 56.07f, 0.0f, false, false, 55.84f, 56.0f);
        pathBuilder.arcTo(48.37f, 48.37f, 0.0f, false, false, 200.0f, 178.89f);
        pathBuilder.lineTo(200.0f, 208.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.lineTo(56.0f, 48.0f);
        pathBuilder.lineTo(200.0f, 48.0f);
        pathBuilder.lineTo(200.0f, 77.23f);
        pathBuilder.arcTo(56.3f, 56.3f, 0.0f, false, false, 120.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
