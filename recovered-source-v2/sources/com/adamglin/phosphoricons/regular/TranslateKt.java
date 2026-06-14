package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Translate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Translate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTranslate", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_translate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(247.15f, 212.42f);
        pathBuilder.lineToRelative(-56.0f, -112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, 0.0f);
        pathBuilder.lineToRelative(-21.71f, 43.43f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 108.0f, 126.93f);
        pathBuilder.arcTo(103.65f, 103.65f, 0.0f, false, false, 135.69f, 64.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(87.63f);
        pathBuilder.arcTo(87.76f, 87.76f, 0.0f, false, true, 96.0f, 116.35f);
        pathBuilder.arcToRelative(87.74f, 87.74f, 0.0f, false, true, -19.0f, -31.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.08f, 5.34f);
        pathBuilder.arcTo(103.63f, 103.63f, 0.0f, false, false, 84.0f, 127.0f);
        pathBuilder.arcToRelative(87.55f, 87.55f, 0.0f, false, true, -52.0f, 17.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(103.46f, 103.46f, 0.0f, false, false, 64.0f, -22.08f);
        pathBuilder.arcToRelative(104.18f, 104.18f, 0.0f, false, false, 51.44f, 21.31f);
        pathBuilder.lineToRelative(-26.6f, 53.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.31f, 7.16f);
        pathBuilder.lineTo(148.94f, 192.0f);
        pathBuilder.horizontalLineToRelative(70.11f);
        pathBuilder.lineToRelative(13.79f, 27.58f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, -11.58f);
        pathBuilder.close();
        pathBuilder.moveTo(156.94f, 176.0f);
        pathBuilder.lineTo(184.0f, 121.89f);
        pathBuilder.lineTo(211.05f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _translate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
