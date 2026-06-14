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

/* compiled from: Axe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Axe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAxe", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_axe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AxeKt {
    private static ImageVector _axe;

    public static final ImageVector getAxe(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _axe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Axe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(254.93f, 96.43f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 238.56f, 83.0f);
        pathBuilder.arcTo(122.0f, 122.0f, 0.0f, false, true, 198.7f, 70.54f);
        pathBuilder.lineToRelative(3.92f, -3.92f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, -45.26f);
        pathBuilder.lineToRelative(-6.69f, 6.69f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -30.15f, -2.21f);
        pathBuilder.lineTo(81.84f, 64.52f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.21f, 30.16f);
        pathBuilder.lineTo(9.36f, 169.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.25f, 45.26f);
        pathBuilder.lineToRelative(71.92f, -71.93f);
        pathBuilder.arcTo(122.0f, 122.0f, 0.0f, false, true, 139.0f, 182.57f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 11.58f);
        pathBuilder.lineTo(250.13f, 117.0f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 254.93f, 96.43f);
        pathBuilder.close();
        pathBuilder.moveTo(174.33f, 38.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f);
        pathBuilder.lineToRelative(-7.58f, 7.57f);
        pathBuilder.arcToRelative(135.65f, 135.65f, 0.0f, false, true, -11.94f, -10.68f);
        pathBuilder.close();
        pathBuilder.moveTo(37.64f, 197.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f);
        pathBuilder.lineToRelative(76.21f, -76.21f);
        pathBuilder.arcToRelative(135.65f, 135.65f, 0.0f, false, true, 10.68f, 11.94f);
        pathBuilder.close();
        pathBuilder.moveTo(161.52f, 171.67f);
        pathBuilder.curveToRelative(-9.0f, -48.5f, -39.27f, -78.44f, -59.38f, -93.47f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.curveToRelative(15.0f, 20.11f, 45.0f, 50.34f, 93.45f, 59.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _axe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
