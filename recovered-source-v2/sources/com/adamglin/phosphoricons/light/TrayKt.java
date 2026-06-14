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

/* compiled from: Tray.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tray", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTray", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tray", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrayKt {
    private static ImageVector _tray;

    public static final ImageVector getTray(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tray;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tray", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 34.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 46.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineTo(154.0f);
        pathBuilder.horizontalLineTo(179.31f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, 4.1f);
        pathBuilder.lineTo(150.1f, 177.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f);
        pathBuilder.horizontalLineTo(107.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f);
        pathBuilder.lineTo(86.59f, 158.1f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f);
        pathBuilder.horizontalLineTo(46.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 210.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(166.0f);
        pathBuilder.horizontalLineTo(76.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f);
        pathBuilder.lineTo(97.41f, 185.9f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f);
        pathBuilder.horizontalLineToRelative(41.38f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f);
        pathBuilder.lineToRelative(19.31f, -19.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.59f);
        pathBuilder.horizontalLineTo(210.0f);
        pathBuilder.verticalLineToRelative(42.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tray = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
