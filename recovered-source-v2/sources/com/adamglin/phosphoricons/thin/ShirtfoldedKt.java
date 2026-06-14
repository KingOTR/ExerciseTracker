package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Shirtfolded.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShirtFolded", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShirtFolded", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shirtFolded", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShirtfoldedKt {
    private static ImageVector _shirtFolded;

    public static final ImageVector getShirtFolded(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 44.0f);
        pathBuilder.lineTo(177.66f, 44.0f);
        pathBuilder.lineTo(162.83f, 29.17f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 28.0f);
        pathBuilder.lineTo(96.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(78.34f, 44.0f);
        pathBuilder.lineTo(56.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f);
        pathBuilder.lineTo(44.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(200.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(212.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 72.79f);
        pathBuilder.lineTo(103.47f, 36.0f);
        pathBuilder.horizontalLineToRelative(49.06f);
        pathBuilder.close();
        pathBuilder.moveTo(160.62f, 38.28f);
        pathBuilder.lineTo(172.0f, 49.66f);
        pathBuilder.lineTo(172.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, 3.63f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, -4.21f, -0.51f);
        pathBuilder.lineToRelative(-32.2f, -27.82f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 49.66f);
        pathBuilder.lineTo(95.38f, 38.28f);
        pathBuilder.lineToRelative(27.33f, 41.0f);
        pathBuilder.lineToRelative(-32.17f, 27.8f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 208.0f);
        pathBuilder.lineTo(52.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(76.0f, 52.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(11.89f, 11.89f, 0.0f, false, false, 6.91f, 10.87f);
        pathBuilder.arcTo(12.08f, 12.08f, 0.0f, false, false, 88.0f, 116.0f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, 7.65f, -2.8f);
        pathBuilder.lineToRelative(0.06f, 0.0f);
        pathBuilder.lineTo(124.0f, 88.74f);
        pathBuilder.lineTo(124.0f, 212.0f);
        pathBuilder.lineTo(56.0f, 212.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(132.0f, 212.0f);
        pathBuilder.lineTo(132.0f, 88.74f);
        pathBuilder.lineToRelative(28.32f, 24.46f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 168.0f, 116.0f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.12f, -1.15f);
        pathBuilder.arcTo(11.89f, 11.89f, 0.0f, false, false, 180.0f, 104.0f);
        pathBuilder.lineTo(180.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shirtFolded = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
