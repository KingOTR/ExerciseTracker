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

/* compiled from: Pushpinsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPushPinSimpleSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinsimpleslashKt {
    private static ImageVector _pushPinSimpleSlash;

    public static final ImageVector getPushPinSimpleSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pushPinSimpleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPinSimpleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(85.25f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(192.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-8.85f);
        pathBuilder.lineToRelative(19.17f, 108.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.86f, 7.0f);
        pathBuilder.arcToRelative(5.41f, 5.41f, 0.0f, false, true, -1.05f, 0.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, -5.0f);
        pathBuilder.lineTo(171.0f, 46.0f);
        pathBuilder.lineTo(91.25f, 46.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 85.25f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 220.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -0.4f);
        pathBuilder.lineTo(169.0f, 182.0f);
        pathBuilder.lineTo(134.0f, 182.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 182.0f);
        pathBuilder.lineTo(40.0f, 182.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(51.0f, 170.0f);
        pathBuilder.lineTo(68.38f, 71.33f);
        pathBuilder.lineTo(43.56f, 44.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f);
        pathBuilder.lineToRelative(160.0f, 176.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 212.0f, 220.44f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 170.0f);
        pathBuilder.lineTo(78.58f, 82.56f);
        pathBuilder.lineTo(63.15f, 170.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
