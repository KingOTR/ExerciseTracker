package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Folderuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFolderUser", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderuserKt {
    private static ImageVector _folderUser;

    public static final ImageVector getFolderUser(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _folderUser;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FolderUser", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.61f, 198.62f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.23f, 0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -17.11f, 23.32f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.67f, 9.79f);
        pathBuilder.arcTo(8.15f, 8.15f, 0.0f, false, false, 160.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.73f, -5.95f);
        pathBuilder.curveTo(170.56f, 215.42f, 180.54f, 208.0f, 192.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(21.44f, 7.42f, 24.27f, 18.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.46f, -4.11f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 214.61f, 198.62f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 160.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 72.0f);
        pathBuilder.lineTo(131.31f, 72.0f);
        pathBuilder.lineTo(104.0f, 44.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 92.69f, 40.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.lineTo(24.0f, 200.61f);
        pathBuilder.arcTo(15.4f, 15.4f, 0.0f, false, false, 39.38f, 216.0f);
        pathBuilder.horizontalLineToRelative(81.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 88.0f);
        pathBuilder.lineTo(216.0f, 88.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(232.0f, 88.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.69f, 56.0f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.lineTo(40.0f, 72.0f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
