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

/* compiled from: Envelopeopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EnvelopeOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEnvelopeOpen", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_envelopeOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvelopeopenKt {
    private static ImageVector _envelopeOpen;

    public static final ImageVector getEnvelopeOpen(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _envelopeOpen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EnvelopeOpen", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.66f, 86.0f);
        pathBuilder.lineToRelative(-96.0f, -64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.32f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 64.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 230.66f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.81f, 152.0f);
        pathBuilder.lineTo(44.0f, 184.31f);
        pathBuilder.verticalLineToRelative(-65.0f);
        pathBuilder.close();
        pathBuilder.moveTo(114.36f, 164.0f);
        pathBuilder.horizontalLineToRelative(27.28f);
        pathBuilder.lineTo(187.0f, 196.0f);
        pathBuilder.horizontalLineTo(69.05f);
        pathBuilder.close();
        pathBuilder.moveTo(166.19f, 152.0f);
        pathBuilder.lineTo(212.0f, 119.29f);
        pathBuilder.verticalLineToRelative(65.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 46.42f);
        pathBuilder.lineToRelative(74.86f, 49.91f);
        pathBuilder.lineTo(141.61f, 140.0f);
        pathBuilder.horizontalLineTo(114.39f);
        pathBuilder.lineTo(53.14f, 96.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _envelopeOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
