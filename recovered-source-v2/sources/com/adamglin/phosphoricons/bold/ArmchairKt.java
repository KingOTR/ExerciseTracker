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

/* compiled from: Armchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Armchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getArmchair", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_armchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArmchairKt {
    private static ImageVector _armchair;

    public static final ImageVector getArmchair(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(220.0f, 78.53f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 36.0f, 72.0f);
        pathBuilder.verticalLineToRelative(6.53f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 99.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(177.51f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -99.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(4.62f);
        pathBuilder.arcTo(52.09f, 52.09f, 0.0f, false, false, 152.17f, 124.0f);
        pathBuilder.horizontalLineTo(103.83f);
        pathBuilder.arcTo(52.09f, 52.09f, 0.0f, false, false, 60.0f, 76.62f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.81f, 155.86f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 167.8f);
        pathBuilder.verticalLineTo(196.0f);
        pathBuilder.horizontalLineTo(60.0f);
        pathBuilder.verticalLineTo(167.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.81f, -11.94f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, true, 80.0f, 128.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(148.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 30.81f, 27.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _armchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
