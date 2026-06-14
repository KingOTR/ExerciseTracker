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

/* compiled from: Screencast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Screencast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getScreencast", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_screencast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreencastKt {
    private static ImageVector _screencast;

    public static final ImageVector getScreencast(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _screencast;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Screencast", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 8.0f);
        pathBuilder.arcTo(8.28f, 8.28f, 0.0f, false, true, 40.0f, 207.76f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 32.24f, 200.0f);
        pathBuilder.arcTo(8.28f, 8.28f, 0.0f, false, true, 24.0f, 192.24f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 184.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.65f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 32.24f, 168.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 72.0f, 207.76f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 79.36f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 208.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 32.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.6f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, false, 8.3f, 7.4f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 104.0f, 207.68f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, false, 7.4f, 8.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.6f, -8.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, false, 32.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.verticalLineToRelative(44.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.15f, 4.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, true, 135.93f, 211.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.15f);
        pathBuilder.lineTo(216.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(232.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _screencast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
