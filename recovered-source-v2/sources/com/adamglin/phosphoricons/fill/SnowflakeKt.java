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

/* compiled from: Snowflake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Snowflake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSnowflake", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowflake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnowflakeKt {
    private static ImageVector _snowflake;

    public static final ImageVector getSnowflake(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _snowflake;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Snowflake", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.37f, 143.22f);
        pathBuilder.lineTo(189.31f, 136.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.38f, 15.08f);
        pathBuilder.lineToRelative(-15.48f, 5.52f);
        pathBuilder.lineToRelative(4.52f, 16.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f);
        pathBuilder.arcTo(8.23f, 8.23f, 0.0f, false, true, 176.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.73f, -5.93f);
        pathBuilder.lineToRelative(-5.57f, -20.8f);
        pathBuilder.lineTo(136.0f, 141.86f);
        pathBuilder.verticalLineToRelative(30.83f);
        pathBuilder.lineToRelative(13.66f, 13.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(128.0f, 187.31f);
        pathBuilder.lineToRelative(-10.34f, 10.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineTo(120.0f, 172.69f);
        pathBuilder.lineTo(120.0f, 141.86f);
        pathBuilder.lineTo(93.3f, 157.27f);
        pathBuilder.lineToRelative(-5.57f, 20.8f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 184.0f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, true, -2.07f, -0.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -9.8f);
        pathBuilder.lineToRelative(4.52f, -16.87f);
        pathBuilder.lineToRelative(-15.48f, -5.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.38f, -15.08f);
        pathBuilder.lineToRelative(18.94f, 6.76f);
        pathBuilder.lineTo(112.0f, 128.0f);
        pathBuilder.lineTo(85.63f, 112.78f);
        pathBuilder.lineToRelative(-18.94f, 6.76f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 64.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.69f, -15.54f);
        pathBuilder.lineToRelative(15.48f, -5.52f);
        pathBuilder.lineTo(72.27f, 82.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, -4.14f);
        pathBuilder.lineToRelative(5.57f, 20.8f);
        pathBuilder.lineTo(120.0f, 114.14f);
        pathBuilder.lineTo(120.0f, 83.31f);
        pathBuilder.lineTo(106.34f, 69.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineTo(128.0f, 68.69f);
        pathBuilder.lineToRelative(10.34f, -10.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineTo(136.0f, 83.31f);
        pathBuilder.verticalLineToRelative(30.83f);
        pathBuilder.lineToRelative(26.7f, -15.41f);
        pathBuilder.lineToRelative(5.57f, -20.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, 4.14f);
        pathBuilder.lineToRelative(-4.52f, 16.87f);
        pathBuilder.lineToRelative(15.48f, 5.52f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 120.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -2.69f, -0.46f);
        pathBuilder.lineToRelative(-18.94f, -6.76f);
        pathBuilder.lineTo(144.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snowflake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
