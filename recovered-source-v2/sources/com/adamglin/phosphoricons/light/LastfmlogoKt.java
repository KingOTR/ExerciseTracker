package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lastfmlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LastfmLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLastfmLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lastfmLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LastfmlogoKt {
    private static ImageVector _lastfmLogo;

    public static final ImageVector getLastfmLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(246.0f, 160.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f);
        pathBuilder.horizontalLineTo(190.57f);
        pathBuilder.arcToRelative(54.21f, 54.21f, 0.0f, false, true, -48.94f, -31.16f);
        pathBuilder.lineToRelative(-30.14f, -64.6f);
        pathBuilder.arcTo(42.14f, 42.14f, 0.0f, false, false, 73.43f, 78.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, -42.0f, 42.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 31.17f, -20.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 4.8f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, true, 72.0f, 198.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, -54.0f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, true, 64.0f, 66.0f);
        pathBuilder.horizontalLineToRelative(9.43f);
        pathBuilder.arcToRelative(54.21f, 54.21f, 0.0f, false, true, 48.94f, 31.16f);
        pathBuilder.lineToRelative(30.14f, 64.6f);
        pathBuilder.arcTo(42.14f, 42.14f, 0.0f, false, false, 190.57f, 186.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, -68.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, 30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lastfmLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
