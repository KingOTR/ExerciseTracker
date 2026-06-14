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

/* compiled from: Personsimplehike.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleHike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleHike", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleHike", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplehikeKt {
    private static ImageVector _personSimpleHike;

    public static final ImageVector getPersonSimpleHike(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleHike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleHike", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 78.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 152.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 30.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 144.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(186.0f, 149.81f);
        pathBuilder.curveToRelative(-26.23f, -1.73f, -34.76f, -14.89f, -42.35f, -26.59f);
        pathBuilder.curveToRelative(-3.43f, -5.3f, -6.68f, -10.31f, -11.5f, -14.52f);
        pathBuilder.lineTo(117.0f, 143.61f);
        pathBuilder.lineToRelative(38.52f, 27.51f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(146.0f, 179.09f);
        pathBuilder.lineToRelative(-33.92f, -24.23f);
        pathBuilder.lineTo(77.5f, 234.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f);
        pathBuilder.lineTo(124.0f, 97.29f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.25f, -2.94f);
        pathBuilder.arcToRelative(38.89f, 38.89f, 0.0f, false, true, 7.65f, 5.21f);
        pathBuilder.curveToRelative(6.15f, 5.34f, 10.0f, 11.33f, 13.79f, 17.13f);
        pathBuilder.curveTo(161.44f, 128.59f, 167.54f, 138.0f, 192.0f, 138.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.52f, -3.64f);
        pathBuilder.lineToRelative(24.0f, -56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.16f, -7.88f);
        pathBuilder.lineToRelative(-28.0f, -12.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.87f, 3.16f);
        pathBuilder.lineToRelative(-24.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.15f, 7.87f);
        pathBuilder.lineToRelative(28.0f, 12.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 72.0f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(51.88f, 128.85f);
        pathBuilder.lineToRelative(19.27f, -45.0f);
        pathBuilder.lineToRelative(17.0f, 7.27f);
        pathBuilder.lineToRelative(-19.27f, 45.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleHike = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
