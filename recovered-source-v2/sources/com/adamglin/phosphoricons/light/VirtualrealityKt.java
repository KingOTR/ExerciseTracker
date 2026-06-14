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

/* compiled from: Virtualreality.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VirtualReality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getVirtualReality", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virtualReality", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirtualrealityKt {
    private static ImageVector _virtualReality;

    public static final ImageVector getVirtualReality(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _virtualReality;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("VirtualReality", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(121.62f, 98.11f);
        pathBuilder.lineToRelative(-24.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.24f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, -64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.24f, -4.22f);
        pathBuilder.lineToRelative(18.38f, 49.0f);
        pathBuilder.lineToRelative(18.38f, -49.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.24f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 128.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, true, -78.0f, 78.0f);
        pathBuilder.lineTo(80.0f, 206.0f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, true, 80.0f, 50.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(78.09f, 78.09f, 0.0f, false, true, 254.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.0f, 128.0f);
        pathBuilder.arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, -66.0f);
        pathBuilder.lineTo(80.0f, 62.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, false, 0.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, false, 242.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.2f, 137.76f);
        pathBuilder.lineTo(189.2f, 157.02f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.42f, 6.0f);
        pathBuilder.lineToRelative(-12.07f, -21.12f);
        pathBuilder.arcTo(27.06f, 27.06f, 0.0f, false, true, 164.0f, 142.0f);
        pathBuilder.lineTo(150.0f, 142.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(138.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 14.2f, 47.76f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 130.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -28.0f);
        pathBuilder.lineTo(150.0f, 102.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virtualReality = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
