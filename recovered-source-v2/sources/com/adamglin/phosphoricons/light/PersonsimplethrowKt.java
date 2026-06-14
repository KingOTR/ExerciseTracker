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

/* compiled from: Personsimplethrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleThrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleThrow", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleThrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplethrowKt {
    private static ImageVector _personSimpleThrow;

    public static final ImageVector getPersonSimpleThrow(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleThrow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleThrow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 86.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 56.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(50.0f, 96.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 50.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.68f, 109.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.41f, 1.0f);
        pathBuilder.curveToRelative(-1.17f, -0.92f, -25.06f, -18.91f, -62.52f, 0.94f);
        pathBuilder.arcToRelative(214.64f, 214.64f, 0.0f, false, true, -3.23f, 32.38f);
        pathBuilder.lineToRelative(33.32f, 27.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.85f, 6.51f);
        pathBuilder.lineToRelative(-16.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.38f, -3.8f);
        pathBuilder.lineTo(169.0f, 178.0f);
        pathBuilder.lineToRelative(-25.49f, -21.25f);
        pathBuilder.arcToRelative(141.0f, 141.0f, 0.0f, false, true, -5.86f, 17.07f);
        pathBuilder.curveTo(124.15f, 206.0f, 100.0f, 227.48f, 65.73f, 237.75f);
        pathBuilder.arcTo(6.14f, 6.14f, 0.0f, false, true, 64.0f, 238.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.72f, -11.75f);
        pathBuilder.curveToRelative(64.82f, -19.45f, 73.42f, -78.76f, 75.11f, -107.41f);
        pathBuilder.curveTo(109.0f, 137.65f, 86.8f, 142.0f, 72.39f, 142.0f);
        pathBuilder.curveToRelative(-11.71f, 0.0f, -18.29f, -2.86f, -18.88f, -3.13f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.0f, -10.92f);
        pathBuilder.curveToRelative(0.21f, 0.09f, 27.6f, 11.28f, 74.14f, -20.35f);
        pathBuilder.curveToRelative(26.44f, -18.0f, 48.5f, -19.0f, 62.36f, -16.67f);
        pathBuilder.curveToRelative(15.37f, 2.57f, 24.39f, 9.7f, 24.76f, 10.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 220.68f, 109.35f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleThrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
