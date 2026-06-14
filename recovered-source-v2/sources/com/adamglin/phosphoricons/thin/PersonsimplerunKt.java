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

/* compiled from: Personsimplerun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPersonSimpleRun", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleRun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplerunKt {
    private static ImageVector _personSimpleRun;

    public static final ImageVector getPersonSimpleRun(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 84.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 36.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.66f, 137.0f);
        pathBuilder.curveToRelative(-0.57f, 0.26f, -6.84f, 3.0f, -18.08f, 3.0f);
        pathBuilder.curveToRelative(-13.86f, 0.0f, -35.25f, -4.15f, -62.81f, -22.16f);
        pathBuilder.arcToRelative(162.59f, 162.59f, 0.0f, false, true, -19.49f, 40.78f);
        pathBuilder.curveToRelative(9.47f, 2.56f, 23.08f, 7.5f, 35.14f, 16.67f);
        pathBuilder.curveToRelative(18.3f, 13.92f, 27.58f, 33.0f, 27.58f, 56.68f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -15.89f, -5.88f, -53.77f, -59.7f, -66.37f);
        pathBuilder.quadToRelative(-1.56f, 2.06f, -3.22f, 4.08f);
        pathBuilder.curveToRelative(-18.85f, 22.83f, -42.42f, 34.72f, -68.6f, 34.72f);
        pathBuilder.quadToRelative(-4.4f, 0.0f, -8.89f, -0.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.8f, -8.0f);
        pathBuilder.curveToRelative(27.33f, 2.73f, 51.06f, -7.83f, 70.52f, -31.41f);
        pathBuilder.curveToRelative(13.82f, -16.74f, 22.89f, -37.44f, 26.9f, -51.32f);
        pathBuilder.curveToRelative(-42.84f, -26.69f, -71.0f, -4.8f, -71.32f, -4.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.0f, -6.24f);
        pathBuilder.curveToRelative(0.36f, -0.29f, 9.0f, -7.1f, 23.84f, -9.58f);
        pathBuilder.curveToRelative(13.5f, -2.27f, 35.0f, -1.26f, 60.91f, 16.34f);
        pathBuilder.curveToRelative(25.0f, 17.0f, 44.41f, 21.64f, 56.29f, 22.56f);
        pathBuilder.curveToRelative(12.75f, 1.0f, 19.77f, -2.0f, 19.84f, -2.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.29f, 7.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleRun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
