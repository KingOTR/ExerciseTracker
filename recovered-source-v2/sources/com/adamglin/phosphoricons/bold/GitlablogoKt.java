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

/* compiled from: Gitlablogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitlabLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGitlabLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitlabLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitlablogoKt {
    private static ImageVector _gitlabLogo;

    public static final ImageVector getGitlabLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(234.0f, 116.09f);
        pathBuilder.lineTo(214.13f, 40.0f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -30.42f, -1.48f);
        pathBuilder.lineTo(167.0f, 84.0f);
        pathBuilder.lineTo(89.0f, 84.0f);
        pathBuilder.lineTo(72.29f, 38.49f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, false, 41.87f, 40.0f);
        pathBuilder.lineTo(22.0f, 116.09f);
        pathBuilder.arcToRelative(61.19f, 61.19f, 0.0f, false, false, 23.57f, 65.23f);
        pathBuilder.lineToRelative(73.27f, 51.77f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 18.36f, 0.0f);
        pathBuilder.lineToRelative(73.27f, -51.77f);
        pathBuilder.arcTo(61.19f, 61.19f, 0.0f, false, false, 234.0f, 116.09f);
        pathBuilder.close();
        pathBuilder.moveTo(58.61f, 70.86f);
        pathBuilder.lineToRelative(10.76f, 29.28f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 80.64f, 108.0f);
        pathBuilder.horizontalLineToRelative(94.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.27f, -7.86f);
        pathBuilder.lineToRelative(10.76f, -29.28f);
        pathBuilder.lineToRelative(9.14f, 35.0f);
        pathBuilder.lineTo(128.0f, 161.31f);
        pathBuilder.lineTo(49.47f, 105.83f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 131.37f);
        pathBuilder.lineTo(107.2f, 176.0f);
        pathBuilder.lineToRelative(-13.79f, 9.74f);
        pathBuilder.lineToRelative(-34.0f, -24.0f);
        pathBuilder.arcTo(36.86f, 36.86f, 0.0f, false, true, 44.0f, 131.37f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 210.19f);
        pathBuilder.lineTo(114.21f, 200.44f);
        pathBuilder.lineTo(128.0f, 190.7f);
        pathBuilder.lineToRelative(13.79f, 9.74f);
        pathBuilder.close();
        pathBuilder.moveTo(196.6f, 161.72f);
        pathBuilder.lineTo(162.6f, 185.72f);
        pathBuilder.lineTo(148.8f, 176.0f);
        pathBuilder.lineTo(212.0f, 131.37f);
        pathBuilder.arcTo(36.86f, 36.86f, 0.0f, false, true, 196.6f, 161.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitlabLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
