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

/* compiled from: Tennisball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TennisBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTennisBall", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tennisBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TennisballKt {
    private static ImageVector _tennisBall;

    public static final ImageVector getTennisBall(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _tennisBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TennisBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.81f, 115.41f);
        pathBuilder.arcToRelative(103.9f, 103.9f, 0.0f, false, true, 90.6f, -90.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.47f, 3.79f);
        pathBuilder.arcToRelative(87.82f, 87.82f, 0.0f, false, true, -91.27f, 91.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 24.81f, 115.41f);
        pathBuilder.close();
        pathBuilder.moveTo(227.35f, 136.11f);
        pathBuilder.curveToRelative(-1.12f, 0.0f, -2.23f, -0.07f, -3.35f, -0.07f);
        pathBuilder.arcToRelative(87.84f, 87.84f, 0.0f, false, false, -87.88f, 91.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.47f, 3.79f);
        pathBuilder.arcToRelative(103.9f, 103.9f, 0.0f, false, false, 90.6f, -90.66f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 227.35f, 136.11f);
        pathBuilder.close();
        pathBuilder.moveTo(150.46f, 150.46f);
        pathBuilder.arcTo(103.33f, 103.33f, 0.0f, false, true, 224.0f, 120.0f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.06f, 0.0f, 3.09f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.12f, -4.43f);
        pathBuilder.arcToRelative(103.91f, 103.91f, 0.0f, false, false, -90.88f, -90.89f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.43f, 4.12f);
        pathBuilder.arcToRelative(103.72f, 103.72f, 0.0f, false, true, -30.36f, 76.7f);
        pathBuilder.arcTo(103.33f, 103.33f, 0.0f, false, true, 32.0f, 136.0f);
        pathBuilder.curveToRelative(-1.0f, 0.0f, -2.06f, 0.0f, -3.09f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 4.43f);
        pathBuilder.arcToRelative(103.91f, 103.91f, 0.0f, false, false, 90.88f, 90.89f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.43f, -4.12f);
        pathBuilder.arcTo(103.72f, 103.72f, 0.0f, false, true, 150.46f, 150.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tennisBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
