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

/* compiled from: Texthtwo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextHTwo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTextHTwo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textHTwo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TexthtwoKt {
    private static ImageVector _textHTwo;

    public static final ImageVector getTextHTwo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _textHTwo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextHTwo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(156.0f, 56.0f);
        pathBuilder.lineTo(156.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 128.0f);
        pathBuilder.lineTo(52.0f, 128.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(28.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.lineTo(132.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 196.0f);
        pathBuilder.lineTo(216.0f, 196.0f);
        pathBuilder.lineToRelative(28.74f, -38.33f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 182.05f, 124.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.63f, 8.0f);
        pathBuilder.arcToRelative(11.67f, 11.67f, 0.0f, false, true, 1.73f, -3.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 19.15f, 14.46f);
        pathBuilder.lineTo(182.4f, 200.8f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textHTwo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
