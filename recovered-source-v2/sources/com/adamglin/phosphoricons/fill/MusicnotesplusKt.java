package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Musicnotesplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MusicNotesPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMusicNotesPlus", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_musicNotesPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MusicnotesplusKt {
    private static ImageVector _musicNotesPlus;

    public static final ImageVector getMusicNotesPlus(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(208.0f, 56.0f);
        pathBuilder.lineTo(208.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(192.0f, 56.0f);
        pathBuilder.lineTo(176.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(192.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(208.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.6f, 77.86f);
        pathBuilder.lineToRelative(-6.76f, -6.76f);
        pathBuilder.arcTo(32.85f, 32.85f, 0.0f, false, true, 144.0f, 49.33f);
        pathBuilder.arcToRelative(31.87f, 31.87f, 0.0f, false, true, 1.67f, -11.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.76f, -5.14f);
        pathBuilder.lineTo(78.06f, 48.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f);
        pathBuilder.lineTo(72.0f, 166.1f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 52.42f, 232.0f);
        pathBuilder.curveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f);
        pathBuilder.lineTo(88.0f, 102.25f);
        pathBuilder.lineToRelative(70.74f, -17.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.6f, 77.86f);
        pathBuilder.close();
        pathBuilder.moveTo(210.71f, 102.17f);
        pathBuilder.arcToRelative(31.91f, 31.91f, 0.0f, false, true, -7.14f, 1.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.57f, 4.0f);
        pathBuilder.lineTo(200.0f, 134.1f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 180.42f, 200.0f);
        pathBuilder.curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f);
        pathBuilder.lineTo(216.0f, 106.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 210.71f, 102.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _musicNotesPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
