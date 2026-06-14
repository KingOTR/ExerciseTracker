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

/* compiled from: Megaphone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Megaphone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMegaphone", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphoneKt {
    private static ImageVector _megaphone;

    public static final ImageVector getMegaphone(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _megaphone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Megaphone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 120.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 240.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 120.0f);
        pathBuilder2.arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f);
        pathBuilder2.lineTo(160.2f, 72.0f);
        pathBuilder2.curveToRelative(-2.91f, -0.17f, -53.62f, -3.74f, -101.91f, -44.24f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 40.0f);
        pathBuilder2.lineTo(32.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.29f, 12.25f);
        pathBuilder2.curveToRelative(37.77f, -31.68f, 77.0f, -40.76f, 93.71f, -43.3f);
        pathBuilder2.verticalLineToRelative(31.72f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 159.12f, 214.0f);
        pathBuilder2.lineToRelative(11.0f, 7.33f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 194.5f, 212.0f);
        pathBuilder2.lineToRelative(11.77f, -44.36f);
        pathBuilder2.arcTo(48.07f, 48.07f, 0.0f, false, false, 248.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 199.93f);
        pathBuilder2.lineTo(48.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(42.81f, 35.91f, 86.63f, 45.0f, 104.0f, 47.24f);
        pathBuilder2.verticalLineToRelative(65.48f);
        pathBuilder2.curveTo(134.65f, 155.0f, 90.84f, 164.07f, 48.0f, 199.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(179.0f, 207.93f);
        pathBuilder2.lineTo(179.0f, 208.04f);
        pathBuilder2.lineTo(168.0f, 200.71f);
        pathBuilder2.lineTo(168.0f, 168.0f);
        pathBuilder2.horizontalLineToRelative(21.6f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 152.0f);
        pathBuilder2.lineTo(168.0f, 152.0f);
        pathBuilder2.lineTo(168.0f, 88.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
