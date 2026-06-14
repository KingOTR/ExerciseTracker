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

/* compiled from: Textsubscript.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextSubscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTextSubscript", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textSubscript", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextsubscriptKt {
    private static ImageVector _textSubscript;

    public static final ImageVector getTextSubscript(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(252.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f);
        pathBuilder.lineToRelative(43.17f, -57.56f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.35f, -16.82f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 204.68f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.63f, -8.0f);
        pathBuilder.arcToRelative(36.3f, 36.3f, 0.0f, false, true, 5.2f, -9.67f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 57.5f, 43.34f);
        pathBuilder.lineTo(216.0f, 196.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.86f, 46.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.93f, 1.21f);
        pathBuilder.lineTo(92.0f, 97.68f);
        pathBuilder.lineTo(49.07f, 48.14f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 30.93f, 63.86f);
        pathBuilder.lineTo(76.12f, 116.0f);
        pathBuilder.lineTo(30.93f, 168.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.14f, 15.72f);
        pathBuilder.lineTo(92.0f, 134.32f);
        pathBuilder.lineToRelative(42.93f, 49.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.14f, -15.72f);
        pathBuilder.lineTo(107.88f, 116.0f);
        pathBuilder.lineToRelative(45.19f, -52.14f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 151.86f, 46.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textSubscript = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
