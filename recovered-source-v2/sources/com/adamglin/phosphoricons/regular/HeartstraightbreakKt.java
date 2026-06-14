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

/* compiled from: Heartstraightbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartStraightBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHeartStraightBreak", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartStraightBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartstraightbreakKt {
    private static ImageVector _heartStraightBreak;

    public static final ImageVector getHeartStraightBreak(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _heartStraightBreak;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartStraightBreak", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.0f, 57.0f);
        pathBuilder.arcToRelative(58.1f, 58.1f, 0.0f, false, false, -82.0f, -0.06f);
        pathBuilder.lineTo(128.0f, 69.47f);
        pathBuilder.lineTo(115.0f, 56.91f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, -82.0f, 82.05f);
        pathBuilder.lineToRelative(89.37f, 90.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.4f, 0.0f);
        pathBuilder.lineTo(223.0f, 139.0f);
        pathBuilder.arcTo(58.09f, 58.09f, 0.0f, false, false, 223.0f, 57.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.64f, 127.76f);
        pathBuilder.lineTo(128.0f, 212.6f);
        pathBuilder.lineTo(44.29f, 127.68f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, true, true, 59.41f, -59.4f);
        pathBuilder.lineToRelative(0.1f, 0.1f);
        pathBuilder.lineToRelative(12.67f, 12.19f);
        pathBuilder.lineToRelative(-10.0f, 9.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.11f, 11.42f);
        pathBuilder.lineTo(132.69f, 128.0f);
        pathBuilder.lineToRelative(-10.35f, 10.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f);
        pathBuilder.lineTo(123.42f, 96.09f);
        pathBuilder.lineTo(152.2f, 68.38f);
        pathBuilder.lineToRelative(0.11f, -0.1f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, true, true, 59.37f, 59.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartStraightBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
