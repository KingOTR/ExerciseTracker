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

/* compiled from: Bracketsangle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsAngle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBracketsAngle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsAngle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketsangleKt {
    private static ImageVector _bracketsAngle;

    public static final ImageVector getBracketsAngle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bracketsAngle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsAngle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(85.06f, 43.22f);
        pathBuilder.lineTo(31.11f, 128.0f);
        pathBuilder.lineToRelative(54.0f, 84.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.84f, 8.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.28f, -1.84f);
        pathBuilder.lineToRelative(-56.0f, -88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -6.44f);
        pathBuilder.lineToRelative(56.0f, -88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.12f, 6.44f);
        pathBuilder.close();
        pathBuilder.moveTo(237.06f, 124.78f);
        pathBuilder.lineTo(181.06f, 36.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.12f, 6.44f);
        pathBuilder.lineTo(224.89f, 128.0f);
        pathBuilder.lineToRelative(-53.95f, 84.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.84f, 8.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.28f, -1.84f);
        pathBuilder.lineToRelative(56.0f, -88.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 237.06f, 124.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsAngle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
