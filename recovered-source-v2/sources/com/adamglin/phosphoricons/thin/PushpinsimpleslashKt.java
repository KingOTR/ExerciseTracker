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

/* compiled from: Pushpinsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPushPinSimpleSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinsimpleslashKt {
    private static ImageVector _pushPinSimpleSlash;

    public static final ImageVector getPushPinSimpleSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(87.25f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(192.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(180.77f, 44.0f);
        pathBuilder.lineToRelative(19.58f, 111.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, 4.63f);
        pathBuilder.arcToRelative(3.33f, 3.33f, 0.0f, false, true, -0.7f, 0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.93f, -3.31f);
        pathBuilder.lineTo(172.64f, 44.0f);
        pathBuilder.lineTo(91.25f, 44.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 87.25f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.69f, 219.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, -0.27f);
        pathBuilder.lineTo(169.87f, 180.0f);
        pathBuilder.lineTo(132.0f, 180.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 180.0f);
        pathBuilder.lineTo(40.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(52.64f, 172.0f);
        pathBuilder.lineTo(70.52f, 70.72f);
        pathBuilder.lineTo(45.0f, 42.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f);
        pathBuilder.lineToRelative(160.0f, 176.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 210.69f, 219.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.59f, 172.0f);
        pathBuilder.lineTo(77.32f, 78.2f);
        pathBuilder.lineTo(60.77f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
