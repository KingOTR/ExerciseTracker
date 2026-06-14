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

/* compiled from: Handspraying.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsPraying", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandsPraying", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsPraying", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsprayingKt {
    private static ImageVector _handsPraying;

    public static final ImageVector getHandsPraying(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handsPraying;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsPraying", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.9f, 181.42f);
        pathBuilder.lineToRelative(-36.59f, -36.6f);
        pathBuilder.lineTo(160.71f, 24.0f);
        pathBuilder.arcTo(19.75f, 19.75f, 0.0f, false, false, 128.0f, 15.62f);
        pathBuilder.arcTo(19.75f, 19.75f, 0.0f, false, false, 95.29f, 24.0f);
        pathBuilder.lineTo(58.69f, 144.82f);
        pathBuilder.lineTo(22.1f, 181.42f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.79f);
        pathBuilder.lineTo(54.79f, 233.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.79f, 0.0f);
        pathBuilder.lineToRelative(48.29f, -48.28f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 5.13f, -6.38f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 5.13f, 6.38f);
        pathBuilder.lineToRelative(48.29f, 48.28f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.79f, 0.0f);
        pathBuilder.lineToRelative(32.69f, -32.69f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.79f);
        pathBuilder.close();
        pathBuilder.moveTo(66.1f, 225.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(30.58f, 192.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineToRelative(14.11f, -14.1f);
        pathBuilder.lineTo(80.2f, 211.31f);
        pathBuilder.close();
        pathBuilder.moveTo(114.38f, 177.13f);
        pathBuilder.lineTo(88.69f, 202.83f);
        pathBuilder.lineTo(53.17f, 167.31f);
        pathBuilder.lineToRelative(15.07f, -15.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.5f, -2.5f);
        pathBuilder.lineToRelative(37.0f, -122.22f);
        pathBuilder.arcTo(7.78f, 7.78f, 0.0f, false, true, 122.0f, 29.78f);
        pathBuilder.verticalLineToRelative(129.0f);
        pathBuilder.arcTo(25.83f, 25.83f, 0.0f, false, true, 114.38f, 177.13f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 158.75f);
        pathBuilder.verticalLineToRelative(-129.0f);
        pathBuilder.arcToRelative(7.78f, 7.78f, 0.0f, false, true, 15.22f, -2.26f);
        pathBuilder.lineToRelative(37.0f, 122.22f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.5f, 2.5f);
        pathBuilder.lineToRelative(15.93f, 15.94f);
        pathBuilder.lineToRelative(-36.28f, 34.74f);
        pathBuilder.lineToRelative(-25.79f, -25.79f);
        pathBuilder.arcTo(25.83f, 25.83f, 0.0f, false, true, 134.0f, 158.75f);
        pathBuilder.close();
        pathBuilder.moveTo(225.42f, 192.75f);
        pathBuilder.lineTo(192.73f, 225.44f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-14.0f, -14.0f);
        pathBuilder.lineToRelative(36.29f, -34.74f);
        pathBuilder.lineToRelative(13.24f, 13.23f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 192.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsPraying = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
