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

/* compiled from: Volleyball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Volleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getVolleyball", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_volleyball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VolleyballKt {
    private static ImageVector _volleyball;

    public static final ImageVector getVolleyball(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _volleyball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Volleyball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.63f, 120.0f);
        pathBuilder.lineTo(181.37f, 120.0f);
        pathBuilder.arcToRelative(104.18f, 104.18f, 0.0f, false, false, -35.78f, -78.23f);
        pathBuilder.arcTo(88.18f, 88.18f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.53f, 155.87f);
        pathBuilder.arcTo(87.95f, 87.95f, 0.0f, false, true, 77.27f, 56.13f);
        pathBuilder.lineTo(94.39f, 85.78f);
        pathBuilder.arcToRelative(104.14f, 104.14f, 0.0f, false, false, -49.86f, 70.09f);
        pathBuilder.close();
        pathBuilder.moveTo(58.9f, 182.43f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 43.49f, -82.79f);
        pathBuilder.lineTo(118.76f, 128.0f);
        pathBuilder.lineTo(77.27f, 199.87f);
        pathBuilder.arcTo(88.62f, 88.62f, 0.0f, false, true, 58.9f, 182.43f);
        pathBuilder.close();
        pathBuilder.moveTo(209.74f, 160.58f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -93.49f, 3.78f);
        pathBuilder.lineTo(132.62f, 136.0f);
        pathBuilder.horizontalLineToRelative(83.0f);
        pathBuilder.arcTo(87.16f, 87.16f, 0.0f, false, true, 209.74f, 160.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _volleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
