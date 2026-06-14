package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Folderopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFolderOpen", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderopenKt {
    private static ImageVector _folderOpen;

    public static final ImageVector getFolderOpen(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(241.72f, 113.0f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, -9.73f, -5.0f);
        pathBuilder.lineTo(212.0f, 108.0f);
        pathBuilder.lineTo(212.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(129.33f, 76.0f);
        pathBuilder.lineToRelative(-28.8f, -21.6f);
        pathBuilder.arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f);
        pathBuilder.lineTo(40.0f, 52.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(211.09f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.79f, -2.74f);
        pathBuilder.lineToRelative(28.49f, -85.47f);
        pathBuilder.arcTo(11.86f, 11.86f, 0.0f, false, false, 241.72f, 113.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 60.0f);
        pathBuilder.lineTo(93.33f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f);
        pathBuilder.lineTo(125.6f, 83.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(69.76f, 108.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.38f, 8.21f);
        pathBuilder.lineTo(36.0f, 183.35f);
        pathBuilder.lineTo(36.0f, 64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.78f, 121.26f);
        pathBuilder.lineTo(208.2f, 204.0f);
        pathBuilder.lineTo(37.55f, 204.0f);
        pathBuilder.lineTo(66.0f, 118.74f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 69.76f, 116.0f);
        pathBuilder.lineTo(232.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.79f, 5.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
