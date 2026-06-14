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

/* compiled from: Sticker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sticker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSticker", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sticker", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StickerKt {
    private static ImageVector _sticker;

    public static final ImageVector getSticker(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(168.0f, 36.0f);
        pathBuilder.lineTo(88.0f, 36.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 36.0f, 88.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(3.83f, 3.83f, 0.0f, false, false, 1.26f, -0.21f);
        pathBuilder.curveToRelative(25.46f, -8.48f, 74.05f, -57.07f, 82.53f, -82.53f);
        pathBuilder.arcTo(3.83f, 3.83f, 0.0f, false, false, 220.0f, 136.0f);
        pathBuilder.lineTo(220.0f, 88.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 168.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 168.0f);
        pathBuilder.lineTo(44.0f, 88.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 88.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.lineTo(184.0f, 132.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(88.0f, 212.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 44.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 210.0f);
        pathBuilder.lineTo(140.0f, 184.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.curveTo(198.9f, 162.23f, 162.23f, 198.9f, 140.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sticker = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
