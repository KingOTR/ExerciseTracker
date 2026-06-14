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

/* compiled from: Castleturret.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CastleTurret", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCastleTurret", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_castleTurret", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CastleturretKt {
    private static ImageVector _castleTurret;

    public static final ImageVector getCastleTurret(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _castleTurret;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CastleTurret", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 220.0f);
        pathBuilder.horizontalLineTo(196.0f);
        pathBuilder.verticalLineTo(113.66f);
        pathBuilder.lineToRelative(12.49f, -12.49f);
        pathBuilder.arcTo(11.93f, 11.93f, 0.0f, false, false, 212.0f, 92.69f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.horizontalLineTo(148.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f);
        pathBuilder.verticalLineTo(92.69f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 3.51f, 8.48f);
        pathBuilder.lineTo(60.0f, 113.66f);
        pathBuilder.verticalLineTo(220.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.83f, 109.17f);
        pathBuilder.lineTo(53.17f, 95.51f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 92.69f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineTo(92.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.82f);
        pathBuilder.lineToRelative(-13.66f, 13.66f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 188.0f, 112.0f);
        pathBuilder.verticalLineTo(220.0f);
        pathBuilder.horizontalLineTo(156.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.horizontalLineTo(68.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 66.83f, 109.17f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 220.0f);
        pathBuilder.horizontalLineTo(108.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _castleTurret = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
