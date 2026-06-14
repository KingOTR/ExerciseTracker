package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Textaunderline.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextAUnderline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTextAUnderline", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textAUnderline", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextaunderlineKt {
    private static ImageVector _textAUnderline;

    public static final ImageVector getTextAUnderline(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _textAUnderline;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextAUnderline", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(61.45f, 173.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.0f, -2.88f);
        pathBuilder.lineTo(86.63f, 134.0f);
        pathBuilder.horizontalLineToRelative(82.74f);
        pathBuilder.lineToRelative(17.2f, 36.55f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 174.0f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, 2.55f, -0.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.88f, -8.0f);
        pathBuilder.lineToRelative(-64.0f, -136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.86f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 136.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 61.45f, 173.43f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 46.09f);
        pathBuilder.lineTo(163.72f, 122.0f);
        pathBuilder.horizontalLineTo(92.28f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textAUnderline = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
