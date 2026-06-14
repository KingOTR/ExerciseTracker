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

/* compiled from: Hourglasssimplelow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HourglassSimpleLow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHourglassSimpleLow", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglassSimpleLow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglasssimplelowKt {
    private static ImageVector _hourglassSimpleLow;

    public static final ImageVector getHourglassSimpleLow(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hourglassSimpleLow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HourglassSimpleLow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.0f, 193.68f);
        pathBuilder.lineTo(145.35f, 128.0f);
        pathBuilder.lineTo(214.0f, 62.32f);
        pathBuilder.lineToRelative(0.18f, -0.18f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 41.87f, 62.14f);
        pathBuilder.lineToRelative(0.18f, 0.18f);
        pathBuilder.lineTo(110.65f, 128.0f);
        pathBuilder.lineToRelative(-68.6f, 65.68f);
        pathBuilder.lineToRelative(-0.18f, 0.18f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 228.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.14f, -34.14f);
        pathBuilder.close();
        pathBuilder.moveTo(148.25f, 164.0f);
        pathBuilder.horizontalLineToRelative(-40.5f);
        pathBuilder.lineTo(128.0f, 144.61f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 52.0f);
        pathBuilder.lineToRelative(-62.0f, 59.39f);
        pathBuilder.lineTo(66.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 204.0f);
        pathBuilder.lineToRelative(16.71f, -16.0f);
        pathBuilder.horizontalLineToRelative(90.62f);
        pathBuilder.lineTo(190.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglassSimpleLow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
