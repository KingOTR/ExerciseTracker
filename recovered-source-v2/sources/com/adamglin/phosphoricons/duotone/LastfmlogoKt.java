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

/* compiled from: Lastfmlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LastfmLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLastfmLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lastfmLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LastfmlogoKt {
    private static ImageVector _lastfmLogo;

    public static final ImageVector getLastfmLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _lastfmLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LastfmLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 64.0f, 72.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 160.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder2.horizontalLineTo(190.57f);
        pathBuilder2.arcToRelative(56.22f, 56.22f, 0.0f, false, true, -50.75f, -32.32f);
        pathBuilder2.lineToRelative(-30.14f, -64.6f);
        pathBuilder2.arcTo(40.15f, 40.15f, 0.0f, false, false, 73.43f, 80.0f);
        pathBuilder2.horizontalLineTo(64.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 29.34f, -19.2f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 116.0f, 171.2f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, false, true, 72.0f, 200.0f);
        pathBuilder2.horizontalLineTo(64.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, true, 8.0f, 144.0f);
        pathBuilder2.verticalLineTo(120.0f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, true, 64.0f, 64.0f);
        pathBuilder2.horizontalLineToRelative(9.43f);
        pathBuilder2.arcToRelative(56.22f, 56.22f, 0.0f, false, true, 50.75f, 32.32f);
        pathBuilder2.lineToRelative(30.14f, 64.6f);
        pathBuilder2.arcTo(40.15f, 40.15f, 0.0f, false, false, 190.57f, 184.0f);
        pathBuilder2.horizontalLineTo(208.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder2.horizontalLineTo(188.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.horizontalLineTo(188.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 160.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lastfmLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
