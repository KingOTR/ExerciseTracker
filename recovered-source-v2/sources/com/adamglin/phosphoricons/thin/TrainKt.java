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

/* compiled from: Train.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Train", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTrain", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_train", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainKt {
    private static ImageVector _train;

    public static final ImageVector getTrain(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _train;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Train", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 28.0f);
        pathBuilder.lineTo(72.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 56.0f);
        pathBuilder.lineTo(44.0f, 184.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f);
        pathBuilder.lineTo(88.0f, 212.0f);
        pathBuilder.lineTo(68.8f, 237.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.4f, 4.8f);
        pathBuilder.lineTo(98.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.lineToRelative(22.8f, 30.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, -4.8f);
        pathBuilder.lineTo(168.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f);
        pathBuilder.lineTo(212.0f, 56.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 184.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 124.0f);
        pathBuilder.lineTo(52.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(132.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 36.0f);
        pathBuilder.lineTo(184.0f, 36.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.lineTo(204.0f, 68.0f);
        pathBuilder.lineTo(52.0f, 68.0f);
        pathBuilder.lineTo(52.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 204.0f);
        pathBuilder.lineTo(72.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(52.0f, 132.0f);
        pathBuilder.lineTo(204.0f, 132.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 184.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 172.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 172.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _train = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
