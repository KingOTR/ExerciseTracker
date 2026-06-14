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

/* compiled from: Pixlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PixLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPixLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pixLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PixlogoKt {
    private static ImageVector _pixLogo;

    public static final ImageVector getPixLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pixLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PixLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.5f, 119.55f);
        pathBuilder.lineToRelative(-96.05f, -96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 96.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 16.9f);
        pathBuilder.lineToRelative(96.05f, 96.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f);
        pathBuilder.lineToRelative(96.05f, -96.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.9f);
        pathBuilder.close();
        pathBuilder.moveTo(125.21f, 29.16f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, 5.58f, 0.0f);
        pathBuilder.lineTo(193.64f, 92.0f);
        pathBuilder.lineTo(160.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f);
        pathBuilder.lineTo(128.0f, 122.34f);
        pathBuilder.lineTo(98.83f, 93.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 92.0f);
        pathBuilder.lineTo(62.36f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 128.0f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.16f, -2.79f);
        pathBuilder.lineTo(54.36f, 100.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.lineToRelative(28.0f, 28.0f);
        pathBuilder.lineToRelative(-28.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(-40.0f);
        pathBuilder.lineToRelative(-25.2f, -25.21f);
        pathBuilder.arcTo(3.9f, 3.9f, 0.0f, false, true, 28.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(130.79f, 226.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.58f, 0.0f);
        pathBuilder.lineTo(62.36f, 164.0f);
        pathBuilder.lineTo(96.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f);
        pathBuilder.lineTo(128.0f, 133.66f);
        pathBuilder.lineToRelative(29.17f, 29.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(33.64f);
        pathBuilder.close();
        pathBuilder.moveTo(226.84f, 130.79f);
        pathBuilder.lineTo(201.64f, 156.0f);
        pathBuilder.horizontalLineToRelative(-40.0f);
        pathBuilder.lineToRelative(-28.0f, -28.0f);
        pathBuilder.lineToRelative(28.0f, -28.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.lineToRelative(25.2f, 25.21f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, 0.0f, 5.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pixLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
