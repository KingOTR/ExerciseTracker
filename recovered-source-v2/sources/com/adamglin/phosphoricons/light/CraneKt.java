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

/* compiled from: Crane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCrane", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CraneKt {
    private static ImageVector _crane;

    public static final ImageVector getCrane(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _crane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Crane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.09f, 18.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.91f, -0.15f);
        pathBuilder.lineTo(102.5f, 82.0f);
        pathBuilder.lineTo(32.0f, 82.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f);
        pathBuilder.lineTo(18.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(134.0f, 168.0f);
        pathBuilder.arcToRelative(6.28f, 6.28f, 0.0f, false, false, -0.25f, -1.72f);
        pathBuilder.lineTo(111.16f, 91.0f);
        pathBuilder.lineTo(218.0f, 34.0f);
        pathBuilder.lineTo(218.0f, 160.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(200.0f, 162.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 227.09f, 18.86f);
        pathBuilder.close();
        pathBuilder.moveTo(99.54f, 94.0f);
        pathBuilder.lineToRelative(20.4f, 68.0f);
        pathBuilder.lineTo(62.0f, 162.0f);
        pathBuilder.lineTo(62.0f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 94.0f);
        pathBuilder.lineTo(50.0f, 94.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(30.0f, 162.0f);
        pathBuilder.lineTo(30.0f, 96.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 202.0f);
        pathBuilder.lineTo(32.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(30.0f, 174.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 120.0f, 202.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
