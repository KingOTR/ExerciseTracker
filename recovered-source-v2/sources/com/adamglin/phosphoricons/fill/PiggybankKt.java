package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Piggybank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PiggyBank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPiggyBank", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_piggyBank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PiggybankKt {
    private static ImageVector _piggyBank;

    public static final ImageVector getPiggyBank(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _piggyBank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PiggyBank", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.0f, 88.08f);
        pathBuilder.curveToRelative(-0.4f, -1.0f, -0.82f, -2.0f, -1.25f, -3.0f);
        pathBuilder.arcToRelative(87.93f, 87.93f, 0.0f, false, false, -30.17f, -37.0f);
        pathBuilder.lineTo(216.0f, 48.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(112.0f, 32.08f);
        pathBuilder.arcToRelative(88.12f, 88.12f, 0.0f, false, false, -87.72f, 81.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.57f, -14.16f);
        pathBuilder.arcTo(87.69f, 87.69f, 0.0f, false, false, 46.0f, 178.22f);
        pathBuilder.lineToRelative(12.56f, 35.16f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 73.64f, 224.0f);
        pathBuilder.lineTo(86.36f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.07f, -10.62f);
        pathBuilder.lineToRelative(1.92f, -5.38f);
        pathBuilder.horizontalLineToRelative(57.3f);
        pathBuilder.lineToRelative(1.92f, 5.38f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 177.64f, 224.0f);
        pathBuilder.horizontalLineToRelative(12.72f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.07f, -10.62f);
        pathBuilder.lineTo(221.64f, 168.0f);
        pathBuilder.lineTo(224.0f, 168.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder.lineTo(248.0f, 112.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 226.0f, 88.08f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 72.0f);
        pathBuilder.lineTo(112.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _piggyBank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
