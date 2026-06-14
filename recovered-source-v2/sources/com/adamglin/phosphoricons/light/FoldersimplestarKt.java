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

/* compiled from: Foldersimplestar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderSimpleStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFolderSimpleStar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderSimpleStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoldersimplestarKt {
    private static ImageVector _folderSimpleStar;

    public static final ImageVector getFolderSimpleStar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _folderSimpleStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderSimpleStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(38.0f, 64.0f);
        pathBuilder.lineTo(38.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(26.0f, 64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f);
        pathBuilder.lineTo(93.33f, 50.0f);
        pathBuilder.arcToRelative(14.06f, 14.06f, 0.0f, false, true, 8.4f, 2.8f);
        pathBuilder.lineTo(130.0f, 74.0f);
        pathBuilder.horizontalLineToRelative(86.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(218.0f, 88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(128.0f, 86.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.6f, -1.2f);
        pathBuilder.lineTo(94.53f, 62.4f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -0.4f);
        pathBuilder.lineTo(40.0f, 62.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.82f, 166.24f);
        pathBuilder.lineToRelative(-23.49f, 19.39f);
        pathBuilder.lineToRelative(7.16f, 28.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, 6.61f);
        pathBuilder.lineTo(184.0f, 205.5f);
        pathBuilder.lineToRelative(-26.62f, 15.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, -6.61f);
        pathBuilder.lineToRelative(7.16f, -28.93f);
        pathBuilder.lineToRelative(-23.49f, -19.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, -10.61f);
        pathBuilder.lineToRelative(31.0f, -2.4f);
        pathBuilder.lineToRelative(11.91f, -27.61f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 0.0f);
        pathBuilder.lineToRelative(11.91f, 27.61f);
        pathBuilder.lineToRelative(31.0f, 2.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, 10.61f);
        pathBuilder.close();
        pathBuilder.moveTo(216.72f, 166.45f);
        pathBuilder.lineTo(196.89f, 164.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -3.61f);
        pathBuilder.lineTo(184.0f, 143.14f);
        pathBuilder.lineToRelative(-7.84f, 18.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 3.61f);
        pathBuilder.lineToRelative(-19.83f, 1.53f);
        pathBuilder.lineToRelative(14.94f, 12.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 6.07f);
        pathBuilder.lineToRelative(-4.63f, 18.74f);
        pathBuilder.lineTo(181.0f, 193.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.08f, 0.0f);
        pathBuilder.lineToRelative(17.37f, 10.23f);
        pathBuilder.lineToRelative(-4.64f, -18.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, -6.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderSimpleStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
