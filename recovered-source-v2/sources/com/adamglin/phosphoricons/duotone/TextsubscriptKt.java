package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Textsubscript.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextSubscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTextSubscript", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textSubscript", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextsubscriptKt {
    private static ImageVector _textSubscript;

    public static final ImageVector getTextSubscript(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _textSubscript;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TextSubscript", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 72.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineTo(192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f);
        pathBuilder2.lineToRelative(43.17f, -57.56f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.86f, -15.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f);
        pathBuilder2.arcToRelative(32.18f, 32.18f, 0.0f, false, true, 4.63f, -8.59f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 51.11f, 38.52f);
        pathBuilder2.lineTo(208.0f, 200.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(149.24f, 50.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.81f);
        pathBuilder2.lineTo(92.0f, 103.78f);
        pathBuilder2.lineToRelative(-45.95f, -53.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 34.0f, 61.24f);
        pathBuilder2.lineTo(81.41f, 116.0f);
        pathBuilder2.lineTo(34.0f, 170.76f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.1f, 10.48f);
        pathBuilder2.lineToRelative(46.0f, -53.0f);
        pathBuilder2.lineToRelative(45.95f, 53.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.1f, -10.48f);
        pathBuilder2.lineTo(102.59f, 116.0f);
        pathBuilder2.lineToRelative(47.46f, -54.76f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 149.24f, 50.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textSubscript = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
