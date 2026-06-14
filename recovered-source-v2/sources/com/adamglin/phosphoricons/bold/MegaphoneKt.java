package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Megaphone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Megaphone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMegaphone", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphoneKt {
    private static ImageVector _megaphone;

    public static final ImageVector getMegaphone(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(252.0f, 120.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f);
        pathBuilder.horizontalLineTo(160.32f);
        pathBuilder.curveToRelative(-3.44f, -0.21f, -52.6f, -4.0f, -99.46f, -43.3f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 40.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(19.8f, 19.8f, 0.0f, false, false, 11.54f, 18.12f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 21.32f, -2.81f);
        pathBuilder.arcTo(192.92f, 192.92f, 0.0f, false, true, 144.0f, 174.47f);
        pathBuilder.verticalLineToRelative(26.2f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.9f, 16.64f);
        pathBuilder.arcToRelative(11.35f, 11.35f, 0.0f, false, false, 1.39f, 0.8f);
        pathBuilder.lineToRelative(14.44f, 7.06f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 198.37f, 213.0f);
        pathBuilder.lineToRelative(11.09f, -41.82f);
        pathBuilder.arcTo(52.07f, 52.07f, 0.0f, false, false, 252.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 191.63f);
        pathBuilder.verticalLineTo(48.4f);
        pathBuilder.curveToRelative(36.17f, 28.07f, 72.17f, 38.1f, 92.0f, 41.66f);
        pathBuilder.verticalLineTo(150.0f);
        pathBuilder.curveTo(124.17f, 153.52f, 88.17f, 163.55f, 52.0f, 191.63f);
        pathBuilder.close();
        pathBuilder.moveTo(176.39f, 202.2f);
        pathBuilder.lineTo(168.0f, 198.1f);
        pathBuilder.verticalLineTo(172.0f);
        pathBuilder.horizontalLineToRelative(16.4f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 148.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.verticalLineTo(92.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
