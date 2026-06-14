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

/* compiled from: Octagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Octagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getOctagon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_octagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OctagonKt {
    private static ImageVector _octagon;

    public static final ImageVector getOctagon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _octagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Octagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.14f, 77.41f);
        pathBuilder.lineTo(178.59f, 25.86f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 164.45f, 20.0f);
        pathBuilder.horizontalLineTo(91.55f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, -14.14f, 5.86f);
        pathBuilder.lineTo(25.86f, 77.41f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 20.0f, 91.55f);
        pathBuilder.verticalLineToRelative(72.9f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, 5.86f, 14.14f);
        pathBuilder.lineToRelative(51.55f, 51.55f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 91.55f, 236.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineToRelative(51.55f, -51.55f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 236.0f, 164.45f);
        pathBuilder.verticalLineTo(91.55f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 230.14f, 77.41f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 162.79f);
        pathBuilder.lineTo(162.79f, 212.0f);
        pathBuilder.horizontalLineTo(93.21f);
        pathBuilder.lineTo(44.0f, 162.79f);
        pathBuilder.verticalLineTo(93.21f);
        pathBuilder.lineTo(93.21f, 44.0f);
        pathBuilder.horizontalLineToRelative(69.58f);
        pathBuilder.lineTo(212.0f, 93.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _octagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
