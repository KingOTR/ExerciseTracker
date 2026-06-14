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

/* compiled from: Horse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Horse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHorse", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_horse", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorseKt {
    private static ImageVector _horse;

    public static final ImageVector getHorse(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _horse;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Horse", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 104.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 129.53f);
        pathBuilder.arcTo(108.3f, 108.3f, 0.0f, false, true, 130.18f, 236.0f);
        pathBuilder.lineToRelative(-2.25f, 0.0f);
        pathBuilder.arcTo(107.31f, 107.31f, 0.0f, false, true, 56.0f, 208.94f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.0f, -17.88f);
        pathBuilder.arcToRelative(81.42f, 81.42f, 0.0f, false, false, 16.2f, 11.26f);
        pathBuilder.lineToRelative(21.54f, -29.62f);
        pathBuilder.curveToRelative(-20.4f, -7.0f, -41.91f, -3.33f, -54.43f, -1.21f);
        pathBuilder.arcToRelative(35.79f, 35.79f, 0.0f, false, true, -35.25f, -14.43f);
        pathBuilder.curveToRelative(-0.16f, -0.21f, -0.31f, -0.43f, -0.45f, -0.65f);
        pathBuilder.lineToRelative(-13.78f, -22.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 9.43f, 118.0f);
        pathBuilder.lineTo(108.0f, 53.51f);
        pathBuilder.lineTo(108.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, false, true, 236.0f, 129.53f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 129.2f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -80.0f, -85.11f);
        pathBuilder.lineTo(132.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.43f, 10.0f);
        pathBuilder.lineTo(32.41f, 131.61f);
        pathBuilder.lineToRelative(7.31f, 11.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.58f, 4.54f);
        pathBuilder.curveToRelative(16.23f, -2.75f, 49.4f, -8.36f, 79.64f, 8.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.arcToRelative(60.09f, 60.09f, 0.0f, false, true, -53.64f, 59.66f);
        pathBuilder.lineToRelative(-22.45f, 30.87f);
        pathBuilder.arcToRelative(87.57f, 87.57f, 0.0f, false, false, 17.8f, 1.45f);
        pathBuilder.arcTo(84.29f, 84.29f, 0.0f, false, false, 212.0f, 129.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _horse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
