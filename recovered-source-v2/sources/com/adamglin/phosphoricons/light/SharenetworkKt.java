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

/* compiled from: Sharenetwork.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShareNetwork", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShareNetwork", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shareNetwork", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharenetworkKt {
    private static ImageVector _shareNetwork;

    public static final ImageVector getShareNetwork(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shareNetwork;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShareNetwork", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 162.0f);
        pathBuilder.arcToRelative(37.91f, 37.91f, 0.0f, false, false, -28.3f, 12.67f);
        pathBuilder.lineTo(98.8f, 143.24f);
        pathBuilder.arcToRelative(37.89f, 37.89f, 0.0f, false, false, 0.0f, -30.48f);
        pathBuilder.lineToRelative(48.9f, -31.43f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, -6.5f, -10.09f);
        pathBuilder.lineTo(92.3f, 102.67f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.0f, 50.66f);
        pathBuilder.lineToRelative(48.9f, 31.43f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, true, false, 176.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 30.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 176.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 154.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 64.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 226.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 176.0f, 226.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shareNetwork = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
