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

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCat", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.65f, 29.53f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -21.79f, 4.34f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.39f, 0.4f, -0.57f, 0.61f);
        pathBuilder.lineToRelative(-15.0f, 17.3f);
        pathBuilder.arcToRelative(115.34f, 115.34f, 0.0f, false, false, -116.5f, 0.0f);
        pathBuilder.lineToRelative(-15.0f, -17.3f);
        pathBuilder.curveToRelative(-0.18f, -0.21f, -0.37f, -0.41f, -0.57f, -0.61f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 55.14f, 48.45f, 100.0f, 108.0f, 100.0f);
        pathBuilder.reflectiveCurveToRelative(108.0f, -44.86f, 108.0f, -100.0f);
        pathBuilder.lineTo(236.0f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 223.65f, 29.53f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 38.22f, -31.35f, 69.93f, -72.0f, 75.21f);
        pathBuilder.lineTo(140.0f, 197.0f);
        pathBuilder.lineToRelative(12.49f, -12.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineTo(128.0f, 175.0f);
        pathBuilder.lineToRelative(-7.51f, -7.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(116.0f, 197.0f);
        pathBuilder.verticalLineToRelative(14.24f);
        pathBuilder.curveToRelative(-40.65f, -5.28f, -72.0f, -37.0f, -72.0f, -75.21f);
        pathBuilder.lineTo(44.0f, 58.74f);
        pathBuilder.lineTo(58.54f, 75.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.21f, 1.76f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, false, true, 96.0f, 65.74f);
        pathBuilder.lineTo(96.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 60.35f);
        pathBuilder.quadToRelative(4.0f, -0.35f, 8.0f, -0.35f);
        pathBuilder.reflectiveQuadToRelative(8.0f, 0.35f);
        pathBuilder.lineTo(136.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(160.0f, 65.74f);
        pathBuilder.arcToRelative(86.2f, 86.2f, 0.0f, false, true, 21.25f, 11.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.21f, -1.76f);
        pathBuilder.lineTo(212.0f, 58.74f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 140.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 140.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
