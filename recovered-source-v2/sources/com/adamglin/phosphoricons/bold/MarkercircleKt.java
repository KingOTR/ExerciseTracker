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

/* compiled from: Markercircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MarkerCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMarkerCircle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_markerCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkercircleKt {
    private static ImageVector _markerCircle;

    public static final ImageVector getMarkerCircle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(204.37f, 51.6f);
        pathBuilder.arcTo(108.08f, 108.08f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.09f, 108.09f, 0.0f, false, false, 204.37f, 51.6f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(108.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 203.92f);
        pathBuilder.lineTo(92.0f, 180.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(23.9f);
        pathBuilder.arcTo(84.33f, 84.33f, 0.0f, false, true, 92.0f, 203.92f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 186.79f);
        pathBuilder.lineTo(188.0f, 176.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -19.6f);
        pathBuilder.lineTo(172.0f, 136.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -14.85f, -19.31f);
        pathBuilder.lineTo(147.27f, 81.2f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -38.54f, 0.0f);
        pathBuilder.lineToRelative(-9.88f, 35.49f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 136.0f);
        pathBuilder.verticalLineToRelative(20.42f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 176.0f);
        pathBuilder.verticalLineToRelative(10.77f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 120.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _markerCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
