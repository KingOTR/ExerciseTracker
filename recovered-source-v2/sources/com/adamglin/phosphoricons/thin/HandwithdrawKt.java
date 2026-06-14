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

/* compiled from: Handwithdraw.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandWithdraw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandWithdraw", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handWithdraw", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandwithdrawKt {
    private static ImageVector _handWithdraw;

    public static final ImageVector getHandWithdraw(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handWithdraw;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandWithdraw", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 198.65f);
        pathBuilder.lineTo(228.0f, 240.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(220.0f, 198.65f);
        pathBuilder.arcToRelative(78.83f, 78.83f, 0.0f, false, false, -32.0f, -63.18f);
        pathBuilder.verticalLineToRelative(66.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.35f, 2.19f);
        pathBuilder.lineTo(170.0f, 188.19f);
        pathBuilder.lineToRelative(-0.12f, -0.19f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.77f, 15.91f);
        pathBuilder.lineToRelative(22.2f, 33.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.69f, 4.38f);
        pathBuilder.lineToRelative(-22.26f, -34.0f);
        pathBuilder.arcToRelative(1.22f, 1.22f, 0.0f, false, true, -0.12f, -0.19f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.51f, -24.1f);
        pathBuilder.lineToRelative(3.27f, 5.0f);
        pathBuilder.lineTo(180.02f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(160.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(61.78f);
        pathBuilder.arcTo(86.84f, 86.84f, 0.0f, false, true, 228.0f, 198.65f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 52.0f);
        pathBuilder.lineTo(64.0f, 52.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 64.0f);
        pathBuilder.lineTo(52.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(60.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(80.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.83f, 101.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f);
        pathBuilder.lineTo(124.0f, 126.34f);
        pathBuilder.lineTo(124.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 126.34f);
        pathBuilder.lineTo(90.83f, 101.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 154.83f, 101.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handWithdraw = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
