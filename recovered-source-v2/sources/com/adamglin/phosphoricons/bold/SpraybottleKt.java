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

/* compiled from: Spraybottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SprayBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSprayBottle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sprayBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpraybottleKt {
    private static ImageVector _sprayBottle;

    public static final ImageVector getSprayBottle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _sprayBottle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SprayBottle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 32.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 83.82f, 84.0f);
        pathBuilder.horizontalLineTo(108.0f);
        pathBuilder.verticalLineToRelative(20.62f);
        pathBuilder.arcToRelative(19.92f, 19.92f, 0.0f, false, true, -7.51f, 15.62f);
        pathBuilder.lineTo(84.51f, 133.0f);
        pathBuilder.arcTo(43.8f, 43.8f, 0.0f, false, false, 68.0f, 167.38f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(211.47f);
        pathBuilder.arcTo(274.77f, 274.77f, 0.0f, false, false, 180.68f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 33.94f, 24.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 211.47f);
        pathBuilder.verticalLineTo(220.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.verticalLineTo(167.38f);
        pathBuilder.arcToRelative(19.92f, 19.92f, 0.0f, false, true, 7.51f, -15.62f);
        pathBuilder.lineToRelative(16.0f, -12.78f);
        pathBuilder.arcTo(43.8f, 43.8f, 0.0f, false, false, 132.0f, 104.62f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.horizontalLineToRelative(21.24f);
        pathBuilder.arcTo(250.93f, 250.93f, 0.0f, false, true, 188.0f, 211.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sprayBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
