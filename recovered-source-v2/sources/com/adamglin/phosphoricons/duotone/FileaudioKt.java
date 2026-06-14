package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fileaudio.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileAudio", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFileAudio", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileAudio", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileaudioKt {
    private static ImageVector _fileAudio;

    public static final ImageVector getFileAudio(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _fileAudio;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileAudio", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(72.0f, 160.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.lineTo(72.0f, 200.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.verticalLineTo(160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 32.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(99.06f, 128.61f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f);
        pathBuilder2.lineTo(68.69f, 152.0f);
        pathBuilder2.lineTo(48.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.lineTo(68.69f, 208.0f);
        pathBuilder2.lineToRelative(21.65f, 21.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 224.0f);
        pathBuilder2.lineTo(104.0f, 136.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 99.06f, 128.61f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 204.69f);
        pathBuilder2.lineTo(77.66f, 194.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 192.0f);
        pathBuilder2.lineTo(56.0f, 192.0f);
        pathBuilder2.lineTo(56.0f, 168.0f);
        pathBuilder2.lineTo(72.0f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f);
        pathBuilder2.lineTo(88.0f, 155.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 180.0f);
        pathBuilder2.arcToRelative(40.55f, 40.55f, 0.0f, false, true, -20.0f, 34.91f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 124.0f, 201.09f);
        pathBuilder2.arcToRelative(24.49f, 24.49f, 0.0f, false, false, 0.0f, -42.18f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 132.0f, 145.09f);
        pathBuilder2.arcTo(40.55f, 40.55f, 0.0f, false, true, 152.0f, 180.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(213.66f, 82.34f);
        pathBuilder2.lineTo(157.66f, 26.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder2.lineTo(56.0f, 24.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(56.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(88.0f);
        pathBuilder2.lineTo(144.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.lineTo(200.0f, 216.0f);
        pathBuilder2.lineTo(168.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 88.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 51.31f);
        pathBuilder2.lineTo(188.69f, 80.0f);
        pathBuilder2.lineTo(160.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileAudio = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
