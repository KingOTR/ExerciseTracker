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

/* compiled from: Personsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPersonSimple", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleKt {
    private static ImageVector _personSimple;

    public static final ImageVector getPersonSimple(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _personSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 80.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 48.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.86f, 132.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, 2.74f);
        pathBuilder.curveToRelative(-0.35f, -0.21f, -35.11f, -20.59f, -83.88f, -22.67f);
        pathBuilder.lineTo(135.98f, 149.0f);
        pathBuilder.lineToRelative(62.0f, 69.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, 10.62f);
        pathBuilder.lineTo(128.0f, 164.0f);
        pathBuilder.lineTo(70.0f, 229.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.62f);
        pathBuilder.lineTo(120.0f, 149.0f);
        pathBuilder.lineTo(120.0f, 112.18f);
        pathBuilder.curveToRelative(-49.0f, 2.08f, -83.52f, 22.46f, -83.88f, 22.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.23f, -13.72f);
        pathBuilder.curveTo(29.6f, 120.11f, 70.45f, 96.0f, 128.0f, 96.0f);
        pathBuilder.reflectiveCurveToRelative(98.4f, 24.11f, 100.12f, 25.14f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 230.86f, 132.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
