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

/* compiled from: Spade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpade", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpadeKt {
    private static ImageVector _spade;

    public static final ImageVector getSpade(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(133.37f, 13.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.curveTo(118.44f, 15.36f, 20.0f, 65.4f, 20.0f, 136.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 69.51f, 59.25f);
        pathBuilder.lineToRelative(-5.28f, 26.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 236.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.77f, -14.35f);
        pathBuilder.lineToRelative(-5.28f, -26.4f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 236.0f, 136.0f);
        pathBuilder.curveTo(236.0f, 65.4f, 137.56f, 15.36f, 133.37f, 13.27f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 172.0f);
        pathBuilder.arcToRelative(35.88f, 35.88f, 0.0f, false, true, -19.09f, -5.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.14f, 12.52f);
        pathBuilder.lineTo(145.36f, 212.0f);
        pathBuilder.horizontalLineTo(110.64f);
        pathBuilder.lineToRelative(6.59f, -32.95f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.14f, -12.52f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 44.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -28.29f, 23.57f, -53.95f, 43.34f, -70.49f);
        pathBuilder.arcTo(274.68f, 274.68f, 0.0f, false, true, 128.0f, 37.63f);
        pathBuilder.arcToRelative(274.16f, 274.16f, 0.0f, false, true, 40.66f, 27.88f);
        pathBuilder.curveTo(188.43f, 82.05f, 212.0f, 107.71f, 212.0f, 136.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 176.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
