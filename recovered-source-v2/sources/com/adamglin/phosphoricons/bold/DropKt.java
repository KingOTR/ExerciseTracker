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

/* compiled from: Drop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDrop", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropKt {
    private static ImageVector _drop;

    public static final ImageVector getDrop(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _drop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Drop", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.88f, 6.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f);
        pathBuilder.arcToRelative(259.0f, 259.0f, 0.0f, false, false, -42.18f, 39.0f);
        pathBuilder.curveTo(50.85f, 77.43f, 36.0f, 111.62f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.curveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.curveToRelative(0.0f, -33.31f, 20.0f, -63.37f, 36.7f, -82.71f);
        pathBuilder.arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 31.11f);
        pathBuilder.arcToRelative(249.35f, 249.35f, 0.0f, false, true, 31.3f, 30.18f);
        pathBuilder.curveTo(176.0f, 80.63f, 196.0f, 110.69f, 196.0f, 144.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.62f, 159.6f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -34.0f, 34.0f);
        pathBuilder.arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, 0.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.45f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.32f, -18.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, 7.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
