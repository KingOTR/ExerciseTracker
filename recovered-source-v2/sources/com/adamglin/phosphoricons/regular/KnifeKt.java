package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Knife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Knife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getKnife", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_knife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KnifeKt {
    private static ImageVector _knife;

    public static final ImageVector getKnife(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(231.87f, 32.13f);
        pathBuilder.arcToRelative(27.84f, 27.84f, 0.0f, false, false, -39.32f, 0.0f);
        pathBuilder.lineTo(18.34f, 206.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.86f, 13.45f);
        pathBuilder.arcTo(160.67f, 160.67f, 0.0f, false, false, 58.4f, 224.0f);
        pathBuilder.curveToRelative(32.95f, 0.0f, 65.92f, -10.2f, 96.95f, -30.23f);
        pathBuilder.curveToRelative(31.76f, -20.5f, 50.19f, -43.82f, 51.0f, -44.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.64f, -10.59f);
        pathBuilder.lineTo(185.32f, 118.0f);
        pathBuilder.lineToRelative(46.55f, -46.56f);
        pathBuilder.arcTo(27.85f, 27.85f, 0.0f, false, false, 231.87f, 32.13f);
        pathBuilder.close();
        pathBuilder.moveTo(189.1f, 144.44f);
        pathBuilder.arcToRelative(220.41f, 220.41f, 0.0f, false, true, -42.86f, 36.16f);
        pathBuilder.curveToRelative(-34.43f, 22.1f, -69.94f, 30.92f, -105.77f, 26.3f);
        pathBuilder.lineTo(146.0f, 101.33f);
        pathBuilder.close();
        pathBuilder.moveTo(220.56f, 60.14f);
        pathBuilder.lineTo(174.0f, 106.7f);
        pathBuilder.lineTo(157.32f, 90.0f);
        pathBuilder.lineToRelative(46.55f, -46.56f);
        pathBuilder.arcToRelative(11.8f, 11.8f, 0.0f, false, true, 16.69f, 16.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _knife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
