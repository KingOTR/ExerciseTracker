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

/* compiled from: Intersectthree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IntersectThree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getIntersectThree", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_intersectThree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersectthreeKt {
    private static ImageVector _intersectThree;

    public static final ImageVector getIntersectThree(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _intersectThree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IntersectThree", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(195.88f, 96.0f);
        pathBuilder.curveToRelative(0.07f, -1.31f, 0.12f, -2.63f, 0.12f, -4.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 60.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 1.33f, 0.0f, 2.65f, 0.12f, 4.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, false, 128.0f, 213.65f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, false, 195.88f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 193.47f);
        pathBuilder.arcToRelative(51.89f, 51.89f, 0.0f, false, true, -16.0f, -35.38f);
        pathBuilder.arcToRelative(67.55f, 67.55f, 0.0f, false, false, 31.9f, 0.0f);
        pathBuilder.arcTo(51.89f, 51.89f, 0.0f, false, true, 128.0f, 193.47f);
        pathBuilder.close();
        pathBuilder.moveTo(99.23f, 135.29f);
        pathBuilder.arcTo(52.19f, 52.19f, 0.0f, false, true, 77.92f, 106.0f);
        pathBuilder.arcToRelative(51.88f, 51.88f, 0.0f, false, true, 36.79f, 3.28f);
        pathBuilder.arcTo(68.17f, 68.17f, 0.0f, false, false, 99.23f, 135.29f);
        pathBuilder.close();
        pathBuilder.moveTo(141.29f, 109.23f);
        pathBuilder.arcTo(51.88f, 51.88f, 0.0f, false, true, 178.08f, 106.0f);
        pathBuilder.arcToRelative(52.19f, 52.19f, 0.0f, false, true, -21.31f, 29.34f);
        pathBuilder.arcTo(68.17f, 68.17f, 0.0f, false, false, 141.29f, 109.23f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 180.0f, 89.91f);
        pathBuilder.arcTo(67.72f, 67.72f, 0.0f, false, false, 128.0f, 98.35f);
        pathBuilder.arcToRelative(67.72f, 67.72f, 0.0f, false, false, -51.95f, -8.44f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 156.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 23.23f, -43.29f);
        pathBuilder.arcTo(68.36f, 68.36f, 0.0f, false, false, 96.12f, 152.0f);
        pathBuilder.curveToRelative(-0.07f, 1.31f, -0.12f, 2.63f, -0.12f, 4.0f);
        pathBuilder.arcToRelative(67.74f, 67.74f, 0.0f, false, false, 18.71f, 46.77f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 40.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 208.0f);
        pathBuilder.arcToRelative(51.65f, 51.65f, 0.0f, false, true, -22.71f, -5.23f);
        pathBuilder.arcTo(67.74f, 67.74f, 0.0f, false, false, 160.0f, 156.0f);
        pathBuilder.curveToRelative(0.0f, -1.33f, -0.05f, -2.65f, -0.12f, -4.0f);
        pathBuilder.arcToRelative(68.36f, 68.36f, 0.0f, false, false, 32.89f, -39.33f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 164.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _intersectThree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
