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

/* compiled from: Fileini.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileIni", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileIni", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileIni", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileiniKt {
    private static ImageVector _fileIni;

    public static final ImageVector getFileIni(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileIni;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileIni", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(48.0f, 152.0f);
        pathBuilder.verticalLineToRelative(55.73f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 40.53f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 208.0f);
        pathBuilder.lineTo(32.0f, 152.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 39.47f, 144.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(119.47f, 144.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -7.47f, 8.25f);
        pathBuilder.lineTo(112.0f, 183.0f);
        pathBuilder.lineTo(86.69f, 147.6f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, false, -8.0f, -3.48f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 152.0f);
        pathBuilder.verticalLineToRelative(55.73f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 79.47f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 208.0f);
        pathBuilder.lineTo(88.0f, 177.0f);
        pathBuilder.lineToRelative(25.49f, 35.69f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 123.87f, 215.0f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 4.13f, -7.25f);
        pathBuilder.lineTo(128.0f, 152.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 119.47f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.47f, 144.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -7.47f, 8.25f);
        pathBuilder.verticalLineToRelative(55.46f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f);
        pathBuilder.lineTo(168.0f, 152.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 159.47f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 88.0f);
        pathBuilder.lineTo(216.0f, 223.75f);
        pathBuilder.arcToRelative(8.15f, 8.15f, 0.0f, false, true, -6.81f, 8.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f);
        pathBuilder.lineTo(200.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 88.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.lineTo(152.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileIni = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
