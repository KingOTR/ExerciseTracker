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

/* compiled from: Maptrifold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapTrifold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMapTrifold", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapTrifold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaptrifoldKt {
    private static ImageVector _mapTrifold;

    public static final ImageVector getMapTrifold(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(227.69f, 51.27f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.15f, -1.09f);
        pathBuilder.lineTo(160.7f, 65.64f);
        pathBuilder.lineToRelative(-62.0f, -31.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.14f, -0.45f);
        pathBuilder.lineToRelative(-64.0f, 16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 56.0f);
        pathBuilder.lineTo(26.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 5.82f);
        pathBuilder.lineTo(95.3f, 190.36f);
        pathBuilder.lineToRelative(62.0f, 31.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.14f, 0.45f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 200.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 227.69f, 51.27f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 49.71f);
        pathBuilder.lineToRelative(52.0f, 26.0f);
        pathBuilder.lineTo(154.0f, 206.29f);
        pathBuilder.lineToRelative(-52.0f, -26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 60.71f);
        pathBuilder.lineTo(90.0f, 47.71f);
        pathBuilder.lineTo(90.0f, 179.32f);
        pathBuilder.lineToRelative(-52.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 195.32f);
        pathBuilder.lineToRelative(-52.0f, 13.0f);
        pathBuilder.lineTo(166.0f, 76.68f);
        pathBuilder.lineToRelative(52.0f, -13.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapTrifold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
