package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Folderopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFolderOpen", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderopenKt {
    private static ImageVector _folderOpen;

    public static final ImageVector getFolderOpen(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(248.23f, 112.31f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 104.0f);
        pathBuilder.horizontalLineTo(220.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.horizontalLineTo(132.0f);
        pathBuilder.lineTo(105.34f, 48.0f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.0f, -4.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(211.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.33f, -8.0f);
        pathBuilder.lineToRelative(28.49f, -81.47f);
        pathBuilder.lineToRelative(0.06f, -0.17f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 248.23f, 112.31f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 68.0f);
        pathBuilder.lineToRelative(28.8f, 21.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineTo(69.77f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -18.94f, 13.58f);
        pathBuilder.lineTo(44.0f, 137.15f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.59f, 196.0f);
        pathBuilder.horizontalLineTo(48.89f);
        pathBuilder.lineToRelative(23.72f, -68.0f);
        pathBuilder.horizontalLineTo(226.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
