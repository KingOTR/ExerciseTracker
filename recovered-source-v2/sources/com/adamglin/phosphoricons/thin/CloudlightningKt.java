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

/* compiled from: Cloudlightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudLightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCloudLightning", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudLightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudlightningKt {
    private static ImageVector _cloudLightning;

    public static final ImageVector getCloudLightning(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(156.0f, 20.0f);
        pathBuilder.arcTo(72.19f, 72.19f, 0.0f, false, false, 87.51f, 69.39f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, false, 76.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(44.94f);
        pathBuilder.lineToRelative(-20.37f, 33.94f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 204.0f);
        pathBuilder.horizontalLineToRelative(32.94f);
        pathBuilder.lineToRelative(-20.37f, 33.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.86f, 4.12f);
        pathBuilder.lineToRelative(24.0f, -40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 196.0f);
        pathBuilder.lineTo(111.06f, 196.0f);
        pathBuilder.lineToRelative(19.2f, -32.0f);
        pathBuilder.lineTo(156.0f, 164.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 156.0f);
        pathBuilder.lineTo(76.0f, 156.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f);
        pathBuilder.arcTo(71.63f, 71.63f, 0.0f, false, false, 84.0f, 87.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f);
        pathBuilder.arcTo(64.06f, 64.06f, 0.0f, true, true, 156.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudLightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
