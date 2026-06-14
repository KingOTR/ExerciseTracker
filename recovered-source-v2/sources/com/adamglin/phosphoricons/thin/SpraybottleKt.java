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

/* compiled from: Spraybottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SprayBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSprayBottle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sprayBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpraybottleKt {
    private static ImageVector _sprayBottle;

    public static final ImageVector getSprayBottle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sprayBottle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SprayBottle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 32.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 76.0f, 80.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(28.62f);
        pathBuilder.arcToRelative(27.85f, 27.85f, 0.0f, false, true, -10.51f, 21.86f);
        pathBuilder.lineToRelative(-16.0f, 12.79f);
        pathBuilder.arcTo(35.8f, 35.8f, 0.0f, false, false, 76.0f, 167.38f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(211.47f);
        pathBuilder.arcTo(266.86f, 266.86f, 0.0f, false, false, 167.09f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.82f, 40.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 211.47f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(167.38f);
        pathBuilder.arcToRelative(27.85f, 27.85f, 0.0f, false, true, 10.51f, -21.86f);
        pathBuilder.lineToRelative(16.0f, -12.79f);
        pathBuilder.arcTo(35.8f, 35.8f, 0.0f, false, false, 124.0f, 104.62f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineToRelative(33.76f);
        pathBuilder.arcTo(258.83f, 258.83f, 0.0f, false, true, 196.0f, 211.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sprayBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
