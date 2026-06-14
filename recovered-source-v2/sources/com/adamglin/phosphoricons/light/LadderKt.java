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

/* compiled from: Ladder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ladder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLadder", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ladder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LadderKt {
    private static ImageVector _ladder;

    public static final ImageVector getLadder(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(213.64f, 214.0f);
        pathBuilder.lineTo(162.38f, 73.0f);
        pathBuilder.lineToRelative(9.82f, -27.0f);
        pathBuilder.lineTo(184.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(88.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(7.43f);
        pathBuilder.lineTo(34.36f, 214.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 38.0f, 221.64f);
        pathBuilder.arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, 0.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, -3.95f);
        pathBuilder.lineTo(55.84f, 190.0f);
        pathBuilder.horizontalLineToRelative(51.23f);
        pathBuilder.lineTo(98.36f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, 7.69f);
        pathBuilder.arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.0f, 0.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, -3.95f);
        pathBuilder.lineTo(128.57f, 166.0f);
        pathBuilder.horizontalLineToRelative(54.86f);
        pathBuilder.lineToRelative(18.93f, 52.05f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 222.0f);
        pathBuilder.arcToRelative(6.15f, 6.15f, 0.0f, false, false, 2.05f, -0.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 213.64f, 214.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.89f, 130.0f);
        pathBuilder.lineTo(77.66f, 130.0f);
        pathBuilder.lineTo(90.75f, 94.0f);
        pathBuilder.lineTo(142.0f, 94.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.43f, 46.0f);
        pathBuilder.lineTo(146.34f, 82.0f);
        pathBuilder.lineTo(95.11f, 82.0f);
        pathBuilder.lineTo(108.2f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.2f, 178.0f);
        pathBuilder.lineToRelative(13.09f, -36.0f);
        pathBuilder.horizontalLineToRelative(51.23f);
        pathBuilder.lineToRelative(-13.09f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.93f, 154.0f);
        pathBuilder.lineTo(156.0f, 90.56f);
        pathBuilder.lineTo(179.07f, 154.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ladder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
