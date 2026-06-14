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

/* compiled from: Syringe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Syringe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSyringe", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_syringe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SyringeKt {
    private static ImageVector _syringe;

    public static final ImageVector getSyringe(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _syringe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Syringe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.66f, 77.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineTo(208.0f, 59.25f);
        pathBuilder.lineTo(179.3f, 88.0f);
        pathBuilder.lineToRelative(34.35f, 34.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(196.0f, 127.27f);
        pathBuilder.lineToRelative(-84.0f, 84.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 100.65f, 216.0f);
        pathBuilder.horizontalLineTo(51.26f);
        pathBuilder.lineTo(29.6f, 237.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.72f, -0.43f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, true, 0.61f, -11.1f);
        pathBuilder.lineToRelative(21.45f, -21.46f);
        pathBuilder.verticalLineTo(155.28f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 44.63f, 144.0f);
        pathBuilder.lineToRelative(15.18f, -15.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineTo(94.3f, 157.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, -11.32f);
        pathBuilder.lineTo(76.78f, 117.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(28.84f, 28.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, -11.32f);
        pathBuilder.lineTo(104.79f, 89.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineToRelative(23.87f, -23.86f);
        pathBuilder.lineToRelative(-6.35f, -6.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.18f, -11.49f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, 11.37f, 0.41f);
        pathBuilder.lineTo(168.0f, 76.63f);
        pathBuilder.lineToRelative(28.69f, -28.7f);
        pathBuilder.lineTo(178.33f, 29.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.17f, -11.49f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, true, 11.38f, 0.41f);
        pathBuilder.lineToRelative(47.78f, 47.78f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 77.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _syringe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
