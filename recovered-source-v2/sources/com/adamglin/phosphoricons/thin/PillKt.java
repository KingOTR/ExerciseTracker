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

/* compiled from: Pill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPill", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PillKt {
    private static ImageVector _pill;

    public static final ImageVector getPill(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pill", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(186.84f, 85.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 186.84f, 85.17f);
        pathBuilder.close();
        pathBuilder.moveTo(213.59f, 112.08f);
        pathBuilder.lineTo(112.08f, 213.57f);
        pathBuilder.arcToRelative(49.26f, 49.26f, 0.0f, false, true, -69.67f, -69.65f);
        pathBuilder.lineTo(143.92f, 42.43f);
        pathBuilder.arcToRelative(49.26f, 49.26f, 0.0f, false, true, 69.67f, 69.65f);
        pathBuilder.close();
        pathBuilder.moveTo(154.35f, 160.0f);
        pathBuilder.lineTo(96.0f, 101.66f);
        pathBuilder.lineTo(48.06f, 149.57f);
        pathBuilder.arcToRelative(41.26f, 41.26f, 0.0f, false, false, 58.36f, 58.35f);
        pathBuilder.close();
        pathBuilder.moveTo(207.94f, 48.08f);
        pathBuilder.arcToRelative(41.28f, 41.28f, 0.0f, false, false, -58.36f, 0.0f);
        pathBuilder.lineTo(101.65f, 96.0f);
        pathBuilder.lineTo(160.0f, 154.34f);
        pathBuilder.lineToRelative(47.93f, -47.91f);
        pathBuilder.arcTo(41.32f, 41.32f, 0.0f, false, false, 207.94f, 48.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
