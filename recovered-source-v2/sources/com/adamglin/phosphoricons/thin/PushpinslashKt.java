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

/* compiled from: Pushpinslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPushPinSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinslashKt {
    private static ImageVector _pushPinSlash;

    public static final ImageVector getPushPinSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pushPinSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPinSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(75.35f, 76.0f);
        pathBuilder.curveToRelative(-9.93f, 0.88f, -22.26f, 4.54f, -34.87f, 14.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, 17.84f);
        pathBuilder.lineToRelative(51.13f, 51.13f);
        pathBuilder.lineTo(45.17f, 205.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(45.46f, -45.47f);
        pathBuilder.lineToRelative(51.12f, 51.12f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 155.9f, 220.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.57f, 0.0f, 0.85f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.73f, -4.74f);
        pathBuilder.arcToRelative(81.06f, 81.06f, 0.0f, false, false, 13.19f, -25.55f);
        pathBuilder.lineToRelative(26.37f, 29.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(159.08f, 210.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 0.4f);
        pathBuilder.lineTo(45.17f, 102.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.33f, -6.0f);
        pathBuilder.curveToRelative(14.08f, -11.36f, 27.62f, -13.5f, 37.0f, -13.12f);
        pathBuilder.lineToRelative(89.69f, 98.65f);
        pathBuilder.curveTo(170.07f, 193.92f, 164.0f, 203.92f, 159.08f, 210.42f);
        pathBuilder.close();
        pathBuilder.moveTo(232.49f, 101.17f);
        pathBuilder.lineTo(187.85f, 146.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.67f, -5.64f);
        pathBuilder.lineToRelative(44.65f, -44.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f);
        pathBuilder.lineTo(166.15f, 29.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f);
        pathBuilder.lineTo(119.27f, 70.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.67f, -5.65f);
        pathBuilder.lineToRelative(41.23f, -41.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineTo(232.49f, 84.2f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 101.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
