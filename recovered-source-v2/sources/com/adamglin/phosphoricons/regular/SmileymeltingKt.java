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

/* compiled from: Smileymelting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyMelting", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSmileyMelting", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyMelting", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileymeltingKt {
    private static ImageVector _smileyMelting;

    public static final ImageVector getSmileyMelting(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _smileyMelting;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileyMelting", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(201.0f, 54.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 50.48f, 197.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 62.4f, 186.66f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 131.19f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.93f, 10.67f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 168.0f);
        pathBuilder.lineTo(136.0f, 168.0f);
        pathBuilder.curveToRelative(-21.74f, 0.0f, -48.0f, -17.84f, -48.0f, -40.0f);
        pathBuilder.arcToRelative(41.33f, 41.33f, 0.0f, false, true, 0.55f, -6.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, -2.64f);
        pathBuilder.arcTo(56.9f, 56.9f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 14.88f, 7.46f, 29.13f, 21.0f, 40.15f);
        pathBuilder.curveTo(105.4f, 178.22f, 121.07f, 184.0f, 136.0f, 184.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(96.0f, 200.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyMelting = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
