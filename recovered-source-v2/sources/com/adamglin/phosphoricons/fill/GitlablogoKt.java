package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gitlablogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitlabLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGitlabLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitlabLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitlablogoKt {
    private static ImageVector _gitlabLogo;

    public static final ImageVector getGitlabLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(230.15f, 117.1f);
        pathBuilder.lineTo(210.25f, 41.0f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, -22.79f, -1.11f);
        pathBuilder.lineTo(169.78f, 88.0f);
        pathBuilder.lineTo(86.22f, 88.0f);
        pathBuilder.lineTo(68.54f, 39.87f);
        pathBuilder.arcTo(11.94f, 11.94f, 0.0f, false, false, 45.75f, 41.0f);
        pathBuilder.lineTo(25.85f, 117.1f);
        pathBuilder.arcToRelative(57.19f, 57.19f, 0.0f, false, false, 22.0f, 61.0f);
        pathBuilder.lineToRelative(73.27f, 51.76f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, false, 13.74f, 0.0f);
        pathBuilder.lineToRelative(73.27f, -51.76f);
        pathBuilder.arcTo(57.19f, 57.19f, 0.0f, false, false, 230.15f, 117.1f);
        pathBuilder.close();
        pathBuilder.moveTo(40.68f, 124.1f);
        pathBuilder.lineTo(114.13f, 176.0f);
        pathBuilder.lineTo(93.41f, 190.65f);
        pathBuilder.lineTo(57.09f, 165.0f);
        pathBuilder.arcTo(41.06f, 41.06f, 0.0f, false, true, 40.68f, 124.11f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 215.1f);
        pathBuilder.lineTo(107.27f, 200.45f);
        pathBuilder.lineTo(128.0f, 185.8f);
        pathBuilder.lineToRelative(20.73f, 14.64f);
        pathBuilder.close();
        pathBuilder.moveTo(198.91f, 165.0f);
        pathBuilder.lineToRelative(-36.32f, 25.66f);
        pathBuilder.lineTo(141.87f, 176.0f);
        pathBuilder.lineToRelative(73.45f, -51.9f);
        pathBuilder.arcTo(41.06f, 41.06f, 0.0f, false, true, 198.91f, 165.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitlabLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
