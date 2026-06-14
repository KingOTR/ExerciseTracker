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

/* compiled from: Knife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Knife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getKnife", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_knife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KnifeKt {
    private static ImageVector _knife;

    public static final ImageVector getKnife(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _knife;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Knife", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 49.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, false, -42.63f, -17.66f);
        pathBuilder.lineTo(143.16f, 81.54f);
        pathBuilder.lineTo(18.34f, 206.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.86f, 13.45f);
        pathBuilder.arcTo(160.67f, 160.67f, 0.0f, false, false, 58.4f, 224.0f);
        pathBuilder.curveToRelative(32.95f, 0.0f, 65.91f, -10.2f, 96.94f, -30.23f);
        pathBuilder.curveToRelative(31.76f, -20.5f, 50.19f, -43.82f, 51.0f, -44.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.64f, -10.59f);
        pathBuilder.lineTo(181.31f, 114.0f);
        pathBuilder.lineToRelative(47.38f, -47.39f);
        pathBuilder.arcTo(24.84f, 24.84f, 0.0f, false, false, 236.0f, 49.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.23f, 180.6f);
        pathBuilder.curveToRelative(-34.43f, 22.1f, -69.94f, 30.92f, -105.76f, 26.3f);
        pathBuilder.lineTo(146.0f, 101.34f);
        pathBuilder.lineToRelative(43.09f, 43.1f);
        pathBuilder.arcTo(220.09f, 220.09f, 0.0f, false, true, 146.23f, 180.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _knife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
