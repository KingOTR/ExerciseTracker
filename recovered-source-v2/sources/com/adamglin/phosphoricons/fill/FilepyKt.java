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

/* compiled from: Filepy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilePy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFilePy", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filePy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilepyKt {
    private static ImageVector _filePy;

    public static final ImageVector getFilePy(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _filePy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FilePy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.66f, 82.34f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder.lineTo(56.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(172.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.lineTo(176.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 88.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.lineToRelative(44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 144.0f);
        pathBuilder.lineTo(48.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(55.73f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 47.47f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 208.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(7.4f);
        pathBuilder.curveToRelative(15.24f, 0.0f, 28.14f, -11.92f, 28.59f, -27.15f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 64.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(63.65f, 184.0f);
        pathBuilder.lineTo(56.0f, 184.0f);
        pathBuilder.lineTo(56.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 13.16f);
        pathBuilder.arcTo(12.25f, 12.25f, 0.0f, false, true, 63.65f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.65f, 156.52f);
        pathBuilder.lineTo(136.0f, 186.29f);
        pathBuilder.verticalLineToRelative(21.44f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(120.0f, 186.29f);
        pathBuilder.lineToRelative(-18.61f, -29.77f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, 2.16f, -11.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.23f, 2.41f);
        pathBuilder.lineTo(128.0f, 168.91f);
        pathBuilder.lineToRelative(13.22f, -21.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.23f, -2.41f);
        pathBuilder.arcTo(8.22f, 8.22f, 0.0f, false, true, 154.61f, 156.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filePy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
