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

/* compiled from: Cloudsun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCloudSun", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudsunKt {
    private static ImageVector _cloudSun;

    public static final ImageVector getCloudSun(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cloudSun;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudSun", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 72.0f);
        pathBuilder.arcToRelative(76.2f, 76.2f, 0.0f, false, false, -20.26f, 2.73f);
        pathBuilder.arcToRelative(55.63f, 55.63f, 0.0f, false, false, -9.41f, -11.54f);
        pathBuilder.lineToRelative(9.51f, -13.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.11f, -9.18f);
        pathBuilder.lineTo(121.22f, 54.0f);
        pathBuilder.arcTo(55.9f, 55.9f, 0.0f, false, false, 96.0f, 48.0f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.16f, 0.0f, -1.74f, 0.0f);
        pathBuilder.lineTo(91.37f, 31.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.75f, 2.77f);
        pathBuilder.lineTo(78.5f, 50.82f);
        pathBuilder.arcTo(56.1f, 56.1f, 0.0f, false, false, 55.23f, 65.67f);
        pathBuilder.lineTo(41.61f, 56.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.17f, 13.11f);
        pathBuilder.lineTo(46.0f, 78.77f);
        pathBuilder.arcTo(55.55f, 55.55f, 0.0f, false, false, 40.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 0.57f, 0.0f, 1.15f, 0.0f, 1.72f);
        pathBuilder.lineTo(23.71f, 108.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.38f, 15.88f);
        pathBuilder.arcToRelative(8.24f, 8.24f, 0.0f, false, false, 1.39f, -0.12f);
        pathBuilder.lineToRelative(16.32f, -2.88f);
        pathBuilder.arcToRelative(55.74f, 55.74f, 0.0f, false, false, 5.86f, 12.42f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 84.0f, 224.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.92f, 120.76f);
        pathBuilder.arcToRelative(52.14f, 52.14f, 0.0f, false, false, -31.0f, 4.17f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 66.62f, -44.17f);
        pathBuilder.arcTo(76.26f, 76.26f, 0.0f, false, false, 92.92f, 120.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
