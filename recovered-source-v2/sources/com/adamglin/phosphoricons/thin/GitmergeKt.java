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

/* compiled from: Gitmerge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitMerge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGitMerge", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitMerge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitmergeKt {
    private static ImageVector _gitMerge;

    public static final ImageVector getGitMerge(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _gitMerge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GitMerge", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 116.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.62f, 23.44f);
        pathBuilder.lineToRelative(-45.85f, -6.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.41f, -4.07f);
        pathBuilder.lineTo(87.75f, 82.9f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 76.0f, 83.71f);
        pathBuilder.verticalLineToRelative(88.58f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.lineTo(84.0f, 90.81f);
        pathBuilder.lineTo(121.0f, 134.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.36f, 6.78f);
        pathBuilder.lineToRelative(46.83f, 6.69f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 208.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 100.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 164.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 208.0f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitMerge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
