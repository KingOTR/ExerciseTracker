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

/* compiled from: Flipvertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlipVertical", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipVertical", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlipverticalKt {
    private static ImageVector _flipVertical;

    public static final ImageVector getFlipVertical(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flipVertical;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlipVertical", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.0f, 118.0f);
        pathBuilder.lineTo(216.0f, 118.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.46f, -26.9f);
        pathBuilder.lineToRelative(-0.11f, 0.0f);
        pathBuilder.lineToRelative(-159.95f, -64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.79f, 0.16f);
        pathBuilder.lineToRelative(0.11f, 0.05f);
        pathBuilder.lineToRelative(159.92f, 64.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 106.0f);
        pathBuilder.lineTo(56.0f, 106.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 138.0f);
        pathBuilder.lineTo(56.0f, 138.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.39f, 12.92f);
        pathBuilder.lineToRelative(160.0f, -64.0f);
        pathBuilder.lineToRelative(0.11f, -0.05f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.82f, 153.83f);
        pathBuilder.lineTo(56.9f, 217.83f);
        pathBuilder.lineTo(56.79f, 217.88f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 216.0f);
        pathBuilder.lineTo(54.0f, 152.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(216.0f, 150.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.82f, 3.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipVertical = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
