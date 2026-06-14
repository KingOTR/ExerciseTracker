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

/* compiled from: Spinnergap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpinnerGap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSpinnerGap", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinnerGap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnergapKt {
    private static ImageVector _spinnerGap;

    public static final ImageVector getSpinnerGap(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _spinnerGap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpinnerGap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.0f, 32.0f);
        pathBuilder.lineTo(134.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 122.0f);
        pathBuilder.lineTo(192.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.5f, 169.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 169.0f, 177.5f);
        pathBuilder.lineToRelative(22.63f, 22.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 192.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.5f, 169.0f);
        pathBuilder.lineTo(55.88f, 191.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineTo(87.0f, 177.5f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 78.5f, 169.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(32.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(64.0f, 134.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 70.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.36f, 55.88f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(78.5f, 87.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 87.0f, 78.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinnerGap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
