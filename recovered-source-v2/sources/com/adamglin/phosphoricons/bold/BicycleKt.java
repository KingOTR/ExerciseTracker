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

/* compiled from: Bicycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bicycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBicycle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bicycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BicycleKt {
    private static ImageVector _bicycle;

    public static final ImageVector getBicycle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bicycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bicycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.0f, 108.0f);
        pathBuilder.arcToRelative(51.82f, 51.82f, 0.0f, false, false, -15.13f, 2.25f);
        pathBuilder.lineTo(168.89f, 76.0f);
        pathBuilder.lineTo(192.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f);
        pathBuilder.lineTo(148.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.37f, 18.0f);
        pathBuilder.lineToRelative(8.14f, 14.0f);
        pathBuilder.lineTo(109.56f, 84.0f);
        pathBuilder.lineTo(94.37f, 58.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 52.0f);
        pathBuilder.lineTo(52.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(77.11f, 76.0f);
        pathBuilder.lineTo(88.18f, 95.0f);
        pathBuilder.lineTo(74.0f, 112.89f);
        pathBuilder.arcToRelative(52.17f, 52.17f, 0.0f, true, false, 18.8f, 14.92f);
        pathBuilder.lineToRelative(8.37f, -10.57f);
        pathBuilder.lineTo(118.0f, 146.05f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 138.7f, 134.0f);
        pathBuilder.lineTo(123.56f, 108.0f);
        pathBuilder.horizontalLineToRelative(36.21f);
        pathBuilder.lineToRelative(8.39f, 14.38f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 204.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 160.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -21.71f, -27.28f);
        pathBuilder.lineToRelative(-15.7f, 19.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.82f, 14.9f);
        pathBuilder.lineToRelative(15.7f, -19.83f);
        pathBuilder.arcTo(27.84f, 27.84f, 0.0f, false, true, 80.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 188.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -23.11f, -43.79f);
        pathBuilder.lineToRelative(12.74f, 21.84f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 214.37f, 154.0f);
        pathBuilder.lineToRelative(-12.75f, -21.84f);
        pathBuilder.curveToRelative(0.79f, -0.07f, 1.58f, -0.11f, 2.38f, -0.11f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bicycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
