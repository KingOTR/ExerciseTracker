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

/* compiled from: Arrowsoutcardinal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsOutCardinal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getArrowsOutCardinal", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsOutCardinal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowsoutcardinalKt {
    private static ImageVector _arrowsOutCardinal;

    public static final ImageVector getArrowsOutCardinal(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _arrowsOutCardinal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowsOutCardinal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(87.51f, 64.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(140.0f, 53.0f);
        pathBuilder.lineTo(140.0f, 96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 53.0f);
        pathBuilder.lineTo(104.49f, 64.49f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 87.51f, 64.49f);
        pathBuilder.close();
        pathBuilder.moveTo(151.51f, 191.49f);
        pathBuilder.lineTo(140.0f, 203.0f);
        pathBuilder.lineTo(140.0f, 160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(43.0f);
        pathBuilder.lineToRelative(-11.51f, -11.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.51f, 119.49f);
        pathBuilder.lineTo(208.51f, 87.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(203.0f, 116.0f);
        pathBuilder.lineTo(160.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(43.0f);
        pathBuilder.lineToRelative(-11.52f, 11.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 119.51f);
        pathBuilder.close();
        pathBuilder.moveTo(53.0f, 140.0f);
        pathBuilder.lineTo(96.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(53.0f, 116.0f);
        pathBuilder.lineToRelative(11.52f, -11.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsOutCardinal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
