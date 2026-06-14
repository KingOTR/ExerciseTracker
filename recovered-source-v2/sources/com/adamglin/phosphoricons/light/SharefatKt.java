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

/* compiled from: Sharefat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShareFat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShareFat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shareFat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharefatKt {
    private static ImageVector _shareFat;

    public static final ImageVector getShareFat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shareFat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShareFat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.24f, 107.76f);
        pathBuilder.lineToRelative(-80.0f, -80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 32.0f);
        pathBuilder.verticalLineTo(74.2f);
        pathBuilder.curveToRelative(-54.48f, 3.59f, -120.39f, 55.0f, -127.93f, 120.66f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 17.23f, 8.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(46.56f, 190.85f, 87.0f, 152.6f, 146.0f, 150.13f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.24f, 4.24f);
        pathBuilder.lineToRelative(80.0f, -80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 107.76f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 177.52f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.curveToRelative(-27.73f, 0.0f, -54.76f, 7.25f, -80.32f, 21.55f);
        pathBuilder.arcToRelative(193.38f, 193.38f, 0.0f, false, false, -40.81f, 30.65f);
        pathBuilder.curveToRelative(4.7f, -26.56f, 20.16f, -52.0f, 44.0f, -72.27f);
        pathBuilder.curveTo(98.47f, 97.94f, 127.29f, 86.0f, 152.0f, 86.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.verticalLineTo(46.49f);
        pathBuilder.lineTo(223.51f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shareFat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
