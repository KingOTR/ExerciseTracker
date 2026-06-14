package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Maptrifold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapTrifold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMapTrifold", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapTrifold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaptrifoldKt {
    private static ImageVector _mapTrifold;

    public static final ImageVector getMapTrifold(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _mapTrifold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapTrifold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.92f, 49.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f);
        pathBuilder.lineTo(160.93f, 63.52f);
        pathBuilder.lineTo(99.58f, 32.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.52f, -0.6f);
        pathBuilder.lineToRelative(-64.0f, 16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.lineTo(24.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.94f, 7.76f);
        pathBuilder.lineToRelative(61.13f, -15.28f);
        pathBuilder.lineToRelative(61.35f, 30.68f);
        pathBuilder.arcTo(8.15f, 8.15f, 0.0f, false, false, 160.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.94f, -0.24f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 200.0f);
        pathBuilder.lineTo(232.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 228.92f, 49.69f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.94f, 0.24f);
        pathBuilder.lineTo(40.0f, 189.75f);
        pathBuilder.lineTo(40.0f, 62.25f);
        pathBuilder.lineTo(95.07f, 48.48f);
        pathBuilder.lineToRelative(0.93f, 0.46f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 193.75f);
        pathBuilder.lineTo(160.93f, 207.52f);
        pathBuilder.lineTo(160.0f, 207.06f);
        pathBuilder.lineTo(160.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.94f, -0.23f);
        pathBuilder.lineTo(216.0f, 66.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapTrifold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
