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

/* compiled from: Smileymelting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyMelting", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSmileyMelting", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyMelting", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileymeltingKt {
    private static ImageVector _smileyMelting;

    public static final ImageVector getSmileyMelting(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(95.63f, 95.63f, 0.0f, false, true, -24.44f, 64.0f);
        pathBuilder.horizontalLineTo(56.44f);
        pathBuilder.arcTo(95.67f, 95.67f, 0.0f, false, true, 32.0f, 126.06f);
        pathBuilder.curveTo(33.0f, 74.58f, 75.15f, 32.73f, 126.63f, 32.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 92.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(201.0f, 54.0f);
        pathBuilder2.arcTo(103.24f, 103.24f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(-1.49f);
        pathBuilder2.arcToRelative(104.0f, 104.0f, 0.0f, false, false, -76.0f, 173.32f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 62.4f, 186.67f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 131.19f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.93f, 10.66f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.0f, 54.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 168.0f);
        pathBuilder2.lineTo(136.0f, 168.0f);
        pathBuilder2.curveToRelative(-21.74f, 0.0f, -48.0f, -17.84f, -48.0f, -40.0f);
        pathBuilder2.arcToRelative(41.33f, 41.33f, 0.0f, false, true, 0.55f, -6.68f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, -2.64f);
        pathBuilder2.arcTo(56.9f, 56.9f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, 14.88f, 7.46f, 29.13f, 21.0f, 40.15f);
        pathBuilder2.curveTo(105.4f, 178.22f, 121.07f, 184.0f, 136.0f, 184.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(96.0f, 200.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyMelting = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
