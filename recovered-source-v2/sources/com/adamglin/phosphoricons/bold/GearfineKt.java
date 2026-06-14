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

/* compiled from: Gearfine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearFine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGearFine", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearFine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearfineKt {
    private static ImageVector _gearFine;

    public static final ImageVector getGearFine(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _gearFine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GearFine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 116.0f);
        pathBuilder.lineTo(219.22f, 116.0f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 213.0f, 92.79f);
        pathBuilder.lineToRelative(11.08f, -6.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -20.78f);
        pathBuilder.lineTo(201.0f, 72.0f);
        pathBuilder.arcToRelative(92.85f, 92.85f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(6.41f, -11.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.78f, -12.0f);
        pathBuilder.lineTo(163.21f, 43.0f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 140.0f, 36.78f);
        pathBuilder.lineTo(140.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 36.78f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 92.79f, 43.0f);
        pathBuilder.lineToRelative(-6.4f, -11.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.78f, 12.0f);
        pathBuilder.lineTo(72.0f, 55.0f);
        pathBuilder.arcTo(92.85f, 92.85f, 0.0f, false, false, 55.0f, 72.0f);
        pathBuilder.lineTo(43.93f, 65.61f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 20.78f);
        pathBuilder.lineTo(43.0f, 92.79f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 36.78f, 116.0f);
        pathBuilder.lineTo(24.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(36.78f, 140.0f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 43.0f, 163.21f);
        pathBuilder.lineToRelative(-11.08f, 6.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 20.78f);
        pathBuilder.lineTo(55.0f, 184.0f);
        pathBuilder.arcToRelative(92.85f, 92.85f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(-6.41f, 11.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.78f, 12.0f);
        pathBuilder.lineTo(92.79f, 213.0f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 116.0f, 219.22f);
        pathBuilder.lineTo(116.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 219.22f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 163.21f, 213.0f);
        pathBuilder.lineToRelative(6.4f, 11.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.78f, -12.0f);
        pathBuilder.lineTo(184.0f, 201.0f);
        pathBuilder.arcToRelative(92.85f, 92.85f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineToRelative(11.11f, 6.41f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -20.78f);
        pathBuilder.lineTo(213.0f, 163.21f);
        pathBuilder.arcTo(91.1f, 91.1f, 0.0f, false, false, 219.22f, 140.0f);
        pathBuilder.lineTo(232.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 60.0f);
        pathBuilder.arcToRelative(68.1f, 68.1f, 0.0f, false, true, 66.92f, 56.0f);
        pathBuilder.horizontalLineToRelative(-60.0f);
        pathBuilder.lineToRelative(-30.0f, -52.0f);
        pathBuilder.arcTo(67.61f, 67.61f, 0.0f, false, true, 128.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 128.0f);
        pathBuilder.arcTo(67.9f, 67.9f, 0.0f, false, true, 84.16f, 76.07f);
        pathBuilder.lineToRelative(30.0f, 51.93f);
        pathBuilder.lineToRelative(-30.0f, 51.93f);
        pathBuilder.arcTo(67.9f, 67.9f, 0.0f, false, true, 60.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.arcToRelative(67.61f, 67.61f, 0.0f, false, true, -23.07f, -4.0f);
        pathBuilder.lineToRelative(30.0f, -52.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearFine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
