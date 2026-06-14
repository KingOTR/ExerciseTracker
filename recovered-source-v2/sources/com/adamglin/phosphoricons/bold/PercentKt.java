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

/* compiled from: Percent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Percent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPercent", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_percent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(208.49f, 64.47f);
        pathBuilder.lineToRelative(-144.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(144.0f, -144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.72f, 104.27f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, true, true, 76.0f, 116.0f);
        pathBuilder.arcTo(39.72f, 39.72f, 0.0f, false, true, 47.72f, 104.27f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 76.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 4.69f, -11.31f);
        pathBuilder.arcTo(15.87f, 15.87f, 0.0f, false, false, 60.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 180.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -11.72f, -28.29f);
        pathBuilder.arcTo(39.71f, 39.71f, 0.0f, false, true, 220.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 180.0f);
        pathBuilder.arcToRelative(15.87f, 15.87f, 0.0f, false, false, -4.69f, -11.32f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, false, 196.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _percent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
