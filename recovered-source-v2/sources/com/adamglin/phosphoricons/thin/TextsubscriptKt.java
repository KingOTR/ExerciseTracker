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

/* compiled from: Textsubscript.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TextSubscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTextSubscript", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_textSubscript", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextsubscriptKt {
    private static ImageVector _textSubscript;

    public static final ImageVector getTextSubscript(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f);
        pathBuilder.lineTo(232.0f, 148.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 120.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 124.0f);
        pathBuilder.arcToRelative(20.23f, 20.23f, 0.0f, false, false, -2.89f, 5.37f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.55f, -2.66f);
        pathBuilder.arcToRelative(28.34f, 28.34f, 0.0f, false, true, 4.0f, -7.52f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 44.72f, 33.7f);
        pathBuilder.lineTo(200.0f, 204.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.62f, 53.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.64f, 0.4f);
        pathBuilder.lineTo(92.0f, 109.89f);
        pathBuilder.lineTo(43.0f, 53.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.24f);
        pathBuilder.lineTo(86.71f, 116.0f);
        pathBuilder.lineTo(37.0f, 173.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.0f, 5.24f);
        pathBuilder.lineToRelative(49.0f, -56.51f);
        pathBuilder.lineToRelative(49.0f, 56.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -5.24f);
        pathBuilder.lineTo(97.29f, 116.0f);
        pathBuilder.lineTo(147.0f, 58.62f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 146.62f, 53.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _textSubscript = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
