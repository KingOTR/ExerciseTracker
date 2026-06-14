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

/* compiled from: Snowflake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Snowflake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSnowflake", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowflake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnowflakeKt {
    private static ImageVector _snowflake;

    public static final ImageVector getSnowflake(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.88f, 151.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.93f, 4.83f);
        pathBuilder.lineToRelative(-28.6f, 7.0f);
        pathBuilder.lineTo(195.86f, 191.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, 4.9f);
        pathBuilder.arcToRelative(3.65f, 3.65f, 0.0f, false, true, -1.0f, 0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, -3.0f);
        pathBuilder.lineTo(180.0f, 162.64f);
        pathBuilder.lineToRelative(-48.0f, -27.71f);
        pathBuilder.verticalLineToRelative(55.41f);
        pathBuilder.lineToRelative(22.83f, 22.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(128.0f, 197.66f);
        pathBuilder.lineToRelative(-21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(124.0f, 190.34f);
        pathBuilder.verticalLineTo(134.93f);
        pathBuilder.lineTo(76.0f, 162.64f);
        pathBuilder.lineTo(67.86f, 193.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 196.0f);
        pathBuilder.arcToRelative(3.65f, 3.65f, 0.0f, false, true, -1.0f, -0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -4.9f);
        pathBuilder.lineToRelative(7.51f, -28.05f);
        pathBuilder.lineToRelative(-28.6f, -7.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 41.0f, 148.12f);
        pathBuilder.lineToRelative(31.0f, 7.61f);
        pathBuilder.lineTo(120.0f, 128.0f);
        pathBuilder.lineTo(72.0f, 100.27f);
        pathBuilder.lineToRelative(-31.0f, 7.61f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, -1.0f, 0.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -7.88f);
        pathBuilder.lineToRelative(28.6f, -7.0f);
        pathBuilder.lineTo(60.14f, 65.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 67.86f, 63.0f);
        pathBuilder.lineTo(76.0f, 93.36f);
        pathBuilder.lineToRelative(48.0f, 27.71f);
        pathBuilder.verticalLineTo(65.66f);
        pathBuilder.lineTo(101.17f, 42.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(128.0f, 58.34f);
        pathBuilder.lineToRelative(21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.lineTo(132.0f, 65.66f);
        pathBuilder.verticalLineToRelative(55.41f);
        pathBuilder.lineToRelative(48.0f, -27.71f);
        pathBuilder.lineTo(188.14f, 63.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 195.86f, 65.0f);
        pathBuilder.lineToRelative(-7.51f, 28.05f);
        pathBuilder.lineToRelative(28.6f, 7.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 108.0f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, -1.0f, -0.12f);
        pathBuilder.lineToRelative(-31.0f, -7.61f);
        pathBuilder.lineTo(136.0f, 128.0f);
        pathBuilder.lineToRelative(48.0f, 27.73f);
        pathBuilder.lineToRelative(31.0f, -7.61f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 219.88f, 151.05f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snowflake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
