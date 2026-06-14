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

/* compiled from: Wrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWrench", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrenchKt {
    private static ImageVector _wrench;

    public static final ImageVector getWrench(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _wrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.05f, 70.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.42f, -1.44f);
        pathBuilder.lineToRelative(-41.82f, 38.6f);
        pathBuilder.lineTo(153.0f, 103.0f);
        pathBuilder.lineToRelative(-4.68f, -21.79f);
        pathBuilder.lineToRelative(38.6f, -41.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.44f, -6.43f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 98.94f, 126.0f);
        pathBuilder.lineTo(36.4f, 180.0f);
        pathBuilder.lineToRelative(-0.21f, 0.2f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 39.6f);
        pathBuilder.lineToRelative(0.2f, -0.21f);
        pathBuilder.lineToRelative(54.0f, -62.54f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 228.0f, 96.0f);
        pathBuilder.arcTo(67.51f, 67.51f, 0.0f, false, false, 223.05f, 70.5f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 156.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -29.0f, -7.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 0.89f);
        pathBuilder.lineTo(70.0f, 214.25f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 41.75f, 186.0f);
        pathBuilder.lineToRelative(64.82f, -56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.89f, -5.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 69.46f, -86.59f);
        pathBuilder.lineTo(141.05f, 77.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 3.55f);
        pathBuilder.lineToRelative(5.66f, 26.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.07f, 3.07f);
        pathBuilder.lineToRelative(26.35f, 5.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.55f, -1.0f);
        pathBuilder.lineToRelative(38.87f, -35.87f);
        pathBuilder.arcTo(60.05f, 60.05f, 0.0f, false, true, 160.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
