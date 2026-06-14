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

/* compiled from: Forkknife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ForkKnife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getForkKnife", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_forkKnife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForkknifeKt {
    private static ImageVector _forkKnife;

    public static final ImageVector getForkKnife(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _forkKnife;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ForkKnife", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(76.0f, 88.0f);
        pathBuilder.lineTo(76.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(84.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 40.0f);
        pathBuilder.lineTo(212.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(204.0f, 172.0f);
        pathBuilder.lineTo(152.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.arcToRelative(264.27f, 264.27f, 0.0f, false, true, 7.11f, -55.94f);
        pathBuilder.curveToRelative(9.47f, -39.22f, 27.21f, -65.41f, 51.31f, -75.74f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 46.46f);
        pathBuilder.curveTo(162.25f, 70.33f, 156.81f, 145.75f, 156.1f, 164.0f);
        pathBuilder.lineTo(204.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 39.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.9f, 1.32f);
        pathBuilder.lineToRelative(8.0f, 47.66f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f);
        pathBuilder.lineToRelative(8.0f, -47.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.9f, -1.32f);
        pathBuilder.lineToRelative(-8.0f, 48.0f);
        pathBuilder.arcTo(4.89f, 4.89f, 0.0f, false, false, 36.0f, 88.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, false, 40.0f, 43.81f);
        pathBuilder.lineTo(76.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(84.0f, 131.81f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 124.0f, 88.0f);
        pathBuilder.arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.0f, -0.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _forkKnife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
