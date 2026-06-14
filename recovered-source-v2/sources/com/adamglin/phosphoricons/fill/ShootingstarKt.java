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

/* compiled from: Shootingstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShootingStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getShootingStar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shootingStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShootingstarKt {
    private static ImageVector _shootingStar;

    public static final ImageVector getShootingStar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _shootingStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShootingStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.24f, 84.38f);
        pathBuilder.lineToRelative(-28.06f, 23.68f);
        pathBuilder.lineToRelative(8.56f, 35.39f);
        pathBuilder.arcToRelative(13.34f, 13.34f, 0.0f, false, true, -5.09f, 13.91f);
        pathBuilder.arcToRelative(13.54f, 13.54f, 0.0f, false, true, -15.0f, 0.69f);
        pathBuilder.lineTo(164.0f, 139.0f);
        pathBuilder.lineToRelative(-31.65f, 19.06f);
        pathBuilder.arcToRelative(13.51f, 13.51f, 0.0f, false, true, -15.0f, -0.69f);
        pathBuilder.arcToRelative(13.32f, 13.32f, 0.0f, false, true, -5.1f, -13.91f);
        pathBuilder.lineToRelative(8.56f, -35.39f);
        pathBuilder.lineTo(92.76f, 84.38f);
        pathBuilder.arcToRelative(13.39f, 13.39f, 0.0f, false, true, 7.66f, -23.58f);
        pathBuilder.lineToRelative(36.94f, -2.92f);
        pathBuilder.lineToRelative(14.21f, -33.66f);
        pathBuilder.arcToRelative(13.51f, 13.51f, 0.0f, false, true, 24.86f, 0.0f);
        pathBuilder.lineToRelative(14.21f, 33.66f);
        pathBuilder.lineToRelative(36.94f, 2.92f);
        pathBuilder.arcToRelative(13.39f, 13.39f, 0.0f, false, true, 7.66f, 23.58f);
        pathBuilder.close();
        pathBuilder.moveTo(88.11f, 111.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(18.34f, 170.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(58.45f, -58.45f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.11f, 111.89f);
        pathBuilder.close();
        pathBuilder.moveTo(87.61f, 173.08f);
        pathBuilder.lineTo(34.34f, 226.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(53.26f, -53.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f);
        pathBuilder.close();
        pathBuilder.moveTo(160.61f, 172.08f);
        pathBuilder.lineTo(106.32f, 226.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(54.28f, -54.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shootingStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
