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

/* compiled from: Fireextinguisher.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FireExtinguisher", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFireExtinguisher", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fireExtinguisher", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireextinguisherKt {
    private static ImageVector _fireExtinguisher;

    public static final ImageVector getFireExtinguisher(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fireExtinguisher;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FireExtinguisher", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(217.15f, 52.17f);
        pathBuilder.lineToRelative(-70.34f, -21.1f);
        pathBuilder.lineToRelative(39.0f, -19.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f);
        pathBuilder.lineTo(135.0f, 28.0f);
        pathBuilder.arcToRelative(76.07f, 76.07f, 0.0f, false, false, -75.0f, 76.0f);
        pathBuilder.lineTo(60.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 172.0f);
        pathBuilder.lineTo(92.0f, 172.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(180.0f, 104.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, false, -40.0f, -43.81f);
        pathBuilder.lineTo(140.0f, 37.38f);
        pathBuilder.lineToRelative(74.85f, 22.45f);
        pathBuilder.arcTo(3.82f, 3.82f, 0.0f, false, false, 216.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.15f, -7.83f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 164.0f);
        pathBuilder.lineTo(68.0f, 104.0f);
        pathBuilder.arcToRelative(68.08f, 68.08f, 0.0f, false, true, 64.0f, -67.87f);
        pathBuilder.lineTo(132.0f, 60.19f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 92.0f, 104.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 236.0f);
        pathBuilder.lineTo(104.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(100.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 236.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 104.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.lineTo(100.0f, 164.0f);
        pathBuilder.lineTo(100.0f, 104.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fireExtinguisher = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
