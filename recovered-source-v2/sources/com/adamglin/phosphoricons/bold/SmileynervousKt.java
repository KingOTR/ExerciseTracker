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

/* compiled from: Smileynervous.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyNervous", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSmileyNervous", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyNervous", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileynervousKt {
    private static ImageVector _smileyNervous;

    public static final ImageVector getSmileyNervous(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _smileyNervous;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileyNervous", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 108.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 108.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 148.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.92f, 172.94f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, 2.52f);
        pathBuilder.arcToRelative(38.18f, 38.18f, 0.0f, false, true, -7.74f, -8.26f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, -3.0f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, 3.0f);
        pathBuilder.curveTo(146.0f, 172.0f, 140.0f, 180.0f, 128.0f, 180.0f);
        pathBuilder.reflectiveCurveToRelative(-18.0f, -8.0f, -21.6f, -12.8f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, -3.0f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, -2.4f, 3.0f);
        pathBuilder.arcToRelative(38.18f, 38.18f, 0.0f, false, true, -7.74f, 8.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.27f, -19.3f);
        pathBuilder.arcToRelative(22.82f, 22.82f, 0.0f, false, false, 2.81f, -3.36f);
        pathBuilder.curveTo(86.0f, 148.0f, 92.0f, 140.0f, 104.0f, 140.0f);
        pathBuilder.reflectiveCurveToRelative(18.0f, 8.0f, 21.6f, 12.8f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, 2.4f, 3.0f);
        pathBuilder.arcToRelative(35.12f, 35.12f, 0.0f, false, false, 2.4f, -3.0f);
        pathBuilder.curveTo(134.0f, 148.0f, 140.0f, 140.0f, 152.0f, 140.0f);
        pathBuilder.reflectiveCurveToRelative(18.0f, 8.0f, 21.6f, 12.8f);
        pathBuilder.arcToRelative(22.82f, 22.82f, 0.0f, false, false, 2.81f, 3.36f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 178.92f, 172.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyNervous = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
