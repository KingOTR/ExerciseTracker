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

/* compiled from: Compassrose.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CompassRose", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCompassRose", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_compassRose", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompassroseKt {
    private static ImageVector _compassRose;

    public static final ImageVector getCompassRose(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _compassRose;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CompassRose", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.0f, 124.12f);
        pathBuilder.lineToRelative(-29.68f, -7.42f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, false, -80.0f, -80.0f);
        pathBuilder.lineTo(131.88f, 7.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.76f, 0.0f);
        pathBuilder.lineTo(116.7f, 36.71f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, false, -80.0f, 80.0f);
        pathBuilder.lineTo(7.0f, 124.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.76f);
        pathBuilder.lineToRelative(29.68f, 7.42f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, false, 80.0f, 80.0f);
        pathBuilder.lineTo(124.12f, 249.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.76f, 0.0f);
        pathBuilder.lineToRelative(7.42f, -29.68f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, false, 80.0f, -80.0f);
        pathBuilder.lineTo(249.0f, 131.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.76f);
        pathBuilder.close();
        pathBuilder.moveTo(210.95f, 114.61f);
        pathBuilder.lineTo(155.3f, 100.7f);
        pathBuilder.lineTo(141.39f, 45.08f);
        pathBuilder.arcTo(83.85f, 83.85f, 0.0f, false, true, 210.92f, 114.61f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 24.49f);
        pathBuilder.lineToRelative(19.57f, 78.28f);
        pathBuilder.lineTo(128.0f, 122.34f);
        pathBuilder.lineToRelative(-19.57f, -19.57f);
        pathBuilder.close();
        pathBuilder.moveTo(114.61f, 45.08f);
        pathBuilder.lineTo(100.7f, 100.7f);
        pathBuilder.lineTo(45.08f, 114.61f);
        pathBuilder.arcTo(83.85f, 83.85f, 0.0f, false, true, 114.61f, 45.08f);
        pathBuilder.close();
        pathBuilder.moveTo(102.77f, 108.43f);
        pathBuilder.lineTo(122.34f, 128.0f);
        pathBuilder.lineToRelative(-19.57f, 19.57f);
        pathBuilder.lineTo(24.49f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(45.08f, 141.43f);
        pathBuilder.lineTo(100.7f, 155.3f);
        pathBuilder.lineToRelative(13.91f, 55.62f);
        pathBuilder.arcTo(83.85f, 83.85f, 0.0f, false, true, 45.08f, 141.39f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 231.51f);
        pathBuilder.lineToRelative(-19.57f, -78.28f);
        pathBuilder.lineTo(128.0f, 133.66f);
        pathBuilder.lineToRelative(19.57f, 19.57f);
        pathBuilder.close();
        pathBuilder.moveTo(141.39f, 210.92f);
        pathBuilder.lineTo(155.3f, 155.3f);
        pathBuilder.lineToRelative(55.62f, -13.91f);
        pathBuilder.arcTo(83.85f, 83.85f, 0.0f, false, true, 141.39f, 210.92f);
        pathBuilder.close();
        pathBuilder.moveTo(153.23f, 147.57f);
        pathBuilder.lineTo(133.66f, 128.0f);
        pathBuilder.lineToRelative(19.57f, -19.57f);
        pathBuilder.lineTo(231.51f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _compassRose = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
