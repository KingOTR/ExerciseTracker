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

/* compiled from: Star.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_star", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Star", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.36f, 98.49f);
        pathBuilder.arcTo(12.21f, 12.21f, 0.0f, false, false, 224.59f, 90.0f);
        pathBuilder.lineToRelative(-61.47f, -5.0f);
        pathBuilder.lineTo(139.44f, 27.67f);
        pathBuilder.arcToRelative(12.37f, 12.37f, 0.0f, false, false, -22.88f, 0.0f);
        pathBuilder.lineTo(92.88f, 85.0f);
        pathBuilder.lineTo(31.41f, 90.0f);
        pathBuilder.arcToRelative(12.45f, 12.45f, 0.0f, false, false, -7.07f, 21.84f);
        pathBuilder.lineToRelative(46.85f, 40.41f);
        pathBuilder.lineTo(56.87f, 212.64f);
        pathBuilder.arcToRelative(12.35f, 12.35f, 0.0f, false, false, 18.51f, 13.49f);
        pathBuilder.lineTo(128.0f, 193.77f);
        pathBuilder.lineToRelative(52.62f, 32.36f);
        pathBuilder.arcToRelative(12.12f, 12.12f, 0.0f, false, false, 13.69f, -0.51f);
        pathBuilder.arcToRelative(12.28f, 12.28f, 0.0f, false, false, 4.82f, -13.0f);
        pathBuilder.lineToRelative(-14.32f, -60.42f);
        pathBuilder.lineToRelative(46.85f, -40.41f);
        pathBuilder.arcTo(12.29f, 12.29f, 0.0f, false, false, 235.36f, 98.49f);
        pathBuilder.close();
        pathBuilder.moveTo(226.43f, 105.75f);
        pathBuilder.lineTo(177.75f, 147.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.28f, 3.95f);
        pathBuilder.lineToRelative(14.87f, 62.79f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, true, -1.72f, 4.65f);
        pathBuilder.arcToRelative(4.24f, 4.24f, 0.0f, false, true, -4.81f, 0.18f);
        pathBuilder.lineTo(130.1f, 185.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f);
        pathBuilder.lineTo(71.19f, 219.32f);
        pathBuilder.arcToRelative(4.24f, 4.24f, 0.0f, false, true, -4.81f, -0.18f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, true, -1.72f, -4.65f);
        pathBuilder.lineTo(79.53f, 151.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.28f, -3.95f);
        pathBuilder.lineToRelative(-48.68f, -42.0f);
        pathBuilder.arcTo(4.37f, 4.37f, 0.0f, false, true, 28.25f, 101.0f);
        pathBuilder.arcToRelative(4.31f, 4.31f, 0.0f, false, true, 3.81f, -3.0f);
        pathBuilder.lineTo(96.0f, 92.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.38f, -2.46f);
        pathBuilder.lineTo(124.0f, 30.73f);
        pathBuilder.arcToRelative(4.35f, 4.35f, 0.0f, false, true, 8.08f, 0.0f);
        pathBuilder.lineToRelative(24.62f, 59.6f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 92.79f);
        pathBuilder.lineToRelative(63.9f, 5.15f);
        pathBuilder.arcToRelative(4.31f, 4.31f, 0.0f, false, true, 3.81f, 3.0f);
        pathBuilder.arcTo(4.37f, 4.37f, 0.0f, false, true, 226.43f, 105.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _star = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
