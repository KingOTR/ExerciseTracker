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

/* compiled from: Asclepius.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Asclepius", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAsclepius", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asclepius", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsclepiusKt {
    private static ImageVector _asclepius;

    public static final ImageVector getAsclepius(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _asclepius;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Asclepius", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.0f, 79.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f);
        pathBuilder.horizontalLineTo(134.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 12.0f, -31.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -8.94f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 144.0f, 214.0f);
        pathBuilder.horizontalLineTo(134.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(214.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.verticalLineTo(118.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.0f, 36.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(82.0f);
        pathBuilder.horizontalLineToRelative(42.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f);
        pathBuilder.verticalLineTo(79.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, false, -25.0f, -25.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.arcToRelative(37.0f, 37.0f, 0.0f, false, true, 37.0f, 37.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 94.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 64.0f, 42.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(94.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 56.0f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 54.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 38.0f, 80.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asclepius = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
