package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Unite.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Unite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUnite", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_unite", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniteKt {
    private static ImageVector _unite;

    public static final ImageVector getUnite(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _unite;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Unite", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.63f, 81.37f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 160.0f);
        pathBuilder.curveToRelative(0.0f, 1.52f, -0.07f, 3.0f, -0.18f, 4.51f);
        pathBuilder.lineToRelative(-50.0f, -50.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, false, 176.0f, 98.0f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 224.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(45.47f, 56.79f);
        pathBuilder.lineTo(98.09f, 109.4f);
        pathBuilder.arcToRelative(80.5f, 80.5f, 0.0f, false, false, -9.93f, 15.44f);
        pathBuilder.lineTo(36.3f, 73.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 45.47f, 56.79f);
        pathBuilder.close();
        pathBuilder.moveTo(73.0f, 36.3f);
        pathBuilder.lineToRelative(51.86f, 51.86f);
        pathBuilder.arcToRelative(80.5f, 80.5f, 0.0f, false, false, -15.44f, 9.93f);
        pathBuilder.lineTo(56.79f, 45.47f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 73.0f, 36.3f);
        pathBuilder.close();
        pathBuilder.moveTo(134.46f, 147.13f);
        pathBuilder.lineTo(108.89f, 121.56f);
        pathBuilder.arcToRelative(64.65f, 64.65f, 0.0f, false, true, 12.69f, -12.69f);
        pathBuilder.lineToRelative(25.57f, 25.57f);
        pathBuilder.arcTo(64.65f, 64.65f, 0.0f, false, true, 134.44f, 147.13f);
        pathBuilder.close();
        pathBuilder.moveTo(155.31f, 120.0f);
        pathBuilder.lineTo(136.0f, 100.69f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 160.0f, 96.0f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 155.31f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.69f, 136.0f);
        pathBuilder.lineTo(120.0f, 155.31f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 96.0f, 160.0f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 100.69f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.6f, 157.91f);
        pathBuilder.lineTo(199.21f, 210.53f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 183.0f, 219.7f);
        pathBuilder.lineToRelative(-51.86f, -51.86f);
        pathBuilder.arcTo(80.5f, 80.5f, 0.0f, false, false, 146.6f, 157.91f);
        pathBuilder.close();
        pathBuilder.moveTo(157.91f, 146.6f);
        pathBuilder.arcToRelative(80.5f, 80.5f, 0.0f, false, false, 9.93f, -15.44f);
        pathBuilder.lineTo(219.7f, 183.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, -9.17f, 16.19f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 80.05f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, -16.49f, 2.13f);
        pathBuilder.lineToRelative(-50.0f, -50.0f);
        pathBuilder.curveTo(93.0f, 32.07f, 94.48f, 32.0f, 96.0f, 32.0f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 158.0f, 80.05f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 96.0f);
        pathBuilder.curveToRelative(0.0f, -1.52f, 0.07f, -3.0f, 0.18f, -4.51f);
        pathBuilder.lineToRelative(50.0f, 50.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, false, 80.05f, 158.0f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.0f, 176.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 16.49f, -2.13f);
        pathBuilder.lineToRelative(50.0f, 50.0f);
        pathBuilder.curveToRelative(-1.49f, 0.11f, -3.0f, 0.18f, -4.51f, 0.18f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _unite = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
