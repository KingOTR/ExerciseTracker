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

/* compiled from: Musicnotesplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MusicNotesPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMusicNotesPlus", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_musicNotesPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MusicnotesplusKt {
    private static ImageVector _musicNotesPlus;

    public static final ImageVector getMusicNotesPlus(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _musicNotesPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MusicNotesPlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(206.0f, 54.0f);
        pathBuilder.lineTo(206.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(194.0f, 54.0f);
        pathBuilder.lineTo(176.0f, 54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(194.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(206.0f, 42.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 112.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(34.06f, 34.06f, 0.0f, true, true, -12.0f, -25.89f);
        pathBuilder.lineTo(202.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 164.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 202.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 108.68f);
        pathBuilder.lineTo(86.0f, 196.0f);
        pathBuilder.arcToRelative(34.06f, 34.06f, 0.0f, true, true, -12.0f, -25.89f);
        pathBuilder.lineTo(74.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.54f, -5.82f);
        pathBuilder.lineToRelative(56.0f, -14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.92f, 11.64f);
        pathBuilder.lineTo(86.0f, 60.68f);
        pathBuilder.lineTo(86.0f, 96.32f);
        pathBuilder.lineToRelative(72.54f, -18.14f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.92f, 11.64f);
        pathBuilder.close();
        pathBuilder.moveTo(74.0f, 196.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 74.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _musicNotesPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
