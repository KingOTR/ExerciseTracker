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

/* compiled from: Gitdiff.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitDiff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGitDiff", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitDiff", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitdiffKt {
    private static ImageVector _gitDiff;

    public static final ImageVector getGitDiff(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _gitDiff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GitDiff", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(112.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(28.69f);
        pathBuilder.lineTo(66.34f, 151.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 145.37f);
        pathBuilder.lineTo(64.0f, 95.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(50.38f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.0f, 17.0f);
        pathBuilder.lineTo(92.69f, 200.0f);
        pathBuilder.lineTo(64.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(120.0f, 160.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 56.0f, 80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 161.0f);
        pathBuilder.lineTo(208.0f, 110.63f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, -7.0f, -17.0f);
        pathBuilder.lineTo(163.31f, 56.0f);
        pathBuilder.lineTo(192.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(136.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(152.0f, 67.31f);
        pathBuilder.lineTo(189.66f, 105.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, 5.66f);
        pathBuilder.lineTo(192.0f, 161.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitDiff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
