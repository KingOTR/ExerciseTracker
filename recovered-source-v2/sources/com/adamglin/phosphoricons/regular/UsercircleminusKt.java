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

/* compiled from: Usercircleminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserCircleMinus", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercircleminusKt {
    private static ImageVector _userCircleMinus;

    public static final ImageVector getUserCircleMinus(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _userCircleMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(176.0f, 64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.08f, 93.33f);
        pathBuilder.arcToRelative(103.93f, 103.93f, 0.0f, true, true, -80.76f, -67.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.64f, 15.78f);
        pathBuilder.arcTo(88.07f, 88.07f, 0.0f, false, false, 40.0f, 128.0f);
        pathBuilder.arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f);
        pathBuilder.arcTo(79.66f, 79.66f, 0.0f, false, true, 98.3f, 157.66f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f);
        pathBuilder.arcToRelative(79.66f, 79.66f, 0.0f, false, true, 36.06f, 28.75f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 211.0f, 98.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.09f, -5.34f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(87.57f, 87.57f, 0.0f, false, false, 53.92f, -18.5f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.84f, 0.0f);
        pathBuilder.arcTo(87.57f, 87.57f, 0.0f, false, false, 128.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
