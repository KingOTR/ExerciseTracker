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

/* compiled from: Foldersimpleuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderSimpleUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFolderSimpleUser", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderSimpleUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoldersimpleuserKt {
    private static ImageVector _folderSimpleUser;

    public static final ImageVector getFolderSimpleUser(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _folderSimpleUser;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderSimpleUser", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.28f, 199.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -38.56f, 0.0f);
        pathBuilder.arcToRelative(38.09f, 38.09f, 0.0f, false, false, -18.52f, 23.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.26f, 7.34f);
        pathBuilder.arcToRelative(6.26f, 6.26f, 0.0f, false, false, 1.54f, 0.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, -4.46f);
        pathBuilder.curveTo(168.86f, 214.0f, 179.63f, 206.0f, 192.0f, 206.0f);
        pathBuilder.reflectiveCurveToRelative(23.14f, 8.0f, 26.2f, 19.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.6f, -3.08f);
        pathBuilder.arcTo(38.09f, 38.09f, 0.0f, false, false, 211.28f, 199.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 158.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 88.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(218.0f, 88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(130.67f, 86.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -8.4f, -2.8f);
        pathBuilder.lineTo(94.53f, 62.4f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -0.4f);
        pathBuilder.lineTo(40.0f, 62.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.lineTo(38.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(26.0f, 64.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f);
        pathBuilder.lineTo(93.33f, 50.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 8.4f, 2.8f);
        pathBuilder.lineToRelative(27.74f, 20.8f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.2f, 0.4f);
        pathBuilder.lineTo(216.0f, 74.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderSimpleUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
