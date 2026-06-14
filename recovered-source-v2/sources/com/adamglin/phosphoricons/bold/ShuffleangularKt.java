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

/* compiled from: Shuffleangular.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShuffleAngular", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getShuffleAngular", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shuffleAngular", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShuffleangularKt {
    private static ImageVector _shuffleAngular;

    public static final ImageVector getShuffleAngular(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _shuffleAngular;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShuffleAngular", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.49f, 175.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(203.0f, 196.0f);
        pathBuilder.lineTo(168.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.76f, -5.0f);
        pathBuilder.lineTo(81.82f, 84.0f);
        pathBuilder.lineTo(32.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(88.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.76f, 5.0f);
        pathBuilder.lineToRelative(76.42f, 107.0f);
        pathBuilder.lineTo(203.0f, 172.0f);
        pathBuilder.lineToRelative(-3.52f, -3.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(110.4f, 152.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.74f, 2.79f);
        pathBuilder.lineTo(81.82f, 172.0f);
        pathBuilder.lineTo(32.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(88.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.76f, -5.0f);
        pathBuilder.lineToRelative(15.43f, -21.59f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 110.4f, 152.64f);
        pathBuilder.close();
        pathBuilder.moveTo(145.6f, 103.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.74f, -2.79f);
        pathBuilder.lineTo(174.18f, 84.0f);
        pathBuilder.lineTo(203.0f, 84.0f);
        pathBuilder.lineToRelative(-3.52f, 3.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(203.0f, 60.0f);
        pathBuilder.lineTo(168.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.76f, 5.0f);
        pathBuilder.lineToRelative(-15.43f, 21.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 145.6f, 103.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shuffleAngular = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
