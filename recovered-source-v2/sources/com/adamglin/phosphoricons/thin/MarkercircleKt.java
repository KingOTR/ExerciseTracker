package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Markercircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MarkerCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMarkerCircle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_markerCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkercircleKt {
    private static ImageVector _markerCircle;

    public static final ImageVector getMarkerCircle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _markerCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MarkerCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.71f, 57.29f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 208.83f);
        pathBuilder.lineTo(84.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.83f);
        pathBuilder.arcToRelative(92.25f, 92.25f, 0.0f, false, true, -88.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.15f, 140.0f);
        pathBuilder.lineTo(152.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(100.0f, 164.0f);
        pathBuilder.lineTo(100.0f, 144.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(113.08f, 132.0f);
        pathBuilder.lineTo(124.08f, 79.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.84f, 0.0f);
        pathBuilder.lineToRelative(11.0f, 52.82f);
        pathBuilder.close();
        pathBuilder.moveTo(193.08f, 193.05f);
        pathBuilder.arcTo(92.41f, 92.41f, 0.0f, false, true, 180.0f, 203.9f);
        pathBuilder.lineTo(180.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(164.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(-0.91f);
        pathBuilder.lineTo(139.75f, 77.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.5f, 0.0f);
        pathBuilder.lineTo(104.91f, 132.0f);
        pathBuilder.lineTo(104.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(88.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(27.9f);
        pathBuilder.arcToRelative(92.41f, 92.41f, 0.0f, false, true, -13.0f, -10.85f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.1f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _markerCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
