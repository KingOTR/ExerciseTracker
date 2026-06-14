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

/* compiled from: Eyeclosed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEyeClosed", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeClosed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeclosedKt {
    private static ImageVector _eyeClosed;

    public static final ImageVector getEyeClosed(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eyeClosed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeClosed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.42f, 162.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 213.58f, 174.0f);
        pathBuilder.lineToRelative(-16.86f, -29.5f);
        pathBuilder.arcToRelative(127.19f, 127.19f, 0.0f, false, true, -30.17f, 13.86f);
        pathBuilder.lineTo(171.84f, 190.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.87f, 13.8f);
        pathBuilder.arcToRelative(11.22f, 11.22f, 0.0f, false, true, -2.0f, 0.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.82f, -10.0f);
        pathBuilder.lineTo(143.0f, 163.17f);
        pathBuilder.arcToRelative(136.5f, 136.5f, 0.0f, false, true, -30.06f, 0.0f);
        pathBuilder.lineTo(107.84f, 194.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 204.0f);
        pathBuilder.arcToRelative(11.22f, 11.22f, 0.0f, false, true, -2.0f, -0.17f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 84.16f, 190.0f);
        pathBuilder.lineToRelative(5.29f, -31.72f);
        pathBuilder.arcToRelative(127.19f, 127.19f, 0.0f, false, true, -30.17f, -13.86f);
        pathBuilder.lineTo(42.42f, 174.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 21.58f, 162.0f);
        pathBuilder.lineTo(40.0f, 129.85f);
        pathBuilder.arcToRelative(159.73f, 159.73f, 0.0f, false, true, -17.31f, -18.31f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 41.34f, 96.46f);
        pathBuilder.curveTo(57.38f, 116.32f, 85.44f, 140.0f, 128.0f, 140.0f);
        pathBuilder.reflectiveCurveToRelative(70.62f, -23.68f, 86.66f, -43.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.67f, 15.08f);
        pathBuilder.arcTo(159.73f, 159.73f, 0.0f, false, true, 216.0f, 129.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeClosed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
