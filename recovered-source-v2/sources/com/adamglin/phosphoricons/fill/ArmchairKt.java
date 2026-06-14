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

/* compiled from: Armchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Armchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getArmchair", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_armchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArmchairKt {
    private static ImageVector _armchair;

    public static final ImageVector getArmchair(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _armchair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Armchair", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 132.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.0f, 27.71f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(159.71f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, true, 72.0f, 132.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 88.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.81f, 40.0f);
        pathBuilder.horizontalLineToRelative(80.38f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, true, 212.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 72.0f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _armchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
