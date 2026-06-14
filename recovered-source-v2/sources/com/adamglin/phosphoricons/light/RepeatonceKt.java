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

/* compiled from: Repeatonce.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RepeatOnce", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRepeatOnce", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_repeatOnce", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepeatonceKt {
    private static ImageVector _repeatOnce;

    public static final ImageVector getRepeatOnce(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _repeatOnce;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RepeatOnce", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(26.0f, 128.0f);
        pathBuilder.arcTo(70.08f, 70.08f, 0.0f, false, true, 96.0f, 58.0f);
        pathBuilder.lineTo(209.51f, 58.0f);
        pathBuilder.lineTo(195.76f, 44.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(209.51f, 70.0f);
        pathBuilder.lineTo(96.0f, 70.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, 58.0f);
        pathBuilder.lineTo(46.49f, 186.0f);
        pathBuilder.lineToRelative(13.75f, -13.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(46.49f, 198.0f);
        pathBuilder.lineTo(160.0f, 198.0f);
        pathBuilder.arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(142.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.68f, -5.37f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 5.36f, 10.73f);
        pathBuilder.lineTo(130.0f, 113.7f);
        pathBuilder.lineTo(130.0f, 152.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 136.0f, 158.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _repeatOnce = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
