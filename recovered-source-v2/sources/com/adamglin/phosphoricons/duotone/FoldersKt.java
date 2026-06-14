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

/* compiled from: Folders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Folders", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFolders", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folders", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoldersKt {
    private static ImageVector _folders;

    public static final ImageVector getFolders(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _folders;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Folders", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 80.0f);
        pathBuilder.verticalLineToRelative(88.89f);
        pathBuilder.arcToRelative(7.11f, 7.11f, 0.0f, false, true, -7.11f, 7.11f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.horizontalLineTo(120.0f);
        pathBuilder.lineTo(90.13f, 81.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.8f, -1.6f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(45.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f);
        pathBuilder.lineTo(152.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 64.0f);
        pathBuilder2.lineTo(154.67f, 64.0f);
        pathBuilder2.lineTo(126.93f, 43.2f);
        pathBuilder2.arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f);
        pathBuilder2.lineTo(72.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder2.lineTo(56.0f, 72.0f);
        pathBuilder2.lineTo(40.0f, 72.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f);
        pathBuilder2.lineTo(24.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(192.89f, 216.0f);
        pathBuilder2.arcTo(15.13f, 15.13f, 0.0f, false, false, 208.0f, 200.89f);
        pathBuilder2.lineTo(208.0f, 184.0f);
        pathBuilder2.horizontalLineToRelative(16.89f);
        pathBuilder2.arcTo(15.13f, 15.13f, 0.0f, false, false, 240.0f, 168.89f);
        pathBuilder2.lineTo(240.0f, 80.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 200.0f);
        pathBuilder2.lineTo(40.0f, 200.0f);
        pathBuilder2.lineTo(40.0f, 88.0f);
        pathBuilder2.lineTo(85.33f, 88.0f);
        pathBuilder2.lineToRelative(29.87f, 22.4f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 112.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 168.0f);
        pathBuilder2.lineTo(208.0f, 168.0f);
        pathBuilder2.lineTo(208.0f, 112.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(122.67f, 96.0f);
        pathBuilder2.lineTo(94.93f, 75.2f);
        pathBuilder2.arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f);
        pathBuilder2.lineTo(72.0f, 72.0f);
        pathBuilder2.lineTo(72.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(45.33f);
        pathBuilder2.lineTo(147.2f, 78.4f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folders = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
