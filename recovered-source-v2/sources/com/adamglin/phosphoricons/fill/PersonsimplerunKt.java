package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplerun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleRun", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleRun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplerunKt {
    private static ImageVector _personSimpleRun;

    public static final ImageVector getPersonSimpleRun(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(120.0f, 56.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.28f, 130.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.6f, -4.0f);
        pathBuilder.curveToRelative(-0.25f, 0.12f, -26.71f, 10.72f, -72.18f, -20.19f);
        pathBuilder.curveToRelative(-52.29f, -35.54f, -88.0f, -7.77f, -89.51f, -6.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.0f, 12.48f);
        pathBuilder.curveToRelative(0.26f, -0.21f, 25.12f, -19.5f, 64.07f, 3.27f);
        pathBuilder.curveToRelative(-4.25f, 13.35f, -12.76f, 31.82f, -25.25f, 47.0f);
        pathBuilder.curveToRelative(-18.56f, 22.48f, -41.11f, 32.56f, -67.0f, 30.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 31.2f, 208.0f);
        pathBuilder.arcToRelative(92.29f, 92.29f, 0.0f, false, false, 9.34f, 0.47f);
        pathBuilder.curveToRelative(27.38f, 0.0f, 52.0f, -12.38f, 71.63f, -36.18f);
        pathBuilder.curveToRelative(0.57f, -0.69f, 1.14f, -1.4f, 1.69f, -2.1f);
        pathBuilder.curveTo(133.31f, 175.29f, 168.0f, 190.3f, 168.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -24.65f, -10.08f, -45.35f, -29.15f, -59.86f);
        pathBuilder.arcToRelative(104.29f, 104.29f, 0.0f, false, false, -31.31f, -15.81f);
        pathBuilder.arcTo(169.31f, 169.31f, 0.0f, false, false, 139.0f, 124.0f);
        pathBuilder.curveToRelative(26.14f, 16.09f, 46.84f, 20.0f, 60.69f, 20.0f);
        pathBuilder.curveToRelative(12.18f, 0.0f, 19.06f, -3.0f, 19.67f, -3.28f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 223.28f, 130.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleRun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
