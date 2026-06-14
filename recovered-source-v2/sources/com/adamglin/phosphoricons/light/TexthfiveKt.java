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

/* compiled from: Texthfive.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextHFive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTextHFive", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textHFive", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TexthfiveKt {
    private static ImageVector _textHFive;

    public static final ImageVector getTextHFive(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _textHFive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextHFive", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 180.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, 34.0f);
        pathBuilder.arcToRelative(33.6f, 33.6f, 0.0f, false, true, -24.29f, -9.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.4f);
        pathBuilder.arcTo(21.65f, 21.65f, 0.0f, false, false, 212.0f, 202.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f);
        pathBuilder.arcToRelative(21.65f, 21.65f, 0.0f, false, false, -15.71f, 6.2f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 186.08f, 159.0f);
        pathBuilder.lineToRelative(8.0f, -48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.92f, -5.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(205.08f);
        pathBuilder.lineToRelative(-5.0f, 30.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 212.0f, 146.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 246.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(54.0f);
        pathBuilder.horizontalLineTo(46.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(122.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.verticalLineToRelative(54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 50.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textHFive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
