package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sticker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sticker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSticker", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sticker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StickerKt {
    private static ImageVector _sticker;

    public static final ImageVector getSticker(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _sticker;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sticker", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 136.0f);
        pathBuilder.curveToRelative(-8.0f, 24.0f, -56.0f, 72.0f, -80.0f, 80.0f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 32.0f);
        pathBuilder2.lineTo(88.0f, 32.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, false, 32.0f, 88.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(8.07f, 8.07f, 0.0f, false, false, 2.53f, -0.41f);
        pathBuilder2.curveToRelative(26.23f, -8.75f, 76.31f, -58.83f, 85.06f, -85.06f);
        pathBuilder2.arcTo(8.07f, 8.07f, 0.0f, false, false, 224.0f, 136.0f);
        pathBuilder2.lineTo(224.0f, 88.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, false, 168.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 168.0f);
        pathBuilder2.lineTo(48.0f, 88.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 88.0f, 48.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.lineTo(184.0f, 128.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(88.0f, 208.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 48.0f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 203.14f);
        pathBuilder2.lineTo(144.0f, 184.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f);
        pathBuilder2.horizontalLineToRelative(19.14f);
        pathBuilder2.curveTo(191.0f, 163.5f, 163.5f, 191.0f, 144.0f, 203.14f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sticker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
