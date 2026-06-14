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

/* compiled from: Pill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPill", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PillKt {
    private static ImageVector _pill;

    public static final ImageVector getPill(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(216.42f, 39.6f);
        pathBuilder.arcToRelative(53.26f, 53.26f, 0.0f, false, false, -75.32f, 0.0f);
        pathBuilder.lineTo(39.6f, 141.09f);
        pathBuilder.arcToRelative(53.26f, 53.26f, 0.0f, false, false, 75.32f, 75.31f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(216.43f, 114.91f);
        pathBuilder.arcTo(53.31f, 53.31f, 0.0f, false, false, 216.42f, 39.6f);
        pathBuilder.close();
        pathBuilder.moveTo(103.61f, 205.09f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(37.26f, 37.26f, 0.0f, false, true, -52.7f, -52.69f);
        pathBuilder.lineTo(96.0f, 107.31f);
        pathBuilder.lineTo(148.7f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.11f, 103.6f);
        pathBuilder.lineTo(160.0f, 148.69f);
        pathBuilder.lineTo(107.32f, 96.0f);
        pathBuilder.lineToRelative(45.1f, -45.09f);
        pathBuilder.arcToRelative(37.26f, 37.26f, 0.0f, false, true, 52.69f, 52.69f);
        pathBuilder.close();
        pathBuilder.moveTo(189.68f, 82.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.32f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 189.68f, 82.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
