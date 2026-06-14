package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bugdroid.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BugDroid", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBugDroid", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bugDroid", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BugdroidKt {
    private static ImageVector _bugDroid;

    public static final ImageVector getBugDroid(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bugDroid;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BugDroid", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(191.83f, 51.48f);
        pathBuilder.lineToRelative(13.83f, -13.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineTo(179.79f, 40.9f);
        pathBuilder.arcToRelative(87.81f, 87.81f, 0.0f, false, false, -103.58f, 0.0f);
        pathBuilder.lineTo(61.66f, 26.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 50.34f, 37.66f);
        pathBuilder.lineTo(64.17f, 51.48f);
        pathBuilder.arcTo(87.72f, 87.72f, 0.0f, false, false, 40.0f, 112.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 112.0f);
        pathBuilder.arcTo(87.72f, 87.72f, 0.0f, false, false, 191.83f, 51.48f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(56.0f, 120.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bugDroid = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
