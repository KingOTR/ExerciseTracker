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

/* compiled from: Octagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Octagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getOctagon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_octagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OctagonKt {
    private static ImageVector _octagon;

    public static final ImageVector getOctagon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(225.9f, 81.65f);
        pathBuilder.lineTo(174.35f, 30.1f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, -9.9f, -4.1f);
        pathBuilder.lineTo(91.55f, 26.0f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, -9.9f, 4.1f);
        pathBuilder.lineTo(30.1f, 81.65f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, -4.1f, 9.9f);
        pathBuilder.verticalLineToRelative(72.9f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 4.1f, 9.9f);
        pathBuilder.lineTo(81.65f, 225.9f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 9.9f, 4.1f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 9.9f, -4.1f);
        pathBuilder.lineToRelative(51.55f, -51.55f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 4.1f, -9.9f);
        pathBuilder.lineTo(230.0f, 91.55f);
        pathBuilder.arcTo(13.92f, 13.92f, 0.0f, false, false, 225.9f, 81.65f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 164.45f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, 1.42f);
        pathBuilder.lineToRelative(-51.55f, 51.54f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f);
        pathBuilder.lineTo(91.55f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.42f, -0.59f);
        pathBuilder.lineTo(38.59f, 165.87f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, -1.42f);
        pathBuilder.lineTo(38.0f, 91.55f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.42f);
        pathBuilder.lineTo(90.14f, 38.59f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 91.55f, 38.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.42f, 0.59f);
        pathBuilder.lineToRelative(51.54f, 51.55f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, 1.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _octagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
