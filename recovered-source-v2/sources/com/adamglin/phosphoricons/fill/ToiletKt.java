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

/* compiled from: Toilet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Toilet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getToilet", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_toilet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToiletKt {
    private static ImageVector _toilet;

    public static final ImageVector getToilet(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _toilet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Toilet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(60.0f, 88.0f);
        pathBuilder.lineTo(196.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(200.0f, 40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(72.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f);
        pathBuilder.lineTo(56.0f, 84.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(15.73f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 112.0f, 55.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 64.0f);
        pathBuilder.lineTo(88.27f, 64.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 80.0f, 56.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 112.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.06f);
        pathBuilder.lineTo(40.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.06f);
        pathBuilder.arcToRelative(96.1f, 96.1f, 0.0f, false, false, 51.68f, 85.08f);
        pathBuilder.lineToRelative(-3.47f, 24.27f);
        pathBuilder.arcToRelative(16.43f, 16.43f, 0.0f, false, false, 1.63f, 10.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 240.0f);
        pathBuilder.horizontalLineToRelative(63.66f);
        pathBuilder.arcToRelative(16.52f, 16.52f, 0.0f, false, false, 9.72f, -3.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.46f, -15.23f);
        pathBuilder.lineToRelative(-3.52f, -24.6f);
        pathBuilder.arcTo(96.1f, 96.1f, 0.0f, false, false, 224.0f, 112.06f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 224.0f);
        pathBuilder.lineToRelative(2.93f, -20.5f);
        pathBuilder.arcToRelative(96.15f, 96.15f, 0.0f, false, false, 58.14f, 0.0f);
        pathBuilder.lineTo(160.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _toilet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
