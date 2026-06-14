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

/* compiled from: Githublogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GithubLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGithubLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_githubLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GithublogoKt {
    private static ImageVector _githubLogo;

    public static final ImageVector getGithubLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(206.13f, 75.92f);
        pathBuilder.arcTo(57.79f, 57.79f, 0.0f, false, false, 201.2f, 29.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, -3.0f);
        pathBuilder.arcToRelative(57.77f, 57.77f, 0.0f, false, false, -47.0f, 24.0f);
        pathBuilder.horizontalLineTo(123.0f);
        pathBuilder.arcTo(57.77f, 57.77f, 0.0f, false, false, 76.0f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, 3.0f);
        pathBuilder.arcToRelative(57.79f, 57.79f, 0.0f, false, false, -4.93f, 46.92f);
        pathBuilder.arcTo(55.88f, 55.88f, 0.0f, false, false, 58.0f, 104.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, 50.45f, 53.87f);
        pathBuilder.arcTo(37.85f, 37.85f, 0.0f, false, false, 98.0f, 192.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 8.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.horizontalLineTo(98.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(37.85f, 37.85f, 0.0f, false, false, -10.45f, -26.13f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 214.0f, 112.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(55.88f, 55.88f, 0.0f, false, false, 206.13f, 75.92f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 112.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(43.86f, 43.86f, 0.0f, false, true, 7.3f, -23.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.81f, -5.76f);
        pathBuilder.arcToRelative(45.85f, 45.85f, 0.0f, false, true, 1.43f, -36.42f);
        pathBuilder.arcToRelative(45.85f, 45.85f, 0.0f, false, true, 35.23f, 21.1f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 119.83f, 62.0f);
        pathBuilder.horizontalLineToRelative(32.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -2.76f);
        pathBuilder.arcToRelative(45.83f, 45.83f, 0.0f, false, true, 35.23f, -21.11f);
        pathBuilder.arcToRelative(45.85f, 45.85f, 0.0f, false, true, 1.43f, 36.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.79f, 5.74f);
        pathBuilder.arcTo(43.78f, 43.78f, 0.0f, false, true, 202.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _githubLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
