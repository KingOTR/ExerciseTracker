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

/* compiled from: Heartstraightbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartStraightBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHeartStraightBreak", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartStraightBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartstraightbreakKt {
    private static ImageVector _heartStraightBreak;

    public static final ImageVector getHeartStraightBreak(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(220.21f, 59.8f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, -76.34f, 0.0f);
        pathBuilder.lineTo(128.0f, 75.0f);
        pathBuilder.lineTo(112.18f, 59.8f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, -76.4f, 76.35f);
        pathBuilder.lineToRelative(89.37f, 90.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.7f, 0.0f);
        pathBuilder.lineToRelative(89.36f, -90.64f);
        pathBuilder.arcTo(54.07f, 54.07f, 0.0f, false, false, 220.21f, 59.8f);
        pathBuilder.close();
        pathBuilder.moveTo(214.53f, 130.54f);
        pathBuilder.lineTo(128.0f, 218.3f);
        pathBuilder.lineTo(41.45f, 130.52f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, true, 65.13f, -65.0f);
        pathBuilder.lineToRelative(15.65f, 15.07f);
        pathBuilder.lineToRelative(-13.0f, 12.52f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.86f);
        pathBuilder.lineTo(138.35f, 128.0f);
        pathBuilder.lineToRelative(-13.18f, 13.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f);
        pathBuilder.lineTo(117.71f, 96.0f);
        pathBuilder.lineToRelative(31.77f, -30.58f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, 65.05f, 65.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartStraightBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
