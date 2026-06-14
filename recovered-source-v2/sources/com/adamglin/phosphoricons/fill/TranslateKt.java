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

/* compiled from: Translate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTranslate", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_translate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(160.0f, 129.89f);
        pathBuilder.lineTo(175.06f, 160.0f);
        pathBuilder.horizontalLineTo(144.94f);
        pathBuilder.lineToRelative(6.36f, -12.7f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.16f, 188.42f);
        pathBuilder.lineToRelative(-40.0f, -80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 0.0f);
        pathBuilder.lineTo(139.66f, 134.8f);
        pathBuilder.arcToRelative(62.31f, 62.31f, 0.0f, false, true, -23.61f, -10.0f);
        pathBuilder.arcTo(79.61f, 79.61f, 0.0f, false, false, 135.6f, 80.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(63.48f);
        pathBuilder.arcToRelative(63.73f, 63.73f, 0.0f, false, true, -15.3f, 34.05f);
        pathBuilder.arcToRelative(65.93f, 65.93f, 0.0f, false, true, -9.0f, -13.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 7.12f);
        pathBuilder.arcToRelative(81.75f, 81.75f, 0.0f, false, false, 11.4f, 17.15f);
        pathBuilder.arcTo(63.62f, 63.62f, 0.0f, false, true, 56.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(79.56f, 79.56f, 0.0f, false, false, 48.11f, -16.13f);
        pathBuilder.arcToRelative(78.33f, 78.33f, 0.0f, false, false, 28.18f, 13.66f);
        pathBuilder.lineToRelative(-19.45f, 38.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, 7.16f);
        pathBuilder.lineTo(136.94f, 176.0f);
        pathBuilder.horizontalLineToRelative(46.12f);
        pathBuilder.lineToRelative(9.78f, 19.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.32f, -7.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _translate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
