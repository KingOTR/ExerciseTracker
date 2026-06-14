package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snowflake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Snowflake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSnowflake", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowflake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnowflakeKt {
    private static ImageVector _snowflake;

    public static final ImageVector getSnowflake(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, -92.0f, -92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(223.77f, 150.09f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.86f, 9.68f);
        pathBuilder2.lineToRelative(-24.64f, 6.0f);
        pathBuilder2.lineToRelative(6.46f, 24.11f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 9.8f);
        pathBuilder2.arcTo(8.25f, 8.25f, 0.0f, false, true, 192.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, -5.93f);
        pathBuilder2.lineToRelative(-7.72f, -28.8f);
        pathBuilder2.lineTo(136.0f, 141.86f);
        pathBuilder2.verticalLineToRelative(46.83f);
        pathBuilder2.lineToRelative(21.66f, 21.65f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.lineTo(128.0f, 203.31f);
        pathBuilder2.lineToRelative(-18.34f, 18.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineTo(120.0f, 188.69f);
        pathBuilder2.verticalLineTo(141.86f);
        pathBuilder2.lineTo(79.45f, 165.27f);
        pathBuilder2.lineToRelative(-7.72f, 28.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 200.0f);
        pathBuilder2.arcToRelative(8.25f, 8.25f, 0.0f, false, true, -2.08f, -0.27f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -9.8f);
        pathBuilder2.lineToRelative(6.46f, -24.11f);
        pathBuilder2.lineToRelative(-24.64f, -6.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.82f, -15.54f);
        pathBuilder2.lineToRelative(29.45f, 7.23f);
        pathBuilder2.lineTo(112.0f, 128.0f);
        pathBuilder2.lineTo(71.36f, 104.54f);
        pathBuilder2.lineToRelative(-29.45f, 7.23f);
        pathBuilder2.arcTo(7.85f, 7.85f, 0.0f, false, true, 40.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.91f, -15.77f);
        pathBuilder2.lineToRelative(24.64f, -6.0f);
        pathBuilder2.lineTo(56.27f, 66.07f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, -4.14f);
        pathBuilder2.lineToRelative(7.72f, 28.8f);
        pathBuilder2.lineTo(120.0f, 114.14f);
        pathBuilder2.verticalLineTo(67.31f);
        pathBuilder2.lineTo(98.34f, 45.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(128.0f, 52.69f);
        pathBuilder2.lineToRelative(18.34f, -18.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineTo(136.0f, 67.31f);
        pathBuilder2.verticalLineToRelative(46.83f);
        pathBuilder2.lineToRelative(40.55f, -23.41f);
        pathBuilder2.lineToRelative(7.72f, -28.8f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.46f, 4.14f);
        pathBuilder2.lineToRelative(-6.46f, 24.11f);
        pathBuilder2.lineToRelative(24.64f, 6.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 112.0f);
        pathBuilder2.arcToRelative(7.85f, 7.85f, 0.0f, false, true, -1.91f, -0.23f);
        pathBuilder2.lineToRelative(-29.45f, -7.23f);
        pathBuilder2.lineTo(144.0f, 128.0f);
        pathBuilder2.lineToRelative(40.64f, 23.46f);
        pathBuilder2.lineToRelative(29.45f, -7.23f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.77f, 150.09f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snowflake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
