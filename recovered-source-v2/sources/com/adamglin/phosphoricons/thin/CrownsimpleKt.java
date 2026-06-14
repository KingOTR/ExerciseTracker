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

/* compiled from: Crownsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCrownSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownsimpleKt {
    private static ImageVector _crownSimple;

    public static final ImageVector getCrownSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _crownSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.18f, 77.21f);
        pathBuilder.arcTo(11.89f, 11.89f, 0.0f, false, false, 215.0f, 80.08f);
        pathBuilder.lineToRelative(-37.81f, 40.76f);
        pathBuilder.lineTo(138.9f, 35.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.82f, 0.05f);
        pathBuilder.lineTo(78.81f, 120.84f);
        pathBuilder.lineTo(41.0f, 80.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.81f, 10.0f);
        pathBuilder.lineToRelative(0.0f, 0.15f);
        pathBuilder.lineToRelative(22.69f, 103.9f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 54.71f, 204.0f);
        pathBuilder.lineTo(201.29f, 204.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.83f);
        pathBuilder.lineToRelative(22.69f, -103.9f);
        pathBuilder.lineToRelative(0.0f, -0.15f);
        pathBuilder.arcTo(11.89f, 11.89f, 0.0f, false, false, 229.18f, 77.21f);
        pathBuilder.close();
        pathBuilder.moveTo(227.94f, 88.66f);
        pathBuilder.lineTo(205.26f, 192.54f);
        pathBuilder.lineToRelative(0.0f, 0.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.3f);
        pathBuilder.lineTo(54.71f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.3f);
        pathBuilder.lineToRelative(0.0f, -0.16f);
        pathBuilder.lineTo(28.06f, 88.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -3.26f);
        pathBuilder.arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, 0.08f);
        pathBuilder.lineToRelative(42.0f, 45.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.59f, -1.09f);
        pathBuilder.lineToRelative(40.72f, -91.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.24f, 0.0f);
        pathBuilder.lineToRelative(40.74f, 91.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.59f, 1.09f);
        pathBuilder.lineToRelative(42.0f, -45.24f);
        pathBuilder.arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, -0.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 3.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
