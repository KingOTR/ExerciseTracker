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

/* compiled from: Userrectangle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserRectangle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUserRectangle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userRectangle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserrectangleKt {
    private static ImageVector _userRectangle;

    public static final ImageVector getUserRectangle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _userRectangle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserRectangle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 36.0f);
        pathBuilder.lineTo(40.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f);
        pathBuilder.lineTo(20.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(216.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(236.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 128.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 180.0f);
        pathBuilder.arcToRelative(59.66f, 59.66f, 0.0f, false, true, 40.85f, 16.0f);
        pathBuilder.lineTo(87.15f, 196.0f);
        pathBuilder.arcTo(59.66f, 59.66f, 0.0f, false, true, 128.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 196.0f);
        pathBuilder.lineTo(199.56f, 196.0f);
        pathBuilder.arcTo(83.46f, 83.46f, 0.0f, false, false, 165.0f, 164.5f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, -74.0f, 0.0f);
        pathBuilder.arcTo(83.46f, 83.46f, 0.0f, false, false, 56.44f, 196.0f);
        pathBuilder.lineTo(44.0f, 196.0f);
        pathBuilder.lineTo(44.0f, 60.0f);
        pathBuilder.lineTo(212.0f, 60.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userRectangle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
