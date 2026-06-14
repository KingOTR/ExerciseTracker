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

/* compiled from: Shovel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shovel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShovel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shovel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShovelKt {
    private static ImageVector _shovel;

    public static final ImageVector getShovel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shovel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Shovel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.24f, 59.76f);
        pathBuilder.lineToRelative(-48.0f, -48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(207.52f, 40.0f);
        pathBuilder.lineToRelative(-73.86f, 73.86f);
        pathBuilder.lineTo(97.9f, 78.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcTo(13.94f, 13.94f, 0.0f, false, false, 18.0f, 144.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f);
        pathBuilder.lineToRelative(56.0f, -56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f);
        pathBuilder.lineToRelative(-35.76f, -35.76f);
        pathBuilder.lineTo(216.0f, 48.48f);
        pathBuilder.lineToRelative(19.76f, 19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(169.41f, 166.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.84f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 112.0f, 226.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, -1.42f);
        pathBuilder.lineToRelative(56.0f, -56.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 88.0f, 86.0f);
        pathBuilder.arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.42f, 0.58f);
        pathBuilder.lineToRelative(35.75f, 35.76f);
        pathBuilder.lineTo(83.76f, 163.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(41.42f, -41.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shovel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
