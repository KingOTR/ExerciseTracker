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

/* compiled from: Pushpinslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPushPinSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinslashKt {
    private static ImageVector _pushPinSlash;

    public static final ImageVector getPushPinSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineTo(60.0f, 71.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 35.46f, 84.51f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.6f, 29.73f);
        pathBuilder.lineToRelative(45.46f, 45.47f);
        pathBuilder.lineToRelative(-39.8f, 39.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(39.8f, -39.81f);
        pathBuilder.lineToRelative(45.47f, 45.46f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 155.9f, 228.0f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.94f, 0.0f, 1.41f, -0.05f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 171.87f, 220.0f);
        pathBuilder.arcToRelative(97.47f, 97.47f, 0.0f, false, false, 9.54f, -15.46f);
        pathBuilder.lineToRelative(17.72f, 19.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(155.37f, 201.81f);
        pathBuilder.lineTo(54.08f, 100.52f);
        pathBuilder.curveTo(62.0f, 95.0f, 70.31f, 92.12f, 78.91f, 91.83f);
        pathBuilder.lineToRelative(84.51f, 93.0f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, true, 155.37f, 201.81f);
        pathBuilder.close();
        pathBuilder.moveTo(238.15f, 106.81f);
        pathBuilder.lineTo(199.15f, 145.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -16.95f);
        pathBuilder.lineToRelative(36.19f, -36.3f);
        pathBuilder.lineToRelative(-55.0f, -55.0f);
        pathBuilder.lineTo(130.59f, 70.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -16.94f);
        pathBuilder.lineToRelative(35.57f, -35.69f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.3f, 0.0f);
        pathBuilder.lineToRelative(60.69f, 60.68f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 238.15f, 106.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
