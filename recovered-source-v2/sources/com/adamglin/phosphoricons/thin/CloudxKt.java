package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cloudx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCloudX", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudxKt {
    private static ImageVector _cloudX;

    public static final ImageVector getCloudX(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cloudX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 44.0f);
        pathBuilder.arcTo(84.11f, 84.11f, 0.0f, false, false, 83.59f, 93.12f);
        pathBuilder.arcTo(60.71f, 60.71f, 0.0f, false, false, 72.0f, 92.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 0.0f, -168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 204.0f);
        pathBuilder.lineTo(72.0f, 204.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 8.55f, -103.3f);
        pathBuilder.arcTo(83.66f, 83.66f, 0.0f, false, false, 76.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.83f, 114.83f);
        pathBuilder.lineTo(165.66f, 136.0f);
        pathBuilder.lineToRelative(21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(160.0f, 141.66f);
        pathBuilder.lineToRelative(-21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(154.34f, 136.0f);
        pathBuilder.lineToRelative(-21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(160.0f, 130.34f);
        pathBuilder.lineToRelative(21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
