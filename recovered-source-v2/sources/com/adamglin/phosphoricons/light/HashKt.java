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

/* compiled from: Hash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HashKt {
    private static ImageVector _hash;

    public static final ImageVector getHash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 90.0f);
        pathBuilder.lineTo(173.0f, 90.0f);
        pathBuilder.lineToRelative(8.89f, -48.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.8f, -2.14f);
        pathBuilder.lineTo(160.81f, 90.0f);
        pathBuilder.lineTo(109.0f, 90.0f);
        pathBuilder.lineToRelative(8.89f, -48.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, -2.14f);
        pathBuilder.lineTo(96.81f, 90.0f);
        pathBuilder.lineTo(48.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(94.63f, 102.0f);
        pathBuilder.lineToRelative(-9.46f, 52.0f);
        pathBuilder.lineTo(32.0f, 154.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(83.0f, 166.0f);
        pathBuilder.lineTo(74.1f, 214.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.83f, 7.0f);
        pathBuilder.arcTo(5.64f, 5.64f, 0.0f, false, false, 80.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.89f, -4.93f);
        pathBuilder.lineTo(95.19f, 166.0f);
        pathBuilder.lineTo(147.0f, 166.0f);
        pathBuilder.lineToRelative(-8.89f, 48.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.83f, 7.0f);
        pathBuilder.arcToRelative(5.64f, 5.64f, 0.0f, false, false, 1.08f, 0.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.89f, -4.93f);
        pathBuilder.lineTo(159.19f, 166.0f);
        pathBuilder.lineTo(208.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(161.37f, 154.0f);
        pathBuilder.lineToRelative(9.46f, -52.0f);
        pathBuilder.lineTo(224.0f, 102.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(149.17f, 154.0f);
        pathBuilder.lineTo(97.37f, 154.0f);
        pathBuilder.lineToRelative(9.46f, -52.0f);
        pathBuilder.horizontalLineToRelative(51.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
