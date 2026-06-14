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

/* compiled from: Gavel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gavel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGavel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gavel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gavel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.91f, 118.1f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.55f, -0.23f);
        pathBuilder.lineTo(154.13f, 49.64f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.23f, -19.55f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.55f, 0.23f);
        pathBuilder.lineTo(99.52f, 124.0f);
        pathBuilder.lineTo(32.73f, 190.79f);
        pathBuilder.arcToRelative(23.0f, 23.0f, 0.0f, false, false, 32.48f, 32.49f);
        pathBuilder.lineTo(132.0f, 156.49f);
        pathBuilder.lineToRelative(9.87f, 9.87f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.23f, 19.55f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 241.91f, 118.1f);
        pathBuilder.close();
        pathBuilder.moveTo(150.35f, 157.86f);
        pathBuilder.lineTo(98.14f, 105.66f);
        pathBuilder.lineTo(145.66f, 58.14f);
        pathBuilder.lineTo(197.86f, 110.34f);
        pathBuilder.close();
        pathBuilder.moveTo(78.59f, 105.41f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 78.59f, 105.41f);
        pathBuilder.close();
        pathBuilder.moveTo(56.73f, 214.8f);
        pathBuilder.arcToRelative(11.0f, 11.0f, 0.0f, false, true, -15.52f, -15.52f);
        pathBuilder.lineTo(108.0f, 132.49f);
        pathBuilder.lineTo(123.52f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.42f, 129.42f);
        pathBuilder.lineTo(169.42f, 193.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 129.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gavel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
