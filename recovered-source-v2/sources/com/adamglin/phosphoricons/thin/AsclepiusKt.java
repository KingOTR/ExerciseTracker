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

/* compiled from: Asclepius.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Asclepius", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAsclepius", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asclepius", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsclepiusKt {
    private static ImageVector _asclepius;

    public static final ImageVector getAsclepius(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 79.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.horizontalLineTo(132.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 13.33f, -34.91f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 144.0f, 212.0f);
        pathBuilder.horizontalLineTo(132.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.verticalLineTo(212.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineTo(116.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f);
        pathBuilder.verticalLineTo(79.0f);
        pathBuilder.arcToRelative(27.0f, 27.0f, 0.0f, false, false, -27.0f, -27.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.arcToRelative(35.0f, 35.0f, 0.0f, false, true, 35.0f, 35.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 92.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 44.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 56.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 56.0f);
        pathBuilder.verticalLineTo(52.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 36.0f, 80.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 84.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asclepius = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
