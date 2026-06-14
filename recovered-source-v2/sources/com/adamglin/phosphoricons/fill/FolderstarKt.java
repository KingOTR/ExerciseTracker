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

/* compiled from: Folderstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFolderStar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderstarKt {
    private static ImageVector _folderStar;

    public static final ImageVector getFolderStar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _folderStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.09f, 167.78f);
        pathBuilder.lineToRelative(-22.51f, 18.59f);
        pathBuilder.lineToRelative(6.85f, 27.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, 8.81f);
        pathBuilder.lineTo(184.0f, 207.82f);
        pathBuilder.lineToRelative(-25.61f, 15.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, -8.81f);
        pathBuilder.lineToRelative(6.85f, -27.71f);
        pathBuilder.lineToRelative(-22.51f, -18.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, -14.14f);
        pathBuilder.lineToRelative(29.84f, -2.31f);
        pathBuilder.lineToRelative(11.43f, -26.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.7f, 0.0f);
        pathBuilder.lineToRelative(11.43f, 26.5f);
        pathBuilder.lineToRelative(29.84f, 2.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, 14.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.56f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(39.38f);
        pathBuilder.arcTo(15.4f, 15.4f, 0.0f, false, true, 24.0f, 200.62f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.horizontalLineTo(92.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 104.0f, 44.69f);
        pathBuilder.lineTo(131.31f, 72.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.horizontalLineToRelative(80.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.56f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(68.69f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
