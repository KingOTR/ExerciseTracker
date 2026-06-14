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

/* compiled from: Flyingsaucer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlyingSaucer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlyingSaucer", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flyingSaucer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlyingsaucerKt {
    private static ImageVector _flyingSaucer;

    public static final ImageVector getFlyingSaucer(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flyingSaucer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlyingSaucer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(179.79f, 214.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.53f, 5.06f);
        pathBuilder.arcTo(3.92f, 3.92f, 0.0f, false, true, 176.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.73f);
        pathBuilder.lineToRelative(-8.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.58f, -2.54f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 192.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.26f, 188.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.05f, 2.53f);
        pathBuilder.lineToRelative(-8.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.58f, 2.54f);
        pathBuilder.lineToRelative(8.0f, -24.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 89.26f, 188.2f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 29.16f, -50.95f, 52.0f, -116.0f, 52.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 141.16f, 12.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -20.31f, 24.8f, -38.16f, 64.84f, -46.8f);
        pathBuilder.arcToRelative(59.65f, 59.65f, 0.0f, false, true, 93.31f, -11.9f);
        pathBuilder.arcToRelative(60.91f, 60.91f, 0.0f, false, true, 9.42f, 12.0f);
        pathBuilder.curveTo(219.36f, 74.0f, 244.0f, 91.77f, 244.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 96.83f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.24f, 11.64f);
        pathBuilder.arcTo(192.0f, 192.0f, 0.0f, false, false, 128.0f, 116.0f);
        pathBuilder.arcToRelative(192.0f, 192.0f, 0.0f, false, false, 42.75f, -4.48f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 180.0f, 99.88f);
        pathBuilder.lineTo(180.0f, 96.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.69f, -52.0f);
        pathBuilder.curveTo(99.0f, 44.37f, 76.0f, 68.07f, 76.0f, 96.83f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -15.0f, -20.13f, -29.37f, -51.94f, -37.43f);
        pathBuilder.arcTo(59.9f, 59.9f, 0.0f, false, true, 188.0f, 96.0f);
        pathBuilder.verticalLineToRelative(3.91f);
        pathBuilder.arcToRelative(19.87f, 19.87f, 0.0f, false, true, -15.45f, 19.41f);
        pathBuilder.arcTo(199.69f, 199.69f, 0.0f, false, true, 128.0f, 124.0f);
        pathBuilder.arcToRelative(199.69f, 199.69f, 0.0f, false, true, -44.54f, -4.68f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, true, 68.0f, 99.91f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(68.0f, 96.85f);
        pathBuilder.arcToRelative(60.91f, 60.91f, 0.0f, false, true, 4.25f, -22.36f);
        pathBuilder.curveTo(40.25f, 82.54f, 20.0f, 96.88f, 20.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 23.85f, 49.46f, 44.0f, 108.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(236.0f, 135.85f, 236.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flyingSaucer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
