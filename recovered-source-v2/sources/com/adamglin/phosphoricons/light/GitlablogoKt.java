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

/* compiled from: Gitlablogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitlabLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGitlabLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitlabLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitlablogoKt {
    private static ImageVector _gitlabLogo;

    public static final ImageVector getGitlabLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gitlabLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GitlabLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.21f, 117.61f);
        pathBuilder.lineTo(208.32f, 41.49f);
        pathBuilder.arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, -0.93f);
        pathBuilder.lineTo(171.17f, 90.0f);
        pathBuilder.lineTo(84.83f, 90.0f);
        pathBuilder.lineTo(66.66f, 40.56f);
        pathBuilder.arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, 0.93f);
        pathBuilder.lineTo(27.79f, 117.61f);
        pathBuilder.arcTo(55.18f, 55.18f, 0.0f, false, false, 49.0f, 176.42f);
        pathBuilder.lineToRelative(73.27f, 51.77f);
        pathBuilder.arcToRelative(9.94f, 9.94f, 0.0f, false, false, 11.44f, 0.0f);
        pathBuilder.lineTo(207.0f, 176.42f);
        pathBuilder.arcTo(55.18f, 55.18f, 0.0f, false, false, 228.21f, 117.61f);
        pathBuilder.close();
        pathBuilder.moveTo(57.65f, 50.82f);
        pathBuilder.lineTo(75.0f, 98.07f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 80.64f, 102.0f);
        pathBuilder.horizontalLineToRelative(94.72f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 181.0f, 98.07f);
        pathBuilder.lineToRelative(17.36f, -47.25f);
        pathBuilder.lineToRelative(15.0f, 57.52f);
        pathBuilder.lineTo(128.0f, 168.66f);
        pathBuilder.lineTo(42.62f, 108.34f);
        pathBuilder.close();
        pathBuilder.moveTo(39.38f, 120.74f);
        pathBuilder.lineTo(117.6f, 176.0f);
        pathBuilder.lineTo(93.41f, 193.1f);
        pathBuilder.lineTo(55.94f, 166.62f);
        pathBuilder.arcTo(43.1f, 43.1f, 0.0f, false, true, 39.38f, 120.74f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 217.53f);
        pathBuilder.lineToRelative(-24.19f, -17.09f);
        pathBuilder.lineTo(128.0f, 183.35f);
        pathBuilder.lineToRelative(24.19f, 17.09f);
        pathBuilder.close();
        pathBuilder.moveTo(200.06f, 166.62f);
        pathBuilder.lineTo(162.59f, 193.1f);
        pathBuilder.lineTo(138.4f, 176.0f);
        pathBuilder.lineToRelative(78.22f, -55.26f);
        pathBuilder.arcTo(43.1f, 43.1f, 0.0f, false, true, 200.06f, 166.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitlabLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
