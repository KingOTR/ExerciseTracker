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

/* compiled from: Folderopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFolderOpen", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderopenKt {
    private static ImageVector _folderOpen;

    public static final ImageVector getFolderOpen(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _folderOpen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderOpen", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.0f, 110.64f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.horizontalLineTo(130.67f);
        pathBuilder.lineTo(102.94f, 51.2f);
        pathBuilder.arcToRelative(16.14f, 16.14f, 0.0f, false, false, -9.6f, -3.2f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineTo(211.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f);
        pathBuilder.lineToRelative(28.49f, -85.47f);
        pathBuilder.arcTo(16.05f, 16.05f, 0.0f, false, false, 245.0f, 110.64f);
        pathBuilder.close();
        pathBuilder.moveTo(93.34f, 64.0f);
        pathBuilder.lineTo(123.2f, 86.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(69.77f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.18f, 10.94f);
        pathBuilder.lineTo(40.0f, 158.7f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
