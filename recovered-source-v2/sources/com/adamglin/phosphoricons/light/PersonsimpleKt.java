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

/* compiled from: Personsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleKt {
    private static ImageVector _personSimple;

    public static final ImageVector getPersonSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 78.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 48.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 30.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.14f, 131.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.23f, 2.0f);
        pathBuilder.curveToRelative(-0.37f, -0.21f, -36.49f, -21.43f, -86.91f, -23.0f);
        pathBuilder.verticalLineToRelative(39.61f);
        pathBuilder.lineTo(196.48f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, 8.0f);
        pathBuilder.lineTo(128.0f, 161.0f);
        pathBuilder.lineTo(68.48f, 228.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -8.0f);
        pathBuilder.lineTo(122.0f, 149.72f);
        pathBuilder.lineTo(122.0f, 110.11f);
        pathBuilder.curveToRelative(-50.42f, 1.6f, -86.55f, 22.82f, -86.92f, 23.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.17f, -10.29f);
        pathBuilder.curveTo(30.6f, 121.84f, 71.0f, 98.0f, 128.0f, 98.0f);
        pathBuilder.reflectiveCurveToRelative(97.39f, 23.84f, 99.09f, 24.86f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 229.14f, 131.09f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
