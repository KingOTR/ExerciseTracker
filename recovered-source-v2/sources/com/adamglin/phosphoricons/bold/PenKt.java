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

/* compiled from: Pen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPen", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PenKt {
    private static ImageVector _pen;

    public static final ImageVector getPen(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pen", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.15f, 70.54f);
        pathBuilder.lineTo(185.46f, 25.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f);
        pathBuilder.lineTo(33.86f, 149.17f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(92.69f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineToRelative(79.46f, -79.45f);
        pathBuilder.lineToRelative(4.16f, 13.89f);
        pathBuilder.lineToRelative(-34.93f, 34.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(40.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.0f, -11.94f);
        pathBuilder.lineToRelative(-9.94f, -33.13f);
        pathBuilder.lineToRelative(24.59f, -24.59f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f);
        pathBuilder.close();
        pathBuilder.moveTo(65.0f, 152.0f);
        pathBuilder.lineToRelative(71.0f, -71.0f);
        pathBuilder.lineToRelative(39.0f, 39.0f);
        pathBuilder.lineToRelative(-71.0f, 71.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 173.0f);
        pathBuilder.lineToRelative(31.0f, 31.0f);
        pathBuilder.horizontalLineTo(52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 103.0f);
        pathBuilder.lineTo(153.0f, 64.0f);
        pathBuilder.lineToRelative(18.34f, -18.34f);
        pathBuilder.lineToRelative(39.0f, 39.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
