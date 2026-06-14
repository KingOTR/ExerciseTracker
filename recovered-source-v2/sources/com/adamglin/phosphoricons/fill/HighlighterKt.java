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

/* compiled from: Highlighter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Highlighter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHighlighter", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highlighter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighlighterKt {
    private static ImageVector _highlighter;

    public static final ImageVector getHighlighter(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(253.66f, 106.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(192.0f, 156.69f);
        pathBuilder.lineTo(107.31f, 72.0f);
        pathBuilder.lineToRelative(50.35f, -50.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f);
        pathBuilder.lineTo(96.0f, 60.69f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 93.18f, 79.5f);
        pathBuilder.lineTo(72.0f, 100.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f);
        pathBuilder.lineTo(76.69f, 128.0f);
        pathBuilder.lineTo(18.34f, 186.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, 13.25f);
        pathBuilder.lineToRelative(72.0f, 24.0f);
        pathBuilder.arcTo(7.88f, 7.88f, 0.0f, false, false, 96.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f);
        pathBuilder.lineTo(136.0f, 187.31f);
        pathBuilder.lineToRelative(4.69f, 4.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f);
        pathBuilder.lineToRelative(21.18f, -21.18f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 203.31f, 168.0f);
        pathBuilder.lineToRelative(50.35f, -50.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 253.66f, 106.34f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 180.69f);
        pathBuilder.lineTo(83.31f, 112.0f);
        pathBuilder.lineTo(104.0f, 91.31f);
        pathBuilder.lineTo(172.69f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highlighter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
