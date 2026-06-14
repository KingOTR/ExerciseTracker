package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Githublogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GithubLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGithubLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_githubLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GithublogoKt {
    private static ImageVector _githubLogo;

    public static final ImageVector getGithubLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(212.62f, 75.17f);
        pathBuilder.arcTo(63.7f, 63.7f, 0.0f, false, false, 206.39f, 26.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 20.0f);
        pathBuilder.arcToRelative(63.71f, 63.71f, 0.0f, false, false, -50.0f, 24.0f);
        pathBuilder.horizontalLineTo(126.0f);
        pathBuilder.arcTo(63.71f, 63.71f, 0.0f, false, false, 76.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.39f, 6.0f);
        pathBuilder.arcToRelative(63.7f, 63.7f, 0.0f, false, false, -6.23f, 49.17f);
        pathBuilder.arcTo(61.5f, 61.5f, 0.0f, false, false, 52.0f, 104.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(60.1f, 60.1f, 0.0f, false, false, 45.76f, 58.28f);
        pathBuilder.arcTo(43.66f, 43.66f, 0.0f, false, false, 92.0f, 192.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(43.66f, 43.66f, 0.0f, false, false, -5.76f, -21.72f);
        pathBuilder.arcTo(60.1f, 60.1f, 0.0f, false, false, 220.0f, 112.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(61.5f, 61.5f, 0.0f, false, false, 212.62f, 75.17f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 112.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(37.87f, 37.87f, 0.0f, false, true, 6.13f, -20.12f);
        pathBuilder.arcToRelative(11.65f, 11.65f, 0.0f, false, false, 1.58f, -11.49f);
        pathBuilder.arcToRelative(39.9f, 39.9f, 0.0f, false, true, -0.4f, -27.72f);
        pathBuilder.arcToRelative(39.87f, 39.87f, 0.0f, false, true, 26.41f, 17.8f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 119.82f, 68.0f);
        pathBuilder.horizontalLineToRelative(32.35f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.11f, -5.53f);
        pathBuilder.arcToRelative(39.84f, 39.84f, 0.0f, false, true, 26.41f, -17.8f);
        pathBuilder.arcToRelative(39.9f, 39.9f, 0.0f, false, true, -0.4f, 27.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.61f, 11.53f);
        pathBuilder.arcTo(37.85f, 37.85f, 0.0f, false, true, 196.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _githubLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
