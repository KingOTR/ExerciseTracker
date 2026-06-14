package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplerun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPersonSimpleRun", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleRun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplerunKt {
    private static ImageVector _personSimpleRun;

    public static final ImageVector getPersonSimpleRun(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 88.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 152.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.31f, 140.68f);
        pathBuilder.curveToRelative(-0.61f, 0.28f, -7.49f, 3.28f, -19.67f, 3.28f);
        pathBuilder.curveToRelative(-13.85f, 0.0f, -34.55f, -3.88f, -60.69f, -20.0f);
        pathBuilder.arcToRelative(169.31f, 169.31f, 0.0f, false, true, -15.41f, 32.34f);
        pathBuilder.arcToRelative(104.29f, 104.29f, 0.0f, false, true, 31.31f, 15.81f);
        pathBuilder.curveTo(173.92f, 186.65f, 184.0f, 207.35f, 184.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -41.7f, -34.69f, -56.71f, -54.14f, -61.85f);
        pathBuilder.curveToRelative(-0.55f, 0.7f, -1.12f, 1.41f, -1.69f, 2.1f);
        pathBuilder.curveToRelative(-19.64f, 23.8f, -44.25f, 36.18f, -71.63f, 36.18f);
        pathBuilder.arcTo(92.29f, 92.29f, 0.0f, false, true, 31.2f, 208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.8f, 192.0f);
        pathBuilder.curveToRelative(25.92f, 2.58f, 48.47f, -7.49f, 67.0f, -30.0f);
        pathBuilder.curveToRelative(12.49f, -15.14f, 21.0f, -33.61f, 25.25f, -47.0f);
        pathBuilder.curveTo(86.13f, 92.35f, 61.27f, 111.63f, 61.0f, 111.84f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 51.0f, 99.36f);
        pathBuilder.curveToRelative(1.5f, -1.2f, 37.22f, -29.0f, 89.51f, 6.57f);
        pathBuilder.curveToRelative(45.47f, 30.91f, 71.93f, 20.31f, 72.18f, 20.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.63f, 14.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleRun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
