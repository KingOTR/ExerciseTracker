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

/* compiled from: Musicnotesminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MusicNotesMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMusicNotesMinus", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_musicNotesMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MusicnotesminusKt {
    private static ImageVector _musicNotesMinus;

    public static final ImageVector getMusicNotesMinus(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _musicNotesMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MusicNotesMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 40.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(162.13f, 76.5f);
        pathBuilder2.arcToRelative(31.57f, 31.57f, 0.0f, false, true, -16.44f, -38.76f);
        pathBuilder2.arcTo(4.0f, 4.0f, 0.0f, false, false, 141.0f, 32.53f);
        pathBuilder2.lineTo(78.06f, 48.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f);
        pathBuilder2.verticalLineTo(166.1f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, true, false, 52.42f, 232.0f);
        pathBuilder2.curveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f);
        pathBuilder2.verticalLineTo(102.25f);
        pathBuilder2.lineToRelative(73.26f, -18.31f);
        pathBuilder2.arcTo(4.0f, 4.0f, 0.0f, false, false, 162.13f, 76.5f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor3 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw3 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk83 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os3 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(212.0f, 80.0f);
        pathBuilder3.horizontalLineToRelative(-8.0f);
        pathBuilder3.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(50.1f);
        pathBuilder3.arcTo(36.0f, 36.0f, 0.0f, true, false, 180.42f, 200.0f);
        pathBuilder3.curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f);
        pathBuilder3.verticalLineTo(84.0f);
        pathBuilder3.arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 80.0f);
        pathBuilder3.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder3.getNodes(), m4126getNonZeroRgk1Os3, "", solidColor3, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw3, m4207getMiterLxFBmk83, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _musicNotesMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
