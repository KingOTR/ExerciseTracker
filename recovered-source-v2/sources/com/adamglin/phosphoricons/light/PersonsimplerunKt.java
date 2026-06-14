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

/* compiled from: Personsimplerun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleRun", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleRun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplerunKt {
    private static ImageVector _personSimpleRun;

    public static final ImageVector getPersonSimpleRun(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleRun;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleRun", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 86.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 152.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 38.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.49f, 138.86f);
        pathBuilder.curveToRelative(-0.59f, 0.27f, -7.17f, 3.13f, -18.88f, 3.13f);
        pathBuilder.curveToRelative(-13.86f, 0.0f, -34.9f, -4.0f, -61.73f, -21.0f);
        pathBuilder.arcToRelative(165.89f, 165.89f, 0.0f, false, true, -17.43f, 36.51f);
        pathBuilder.curveToRelative(9.43f, 2.78f, 22.0f, 7.72f, 33.19f, 16.26f);
        pathBuilder.curveTo(172.46f, 188.05f, 182.0f, 207.65f, 182.0f, 232.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -44.0f, -37.23f, -59.18f, -56.91f, -64.11f);
        pathBuilder.quadToRelative(-1.2f, 1.55f, -2.46f, 3.09f);
        pathBuilder.curveToRelative(-19.25f, 23.31f, -43.34f, 35.45f, -70.11f, 35.45f);
        pathBuilder.arcTo(90.72f, 90.72f, 0.0f, false, true, 31.4f, 206.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 32.6f, 194.0f);
        pathBuilder.curveToRelative(26.63f, 2.66f, 49.77f, -7.66f, 68.77f, -30.69f);
        pathBuilder.curveToRelative(13.16f, -15.94f, 21.94f, -35.51f, 26.08f, -49.15f);
        pathBuilder.curveToRelative(-40.51f, -24.52f, -66.59f, -4.78f, -67.72f, -3.89f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.48f, -9.38f);
        pathBuilder.curveToRelative(0.37f, -0.3f, 9.39f, -7.43f, 24.76f, -10.0f);
        pathBuilder.curveToRelative(13.86f, -2.31f, 35.92f, -1.3f, 62.36f, 16.67f);
        pathBuilder.curveToRelative(47.14f, 32.0f, 73.88f, 20.47f, 74.14f, 20.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.0f, 10.92f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleRun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
