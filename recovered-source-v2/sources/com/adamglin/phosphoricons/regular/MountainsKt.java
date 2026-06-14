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

/* compiled from: Mountains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mountains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMountains", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mountains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MountainsKt {
    private static ImageVector _mountains;

    public static final ImageVector getMountains(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _mountains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mountains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 80.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.88f, 195.92f);
        pathBuilder.lineTo(200.32f, 103.84f);
        pathBuilder.arcTo(15.87f, 15.87f, 0.0f, false, false, 186.55f, 96.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(15.85f, 15.85f, 0.0f, false, false, -13.76f, 7.84f);
        pathBuilder.lineTo(146.63f, 148.0f);
        pathBuilder.lineToRelative(-44.84f, -76.1f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.58f, 0.0f);
        pathBuilder.lineTo(1.11f, 195.94f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 208.0f);
        pathBuilder.lineTo(248.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.88f, -12.08f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 80.0f);
        pathBuilder.lineToRelative(23.57f, 40.0f);
        pathBuilder.lineTo(64.43f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 192.0f);
        pathBuilder.lineToRelative(33.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(66.0f);
        pathBuilder.lineToRelative(18.74f, 31.8f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(154.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.57f, 192.0f);
        pathBuilder.lineTo(155.91f, 163.72f);
        pathBuilder.lineTo(186.55f, 112.0f);
        pathBuilder.lineTo(234.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mountains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
