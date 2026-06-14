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

/* compiled from: Highlightercircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighlighterCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHighlighterCircle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highlighterCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighlightercircleKt {
    private static ImageVector _highlighterCircle;

    public static final ImageVector getHighlighterCircle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(195.88f, 195.88f);
        pathBuilder.arcTo(95.7f, 95.7f, 0.0f, false, true, 168.0f, 215.29f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.lineTo(104.0f, 96.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(63.29f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, 107.88f, -19.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(201.54f, 54.46f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 210.0f);
        pathBuilder2.lineTo(96.0f, 152.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.verticalLineToRelative(58.0f);
        pathBuilder2.arcToRelative(88.33f, 88.33f, 0.0f, false, true, -64.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 136.0f);
        pathBuilder2.lineTo(112.0f, 136.0f);
        pathBuilder2.lineTo(112.0f, 100.94f);
        pathBuilder2.lineToRelative(32.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(190.22f, 190.22f);
        pathBuilder2.arcTo(88.09f, 88.09f, 0.0f, false, true, 176.0f, 201.77f);
        pathBuilder2.lineTo(176.0f, 152.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(160.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f);
        pathBuilder2.lineToRelative(-48.0f, 24.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 96.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(49.77f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 110.22f, -11.55f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highlighterCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
