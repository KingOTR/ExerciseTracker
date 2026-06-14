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

/* compiled from: Unitesquare.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UniteSquare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUniteSquare", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_uniteSquare", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnitesquareKt {
    private static ImageVector _uniteSquare;

    public static final ImageVector getUniteSquare(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _uniteSquare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UniteSquare", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 160.0f);
        pathBuilder.lineTo(228.0f, 96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(172.0f, 84.0f);
        pathBuilder.lineTo(172.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(40.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f);
        pathBuilder.lineTo(28.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(84.0f, 172.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(216.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(228.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 91.0f);
        pathBuilder.lineTo(52.0f, 69.0f);
        pathBuilder.lineTo(187.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(69.0f, 52.0f);
        pathBuilder.lineTo(91.0f, 52.0f);
        pathBuilder.lineTo(204.0f, 165.0f);
        pathBuilder.lineTo(204.0f, 187.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 131.0f);
        pathBuilder.lineTo(181.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 75.0f);
        pathBuilder.lineTo(125.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 125.0f);
        pathBuilder.lineToRelative(23.0f, 23.0f);
        pathBuilder.lineTo(52.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 181.0f);
        pathBuilder.lineTo(131.0f, 204.0f);
        pathBuilder.lineTo(108.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _uniteSquare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
