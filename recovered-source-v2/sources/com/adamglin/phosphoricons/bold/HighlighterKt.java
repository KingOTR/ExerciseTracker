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

/* compiled from: Highlighter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Highlighter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHighlighter", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highlighter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighlighterKt {
    private static ImageVector _highlighter;

    public static final ImageVector getHighlighter(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _highlighter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Highlighter", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.49f, 107.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(192.0f, 151.0f);
        pathBuilder.lineTo(113.0f, 72.0f);
        pathBuilder.lineToRelative(43.52f, -43.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineTo(93.17f, 57.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -4.72f, 20.72f);
        pathBuilder.lineTo(69.17f, 97.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f);
        pathBuilder.lineTo(71.0f, 128.0f);
        pathBuilder.lineTo(15.51f, 183.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, 19.87f);
        pathBuilder.lineToRelative(72.0f, 24.0f);
        pathBuilder.arcTo(11.8f, 11.8f, 0.0f, false, false, 96.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.52f);
        pathBuilder.lineTo(136.0f, 193.0f);
        pathBuilder.lineToRelative(1.86f, 1.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(19.27f, -19.27f);
        pathBuilder.arcToRelative(20.27f, 20.27f, 0.0f, false, false, 6.59f, 1.13f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineToRelative(46.35f, -46.34f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 252.49f, 107.51f);
        pathBuilder.close();
        pathBuilder.moveTo(92.76f, 202.27f);
        pathBuilder.lineTo(46.21f, 186.76f);
        pathBuilder.lineTo(88.0f, 145.0f);
        pathBuilder.lineToRelative(31.0f, 31.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 175.0f);
        pathBuilder.lineTo(96.49f, 119.52f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(89.0f, 112.0f);
        pathBuilder.lineToRelative(15.0f, -15.0f);
        pathBuilder.lineToRelative(63.0f, 63.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highlighter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
