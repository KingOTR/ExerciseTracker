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

/* compiled from: Percent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Percent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPercent", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_percent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Percent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.66f, 61.64f);
        pathBuilder.lineToRelative(-144.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineToRelative(144.0f, -144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f);
        pathBuilder.close();
        pathBuilder.moveTo(50.54f, 101.44f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 50.92f, -50.91f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -50.92f, 50.91f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, false, 90.14f, 61.84f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 180.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, -10.54f, -25.46f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(35.76f, 35.76f, 0.0f, false, true, 216.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 180.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -5.86f, 14.14f);
        pathBuilder.arcTo(19.87f, 19.87f, 0.0f, false, false, 200.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _percent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
