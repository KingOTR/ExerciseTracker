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

/* compiled from: Folderuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFolderUser", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderuserKt {
    private static ImageVector _folderUser;

    public static final ImageVector getFolderUser(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(220.51f, 197.94f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -57.0f, 0.0f);
        pathBuilder.arcToRelative(43.75f, 43.75f, 0.0f, false, false, -15.08f, 23.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.52f, 14.67f);
        pathBuilder.arcTo(11.77f, 11.77f, 0.0f, false, false, 160.0f, 236.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.59f, -8.92f);
        pathBuilder.curveTo(174.0f, 218.2f, 182.35f, 212.0f, 192.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(18.0f, 6.2f, 20.4f, 15.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.19f, -6.17f);
        pathBuilder.arcTo(43.7f, 43.7f, 0.0f, false, false, 220.51f, 197.94f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 68.0f);
        pathBuilder.lineTo(133.39f, 68.0f);
        pathBuilder.lineToRelative(-26.0f, -29.29f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 92.41f, 32.0f);
        pathBuilder.lineTo(40.0f, 32.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 52.0f);
        pathBuilder.lineTo(20.0f, 200.61f);
        pathBuilder.arcTo(19.41f, 19.41f, 0.0f, false, false, 39.38f, 220.0f);
        pathBuilder.horizontalLineToRelative(73.18f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(44.0f, 196.0f);
        pathBuilder.lineTo(44.0f, 92.0f);
        pathBuilder.lineTo(212.0f, 92.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 88.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 68.0f);
        pathBuilder.lineTo(44.0f, 56.0f);
        pathBuilder.lineTo(90.61f, 56.0f);
        pathBuilder.lineToRelative(10.67f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
