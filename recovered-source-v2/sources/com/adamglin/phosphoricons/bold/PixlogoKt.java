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

/* compiled from: Pixlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PixLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPixLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pixLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PixlogoKt {
    private static ImageVector _pixLogo;

    public static final ImageVector getPixLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(238.16f, 113.89f);
        pathBuilder.lineToRelative(-96.0f, -96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.22f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 96.05f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.22f);
        pathBuilder.lineToRelative(96.05f, 96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.22f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.22f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 37.68f);
        pathBuilder.lineTo(174.32f, 84.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f);
        pathBuilder.lineTo(128.0f, 111.0f);
        pathBuilder.lineTo(104.49f, 87.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 84.0f);
        pathBuilder.horizontalLineTo(81.68f);
        pathBuilder.close();
        pathBuilder.moveTo(57.68f, 108.0f);
        pathBuilder.horizontalLineTo(91.0f);
        pathBuilder.lineToRelative(20.0f, 20.0f);
        pathBuilder.lineTo(91.0f, 148.0f);
        pathBuilder.horizontalLineTo(57.68f);
        pathBuilder.lineToRelative(-20.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.32f);
        pathBuilder.lineTo(81.68f, 172.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f);
        pathBuilder.lineTo(128.0f, 145.0f);
        pathBuilder.lineToRelative(23.51f, 23.52f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(14.32f);
        pathBuilder.close();
        pathBuilder.moveTo(198.32f, 148.0f);
        pathBuilder.horizontalLineTo(165.0f);
        pathBuilder.lineToRelative(-20.0f, -20.0f);
        pathBuilder.lineToRelative(20.0f, -20.0f);
        pathBuilder.horizontalLineToRelative(33.35f);
        pathBuilder.lineToRelative(20.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pixLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
