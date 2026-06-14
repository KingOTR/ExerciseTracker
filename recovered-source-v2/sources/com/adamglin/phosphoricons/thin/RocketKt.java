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

/* compiled from: Rocket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getRocket", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rocket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Rocket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(148.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(112.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.72f, 155.0f);
        pathBuilder.lineTo(207.35f, 210.6f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.72f, 8.71f);
        pathBuilder.arcToRelative(12.17f, 12.17f, 0.0f, false, true, -4.0f, 0.69f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, true, -7.43f, -2.6f);
        pathBuilder.lineTo(159.85f, 196.0f);
        pathBuilder.lineTo(96.15f, 196.0f);
        pathBuilder.lineTo(67.81f, 217.4f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, true, -7.43f, 2.6f);
        pathBuilder.arcToRelative(12.17f, 12.17f, 0.0f, false, true, -4.0f, -0.69f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.72f, -8.71f);
        pathBuilder.lineTo(36.28f, 155.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.5f, -10.28f);
        pathBuilder.lineToRelative(29.35f, -35.23f);
        pathBuilder.curveToRelative(3.3f, -53.33f, 41.83f, -86.68f, 52.52f, -94.94f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, 0.0f);
        pathBuilder.curveToRelative(10.69f, 8.26f, 49.22f, 41.61f, 52.52f, 94.94f);
        pathBuilder.lineToRelative(29.35f, 35.23f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 219.72f, 155.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.11f, 188.0f);
        pathBuilder.horizontalLineToRelative(61.78f);
        pathBuilder.curveTo(214.07f, 92.49f, 145.0f, 32.05f, 130.46f, 20.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.92f, 0.0f);
        pathBuilder.curveTo(111.0f, 32.05f, 41.93f, 92.49f, 97.11f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.59f, 190.93f);
        pathBuilder.curveTo(75.12f, 165.56f, 68.93f, 142.52f, 68.0f, 122.06f);
        pathBuilder.lineTo(44.92f, 149.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.83f, 3.43f);
        pathBuilder.lineToRelative(12.36f, 55.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.41f, 2.26f);
        pathBuilder.lineToRelative(0.09f, -0.07f);
        pathBuilder.close();
        pathBuilder.moveTo(211.08f, 149.8f);
        pathBuilder.lineTo(188.0f, 122.06f);
        pathBuilder.curveToRelative(-0.89f, 20.46f, -7.08f, 43.5f, -21.55f, 68.87f);
        pathBuilder.lineToRelative(26.64f, 20.12f);
        pathBuilder.lineToRelative(0.09f, 0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.41f, -2.26f);
        pathBuilder.lineToRelative(12.36f, -55.63f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 211.08f, 149.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rocket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
