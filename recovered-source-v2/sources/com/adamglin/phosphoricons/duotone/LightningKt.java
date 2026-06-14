package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLightning", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningKt {
    private static ImageVector _lightning;

    public static final ImageVector getLightning(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(96.0f, 240.0f);
        pathBuilder.lineToRelative(16.0f, -80.0f);
        pathBuilder.lineTo(48.0f, 136.0f);
        pathBuilder.lineTo(160.0f, 16.0f);
        pathBuilder.lineTo(144.0f, 96.0f);
        pathBuilder.lineToRelative(64.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(215.79f, 118.17f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -5.66f);
        pathBuilder2.lineTo(153.18f, 90.9f);
        pathBuilder2.lineToRelative(14.66f, -73.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.69f, -7.0f);
        pathBuilder2.lineToRelative(-112.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 13.0f);
        pathBuilder2.lineToRelative(57.63f, 21.61f);
        pathBuilder2.lineTo(88.16f, 238.43f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f);
        pathBuilder2.lineToRelative(112.0f, -120.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 215.79f, 118.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(109.37f, 214.0f);
        pathBuilder2.lineToRelative(10.47f, -52.38f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -9.06f);
        pathBuilder2.lineTo(62.0f, 132.71f);
        pathBuilder2.lineToRelative(84.62f, -90.66f);
        pathBuilder2.lineTo(136.16f, 94.43f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 9.06f);
        pathBuilder2.lineToRelative(52.8f, 19.8f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
