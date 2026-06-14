package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pintglass.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PintGlass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPintGlass", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pintGlass", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PintglassKt {
    private static ImageVector _pintGlass;

    public static final ImageVector getPintGlass(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pintGlass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PintGlass", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(203.0f, 29.35f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 28.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.48f);
        pathBuilder.lineToRelative(23.15f, 193.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 87.1f, 236.0f);
        pathBuilder.horizontalLineToRelative(81.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.92f, -10.57f);
        pathBuilder.lineTo(204.0f, 32.48f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 203.0f, 29.35f);
        pathBuilder.close();
        pathBuilder.moveTo(195.49f, 36.0f);
        pathBuilder.lineToRelative(-3.84f, 32.0f);
        pathBuilder.horizontalLineTo(64.35f);
        pathBuilder.lineTo(60.51f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.87f, 224.48f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 3.52f);
        pathBuilder.horizontalLineTo(87.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.52f);
        pathBuilder.lineTo(65.31f, 76.0f);
        pathBuilder.horizontalLineTo(190.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pintGlass = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
