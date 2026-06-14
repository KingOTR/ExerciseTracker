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

/* compiled from: Watch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWatch", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_watch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Watch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(79.85f, 79.85f, 0.0f, false, false, -27.95f, -60.68f);
        pathBuilder.lineTo(173.0f, 28.43f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 153.32f, 12.0f);
        pathBuilder.lineTo(102.68f, 12.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 83.0f, 28.43f);
        pathBuilder.lineTo(76.0f, 67.32f);
        pathBuilder.arcToRelative(79.84f, 79.84f, 0.0f, false, false, 0.0f, 121.36f);
        pathBuilder.lineToRelative(7.0f, 38.89f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 102.68f, 244.0f);
        pathBuilder.horizontalLineToRelative(50.64f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 173.0f, 227.57f);
        pathBuilder.lineToRelative(7.05f, -38.89f);
        pathBuilder.arcTo(79.85f, 79.85f, 0.0f, false, false, 208.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.lineToRelative(2.9f, 16.0f);
        pathBuilder.arcToRelative(79.76f, 79.76f, 0.0f, false, false, -49.76f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 220.0f);
        pathBuilder.lineTo(106.0f, 220.0f);
        pathBuilder.lineToRelative(-2.9f, -16.0f);
        pathBuilder.arcToRelative(79.76f, 79.76f, 0.0f, false, false, 49.76f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 184.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 128.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(128.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(116.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _watch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
