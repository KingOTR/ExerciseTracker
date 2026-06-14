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

/* compiled from: Knife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Knife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getKnife", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_knife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KnifeKt {
    private static ImageVector _knife;

    public static final ImageVector getKnife(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(230.46f, 33.55f);
        pathBuilder.arcToRelative(25.81f, 25.81f, 0.0f, false, false, -36.49f, 0.0f);
        pathBuilder.lineTo(19.76f, 207.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.89f, 10.09f);
        pathBuilder.arcTo(158.88f, 158.88f, 0.0f, false, false, 58.39f, 222.0f);
        pathBuilder.curveToRelative(32.57f, 0.0f, 65.17f, -10.1f, 95.87f, -29.91f);
        pathBuilder.curveToRelative(31.49f, -20.32f, 49.72f, -43.39f, 50.48f, -44.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.49f, -7.94f);
        pathBuilder.lineTo(182.49f, 118.0f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.arcTo(25.86f, 25.86f, 0.0f, false, false, 230.46f, 33.55f);
        pathBuilder.close();
        pathBuilder.moveTo(191.86f, 144.37f);
        pathBuilder.arcTo(221.0f, 221.0f, 0.0f, false, true, 147.75f, 182.0f);
        pathBuilder.curveTo(111.5f, 205.4f, 74.0f, 214.23f, 36.23f, 208.32f);
        pathBuilder.lineTo(146.0f, 98.5f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 61.56f);
        pathBuilder.lineToRelative(-48.0f, 48.0f);
        pathBuilder.lineTo(154.49f, 90.0f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.arcTo(13.81f, 13.81f, 0.0f, false, true, 222.0f, 61.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _knife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
