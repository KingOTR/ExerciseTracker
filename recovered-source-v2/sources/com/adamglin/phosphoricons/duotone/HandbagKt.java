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

/* compiled from: Handbag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Handbag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandbag", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handbag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandbagKt {
    private static ImageVector _handbag;

    public static final ImageVector getHandbag(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _handbag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Handbag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.92f, 208.0f);
        pathBuilder.horizontalLineTo(32.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.93f);
        pathBuilder.lineToRelative(14.25f, -120.0f);
        pathBuilder.arcToRelative(8.06f, 8.06f, 0.0f, false, true, 8.0f, -7.07f);
        pathBuilder.horizontalLineTo(209.67f);
        pathBuilder.arcToRelative(8.06f, 8.06f, 0.0f, false, true, 8.0f, 7.07f);
        pathBuilder.lineToRelative(14.25f, 120.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.92f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.89f, 198.12f);
        pathBuilder2.lineToRelative(-14.26f, -120.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -14.12f);
        pathBuilder2.horizontalLineTo(176.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f);
        pathBuilder2.horizontalLineTo(46.33f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 14.12f);
        pathBuilder2.lineToRelative(-14.26f, 120.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 20.0f, 210.6f);
        pathBuilder2.arcToRelative(16.13f, 16.13f, 0.0f, false, false, 12.0f, 5.4f);
        pathBuilder2.horizontalLineTo(223.92f);
        pathBuilder2.arcTo(16.13f, 16.13f, 0.0f, false, false, 236.0f, 210.6f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 239.89f, 198.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 32.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f);
        pathBuilder2.horizontalLineTo(96.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 200.0f);
        pathBuilder2.lineTo(46.33f, 80.0f);
        pathBuilder2.horizontalLineTo(80.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(80.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(80.0f);
        pathBuilder2.horizontalLineToRelative(33.75f);
        pathBuilder2.lineToRelative(14.17f, 120.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handbag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
