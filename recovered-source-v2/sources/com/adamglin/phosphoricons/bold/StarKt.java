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

/* compiled from: Star.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getStar", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_star", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Star", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.0f, 96.0f);
        pathBuilder.arcToRelative(20.33f, 20.33f, 0.0f, false, false, -17.74f, -14.0f);
        pathBuilder.lineToRelative(-56.59f, -4.57f);
        pathBuilder.lineTo(146.83f, 24.62f);
        pathBuilder.arcToRelative(20.36f, 20.36f, 0.0f, false, false, -37.66f, 0.0f);
        pathBuilder.lineTo(87.35f, 77.44f);
        pathBuilder.lineTo(30.76f, 82.0f);
        pathBuilder.arcTo(20.45f, 20.45f, 0.0f, false, false, 19.1f, 117.88f);
        pathBuilder.lineToRelative(43.18f, 37.24f);
        pathBuilder.lineToRelative(-13.2f, 55.7f);
        pathBuilder.arcTo(20.37f, 20.37f, 0.0f, false, false, 79.57f, 233.0f);
        pathBuilder.lineTo(128.0f, 203.19f);
        pathBuilder.lineTo(176.43f, 233.0f);
        pathBuilder.arcToRelative(20.39f, 20.39f, 0.0f, false, false, 30.49f, -22.15f);
        pathBuilder.lineToRelative(-13.2f, -55.7f);
        pathBuilder.lineToRelative(43.18f, -37.24f);
        pathBuilder.arcTo(20.43f, 20.43f, 0.0f, false, false, 243.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.53f, 141.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.84f, 11.86f);
        pathBuilder.lineTo(181.58f, 208.0f);
        pathBuilder.lineToRelative(-47.29f, -29.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.58f, 0.0f);
        pathBuilder.lineTo(74.42f, 208.0f);
        pathBuilder.lineToRelative(12.89f, -54.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.84f, -11.86f);
        pathBuilder.lineTo(41.2f, 105.24f);
        pathBuilder.lineToRelative(55.4f, -4.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.13f, -7.38f);
        pathBuilder.lineTo(128.0f, 41.89f);
        pathBuilder.lineToRelative(21.27f, 51.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.13f, 7.38f);
        pathBuilder.lineToRelative(55.4f, 4.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _star = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
