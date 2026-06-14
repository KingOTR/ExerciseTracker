package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Smileymelting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyMelting", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSmileyMelting", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyMelting", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileymeltingKt {
    private static ImageVector _smileyMelting;

    public static final ImageVector getSmileyMelting(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _smileyMelting;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileyMelting", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.6f, 176.0f);
        pathBuilder.lineTo(220.24f, 176.0f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, true, false, -184.52f, 0.0f);
        pathBuilder.lineTo(20.4f, 176.0f);
        pathBuilder.arcTo(12.26f, 12.26f, 0.0f, false, false, 8.0f, 187.78f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 200.0f);
        pathBuilder.lineTo(80.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(72.16f, 216.0f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.0f, 6.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f);
        pathBuilder.lineTo(199.73f, 232.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, false, 8.25f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.53f);
        pathBuilder.lineTo(144.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(7.79f);
        pathBuilder.arcToRelative(8.28f, 8.28f, 0.0f, false, false, 8.15f, -7.05f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 184.0f);
        pathBuilder.lineTo(136.0f, 184.0f);
        pathBuilder.curveToRelative(-14.93f, 0.0f, -30.59f, -5.78f, -43.0f, -15.85f);
        pathBuilder.curveToRelative(-13.55f, -11.0f, -21.0f, -25.27f, -21.0f, -40.15f);
        pathBuilder.arcToRelative(57.0f, 57.0f, 0.0f, false, true, 0.71f, -9.0f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, true, 8.85f, -7.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 9.27f);
        pathBuilder.arcTo(41.33f, 41.33f, 0.0f, false, false, 88.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 22.16f, 26.26f, 40.0f, 48.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(15.44f);
        pathBuilder.curveToRelative(13.5f, 0.0f, 24.86f, 11.05f, 24.55f, 24.55f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.23f, 2.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.62f);
        pathBuilder.lineTo(236.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.22f);
        pathBuilder.arcTo(12.26f, 12.26f, 0.0f, false, false, 235.6f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.9f, 93.56f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 114.44f, 80.1f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 127.9f, 93.56f);
        pathBuilder.close();
        pathBuilder.moveTo(175.9f, 141.56f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.46f, -13.46f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 175.9f, 141.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyMelting = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
