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

/* compiled from: Mountains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mountains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMountains", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mountains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MountainsKt {
    private static ImageVector _mountains;

    public static final ImageVector getMountains(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(160.0f, 80.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.32f, 193.88f);
        pathBuilder.lineTo(199.76f, 101.8f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 182.55f, 92.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(19.83f, 19.83f, 0.0f, false, false, -17.2f, 9.8f);
        pathBuilder.lineToRelative(-18.7f, 31.55f);
        pathBuilder.lineToRelative(-37.42f, -63.5f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.46f, 0.0f);
        pathBuilder.lineTo(1.66f, 193.91f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 212.0f);
        pathBuilder.lineTo(244.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.32f, -18.12f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 87.87f);
        pathBuilder.lineTo(108.57f, 116.0f);
        pathBuilder.lineTo(75.43f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(33.0f, 188.0f);
        pathBuilder.lineToRelative(28.28f, -48.0f);
        pathBuilder.horizontalLineToRelative(61.44f);
        pathBuilder.lineTo(151.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.86f, 188.0f);
        pathBuilder.lineTo(160.56f, 157.0f);
        pathBuilder.lineToRelative(22.0f, -37.1f);
        pathBuilder.lineTo(222.94f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mountains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
