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

/* compiled from: Eyeslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEyeSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeslashKt {
    private static ImageVector _eyeSlash;

    public static final ImageVector getEyeSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _eyeSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(96.68f, 57.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.08f, -6.6f);
        pathBuilder.arcTo(130.13f, 130.13f, 0.0f, false, true, 128.0f, 48.0f);
        pathBuilder.curveToRelative(34.88f, 0.0f, 66.57f, 13.26f, 91.66f, 38.35f);
        pathBuilder.curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 6.5f);
        pathBuilder.curveToRelative(-0.35f, 0.79f, -8.82f, 19.57f, -27.65f, 38.4f);
        pathBuilder.quadToRelative(-4.28f, 4.26f, -8.79f, 8.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.55f, -0.36f);
        pathBuilder.close();
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(180.0f, 197.13f);
        pathBuilder.arcTo(127.21f, 127.21f, 0.0f, false, true, 128.0f, 208.0f);
        pathBuilder.curveToRelative(-34.88f, 0.0f, -66.57f, -13.26f, -91.66f, -38.34f);
        pathBuilder.curveTo(17.51f, 150.83f, 9.0f, 132.05f, 8.69f, 131.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -6.5f);
        pathBuilder.curveTo(9.0f, 124.0f, 17.51f, 105.18f, 36.34f, 86.35f);
        pathBuilder.arcToRelative(135.0f, 135.0f, 0.0f, false, true, 25.0f, -19.78f);
        pathBuilder.lineTo(42.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(148.43f, 162.37f);
        pathBuilder.lineTo(95.74f, 104.37f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 52.69f, 58.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
