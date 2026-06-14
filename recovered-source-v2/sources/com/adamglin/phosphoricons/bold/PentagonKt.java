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

/* compiled from: Pentagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPentagon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagonKt {
    private static ImageVector _pentagon;

    public static final ImageVector getPentagon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pentagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 84.38f);
        pathBuilder.lineToRelative(-87.9f, -68.29f);
        pathBuilder.lineToRelative(-0.26f, -0.2f);
        pathBuilder.arcToRelative(19.92f, 19.92f, 0.0f, false, false, -23.66f, 0.0f);
        pathBuilder.lineToRelative(-0.26f, 0.2f);
        pathBuilder.lineTo(28.0f, 84.38f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.09f, 22.0f);
        pathBuilder.lineToRelative(32.0f, 107.51f);
        pathBuilder.lineToRelative(0.08f, 0.26f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, false, 72.0f, 228.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(19.93f, 19.93f, 0.0f, false, false, 19.0f, -13.87f);
        pathBuilder.lineToRelative(0.08f, -0.26f);
        pathBuilder.lineToRelative(32.0f, -107.51f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 84.38f);
        pathBuilder.close();
        pathBuilder.moveTo(181.0f, 204.0f);
        pathBuilder.horizontalLineTo(75.0f);
        pathBuilder.lineTo(44.62f, 101.87f);
        pathBuilder.lineTo(128.0f, 37.09f);
        pathBuilder.lineToRelative(83.38f, 64.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
