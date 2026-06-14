package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Carprofile.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CarProfile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCarProfile", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carProfile", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarprofileKt {
    private static ImageVector _carProfile;

    public static final ImageVector getCarProfile(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 112.0f);
        pathBuilder.lineTo(211.31f, 112.0f);
        pathBuilder.lineTo(168.0f, 68.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 156.69f, 64.0f);
        pathBuilder.lineTo(44.28f, 64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 31.0f, 71.12f);
        pathBuilder.lineTo(1.34f, 115.56f);
        pathBuilder.arcTo(8.07f, 8.07f, 0.0f, false, false, 0.0f, 120.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(33.0f, 184.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(66.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(256.0f, 128.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.28f, 80.0f);
        pathBuilder.lineTo(156.69f, 80.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.lineTo(23.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 168.0f);
        pathBuilder.lineTo(223.0f, 168.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f);
        pathBuilder.lineTo(95.0f, 168.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f);
        pathBuilder.lineTo(16.0f, 168.0f);
        pathBuilder.lineTo(16.0f, 128.0f);
        pathBuilder.lineTo(240.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carProfile = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
