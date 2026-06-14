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

/* compiled from: Translate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTranslate", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_translate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Translate", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.58f, 214.21f);
        pathBuilder.lineToRelative(-56.0f, -112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder.lineTo(157.55f, 148.0f);
        pathBuilder.arcTo(92.05f, 92.05f, 0.0f, false, true, 102.0f, 127.36f);
        pathBuilder.arcTo(99.68f, 99.68f, 0.0f, false, false, 131.91f, 60.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.horizontalLineTo(100.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineTo(52.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(91.91f);
        pathBuilder.arcTo(91.8f, 91.8f, 0.0f, false, true, 96.0f, 122.05f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 73.23f, 86.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.54f, 2.66f);
        pathBuilder.arcToRelative(99.59f, 99.59f, 0.0f, false, false, 24.3f, 38.0f);
        pathBuilder.arcTo(91.59f, 91.59f, 0.0f, false, true, 32.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.arcToRelative(99.54f, 99.54f, 0.0f, false, false, 64.0f, -23.21f);
        pathBuilder.arcToRelative(100.09f, 100.09f, 0.0f, false, false, 57.66f, 23.0f);
        pathBuilder.lineToRelative(-29.22f, 58.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.16f, 3.58f);
        pathBuilder.lineTo(146.47f, 188.0f);
        pathBuilder.horizontalLineToRelative(75.06f);
        pathBuilder.lineToRelative(14.89f, 29.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 220.0f);
        pathBuilder.arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 243.58f, 214.21f);
        pathBuilder.close();
        pathBuilder.moveTo(150.47f, 180.0f);
        pathBuilder.lineTo(184.0f, 112.94f);
        pathBuilder.lineTo(217.53f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _translate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
