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

/* compiled from: Smileyangry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyAngry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSmileyAngry", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyAngry", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileyangryKt {
    private static ImageVector _smileyAngry;

    public static final ImageVector getSmileyAngry(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _smileyAngry;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileyAngry", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.78f, 84.67f);
        pathBuilder.lineTo(128.0f, 115.19f);
        pathBuilder.lineTo(82.22f, 84.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.44f, 6.66f);
        pathBuilder.lineToRelative(48.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, 0.0f);
        pathBuilder.lineToRelative(48.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.44f, -6.66f);
        pathBuilder.close();
        pathBuilder.moveTo(154.21f, 180.67f);
        pathBuilder.curveToRelative(-7.82f, -5.2f, -15.27f, -8.67f, -26.21f, -8.67f);
        pathBuilder.reflectiveCurveToRelative(-18.39f, 3.47f, -26.21f, 8.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.42f, 6.66f);
        pathBuilder.curveTo(113.2f, 182.69f, 119.0f, 180.0f, 128.0f, 180.0f);
        pathBuilder.reflectiveCurveToRelative(14.8f, 2.69f, 21.79f, 7.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.42f, -6.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyAngry = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
