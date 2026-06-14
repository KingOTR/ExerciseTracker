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

/* compiled from: Folderdashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFolderDashed", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderdashedKt {
    private static ImageVector _folderDashed;

    public static final ImageVector getFolderDashed(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _folderDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(39.38f, 220.0f);
        pathBuilder.arcTo(19.41f, 19.41f, 0.0f, false, true, 20.0f, 200.62f);
        pathBuilder.lineTo(20.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(88.0f, 196.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 196.0f);
        pathBuilder.lineTo(128.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.lineTo(200.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(16.89f);
        pathBuilder.arcTo(19.13f, 19.13f, 0.0f, false, false, 236.0f, 200.89f);
        pathBuilder.lineTo(236.0f, 152.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 68.0f);
        pathBuilder.lineTo(168.0f, 68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 88.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(44.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 80.0f);
        pathBuilder.lineTo(20.0f, 52.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 32.0f);
        pathBuilder.lineTo(92.41f, 32.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 14.94f, 6.71f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(137.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.0f, 20.0f);
        pathBuilder.lineTo(32.0f, 92.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(57.28f);
        pathBuilder.lineTo(90.61f, 56.0f);
        pathBuilder.lineTo(44.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
