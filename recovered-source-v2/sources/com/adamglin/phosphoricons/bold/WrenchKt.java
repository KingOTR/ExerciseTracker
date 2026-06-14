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

/* compiled from: Wrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWrench", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrenchKt {
    private static ImageVector _wrench;

    public static final ImageVector getWrench(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(230.47f, 67.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.26f, -4.32f);
        pathBuilder.lineTo(172.43f, 99.0f);
        pathBuilder.lineToRelative(-12.68f, -2.72f);
        pathBuilder.lineTo(157.0f, 83.57f);
        pathBuilder.lineToRelative(35.79f, -38.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.32f, -19.26f);
        pathBuilder.arcTo(76.07f, 76.07f, 0.0f, false, false, 88.41f, 121.64f);
        pathBuilder.lineTo(30.92f, 174.18f);
        pathBuilder.arcToRelative(4.68f, 4.68f, 0.0f, false, false, -0.39f, 0.38f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.91f, 50.91f);
        pathBuilder.lineToRelative(0.38f, -0.39f);
        pathBuilder.lineToRelative(52.54f, -57.49f);
        pathBuilder.arcTo(76.05f, 76.05f, 0.0f, false, false, 230.47f, 67.5f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 148.0f);
        pathBuilder.arcToRelative(51.5f, 51.5f, 0.0f, false, true, -23.35f, -5.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.26f, 2.62f);
        pathBuilder.lineTo(64.31f, 208.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(63.55f, -58.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.62f, -14.26f);
        pathBuilder.arcTo(51.5f, 51.5f, 0.0f, false, true, 108.0f, 96.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, -52.0f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.lineTo(135.17f, 71.87f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.91f, 10.65f);
        pathBuilder.lineToRelative(5.66f, 26.35f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.21f, 9.21f);
        pathBuilder.lineToRelative(26.35f, 5.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.65f, -2.91f);
        pathBuilder.lineTo(212.0f, 95.12f);
        pathBuilder.curveToRelative(0.0f, 0.3f, 0.0f, 0.59f, 0.0f, 0.89f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 160.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
