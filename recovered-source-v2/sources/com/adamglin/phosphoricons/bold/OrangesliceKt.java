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

/* compiled from: Orangeslice.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OrangeSlice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getOrangeSlice", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_orangeSlice", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrangesliceKt {
    private static ImageVector _orangeSlice;

    public static final ImageVector getOrangeSlice(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _orangeSlice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("OrangeSlice", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.0f, 76.0f);
        pathBuilder.lineTo(12.0f, 76.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 88.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(128.0f, 128.0f, 0.0f, false, false, 256.0f, 0.0f);
        pathBuilder.lineTo(256.0f, 88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.52f, 100.0f);
        pathBuilder.horizontalLineToRelative(42.69f);
        pathBuilder.lineTo(84.67f, 139.05f);
        pathBuilder.arcTo(63.87f, 63.87f, 0.0f, false, true, 64.52f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 112.0f);
        pathBuilder.lineToRelative(22.94f, 39.73f);
        pathBuilder.arcToRelative(63.76f, 63.76f, 0.0f, false, true, -45.88f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.33f, 139.05f);
        pathBuilder.lineTo(148.79f, 100.0f);
        pathBuilder.horizontalLineToRelative(42.69f);
        pathBuilder.arcTo(63.87f, 63.87f, 0.0f, false, true, 171.33f, 139.05f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.arcTo(104.15f, 104.15f, 0.0f, false, true, 24.3f, 100.0f);
        pathBuilder.lineTo(40.37f, 100.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 175.26f, 0.0f);
        pathBuilder.lineTo(231.7f, 100.0f);
        pathBuilder.arcTo(104.15f, 104.15f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _orangeSlice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
