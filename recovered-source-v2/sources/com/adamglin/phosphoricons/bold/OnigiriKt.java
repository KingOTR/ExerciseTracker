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

/* compiled from: Onigiri.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Onigiri", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getOnigiri", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_onigiri", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnigiriKt {
    private static ImageVector _onigiri;

    public static final ImageVector getOnigiri(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _onigiri;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Onigiri", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.0f, 144.51f);
        pathBuilder.lineTo(179.13f, 48.65f);
        pathBuilder.arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.17f, -0.29f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 77.0f, 48.36f);
        pathBuilder.arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.17f, 0.29f);
        pathBuilder.lineTo(21.0f, 144.51f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 72.1f, 236.0f);
        pathBuilder.lineTo(183.9f, 236.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 235.0f, 144.51f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 212.0f);
        pathBuilder.lineTo(100.0f, 212.0f);
        pathBuilder.lineTo(100.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.36f, 193.5f);
        pathBuilder.arcTo(35.55f, 35.55f, 0.0f, false, true, 183.9f, 212.0f);
        pathBuilder.lineTo(180.0f, 212.0f);
        pathBuilder.lineTo(180.0f, 168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(96.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.lineTo(72.1f, 212.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -30.58f, -55.0f);
        pathBuilder.lineToRelative(0.17f, -0.28f);
        pathBuilder.lineTo(97.51f, 60.88f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 61.0f, 0.0f);
        pathBuilder.lineToRelative(55.82f, 95.85f);
        pathBuilder.lineToRelative(0.17f, 0.28f);
        pathBuilder.arcTo(35.58f, 35.58f, 0.0f, false, true, 215.35f, 193.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _onigiri = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
