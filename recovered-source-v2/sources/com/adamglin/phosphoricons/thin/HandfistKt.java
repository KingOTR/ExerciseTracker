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

/* compiled from: Handfist.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandFist", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandFist", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handFist", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandfistKt {
    private static ImageVector _handFist;

    public static final ImageVector getHandFist(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handFist;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandFist", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 84.0f);
        pathBuilder.lineTo(180.0f, 84.0f);
        pathBuilder.lineTo(180.0f, 64.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -52.0f, -14.41f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 64.0f);
        pathBuilder.verticalLineToRelative(4.43f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 28.0f, 88.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, 200.0f, 0.0f);
        pathBuilder.lineTo(228.0f, 112.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 200.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 44.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.lineTo(172.0f, 84.0f);
        pathBuilder.lineTo(136.0f, 84.0f);
        pathBuilder.arcToRelative(11.8f, 11.8f, 0.0f, false, false, -4.0f, 0.7f);
        pathBuilder.lineTo(132.0f, 64.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 88.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.42f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 44.0f, -5.17f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 45.73f, 3.23f);
        pathBuilder.arcToRelative(28.11f, 28.11f, 0.0f, false, false, 18.59f, 17.29f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 124.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(152.0f, 132.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(132.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handFist = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
