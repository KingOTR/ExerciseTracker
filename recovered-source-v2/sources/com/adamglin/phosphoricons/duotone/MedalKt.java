package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Medal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Medal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMedal", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalKt {
    private static ImageVector _medal;

    public static final ImageVector getMedal(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _medal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Medal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 96.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, -48.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 96.0f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, true, false, 72.0f, 163.83f);
        pathBuilder2.lineTo(72.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.58f, 7.16f);
        pathBuilder2.lineTo(128.0f, 225.0f);
        pathBuilder2.lineToRelative(44.43f, 22.21f);
        pathBuilder2.arcTo(8.07f, 8.07f, 0.0f, false, false, 176.0f, 248.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(184.0f, 163.83f);
        pathBuilder2.arcTo(87.85f, 87.85f, 0.0f, false, false, 216.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 96.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, true, 56.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 227.06f);
        pathBuilder2.lineToRelative(-36.43f, -18.21f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder2.lineTo(88.0f, 227.06f);
        pathBuilder2.lineTo(88.0f, 174.37f);
        pathBuilder2.arcToRelative(87.89f, 87.89f, 0.0f, false, false, 80.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 152.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, true, false, 72.0f, 96.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, false, 128.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 56.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, true, true, 88.0f, 96.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
