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

/* compiled from: Totesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ToteSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getToteSimple", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_toteSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TotesimpleKt {
    private static ImageVector _toteSimple;

    public static final ImageVector getToteSimple(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _toteSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ToteSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.0f, 66.75f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, false, false, -15.0f, -6.75f);
        pathBuilder.lineTo(179.83f, 60.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 76.17f, 60.0f);
        pathBuilder.lineTo(32.08f, 60.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 12.14f, 82.35f);
        pathBuilder.lineToRelative(14.25f, 120.0f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 46.33f, 220.0f);
        pathBuilder.lineTo(209.67f, 220.0f);
        pathBuilder.arcToRelative(20.06f, 20.06f, 0.0f, false, false, 19.94f, -17.65f);
        pathBuilder.lineToRelative(14.25f, -120.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 239.0f, 66.75f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.71f, 24.0f);
        pathBuilder.lineTo(100.29f, 60.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.19f, 196.0f);
        pathBuilder.lineTo(49.81f, 196.0f);
        pathBuilder.lineTo(36.5f, 84.0f);
        pathBuilder.horizontalLineToRelative(183.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _toteSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
