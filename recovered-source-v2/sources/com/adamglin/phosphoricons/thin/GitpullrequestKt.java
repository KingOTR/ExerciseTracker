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

/* compiled from: Gitpullrequest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitPullRequest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGitPullRequest", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitPullRequest", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitpullrequestKt {
    private static ImageVector _gitPullRequest;

    public static final ImageVector getGitPullRequest(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(100.0f, 64.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 68.0f, 91.71f);
        pathBuilder.verticalLineToRelative(72.58f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.lineTo(76.0f, 91.71f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 100.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 64.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 72.0f, 84.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 52.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 192.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 164.29f);
        pathBuilder.lineTo(204.0f, 110.63f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, -5.86f, -14.15f);
        pathBuilder.lineTo(153.66f, 52.0f);
        pathBuilder.lineTo(192.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(144.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(140.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 57.66f);
        pathBuilder.lineToRelative(44.49f, 44.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, 8.49f);
        pathBuilder.verticalLineToRelative(53.66f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitPullRequest = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
