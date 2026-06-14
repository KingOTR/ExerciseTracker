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

/* compiled from: Medalmilitary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MedalMilitary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMedalMilitary", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medalMilitary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalmilitaryKt {
    private static ImageVector _medalMilitary;

    public static final ImageVector getMedalMilitary(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(207.0f, 44.0f);
        pathBuilder.lineTo(49.0f, 44.0f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, false, 36.0f, 57.0f);
        pathBuilder.verticalLineToRelative(49.21f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, false, 43.62f, 118.0f);
        pathBuilder.lineToRelative(70.72f, 32.14f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 27.32f, 0.0f);
        pathBuilder.lineTo(212.38f, 118.0f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, false, 220.0f, 106.21f);
        pathBuilder.lineTo(220.0f, 57.0f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, false, 207.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 52.0f);
        pathBuilder.verticalLineToRelative(79.24f);
        pathBuilder.lineToRelative(-36.0f, 16.37f);
        pathBuilder.lineTo(92.0f, 131.24f);
        pathBuilder.lineTo(92.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 106.21f);
        pathBuilder.lineTo(44.0f, 57.0f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f);
        pathBuilder.lineTo(84.0f, 52.0f);
        pathBuilder.verticalLineToRelative(75.61f);
        pathBuilder.lineTo(46.93f, 110.76f);
        pathBuilder.arcTo(5.0f, 5.0f, 0.0f, false, true, 44.0f, 106.21f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 192.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 164.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 106.21f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.93f, 4.55f);
        pathBuilder.lineTo(172.0f, 127.61f);
        pathBuilder.lineTo(172.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(35.0f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medalMilitary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
