package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Megaphone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Megaphone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMegaphone", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphoneKt {
    private static ImageVector _megaphone;

    public static final ImageVector getMegaphone(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 72.0f);
        pathBuilder.horizontalLineTo(160.2f);
        pathBuilder.curveToRelative(-2.91f, -0.17f, -53.62f, -3.74f, -101.91f, -44.24f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 40.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.29f, 12.25f);
        pathBuilder.curveToRelative(37.77f, -31.68f, 77.0f, -40.76f, 93.71f, -43.3f);
        pathBuilder.verticalLineToRelative(31.72f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 159.12f, 214.0f);
        pathBuilder.lineToRelative(11.0f, 7.33f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 194.5f, 212.0f);
        pathBuilder.lineToRelative(11.77f, -44.36f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 200.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.0f, 207.89f);
        pathBuilder.lineToRelative(0.0f, 0.11f);
        pathBuilder.lineToRelative(-11.0f, -7.33f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.horizontalLineToRelative(21.6f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 152.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
