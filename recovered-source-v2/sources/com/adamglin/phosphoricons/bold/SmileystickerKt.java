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

/* compiled from: Smileysticker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileySticker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSmileySticker", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileySticker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileystickerKt {
    private static ImageVector _smileySticker;

    public static final ImageVector getSmileySticker(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _smileySticker;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileySticker", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, true, false, 31.74f, 211.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.0f, -3.0f);
        pathBuilder.lineToRelative(63.57f, -63.57f);
        pathBuilder.arcToRelative(12.05f, 12.05f, 0.0f, false, false, 3.0f, -5.0f);
        pathBuilder.arcTo(108.08f, 108.08f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.12f, 149.91f);
        pathBuilder.lineTo(149.92f, 209.11f);
        pathBuilder.arcToRelative(83.87f, 83.87f, 0.0f, true, true, 59.2f, -59.2f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 108.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 108.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.39f, 158.0f);
        pathBuilder.curveToRelative(-11.0f, 19.06f, -29.39f, 30.0f, -50.39f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-39.36f, -10.93f, -50.39f, -30.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.78f, -12.0f);
        pathBuilder.curveToRelative(3.89f, 6.73f, 12.91f, 18.0f, 29.61f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(25.72f, -11.28f, 29.61f, -18.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileySticker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
