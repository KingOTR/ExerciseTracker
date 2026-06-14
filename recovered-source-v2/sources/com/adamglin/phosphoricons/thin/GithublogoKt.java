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

/* compiled from: Githublogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GithubLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGithubLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_githubLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GithublogoKt {
    private static ImageVector _githubLogo;

    public static final ImageVector getGithubLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(203.94f, 76.16f);
        pathBuilder.arcTo(55.73f, 55.73f, 0.0f, false, false, 199.46f, 30.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 28.0f);
        pathBuilder.arcToRelative(55.78f, 55.78f, 0.0f, false, false, -46.0f, 24.0f);
        pathBuilder.horizontalLineTo(122.0f);
        pathBuilder.arcTo(55.78f, 55.78f, 0.0f, false, false, 76.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.46f, 2.0f);
        pathBuilder.arcToRelative(55.73f, 55.73f, 0.0f, false, false, -4.48f, 46.16f);
        pathBuilder.arcTo(53.78f, 53.78f, 0.0f, false, false, 60.0f, 104.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(1.41f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 100.0f, 192.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 8.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -13.41f, -28.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(53.78f, 53.78f, 0.0f, false, false, 203.94f, 76.16f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 112.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(45.76f, 45.76f, 0.0f, false, true, 7.71f, -24.89f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.53f, -3.84f);
        pathBuilder.arcToRelative(47.82f, 47.82f, 0.0f, false, true, 2.1f, -39.21f);
        pathBuilder.arcToRelative(47.8f, 47.8f, 0.0f, false, true, 38.12f, 22.1f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 119.83f, 60.0f);
        pathBuilder.horizontalLineToRelative(32.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -1.84f);
        pathBuilder.arcToRelative(47.8f, 47.8f, 0.0f, false, true, 38.12f, -22.1f);
        pathBuilder.arcToRelative(47.82f, 47.82f, 0.0f, false, true, 2.1f, 39.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.53f, 3.83f);
        pathBuilder.arcTo(45.85f, 45.85f, 0.0f, false, true, 204.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _githubLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
