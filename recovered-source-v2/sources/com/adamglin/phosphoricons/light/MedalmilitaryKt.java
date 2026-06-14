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

/* compiled from: Medalmilitary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MedalMilitary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMedalMilitary", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medalMilitary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalmilitaryKt {
    private static ImageVector _medalMilitary;

    public static final ImageVector getMedalMilitary(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _medalMilitary;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MedalMilitary", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(207.0f, 42.0f);
        pathBuilder.lineTo(49.0f, 42.0f);
        pathBuilder.arcTo(15.0f, 15.0f, 0.0f, false, false, 34.0f, 57.0f);
        pathBuilder.verticalLineToRelative(49.21f);
        pathBuilder.arcToRelative(15.0f, 15.0f, 0.0f, false, false, 8.79f, 13.65f);
        pathBuilder.lineTo(109.19f, 150.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, 37.62f, 0.0f);
        pathBuilder.lineToRelative(66.4f, -30.18f);
        pathBuilder.arcTo(15.0f, 15.0f, 0.0f, false, false, 222.0f, 106.21f);
        pathBuilder.lineTo(222.0f, 57.0f);
        pathBuilder.arcTo(15.0f, 15.0f, 0.0f, false, false, 207.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 54.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.lineToRelative(-34.0f, 15.45f);
        pathBuilder.lineTo(94.0f, 130.0f);
        pathBuilder.lineTo(94.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 106.21f);
        pathBuilder.lineTo(46.0f, 57.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f);
        pathBuilder.lineTo(82.0f, 54.0f);
        pathBuilder.verticalLineToRelative(70.5f);
        pathBuilder.lineTo(47.76f, 108.94f);
        pathBuilder.arcTo(3.0f, 3.0f, 0.0f, false, true, 46.0f, 106.21f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 192.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 162.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 106.21f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.76f, 2.73f);
        pathBuilder.lineTo(174.0f, 124.5f);
        pathBuilder.lineTo(174.0f, 54.0f);
        pathBuilder.horizontalLineToRelative(33.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medalMilitary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
