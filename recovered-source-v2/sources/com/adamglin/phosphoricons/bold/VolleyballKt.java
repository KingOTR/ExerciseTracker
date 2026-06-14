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

/* compiled from: Volleyball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Volleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getVolleyball", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_volleyball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VolleyballKt {
    private static ImageVector _volleyball;

    public static final ImageVector getVolleyball(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.83f, 50.0f);
        pathBuilder.arcToRelative(83.49f, 83.49f, 0.0f, false, true, 17.92f, -5.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 161.26f, 116.0f);
        pathBuilder.lineTo(134.93f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.93f, 140.0f);
        pathBuilder.horizontalLineToRelative(76.2f);
        pathBuilder.arcToRelative(83.37f, 83.37f, 0.0f, false, true, -4.69f, 18.0f);
        pathBuilder.arcToRelative(84.07f, 84.07f, 0.0f, false, true, -84.68f, 4.79f);
        pathBuilder.close();
        pathBuilder.moveTo(211.13f, 116.0f);
        pathBuilder.lineTo(185.29f, 116.0f);
        pathBuilder.arcToRelative(107.43f, 107.43f, 0.0f, false, false, -14.4f, -49.71f);
        pathBuilder.arcTo(108.71f, 108.71f, 0.0f, false, false, 159.5f, 50.15f);
        pathBuilder.arcTo(84.21f, 84.21f, 0.0f, false, true, 211.13f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.07f, 62.05f);
        pathBuilder.lineTo(89.0f, 84.39f);
        pathBuilder.arcToRelative(107.44f, 107.44f, 0.0f, false, false, -35.85f, 37.32f);
        pathBuilder.arcToRelative(108.9f, 108.9f, 0.0f, false, false, -8.28f, 18.0f);
        pathBuilder.arcTo(83.65f, 83.65f, 0.0f, false, true, 76.07f, 62.05f);
        pathBuilder.close();
        pathBuilder.moveTo(62.79f, 180.87f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 101.0f, 105.2f);
        pathBuilder.lineTo(114.14f, 128.0f);
        pathBuilder.lineTo(76.07f, 194.0f);
        pathBuilder.arcTo(84.68f, 84.68f, 0.0f, false, true, 62.79f, 180.87f);
        pathBuilder.close();
        pathBuilder.moveTo(96.79f, 205.98f);
        pathBuilder.lineTo(109.71f, 183.61f);
        pathBuilder.arcTo(107.41f, 107.41f, 0.0f, false, false, 160.0f, 196.0f);
        pathBuilder.arcToRelative(109.0f, 109.0f, 0.0f, false, false, 19.59f, -1.78f);
        pathBuilder.arcTo(83.72f, 83.72f, 0.0f, false, true, 96.83f, 206.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _volleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
