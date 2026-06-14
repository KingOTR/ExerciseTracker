package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Balloon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Balloon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBalloon", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_balloon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonKt {
    private static ImageVector _balloon;

    public static final ImageVector getBalloon(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _balloon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Balloon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 16.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 23.43f, 9.4f, 49.42f, 25.13f, 69.5f);
        pathBuilder.curveToRelative(12.08f, 15.41f, 26.5f, 26.0f, 41.91f, 31.09f);
        pathBuilder.lineTo(96.65f, 228.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 240.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -11.15f);
        pathBuilder.lineTo(149.0f, 204.59f);
        pathBuilder.curveToRelative(15.4f, -5.07f, 29.83f, -15.68f, 41.91f, -31.09f);
        pathBuilder.curveTo(206.6f, 153.42f, 216.0f, 127.43f, 216.0f, 104.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.32f, 103.89f);
        pathBuilder.arcTo(8.52f, 8.52f, 0.0f, false, true, 176.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.68f);
        pathBuilder.arcToRelative(41.29f, 41.29f, 0.0f, false, false, -33.43f, -33.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.64f, -15.78f);
        pathBuilder.arcToRelative(57.5f, 57.5f, 0.0f, false, true, 46.57f, 46.57f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 177.32f, 103.89f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _balloon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
