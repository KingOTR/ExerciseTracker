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

/* compiled from: Syringe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Syringe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSyringe", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_syringe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SyringeKt {
    private static ImageVector _syringe;

    public static final ImageVector getSyringe(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _syringe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Syringe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.49f, 63.51f);
        pathBuilder.lineToRelative(-48.0f, -48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(191.0f, 48.0f);
        pathBuilder.lineTo(168.0f, 71.0f);
        pathBuilder.lineTo(136.49f, 39.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f);
        pathBuilder.lineTo(123.0f, 60.0f);
        pathBuilder.lineTo(41.86f, 141.17f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 36.0f, 155.31f);
        pathBuilder.verticalLineTo(203.0f);
        pathBuilder.lineTo(15.51f, 223.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineTo(53.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(47.72f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineTo(196.0f, 133.0f);
        pathBuilder.lineToRelative(3.51f, 3.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(185.0f, 88.0f);
        pathBuilder.lineToRelative(23.0f, -23.0f);
        pathBuilder.lineToRelative(15.51f, 15.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(99.0f, 196.0f);
        pathBuilder.horizontalLineTo(60.0f);
        pathBuilder.verticalLineTo(157.0f);
        pathBuilder.lineToRelative(14.0f, -14.0f);
        pathBuilder.lineToRelative(17.51f, 17.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(91.0f, 126.0f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.lineToRelative(17.51f, 17.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(119.0f, 98.0f);
        pathBuilder.lineToRelative(21.0f, -21.0f);
        pathBuilder.lineToRelative(39.0f, 39.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _syringe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
