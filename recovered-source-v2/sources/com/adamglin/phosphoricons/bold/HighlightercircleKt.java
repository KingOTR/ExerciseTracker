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

/* compiled from: Highlightercircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighlighterCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHighlighterCircle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highlighterCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighlightercircleKt {
    private static ImageVector _highlighterCircle;

    public static final ImageVector getHighlighterCircle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _highlighterCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HighlighterCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.37f, 51.59f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.11f, 108.11f, 0.0f, false, false, 204.37f, 51.59f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 136.0f);
        pathBuilder.lineTo(116.0f, 136.0f);
        pathBuilder.lineTo(116.0f, 111.39f);
        pathBuilder.lineToRelative(24.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 207.25f);
        pathBuilder.lineTo(100.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(47.25f);
        pathBuilder.arcToRelative(84.73f, 84.73f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.4f, 187.41f);
        pathBuilder.arcToRelative(84.53f, 84.53f, 0.0f, false, true, -7.4f, 6.55f);
        pathBuilder.lineTo(180.0f, 156.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -19.6f);
        pathBuilder.lineTo(164.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.37f, -10.73f);
        pathBuilder.lineToRelative(-48.0f, 24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 104.0f);
        pathBuilder.verticalLineToRelative(32.41f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 156.0f);
        pathBuilder.verticalLineToRelative(38.0f);
        pathBuilder.arcToRelative(84.53f, 84.53f, 0.0f, false, true, -7.4f, -6.55f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 118.8f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highlighterCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
