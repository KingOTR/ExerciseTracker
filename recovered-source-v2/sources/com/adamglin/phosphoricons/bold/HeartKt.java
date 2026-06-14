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

/* compiled from: Heart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Heart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHeart", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartKt {
    private static ImageVector _heart;

    public static final ImageVector getHeart(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _heart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Heart", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.0f, 36.0f);
        pathBuilder.curveToRelative(-20.09f, 0.0f, -37.92f, 7.93f, -50.0f, 21.56f);
        pathBuilder.curveTo(115.92f, 43.93f, 98.09f, 36.0f, 78.0f, 36.0f);
        pathBuilder.arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, 66.0f);
        pathBuilder.curveToRelative(0.0f, 72.34f, 105.81f, 130.14f, 110.31f, 132.57f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f);
        pathBuilder.curveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, false, 178.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.51f, 178.36f);
        pathBuilder.arcTo(328.69f, 328.69f, 0.0f, false, true, 128.0f, 210.16f);
        pathBuilder.arcToRelative(328.69f, 328.69f, 0.0f, false, true, -44.51f, -31.8f);
        pathBuilder.curveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 78.0f, 60.0f);
        pathBuilder.curveToRelative(17.8f, 0.0f, 32.7f, 9.4f, 38.89f, 24.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.22f, 0.0f);
        pathBuilder.curveTo(145.3f, 69.4f, 160.2f, 60.0f, 178.0f, 60.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f);
        pathBuilder.curveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
