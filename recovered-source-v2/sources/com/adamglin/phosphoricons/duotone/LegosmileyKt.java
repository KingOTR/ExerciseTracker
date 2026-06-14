package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Legosmiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LegoSmiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLegoSmiley", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_legoSmiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegosmileyKt {
    private static ImageVector _legoSmiley;

    public static final ImageVector getLegoSmiley(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _legoSmiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LegoSmiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 56.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 208.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(100.0f, 124.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 124.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.0f, 100.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 100.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(151.73f, 145.23f);
        pathBuilder2.arcToRelative(45.0f, 45.0f, 0.0f, false, true, -47.46f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, 13.54f);
        pathBuilder2.arcToRelative(61.0f, 61.0f, 0.0f, false, false, 64.54f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, -13.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(32.06f, 32.06f, 0.0f, false, true, -24.0f, 31.0f);
        pathBuilder2.verticalLineToRelative(17.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(80.0f, 240.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.lineTo(64.0f, 207.0f);
        pathBuilder2.arcToRelative(32.06f, 32.06f, 0.0f, false, true, -24.0f, -31.0f);
        pathBuilder2.lineTo(40.0f, 80.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 72.0f, 48.0f);
        pathBuilder2.lineTo(88.0f, 48.0f);
        pathBuilder2.lineTo(88.0f, 32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f);
        pathBuilder2.lineTo(168.0f, 48.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 216.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 48.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.lineTo(152.0f, 32.0f);
        pathBuilder2.lineTo(104.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 224.0f);
        pathBuilder2.lineTo(176.0f, 208.0f);
        pathBuilder2.lineTo(80.0f, 208.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 80.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(72.0f, 64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(184.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _legoSmiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
