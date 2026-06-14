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

/* compiled from: Sparkle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sparkle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSparkle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sparkle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SparkleKt {
    private static ImageVector _sparkle;

    public static final ImageVector getSparkle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sparkle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sparkle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.2f, 132.81f);
        pathBuilder.lineToRelative(-53.36f, -19.65f);
        pathBuilder.lineTo(123.19f, 59.8f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -22.38f, 0.0f);
        pathBuilder.lineTo(81.16f, 113.16f);
        pathBuilder.lineTo(27.8f, 132.81f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, 22.38f);
        pathBuilder.lineToRelative(53.36f, 19.65f);
        pathBuilder.lineToRelative(19.65f, 53.36f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 22.38f, 0.0f);
        pathBuilder.lineToRelative(19.65f, -53.36f);
        pathBuilder.lineToRelative(53.36f, -19.65f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, -22.38f);
        pathBuilder.close();
        pathBuilder.moveTo(193.43f, 147.68f);
        pathBuilder.lineTo(138.35f, 168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.37f, 2.37f);
        pathBuilder.lineToRelative(-20.3f, 55.08f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -7.36f, 0.0f);
        pathBuilder.lineTo(88.0f, 170.35f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 85.65f, 168.0f);
        pathBuilder.lineToRelative(-55.08f, -20.3f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, -7.36f);
        pathBuilder.lineTo(85.65f, 120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 117.65f);
        pathBuilder.lineToRelative(20.3f, -55.08f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 7.36f, 0.0f);
        pathBuilder.lineTo(136.0f, 117.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.37f, 2.37f);
        pathBuilder.lineToRelative(55.08f, 20.3f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, 7.36f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(172.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(180.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(180.0f, 44.0f);
        pathBuilder.lineTo(180.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(172.0f, 44.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(228.0f, 92.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(220.0f, 92.0f);
        pathBuilder.lineTo(208.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(220.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(228.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sparkle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
