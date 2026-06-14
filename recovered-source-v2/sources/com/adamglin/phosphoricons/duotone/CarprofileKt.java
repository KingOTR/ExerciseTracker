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

/* compiled from: Carprofile.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CarProfile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCarProfile", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carProfile", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarprofileKt {
    private static ImageVector _carProfile;

    public static final ImageVector getCarProfile(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _carProfile;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CarProfile", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 176.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 88.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 152.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 192.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.34f, 74.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 156.69f, 72.0f);
        pathBuilder.lineTo(44.28f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 3.56f);
        pathBuilder.lineTo(8.0f, 120.0f);
        pathBuilder.lineTo(208.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 112.0f);
        pathBuilder2.lineTo(211.31f, 112.0f);
        pathBuilder2.lineTo(168.0f, 68.69f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, false, 156.69f, 64.0f);
        pathBuilder2.lineTo(44.28f, 64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 31.0f, 71.12f);
        pathBuilder2.lineTo(1.34f, 115.56f);
        pathBuilder2.arcTo(8.07f, 8.07f, 0.0f, false, false, 0.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(33.0f, 184.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(66.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(17.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(256.0f, 128.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(44.28f, 80.0f);
        pathBuilder2.lineTo(156.69f, 80.0f);
        pathBuilder2.lineToRelative(32.0f, 32.0f);
        pathBuilder2.lineTo(23.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(64.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 168.0f);
        pathBuilder2.lineTo(223.0f, 168.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f);
        pathBuilder2.lineTo(95.0f, 168.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f);
        pathBuilder2.lineTo(16.0f, 168.0f);
        pathBuilder2.lineTo(16.0f, 128.0f);
        pathBuilder2.lineTo(240.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carProfile = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
