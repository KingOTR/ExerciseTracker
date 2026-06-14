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

/* compiled from: Folderlock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFolderLock", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderLock", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderlockKt {
    private static ImageVector _folderLock;

    public static final ImageVector getFolderLock(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _folderLock;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderLock", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 164.0f);
        pathBuilder.lineTo(212.0f, 164.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(152.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(228.0f, 168.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 156.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(172.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 204.0f);
        pathBuilder.lineTo(156.0f, 204.0f);
        pathBuilder.lineTo(156.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 76.0f);
        pathBuilder.lineTo(129.66f, 76.0f);
        pathBuilder.lineTo(101.17f, 47.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.69f, 44.0f);
        pathBuilder.lineTo(40.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f);
        pathBuilder.lineTo(28.0f, 200.62f);
        pathBuilder.arcTo(11.4f, 11.4f, 0.0f, false, false, 39.38f, 212.0f);
        pathBuilder.horizontalLineToRelative(73.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(39.38f, 204.0f);
        pathBuilder.arcTo(3.39f, 3.39f, 0.0f, false, true, 36.0f, 200.62f);
        pathBuilder.lineTo(36.0f, 84.0f);
        pathBuilder.lineTo(216.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(228.0f, 88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 52.0f);
        pathBuilder.lineTo(92.69f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f);
        pathBuilder.lineTo(118.34f, 76.0f);
        pathBuilder.lineTo(36.0f, 76.0f);
        pathBuilder.lineTo(36.0f, 56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderLock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
