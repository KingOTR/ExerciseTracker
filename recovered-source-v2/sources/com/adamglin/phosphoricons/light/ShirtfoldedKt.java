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

/* compiled from: Shirtfolded.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShirtFolded", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShirtFolded", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shirtFolded", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShirtfoldedKt {
    private static ImageVector _shirtFolded;

    public static final ImageVector getShirtFolded(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shirtFolded;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShirtFolded", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 42.0f);
        pathBuilder.lineTo(178.48f, 42.0f);
        pathBuilder.lineTo(164.25f, 27.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 26.0f);
        pathBuilder.lineTo(96.0f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.25f, 1.76f);
        pathBuilder.lineTo(77.52f, 42.0f);
        pathBuilder.lineTo(56.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 56.0f);
        pathBuilder.lineTo(42.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(200.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(214.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 69.18f);
        pathBuilder.lineTo(107.21f, 38.0f);
        pathBuilder.horizontalLineToRelative(41.58f);
        pathBuilder.close();
        pathBuilder.moveTo(160.93f, 41.42f);
        pathBuilder.lineTo(170.0f, 50.49f);
        pathBuilder.lineTo(170.0f, 104.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.25f, 1.56f);
        pathBuilder.lineTo(135.93f, 78.92f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 50.49f);
        pathBuilder.lineToRelative(9.07f, -9.07f);
        pathBuilder.lineToRelative(25.0f, 37.5f);
        pathBuilder.lineTo(89.25f, 105.54f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 86.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 208.0f);
        pathBuilder.lineTo(54.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(74.0f, 54.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.arcToRelative(13.87f, 13.87f, 0.0f, false, false, 8.06f, 12.68f);
        pathBuilder.arcTo(14.11f, 14.11f, 0.0f, false, false, 88.0f, 118.0f);
        pathBuilder.arcTo(13.87f, 13.87f, 0.0f, false, false, 97.0f, 114.74f);
        pathBuilder.lineToRelative(0.08f, -0.07f);
        pathBuilder.lineToRelative(25.0f, -21.56f);
        pathBuilder.lineTo(122.08f, 210.0f);
        pathBuilder.lineTo(56.0f, 210.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(134.0f, 210.0f);
        pathBuilder.lineTo(134.0f, 93.11f);
        pathBuilder.lineToRelative(25.0f, 21.56f);
        pathBuilder.lineToRelative(0.08f, 0.07f);
        pathBuilder.arcTo(13.87f, 13.87f, 0.0f, false, false, 168.0f, 118.0f);
        pathBuilder.arcToRelative(14.08f, 14.08f, 0.0f, false, false, 6.0f, -1.35f);
        pathBuilder.arcTo(13.87f, 13.87f, 0.0f, false, false, 182.0f, 104.0f);
        pathBuilder.lineTo(182.0f, 54.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shirtFolded = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
