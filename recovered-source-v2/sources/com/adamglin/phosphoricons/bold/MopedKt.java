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

/* compiled from: Moped.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moped", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMoped", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moped", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MopedKt {
    private static ImageVector _moped;

    public static final ImageVector getMoped(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _moped;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Moped", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 124.0f);
        pathBuilder.curveToRelative(-1.22f, 0.0f, -2.43f, 0.06f, -3.62f, 0.16f);
        pathBuilder.lineTo(175.24f, 35.79f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 28.0f);
        pathBuilder.lineTo(132.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(23.68f);
        pathBuilder.lineToRelative(30.23f, 80.6f);
        pathBuilder.arcTo(44.28f, 44.28f, 0.0f, false, false, 171.0f, 152.0f);
        pathBuilder.horizontalLineToRelative(-29.2f);
        pathBuilder.lineTo(119.24f, 91.79f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 84.0f);
        pathBuilder.lineTo(28.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(2.92f);
        pathBuilder.arcTo(60.14f, 60.14f, 0.0f, false, false, 0.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(4.74f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 86.52f, 0.0f);
        pathBuilder.horizontalLineToRelative(65.48f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, false, 212.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 130.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -11.32f);
        pathBuilder.lineTo(56.0f, 108.0f);
        pathBuilder.lineTo(99.68f, 108.0f);
        pathBuilder.lineToRelative(16.5f, 44.0f);
        pathBuilder.lineTo(26.06f, 152.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 48.0f, 130.05f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 188.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.32f, -12.0f);
        pathBuilder.lineTo(78.32f, 176.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 188.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moped = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
