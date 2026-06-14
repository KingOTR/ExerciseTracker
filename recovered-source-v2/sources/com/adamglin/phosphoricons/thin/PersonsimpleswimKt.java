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

/* compiled from: Personsimpleswim.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSwim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPersonSimpleSwim", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSwim", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleswimKt {
    private static ImageVector _personSimpleSwim;

    public static final ImageVector getPersonSimpleSwim(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(176.0f, 100.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 176.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 52.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.08f, 187.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.53f, 5.63f);
        pathBuilder.curveTo(203.56f, 205.9f, 188.9f, 212.0f, 173.93f, 212.0f);
        pathBuilder.arcToRelative(54.84f, 54.84f, 0.0f, false, true, -6.12f, -0.34f);
        pathBuilder.curveToRelative(-15.0f, -1.65f, -28.6f, -9.0f, -41.72f, -16.14f);
        pathBuilder.curveToRelative(-25.52f, -13.86f, -49.62f, -27.0f, -83.54f, 1.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, -6.16f);
        pathBuilder.curveToRelative(17.0f, -14.12f, 33.62f, -20.07f, 50.74f, -18.19f);
        pathBuilder.curveToRelative(15.0f, 1.65f, 28.6f, 9.0f, 41.72f, 16.14f);
        pathBuilder.curveToRelative(25.52f, 13.86f, 49.62f, 26.94f, 83.54f, -1.18f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 219.08f, 187.84f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 84.0f);
        pathBuilder.lineTo(64.24f, 84.0f);
        pathBuilder.arcToRelative(91.4f, 91.4f, 0.0f, false, true, 48.37f, 13.73f);
        pathBuilder.lineTo(78.19f, 132.16f);
        pathBuilder.curveToRelative(-13.63f, 1.0f, -27.0f, 7.0f, -40.74f, 18.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.1f, 6.16f);
        pathBuilder.curveToRelative(33.92f, -28.13f, 58.0f, -15.0f, 83.54f, -1.18f);
        pathBuilder.curveToRelative(13.12f, 7.12f, 26.69f, 14.49f, 41.72f, 16.14f);
        pathBuilder.arcToRelative(54.84f, 54.84f, 0.0f, false, false, 6.12f, 0.34f);
        pathBuilder.curveToRelative(15.0f, 0.0f, 29.63f, -6.1f, 44.62f, -18.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.1f, -6.16f);
        pathBuilder.curveToRelative(-8.12f, 6.73f, -15.68f, 11.1f, -22.83f, 13.66f);
        pathBuilder.lineTo(135.0f, 105.29f);
        pathBuilder.arcTo(99.34f, 99.34f, 0.0f, false, false, 64.24f, 76.0f);
        pathBuilder.lineTo(40.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.66f, 163.32f);
        pathBuilder.curveToRelative(-18.77f, 3.07f, -35.0f, -5.71f, -51.75f, -14.83f);
        pathBuilder.curveToRelative(-12.83f, -7.0f, -26.09f, -14.15f, -40.73f, -16.0f);
        pathBuilder.lineToRelative(30.16f, -30.16f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, true, 9.95f, 8.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSwim = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
