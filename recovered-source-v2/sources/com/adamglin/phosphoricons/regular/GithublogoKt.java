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

/* compiled from: Githublogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GithubLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGithubLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_githubLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GithublogoKt {
    private static ImageVector _githubLogo;

    public static final ImageVector getGithubLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _githubLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GithubLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.31f, 75.68f);
        pathBuilder.arcTo(59.78f, 59.78f, 0.0f, false, false, 202.93f, 28.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 196.0f, 24.0f);
        pathBuilder.arcToRelative(59.75f, 59.75f, 0.0f, false, false, -48.0f, 24.0f);
        pathBuilder.horizontalLineTo(124.0f);
        pathBuilder.arcTo(59.75f, 59.75f, 0.0f, false, false, 76.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.93f, 4.0f);
        pathBuilder.arcToRelative(59.78f, 59.78f, 0.0f, false, false, -5.38f, 47.68f);
        pathBuilder.arcTo(58.14f, 58.14f, 0.0f, false, false, 56.0f, 104.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, 48.44f, 55.47f);
        pathBuilder.arcTo(39.8f, 39.8f, 0.0f, false, false, 96.0f, 192.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 8.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(39.8f, 39.8f, 0.0f, false, false, -8.44f, -24.53f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 216.0f, 112.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(58.14f, 58.14f, 0.0f, false, false, 208.31f, 75.68f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 112.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(41.74f, 41.74f, 0.0f, false, true, 6.9f, -22.48f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 73.83f);
        pathBuilder.arcToRelative(43.81f, 43.81f, 0.0f, false, true, 0.79f, -33.58f);
        pathBuilder.arcToRelative(43.88f, 43.88f, 0.0f, false, true, 32.32f, 20.06f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 119.82f, 64.0f);
        pathBuilder.horizontalLineToRelative(32.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, -3.69f);
        pathBuilder.arcToRelative(43.87f, 43.87f, 0.0f, false, true, 32.32f, -20.06f);
        pathBuilder.arcTo(43.81f, 43.81f, 0.0f, false, true, 192.0f, 73.83f);
        pathBuilder.arcToRelative(8.09f, 8.09f, 0.0f, false, false, 1.0f, 7.65f);
        pathBuilder.arcTo(41.72f, 41.72f, 0.0f, false, true, 200.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _githubLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
