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

/* compiled from: Lightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLightning", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningKt {
    private static ImageVector _lightning;

    public static final ImageVector getLightning(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _lightning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lightning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.89f, 119.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.49f, -2.84f);
        pathBuilder.lineToRelative(-60.81f, -22.8f);
        pathBuilder.lineToRelative(15.33f, -76.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.84f, -3.51f);
        pathBuilder.lineToRelative(-112.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 3.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.49f, 2.84f);
        pathBuilder.lineToRelative(60.81f, 22.8f);
        pathBuilder.lineTo(92.08f, 239.22f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.84f, 3.51f);
        pathBuilder.lineToRelative(112.0f, -120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 211.89f, 119.09f);
        pathBuilder.close();
        pathBuilder.moveTo(102.68f, 227.0f);
        pathBuilder.lineToRelative(13.24f, -66.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.52f, -4.53f);
        pathBuilder.lineTo(55.0f, 134.36f);
        pathBuilder.lineTo(153.32f, 29.0f);
        pathBuilder.lineToRelative(-13.24f, 66.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.52f, 4.53f);
        pathBuilder.lineTo(201.0f, 121.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
