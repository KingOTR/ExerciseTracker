package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cloudsnow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSnow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCloudSnow", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSnow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudsnowKt {
    private static ImageVector _cloudSnow;

    public static final ImageVector getCloudSnow(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 92.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, -68.0f, 68.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, true, 90.2f, 74.34f);
        pathBuilder.verticalLineToRelative(0.11f);
        pathBuilder.arcTo(68.06f, 68.06f, 0.0f, false, true, 224.0f, 92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(88.0f, 196.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 196.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(116.0f, 200.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(164.0f, 184.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(68.0f, 224.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.0f, 224.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 92.0f);
        pathBuilder2.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f);
        pathBuilder2.lineTo(76.0f, 168.0f);
        pathBuilder2.arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 64.0f);
        pathBuilder2.arcToRelative(53.26f, 53.26f, 0.0f, false, true, 8.92f, 0.76f);
        pathBuilder2.arcTo(76.08f, 76.08f, 0.0f, false, true, 232.0f, 92.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 92.0f);
        pathBuilder2.arcTo(60.06f, 60.06f, 0.0f, false, false, 96.0f, 88.46f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, -0.92f);
        pathBuilder2.quadToRelative(0.21f, -3.66f, 0.77f, -7.23f);
        pathBuilder2.arcTo(38.11f, 38.11f, 0.0f, false, false, 76.0f, 80.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.arcTo(60.07f, 60.07f, 0.0f, false, false, 216.0f, 92.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSnow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
