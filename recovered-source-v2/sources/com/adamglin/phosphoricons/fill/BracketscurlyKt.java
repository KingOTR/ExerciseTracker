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

/* compiled from: Bracketscurly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsCurly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBracketsCurly", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsCurly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketscurlyKt {
    private static ImageVector _bracketsCurly;

    public static final ImageVector getBracketsCurly(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bracketsCurly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsCurly", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 155.84f);
        pathBuilder.curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16.0f, 20.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveToRelative(-31.27f, 0.0f, -31.72f, -22.43f, -32.0f, -35.84f);
        pathBuilder.curveTo(71.71f, 141.9f, 71.59f, 136.0f, 56.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.curveToRelative(15.59f, 0.0f, 15.71f, -5.9f, 16.0f, -20.16f);
        pathBuilder.curveTo(72.28f, 86.43f, 72.73f, 64.0f, 104.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveToRelative(-15.59f, 0.0f, -15.71f, 5.9f, -16.0f, 20.16f);
        pathBuilder.curveToRelative(-0.17f, 8.31f, -0.41f, 20.09f, -8.0f, 27.84f);
        pathBuilder.curveTo(87.59f, 135.75f, 87.83f, 147.53f, 88.0f, 155.84f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 136.0f);
        pathBuilder.curveToRelative(-15.59f, 0.0f, -15.71f, 5.9f, -16.0f, 20.16f);
        pathBuilder.curveToRelative(-0.28f, 13.41f, -0.73f, 35.84f, -32.0f, 35.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.curveToRelative(15.59f, 0.0f, 15.71f, -5.9f, 16.0f, -20.16f);
        pathBuilder.curveToRelative(0.17f, -8.31f, 0.41f, -20.09f, 8.0f, -27.84f);
        pathBuilder.curveToRelative(-7.6f, -7.75f, -7.84f, -19.53f, -8.0f, -27.84f);
        pathBuilder.curveTo(167.71f, 85.9f, 167.59f, 80.0f, 152.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.curveToRelative(31.27f, 0.0f, 31.72f, 22.43f, 32.0f, 35.84f);
        pathBuilder.curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16.0f, 20.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsCurly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
