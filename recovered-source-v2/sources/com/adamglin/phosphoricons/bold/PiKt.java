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

/* compiled from: Pi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPi", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pi", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PiKt {
    private static ImageVector _pi;

    public static final ImageVector getPi(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pi;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pi", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 172.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -80.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineTo(100.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 72.0f, 52.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.horizontalLineTo(180.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pi = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
