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

/* compiled from: Cloudlightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudLightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCloudLightning", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudLightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudlightningKt {
    private static ImageVector _cloudLightning;

    public static final ImageVector getCloudLightning(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cloudLightning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudLightning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(156.0f, 18.0f);
        pathBuilder.arcTo(74.21f, 74.21f, 0.0f, false, false, 86.11f, 67.3f);
        pathBuilder.arcToRelative(6.18f, 6.18f, 0.0f, false, false, -1.83f, -0.62f);
        pathBuilder.arcTo(50.83f, 50.83f, 0.0f, false, false, 76.0f, 66.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(41.4f);
        pathBuilder.lineTo(98.85f, 196.91f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 206.0f);
        pathBuilder.horizontalLineToRelative(29.4f);
        pathBuilder.lineToRelative(-18.55f, 30.91f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.3f, 6.18f);
        pathBuilder.lineToRelative(24.0f, -40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 194.0f);
        pathBuilder.lineTo(114.6f, 194.0f);
        pathBuilder.lineToRelative(16.8f, -28.0f);
        pathBuilder.lineTo(156.0f, 166.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 154.0f);
        pathBuilder.lineTo(76.0f, 154.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 6.31f, -75.48f);
        pathBuilder.arcToRelative(6.82f, 6.82f, 0.0f, false, false, 0.79f, 0.08f);
        pathBuilder.arcTo(72.86f, 72.86f, 0.0f, false, false, 82.0f, 87.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f);
        pathBuilder.arcTo(62.06f, 62.06f, 0.0f, true, true, 156.0f, 154.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudLightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
