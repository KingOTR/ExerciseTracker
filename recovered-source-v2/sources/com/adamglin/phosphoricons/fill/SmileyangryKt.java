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

/* compiled from: Smileyangry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyAngry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSmileyAngry", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyAngry", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileyangryKt {
    private static ImageVector _smileyAngry;

    public static final ImageVector getSmileyAngry(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.66f, 188.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f);
        pathBuilder.curveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f);
        pathBuilder.curveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f);
        pathBuilder.reflectiveCurveToRelative(20.0f, 3.73f, 28.43f, 9.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 158.66f, 188.43f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.44f, 94.66f);
        pathBuilder.lineTo(132.44f, 126.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.88f, 0.0f);
        pathBuilder.lineToRelative(-48.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.88f, -13.32f);
        pathBuilder.lineTo(128.0f, 110.39f);
        pathBuilder.lineToRelative(43.56f, -29.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 13.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyAngry = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
