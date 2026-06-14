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

/* compiled from: Scooter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scooter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getScooter", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scooter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScooterKt {
    private static ImageVector _scooter;

    public static final ImageVector getScooter(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _scooter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scooter", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 132.0f);
        pathBuilder.lineToRelative(-0.68f, 0.0f);
        pathBuilder.lineTo(179.38f, 36.21f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 28.0f);
        pathBuilder.lineTo(136.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(23.35f);
        pathBuilder.lineToRelative(14.83f, 44.49f);
        pathBuilder.lineTo(114.59f, 164.0f);
        pathBuilder.lineTo(83.2f, 164.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -2.55f, 24.0f);
        pathBuilder.lineTo(120.0f, 188.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -4.06f);
        pathBuilder.lineToRelative(54.0f, -61.13f);
        pathBuilder.lineToRelative(5.6f, 16.81f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, true, false, 212.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 188.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 188.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scooter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
