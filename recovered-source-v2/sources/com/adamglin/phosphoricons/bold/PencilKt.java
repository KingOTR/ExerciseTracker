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

/* compiled from: Pencil.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pencil", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPencil", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencil", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilKt {
    private static ImageVector _pencil;

    public static final ImageVector getPencil(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pencil;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pencil", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.14f, 70.54f);
        pathBuilder.lineTo(185.46f, 25.85f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f);
        pathBuilder.lineTo(33.86f, 149.17f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 28.0f, 163.31f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(92.69f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineTo(230.14f, 98.82f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.28f);
        pathBuilder.close();
        pathBuilder.moveTo(93.0f, 180.0f);
        pathBuilder.lineToRelative(71.0f, -71.0f);
        pathBuilder.lineToRelative(11.0f, 11.0f);
        pathBuilder.lineToRelative(-71.0f, 71.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 163.0f);
        pathBuilder.lineTo(65.0f, 152.0f);
        pathBuilder.lineToRelative(71.0f, -71.0f);
        pathBuilder.lineToRelative(11.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 173.0f);
        pathBuilder.lineToRelative(15.51f, 15.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(83.0f, 204.0f);
        pathBuilder.horizontalLineTo(52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 103.0f);
        pathBuilder.lineTo(153.0f, 64.0f);
        pathBuilder.lineToRelative(18.34f, -18.34f);
        pathBuilder.lineToRelative(39.0f, 39.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencil = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
