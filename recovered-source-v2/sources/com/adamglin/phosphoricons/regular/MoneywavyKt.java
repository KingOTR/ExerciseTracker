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

/* compiled from: Moneywavy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MoneyWavy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMoneyWavy", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moneyWavy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoneywavyKt {
    private static ImageVector _moneyWavy;

    public static final ImageVector getMoneyWavy(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _moneyWavy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MoneyWavy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.24f, 60.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.75f, -0.4f);
        pathBuilder.curveToRelative(-42.93f, 21.0f, -73.59f, 11.16f, -106.0f, 0.78f);
        pathBuilder.curveToRelative(-34.0f, -10.89f, -69.25f, -22.14f, -117.95f, 1.64f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 69.24f);
        pathBuilder.lineTo(8.0f, 189.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.51f, 7.19f);
        pathBuilder.curveToRelative(42.93f, -21.0f, 73.59f, -11.16f, 106.05f, -0.78f);
        pathBuilder.curveToRelative(19.24f, 6.15f, 38.84f, 12.42f, 61.0f, 12.42f);
        pathBuilder.curveToRelative(17.09f, 0.0f, 35.73f, -3.72f, 56.91f, -14.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.49f, -7.18f);
        pathBuilder.lineTo(247.96f, 66.83f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 244.24f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 181.67f);
        pathBuilder.curveToRelative(-40.6f, 18.17f, -70.25f, 8.69f, -101.56f, -1.32f);
        pathBuilder.curveToRelative(-19.24f, -6.15f, -38.84f, -12.42f, -61.0f, -12.42f);
        pathBuilder.arcToRelative(122.0f, 122.0f, 0.0f, false, false, -45.4f, 9.0f);
        pathBuilder.lineTo(24.04f, 74.33f);
        pathBuilder.curveToRelative(40.6f, -18.17f, 70.25f, -8.69f, 101.56f, 1.32f);
        pathBuilder.reflectiveCurveTo(189.14f, 96.0f, 232.0f, 79.09f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 96.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 96.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 160.0f);
        pathBuilder.lineTo(200.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moneyWavy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
