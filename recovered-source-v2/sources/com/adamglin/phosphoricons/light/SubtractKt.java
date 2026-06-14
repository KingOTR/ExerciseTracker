package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Subtract.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Subtract", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSubtract", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_subtract", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubtractKt {
    private static ImageVector _subtract;

    public static final ImageVector getSubtract(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _subtract;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Subtract", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.91f, 83.08f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.83f, 89.83f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.83f, -89.83f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 160.0f);
        pathBuilder.arcToRelative(65.31f, 65.31f, 0.0f, false, true, -0.62f, 8.9f);
        pathBuilder.lineToRelative(-53.76f, -53.77f);
        pathBuilder.arcTo(77.84f, 77.84f, 0.0f, false, false, 174.0f, 96.0f);
        pathBuilder.curveToRelative(0.0f, -0.17f, 0.0f, -0.34f, 0.0f, -0.51f);
        pathBuilder.arcTo(65.8f, 65.8f, 0.0f, false, true, 226.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.71f, 155.19f);
        pathBuilder.lineTo(202.21f, 210.69f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 182.52f, 222.0f);
        pathBuilder.lineToRelative(-54.8f, -54.81f);
        pathBuilder.arcTo(77.86f, 77.86f, 0.0f, false, false, 146.71f, 155.19f);
        pathBuilder.close();
        pathBuilder.moveTo(155.19f, 146.71f);
        pathBuilder.arcToRelative(77.86f, 77.86f, 0.0f, false, false, 12.0f, -19.0f);
        pathBuilder.lineTo(222.0f, 182.52f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, -11.35f, 19.69f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 96.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, true, 30.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(95.49f, 174.0f);
        pathBuilder.lineTo(96.0f, 174.0f);
        pathBuilder.arcToRelative(77.84f, 77.84f, 0.0f, false, false, 19.13f, -2.38f);
        pathBuilder.lineToRelative(53.77f, 53.76f);
        pathBuilder.arcTo(65.87f, 65.87f, 0.0f, false, true, 95.49f, 174.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _subtract = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
