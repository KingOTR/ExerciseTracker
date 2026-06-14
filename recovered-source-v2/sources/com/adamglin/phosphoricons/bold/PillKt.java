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

/* compiled from: Pill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPill", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PillKt {
    private static ImageVector _pill;

    public static final ImageVector getPill(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pill", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.26f, 36.77f);
        pathBuilder.arcToRelative(57.28f, 57.28f, 0.0f, false, false, -81.0f, 0.0f);
        pathBuilder.lineTo(36.77f, 138.26f);
        pathBuilder.arcToRelative(57.26f, 57.26f, 0.0f, false, false, 81.0f, 81.0f);
        pathBuilder.lineTo(219.26f, 117.74f);
        pathBuilder.arcTo(57.33f, 57.33f, 0.0f, false, false, 219.26f, 36.77f);
        pathBuilder.close();
        pathBuilder.moveTo(100.78f, 202.26f);
        pathBuilder.arcToRelative(33.26f, 33.26f, 0.0f, true, true, -47.0f, -47.0f);
        pathBuilder.lineTo(96.0f, 113.0f);
        pathBuilder.lineToRelative(47.0f, 47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.28f, 100.77f);
        pathBuilder.lineTo(160.0f, 143.0f);
        pathBuilder.lineTo(113.0f, 96.0f);
        pathBuilder.lineToRelative(42.27f, -42.26f);
        pathBuilder.arcToRelative(33.26f, 33.26f, 0.0f, false, true, 47.0f, 47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.51f, 75.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.51f, 75.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
