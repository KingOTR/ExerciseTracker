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

/* compiled from: Checkfat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CheckFat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCheckFat", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_checkFat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckfatKt {
    private static ImageVector _checkFat;

    public static final ImageVector getCheckFat(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _checkFat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CheckFat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.15f, 65.46f);
        pathBuilder.lineToRelative(-0.07f, -0.08f);
        pathBuilder.lineTo(222.15f, 41.85f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.23f, -0.05f);
        pathBuilder.lineToRelative(-90.0f, 88.83f);
        pathBuilder.lineTo(70.06f, 97.78f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.21f, 0.08f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.26f);
        pathBuilder.lineToRelative(71.62f, 72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.lineTo(246.15f, 93.74f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 246.15f, 65.46f);
        pathBuilder.close();
        pathBuilder.moveTo(103.61f, 202.33f);
        pathBuilder.lineTo(37.64f, 136.0f);
        pathBuilder.lineTo(56.0f, 117.61f);
        pathBuilder.lineTo(95.65f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.78f, -0.08f);
        pathBuilder.lineTo(208.0f, 61.61f);
        pathBuilder.lineToRelative(18.32f, 18.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _checkFat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
