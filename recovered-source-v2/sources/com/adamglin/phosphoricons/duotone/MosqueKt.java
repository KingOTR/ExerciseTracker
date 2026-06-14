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

/* compiled from: Mosque.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mosque", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMosque", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mosque", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mosque", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.curveToRelative(0.0f, -64.0f, 80.0f, -72.0f, 80.0f, -104.0f);
        pathBuilder.curveTo(128.0f, 56.0f, 208.0f, 64.0f, 208.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 128.0f);
        pathBuilder2.arcToRelative(23.84f, 23.84f, 0.0f, false, false, -8.0f, 1.38f);
        pathBuilder2.lineTo(216.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, -41.78f, -31.07f, -62.46f, -53.76f, -77.56f);
        pathBuilder2.curveTo(148.16f, 41.06f, 136.0f, 33.0f, 136.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 9.0f, -12.16f, 17.06f, -26.24f, 26.44f);
        pathBuilder2.curveTo(71.07f, 65.54f, 40.0f, 86.22f, 40.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(1.38f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, false, 8.0f, 152.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.lineTo(80.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(88.0f, 176.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(152.0f, 176.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(248.0f, 152.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 200.0f);
        pathBuilder2.lineTo(24.0f, 200.0f);
        pathBuilder2.lineTo(24.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(102.63f, 63.76f);
        pathBuilder2.curveToRelative(9.67f, -6.44f, 19.0f, -12.68f, 25.37f, -20.0f);
        pathBuilder2.curveToRelative(6.34f, 7.35f, 15.7f, 13.59f, 25.37f, 20.0f);
        pathBuilder2.curveToRelative(20.0f, 13.32f, 42.48f, 28.29f, 46.11f, 56.24f);
        pathBuilder2.horizontalLineToRelative(-143.0f);
        pathBuilder2.curveTo(60.15f, 92.05f, 82.6f, 77.08f, 102.63f, 63.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 200.0f);
        pathBuilder2.lineTo(184.0f, 200.0f);
        pathBuilder2.lineTo(184.0f, 176.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(120.0f, 200.0f);
        pathBuilder2.lineTo(120.0f, 176.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(56.0f, 200.0f);
        pathBuilder2.lineTo(56.0f, 136.0f);
        pathBuilder2.lineTo(200.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 200.0f);
        pathBuilder2.lineTo(216.0f, 200.0f);
        pathBuilder2.lineTo(216.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mosque = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
