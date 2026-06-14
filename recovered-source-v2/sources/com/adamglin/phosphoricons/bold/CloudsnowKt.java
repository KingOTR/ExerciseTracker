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

/* compiled from: Cloudsnow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSnow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCloudSnow", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSnow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudsnowKt {
    private static ImageVector _cloudSnow;

    public static final ImageVector getCloudSnow(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cloudSnow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudSnow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 92.0f);
        pathBuilder.arcToRelative(80.09f, 80.09f, 0.0f, false, true, -80.0f, 80.0f);
        pathBuilder.lineTo(76.0f, 172.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, true, 76.0f, 60.0f);
        pathBuilder.arcToRelative(56.76f, 56.76f, 0.0f, false, true, 6.39f, 0.36f);
        pathBuilder.arcTo(80.08f, 80.08f, 0.0f, false, true, 236.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 92.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -112.0f, -3.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, -1.38f);
        pathBuilder.curveToRelative(0.06f, -1.11f, 0.15f, -2.21f, 0.26f, -3.31f);
        pathBuilder.lineTo(76.0f, 84.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 212.0f, 92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSnow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
