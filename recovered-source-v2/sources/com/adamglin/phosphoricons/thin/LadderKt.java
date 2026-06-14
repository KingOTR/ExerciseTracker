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

/* compiled from: Ladder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ladder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLadder", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ladder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LadderKt {
    private static ImageVector _ladder;

    public static final ImageVector getLadder(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _ladder;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ladder", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.76f, 214.63f);
        pathBuilder.lineTo(160.26f, 73.0f);
        pathBuilder.lineTo(170.8f, 44.0f);
        pathBuilder.lineTo(184.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(88.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(98.29f, 44.0f);
        pathBuilder.lineToRelative(-62.0f, 170.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 5.13f);
        pathBuilder.arcTo(4.16f, 4.16f, 0.0f, false, false, 40.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -2.63f);
        pathBuilder.lineTo(54.44f, 188.0f);
        pathBuilder.horizontalLineToRelative(55.49f);
        pathBuilder.lineToRelative(-9.69f, 26.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 5.13f);
        pathBuilder.arcTo(4.12f, 4.12f, 0.0f, false, false, 104.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -2.63f);
        pathBuilder.lineTo(127.17f, 164.0f);
        pathBuilder.horizontalLineToRelative(57.66f);
        pathBuilder.lineToRelative(19.41f, 53.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 220.0f);
        pathBuilder.arcToRelative(4.16f, 4.16f, 0.0f, false, false, 1.37f, -0.24f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 211.76f, 214.63f);
        pathBuilder.close();
        pathBuilder.moveTo(130.29f, 132.0f);
        pathBuilder.lineTo(74.8f, 132.0f);
        pathBuilder.lineTo(89.35f, 92.0f);
        pathBuilder.horizontalLineToRelative(55.48f);
        pathBuilder.close();
        pathBuilder.moveTo(162.29f, 44.0f);
        pathBuilder.lineTo(147.74f, 84.0f);
        pathBuilder.lineTo(92.26f, 84.0f);
        pathBuilder.lineTo(106.8f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.35f, 180.0f);
        pathBuilder.lineToRelative(14.54f, -40.0f);
        pathBuilder.horizontalLineToRelative(55.49f);
        pathBuilder.lineToRelative(-14.55f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(130.07f, 156.0f);
        pathBuilder.lineTo(156.0f, 84.7f);
        pathBuilder.lineTo(181.92f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ladder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
