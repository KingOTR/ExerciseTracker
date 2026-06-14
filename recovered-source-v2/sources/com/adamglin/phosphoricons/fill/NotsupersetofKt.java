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

/* compiled from: Notsupersetof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NotSupersetOf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNotSupersetOf", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_notSupersetOf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotsupersetofKt {
    private static ImageVector _notSupersetOf;

    public static final ImageVector getNotSupersetOf(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _notSupersetOf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NotSupersetOf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.09f, 98.9f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 144.0f, 136.0f);
        pathBuilder.horizontalLineTo(131.63f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.27f, 58.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.75f);
        pathBuilder.lineTo(162.42f, 76.51f);
        pathBuilder.arcTo(39.82f, 39.82f, 0.0f, false, false, 144.0f, 72.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(23.87f, 23.87f, 0.0f, false, true, 7.36f, 1.16f);
        pathBuilder.lineToRelative(-41.0f, 46.84f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(96.37f);
        pathBuilder.lineTo(66.0f, 186.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, 10.54f);
        pathBuilder.lineTo(89.63f, 184.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(103.63f);
        pathBuilder.lineToRelative(14.0f, -16.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 30.87f, -65.41f);
        pathBuilder.lineTo(190.0f, 69.27f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 189.27f, 58.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _notSupersetOf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
