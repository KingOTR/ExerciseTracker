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

/* compiled from: Personsimpleswim.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSwim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleSwim", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSwim", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleswimKt {
    private static ImageVector _personSimpleSwim;

    public static final ImageVector getPersonSimpleSwim(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleSwim;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleSwim", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 102.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 176.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 54.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.62f, 186.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.79f, 8.45f);
        pathBuilder.curveToRelative(-16.87f, 14.0f, -32.0f, 19.0f, -45.75f, 19.0f);
        pathBuilder.curveToRelative(-18.19f, 0.0f, -34.13f, -8.65f, -48.94f, -16.7f);
        pathBuilder.curveToRelative(-26.0f, -14.11f, -48.44f, -26.31f, -81.31f, 1.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, true, 36.17f, 189.0f);
        pathBuilder.curveToRelative(39.13f, -32.45f, 68.65f, -16.41f, 94.69f, -2.27f);
        pathBuilder.reflectiveCurveToRelative(48.44f, 26.31f, 81.31f, -1.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 220.62f, 186.58f);
        pathBuilder.close();
        pathBuilder.moveTo(36.17f, 149.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.66f, 9.24f);
        pathBuilder.curveToRelative(32.87f, -27.26f, 55.32f, -15.07f, 81.31f, -1.0f);
        pathBuilder.curveTo(140.0f, 165.34f, 155.89f, 174.0f, 174.08f, 174.0f);
        pathBuilder.curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.66f, -9.24f);
        pathBuilder.curveToRelative(-7.48f, 6.2f, -14.43f, 10.36f, -21.0f, 12.92f);
        pathBuilder.lineToRelative(-54.81f, -54.82f);
        pathBuilder.arcTo(101.31f, 101.31f, 0.0f, false, false, 64.24f, 74.0f);
        pathBuilder.lineTo(40.0f, 74.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(64.24f, 86.0f);
        pathBuilder.arcToRelative(89.42f, 89.42f, 0.0f, false, true, 45.15f, 12.13f);
        pathBuilder.lineToRelative(-32.1f, 32.1f);
        pathBuilder.curveTo(64.77f, 131.26f, 51.18f, 136.57f, 36.17f, 149.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.88f, 112.36f);
        pathBuilder.lineTo(177.42f, 161.91f);
        pathBuilder.curveToRelative(-16.3f, 1.26f, -30.78f, -6.6f, -46.56f, -15.17f);
        pathBuilder.curveToRelative(-11.63f, -6.32f, -24.0f, -13.0f, -37.51f, -15.6f);
        pathBuilder.lineTo(119.5f, 105.0f);
        pathBuilder.arcTo(93.92f, 93.92f, 0.0f, false, true, 127.88f, 112.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSwim = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
