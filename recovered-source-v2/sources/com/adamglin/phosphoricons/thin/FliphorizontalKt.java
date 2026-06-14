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

/* compiled from: Fliphorizontal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlipHorizontal", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipHorizontal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FliphorizontalKt {
    private static ImageVector _flipHorizontal;

    public static final ImageVector getFlipHorizontal(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flipHorizontal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlipHorizontal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(106.38f, 28.26f);
        pathBuilder.arcToRelative(11.76f, 11.76f, 0.0f, false, false, -13.44f, 7.08f);
        pathBuilder.lineToRelative(0.0f, 0.08f);
        pathBuilder.lineTo(29.0f, 195.32f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(116.0f, 40.0f);
        pathBuilder.arcTo(11.75f, 11.75f, 0.0f, false, false, 106.38f, 28.26f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(40.0f, 204.0f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, -3.33f, -1.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.32f, -3.84f);
        pathBuilder.lineToRelative(64.0f, -159.94f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.07f, 195.4f);
        pathBuilder.lineTo(163.07f, 35.4f);
        pathBuilder.lineTo(163.07f, 35.32f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 40.0f);
        pathBuilder.lineTo(140.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.08f, -16.6f);
        pathBuilder.close();
        pathBuilder.moveTo(219.32f, 202.21f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 216.0f, 204.0f);
        pathBuilder.lineTo(152.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(148.0f, 40.0f);
        pathBuilder.arcToRelative(3.81f, 3.81f, 0.0f, false, true, 3.2f, -3.92f);
        pathBuilder.arcToRelative(4.64f, 4.64f, 0.0f, false, true, 0.9f, -0.09f);
        pathBuilder.arcToRelative(3.69f, 3.69f, 0.0f, false, true, 3.57f, 2.42f);
        pathBuilder.lineToRelative(64.0f, 160.0f);
        pathBuilder.arcTo(3.9f, 3.9f, 0.0f, false, true, 219.32f, 202.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipHorizontal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
