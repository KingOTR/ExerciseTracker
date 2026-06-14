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

/* compiled from: Gitpullrequest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitPullRequest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGitPullRequest", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitPullRequest", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitpullrequestKt {
    private static ImageVector _gitPullRequest;

    public static final ImageVector getGitPullRequest(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gitPullRequest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GitPullRequest", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(102.0f, 64.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 66.0f, 93.4f);
        pathBuilder.verticalLineToRelative(69.2f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(78.0f, 93.4f);
        pathBuilder.arcTo(30.05f, 30.05f, 0.0f, false, false, 102.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 64.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, true, true, 72.0f, 82.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 54.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 90.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.0f, 162.6f);
        pathBuilder.verticalLineToRelative(-52.0f);
        pathBuilder.arcToRelative(21.88f, 21.88f, 0.0f, false, false, -6.44f, -15.56f);
        pathBuilder.lineTo(158.48f, 54.0f);
        pathBuilder.lineTo(192.0f, 54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(144.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(138.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(150.0f, 62.48f);
        pathBuilder.lineToRelative(41.07f, 41.08f);
        pathBuilder.arcToRelative(9.91f, 9.91f, 0.0f, false, true, 2.93f, 7.07f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 210.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitPullRequest = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
