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

/* compiled from: Brain.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Brain", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBrain", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_brain", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrainKt {
    private static ImageVector _brain;

    public static final ImageVector getBrain(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _brain;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Brain", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 76.0f);
        pathBuilder.lineTo(212.0f, 72.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -74.86f, -31.31f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, -1.14f, 2.8f);
        pathBuilder.verticalLineToRelative(88.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.2f, 3.33f);
        pathBuilder.arcTo(47.67f, 47.67f, 0.0f, false, true, 167.68f, 128.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, 8.31f, 7.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.42f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f);
        pathBuilder.verticalLineToRelative(33.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.49f, 3.12f);
        pathBuilder.arcToRelative(47.92f, 47.92f, 0.0f, false, false, 74.21f, -17.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.49f, -5.56f);
        pathBuilder.arcTo(68.06f, 68.06f, 0.0f, false, true, 192.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(-7.73f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(51.6f, 51.6f, 0.0f, false, false, 24.0f, -5.88f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 212.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 112.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.lineTo(160.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 28.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 44.0f, 72.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -4.0f, 94.12f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(51.6f, 51.6f, 0.0f, false, false, 64.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(7.73f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 80.0f, 183.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 192.0f);
        pathBuilder.lineTo(64.0f, 192.0f);
        pathBuilder.arcToRelative(67.48f, 67.48f, 0.0f, false, true, -15.21f, -1.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.5f, 5.55f);
        pathBuilder.arcTo(47.93f, 47.93f, 0.0f, false, false, 118.51f, 213.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.49f, -3.12f);
        pathBuilder.lineTo(120.0f, 176.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.42f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 88.32f, 128.0f);
        pathBuilder.arcToRelative(47.67f, 47.67f, 0.0f, false, true, 25.48f, 7.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.2f, -3.33f);
        pathBuilder.lineTo(120.0f, 43.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.14f, -2.81f);
        pathBuilder.arcTo(43.85f, 43.85f, 0.0f, false, false, 88.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 76.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.lineTo(56.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 76.0f);
        pathBuilder.lineTo(80.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _brain = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
