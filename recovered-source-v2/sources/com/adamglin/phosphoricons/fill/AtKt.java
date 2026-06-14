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

/* compiled from: At.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"At", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAt", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_at", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtKt {
    private static ImageVector _at;

    public static final ImageVector getAt(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _at;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("At", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 0.51f, 0.0f, 1.0f, 0.0f, 1.52f);
        pathBuilder.curveToRelative(-0.34f, 14.26f, -5.63f, 30.48f, -28.0f, 30.48f);
        pathBuilder.curveToRelative(-23.14f, 0.0f, -28.0f, -17.4f, -28.0f, -32.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, -8.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 160.0f, 88.27f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 6.73f, 64.05f);
        pathBuilder.arcToRelative(40.19f, 40.19f, 0.0f, false, false, 3.38f, 5.0f);
        pathBuilder.curveTo(175.48f, 168.0f, 185.71f, 176.0f, 204.0f, 176.0f);
        pathBuilder.arcToRelative(54.81f, 54.81f, 0.0f, false, false, 9.22f, -0.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.09f, 6.0f);
        pathBuilder.arcTo(104.05f, 104.05f, 0.0f, false, true, 125.91f, 232.0f);
        pathBuilder.curveTo(71.13f, 230.9f, 26.2f, 186.86f, 24.08f, 132.11f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 128.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _at = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
