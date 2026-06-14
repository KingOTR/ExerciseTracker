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

/* compiled from: Spade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpade", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpadeKt {
    private static ImageVector _spade;

    public static final ImageVector getSpade(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _spade;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spade", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.56f, 52.93f);
        pathBuilder.arcToRelative(281.08f, 281.08f, 0.0f, false, false, -48.77f, -32.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.arcTo(281.08f, 281.08f, 0.0f, false, false, 77.44f, 52.93f);
        pathBuilder.curveTo(45.1f, 79.88f, 28.0f, 108.61f, 28.0f, 136.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 76.46f, 45.89f);
        pathBuilder.lineToRelative(-12.29f, 41.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.83f, -5.15f);
        pathBuilder.lineToRelative(-12.29f, -41.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 228.0f, 136.0f);
        pathBuilder.curveTo(228.0f, 108.61f, 210.9f, 79.88f, 178.56f, 52.93f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 180.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -28.92f, -10.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.46f, 4.17f);
        pathBuilder.lineToRelative(14.0f, 46.67f);
        pathBuilder.horizontalLineTo(101.38f);
        pathBuilder.lineToRelative(14.0f, -46.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.46f, -4.17f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 36.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -56.06f, 79.0f, -100.56f, 92.0f, -107.49f);
        pathBuilder.curveToRelative(13.0f, 6.93f, 92.0f, 51.38f, 92.0f, 107.49f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 176.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
