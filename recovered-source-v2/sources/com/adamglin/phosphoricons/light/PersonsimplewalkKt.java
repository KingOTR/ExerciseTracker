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

/* compiled from: Personsimplewalk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleWalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleWalk", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleWalk", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplewalkKt {
    private static ImageVector _personSimpleWalk;

    public static final ImageVector getPersonSimpleWalk(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleWalk;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleWalk", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.moveTo(214.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.curveToRelative(-34.48f, 0.0f, -51.06f, -16.75f, -65.7f, -31.52f);
        pathBuilder.curveToRelative(-3.47f, -3.51f, -6.75f, -6.82f, -10.15f, -9.78f);
        pathBuilder.lineTo(117.0f, 143.61f);
        pathBuilder.lineToRelative(38.52f, 27.51f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(146.0f, 179.09f);
        pathBuilder.lineToRelative(-33.92f, -24.23f);
        pathBuilder.lineTo(77.5f, 234.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f);
        pathBuilder.lineToRelative(55.0f, -126.61f);
        pathBuilder.curveToRelative(-10.18f, -2.75f, -23.07f, 0.0f, -38.51f, 8.29f);
        pathBuilder.arcToRelative(165.76f, 165.76f, 0.0f, false, false, -30.92f, 22.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.22f, -8.74f);
        pathBuilder.arcToRelative(175.4f, 175.4f, 0.0f, false, true, 33.27f, -23.77f);
        pathBuilder.curveToRelative(25.93f, -14.0f, 47.64f, -14.39f, 62.77f, -1.26f);
        pathBuilder.curveToRelative(3.77f, 3.27f, 7.4f, 6.93f, 10.9f, 10.47f);
        pathBuilder.curveToRelative(13.62f, 13.75f, 27.69f, 28.0f, 57.17f, 28.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleWalk = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
