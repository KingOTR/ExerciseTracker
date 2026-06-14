package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Carprofile.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CarProfile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCarProfile", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carProfile", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarprofileKt {
    private static ImageVector _carProfile;

    public static final ImageVector getCarProfile(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 108.0f);
        pathBuilder.lineTo(213.0f, 108.0f);
        pathBuilder.lineTo(170.83f, 65.86f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 156.69f, 60.0f);
        pathBuilder.lineTo(48.28f, 60.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.64f, 8.91f);
        pathBuilder.lineTo(2.0f, 113.34f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 120.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(33.5f, 188.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 65.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(59.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 65.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 188.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(256.0f, 128.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(50.42f, 84.0f);
        pathBuilder.lineTo(155.0f, 84.0f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.lineTo(34.42f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 188.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 66.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 188.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 164.0f);
        pathBuilder.lineTo(221.0f, 164.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 159.0f, 164.0f);
        pathBuilder.lineTo(97.0f, 164.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 35.0f, 164.0f);
        pathBuilder.lineTo(24.0f, 164.0f);
        pathBuilder.lineTo(24.0f, 132.0f);
        pathBuilder.lineTo(232.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carProfile = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
