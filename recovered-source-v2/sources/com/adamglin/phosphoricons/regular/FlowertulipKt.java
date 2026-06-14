package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flowertulip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlowerTulip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlowerTulip", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flowerTulip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowertulipKt {
    private static ImageVector _flowerTulip;

    public static final ImageVector getFlowerTulip(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flowerTulip;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlowerTulip", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 48.0f);
        pathBuilder.arcToRelative(87.48f, 87.48f, 0.0f, false, false, -35.36f, 7.43f);
        pathBuilder.curveToRelative(-15.1f, -25.37f, -39.92f, -38.0f, -41.06f, -38.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder.curveToRelative(-1.14f, 0.58f, -26.0f, 13.22f, -41.06f, 38.59f);
        pathBuilder.arcTo(87.48f, 87.48f, 0.0f, false, false, 48.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(40.0f, 96.0f);
        pathBuilder.arcToRelative(88.11f, 88.11f, 0.0f, false, false, 80.0f, 87.63f);
        pathBuilder.verticalLineToRelative(35.43f);
        pathBuilder.lineTo(83.58f, 200.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.32f);
        pathBuilder.lineToRelative(48.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f);
        pathBuilder.lineToRelative(48.0f, -24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, -14.32f);
        pathBuilder.lineTo(136.0f, 219.06f);
        pathBuilder.lineTo(136.0f, 183.63f);
        pathBuilder.arcTo(88.11f, 88.11f, 0.0f, false, false, 216.0f, 96.0f);
        pathBuilder.lineTo(216.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 167.56f);
        pathBuilder.arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 96.0f);
        pathBuilder.lineTo(56.0f, 64.44f);
        pathBuilder.arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 99.36f);
        pathBuilder.arcTo(88.4f, 88.4f, 0.0f, false, false, 97.36f, 63.19f);
        pathBuilder.curveToRelative(9.57f, -15.79f, 24.0f, -25.9f, 30.64f, -30.0f);
        pathBuilder.curveToRelative(6.65f, 4.08f, 21.08f, 14.19f, 30.64f, 30.0f);
        pathBuilder.arcTo(88.46f, 88.46f, 0.0f, false, false, 128.0f, 99.36f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 96.0f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f);
        pathBuilder.lineTo(136.0f, 136.0f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flowerTulip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
