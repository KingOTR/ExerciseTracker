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

/* compiled from: Gitmerge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GitMerge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGitMerge", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gitMerge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GitmergeKt {
    private static ImageVector _gitMerge;

    public static final ImageVector getGitMerge(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 108.0f);
        pathBuilder.arcToRelative(36.05f, 36.05f, 0.0f, false, false, -33.38f, 22.54f);
        pathBuilder.lineToRelative(-39.0f, -5.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.47f, -1.35f);
        pathBuilder.lineTo(100.55f, 85.53f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 68.0f, 89.94f);
        pathBuilder.verticalLineToRelative(76.12f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f);
        pathBuilder.lineTo(92.0f, 112.44f);
        pathBuilder.lineToRelative(23.0f, 26.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 17.3f, 9.49f);
        pathBuilder.lineToRelative(41.34f, 5.91f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 208.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 68.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gitMerge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
