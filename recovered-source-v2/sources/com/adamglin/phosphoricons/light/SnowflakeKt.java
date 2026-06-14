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

/* compiled from: Snowflake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Snowflake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSnowflake", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowflake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnowflakeKt {
    private static ImageVector _snowflake;

    public static final ImageVector getSnowflake(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(221.83f, 150.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.4f, 7.26f);
        pathBuilder.lineToRelative(-26.62f, 6.54f);
        pathBuilder.lineToRelative(7.0f, 26.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, 7.35f);
        pathBuilder.arcToRelative(6.4f, 6.4f, 0.0f, false, true, -1.55f, 0.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.45f);
        pathBuilder.lineTo(178.27f, 164.0f);
        pathBuilder.lineTo(134.0f, 138.39f);
        pathBuilder.verticalLineToRelative(51.13f);
        pathBuilder.lineToRelative(22.24f, 22.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(128.0f, 200.49f);
        pathBuilder.lineToRelative(-19.76f, 19.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(122.0f, 189.52f);
        pathBuilder.verticalLineTo(138.39f);
        pathBuilder.lineTo(77.73f, 164.0f);
        pathBuilder.lineToRelative(-7.93f, 29.6f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 64.0f, 198.0f);
        pathBuilder.arcToRelative(6.4f, 6.4f, 0.0f, false, true, -1.55f, -0.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -7.35f);
        pathBuilder.lineToRelative(7.0f, -26.08f);
        pathBuilder.lineToRelative(-26.62f, -6.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.86f, -11.66f);
        pathBuilder.lineToRelative(30.23f, 7.43f);
        pathBuilder.lineTo(116.0f, 128.0f);
        pathBuilder.lineTo(71.66f, 102.4f);
        pathBuilder.lineToRelative(-30.23f, 7.43f);
        pathBuilder.arcTo(5.88f, 5.88f, 0.0f, false, true, 40.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.43f, -11.83f);
        pathBuilder.lineToRelative(26.62f, -6.54f);
        pathBuilder.lineToRelative(-7.0f, -26.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.59f, -3.1f);
        pathBuilder.lineToRelative(7.93f, 29.6f);
        pathBuilder.lineTo(122.0f, 117.61f);
        pathBuilder.verticalLineTo(66.48f);
        pathBuilder.lineTo(99.76f, 44.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(128.0f, 55.51f);
        pathBuilder.lineToRelative(19.76f, -19.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineTo(134.0f, 66.48f);
        pathBuilder.verticalLineToRelative(51.13f);
        pathBuilder.lineToRelative(44.27f, -25.56f);
        pathBuilder.lineToRelative(7.93f, -29.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.59f, 3.1f);
        pathBuilder.lineToRelative(-7.0f, 26.08f);
        pathBuilder.lineToRelative(26.62f, 6.54f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 110.0f);
        pathBuilder.arcToRelative(5.88f, 5.88f, 0.0f, false, true, -1.43f, -0.17f);
        pathBuilder.lineToRelative(-30.23f, -7.43f);
        pathBuilder.lineTo(140.0f, 128.0f);
        pathBuilder.lineToRelative(44.34f, 25.6f);
        pathBuilder.lineToRelative(30.23f, -7.43f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 221.83f, 150.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snowflake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
