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

/* compiled from: Wheelchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wheelchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWheelchair", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairKt {
    private static ImageVector _wheelchair;

    public static final ImageVector getWheelchair(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _wheelchair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wheelchair", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(255.14f, 187.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.6f, -6.68f);
        pathBuilder.lineToRelative(-9.75f, 3.9f);
        pathBuilder.lineToRelative(-27.06f, -54.13f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 124.0f);
        pathBuilder.horizontalLineTo(116.0f);
        pathBuilder.verticalLineTo(108.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(116.0f);
        pathBuilder.verticalLineTo(77.81f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.88f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, 88.35f, 106.57f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -21.57f, -10.52f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, true, 92.0f, 112.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(80.58f);
        pathBuilder.lineToRelative(28.68f, 57.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.19f, 5.77f);
        pathBuilder.lineToRelative(20.0f, -8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 255.14f, 187.54f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 36.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, true, true, 94.0f, 46.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 104.0f, 36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
