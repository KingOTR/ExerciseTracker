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

/* compiled from: Handspraying.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsPraying", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHandsPraying", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsPraying", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsprayingKt {
    private static ImageVector _handsPraying;

    public static final ImageVector getHandsPraying(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _handsPraying;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsPraying", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.15f, 177.18f);
        pathBuilder.lineToRelative(-35.53f, -35.53f);
        pathBuilder.lineTo(166.45f, 22.3f);
        pathBuilder.arcTo(25.75f, 25.75f, 0.0f, false, false, 128.0f, 8.0f);
        pathBuilder.arcTo(25.75f, 25.75f, 0.0f, false, false, 89.55f, 22.3f);
        pathBuilder.lineTo(53.38f, 141.65f);
        pathBuilder.lineTo(17.85f, 177.18f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f);
        pathBuilder.lineToRelative(32.69f, 32.69f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(48.29f, -48.28f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.6f, -0.62f, 0.89f, -0.94f);
        pathBuilder.curveToRelative(0.29f, 0.32f, 0.58f, 0.63f, 0.89f, 0.94f);
        pathBuilder.lineToRelative(48.29f, 48.28f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(32.69f, -32.69f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 177.18f);
        pathBuilder.close();
        pathBuilder.moveTo(64.68f, 218.35f);
        pathBuilder.lineToRelative(-27.0f, -27.0f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.lineToRelative(27.0f, 27.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 158.75f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, true, -5.86f, 14.14f);
        pathBuilder.lineTo(92.68f, 190.35f);
        pathBuilder.lineToRelative(-27.0f, -27.0f);
        pathBuilder.lineToRelative(6.83f, -6.83f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, -5.0f);
        pathBuilder.lineToRelative(37.0f, -122.23f);
        pathBuilder.arcToRelative(1.78f, 1.78f, 0.0f, false, true, 3.48f, 0.52f);
        pathBuilder.close();
        pathBuilder.moveTo(163.5f, 190.53f);
        pathBuilder.lineTo(145.86f, 172.89f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, true, 140.0f, 158.75f);
        pathBuilder.verticalLineToRelative(-129.0f);
        pathBuilder.arcToRelative(1.78f, 1.78f, 0.0f, false, true, 3.48f, -0.52f);
        pathBuilder.lineToRelative(37.0f, 122.23f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, 5.0f);
        pathBuilder.lineToRelative(7.6f, 7.6f);
        pathBuilder.close();
        pathBuilder.moveTo(191.32f, 218.35f);
        pathBuilder.lineTo(180.47f, 207.51f);
        pathBuilder.lineTo(208.1f, 181.07f);
        pathBuilder.lineTo(218.35f, 191.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsPraying = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
