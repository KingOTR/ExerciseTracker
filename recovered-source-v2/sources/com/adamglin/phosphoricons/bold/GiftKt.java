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

/* compiled from: Gift.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gift", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGift", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gift", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GiftKt {
    private static ImageVector _gift;

    public static final ImageVector getGift(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _gift;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gift", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 68.0f);
        pathBuilder.lineTo(190.06f, 68.0f);
        pathBuilder.arcTo(33.82f, 33.82f, 0.0f, false, false, 196.0f, 49.69f);
        pathBuilder.arcTo(36.62f, 36.62f, 0.0f, false, false, 158.31f, 12.0f);
        pathBuilder.arcTo(33.44f, 33.44f, 0.0f, false, false, 134.0f, 23.25f);
        pathBuilder.arcToRelative(54.65f, 54.65f, 0.0f, false, false, -6.0f, 8.3f);
        pathBuilder.arcToRelative(54.65f, 54.65f, 0.0f, false, false, -6.0f, -8.3f);
        pathBuilder.arcTo(33.44f, 33.44f, 0.0f, false, false, 97.69f, 12.0f);
        pathBuilder.arcTo(36.62f, 36.62f, 0.0f, false, false, 60.0f, 49.69f);
        pathBuilder.arcTo(33.82f, 33.82f, 0.0f, false, false, 65.94f, 68.0f);
        pathBuilder.lineTo(40.0f, 68.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 88.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 19.6f);
        pathBuilder.lineTo(36.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(200.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(220.0f, 139.6f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 120.0f);
        pathBuilder.lineTo(236.0f, 88.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 116.0f);
        pathBuilder.lineTo(140.0f, 116.0f);
        pathBuilder.lineTo(140.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 39.17f);
        pathBuilder.arcTo(9.59f, 9.59f, 0.0f, false, true, 159.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(0.35f);
        pathBuilder.arcTo(12.62f, 12.62f, 0.0f, false, true, 172.0f, 49.0f);
        pathBuilder.arcTo(9.59f, 9.59f, 0.0f, false, true, 168.83f, 56.0f);
        pathBuilder.curveToRelative(-6.9f, 6.12f, -18.25f, 9.26f, -27.63f, 10.76f);
        pathBuilder.curveTo(142.7f, 57.42f, 145.84f, 46.07f, 152.0f, 39.17f);
        pathBuilder.close();
        pathBuilder.moveTo(87.7f, 39.7f);
        pathBuilder.arcTo(12.8f, 12.8f, 0.0f, false, true, 96.61f, 36.0f);
        pathBuilder.lineTo(97.0f, 36.0f);
        pathBuilder.arcTo(9.59f, 9.59f, 0.0f, false, true, 104.0f, 39.17f);
        pathBuilder.curveToRelative(6.12f, 6.9f, 9.26f, 18.24f, 10.75f, 27.61f);
        pathBuilder.curveTo(105.45f, 65.27f, 94.0f, 62.13f, 87.17f, 56.0f);
        pathBuilder.arcTo(9.59f, 9.59f, 0.0f, false, true, 84.0f, 49.0f);
        pathBuilder.arcTo(12.72f, 12.72f, 0.0f, false, true, 87.7f, 39.7f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(44.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(60.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 196.0f);
        pathBuilder.lineTo(140.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gift = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
