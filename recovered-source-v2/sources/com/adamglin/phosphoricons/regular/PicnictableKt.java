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

/* compiled from: Picnictable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PicnicTable", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPicnicTable", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_picnicTable", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PicnictableKt {
    private static ImageVector _picnicTable;

    public static final ImageVector getPicnicTable(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _picnicTable;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PicnicTable", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 128.0f);
        pathBuilder.horizontalLineTo(200.94f);
        pathBuilder.lineToRelative(-28.0f, -56.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(83.06f);
        pathBuilder.lineToRelative(-28.0f, 56.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(47.06f);
        pathBuilder.lineTo(24.84f, 188.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, 10.73f);
        pathBuilder.arcTo(7.9f, 7.9f, 0.0f, false, false, 32.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.17f, -4.42f);
        pathBuilder.lineTo(64.94f, 144.0f);
        pathBuilder.horizontalLineTo(191.06f);
        pathBuilder.lineToRelative(25.78f, 51.58f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 200.0f);
        pathBuilder.arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.57f, -0.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, -10.73f);
        pathBuilder.lineTo(208.94f, 144.0f);
        pathBuilder.horizontalLineTo(248.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.94f, 128.0f);
        pathBuilder.lineToRelative(28.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(54.12f);
        pathBuilder.lineToRelative(28.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _picnicTable = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
