package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Notsupersetof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NotSupersetOf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNotSupersetOf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_notSupersetOf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotsupersetofKt {
    private static ImageVector _notSupersetOf;

    public static final ImageVector getNotSupersetOf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 194.0f);
        pathBuilder.horizontalLineTo(76.11f);
        pathBuilder.lineToRelative(25.45f, -28.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, false, 196.81f, 61.22f);
        pathBuilder.lineTo(212.44f, 44.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 203.56f, 36.0f);
        pathBuilder.lineTo(187.73f, 53.38f);
        pathBuilder.arcTo(61.61f, 61.61f, 0.0f, false, false, 152.0f, 42.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(49.67f, 49.67f, 0.0f, false, true, 27.59f, 8.33f);
        pathBuilder.lineTo(96.25f, 154.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(85.35f);
        pathBuilder.lineTo(43.56f, 212.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f);
        pathBuilder.lineTo(65.2f, 206.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.73f, 70.12f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, true, 152.0f, 154.0f);
        pathBuilder.horizontalLineTo(112.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _notSupersetOf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
