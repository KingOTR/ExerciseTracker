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

/* compiled from: Notsubsetof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NotSubsetOf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getNotSubsetOf", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_notSubsetOf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotsubsetofKt {
    private static ImageVector _notSubsetOf;

    public static final ImageVector getNotSubsetOf(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _notSubsetOf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NotSubsetOf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.07f, 31.12f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.95f, 0.81f);
        pathBuilder.lineTo(195.42f, 36.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcTo(91.95f, 91.95f, 0.0f, false, false, 57.8f, 187.39f);
        pathBuilder.lineTo(39.12f, 207.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f);
        pathBuilder.lineToRelative(18.67f, -20.53f);
        pathBuilder.arcTo(91.48f, 91.48f, 0.0f, false, false, 128.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcToRelative(67.51f, 67.51f, 0.0f, false, true, -36.12f, -10.43f);
        pathBuilder.lineToRelative(125.0f, -137.5f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.07f, 31.12f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 128.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f);
        pathBuilder.horizontalLineToRelative(45.6f);
        pathBuilder.lineTo(74.13f, 169.42f);
        pathBuilder.arcTo(67.62f, 67.62f, 0.0f, false, true, 60.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _notSubsetOf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
