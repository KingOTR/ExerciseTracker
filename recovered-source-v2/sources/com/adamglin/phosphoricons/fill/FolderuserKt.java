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

/* compiled from: Folderuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FolderUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFolderUser", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_folderUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FolderuserKt {
    private static ImageVector _folderUser;

    public static final ImageVector getFolderUser(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(231.73f, 221.94f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.27f, 222.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 17.11f, -23.33f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.24f, 0.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 231.73f, 221.94f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 88.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.horizontalLineToRelative(80.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(39.38f);
        pathBuilder.arcTo(15.4f, 15.4f, 0.0f, false, true, 24.0f, 200.62f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.horizontalLineTo(92.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 104.0f, 44.69f);
        pathBuilder.lineTo(131.31f, 72.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.69f, 72.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _folderUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
