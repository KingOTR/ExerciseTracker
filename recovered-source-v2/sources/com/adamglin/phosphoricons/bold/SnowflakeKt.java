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

/* compiled from: Snowflake.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Snowflake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSnowflake", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowflake", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnowflakeKt {
    private static ImageVector _snowflake;

    public static final ImageVector getSnowflake(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(227.65f, 149.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.79f, 14.51f);
        pathBuilder.lineToRelative(-20.67f, 5.08f);
        pathBuilder.lineToRelative(5.4f, 20.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.18f, 6.22f);
        pathBuilder.lineToRelative(-7.29f, -27.2f);
        pathBuilder.lineTo(140.0f, 148.78f);
        pathBuilder.verticalLineTo(187.0f);
        pathBuilder.lineToRelative(20.48f, 20.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(128.0f, 209.0f);
        pathBuilder.lineToRelative(-15.51f, 15.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(116.0f, 187.0f);
        pathBuilder.verticalLineTo(148.78f);
        pathBuilder.lineTo(82.88f, 167.91f);
        pathBuilder.lineToRelative(-7.29f, 27.2f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.18f, -6.22f);
        pathBuilder.lineToRelative(5.4f, -20.16f);
        pathBuilder.lineToRelative(-20.67f, -5.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 5.72f, -23.3f);
        pathBuilder.lineToRelative(27.89f, 6.85f);
        pathBuilder.lineTo(104.0f, 128.0f);
        pathBuilder.lineTo(70.75f, 108.8f);
        pathBuilder.lineToRelative(-27.89f, 6.85f);
        pathBuilder.arcTo(11.8f, 11.8f, 0.0f, false, true, 40.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.85f, -23.65f);
        pathBuilder.lineToRelative(20.67f, -5.08f);
        pathBuilder.lineToRelative(-5.4f, -20.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.18f, -6.22f);
        pathBuilder.lineToRelative(7.29f, 27.2f);
        pathBuilder.lineTo(116.0f, 107.21f);
        pathBuilder.verticalLineTo(69.0f);
        pathBuilder.lineTo(95.52f, 48.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(128.0f, 47.0f);
        pathBuilder.lineToRelative(15.51f, -15.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f);
        pathBuilder.lineTo(140.0f, 69.0f);
        pathBuilder.verticalLineToRelative(38.24f);
        pathBuilder.lineToRelative(33.12f, -19.12f);
        pathBuilder.lineToRelative(7.29f, -27.2f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.18f, 6.22f);
        pathBuilder.lineToRelative(-5.4f, 20.16f);
        pathBuilder.lineToRelative(20.67f, 5.08f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 116.0f);
        pathBuilder.arcToRelative(11.8f, 11.8f, 0.0f, false, true, -2.87f, -0.35f);
        pathBuilder.lineToRelative(-27.89f, -6.85f);
        pathBuilder.lineTo(152.0f, 128.0f);
        pathBuilder.lineToRelative(33.25f, 19.2f);
        pathBuilder.lineToRelative(27.89f, -6.85f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 227.65f, 149.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snowflake = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
