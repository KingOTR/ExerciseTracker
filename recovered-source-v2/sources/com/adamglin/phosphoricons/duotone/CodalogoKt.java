package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Codalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCodaLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodalogoKt {
    private static ImageVector _codaLogo;

    public static final ImageVector getCodaLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 128.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f);
        pathBuilder.curveToRelative(10.27f, 0.41f, 17.9f, -2.25f, 25.88f, -7.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 172.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, 3.36f);
        pathBuilder.arcTo(48.24f, 48.24f, 0.0f, false, false, 128.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 88.0f);
        pathBuilder2.arcToRelative(39.79f, 39.79f, 0.0f, false, true, 21.53f, 6.1f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 84.0f);
        pathBuilder2.lineTo(216.0f, 48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(56.0f, 32.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f);
        pathBuilder2.lineTo(40.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(200.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 172.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.44f, -10.11f);
        pathBuilder2.curveToRelative(-7.25f, 4.65f, -13.41f, 6.41f, -21.24f, 6.11f);
        pathBuilder2.lineTo(176.0f, 168.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 128.0f);
        pathBuilder2.arcToRelative(56.07f, 56.07f, 0.0f, false, false, 55.84f, 56.0f);
        pathBuilder2.arcTo(48.4f, 48.4f, 0.0f, false, false, 200.0f, 178.89f);
        pathBuilder2.lineTo(200.0f, 208.0f);
        pathBuilder2.lineTo(56.0f, 208.0f);
        pathBuilder2.lineTo(56.0f, 48.0f);
        pathBuilder2.lineTo(200.0f, 48.0f);
        pathBuilder2.lineTo(200.0f, 77.23f);
        pathBuilder2.arcTo(56.3f, 56.3f, 0.0f, false, false, 120.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
