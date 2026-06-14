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

/* compiled from: Handbag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Handbag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandbag", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handbag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandbagKt {
    private static ImageVector _handbag;

    public static final ImageVector getHandbag(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handbag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Handbag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.92f, 198.59f);
        pathBuilder.lineToRelative(-14.26f, -120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -10.59f);
        pathBuilder.horizontalLineTo(172.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(46.33f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 10.59f);
        pathBuilder.lineToRelative(-14.26f, 120.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 23.0f, 207.94f);
        pathBuilder.arcTo(12.11f, 12.11f, 0.0f, false, false, 32.08f, 212.0f);
        pathBuilder.horizontalLineTo(223.92f);
        pathBuilder.arcToRelative(12.11f, 12.11f, 0.0f, false, false, 9.06f, -4.06f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 235.92f, 198.59f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 64.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.0f, 202.63f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, true, -3.08f, 1.37f);
        pathBuilder.horizontalLineTo(32.08f);
        pathBuilder.arcTo(4.08f, 4.08f, 0.0f, false, true, 29.0f, 202.63f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.0f, -3.09f);
        pathBuilder.lineToRelative(14.25f, -120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.54f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineToRelative(37.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.05f, 3.54f);
        pathBuilder.lineToRelative(14.25f, 120.0f);
        pathBuilder.arcTo(3.9f, 3.9f, 0.0f, false, true, 227.0f, 202.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handbag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
