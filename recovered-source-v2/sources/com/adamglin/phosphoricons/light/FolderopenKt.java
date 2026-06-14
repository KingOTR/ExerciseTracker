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

/* compiled from: Folderopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFolderOpen", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderopenKt {
    private static ImageVector _folderOpen;

    public static final ImageVector getFolderOpen(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(243.36f, 111.81f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 106.0f);
        pathBuilder.lineTo(214.0f, 106.0f);
        pathBuilder.lineTo(214.0f, 88.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(130.0f, 74.0f);
        pathBuilder.lineTo(101.74f, 52.8f);
        pathBuilder.arcToRelative(14.06f, 14.06f, 0.0f, false, false, -8.4f, -2.8f);
        pathBuilder.lineTo(40.0f, 50.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f);
        pathBuilder.lineTo(26.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(211.1f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, -4.1f);
        pathBuilder.lineToRelative(28.49f, -85.47f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 243.36f, 111.81f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 62.0f);
        pathBuilder.lineTo(93.34f, 62.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 0.4f);
        pathBuilder.lineTo(124.4f, 84.8f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 86.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.lineTo(69.77f, 106.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.28f, 9.57f);
        pathBuilder.lineTo(38.0f, 171.0f);
        pathBuilder.lineTo(38.0f, 64.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.9f, 120.63f);
        pathBuilder.lineTo(206.78f, 202.0f);
        pathBuilder.lineTo(40.33f, 202.0f);
        pathBuilder.lineToRelative(27.54f, -82.63f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, -1.37f);
        pathBuilder.lineTo(232.0f, 118.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 2.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
