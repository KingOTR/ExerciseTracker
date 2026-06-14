package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cloudslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCloudSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudslashKt {
    private static ImageVector _cloudSlash;

    public static final ImageVector getCloudSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cloudSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineToRelative(40.18f, 44.2f);
        pathBuilder.curveToRelative(-0.45f, 0.87f, -0.9f, 1.75f, -1.32f, 2.64f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, true, false, 72.0f, 214.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(85.23f, 85.23f, 0.0f, false, false, 32.35f, -6.3f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 202.0f);
        pathBuilder.lineTo(72.0f, 202.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, true, true, 5.9f, -99.64f);
        pathBuilder.arcTo(86.25f, 86.25f, 0.0f, false, false, 74.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(73.92f, 73.92f, 0.0f, false, true, 6.44f, -30.2f);
        pathBuilder.lineToRelative(91.22f, 100.34f);
        pathBuilder.arcTo(73.65f, 73.65f, 0.0f, false, true, 160.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 128.0f);
        pathBuilder.arcToRelative(85.85f, 85.85f, 0.0f, false, true, -21.85f, 57.27f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, 2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, -10.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, -99.0f, -108.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.11f, -9.67f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, false, true, 246.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
