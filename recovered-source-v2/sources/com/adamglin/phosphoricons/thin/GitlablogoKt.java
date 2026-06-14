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

/* compiled from: Gitlablogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitlabLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGitlabLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitlabLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitlablogoKt {
    private static ImageVector _gitlabLogo;

    public static final ImageVector getGitlabLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(226.27f, 118.11f);
        pathBuilder.lineTo(206.38f, 42.0f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, false, -15.16f, -0.75f);
        pathBuilder.lineTo(172.57f, 92.0f);
        pathBuilder.lineTo(83.43f, 92.0f);
        pathBuilder.lineTo(64.78f, 41.24f);
        pathBuilder.arcTo(7.94f, 7.94f, 0.0f, false, false, 49.62f, 42.0f);
        pathBuilder.lineTo(29.73f, 118.11f);
        pathBuilder.arcToRelative(53.16f, 53.16f, 0.0f, false, false, 20.44f, 56.68f);
        pathBuilder.lineToRelative(73.27f, 51.76f);
        pathBuilder.arcToRelative(7.9f, 7.9f, 0.0f, false, false, 9.12f, 0.0f);
        pathBuilder.lineToRelative(73.27f, -51.76f);
        pathBuilder.arcTo(53.16f, 53.16f, 0.0f, false, false, 226.27f, 118.11f);
        pathBuilder.close();
        pathBuilder.moveTo(57.27f, 44.11f);
        pathBuilder.lineTo(76.89f, 97.38f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 80.64f, 100.0f);
        pathBuilder.horizontalLineToRelative(94.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.75f, -2.62f);
        pathBuilder.lineToRelative(19.57f, -53.22f);
        pathBuilder.lineToRelative(17.0f, 65.0f);
        pathBuilder.lineTo(128.0f, 171.11f);
        pathBuilder.lineTo(40.33f, 109.17f);
        pathBuilder.close();
        pathBuilder.moveTo(37.43f, 120.11f);
        pathBuilder.lineTo(38.13f, 117.41f);
        pathBuilder.lineTo(121.07f, 176.0f);
        pathBuilder.lineTo(93.41f, 195.54f);
        pathBuilder.lineTo(54.78f, 168.25f);
        pathBuilder.arcTo(45.11f, 45.11f, 0.0f, false, true, 37.47f, 120.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.lineToRelative(-27.66f, -19.54f);
        pathBuilder.lineTo(128.0f, 180.9f);
        pathBuilder.lineToRelative(27.66f, 19.54f);
        pathBuilder.close();
        pathBuilder.moveTo(201.22f, 168.27f);
        pathBuilder.lineTo(162.59f, 195.56f);
        pathBuilder.lineTo(134.93f, 176.0f);
        pathBuilder.lineToRelative(82.9f, -58.56f);
        pathBuilder.lineToRelative(0.7f, 2.7f);
        pathBuilder.arcTo(45.11f, 45.11f, 0.0f, false, true, 201.22f, 168.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitlabLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
