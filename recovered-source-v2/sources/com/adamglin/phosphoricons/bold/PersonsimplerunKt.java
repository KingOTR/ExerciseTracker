package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplerun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimpleRun", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleRun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplerunKt {
    private static ImageVector _personSimpleRun;

    public static final ImageVector getPersonSimpleRun(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 92.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 137.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.0f, 10.91f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, -21.47f, 3.78f);
        pathBuilder.curveToRelative(-14.0f, 0.0f, -34.25f, -3.82f, -59.77f, -19.0f);
        pathBuilder.arcToRelative(177.0f, 177.0f, 0.0f, false, true, -10.27f, 21.0f);
        pathBuilder.curveTo(153.12f, 162.83f, 188.0f, 183.8f, 188.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -18.69f, -6.95f, -33.06f, -21.26f, -43.94f);
        pathBuilder.curveToRelative(-9.16f, -7.0f, -19.55f, -11.0f, -27.43f, -13.34f);
        pathBuilder.curveToRelative(-0.81f, 1.0f, -1.64f, 2.0f, -2.5f, 2.95f);
        pathBuilder.curveToRelative(-20.0f, 22.87f, -44.82f, 34.76f, -72.25f, 34.76f);
        pathBuilder.arcToRelative(97.33f, 97.33f, 0.0f, false, true, -9.75f, -0.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 2.39f, -23.88f);
        pathBuilder.curveToRelative(52.3f, 5.22f, 77.48f, -45.92f, 85.79f, -67.75f);
        pathBuilder.curveTo(84.8f, 102.46f, 63.74f, 118.78f, 63.51f, 119.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, -18.72f);
        pathBuilder.curveTo(50.08f, 99.0f, 88.0f, 69.44f, 142.75f, 106.62f);
        pathBuilder.curveToRelative(43.1f, 29.31f, 68.1f, 19.92f, 68.5f, 19.76f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.75f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleRun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
