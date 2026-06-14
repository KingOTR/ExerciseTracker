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

/* compiled from: Unitesquare.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UniteSquare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUniteSquare", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_uniteSquare", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnitesquareKt {
    private static ImageVector _uniteSquare;

    public static final ImageVector getUniteSquare(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 90.0f);
        pathBuilder.lineTo(166.0f, 90.0f);
        pathBuilder.lineTo(166.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(40.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(34.0f, 160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(90.0f, 166.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(216.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(222.0f, 96.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.48f, 210.0f);
        pathBuilder.lineTo(46.0f, 101.52f);
        pathBuilder.verticalLineToRelative(-47.0f);
        pathBuilder.lineTo(201.52f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.48f, 46.0f);
        pathBuilder.horizontalLineToRelative(47.0f);
        pathBuilder.lineTo(210.0f, 154.48f);
        pathBuilder.verticalLineToRelative(47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 137.52f);
        pathBuilder.lineTo(174.48f, 102.0f);
        pathBuilder.lineTo(210.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.0f, 81.52f);
        pathBuilder.lineTo(118.48f, 46.0f);
        pathBuilder.lineTo(154.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 118.52f);
        pathBuilder.lineTo(81.52f, 154.0f);
        pathBuilder.lineTo(46.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 174.52f);
        pathBuilder.lineTo(137.52f, 210.0f);
        pathBuilder.lineTo(102.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _uniteSquare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
