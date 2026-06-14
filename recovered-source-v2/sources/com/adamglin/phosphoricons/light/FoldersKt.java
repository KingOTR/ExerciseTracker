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

/* compiled from: Folders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Folders", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFolders", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folders", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoldersKt {
    private static ImageVector _folders;

    public static final ImageVector getFolders(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 66.0f);
        pathBuilder.lineTo(154.0f, 66.0f);
        pathBuilder.lineTo(125.73f, 44.8f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, -2.8f);
        pathBuilder.lineTo(72.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 56.0f);
        pathBuilder.lineTo(58.0f, 74.0f);
        pathBuilder.lineTo(40.0f, 74.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 88.0f);
        pathBuilder.lineTo(26.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(192.89f, 214.0f);
        pathBuilder.arcTo(13.12f, 13.12f, 0.0f, false, false, 206.0f, 200.89f);
        pathBuilder.lineTo(206.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(18.89f);
        pathBuilder.arcTo(13.12f, 13.12f, 0.0f, false, false, 238.0f, 168.89f);
        pathBuilder.lineTo(238.0f, 80.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 200.89f);
        pathBuilder.arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.11f, 1.11f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(38.0f, 88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(85.33f, 86.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 0.4f);
        pathBuilder.lineToRelative(29.87f, 22.4f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 110.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 168.89f);
        pathBuilder.arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.11f, 1.11f);
        pathBuilder.lineTo(206.0f, 170.0f);
        pathBuilder.lineTo(206.0f, 112.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(122.0f, 98.0f);
        pathBuilder.lineTo(93.73f, 76.8f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, -2.8f);
        pathBuilder.lineTo(70.0f, 74.0f);
        pathBuilder.lineTo(70.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(45.33f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 0.4f);
        pathBuilder.lineTo(148.4f, 76.8f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 78.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folders = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
